import React, { useEffect, useRef } from "react";
import * as monaco from "monaco-editor";
import { registerProvier } from "./registerProvider";

/**
 * 编辑器组件
 * @returns
 */
function Editor() {
    const editor_ref = useRef<HTMLDivElement>(null);

    // 编辑器的选项
    const editor_option = {
        automaticLayout: true, // 自适应布局
        scrollBeyondLastLine: false, // 取消代码后面空白
        fixedOverflowWidgets: true, // 超出编辑器大小的使用fixed属性显示
        theme: "vs-dark",
        language: "antlr-sql",
        minimap: {
            enabled: false, // 不要小地图
        },
    } as monaco.editor.IEditorConstructionOptions;

    /**
     * 注册editor
     */
    const injectMonacoEditorWorker = () => {
        const language = "antlr-sql";
        registerProvier(language);
    };

    useEffect(() => {
        if (editor_ref.current) {
            injectMonacoEditorWorker();
            const editor = monaco.editor.create(editor_ref.current, {
                value: `select * from aaa;`,
                ...editor_option,
            });

            editor.addCommand(
                monaco.KeyMod.CtrlCmd | monaco.KeyCode.KEY_S,
                () => {
                    const value = editor.getValue();
                    console.log(value);
                }
            );

            editor.onDidChangeModelContent(() => {
                const value = editor.getValue();
                console.log(value);
            });
        }
    }, [editor_ref.current]);

    return (
        <div
            id="monaco_editor"
            style={{ flex: 1, margin: 30 }}
            ref={editor_ref}
        ></div>
    );
}

export default React.memo(Editor);
