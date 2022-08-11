import * as monaco from "monaco-editor/esm/vs/editor/editor.api";
import { HoverProvider } from "./HoverProvider";
import { Linter } from "./Linter";
import { TokensProviders } from "./TokenProvider";

const disposeAll = (disposables: monaco.IDisposable[]) => {
    disposables.forEach((item) => item.dispose());
};

const registerDispose = (disposables: monaco.IDisposable[]) => ({
    dispose: () => disposeAll(disposables),
});

export const registerProvier = (language: string) => {
    const disposables: monaco.IDisposable[] = [];

    // 注册语言
    monaco.languages.register({ id: language });
    // 注册高亮
    disposables.push(
        monaco.languages.setTokensProvider(language, new TokensProviders())
    );
    // // 注册hover提示
    // disposables.push(
    //     monaco.languages.registerHoverProvider(language, new HoverProvider())
    // );
    // // 注册错误捕获
    // disposables.push(new Linter(language));

    return registerDispose(disposables);
};
