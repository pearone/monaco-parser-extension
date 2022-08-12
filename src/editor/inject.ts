import * as monaco from "monaco-editor-core";
import { LanguageMapping, LanguageName } from "../constants";

/**
 * 注册
 */
export const injectMonacoEditor = () => {
    (window as any).MonacoEnvironment = {
        getWorkerUrl: function (_: number, label: string) {
            switch (label) {
                case "hivesql":
                    return "./hivesql.worker.js";
                default:
                    return `./editor.worker.js`;
            }
        },
    };

    monaco.languages.register({ id: LanguageName });
    monaco.languages.onLanguage(LanguageName, () => {
        monaco.languages.setMonarchTokensProvider(
            LanguageName,
            LanguageMapping[LanguageName].language
        );
        // monaco.languages.setLanguageConfiguration(
        //     LanguageName,
        //     richLanguageConfiguration
        // );
        // const client = new WorkerManager();

        // const worker: WorkerAccessor = (
        //     ...uris: monaco.Uri[]
        // ): Promise<TodoLangWorker> => {
        //     return client.getLanguageServiceWorker(...uris);
        // };
        // //Call the errors provider
        // new DiagnosticsAdapter(worker);
        // monaco.languages.registerDocumentFormattingEditProvider(
        //     LanguageName,
        //     new TodoLangFormattingProvider(worker)
        // );
    });
};
