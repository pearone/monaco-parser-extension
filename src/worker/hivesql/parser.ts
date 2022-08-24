import { CharStreams, CommonTokenStream, Lexer } from "antlr4ts";
import { format } from "sql-formatter";
import { HiveLexer } from "./grammar/HiveLexer";
import { HiveParser } from "./grammar/HiveParser";
import BasicParser from "../base/parser";

export default class HiveSQL extends BasicParser {
    // 词法分析
    public createLexer(input: string) {
        const chars = CharStreams.fromString(input.toUpperCase());
        console.log("chars", chars);
        const lexer = new HiveLexer(chars);
        return lexer;
    }

    // 语法分析
    public createParserFromLexer(lexer: Lexer) {
        const tokenStream = new CommonTokenStream(lexer);
        const parser = new HiveParser(tokenStream);
        return parser;
    }

    // 获取tokens
    public createParserTokens(input: string) {
        const chars = CharStreams.fromString(input.toUpperCase());
        const lexer = new HiveLexer(chars);
        const tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();
        return tokenStream;
    }

    // 获取词汇
    public getVocabulary() {
        return HiveParser.VOCABULARY;
    }

    // 格式化
    public format(code: string): string {
        if (this.validate(code).length > 0) {
            return code;
        }
        return format(code);
    }
}
