import { worker } from "monaco-editor-core";
import HiveSQL from "./parser";
import { BaseSQLWorker } from "../base/worker";

export interface ICreateData {
    languageId: string;
}
export class HiveSQLWorker extends BaseSQLWorker {
    protected _ctx: worker.IWorkerContext;
    protected parser: HiveSQL;
    constructor(ctx: worker.IWorkerContext) {
        super();
        this._ctx = ctx;
        this.parser = new HiveSQL();
    }
}

export function create(ctx: worker.IWorkerContext): HiveSQLWorker {
    return new HiveSQLWorker(ctx);
}
