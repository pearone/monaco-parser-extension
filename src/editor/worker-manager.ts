import * as monaco from "monaco-editor-core";
import Uri = monaco.Uri;

interface LanguageServiceDefaults {
    language: string;
}

export class WorkerManager<T extends object> {
    private _defaults: LanguageServiceDefaults;
    private _worker: monaco.editor.MonacoWebWorker<T> | null;
    private _client: Promise<T> | null | undefined;

    constructor(defaults: LanguageServiceDefaults) {
        this._defaults = defaults;
        this._worker = null;
    }

    private getClientProxy(): Promise<T> {
        if (!this._client) {
            this._worker = monaco.editor.createWebWorker<T>({
                moduleId: this._defaults.language,
                label: this._defaults.language,

                createData: {
                    languageId: this._defaults.language,
                },
            });

            this._client = <Promise<T>>(<any>this._worker.getProxy());
        }

        return this._client;
    }

    async getLanguageServiceWorker(...resources: Uri[]) {
        const client = await this.getClientProxy();
        await this._worker?.withSyncedResources(resources);
        return client;
    }
}

export type WorkerAccessor<T> = (...uris: monaco.Uri[]) => Promise<T>;
