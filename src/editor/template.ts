import * as monaco from "monaco-editor-core";

export async function provideCompletionItems(
    model: monaco.editor.ITextModel,
    position: any,
    worker: any
) {
    const text = model.getValue();

    const workerProxy = await worker(model.uri);

    const keywords = await (workerProxy as any).getKeywords();
    const parse = await (workerProxy as any).completionsFor(text, position);

    return {
        suggestions: keywords.map((item: string) => {
            return {
                label: item,
                kind: monaco.languages.CompletionItemKind.Text,
                insertText: item,
            };
        }),
    };
}
