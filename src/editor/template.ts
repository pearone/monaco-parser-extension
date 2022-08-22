import * as monaco from "monaco-editor-core";

export async function provideCompletionItems(
    model: monaco.editor.ITextModel,
    position: any,
    worker: any,
    triggerCharacter?: string
) {
    const code = model.getValue();
    const workerProxy = await worker(model.uri);
    const keywords = await (workerProxy as any).completionsFor(
        code,
        position,
        triggerCharacter
    );

    const word = model.getWordUntilPosition(position);
    const range: monaco.IRange = {
        startLineNumber: position.lineNumber,
        endLineNumber: position.lineNumber,
        startColumn: word.startColumn,
        endColumn: word.endColumn,
    };

    return {
        suggestions: Array.from(new Set([...keywords])).map((item: string) => {
            return {
                label: item,
                kind: monaco.languages.CompletionItemKind.Text,
                insertText: item,
                range: range,
            };
        }),
    };
}
