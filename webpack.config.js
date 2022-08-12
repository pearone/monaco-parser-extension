const path = require("path");
const htmlWebpackPlugin = require("html-webpack-plugin");
module.exports = {
    mode: "development",
    entry: {
        app: "./src/main.tsx",
        "editor.worker": "monaco-editor-core/esm/vs/editor/editor.worker.js",
        "hivesql.worker": "./src/worker/hivesql/hivesql.worker.ts",
    },
    output: {
        // globalObject: "self",
        filename: (chunkData) => {
            switch (chunkData.chunk.name) {
                case "editor.worker":
                    return "editor.worker.js";
                case "hivesql.worker":
                    return "hivesql.worker.js";
                default:
                    return "bundle.[hash].js";
            }
        },
        path: path.resolve(__dirname, "dist"),
    },
    resolve: {
        extensions: [".ts", ".tsx", ".js", ".jsx", ".css"],
    },
    module: {
        rules: [
            {
                test: /\.tsx?/,
                loader: "ts-loader",
            },
            {
                test: /\.css/,
                use: ["style-loader", "css-loader"],
            },
        ],
    },
    plugins: [
        new htmlWebpackPlugin({
            template: "./index.html",
        }),
    ],
};
