import { worker } from "monaco-editor-core";

export abstract class BaseSQLWorker {
    protected abstract _ctx: worker.IWorkerContext;
    protected abstract parser: any;

    private getTextDocument(): string {
        const model = this._ctx.getMirrorModels()[0];
        return model && model.getValue();
    }

    async doValidation(code: string): Promise<any> {
        code = code || this.getTextDocument();
        if (code) {
            const result = this.parser.validate(code);
            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }

    async valid(code: string): Promise<any> {
        if (code) {
            const result = this.parser.validate(code);
            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }

    async parse(code: string): Promise<any> {
        if (code) {
            const result = this.parser.parse(code);
            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }

    async getAllTokens(code: string): Promise<any> {
        if (code) {
            const result = this.parser.getAllTokens(code);
            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }

    async parserTreeToString(code: string): Promise<any> {
        if (code) {
            const result = this.parser.parserTreeToString(code);
            return Promise.resolve(result);
        }
        return Promise.resolve([]);
    }
}
