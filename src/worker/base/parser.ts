import { ParserError } from "@/editor/interface";
import { Token, Lexer, Parser } from "antlr4";
import ParserErrorListener, {
    ErrorHandler,
    ParserErrorCollector,
} from "./error";

export default abstract class BasicParser<C = any> {
    public abstract createLexer(input: string): Lexer;

    public abstract createParserFromLexer(lexer: Lexer): Parser;

    public parse(input: string, errorListener?: ErrorHandler) {
        const parser = this.createParser(input);

        parser.removeErrorListeners();
        if (errorListener) {
            parser.addErrorListener(new ParserErrorListener(errorListener));
        }

        const parserTree = parser.statements();

        return parserTree;
    }

    public validate(input: string): ParserError[] {
        const errorHandler = new ParserErrorCollector();

        const lexer = this.createLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorHandler);

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
