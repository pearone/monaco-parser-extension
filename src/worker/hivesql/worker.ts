import {
    CharStreams,
    CommonToken,
    CommonTokenStream,
    Lexer,
    TokenStream,
} from "antlr4ts";
import { worker } from "monaco-editor-core";
import {
    CompletionItemKind,
    InsertTextFormat,
    CompletionItem,
} from "vscode-languageserver";
import HiveSQL from "./parser";
import { CodeCompletionCore, TokenList, CandidateRule } from "antlr4-c3";
import { BaseSQLWorker } from "../base/worker";
import { HiveParser } from "./grammar/HiveParser";
import { ParserErrorStrategy } from "../base/error";
import { QueryAnalyzer } from "./analysis";
import { HiveLexer } from "./grammar/HiveLexer";

export class HiveSQLWorker extends BaseSQLWorker {
    protected _ctx: worker.IWorkerContext;
    protected parser: HiveSQL;
    constructor(ctx: worker.IWorkerContext) {
        super();
        this._ctx = ctx;
        this.parser = new HiveSQL();
    }

    format(code: string) {
        return Promise.resolve(this.parser.format(code));
    }

    /**
     *
     * @param code
     * @param position
     * @returns
     */
    completionsFor(code: string, cursor: any, triggerCharacter?: string) {
        const chars = CharStreams.fromString(code.toUpperCase());
        const lexer = new HiveLexer(chars);
        const tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        const cursorIndex = this.findCursorTokenIndex(tokenStream, cursor);
        console.log(cursorIndex);
        const parser = new HiveParser(tokenStream);

        parser.removeErrorListeners();
        parser.errorHandler = new ParserErrorStrategy();

        const parsedQuery = parser.statements();
        const core = new CodeCompletionCore(parser);
        core.preferredRules = new Set([HiveParser.RULE_fromStatement]);

        if (cursorIndex === undefined) {
            return Promise.resolve([]);
        }

        const queryAnalyzer = new QueryAnalyzer(parsedQuery);

        console.log("cursorIndex", cursorIndex, tokenStream);
        const candidates = core.collectCandidates(cursorIndex);
        const itemsFromTokens = this.generateCandidatesFromTokens(
            candidates.tokens,
            queryAnalyzer,
            lexer
            // tokenStream,
            // cursorIndex
        );

        const itemsFromRules = this.generateCandidatesFromRules(
            candidates.rules,
            queryAnalyzer,
            tokenStream,
            cursorIndex
        );

        console.log(candidates.tokens, itemsFromTokens);

        return Promise.resolve(itemsFromTokens.concat(itemsFromRules));
    }

    generateCandidatesFromRules(
        rules: Map<number, CandidateRule>,
        queryAnalyzer: QueryAnalyzer,
        tokenStream: TokenStream,
        tokenIndex: number
    ) {
        console.log("rules", rules);
        const items: CompletionItem[] = [];
        for (const [ruleId, ruleData] of rules) {
            const lastRuleId = ruleData.ruleList[ruleData.ruleList.length - 1];

            switch (ruleId) {
                case HiveParser.RULE_fromStatement:
                    if (tokenIndex === ruleData.startTokenIndex) {
                        console.log("RULE_fromStatement");
                        items.push(this.newKeywordItem("SELECT FROM"));
                    }
                    break;
            }
        }
        return items;
    }

    generateCandidatesFromTokens(
        tokens: Map<number, TokenList>,
        queryAnalyzer: QueryAnalyzer,
        lexer: HiveLexer
    ) {
        const items: CompletionItem[] = [];
        for (const [tokenType, followingTokens] of tokens) {
            const baseKeyword = this.tokenTypeToCandidateString(
                lexer,
                tokenType
            );
            if (!baseKeyword) {
                continue;
            }
            const followingKeywords = followingTokens
                .map((t) => this.tokenTypeToCandidateString(lexer, t))
                .join(" ");

            const itemText =
                followingKeywords.length > 0
                    ? baseKeyword + " " + followingKeywords
                    : baseKeyword;

            items.push(this.newKeywordItem(itemText));
        }
        return items;
    }

    newKeywordItem(text: string) {
        return {
            label: text,
            kind: CompletionItemKind.Keyword,
            insertText: text,
        };
    }

    newFunctionItem(text: string) {
        return {
            label: text + "(...)",
            kind: CompletionItemKind.Function,
            insertText: text + "($1)",
            insertTextFormat: InsertTextFormat.Snippet,
        };
    }

    tokenTypeToCandidateString(lexer: Lexer, tokenType: number): string {
        return lexer.vocabulary
            .getLiteralName(tokenType)
            ?.toUpperCase()
            .replace(/^'|'$/g, "") as string;
    }

    findCursorTokenIndex(
        tokenStream: TokenStream,
        cursor: { lineNumber: number; column: number }
    ) {
        const cursorCol = cursor.column - 1;
        const lineSeparator = /\n|\r|\r\n/g;
        const possibleIdentifierPrefix = /[\w]$/;

        for (let i = 0; i < tokenStream.size; i++) {
            const t = tokenStream.get(i);

            const tokenStartCol = t.charPositionInLine;
            const tokenEndCol = tokenStartCol + (t.text as string).length;
            const tokenStartLine = t.line;
            const tokenEndLine =
                t.type !== HiveParser.EOF || !t.text
                    ? tokenStartLine
                    : tokenStartLine +
                      (t.text.match(lineSeparator)?.length || 0);

            if (
                tokenEndLine > cursor.lineNumber ||
                (tokenStartLine === cursor.lineNumber &&
                    tokenEndCol > cursorCol)
            ) {
                if (
                    i > 0 &&
                    tokenStartLine === cursor.lineNumber &&
                    tokenStartCol === cursorCol
                    // &&
                    // possibleIdentifierPrefix.test(
                    //     tokenStream.get(i - 1).text as string
                    // )
                ) {
                    return i - 1;
                } else if (t.type === HiveParser.EOF) {
                    return i + 1;
                } else return i;
            }
        }
        return undefined;
    }
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
