import * as monaco from "monaco-editor-core";
import { CompletionItem } from "vscode-languageserver";

export async function provideCompletionItems(
    model: monaco.editor.ITextModel,
    position: any,
    worker: any,
    triggerCharacter?: string
) {
    const code = model.getValue();
    const workerProxy = await worker(model.uri);
    const items = await (workerProxy as any).completionsFor(
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
        suggestions: items.map((item: CompletionItem) => {
            return {
                ...item,
                range: range,
            };
        }),
    };
}
