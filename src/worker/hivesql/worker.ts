import { worker } from "monaco-editor-core";
import HiveSQL from "./parser";
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

    // doValidation() {}
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
