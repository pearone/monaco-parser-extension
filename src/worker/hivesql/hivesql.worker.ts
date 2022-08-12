import { worker } from "monaco-editor-core";
// @ts-ignore
import * as EditorWorker from "monaco-editor-core/esm/vs/editor/editor.worker.js";
import { HiveSQLWorker } from "./worker";

self.onmessage = (e: any) => {
    EditorWorker.initialize((ctx: worker.IWorkerContext) => {
        return new HiveSQLWorker(ctx);
    });
};

export {};
