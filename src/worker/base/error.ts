import { Token, Recognizer, Parser } from "antlr4";
import antlr from "antlr4";
import { ParserError } from "@/editor/interface";

// @ts-ignore
export class ParserErrorCollector extends antlr.error.ErrorListener {
    private _errors: ParserError[];

    constructor() {
        super();
        this._errors = [];
    }

    syntaxError(
        recognizer: Recognizer,
        offendingSymbol: Token,
        line: number,
        charPositionInLine: number,
        msg: string,
        e: any
    ) {
        // @ts-ignore
        const parser = recognizer._ctx.parser,
            tokens = parser.getTokenStream().tokens;

        // console.log(parser, tokens);

        const startColumn = charPositionInLine + 1;
        const textLength =
            offendingSymbol && offendingSymbol.text !== null
                ? offendingSymbol.text.length
                : 0;

        // @ts-ignore
        // const data = recognizer.atn.getExpectedTokens(recognizer.state);

        // data.intervals.map((interval: any) => {
        //     console.log(interval);
        // });

        // console.log("recognizer", recognizer);

        this._errors.push({
            startLineNumber: line,
            endLineNumber: line,
            startColumn: startColumn,
            endColumn: startColumn + textLength,
            message: msg,
        });
    }

    getErrors(): ParserError[] {
        return this._errors;
    }

    reportAmbiguity() {}

    reportAttemptingFullContext() {}

    reportContextSensitivity() {}
}

// @ts-ignore
export default class ParserErrorListener extends antlr.error.ErrorListener {
    private _errorHandler;

    constructor(errorListener: ErrorHandler) {
        super();
        this._errorHandler = errorListener;
    }

    syntaxError(
        recognizer: Recognizer,
        offendingSymbol: Token,
        line: number,
        charPositionInLine: number,
        msg: string,
        e: any
    ) {
        const startColumn = charPositionInLine + 1;
        const textLength =
            offendingSymbol && offendingSymbol.text !== null
                ? offendingSymbol.text.length
                : 0;

        if (this._errorHandler) {
            this._errorHandler(
                {
                    startLineNumber: line,
                    endLineNumber: line,
                    startColumn: startColumn,
                    endColumn: startColumn + textLength,
                    message: msg,
                },
                {
                    e,
                    line,
                    msg,
                    recognizer,
                    offendingSymbol,
                    charPositionInLine,
                }
            );
        }
    }
}

// @ts-ignore
// 错误规则：出错不阻止listener
export class ParserErrorStrategy extends antlr.error.DefaultErrorStrategy {
    protected beginErrorCondition(recognizer: Parser) {
        console.log("beginErrorCondition");
    }

    protected singleTokenDeletion(recognizer: Parser): Token | undefined {
        console.log("singleTokenDeletion");
        return undefined;
    }
}

export interface SyntaxError {
    recognizer: Recognizer;
    offendingSymbol: Token;
    line: number;
    charPositionInLine: number;
    msg: string;
    e: any;
}

export type ErrorHandler = (err: ParserError, errOption: SyntaxError) => void;
