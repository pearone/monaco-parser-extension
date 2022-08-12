import reactRefresh from "@vitejs/plugin-react-refresh";
import { resolve } from "path";
import { defineConfig } from "vite";
import Inspect from "vite-plugin-inspect";

// https://vitejs.dev/config/
export default defineConfig({
    resolve: {
        alias: {
            "@": resolve("./src"),
        },
    },
    build: {
        sourcemap: true,
    },
    optimizeDeps: {
        include: [
            `./src/worker/hivesql/hivesql.worker.ts`,
            `monaco-editor/esm/vs/editor/editor.worker`,
        ],
    },

    plugins: [reactRefresh(), Inspect()],
});
