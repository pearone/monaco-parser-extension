// import antlr from "antlr4";
// import HiveLexer from "../v3/HiveLexer.js";
// import HiveParser from "../v3/HiveParser.js";
// import * as monaco from "monaco-editor/esm/vs/editor/editor.api";

// export function getAllTokens(input: string) {
//     const chars = new antlr.InputStream(input);
//     const lexer = new HiveLexer(chars);

//     // 获取token流
//     const tokens = lexer.getAllTokens();

//     // 捕获词法错误
//     const errors: number[] = [];
//     lexer.removeErrorListeners();

//     // lexer.addErrorListener({
//     //     syntaxError(_1, _2, _3, charPositionInLine: number) {
//     //         errors.push(charPositionInLine);
//     //     },
//     // });

//     console.log(antlr);

//     const res: monaco.languages.IToken[] = tokens.map(
//         (token: { text: any; start: any }) => {
//             return {
//                 scopes: token.text,
//                 startIndex: token.start,
//             };
//         }
//     );

//     // 将捕获到的错误加入res中
//     errors.forEach((point) => res.push({ scopes: "error", startIndex: point }));

//     return res;
// }

// // export function SplitQueries(input) {
// //   const chars = new antlr.InputStream(input);
// //   const lexer = new HiveLexer(chars);
// //   const tokens = new antlr.CommonTokenStream(lexer);
// //   const parser = new QuerySeparationGrammarParser(tokens);
// //   parser.buildParseTrees = true;

// //   const tree = parser.queriesText();

// //   const result = [];

// //   const listener = new CustomListener(result);
// //   antlr.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

// //   return listener.result;
// // }

// // // const result = SplitQueries("select * from aaa; select * from bbb;");
// // // console.log(result);

// // const result2 = SplitQueries(
// //   "/*aaa;bbb;ccc;ddd;eee;*/ select * from aaa; /*aaa;bbb;ccc;ddd;eee;*/ select * from bbb;"
// // );
// // console.log(result2);

export {};
