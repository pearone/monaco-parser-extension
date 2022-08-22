import * as monaco from "monaco-editor-core";
import { LanguageMapping, LanguageName } from "./constants";
import FormattingProvider from "./format";
import { ParserError } from "./interface";
import { provideCompletionItems } from "./template";
import { WorkerManager } from "./worker-manager";

/**
 * 注册
 */
export const injectMonacoEditor = () => {
    let _disposables: monaco.IDisposable[] = [];

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
        // 语法高亮
        _disposables.push(
            monaco.languages.setMonarchTokensProvider(
                LanguageName,
                LanguageMapping[LanguageName].language
            )
        );
        _disposables.push(
            monaco.languages.setLanguageConfiguration(
                LanguageName,
                LanguageMapping[LanguageName].conf
            )
        );
        const client = new WorkerManager({ language: LanguageName });

        const worker = (...uris: monaco.Uri[]) => {
            return client.getLanguageServiceWorker(...uris);
        };

        // 错误提示
        const onModelAdd = (model: monaco.editor.IModel): void => {
            async function validate(resource: monaco.Uri) {
                const workerProxy = await worker(resource);
                const errorMarkers = await (workerProxy as any).doValidation();

                const model = monaco.editor.getModel(resource);
                if (model) {
                    monaco.editor.setModelMarkers(
                        model,
                        LanguageName,
                        errorMarkers.map((error: ParserError) => {
                            return {
                                ...error,
                                severity: monaco.MarkerSeverity.Error,
                            };
                        })
                    );
                }
            }

            let handle: any;
            model.onDidChangeContent(() => {
                clearTimeout(handle);
                handle = setTimeout(() => validate(model.uri), 500);
            });

            validate(model.uri);
        };
        _disposables.push(monaco.editor.onDidCreateModel(onModelAdd));
        monaco.editor.getModels().forEach(onModelAdd);

        // 格式化
        _disposables.push(
            monaco.languages.registerDocumentFormattingEditProvider(
                LanguageName,
                new FormattingProvider(worker)
            )
        );

        // 自动补全
        _disposables.push(
            monaco.languages.registerCompletionItemProvider(LanguageName, {
                triggerCharacters: [" "],
                provideCompletionItems: (model, position, context) => {
                    return provideCompletionItems(
                        model,
                        position,
                        worker,
                        context.triggerCharacter
                    );
                },
            })
        );
    });

    const dispose = () => {
        _disposables.forEach((d) => d && d.dispose());
        _disposables = [];
    };
    return dispose;
};
