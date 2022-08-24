import HiveListener from "./listener";
import { ParseTreeListener, ParseTreeWalker } from "antlr4ts/tree";
import { StatementsContext } from "./grammar/HiveParser";

export class QueryAnalyzer {
    private HiveListener = new HiveListener() as ParseTreeListener;

    public constructor(protected parsedQueryTree: StatementsContext) {
        ParseTreeWalker.DEFAULT.walk(this.HiveListener, parsedQueryTree);
    }
}
