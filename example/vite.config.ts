import reactRefresh from "@vitejs/plugin-react-refresh";
import { resolve } from "path";
import { defineConfig } from "vite";
import Inspect from "vite-plugin-inspect";

const prefix = `monaco-editor/esm/vs`;

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

  plugins: [reactRefresh(), Inspect()],
});
