import React, { useEffect, useRef } from "react";
import * as monaco from "monaco-editor-core";
import { injectMonacoEditor } from "./editor/inject";

/**
 * 编辑器组件
 * @returns
 */
function Editor() {
    const editor_ref = useRef<HTMLDivElement>(null);
    injectMonacoEditor();

    useEffect(() => {
        if (editor_ref.current) {
            monaco.editor.create(editor_ref.current, {
                value: "select * from aaa where bbb;",
                theme: "vs-dark",
                language: "hivesql",
                minimap: { enabled: false },
            });
        }
    }, [editor_ref.current]);

    return (
        <div
            id="monaco_editor"
            style={{ flex: 1, margin: 30, height: 500 }}
            ref={editor_ref}
        ></div>
    );
}

export default Editor;
