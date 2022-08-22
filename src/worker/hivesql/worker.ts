import { CommonTokenStream } from "antlr4ts";
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
        const parser = this.parser.createParser(code);

        console.log(parser);
        const core = new CodeCompletionCore(parser);
        const candidates = core.collectCandidates(0);

        console.log(candidates);
    }

    findCursorTokenIndex(code: string, position: any) {}
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
