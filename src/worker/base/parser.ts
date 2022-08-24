import { ParserError } from "@/editor/interface";
import { Token, Lexer, Parser } from "antlr4ts";
import ParserErrorListener, {
    ErrorHandler,
    ParserErrorCollector,
    ParserErrorStrategy,
} from "./error";

export default abstract class BasicParser {
    public abstract createLexer(input: string): Lexer;

    public abstract createParserFromLexer(lexer: Lexer): Parser;

    public parse(input: string, errorListener?: ErrorHandler) {
        const parser = this.createParser(input);

        parser.removeErrorListeners();
        if (errorListener) {
            parser.addErrorListener(new ParserErrorListener(errorListener));
        }
        parser.errorHandler = new ParserErrorStrategy();

        const parserTree = parser.statements();

        return parserTree;
    }

    public validate(input: string): ParserError[] {
        const errorHandler = new ParserErrorCollector();

        const lexer = this.createLexer(input);
        lexer.removeErrorListeners();
        // lexer.addErrorListener(errorHandler);

        const parser: any = this.createParserFromLexer(lexer);

        parser.removeErrorListeners();
        parser.addErrorListener(errorHandler);

        parser.statements();

        return errorHandler.getErrors();
    }

    public getAllTokens(input: string): Token[] {
        return this.createLexer(input).getAllTokens();
    }

    public createParser(input: string) {
        const lexer = this.createLexer(input);
        const parser: any = this.createParserFromLexer(lexer);
        parser.buildParseTrees = true;

        return parser;
    }

    public parserTreeToString(input: string): string {
        const parser = this.createParser(input);

        const tree = parser.statements();
        return tree.toStringTree(parser.ruleNames);
    }
}
