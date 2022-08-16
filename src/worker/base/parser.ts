import { ParserError } from "@/editor/interface";
import { Token, Lexer, Parser } from "antlr4";
import ParserErrorListener, {
    ErrorHandler,
    ParserErrorCollector,
} from "./error";

export default abstract class BasicParser<C = any> {
    private _parser: Parser | undefined;

    public abstract createLexer(input: string): Lexer;

    public abstract createParserFromLexer(lexer: Lexer): Parser;

    public parse(input: string, errorListener?: ErrorHandler) {
        const parser = this.createParser(input);
        this._parser = parser;

        parser.removeErrorListeners();
        if (errorListener) {
            parser.addErrorListener(new ParserErrorListener(errorListener));
        }

        const parserTree = parser.statements();

        return parserTree;
    }

    public validate(input: string): ParserError[] {
        const lexerError: ParserError[] = [];
        const syntaxErrors: ParserError[] = [];

        const lexer = this.createLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ParserErrorCollector());

        const parser: any = this.createParserFromLexer(lexer);
        this._parser = parser;

        parser.removeErrorListeners();
        parser.addErrorListener(new ParserErrorCollector());

        parser.statements();

        return lexerError.concat(syntaxErrors);
    }

    public getAllTokens(input: string): Token[] {
        return this.createLexer(input).getAllTokens();
    }

    public createParser(input: string) {
        const lexer = this.createLexer(input);
        const parser: any = this.createParserFromLexer(lexer);
        parser.buildParseTrees = true;
        this._parser = parser;

        return parser;
    }

    public parserTreeToString(input: string): string {
        const parser = this.createParser(input);
        this._parser = parser;

        const tree = parser.statements();
        return tree.toStringTree(parser.ruleNames);
    }
}
