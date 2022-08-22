import antlr from "antlr4";
import { worker } from "monaco-editor-core";
import HiveSQL from "./parser";
import { BaseSQLWorker } from "../base/worker";
import HiveListener from "./listener";

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

    // token解析规则出的词条
    getAllTokens(code: string): Promise<any> {
        if (code) {
            const result = this.parser
                .getAllTokens(code)
                .filter((r: { type: number }) => r.type != 371)
                .map((r) => {
                    return {
                        startLineNumber: r.line,
                        endLineNumber: r.line,
                        startColumn: r.column,
                        endColumn: r.column + r.text.length + 1,
                    };
                });

            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }

    /**
     *
     * @param code
     * @param position
     * @returns
     */
    completionsFor(code: string, cursor: any, triggerCharacter?: string) {
        const vocabulary = this.parser.getVocabulary();
        const lexer = this.parser.createLexer(code);

        const tokenStream = new antlr.CommonTokenStream(lexer);

        const parser = this.parser.createParser(code);

        const cursorCol = cursor.column - 1;
        // console.log(tokenStream);

        console.log("aaa");

        // console.log("vocabulary", vocabulary, lexer);

        // console.log(lexer, parser, tokenStream);
        // const getExpectedTokens()
        const data = parser._interp.atn.nextTokens(
            parser._interp.atn.states[1]
        );

        // @ts-ignore
        // const _data = parser._interp.atn.getExpectedTokens(
        //     parser._interp.atn.states[1]
        // );

        // @ts-ignore
        const ll = new antlr.LL1Analyzer(
            parser._interp.atn
        ).getDecisionLookahead(parser._interp.atn.states[1]);

        // console.log(ll);
        // const expected = parser.getExpectedTokens();
        // parser.states = 1;
        // console.log("expected", expected);

        // const next = parser.getExpectedTokensWithinCurrentRule();
        // console.log("next", next);
        // console.error(
        //     // parser.literalNames,
        //     data.intervals,
        //     parser._interp.atn,
        //     parser._interp.atn.states[1],
        //     ll
        // );
        ll.map((interval: any) => {
            console.log(tokenStream.getText(interval));
        });

        // console.log(
        //     "getInterpreter",
        //     parser._interp.atn.states

        //     // code.getText()
        // );

        // console.log(parser.getExpectedTokens());

        // @ts-ignore

        // @ts-ignore
        // console.log(antlr.atn.ATN, lexer.getATN());

        if (triggerCharacter) {
            // const lexer = this.parser.createLexer(code);
            // console.log("lexer", lexer);
            this.findCursorTokenIndex(code, cursor);
            return Promise.resolve(vocabulary);
        } else {
            return Promise.resolve(vocabulary);
        }
    }

    // 预测到下一个目标getNextTokens
    findCursorTokenIndex(code: string, position: any) {
        // console.log(code, position);

        const tree = this.parser.parse(code);

        const listener = new HiveListener();

        // @ts-ignore
        antlr.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);
        console.log("listener", listener);
    }
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
