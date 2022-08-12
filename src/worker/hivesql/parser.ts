import antlr from "antlr4";
import HiveLexer from "./grammar/HiveLexer.js";
import HiveParser from "./grammar/HintParser.js";

export default class HiveSQL {
    constructor() {
        console.log(antlr);
    }

    public createLexer(input: string) {
        const chars = new antlr.InputStream(input.toUpperCase());
        return new HiveLexer(chars);
    }
    public createParserFromLexer(lexer: antlr.Lexer) {
        const tokenStream = new antlr.CommonTokenStream(lexer);
        return new HiveParser(tokenStream);
    }
}
