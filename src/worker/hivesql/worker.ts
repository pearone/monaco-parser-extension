import { CommonTokenStream, TokenStream } from "antlr4ts";
import { worker } from "monaco-editor-core";
import HiveSQL from "./parser";
import { CodeCompletionCore } from "antlr4-c3";
import { BaseSQLWorker } from "../base/worker";

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
        const lexer = this.parser.createLexer(code);
        const tokenStream = new CommonTokenStream(lexer);
        const parser = this.parser.createParser(code);
        this.findCursorTokenIndex(tokenStream, cursor);
        const core = new CodeCompletionCore(parser);
        const candidates = core.collectCandidates(0);

        console.log(candidates);
    }

    findCursorTokenIndex(
        tokenStream: TokenStream,
        cursor: { lineNumber: number; column: number }
    ) {
        console.log(tokenStream, cursor);
        const cursorCol = cursor.column - 1;
        for (let i = 0; i < tokenStream.size; i++) {
            const t = tokenStream.get(i);

            const tokenStartCol = t.charPositionInLine;
            const tokenEndCol = tokenStartCol + (t.text as string).length;
        }
        return undefined;
    }
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
