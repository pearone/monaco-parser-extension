import {
    CharStreams,
    CommonToken,
    CommonTokenStream,
    Lexer,
    TokenStream,
} from "antlr4ts";
import { worker } from "monaco-editor-core";
import { CompletionItemKind, InsertTextFormat } from "vscode-languageserver";
import HiveSQL from "./parser";
import { CodeCompletionCore, TokenList } from "antlr4-c3";
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
        const parser = new HiveParser(tokenStream);

        parser.removeErrorListeners();
        parser.errorHandler = new ParserErrorStrategy();

        const parsedQuery = parser.statements();
        const core = new CodeCompletionCore(parser);

        if (cursorIndex === undefined) {
            return Promise.resolve([]);
        }

        const queryAnalyzer = new QueryAnalyzer(parsedQuery);

        const candidates = core.collectCandidates(cursorIndex);
        this.generateCandidatesFromTokens(
            candidates.tokens,
            queryAnalyzer,
            lexer
            // tokenStream,
            // completionTokenIndex
        );

        console.log(candidates);
        return Promise.resolve([]);
    }

    generateCandidatesFromTokens(
        tokens: Map<number, TokenList>,
        queryAnalyzer: QueryAnalyzer,
        lexer: HiveLexer
    ) {
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

            console.log(itemText);
        }
    }

    newKeywordItem(text: string) {
        return {
            label: text,
            kind: CompletionItemKind.Keyword,
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
        // console.log("size", tokenStream.size);
        for (let i = 0; i < tokenStream.size; i++) {
            const t = tokenStream.get(i) as CommonToken;

            const tokenStartCol = t.startIndex;
            const tokenEndCol = t.stopIndex;
            const tokenLine = t.line;

            // console.log("tokenStartCol", tokenStartCol, tokenEndCol, tokenLine);
            // console.log("cursorCol", cursorCol, cursor.lineNumber);
            if (
                t.type != HiveParser.EOF &&
                tokenLine === cursor.lineNumber &&
                tokenEndCol >= cursorCol
            ) {
                if (tokenStartCol <= cursorCol) {
                    return i - 1;
                }
            } else if (t.type === HiveParser.EOF) {
                return i;
            }
        }
        return undefined;
    }
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
