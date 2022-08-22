import { HiveParserListener } from "./grammar/HiveParserListener";

export default class HiveListener implements HiveParserListener {
    result: any[];
    from_table: any[];
    sql: any[];

    constructor() {
        this.result = [];
        this.from_table = [];
        this.sql = [];
    }

    // enterEveryRule(ctx: any) {
    //     console.log("enterEveryRule", ctx);
    // }

    enterSelectClause(ctx: any) {
        console.log(ctx, ctx.parser, ctx.getText());
        // ctx.parser.exitRule();
        ctx.parser.state = ctx.invokingState;
        const intervalSet = ctx.parser.getExpectedTokens().intervals;
        const intervalSet2 =
            ctx.parser.getExpectedTokensWithinCurrentRule().intervals;
        console.log("enterSelectClause", ctx, intervalSet);

        intervalSet.map((interval: any) => {
            const text = ctx.parser.getTokenStream().getText(interval);
            console.log(ctx.parser.getTokenStream(), interval, text);
        });

        intervalSet2.map((interval: any) => {
            const text = ctx.parser.getTokenStream().getText(interval);
            console.log(interval, text);
        });
    }

    // 子查询
    enterQueryStatementExpression(ctx: any) {
        // console.log("enterQueryStatementExpression", ctx);
        this.from_table.push({
            startLineNumber: ctx.start.line,
            endLineNumber: ctx.stop.line,
            startColumn: ctx.start.column,
            endColumn: ctx.stop.column + ctx.stop.text.length,
        });
    }

    // 表名
    enterTableName(ctx: any) {
        // console.log("enterTableName", ctx);
        this.from_table.push({
            startLineNumber: ctx.start.line,
            endLineNumber: ctx.stop.line,
            startColumn: ctx.start.column,
            endColumn: ctx.stop.column + ctx.stop.text.length,
        });
    }

    // 分号分隔
    exitStatement(ctx: any) {
        this.result.push({
            startLineNumber: ctx.start.line,
            endLineNumber: ctx.stop.line,
            startColumn: ctx.start.column,
            endColumn: ctx.stop.column + ctx.stop.text.length,
        });
    }
}
