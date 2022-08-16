import { Token, Recognizer } from "antlr4";
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
        let endCol = charPositionInLine + 1;
        if (offendingSymbol && offendingSymbol.text !== null) {
            endCol = charPositionInLine + offendingSymbol.text.length;
        }
        this._errors.push({
            startLine: line,
            endLine: line,
            startCol: charPositionInLine,
            endCol: endCol,
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
        let endCol = charPositionInLine + 1;
        if (offendingSymbol && offendingSymbol.text !== null) {
            endCol = charPositionInLine + offendingSymbol.text.length;
        }
        if (this._errorHandler) {
            this._errorHandler(
                {
                    startLine: line,
                    endLine: line,
                    startCol: charPositionInLine,
                    endCol: endCol,
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

export interface SyntaxError {
    recognizer: Recognizer;
    offendingSymbol: Token;
    line: number;
    charPositionInLine: number;
    msg: string;
    e: any;
}

export type ErrorHandler = (err: ParserError, errOption: SyntaxError) => void;
