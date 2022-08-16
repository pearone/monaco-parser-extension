import antlr from "antlr4";
import { format } from "sql-formatter";
import HiveLexer from "./grammar/HiveLexer.js";
import HiveParser from "./grammar/HiveParser.js";
import BasicParser from "../base/parser";

export default class HiveSQL extends BasicParser {
    // 词法分析
    public createLexer(input: string) {
        const chars = new antlr.InputStream(input.toUpperCase());
        const lexer = new HiveLexer(chars) as unknown as antlr.Lexer;
        return lexer;
    }

    // 语法分析
    public createParserFromLexer(lexer: antlr.Lexer) {
        const tokenStream = new antlr.CommonTokenStream(lexer);
        const parser = new HiveParser(tokenStream) as unknown as antlr.Parser;
        return parser;
    }

    // 格式化
    public format(code: string): string {
        if (this.validate(code).length > 0) {
            console.error("format error", this.validate(code));
            return code;
        }
        return format(code);
    }
}
