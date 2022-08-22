// Generated from HiveParser.g4 by ANTLR 4.9.0-SNAPSHOT


import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";

import { StatementsContext } from "./HiveParser";
import { StatementSeparatorContext } from "./HiveParser";
import { StatementContext } from "./HiveParser";
import { ExplainStatementContext } from "./HiveParser";
import { ExplainOptionContext } from "./HiveParser";
import { VectorizationOnlyContext } from "./HiveParser";
import { VectorizatonDetailContext } from "./HiveParser";
import { ExecStatementContext } from "./HiveParser";
import { LoadStatementContext } from "./HiveParser";
import { ReplicationClauseContext } from "./HiveParser";
import { ExportStatementContext } from "./HiveParser";
import { ImportStatementContext } from "./HiveParser";
import { ReplDumpStatementContext } from "./HiveParser";
import { ReplLoadStatementContext } from "./HiveParser";
import { ReplConfigsContext } from "./HiveParser";
import { ReplConfigsListContext } from "./HiveParser";
import { ReplStatusStatementContext } from "./HiveParser";
import { DdlStatementContext } from "./HiveParser";
import { IfExistsContext } from "./HiveParser";
import { RestrictOrCascadeContext } from "./HiveParser";
import { IfNotExistsContext } from "./HiveParser";
import { RewriteEnabledContext } from "./HiveParser";
import { RewriteDisabledContext } from "./HiveParser";
import { StoredAsDirsContext } from "./HiveParser";
import { OrReplaceContext } from "./HiveParser";
import { CreateDatabaseStatementContext } from "./HiveParser";
import { DbLocationContext } from "./HiveParser";
import { DbPropertiesContext } from "./HiveParser";
import { DbPropertiesListContext } from "./HiveParser";
import { SwitchDatabaseStatementContext } from "./HiveParser";
import { DropDatabaseStatementContext } from "./HiveParser";
import { DatabaseCommentContext } from "./HiveParser";
import { CreateTableStatementContext } from "./HiveParser";
import { TruncateTableStatementContext } from "./HiveParser";
import { DropTableStatementContext } from "./HiveParser";
import { AlterStatementContext } from "./HiveParser";
import { AlterTableStatementSuffixContext } from "./HiveParser";
import { AlterTblPartitionStatementSuffixContext } from "./HiveParser";
import { AlterStatementPartitionKeyTypeContext } from "./HiveParser";
import { AlterViewStatementSuffixContext } from "./HiveParser";
import { AlterMaterializedViewStatementSuffixContext } from "./HiveParser";
import { AlterDatabaseStatementSuffixContext } from "./HiveParser";
import { AlterDatabaseSuffixPropertiesContext } from "./HiveParser";
import { AlterDatabaseSuffixSetOwnerContext } from "./HiveParser";
import { AlterDatabaseSuffixSetLocationContext } from "./HiveParser";
import { AlterStatementSuffixRenameContext } from "./HiveParser";
import { AlterStatementSuffixAddColContext } from "./HiveParser";
import { AlterStatementSuffixAddConstraintContext } from "./HiveParser";
import { AlterStatementSuffixDropConstraintContext } from "./HiveParser";
import { AlterStatementSuffixRenameColContext } from "./HiveParser";
import { AlterStatementSuffixUpdateStatsColContext } from "./HiveParser";
import { AlterStatementSuffixUpdateStatsContext } from "./HiveParser";
import { AlterStatementChangeColPositionContext } from "./HiveParser";
import { AlterStatementSuffixAddPartitionsContext } from "./HiveParser";
import { AlterStatementSuffixAddPartitionsElementContext } from "./HiveParser";
import { AlterStatementSuffixTouchContext } from "./HiveParser";
import { AlterStatementSuffixArchiveContext } from "./HiveParser";
import { AlterStatementSuffixUnArchiveContext } from "./HiveParser";
import { PartitionLocationContext } from "./HiveParser";
import { AlterStatementSuffixDropPartitionsContext } from "./HiveParser";
import { AlterStatementSuffixPropertiesContext } from "./HiveParser";
import { AlterViewSuffixPropertiesContext } from "./HiveParser";
import { AlterMaterializedViewSuffixRewriteContext } from "./HiveParser";
import { AlterMaterializedViewSuffixRebuildContext } from "./HiveParser";
import { AlterStatementSuffixSerdePropertiesContext } from "./HiveParser";
import { AlterIndexStatementSuffixContext } from "./HiveParser";
import { AlterStatementSuffixFileFormatContext } from "./HiveParser";
import { AlterStatementSuffixClusterbySortbyContext } from "./HiveParser";
import { AlterTblPartitionStatementSuffixSkewedLocationContext } from "./HiveParser";
import { SkewedLocationsContext } from "./HiveParser";
import { SkewedLocationsListContext } from "./HiveParser";
import { SkewedLocationMapContext } from "./HiveParser";
import { AlterStatementSuffixLocationContext } from "./HiveParser";
import { AlterStatementSuffixSkewedbyContext } from "./HiveParser";
import { AlterStatementSuffixExchangePartitionContext } from "./HiveParser";
import { AlterStatementSuffixRenamePartContext } from "./HiveParser";
import { AlterStatementSuffixStatsPartContext } from "./HiveParser";
import { AlterStatementSuffixMergeFilesContext } from "./HiveParser";
import { AlterStatementSuffixBucketNumContext } from "./HiveParser";
import { CreateIndexStatementContext } from "./HiveParser";
import { LocationPathContext } from "./HiveParser";
import { DropIndexStatementContext } from "./HiveParser";
import { TablePartitionPrefixContext } from "./HiveParser";
import { BlockingContext } from "./HiveParser";
import { AlterStatementSuffixCompactContext } from "./HiveParser";
import { AlterStatementSuffixSetOwnerContext } from "./HiveParser";
import { FileFormatContext } from "./HiveParser";
import { InputFileFormatContext } from "./HiveParser";
import { TabTypeExprContext } from "./HiveParser";
import { PartTypeExprContext } from "./HiveParser";
import { TabPartColTypeExprContext } from "./HiveParser";
import { DescStatementContext } from "./HiveParser";
import { AnalyzeStatementContext } from "./HiveParser";
import { ShowStatementContext } from "./HiveParser";
import { LockStatementContext } from "./HiveParser";
import { LockDatabaseContext } from "./HiveParser";
import { LockModeContext } from "./HiveParser";
import { UnlockStatementContext } from "./HiveParser";
import { UnlockDatabaseContext } from "./HiveParser";
import { CreateRoleStatementContext } from "./HiveParser";
import { DropRoleStatementContext } from "./HiveParser";
import { GrantPrivilegesContext } from "./HiveParser";
import { RevokePrivilegesContext } from "./HiveParser";
import { GrantRoleContext } from "./HiveParser";
import { RevokeRoleContext } from "./HiveParser";
import { ShowRoleGrantsContext } from "./HiveParser";
import { ShowRolesContext } from "./HiveParser";
import { ShowCurrentRoleContext } from "./HiveParser";
import { SetRoleContext } from "./HiveParser";
import { ShowGrantsContext } from "./HiveParser";
import { ShowRolePrincipalsContext } from "./HiveParser";
import { PrivilegeIncludeColObjectContext } from "./HiveParser";
import { PrivilegeObjectContext } from "./HiveParser";
import { PrivObjectContext } from "./HiveParser";
import { PrivObjectColsContext } from "./HiveParser";
import { PrivilegeListContext } from "./HiveParser";
import { PrivlegeDefContext } from "./HiveParser";
import { PrivilegeTypeContext } from "./HiveParser";
import { PrincipalSpecificationContext } from "./HiveParser";
import { PrincipalNameContext } from "./HiveParser";
import { WithGrantOptionContext } from "./HiveParser";
import { GrantOptionForContext } from "./HiveParser";
import { AdminOptionForContext } from "./HiveParser";
import { WithAdminOptionContext } from "./HiveParser";
import { MetastoreCheckContext } from "./HiveParser";
import { ResourceListContext } from "./HiveParser";
import { ResourceContext } from "./HiveParser";
import { ResourceTypeContext } from "./HiveParser";
import { CreateFunctionStatementContext } from "./HiveParser";
import { DropFunctionStatementContext } from "./HiveParser";
import { ReloadFunctionStatementContext } from "./HiveParser";
import { CreateMacroStatementContext } from "./HiveParser";
import { DropMacroStatementContext } from "./HiveParser";
import { CreateViewStatementContext } from "./HiveParser";
import { CreateMaterializedViewStatementContext } from "./HiveParser";
import { ViewPartitionContext } from "./HiveParser";
import { DropViewStatementContext } from "./HiveParser";
import { DropMaterializedViewStatementContext } from "./HiveParser";
import { ShowFunctionIdentifierContext } from "./HiveParser";
import { ShowStmtIdentifierContext } from "./HiveParser";
import { TableCommentContext } from "./HiveParser";
import { TablePartitionContext } from "./HiveParser";
import { TableBucketsContext } from "./HiveParser";
import { TableSkewedContext } from "./HiveParser";
import { RowFormatContext } from "./HiveParser";
import { RecordReaderContext } from "./HiveParser";
import { RecordWriterContext } from "./HiveParser";
import { RowFormatSerdeContext } from "./HiveParser";
import { RowFormatDelimitedContext } from "./HiveParser";
import { TableRowFormatContext } from "./HiveParser";
import { TablePropertiesPrefixedContext } from "./HiveParser";
import { TablePropertiesContext } from "./HiveParser";
import { TablePropertiesListContext } from "./HiveParser";
import { KeyValuePropertyContext } from "./HiveParser";
import { KeyPropertyContext } from "./HiveParser";
import { TableRowFormatFieldIdentifierContext } from "./HiveParser";
import { TableRowFormatCollItemsIdentifierContext } from "./HiveParser";
import { TableRowFormatMapKeysIdentifierContext } from "./HiveParser";
import { TableRowFormatLinesIdentifierContext } from "./HiveParser";
import { TableRowNullFormatContext } from "./HiveParser";
import { TableFileFormatContext } from "./HiveParser";
import { TableLocationContext } from "./HiveParser";
import { ColumnNameTypeListContext } from "./HiveParser";
import { ColumnNameTypeOrConstraintListContext } from "./HiveParser";
import { ColumnNameColonTypeListContext } from "./HiveParser";
import { ColumnNameListContext } from "./HiveParser";
import { ColumnNameContext } from "./HiveParser";
import { ExtColumnNameContext } from "./HiveParser";
import { ColumnNameOrderListContext } from "./HiveParser";
import { ColumnParenthesesListContext } from "./HiveParser";
import { EnableValidateSpecificationContext } from "./HiveParser";
import { EnableSpecificationContext } from "./HiveParser";
import { ValidateSpecificationContext } from "./HiveParser";
import { EnforcedSpecificationContext } from "./HiveParser";
import { RelySpecificationContext } from "./HiveParser";
import { CreateConstraintContext } from "./HiveParser";
import { AlterConstraintWithNameContext } from "./HiveParser";
import { PkConstraintContext } from "./HiveParser";
import { CreateForeignKeyContext } from "./HiveParser";
import { AlterForeignKeyWithNameContext } from "./HiveParser";
import { SkewedValueElementContext } from "./HiveParser";
import { SkewedColumnValuePairListContext } from "./HiveParser";
import { SkewedColumnValuePairContext } from "./HiveParser";
import { SkewedColumnValuesContext } from "./HiveParser";
import { SkewedColumnValueContext } from "./HiveParser";
import { SkewedValueLocationElementContext } from "./HiveParser";
import { OrderSpecificationContext } from "./HiveParser";
import { NullOrderingContext } from "./HiveParser";
import { ColumnNameOrderContext } from "./HiveParser";
import { ColumnNameCommentListContext } from "./HiveParser";
import { ColumnNameCommentContext } from "./HiveParser";
import { ColumnRefOrderContext } from "./HiveParser";
import { ColumnNameTypeContext } from "./HiveParser";
import { ColumnNameTypeOrConstraintContext } from "./HiveParser";
import { TableConstraintContext } from "./HiveParser";
import { ColumnNameTypeConstraintContext } from "./HiveParser";
import { ColumnConstraintContext } from "./HiveParser";
import { ForeignKeyConstraintContext } from "./HiveParser";
import { ColConstraintContext } from "./HiveParser";
import { AlterColumnConstraintContext } from "./HiveParser";
import { AlterForeignKeyConstraintContext } from "./HiveParser";
import { AlterColConstraintContext } from "./HiveParser";
import { TableConstraintPrimaryKeyContext } from "./HiveParser";
import { ConstraintOptsCreateContext } from "./HiveParser";
import { ConstraintOptsAlterContext } from "./HiveParser";
import { ColumnNameColonTypeContext } from "./HiveParser";
import { ColTypeContext } from "./HiveParser";
import { ColTypeListContext } from "./HiveParser";
import { Type_db_colContext } from "./HiveParser";
import { PrimitiveTypeContext } from "./HiveParser";
import { ListTypeContext } from "./HiveParser";
import { StructTypeContext } from "./HiveParser";
import { MapTypeContext } from "./HiveParser";
import { UnionTypeContext } from "./HiveParser";
import { SetOperatorContext } from "./HiveParser";
import { QueryStatementExpressionContext } from "./HiveParser";
import { QueryStatementExpressionBodyContext } from "./HiveParser";
import { WithClauseContext } from "./HiveParser";
import { CteStatementContext } from "./HiveParser";
import { FromStatementContext } from "./HiveParser";
import { SingleFromStatementContext } from "./HiveParser";
import { RegularBodyContext } from "./HiveParser";
import { AtomSelectStatementContext } from "./HiveParser";
import { SelectStatementContext } from "./HiveParser";
import { SetOpSelectStatementContext } from "./HiveParser";
import { SelectStatementWithCTEContext } from "./HiveParser";
import { BodyContext } from "./HiveParser";
import { InsertClauseContext } from "./HiveParser";
import { DestinationContext } from "./HiveParser";
import { LimitClauseContext } from "./HiveParser";
import { DeleteStatementContext } from "./HiveParser";
import { ColumnAssignmentClauseContext } from "./HiveParser";
import { SetColumnsClauseContext } from "./HiveParser";
import { UpdateStatementContext } from "./HiveParser";
import { SqlTransactionStatementContext } from "./HiveParser";
import { StartTransactionStatementContext } from "./HiveParser";
import { TransactionModeContext } from "./HiveParser";
import { TransactionAccessModeContext } from "./HiveParser";
import { IsolationLevelContext } from "./HiveParser";
import { LevelOfIsolationContext } from "./HiveParser";
import { CommitStatementContext } from "./HiveParser";
import { RollbackStatementContext } from "./HiveParser";
import { SetAutoCommitStatementContext } from "./HiveParser";
import { AbortTransactionStatementContext } from "./HiveParser";
import { MergeStatementContext } from "./HiveParser";
import { WhenClausesContext } from "./HiveParser";
import { WhenNotMatchedClauseContext } from "./HiveParser";
import { WhenMatchedAndClauseContext } from "./HiveParser";
import { WhenMatchedThenClauseContext } from "./HiveParser";
import { UpdateOrDeleteContext } from "./HiveParser";
import { KillQueryStatementContext } from "./HiveParser";
import { SelectClauseContext } from "./HiveParser";
import { SelectListContext } from "./HiveParser";
import { SelectTrfmClauseContext } from "./HiveParser";
import { SelectItemContext } from "./HiveParser";
import { TrfmClauseContext } from "./HiveParser";
import { SelectExpressionContext } from "./HiveParser";
import { SelectExpressionListContext } from "./HiveParser";
import { Window_clauseContext } from "./HiveParser";
import { Window_defnContext } from "./HiveParser";
import { Window_specificationContext } from "./HiveParser";
import { Window_frameContext } from "./HiveParser";
import { Window_range_expressionContext } from "./HiveParser";
import { Window_value_expressionContext } from "./HiveParser";
import { Window_frame_start_boundaryContext } from "./HiveParser";
import { Window_frame_boundaryContext } from "./HiveParser";
import { TableAllColumnsContext } from "./HiveParser";
import { TableOrColumnContext } from "./HiveParser";
import { ExpressionListContext } from "./HiveParser";
import { AliasListContext } from "./HiveParser";
import { FromClauseContext } from "./HiveParser";
import { FromSourceContext } from "./HiveParser";
import { AtomjoinSourceContext } from "./HiveParser";
import { JoinSourceContext } from "./HiveParser";
import { JoinSourcePartContext } from "./HiveParser";
import { UniqueJoinSourceContext } from "./HiveParser";
import { UniqueJoinExprContext } from "./HiveParser";
import { UniqueJoinTokenContext } from "./HiveParser";
import { JoinTokenContext } from "./HiveParser";
import { LateralViewContext } from "./HiveParser";
import { TableAliasContext } from "./HiveParser";
import { TableBucketSampleContext } from "./HiveParser";
import { SplitSampleContext } from "./HiveParser";
import { TableSampleContext } from "./HiveParser";
import { TableSourceContext } from "./HiveParser";
import { UniqueJoinTableSourceContext } from "./HiveParser";
import { TableNameContext } from "./HiveParser";
import { ViewNameContext } from "./HiveParser";
import { SubQuerySourceContext } from "./HiveParser";
import { PartitioningSpecContext } from "./HiveParser";
import { PartitionTableFunctionSourceContext } from "./HiveParser";
import { PartitionedTableFunctionContext } from "./HiveParser";
import { WhereClauseContext } from "./HiveParser";
import { SearchConditionContext } from "./HiveParser";
import { ValuesClauseContext } from "./HiveParser";
import { ValuesTableConstructorContext } from "./HiveParser";
import { ValueRowConstructorContext } from "./HiveParser";
import { VirtualTableSourceContext } from "./HiveParser";
import { GroupByClauseContext } from "./HiveParser";
import { Groupby_expressionContext } from "./HiveParser";
import { GroupByEmptyContext } from "./HiveParser";
import { RollupStandardContext } from "./HiveParser";
import { RollupOldSyntaxContext } from "./HiveParser";
import { GroupingSetExpressionContext } from "./HiveParser";
import { GroupingSetExpressionMultipleContext } from "./HiveParser";
import { GroupingExpressionSingleContext } from "./HiveParser";
import { HavingClauseContext } from "./HiveParser";
import { HavingConditionContext } from "./HiveParser";
import { ExpressionsInParenthesisContext } from "./HiveParser";
import { ExpressionsNotInParenthesisContext } from "./HiveParser";
import { ExpressionPartContext } from "./HiveParser";
import { ExpressionsContext } from "./HiveParser";
import { ColumnRefOrderInParenthesisContext } from "./HiveParser";
import { ColumnRefOrderNotInParenthesisContext } from "./HiveParser";
import { OrderByClauseContext } from "./HiveParser";
import { ClusterByClauseContext } from "./HiveParser";
import { PartitionByClauseContext } from "./HiveParser";
import { DistributeByClauseContext } from "./HiveParser";
import { SortByClauseContext } from "./HiveParser";
import { Function_Context } from "./HiveParser";
import { FunctionNameContext } from "./HiveParser";
import { CastExpressionContext } from "./HiveParser";
import { CaseExpressionContext } from "./HiveParser";
import { WhenExpressionContext } from "./HiveParser";
import { FloorExpressionContext } from "./HiveParser";
import { FloorDateQualifiersContext } from "./HiveParser";
import { ExtractExpressionContext } from "./HiveParser";
import { TimeQualifiersContext } from "./HiveParser";
import { ConstantContext } from "./HiveParser";
import { StringLiteralSequenceContext } from "./HiveParser";
import { CharSetStringLiteralContext } from "./HiveParser";
import { DateLiteralContext } from "./HiveParser";
import { TimestampLiteralContext } from "./HiveParser";
import { TimestampLocalTZLiteralContext } from "./HiveParser";
import { IntervalValueContext } from "./HiveParser";
import { IntervalLiteralContext } from "./HiveParser";
import { IntervalExpressionContext } from "./HiveParser";
import { IntervalQualifiersContext } from "./HiveParser";
import { AtomExpressionContext } from "./HiveParser";
import { PrecedenceUnaryOperatorContext } from "./HiveParser";
import { IsConditionContext } from "./HiveParser";
import { PrecedenceBitwiseXorOperatorContext } from "./HiveParser";
import { PrecedenceStarOperatorContext } from "./HiveParser";
import { PrecedencePlusOperatorContext } from "./HiveParser";
import { PrecedenceConcatenateOperatorContext } from "./HiveParser";
import { PrecedenceAmpersandOperatorContext } from "./HiveParser";
import { PrecedenceBitwiseOrOperatorContext } from "./HiveParser";
import { PrecedenceRegexpOperatorContext } from "./HiveParser";
import { PrecedenceComparisonOperatorContext } from "./HiveParser";
import { PrecedenceNotOperatorContext } from "./HiveParser";
import { PrecedenceLogicOperatorContext } from "./HiveParser";
import { ExpressionContext } from "./HiveParser";
import { PrecedenceSimilarExpressionInContext } from "./HiveParser";
import { SubQueryExpressionContext } from "./HiveParser";
import { BooleanValueContext } from "./HiveParser";
import { BooleanValueTokContext } from "./HiveParser";
import { TableOrPartitionContext } from "./HiveParser";
import { PartitionSpecContext } from "./HiveParser";
import { PartitionValContext } from "./HiveParser";
import { DropPartitionSpecContext } from "./HiveParser";
import { DropPartitionValContext } from "./HiveParser";
import { DropPartitionOperatorContext } from "./HiveParser";
import { SysFuncNamesContext } from "./HiveParser";
import { DescFuncNamesContext } from "./HiveParser";
import { IdentifierContext } from "./HiveParser";
import { FunctionIdentifierContext } from "./HiveParser";
import { PrincipalIdentifierContext } from "./HiveParser";
import { NonReservedContext } from "./HiveParser";
import { Sql11ReservedKeywordsUsedAsFunctionNameContext } from "./HiveParser";


/**
 * This interface defines a complete listener for a parse tree produced by
 * `HiveParser`.
 */
export interface HiveParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by `HiveParser.statements`.
	 * @param ctx the parse tree
	 */
	enterStatements?: (ctx: StatementsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.statements`.
	 * @param ctx the parse tree
	 */
	exitStatements?: (ctx: StatementsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.statementSeparator`.
	 * @param ctx the parse tree
	 */
	enterStatementSeparator?: (ctx: StatementSeparatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.statementSeparator`.
	 * @param ctx the parse tree
	 */
	exitStatementSeparator?: (ctx: StatementSeparatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.statement`.
	 * @param ctx the parse tree
	 */
	enterStatement?: (ctx: StatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.statement`.
	 * @param ctx the parse tree
	 */
	exitStatement?: (ctx: StatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.explainStatement`.
	 * @param ctx the parse tree
	 */
	enterExplainStatement?: (ctx: ExplainStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.explainStatement`.
	 * @param ctx the parse tree
	 */
	exitExplainStatement?: (ctx: ExplainStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.explainOption`.
	 * @param ctx the parse tree
	 */
	enterExplainOption?: (ctx: ExplainOptionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.explainOption`.
	 * @param ctx the parse tree
	 */
	exitExplainOption?: (ctx: ExplainOptionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.vectorizationOnly`.
	 * @param ctx the parse tree
	 */
	enterVectorizationOnly?: (ctx: VectorizationOnlyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.vectorizationOnly`.
	 * @param ctx the parse tree
	 */
	exitVectorizationOnly?: (ctx: VectorizationOnlyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.vectorizatonDetail`.
	 * @param ctx the parse tree
	 */
	enterVectorizatonDetail?: (ctx: VectorizatonDetailContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.vectorizatonDetail`.
	 * @param ctx the parse tree
	 */
	exitVectorizatonDetail?: (ctx: VectorizatonDetailContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.execStatement`.
	 * @param ctx the parse tree
	 */
	enterExecStatement?: (ctx: ExecStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.execStatement`.
	 * @param ctx the parse tree
	 */
	exitExecStatement?: (ctx: ExecStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.loadStatement`.
	 * @param ctx the parse tree
	 */
	enterLoadStatement?: (ctx: LoadStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.loadStatement`.
	 * @param ctx the parse tree
	 */
	exitLoadStatement?: (ctx: LoadStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replicationClause`.
	 * @param ctx the parse tree
	 */
	enterReplicationClause?: (ctx: ReplicationClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replicationClause`.
	 * @param ctx the parse tree
	 */
	exitReplicationClause?: (ctx: ReplicationClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.exportStatement`.
	 * @param ctx the parse tree
	 */
	enterExportStatement?: (ctx: ExportStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.exportStatement`.
	 * @param ctx the parse tree
	 */
	exitExportStatement?: (ctx: ExportStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.importStatement`.
	 * @param ctx the parse tree
	 */
	enterImportStatement?: (ctx: ImportStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.importStatement`.
	 * @param ctx the parse tree
	 */
	exitImportStatement?: (ctx: ImportStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replDumpStatement`.
	 * @param ctx the parse tree
	 */
	enterReplDumpStatement?: (ctx: ReplDumpStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replDumpStatement`.
	 * @param ctx the parse tree
	 */
	exitReplDumpStatement?: (ctx: ReplDumpStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replLoadStatement`.
	 * @param ctx the parse tree
	 */
	enterReplLoadStatement?: (ctx: ReplLoadStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replLoadStatement`.
	 * @param ctx the parse tree
	 */
	exitReplLoadStatement?: (ctx: ReplLoadStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replConfigs`.
	 * @param ctx the parse tree
	 */
	enterReplConfigs?: (ctx: ReplConfigsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replConfigs`.
	 * @param ctx the parse tree
	 */
	exitReplConfigs?: (ctx: ReplConfigsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replConfigsList`.
	 * @param ctx the parse tree
	 */
	enterReplConfigsList?: (ctx: ReplConfigsListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replConfigsList`.
	 * @param ctx the parse tree
	 */
	exitReplConfigsList?: (ctx: ReplConfigsListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.replStatusStatement`.
	 * @param ctx the parse tree
	 */
	enterReplStatusStatement?: (ctx: ReplStatusStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.replStatusStatement`.
	 * @param ctx the parse tree
	 */
	exitReplStatusStatement?: (ctx: ReplStatusStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.ddlStatement`.
	 * @param ctx the parse tree
	 */
	enterDdlStatement?: (ctx: DdlStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.ddlStatement`.
	 * @param ctx the parse tree
	 */
	exitDdlStatement?: (ctx: DdlStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.ifExists`.
	 * @param ctx the parse tree
	 */
	enterIfExists?: (ctx: IfExistsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.ifExists`.
	 * @param ctx the parse tree
	 */
	exitIfExists?: (ctx: IfExistsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.restrictOrCascade`.
	 * @param ctx the parse tree
	 */
	enterRestrictOrCascade?: (ctx: RestrictOrCascadeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.restrictOrCascade`.
	 * @param ctx the parse tree
	 */
	exitRestrictOrCascade?: (ctx: RestrictOrCascadeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.ifNotExists`.
	 * @param ctx the parse tree
	 */
	enterIfNotExists?: (ctx: IfNotExistsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.ifNotExists`.
	 * @param ctx the parse tree
	 */
	exitIfNotExists?: (ctx: IfNotExistsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rewriteEnabled`.
	 * @param ctx the parse tree
	 */
	enterRewriteEnabled?: (ctx: RewriteEnabledContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rewriteEnabled`.
	 * @param ctx the parse tree
	 */
	exitRewriteEnabled?: (ctx: RewriteEnabledContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rewriteDisabled`.
	 * @param ctx the parse tree
	 */
	enterRewriteDisabled?: (ctx: RewriteDisabledContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rewriteDisabled`.
	 * @param ctx the parse tree
	 */
	exitRewriteDisabled?: (ctx: RewriteDisabledContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.storedAsDirs`.
	 * @param ctx the parse tree
	 */
	enterStoredAsDirs?: (ctx: StoredAsDirsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.storedAsDirs`.
	 * @param ctx the parse tree
	 */
	exitStoredAsDirs?: (ctx: StoredAsDirsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.orReplace`.
	 * @param ctx the parse tree
	 */
	enterOrReplace?: (ctx: OrReplaceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.orReplace`.
	 * @param ctx the parse tree
	 */
	exitOrReplace?: (ctx: OrReplaceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateDatabaseStatement?: (ctx: CreateDatabaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateDatabaseStatement?: (ctx: CreateDatabaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dbLocation`.
	 * @param ctx the parse tree
	 */
	enterDbLocation?: (ctx: DbLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dbLocation`.
	 * @param ctx the parse tree
	 */
	exitDbLocation?: (ctx: DbLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dbProperties`.
	 * @param ctx the parse tree
	 */
	enterDbProperties?: (ctx: DbPropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dbProperties`.
	 * @param ctx the parse tree
	 */
	exitDbProperties?: (ctx: DbPropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dbPropertiesList`.
	 * @param ctx the parse tree
	 */
	enterDbPropertiesList?: (ctx: DbPropertiesListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dbPropertiesList`.
	 * @param ctx the parse tree
	 */
	exitDbPropertiesList?: (ctx: DbPropertiesListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.switchDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	enterSwitchDatabaseStatement?: (ctx: SwitchDatabaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.switchDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	exitSwitchDatabaseStatement?: (ctx: SwitchDatabaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	enterDropDatabaseStatement?: (ctx: DropDatabaseStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropDatabaseStatement`.
	 * @param ctx the parse tree
	 */
	exitDropDatabaseStatement?: (ctx: DropDatabaseStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.databaseComment`.
	 * @param ctx the parse tree
	 */
	enterDatabaseComment?: (ctx: DatabaseCommentContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.databaseComment`.
	 * @param ctx the parse tree
	 */
	exitDatabaseComment?: (ctx: DatabaseCommentContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createTableStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateTableStatement?: (ctx: CreateTableStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createTableStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateTableStatement?: (ctx: CreateTableStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.truncateTableStatement`.
	 * @param ctx the parse tree
	 */
	enterTruncateTableStatement?: (ctx: TruncateTableStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.truncateTableStatement`.
	 * @param ctx the parse tree
	 */
	exitTruncateTableStatement?: (ctx: TruncateTableStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropTableStatement`.
	 * @param ctx the parse tree
	 */
	enterDropTableStatement?: (ctx: DropTableStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropTableStatement`.
	 * @param ctx the parse tree
	 */
	exitDropTableStatement?: (ctx: DropTableStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatement`.
	 * @param ctx the parse tree
	 */
	enterAlterStatement?: (ctx: AlterStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatement`.
	 * @param ctx the parse tree
	 */
	exitAlterStatement?: (ctx: AlterStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterTableStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterTableStatementSuffix?: (ctx: AlterTableStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterTableStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterTableStatementSuffix?: (ctx: AlterTableStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterTblPartitionStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterTblPartitionStatementSuffix?: (ctx: AlterTblPartitionStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterTblPartitionStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterTblPartitionStatementSuffix?: (ctx: AlterTblPartitionStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementPartitionKeyType`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementPartitionKeyType?: (ctx: AlterStatementPartitionKeyTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementPartitionKeyType`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementPartitionKeyType?: (ctx: AlterStatementPartitionKeyTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterViewStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterViewStatementSuffix?: (ctx: AlterViewStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterViewStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterViewStatementSuffix?: (ctx: AlterViewStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterMaterializedViewStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterMaterializedViewStatementSuffix?: (ctx: AlterMaterializedViewStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterMaterializedViewStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterMaterializedViewStatementSuffix?: (ctx: AlterMaterializedViewStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterDatabaseStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterDatabaseStatementSuffix?: (ctx: AlterDatabaseStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterDatabaseStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterDatabaseStatementSuffix?: (ctx: AlterDatabaseStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterDatabaseSuffixProperties`.
	 * @param ctx the parse tree
	 */
	enterAlterDatabaseSuffixProperties?: (ctx: AlterDatabaseSuffixPropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterDatabaseSuffixProperties`.
	 * @param ctx the parse tree
	 */
	exitAlterDatabaseSuffixProperties?: (ctx: AlterDatabaseSuffixPropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterDatabaseSuffixSetOwner`.
	 * @param ctx the parse tree
	 */
	enterAlterDatabaseSuffixSetOwner?: (ctx: AlterDatabaseSuffixSetOwnerContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterDatabaseSuffixSetOwner`.
	 * @param ctx the parse tree
	 */
	exitAlterDatabaseSuffixSetOwner?: (ctx: AlterDatabaseSuffixSetOwnerContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterDatabaseSuffixSetLocation`.
	 * @param ctx the parse tree
	 */
	enterAlterDatabaseSuffixSetLocation?: (ctx: AlterDatabaseSuffixSetLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterDatabaseSuffixSetLocation`.
	 * @param ctx the parse tree
	 */
	exitAlterDatabaseSuffixSetLocation?: (ctx: AlterDatabaseSuffixSetLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixRename`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixRename?: (ctx: AlterStatementSuffixRenameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixRename`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixRename?: (ctx: AlterStatementSuffixRenameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixAddCol`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixAddCol?: (ctx: AlterStatementSuffixAddColContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixAddCol`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixAddCol?: (ctx: AlterStatementSuffixAddColContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixAddConstraint`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixAddConstraint?: (ctx: AlterStatementSuffixAddConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixAddConstraint`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixAddConstraint?: (ctx: AlterStatementSuffixAddConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixDropConstraint`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixDropConstraint?: (ctx: AlterStatementSuffixDropConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixDropConstraint`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixDropConstraint?: (ctx: AlterStatementSuffixDropConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixRenameCol`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixRenameCol?: (ctx: AlterStatementSuffixRenameColContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixRenameCol`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixRenameCol?: (ctx: AlterStatementSuffixRenameColContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixUpdateStatsCol`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixUpdateStatsCol?: (ctx: AlterStatementSuffixUpdateStatsColContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixUpdateStatsCol`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixUpdateStatsCol?: (ctx: AlterStatementSuffixUpdateStatsColContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixUpdateStats`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixUpdateStats?: (ctx: AlterStatementSuffixUpdateStatsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixUpdateStats`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixUpdateStats?: (ctx: AlterStatementSuffixUpdateStatsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementChangeColPosition`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementChangeColPosition?: (ctx: AlterStatementChangeColPositionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementChangeColPosition`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementChangeColPosition?: (ctx: AlterStatementChangeColPositionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixAddPartitions`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixAddPartitions?: (ctx: AlterStatementSuffixAddPartitionsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixAddPartitions`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixAddPartitions?: (ctx: AlterStatementSuffixAddPartitionsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixAddPartitionsElement`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixAddPartitionsElement?: (ctx: AlterStatementSuffixAddPartitionsElementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixAddPartitionsElement`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixAddPartitionsElement?: (ctx: AlterStatementSuffixAddPartitionsElementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixTouch`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixTouch?: (ctx: AlterStatementSuffixTouchContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixTouch`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixTouch?: (ctx: AlterStatementSuffixTouchContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixArchive`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixArchive?: (ctx: AlterStatementSuffixArchiveContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixArchive`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixArchive?: (ctx: AlterStatementSuffixArchiveContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixUnArchive`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixUnArchive?: (ctx: AlterStatementSuffixUnArchiveContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixUnArchive`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixUnArchive?: (ctx: AlterStatementSuffixUnArchiveContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionLocation`.
	 * @param ctx the parse tree
	 */
	enterPartitionLocation?: (ctx: PartitionLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionLocation`.
	 * @param ctx the parse tree
	 */
	exitPartitionLocation?: (ctx: PartitionLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixDropPartitions`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixDropPartitions?: (ctx: AlterStatementSuffixDropPartitionsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixDropPartitions`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixDropPartitions?: (ctx: AlterStatementSuffixDropPartitionsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixProperties`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixProperties?: (ctx: AlterStatementSuffixPropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixProperties`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixProperties?: (ctx: AlterStatementSuffixPropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterViewSuffixProperties`.
	 * @param ctx the parse tree
	 */
	enterAlterViewSuffixProperties?: (ctx: AlterViewSuffixPropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterViewSuffixProperties`.
	 * @param ctx the parse tree
	 */
	exitAlterViewSuffixProperties?: (ctx: AlterViewSuffixPropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterMaterializedViewSuffixRewrite`.
	 * @param ctx the parse tree
	 */
	enterAlterMaterializedViewSuffixRewrite?: (ctx: AlterMaterializedViewSuffixRewriteContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterMaterializedViewSuffixRewrite`.
	 * @param ctx the parse tree
	 */
	exitAlterMaterializedViewSuffixRewrite?: (ctx: AlterMaterializedViewSuffixRewriteContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterMaterializedViewSuffixRebuild`.
	 * @param ctx the parse tree
	 */
	enterAlterMaterializedViewSuffixRebuild?: (ctx: AlterMaterializedViewSuffixRebuildContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterMaterializedViewSuffixRebuild`.
	 * @param ctx the parse tree
	 */
	exitAlterMaterializedViewSuffixRebuild?: (ctx: AlterMaterializedViewSuffixRebuildContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixSerdeProperties`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixSerdeProperties?: (ctx: AlterStatementSuffixSerdePropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixSerdeProperties`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixSerdeProperties?: (ctx: AlterStatementSuffixSerdePropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterIndexStatementSuffix`.
	 * @param ctx the parse tree
	 */
	enterAlterIndexStatementSuffix?: (ctx: AlterIndexStatementSuffixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterIndexStatementSuffix`.
	 * @param ctx the parse tree
	 */
	exitAlterIndexStatementSuffix?: (ctx: AlterIndexStatementSuffixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixFileFormat`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixFileFormat?: (ctx: AlterStatementSuffixFileFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixFileFormat`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixFileFormat?: (ctx: AlterStatementSuffixFileFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixClusterbySortby`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixClusterbySortby?: (ctx: AlterStatementSuffixClusterbySortbyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixClusterbySortby`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixClusterbySortby?: (ctx: AlterStatementSuffixClusterbySortbyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterTblPartitionStatementSuffixSkewedLocation`.
	 * @param ctx the parse tree
	 */
	enterAlterTblPartitionStatementSuffixSkewedLocation?: (ctx: AlterTblPartitionStatementSuffixSkewedLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterTblPartitionStatementSuffixSkewedLocation`.
	 * @param ctx the parse tree
	 */
	exitAlterTblPartitionStatementSuffixSkewedLocation?: (ctx: AlterTblPartitionStatementSuffixSkewedLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedLocations`.
	 * @param ctx the parse tree
	 */
	enterSkewedLocations?: (ctx: SkewedLocationsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedLocations`.
	 * @param ctx the parse tree
	 */
	exitSkewedLocations?: (ctx: SkewedLocationsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedLocationsList`.
	 * @param ctx the parse tree
	 */
	enterSkewedLocationsList?: (ctx: SkewedLocationsListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedLocationsList`.
	 * @param ctx the parse tree
	 */
	exitSkewedLocationsList?: (ctx: SkewedLocationsListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedLocationMap`.
	 * @param ctx the parse tree
	 */
	enterSkewedLocationMap?: (ctx: SkewedLocationMapContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedLocationMap`.
	 * @param ctx the parse tree
	 */
	exitSkewedLocationMap?: (ctx: SkewedLocationMapContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixLocation`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixLocation?: (ctx: AlterStatementSuffixLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixLocation`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixLocation?: (ctx: AlterStatementSuffixLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixSkewedby`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixSkewedby?: (ctx: AlterStatementSuffixSkewedbyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixSkewedby`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixSkewedby?: (ctx: AlterStatementSuffixSkewedbyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixExchangePartition`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixExchangePartition?: (ctx: AlterStatementSuffixExchangePartitionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixExchangePartition`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixExchangePartition?: (ctx: AlterStatementSuffixExchangePartitionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixRenamePart`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixRenamePart?: (ctx: AlterStatementSuffixRenamePartContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixRenamePart`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixRenamePart?: (ctx: AlterStatementSuffixRenamePartContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixStatsPart`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixStatsPart?: (ctx: AlterStatementSuffixStatsPartContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixStatsPart`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixStatsPart?: (ctx: AlterStatementSuffixStatsPartContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixMergeFiles`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixMergeFiles?: (ctx: AlterStatementSuffixMergeFilesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixMergeFiles`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixMergeFiles?: (ctx: AlterStatementSuffixMergeFilesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixBucketNum`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixBucketNum?: (ctx: AlterStatementSuffixBucketNumContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixBucketNum`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixBucketNum?: (ctx: AlterStatementSuffixBucketNumContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createIndexStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateIndexStatement?: (ctx: CreateIndexStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createIndexStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateIndexStatement?: (ctx: CreateIndexStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.locationPath`.
	 * @param ctx the parse tree
	 */
	enterLocationPath?: (ctx: LocationPathContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.locationPath`.
	 * @param ctx the parse tree
	 */
	exitLocationPath?: (ctx: LocationPathContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropIndexStatement`.
	 * @param ctx the parse tree
	 */
	enterDropIndexStatement?: (ctx: DropIndexStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropIndexStatement`.
	 * @param ctx the parse tree
	 */
	exitDropIndexStatement?: (ctx: DropIndexStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tablePartitionPrefix`.
	 * @param ctx the parse tree
	 */
	enterTablePartitionPrefix?: (ctx: TablePartitionPrefixContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tablePartitionPrefix`.
	 * @param ctx the parse tree
	 */
	exitTablePartitionPrefix?: (ctx: TablePartitionPrefixContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.blocking`.
	 * @param ctx the parse tree
	 */
	enterBlocking?: (ctx: BlockingContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.blocking`.
	 * @param ctx the parse tree
	 */
	exitBlocking?: (ctx: BlockingContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixCompact`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixCompact?: (ctx: AlterStatementSuffixCompactContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixCompact`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixCompact?: (ctx: AlterStatementSuffixCompactContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterStatementSuffixSetOwner`.
	 * @param ctx the parse tree
	 */
	enterAlterStatementSuffixSetOwner?: (ctx: AlterStatementSuffixSetOwnerContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterStatementSuffixSetOwner`.
	 * @param ctx the parse tree
	 */
	exitAlterStatementSuffixSetOwner?: (ctx: AlterStatementSuffixSetOwnerContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.fileFormat`.
	 * @param ctx the parse tree
	 */
	enterFileFormat?: (ctx: FileFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.fileFormat`.
	 * @param ctx the parse tree
	 */
	exitFileFormat?: (ctx: FileFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.inputFileFormat`.
	 * @param ctx the parse tree
	 */
	enterInputFileFormat?: (ctx: InputFileFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.inputFileFormat`.
	 * @param ctx the parse tree
	 */
	exitInputFileFormat?: (ctx: InputFileFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tabTypeExpr`.
	 * @param ctx the parse tree
	 */
	enterTabTypeExpr?: (ctx: TabTypeExprContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tabTypeExpr`.
	 * @param ctx the parse tree
	 */
	exitTabTypeExpr?: (ctx: TabTypeExprContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partTypeExpr`.
	 * @param ctx the parse tree
	 */
	enterPartTypeExpr?: (ctx: PartTypeExprContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partTypeExpr`.
	 * @param ctx the parse tree
	 */
	exitPartTypeExpr?: (ctx: PartTypeExprContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tabPartColTypeExpr`.
	 * @param ctx the parse tree
	 */
	enterTabPartColTypeExpr?: (ctx: TabPartColTypeExprContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tabPartColTypeExpr`.
	 * @param ctx the parse tree
	 */
	exitTabPartColTypeExpr?: (ctx: TabPartColTypeExprContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.descStatement`.
	 * @param ctx the parse tree
	 */
	enterDescStatement?: (ctx: DescStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.descStatement`.
	 * @param ctx the parse tree
	 */
	exitDescStatement?: (ctx: DescStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.analyzeStatement`.
	 * @param ctx the parse tree
	 */
	enterAnalyzeStatement?: (ctx: AnalyzeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.analyzeStatement`.
	 * @param ctx the parse tree
	 */
	exitAnalyzeStatement?: (ctx: AnalyzeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showStatement`.
	 * @param ctx the parse tree
	 */
	enterShowStatement?: (ctx: ShowStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showStatement`.
	 * @param ctx the parse tree
	 */
	exitShowStatement?: (ctx: ShowStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.lockStatement`.
	 * @param ctx the parse tree
	 */
	enterLockStatement?: (ctx: LockStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.lockStatement`.
	 * @param ctx the parse tree
	 */
	exitLockStatement?: (ctx: LockStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.lockDatabase`.
	 * @param ctx the parse tree
	 */
	enterLockDatabase?: (ctx: LockDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.lockDatabase`.
	 * @param ctx the parse tree
	 */
	exitLockDatabase?: (ctx: LockDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.lockMode`.
	 * @param ctx the parse tree
	 */
	enterLockMode?: (ctx: LockModeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.lockMode`.
	 * @param ctx the parse tree
	 */
	exitLockMode?: (ctx: LockModeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.unlockStatement`.
	 * @param ctx the parse tree
	 */
	enterUnlockStatement?: (ctx: UnlockStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.unlockStatement`.
	 * @param ctx the parse tree
	 */
	exitUnlockStatement?: (ctx: UnlockStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.unlockDatabase`.
	 * @param ctx the parse tree
	 */
	enterUnlockDatabase?: (ctx: UnlockDatabaseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.unlockDatabase`.
	 * @param ctx the parse tree
	 */
	exitUnlockDatabase?: (ctx: UnlockDatabaseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createRoleStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateRoleStatement?: (ctx: CreateRoleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createRoleStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateRoleStatement?: (ctx: CreateRoleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropRoleStatement`.
	 * @param ctx the parse tree
	 */
	enterDropRoleStatement?: (ctx: DropRoleStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropRoleStatement`.
	 * @param ctx the parse tree
	 */
	exitDropRoleStatement?: (ctx: DropRoleStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.grantPrivileges`.
	 * @param ctx the parse tree
	 */
	enterGrantPrivileges?: (ctx: GrantPrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.grantPrivileges`.
	 * @param ctx the parse tree
	 */
	exitGrantPrivileges?: (ctx: GrantPrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.revokePrivileges`.
	 * @param ctx the parse tree
	 */
	enterRevokePrivileges?: (ctx: RevokePrivilegesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.revokePrivileges`.
	 * @param ctx the parse tree
	 */
	exitRevokePrivileges?: (ctx: RevokePrivilegesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.grantRole`.
	 * @param ctx the parse tree
	 */
	enterGrantRole?: (ctx: GrantRoleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.grantRole`.
	 * @param ctx the parse tree
	 */
	exitGrantRole?: (ctx: GrantRoleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.revokeRole`.
	 * @param ctx the parse tree
	 */
	enterRevokeRole?: (ctx: RevokeRoleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.revokeRole`.
	 * @param ctx the parse tree
	 */
	exitRevokeRole?: (ctx: RevokeRoleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showRoleGrants`.
	 * @param ctx the parse tree
	 */
	enterShowRoleGrants?: (ctx: ShowRoleGrantsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showRoleGrants`.
	 * @param ctx the parse tree
	 */
	exitShowRoleGrants?: (ctx: ShowRoleGrantsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showRoles`.
	 * @param ctx the parse tree
	 */
	enterShowRoles?: (ctx: ShowRolesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showRoles`.
	 * @param ctx the parse tree
	 */
	exitShowRoles?: (ctx: ShowRolesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showCurrentRole`.
	 * @param ctx the parse tree
	 */
	enterShowCurrentRole?: (ctx: ShowCurrentRoleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showCurrentRole`.
	 * @param ctx the parse tree
	 */
	exitShowCurrentRole?: (ctx: ShowCurrentRoleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.setRole`.
	 * @param ctx the parse tree
	 */
	enterSetRole?: (ctx: SetRoleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.setRole`.
	 * @param ctx the parse tree
	 */
	exitSetRole?: (ctx: SetRoleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showGrants`.
	 * @param ctx the parse tree
	 */
	enterShowGrants?: (ctx: ShowGrantsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showGrants`.
	 * @param ctx the parse tree
	 */
	exitShowGrants?: (ctx: ShowGrantsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showRolePrincipals`.
	 * @param ctx the parse tree
	 */
	enterShowRolePrincipals?: (ctx: ShowRolePrincipalsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showRolePrincipals`.
	 * @param ctx the parse tree
	 */
	exitShowRolePrincipals?: (ctx: ShowRolePrincipalsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privilegeIncludeColObject`.
	 * @param ctx the parse tree
	 */
	enterPrivilegeIncludeColObject?: (ctx: PrivilegeIncludeColObjectContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privilegeIncludeColObject`.
	 * @param ctx the parse tree
	 */
	exitPrivilegeIncludeColObject?: (ctx: PrivilegeIncludeColObjectContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privilegeObject`.
	 * @param ctx the parse tree
	 */
	enterPrivilegeObject?: (ctx: PrivilegeObjectContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privilegeObject`.
	 * @param ctx the parse tree
	 */
	exitPrivilegeObject?: (ctx: PrivilegeObjectContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privObject`.
	 * @param ctx the parse tree
	 */
	enterPrivObject?: (ctx: PrivObjectContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privObject`.
	 * @param ctx the parse tree
	 */
	exitPrivObject?: (ctx: PrivObjectContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privObjectCols`.
	 * @param ctx the parse tree
	 */
	enterPrivObjectCols?: (ctx: PrivObjectColsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privObjectCols`.
	 * @param ctx the parse tree
	 */
	exitPrivObjectCols?: (ctx: PrivObjectColsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privilegeList`.
	 * @param ctx the parse tree
	 */
	enterPrivilegeList?: (ctx: PrivilegeListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privilegeList`.
	 * @param ctx the parse tree
	 */
	exitPrivilegeList?: (ctx: PrivilegeListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privlegeDef`.
	 * @param ctx the parse tree
	 */
	enterPrivlegeDef?: (ctx: PrivlegeDefContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privlegeDef`.
	 * @param ctx the parse tree
	 */
	exitPrivlegeDef?: (ctx: PrivlegeDefContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.privilegeType`.
	 * @param ctx the parse tree
	 */
	enterPrivilegeType?: (ctx: PrivilegeTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.privilegeType`.
	 * @param ctx the parse tree
	 */
	exitPrivilegeType?: (ctx: PrivilegeTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.principalSpecification`.
	 * @param ctx the parse tree
	 */
	enterPrincipalSpecification?: (ctx: PrincipalSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.principalSpecification`.
	 * @param ctx the parse tree
	 */
	exitPrincipalSpecification?: (ctx: PrincipalSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.principalName`.
	 * @param ctx the parse tree
	 */
	enterPrincipalName?: (ctx: PrincipalNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.principalName`.
	 * @param ctx the parse tree
	 */
	exitPrincipalName?: (ctx: PrincipalNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.withGrantOption`.
	 * @param ctx the parse tree
	 */
	enterWithGrantOption?: (ctx: WithGrantOptionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.withGrantOption`.
	 * @param ctx the parse tree
	 */
	exitWithGrantOption?: (ctx: WithGrantOptionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.grantOptionFor`.
	 * @param ctx the parse tree
	 */
	enterGrantOptionFor?: (ctx: GrantOptionForContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.grantOptionFor`.
	 * @param ctx the parse tree
	 */
	exitGrantOptionFor?: (ctx: GrantOptionForContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.adminOptionFor`.
	 * @param ctx the parse tree
	 */
	enterAdminOptionFor?: (ctx: AdminOptionForContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.adminOptionFor`.
	 * @param ctx the parse tree
	 */
	exitAdminOptionFor?: (ctx: AdminOptionForContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.withAdminOption`.
	 * @param ctx the parse tree
	 */
	enterWithAdminOption?: (ctx: WithAdminOptionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.withAdminOption`.
	 * @param ctx the parse tree
	 */
	exitWithAdminOption?: (ctx: WithAdminOptionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.metastoreCheck`.
	 * @param ctx the parse tree
	 */
	enterMetastoreCheck?: (ctx: MetastoreCheckContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.metastoreCheck`.
	 * @param ctx the parse tree
	 */
	exitMetastoreCheck?: (ctx: MetastoreCheckContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.resourceList`.
	 * @param ctx the parse tree
	 */
	enterResourceList?: (ctx: ResourceListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.resourceList`.
	 * @param ctx the parse tree
	 */
	exitResourceList?: (ctx: ResourceListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.resource`.
	 * @param ctx the parse tree
	 */
	enterResource?: (ctx: ResourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.resource`.
	 * @param ctx the parse tree
	 */
	exitResource?: (ctx: ResourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.resourceType`.
	 * @param ctx the parse tree
	 */
	enterResourceType?: (ctx: ResourceTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.resourceType`.
	 * @param ctx the parse tree
	 */
	exitResourceType?: (ctx: ResourceTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createFunctionStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateFunctionStatement?: (ctx: CreateFunctionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createFunctionStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateFunctionStatement?: (ctx: CreateFunctionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropFunctionStatement`.
	 * @param ctx the parse tree
	 */
	enterDropFunctionStatement?: (ctx: DropFunctionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropFunctionStatement`.
	 * @param ctx the parse tree
	 */
	exitDropFunctionStatement?: (ctx: DropFunctionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.reloadFunctionStatement`.
	 * @param ctx the parse tree
	 */
	enterReloadFunctionStatement?: (ctx: ReloadFunctionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.reloadFunctionStatement`.
	 * @param ctx the parse tree
	 */
	exitReloadFunctionStatement?: (ctx: ReloadFunctionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createMacroStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateMacroStatement?: (ctx: CreateMacroStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createMacroStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateMacroStatement?: (ctx: CreateMacroStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropMacroStatement`.
	 * @param ctx the parse tree
	 */
	enterDropMacroStatement?: (ctx: DropMacroStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropMacroStatement`.
	 * @param ctx the parse tree
	 */
	exitDropMacroStatement?: (ctx: DropMacroStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createViewStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateViewStatement?: (ctx: CreateViewStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createViewStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateViewStatement?: (ctx: CreateViewStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createMaterializedViewStatement`.
	 * @param ctx the parse tree
	 */
	enterCreateMaterializedViewStatement?: (ctx: CreateMaterializedViewStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createMaterializedViewStatement`.
	 * @param ctx the parse tree
	 */
	exitCreateMaterializedViewStatement?: (ctx: CreateMaterializedViewStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.viewPartition`.
	 * @param ctx the parse tree
	 */
	enterViewPartition?: (ctx: ViewPartitionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.viewPartition`.
	 * @param ctx the parse tree
	 */
	exitViewPartition?: (ctx: ViewPartitionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropViewStatement`.
	 * @param ctx the parse tree
	 */
	enterDropViewStatement?: (ctx: DropViewStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropViewStatement`.
	 * @param ctx the parse tree
	 */
	exitDropViewStatement?: (ctx: DropViewStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropMaterializedViewStatement`.
	 * @param ctx the parse tree
	 */
	enterDropMaterializedViewStatement?: (ctx: DropMaterializedViewStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropMaterializedViewStatement`.
	 * @param ctx the parse tree
	 */
	exitDropMaterializedViewStatement?: (ctx: DropMaterializedViewStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showFunctionIdentifier`.
	 * @param ctx the parse tree
	 */
	enterShowFunctionIdentifier?: (ctx: ShowFunctionIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showFunctionIdentifier`.
	 * @param ctx the parse tree
	 */
	exitShowFunctionIdentifier?: (ctx: ShowFunctionIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.showStmtIdentifier`.
	 * @param ctx the parse tree
	 */
	enterShowStmtIdentifier?: (ctx: ShowStmtIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.showStmtIdentifier`.
	 * @param ctx the parse tree
	 */
	exitShowStmtIdentifier?: (ctx: ShowStmtIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableComment`.
	 * @param ctx the parse tree
	 */
	enterTableComment?: (ctx: TableCommentContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableComment`.
	 * @param ctx the parse tree
	 */
	exitTableComment?: (ctx: TableCommentContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tablePartition`.
	 * @param ctx the parse tree
	 */
	enterTablePartition?: (ctx: TablePartitionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tablePartition`.
	 * @param ctx the parse tree
	 */
	exitTablePartition?: (ctx: TablePartitionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableBuckets`.
	 * @param ctx the parse tree
	 */
	enterTableBuckets?: (ctx: TableBucketsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableBuckets`.
	 * @param ctx the parse tree
	 */
	exitTableBuckets?: (ctx: TableBucketsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableSkewed`.
	 * @param ctx the parse tree
	 */
	enterTableSkewed?: (ctx: TableSkewedContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableSkewed`.
	 * @param ctx the parse tree
	 */
	exitTableSkewed?: (ctx: TableSkewedContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rowFormat`.
	 * @param ctx the parse tree
	 */
	enterRowFormat?: (ctx: RowFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rowFormat`.
	 * @param ctx the parse tree
	 */
	exitRowFormat?: (ctx: RowFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.recordReader`.
	 * @param ctx the parse tree
	 */
	enterRecordReader?: (ctx: RecordReaderContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.recordReader`.
	 * @param ctx the parse tree
	 */
	exitRecordReader?: (ctx: RecordReaderContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.recordWriter`.
	 * @param ctx the parse tree
	 */
	enterRecordWriter?: (ctx: RecordWriterContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.recordWriter`.
	 * @param ctx the parse tree
	 */
	exitRecordWriter?: (ctx: RecordWriterContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rowFormatSerde`.
	 * @param ctx the parse tree
	 */
	enterRowFormatSerde?: (ctx: RowFormatSerdeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rowFormatSerde`.
	 * @param ctx the parse tree
	 */
	exitRowFormatSerde?: (ctx: RowFormatSerdeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rowFormatDelimited`.
	 * @param ctx the parse tree
	 */
	enterRowFormatDelimited?: (ctx: RowFormatDelimitedContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rowFormatDelimited`.
	 * @param ctx the parse tree
	 */
	exitRowFormatDelimited?: (ctx: RowFormatDelimitedContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowFormat`.
	 * @param ctx the parse tree
	 */
	enterTableRowFormat?: (ctx: TableRowFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowFormat`.
	 * @param ctx the parse tree
	 */
	exitTableRowFormat?: (ctx: TableRowFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tablePropertiesPrefixed`.
	 * @param ctx the parse tree
	 */
	enterTablePropertiesPrefixed?: (ctx: TablePropertiesPrefixedContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tablePropertiesPrefixed`.
	 * @param ctx the parse tree
	 */
	exitTablePropertiesPrefixed?: (ctx: TablePropertiesPrefixedContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableProperties`.
	 * @param ctx the parse tree
	 */
	enterTableProperties?: (ctx: TablePropertiesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableProperties`.
	 * @param ctx the parse tree
	 */
	exitTableProperties?: (ctx: TablePropertiesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tablePropertiesList`.
	 * @param ctx the parse tree
	 */
	enterTablePropertiesList?: (ctx: TablePropertiesListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tablePropertiesList`.
	 * @param ctx the parse tree
	 */
	exitTablePropertiesList?: (ctx: TablePropertiesListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.keyValueProperty`.
	 * @param ctx the parse tree
	 */
	enterKeyValueProperty?: (ctx: KeyValuePropertyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.keyValueProperty`.
	 * @param ctx the parse tree
	 */
	exitKeyValueProperty?: (ctx: KeyValuePropertyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.keyProperty`.
	 * @param ctx the parse tree
	 */
	enterKeyProperty?: (ctx: KeyPropertyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.keyProperty`.
	 * @param ctx the parse tree
	 */
	exitKeyProperty?: (ctx: KeyPropertyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowFormatFieldIdentifier`.
	 * @param ctx the parse tree
	 */
	enterTableRowFormatFieldIdentifier?: (ctx: TableRowFormatFieldIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowFormatFieldIdentifier`.
	 * @param ctx the parse tree
	 */
	exitTableRowFormatFieldIdentifier?: (ctx: TableRowFormatFieldIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowFormatCollItemsIdentifier`.
	 * @param ctx the parse tree
	 */
	enterTableRowFormatCollItemsIdentifier?: (ctx: TableRowFormatCollItemsIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowFormatCollItemsIdentifier`.
	 * @param ctx the parse tree
	 */
	exitTableRowFormatCollItemsIdentifier?: (ctx: TableRowFormatCollItemsIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowFormatMapKeysIdentifier`.
	 * @param ctx the parse tree
	 */
	enterTableRowFormatMapKeysIdentifier?: (ctx: TableRowFormatMapKeysIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowFormatMapKeysIdentifier`.
	 * @param ctx the parse tree
	 */
	exitTableRowFormatMapKeysIdentifier?: (ctx: TableRowFormatMapKeysIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowFormatLinesIdentifier`.
	 * @param ctx the parse tree
	 */
	enterTableRowFormatLinesIdentifier?: (ctx: TableRowFormatLinesIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowFormatLinesIdentifier`.
	 * @param ctx the parse tree
	 */
	exitTableRowFormatLinesIdentifier?: (ctx: TableRowFormatLinesIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableRowNullFormat`.
	 * @param ctx the parse tree
	 */
	enterTableRowNullFormat?: (ctx: TableRowNullFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableRowNullFormat`.
	 * @param ctx the parse tree
	 */
	exitTableRowNullFormat?: (ctx: TableRowNullFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableFileFormat`.
	 * @param ctx the parse tree
	 */
	enterTableFileFormat?: (ctx: TableFileFormatContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableFileFormat`.
	 * @param ctx the parse tree
	 */
	exitTableFileFormat?: (ctx: TableFileFormatContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableLocation`.
	 * @param ctx the parse tree
	 */
	enterTableLocation?: (ctx: TableLocationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableLocation`.
	 * @param ctx the parse tree
	 */
	exitTableLocation?: (ctx: TableLocationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameTypeList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameTypeList?: (ctx: ColumnNameTypeListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameTypeList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameTypeList?: (ctx: ColumnNameTypeListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameTypeOrConstraintList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameTypeOrConstraintList?: (ctx: ColumnNameTypeOrConstraintListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameTypeOrConstraintList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameTypeOrConstraintList?: (ctx: ColumnNameTypeOrConstraintListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameColonTypeList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameColonTypeList?: (ctx: ColumnNameColonTypeListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameColonTypeList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameColonTypeList?: (ctx: ColumnNameColonTypeListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameList?: (ctx: ColumnNameListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameList?: (ctx: ColumnNameListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnName`.
	 * @param ctx the parse tree
	 */
	enterColumnName?: (ctx: ColumnNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnName`.
	 * @param ctx the parse tree
	 */
	exitColumnName?: (ctx: ColumnNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.extColumnName`.
	 * @param ctx the parse tree
	 */
	enterExtColumnName?: (ctx: ExtColumnNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.extColumnName`.
	 * @param ctx the parse tree
	 */
	exitExtColumnName?: (ctx: ExtColumnNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameOrderList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameOrderList?: (ctx: ColumnNameOrderListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameOrderList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameOrderList?: (ctx: ColumnNameOrderListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnParenthesesList`.
	 * @param ctx the parse tree
	 */
	enterColumnParenthesesList?: (ctx: ColumnParenthesesListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnParenthesesList`.
	 * @param ctx the parse tree
	 */
	exitColumnParenthesesList?: (ctx: ColumnParenthesesListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.enableValidateSpecification`.
	 * @param ctx the parse tree
	 */
	enterEnableValidateSpecification?: (ctx: EnableValidateSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.enableValidateSpecification`.
	 * @param ctx the parse tree
	 */
	exitEnableValidateSpecification?: (ctx: EnableValidateSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.enableSpecification`.
	 * @param ctx the parse tree
	 */
	enterEnableSpecification?: (ctx: EnableSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.enableSpecification`.
	 * @param ctx the parse tree
	 */
	exitEnableSpecification?: (ctx: EnableSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.validateSpecification`.
	 * @param ctx the parse tree
	 */
	enterValidateSpecification?: (ctx: ValidateSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.validateSpecification`.
	 * @param ctx the parse tree
	 */
	exitValidateSpecification?: (ctx: ValidateSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.enforcedSpecification`.
	 * @param ctx the parse tree
	 */
	enterEnforcedSpecification?: (ctx: EnforcedSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.enforcedSpecification`.
	 * @param ctx the parse tree
	 */
	exitEnforcedSpecification?: (ctx: EnforcedSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.relySpecification`.
	 * @param ctx the parse tree
	 */
	enterRelySpecification?: (ctx: RelySpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.relySpecification`.
	 * @param ctx the parse tree
	 */
	exitRelySpecification?: (ctx: RelySpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createConstraint`.
	 * @param ctx the parse tree
	 */
	enterCreateConstraint?: (ctx: CreateConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createConstraint`.
	 * @param ctx the parse tree
	 */
	exitCreateConstraint?: (ctx: CreateConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterConstraintWithName`.
	 * @param ctx the parse tree
	 */
	enterAlterConstraintWithName?: (ctx: AlterConstraintWithNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterConstraintWithName`.
	 * @param ctx the parse tree
	 */
	exitAlterConstraintWithName?: (ctx: AlterConstraintWithNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.pkConstraint`.
	 * @param ctx the parse tree
	 */
	enterPkConstraint?: (ctx: PkConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.pkConstraint`.
	 * @param ctx the parse tree
	 */
	exitPkConstraint?: (ctx: PkConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.createForeignKey`.
	 * @param ctx the parse tree
	 */
	enterCreateForeignKey?: (ctx: CreateForeignKeyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.createForeignKey`.
	 * @param ctx the parse tree
	 */
	exitCreateForeignKey?: (ctx: CreateForeignKeyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterForeignKeyWithName`.
	 * @param ctx the parse tree
	 */
	enterAlterForeignKeyWithName?: (ctx: AlterForeignKeyWithNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterForeignKeyWithName`.
	 * @param ctx the parse tree
	 */
	exitAlterForeignKeyWithName?: (ctx: AlterForeignKeyWithNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedValueElement`.
	 * @param ctx the parse tree
	 */
	enterSkewedValueElement?: (ctx: SkewedValueElementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedValueElement`.
	 * @param ctx the parse tree
	 */
	exitSkewedValueElement?: (ctx: SkewedValueElementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedColumnValuePairList`.
	 * @param ctx the parse tree
	 */
	enterSkewedColumnValuePairList?: (ctx: SkewedColumnValuePairListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedColumnValuePairList`.
	 * @param ctx the parse tree
	 */
	exitSkewedColumnValuePairList?: (ctx: SkewedColumnValuePairListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedColumnValuePair`.
	 * @param ctx the parse tree
	 */
	enterSkewedColumnValuePair?: (ctx: SkewedColumnValuePairContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedColumnValuePair`.
	 * @param ctx the parse tree
	 */
	exitSkewedColumnValuePair?: (ctx: SkewedColumnValuePairContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedColumnValues`.
	 * @param ctx the parse tree
	 */
	enterSkewedColumnValues?: (ctx: SkewedColumnValuesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedColumnValues`.
	 * @param ctx the parse tree
	 */
	exitSkewedColumnValues?: (ctx: SkewedColumnValuesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedColumnValue`.
	 * @param ctx the parse tree
	 */
	enterSkewedColumnValue?: (ctx: SkewedColumnValueContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedColumnValue`.
	 * @param ctx the parse tree
	 */
	exitSkewedColumnValue?: (ctx: SkewedColumnValueContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.skewedValueLocationElement`.
	 * @param ctx the parse tree
	 */
	enterSkewedValueLocationElement?: (ctx: SkewedValueLocationElementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.skewedValueLocationElement`.
	 * @param ctx the parse tree
	 */
	exitSkewedValueLocationElement?: (ctx: SkewedValueLocationElementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.orderSpecification`.
	 * @param ctx the parse tree
	 */
	enterOrderSpecification?: (ctx: OrderSpecificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.orderSpecification`.
	 * @param ctx the parse tree
	 */
	exitOrderSpecification?: (ctx: OrderSpecificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.nullOrdering`.
	 * @param ctx the parse tree
	 */
	enterNullOrdering?: (ctx: NullOrderingContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.nullOrdering`.
	 * @param ctx the parse tree
	 */
	exitNullOrdering?: (ctx: NullOrderingContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameOrder`.
	 * @param ctx the parse tree
	 */
	enterColumnNameOrder?: (ctx: ColumnNameOrderContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameOrder`.
	 * @param ctx the parse tree
	 */
	exitColumnNameOrder?: (ctx: ColumnNameOrderContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameCommentList`.
	 * @param ctx the parse tree
	 */
	enterColumnNameCommentList?: (ctx: ColumnNameCommentListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameCommentList`.
	 * @param ctx the parse tree
	 */
	exitColumnNameCommentList?: (ctx: ColumnNameCommentListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameComment`.
	 * @param ctx the parse tree
	 */
	enterColumnNameComment?: (ctx: ColumnNameCommentContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameComment`.
	 * @param ctx the parse tree
	 */
	exitColumnNameComment?: (ctx: ColumnNameCommentContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnRefOrder`.
	 * @param ctx the parse tree
	 */
	enterColumnRefOrder?: (ctx: ColumnRefOrderContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnRefOrder`.
	 * @param ctx the parse tree
	 */
	exitColumnRefOrder?: (ctx: ColumnRefOrderContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameType`.
	 * @param ctx the parse tree
	 */
	enterColumnNameType?: (ctx: ColumnNameTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameType`.
	 * @param ctx the parse tree
	 */
	exitColumnNameType?: (ctx: ColumnNameTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameTypeOrConstraint`.
	 * @param ctx the parse tree
	 */
	enterColumnNameTypeOrConstraint?: (ctx: ColumnNameTypeOrConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameTypeOrConstraint`.
	 * @param ctx the parse tree
	 */
	exitColumnNameTypeOrConstraint?: (ctx: ColumnNameTypeOrConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableConstraint`.
	 * @param ctx the parse tree
	 */
	enterTableConstraint?: (ctx: TableConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableConstraint`.
	 * @param ctx the parse tree
	 */
	exitTableConstraint?: (ctx: TableConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameTypeConstraint`.
	 * @param ctx the parse tree
	 */
	enterColumnNameTypeConstraint?: (ctx: ColumnNameTypeConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameTypeConstraint`.
	 * @param ctx the parse tree
	 */
	exitColumnNameTypeConstraint?: (ctx: ColumnNameTypeConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnConstraint`.
	 * @param ctx the parse tree
	 */
	enterColumnConstraint?: (ctx: ColumnConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnConstraint`.
	 * @param ctx the parse tree
	 */
	exitColumnConstraint?: (ctx: ColumnConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.foreignKeyConstraint`.
	 * @param ctx the parse tree
	 */
	enterForeignKeyConstraint?: (ctx: ForeignKeyConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.foreignKeyConstraint`.
	 * @param ctx the parse tree
	 */
	exitForeignKeyConstraint?: (ctx: ForeignKeyConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.colConstraint`.
	 * @param ctx the parse tree
	 */
	enterColConstraint?: (ctx: ColConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.colConstraint`.
	 * @param ctx the parse tree
	 */
	exitColConstraint?: (ctx: ColConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterColumnConstraint`.
	 * @param ctx the parse tree
	 */
	enterAlterColumnConstraint?: (ctx: AlterColumnConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterColumnConstraint`.
	 * @param ctx the parse tree
	 */
	exitAlterColumnConstraint?: (ctx: AlterColumnConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterForeignKeyConstraint`.
	 * @param ctx the parse tree
	 */
	enterAlterForeignKeyConstraint?: (ctx: AlterForeignKeyConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterForeignKeyConstraint`.
	 * @param ctx the parse tree
	 */
	exitAlterForeignKeyConstraint?: (ctx: AlterForeignKeyConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.alterColConstraint`.
	 * @param ctx the parse tree
	 */
	enterAlterColConstraint?: (ctx: AlterColConstraintContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.alterColConstraint`.
	 * @param ctx the parse tree
	 */
	exitAlterColConstraint?: (ctx: AlterColConstraintContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableConstraintPrimaryKey`.
	 * @param ctx the parse tree
	 */
	enterTableConstraintPrimaryKey?: (ctx: TableConstraintPrimaryKeyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableConstraintPrimaryKey`.
	 * @param ctx the parse tree
	 */
	exitTableConstraintPrimaryKey?: (ctx: TableConstraintPrimaryKeyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.constraintOptsCreate`.
	 * @param ctx the parse tree
	 */
	enterConstraintOptsCreate?: (ctx: ConstraintOptsCreateContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.constraintOptsCreate`.
	 * @param ctx the parse tree
	 */
	exitConstraintOptsCreate?: (ctx: ConstraintOptsCreateContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.constraintOptsAlter`.
	 * @param ctx the parse tree
	 */
	enterConstraintOptsAlter?: (ctx: ConstraintOptsAlterContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.constraintOptsAlter`.
	 * @param ctx the parse tree
	 */
	exitConstraintOptsAlter?: (ctx: ConstraintOptsAlterContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnNameColonType`.
	 * @param ctx the parse tree
	 */
	enterColumnNameColonType?: (ctx: ColumnNameColonTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnNameColonType`.
	 * @param ctx the parse tree
	 */
	exitColumnNameColonType?: (ctx: ColumnNameColonTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.colType`.
	 * @param ctx the parse tree
	 */
	enterColType?: (ctx: ColTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.colType`.
	 * @param ctx the parse tree
	 */
	exitColType?: (ctx: ColTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.colTypeList`.
	 * @param ctx the parse tree
	 */
	enterColTypeList?: (ctx: ColTypeListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.colTypeList`.
	 * @param ctx the parse tree
	 */
	exitColTypeList?: (ctx: ColTypeListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.type_db_col`.
	 * @param ctx the parse tree
	 */
	enterType_db_col?: (ctx: Type_db_colContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.type_db_col`.
	 * @param ctx the parse tree
	 */
	exitType_db_col?: (ctx: Type_db_colContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.primitiveType`.
	 * @param ctx the parse tree
	 */
	enterPrimitiveType?: (ctx: PrimitiveTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.primitiveType`.
	 * @param ctx the parse tree
	 */
	exitPrimitiveType?: (ctx: PrimitiveTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.listType`.
	 * @param ctx the parse tree
	 */
	enterListType?: (ctx: ListTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.listType`.
	 * @param ctx the parse tree
	 */
	exitListType?: (ctx: ListTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.structType`.
	 * @param ctx the parse tree
	 */
	enterStructType?: (ctx: StructTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.structType`.
	 * @param ctx the parse tree
	 */
	exitStructType?: (ctx: StructTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.mapType`.
	 * @param ctx the parse tree
	 */
	enterMapType?: (ctx: MapTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.mapType`.
	 * @param ctx the parse tree
	 */
	exitMapType?: (ctx: MapTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.unionType`.
	 * @param ctx the parse tree
	 */
	enterUnionType?: (ctx: UnionTypeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.unionType`.
	 * @param ctx the parse tree
	 */
	exitUnionType?: (ctx: UnionTypeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.setOperator`.
	 * @param ctx the parse tree
	 */
	enterSetOperator?: (ctx: SetOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.setOperator`.
	 * @param ctx the parse tree
	 */
	exitSetOperator?: (ctx: SetOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.queryStatementExpression`.
	 * @param ctx the parse tree
	 */
	enterQueryStatementExpression?: (ctx: QueryStatementExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.queryStatementExpression`.
	 * @param ctx the parse tree
	 */
	exitQueryStatementExpression?: (ctx: QueryStatementExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.queryStatementExpressionBody`.
	 * @param ctx the parse tree
	 */
	enterQueryStatementExpressionBody?: (ctx: QueryStatementExpressionBodyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.queryStatementExpressionBody`.
	 * @param ctx the parse tree
	 */
	exitQueryStatementExpressionBody?: (ctx: QueryStatementExpressionBodyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.withClause`.
	 * @param ctx the parse tree
	 */
	enterWithClause?: (ctx: WithClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.withClause`.
	 * @param ctx the parse tree
	 */
	exitWithClause?: (ctx: WithClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.cteStatement`.
	 * @param ctx the parse tree
	 */
	enterCteStatement?: (ctx: CteStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.cteStatement`.
	 * @param ctx the parse tree
	 */
	exitCteStatement?: (ctx: CteStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.fromStatement`.
	 * @param ctx the parse tree
	 */
	enterFromStatement?: (ctx: FromStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.fromStatement`.
	 * @param ctx the parse tree
	 */
	exitFromStatement?: (ctx: FromStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.singleFromStatement`.
	 * @param ctx the parse tree
	 */
	enterSingleFromStatement?: (ctx: SingleFromStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.singleFromStatement`.
	 * @param ctx the parse tree
	 */
	exitSingleFromStatement?: (ctx: SingleFromStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.regularBody`.
	 * @param ctx the parse tree
	 */
	enterRegularBody?: (ctx: RegularBodyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.regularBody`.
	 * @param ctx the parse tree
	 */
	exitRegularBody?: (ctx: RegularBodyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.atomSelectStatement`.
	 * @param ctx the parse tree
	 */
	enterAtomSelectStatement?: (ctx: AtomSelectStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.atomSelectStatement`.
	 * @param ctx the parse tree
	 */
	exitAtomSelectStatement?: (ctx: AtomSelectStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectStatement`.
	 * @param ctx the parse tree
	 */
	enterSelectStatement?: (ctx: SelectStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectStatement`.
	 * @param ctx the parse tree
	 */
	exitSelectStatement?: (ctx: SelectStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.setOpSelectStatement`.
	 * @param ctx the parse tree
	 */
	enterSetOpSelectStatement?: (ctx: SetOpSelectStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.setOpSelectStatement`.
	 * @param ctx the parse tree
	 */
	exitSetOpSelectStatement?: (ctx: SetOpSelectStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectStatementWithCTE`.
	 * @param ctx the parse tree
	 */
	enterSelectStatementWithCTE?: (ctx: SelectStatementWithCTEContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectStatementWithCTE`.
	 * @param ctx the parse tree
	 */
	exitSelectStatementWithCTE?: (ctx: SelectStatementWithCTEContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.body`.
	 * @param ctx the parse tree
	 */
	enterBody?: (ctx: BodyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.body`.
	 * @param ctx the parse tree
	 */
	exitBody?: (ctx: BodyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.insertClause`.
	 * @param ctx the parse tree
	 */
	enterInsertClause?: (ctx: InsertClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.insertClause`.
	 * @param ctx the parse tree
	 */
	exitInsertClause?: (ctx: InsertClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.destination`.
	 * @param ctx the parse tree
	 */
	enterDestination?: (ctx: DestinationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.destination`.
	 * @param ctx the parse tree
	 */
	exitDestination?: (ctx: DestinationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.limitClause`.
	 * @param ctx the parse tree
	 */
	enterLimitClause?: (ctx: LimitClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.limitClause`.
	 * @param ctx the parse tree
	 */
	exitLimitClause?: (ctx: LimitClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	enterDeleteStatement?: (ctx: DeleteStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.deleteStatement`.
	 * @param ctx the parse tree
	 */
	exitDeleteStatement?: (ctx: DeleteStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnAssignmentClause`.
	 * @param ctx the parse tree
	 */
	enterColumnAssignmentClause?: (ctx: ColumnAssignmentClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnAssignmentClause`.
	 * @param ctx the parse tree
	 */
	exitColumnAssignmentClause?: (ctx: ColumnAssignmentClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.setColumnsClause`.
	 * @param ctx the parse tree
	 */
	enterSetColumnsClause?: (ctx: SetColumnsClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.setColumnsClause`.
	 * @param ctx the parse tree
	 */
	exitSetColumnsClause?: (ctx: SetColumnsClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.updateStatement`.
	 * @param ctx the parse tree
	 */
	enterUpdateStatement?: (ctx: UpdateStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.updateStatement`.
	 * @param ctx the parse tree
	 */
	exitUpdateStatement?: (ctx: UpdateStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.sqlTransactionStatement`.
	 * @param ctx the parse tree
	 */
	enterSqlTransactionStatement?: (ctx: SqlTransactionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.sqlTransactionStatement`.
	 * @param ctx the parse tree
	 */
	exitSqlTransactionStatement?: (ctx: SqlTransactionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.startTransactionStatement`.
	 * @param ctx the parse tree
	 */
	enterStartTransactionStatement?: (ctx: StartTransactionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.startTransactionStatement`.
	 * @param ctx the parse tree
	 */
	exitStartTransactionStatement?: (ctx: StartTransactionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.transactionMode`.
	 * @param ctx the parse tree
	 */
	enterTransactionMode?: (ctx: TransactionModeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.transactionMode`.
	 * @param ctx the parse tree
	 */
	exitTransactionMode?: (ctx: TransactionModeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.transactionAccessMode`.
	 * @param ctx the parse tree
	 */
	enterTransactionAccessMode?: (ctx: TransactionAccessModeContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.transactionAccessMode`.
	 * @param ctx the parse tree
	 */
	exitTransactionAccessMode?: (ctx: TransactionAccessModeContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.isolationLevel`.
	 * @param ctx the parse tree
	 */
	enterIsolationLevel?: (ctx: IsolationLevelContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.isolationLevel`.
	 * @param ctx the parse tree
	 */
	exitIsolationLevel?: (ctx: IsolationLevelContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.levelOfIsolation`.
	 * @param ctx the parse tree
	 */
	enterLevelOfIsolation?: (ctx: LevelOfIsolationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.levelOfIsolation`.
	 * @param ctx the parse tree
	 */
	exitLevelOfIsolation?: (ctx: LevelOfIsolationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.commitStatement`.
	 * @param ctx the parse tree
	 */
	enterCommitStatement?: (ctx: CommitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.commitStatement`.
	 * @param ctx the parse tree
	 */
	exitCommitStatement?: (ctx: CommitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rollbackStatement`.
	 * @param ctx the parse tree
	 */
	enterRollbackStatement?: (ctx: RollbackStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rollbackStatement`.
	 * @param ctx the parse tree
	 */
	exitRollbackStatement?: (ctx: RollbackStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.setAutoCommitStatement`.
	 * @param ctx the parse tree
	 */
	enterSetAutoCommitStatement?: (ctx: SetAutoCommitStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.setAutoCommitStatement`.
	 * @param ctx the parse tree
	 */
	exitSetAutoCommitStatement?: (ctx: SetAutoCommitStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.abortTransactionStatement`.
	 * @param ctx the parse tree
	 */
	enterAbortTransactionStatement?: (ctx: AbortTransactionStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.abortTransactionStatement`.
	 * @param ctx the parse tree
	 */
	exitAbortTransactionStatement?: (ctx: AbortTransactionStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.mergeStatement`.
	 * @param ctx the parse tree
	 */
	enterMergeStatement?: (ctx: MergeStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.mergeStatement`.
	 * @param ctx the parse tree
	 */
	exitMergeStatement?: (ctx: MergeStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whenClauses`.
	 * @param ctx the parse tree
	 */
	enterWhenClauses?: (ctx: WhenClausesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whenClauses`.
	 * @param ctx the parse tree
	 */
	exitWhenClauses?: (ctx: WhenClausesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whenNotMatchedClause`.
	 * @param ctx the parse tree
	 */
	enterWhenNotMatchedClause?: (ctx: WhenNotMatchedClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whenNotMatchedClause`.
	 * @param ctx the parse tree
	 */
	exitWhenNotMatchedClause?: (ctx: WhenNotMatchedClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whenMatchedAndClause`.
	 * @param ctx the parse tree
	 */
	enterWhenMatchedAndClause?: (ctx: WhenMatchedAndClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whenMatchedAndClause`.
	 * @param ctx the parse tree
	 */
	exitWhenMatchedAndClause?: (ctx: WhenMatchedAndClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whenMatchedThenClause`.
	 * @param ctx the parse tree
	 */
	enterWhenMatchedThenClause?: (ctx: WhenMatchedThenClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whenMatchedThenClause`.
	 * @param ctx the parse tree
	 */
	exitWhenMatchedThenClause?: (ctx: WhenMatchedThenClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.updateOrDelete`.
	 * @param ctx the parse tree
	 */
	enterUpdateOrDelete?: (ctx: UpdateOrDeleteContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.updateOrDelete`.
	 * @param ctx the parse tree
	 */
	exitUpdateOrDelete?: (ctx: UpdateOrDeleteContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.killQueryStatement`.
	 * @param ctx the parse tree
	 */
	enterKillQueryStatement?: (ctx: KillQueryStatementContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.killQueryStatement`.
	 * @param ctx the parse tree
	 */
	exitKillQueryStatement?: (ctx: KillQueryStatementContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectClause`.
	 * @param ctx the parse tree
	 */
	enterSelectClause?: (ctx: SelectClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectClause`.
	 * @param ctx the parse tree
	 */
	exitSelectClause?: (ctx: SelectClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectList`.
	 * @param ctx the parse tree
	 */
	enterSelectList?: (ctx: SelectListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectList`.
	 * @param ctx the parse tree
	 */
	exitSelectList?: (ctx: SelectListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectTrfmClause`.
	 * @param ctx the parse tree
	 */
	enterSelectTrfmClause?: (ctx: SelectTrfmClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectTrfmClause`.
	 * @param ctx the parse tree
	 */
	exitSelectTrfmClause?: (ctx: SelectTrfmClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectItem`.
	 * @param ctx the parse tree
	 */
	enterSelectItem?: (ctx: SelectItemContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectItem`.
	 * @param ctx the parse tree
	 */
	exitSelectItem?: (ctx: SelectItemContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.trfmClause`.
	 * @param ctx the parse tree
	 */
	enterTrfmClause?: (ctx: TrfmClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.trfmClause`.
	 * @param ctx the parse tree
	 */
	exitTrfmClause?: (ctx: TrfmClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectExpression`.
	 * @param ctx the parse tree
	 */
	enterSelectExpression?: (ctx: SelectExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectExpression`.
	 * @param ctx the parse tree
	 */
	exitSelectExpression?: (ctx: SelectExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.selectExpressionList`.
	 * @param ctx the parse tree
	 */
	enterSelectExpressionList?: (ctx: SelectExpressionListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.selectExpressionList`.
	 * @param ctx the parse tree
	 */
	exitSelectExpressionList?: (ctx: SelectExpressionListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_clause`.
	 * @param ctx the parse tree
	 */
	enterWindow_clause?: (ctx: Window_clauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_clause`.
	 * @param ctx the parse tree
	 */
	exitWindow_clause?: (ctx: Window_clauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_defn`.
	 * @param ctx the parse tree
	 */
	enterWindow_defn?: (ctx: Window_defnContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_defn`.
	 * @param ctx the parse tree
	 */
	exitWindow_defn?: (ctx: Window_defnContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_specification`.
	 * @param ctx the parse tree
	 */
	enterWindow_specification?: (ctx: Window_specificationContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_specification`.
	 * @param ctx the parse tree
	 */
	exitWindow_specification?: (ctx: Window_specificationContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_frame`.
	 * @param ctx the parse tree
	 */
	enterWindow_frame?: (ctx: Window_frameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_frame`.
	 * @param ctx the parse tree
	 */
	exitWindow_frame?: (ctx: Window_frameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_range_expression`.
	 * @param ctx the parse tree
	 */
	enterWindow_range_expression?: (ctx: Window_range_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_range_expression`.
	 * @param ctx the parse tree
	 */
	exitWindow_range_expression?: (ctx: Window_range_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_value_expression`.
	 * @param ctx the parse tree
	 */
	enterWindow_value_expression?: (ctx: Window_value_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_value_expression`.
	 * @param ctx the parse tree
	 */
	exitWindow_value_expression?: (ctx: Window_value_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_frame_start_boundary`.
	 * @param ctx the parse tree
	 */
	enterWindow_frame_start_boundary?: (ctx: Window_frame_start_boundaryContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_frame_start_boundary`.
	 * @param ctx the parse tree
	 */
	exitWindow_frame_start_boundary?: (ctx: Window_frame_start_boundaryContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.window_frame_boundary`.
	 * @param ctx the parse tree
	 */
	enterWindow_frame_boundary?: (ctx: Window_frame_boundaryContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.window_frame_boundary`.
	 * @param ctx the parse tree
	 */
	exitWindow_frame_boundary?: (ctx: Window_frame_boundaryContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableAllColumns`.
	 * @param ctx the parse tree
	 */
	enterTableAllColumns?: (ctx: TableAllColumnsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableAllColumns`.
	 * @param ctx the parse tree
	 */
	exitTableAllColumns?: (ctx: TableAllColumnsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableOrColumn`.
	 * @param ctx the parse tree
	 */
	enterTableOrColumn?: (ctx: TableOrColumnContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableOrColumn`.
	 * @param ctx the parse tree
	 */
	exitTableOrColumn?: (ctx: TableOrColumnContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expressionList`.
	 * @param ctx the parse tree
	 */
	enterExpressionList?: (ctx: ExpressionListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expressionList`.
	 * @param ctx the parse tree
	 */
	exitExpressionList?: (ctx: ExpressionListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.aliasList`.
	 * @param ctx the parse tree
	 */
	enterAliasList?: (ctx: AliasListContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.aliasList`.
	 * @param ctx the parse tree
	 */
	exitAliasList?: (ctx: AliasListContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.fromClause`.
	 * @param ctx the parse tree
	 */
	enterFromClause?: (ctx: FromClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.fromClause`.
	 * @param ctx the parse tree
	 */
	exitFromClause?: (ctx: FromClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.fromSource`.
	 * @param ctx the parse tree
	 */
	enterFromSource?: (ctx: FromSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.fromSource`.
	 * @param ctx the parse tree
	 */
	exitFromSource?: (ctx: FromSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.atomjoinSource`.
	 * @param ctx the parse tree
	 */
	enterAtomjoinSource?: (ctx: AtomjoinSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.atomjoinSource`.
	 * @param ctx the parse tree
	 */
	exitAtomjoinSource?: (ctx: AtomjoinSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.joinSource`.
	 * @param ctx the parse tree
	 */
	enterJoinSource?: (ctx: JoinSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.joinSource`.
	 * @param ctx the parse tree
	 */
	exitJoinSource?: (ctx: JoinSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.joinSourcePart`.
	 * @param ctx the parse tree
	 */
	enterJoinSourcePart?: (ctx: JoinSourcePartContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.joinSourcePart`.
	 * @param ctx the parse tree
	 */
	exitJoinSourcePart?: (ctx: JoinSourcePartContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.uniqueJoinSource`.
	 * @param ctx the parse tree
	 */
	enterUniqueJoinSource?: (ctx: UniqueJoinSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.uniqueJoinSource`.
	 * @param ctx the parse tree
	 */
	exitUniqueJoinSource?: (ctx: UniqueJoinSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.uniqueJoinExpr`.
	 * @param ctx the parse tree
	 */
	enterUniqueJoinExpr?: (ctx: UniqueJoinExprContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.uniqueJoinExpr`.
	 * @param ctx the parse tree
	 */
	exitUniqueJoinExpr?: (ctx: UniqueJoinExprContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.uniqueJoinToken`.
	 * @param ctx the parse tree
	 */
	enterUniqueJoinToken?: (ctx: UniqueJoinTokenContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.uniqueJoinToken`.
	 * @param ctx the parse tree
	 */
	exitUniqueJoinToken?: (ctx: UniqueJoinTokenContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.joinToken`.
	 * @param ctx the parse tree
	 */
	enterJoinToken?: (ctx: JoinTokenContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.joinToken`.
	 * @param ctx the parse tree
	 */
	exitJoinToken?: (ctx: JoinTokenContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.lateralView`.
	 * @param ctx the parse tree
	 */
	enterLateralView?: (ctx: LateralViewContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.lateralView`.
	 * @param ctx the parse tree
	 */
	exitLateralView?: (ctx: LateralViewContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableAlias`.
	 * @param ctx the parse tree
	 */
	enterTableAlias?: (ctx: TableAliasContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableAlias`.
	 * @param ctx the parse tree
	 */
	exitTableAlias?: (ctx: TableAliasContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableBucketSample`.
	 * @param ctx the parse tree
	 */
	enterTableBucketSample?: (ctx: TableBucketSampleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableBucketSample`.
	 * @param ctx the parse tree
	 */
	exitTableBucketSample?: (ctx: TableBucketSampleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.splitSample`.
	 * @param ctx the parse tree
	 */
	enterSplitSample?: (ctx: SplitSampleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.splitSample`.
	 * @param ctx the parse tree
	 */
	exitSplitSample?: (ctx: SplitSampleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableSample`.
	 * @param ctx the parse tree
	 */
	enterTableSample?: (ctx: TableSampleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableSample`.
	 * @param ctx the parse tree
	 */
	exitTableSample?: (ctx: TableSampleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableSource`.
	 * @param ctx the parse tree
	 */
	enterTableSource?: (ctx: TableSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableSource`.
	 * @param ctx the parse tree
	 */
	exitTableSource?: (ctx: TableSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.uniqueJoinTableSource`.
	 * @param ctx the parse tree
	 */
	enterUniqueJoinTableSource?: (ctx: UniqueJoinTableSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.uniqueJoinTableSource`.
	 * @param ctx the parse tree
	 */
	exitUniqueJoinTableSource?: (ctx: UniqueJoinTableSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableName`.
	 * @param ctx the parse tree
	 */
	enterTableName?: (ctx: TableNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableName`.
	 * @param ctx the parse tree
	 */
	exitTableName?: (ctx: TableNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.viewName`.
	 * @param ctx the parse tree
	 */
	enterViewName?: (ctx: ViewNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.viewName`.
	 * @param ctx the parse tree
	 */
	exitViewName?: (ctx: ViewNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.subQuerySource`.
	 * @param ctx the parse tree
	 */
	enterSubQuerySource?: (ctx: SubQuerySourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.subQuerySource`.
	 * @param ctx the parse tree
	 */
	exitSubQuerySource?: (ctx: SubQuerySourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitioningSpec`.
	 * @param ctx the parse tree
	 */
	enterPartitioningSpec?: (ctx: PartitioningSpecContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitioningSpec`.
	 * @param ctx the parse tree
	 */
	exitPartitioningSpec?: (ctx: PartitioningSpecContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionTableFunctionSource`.
	 * @param ctx the parse tree
	 */
	enterPartitionTableFunctionSource?: (ctx: PartitionTableFunctionSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionTableFunctionSource`.
	 * @param ctx the parse tree
	 */
	exitPartitionTableFunctionSource?: (ctx: PartitionTableFunctionSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionedTableFunction`.
	 * @param ctx the parse tree
	 */
	enterPartitionedTableFunction?: (ctx: PartitionedTableFunctionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionedTableFunction`.
	 * @param ctx the parse tree
	 */
	exitPartitionedTableFunction?: (ctx: PartitionedTableFunctionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whereClause`.
	 * @param ctx the parse tree
	 */
	enterWhereClause?: (ctx: WhereClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whereClause`.
	 * @param ctx the parse tree
	 */
	exitWhereClause?: (ctx: WhereClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.searchCondition`.
	 * @param ctx the parse tree
	 */
	enterSearchCondition?: (ctx: SearchConditionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.searchCondition`.
	 * @param ctx the parse tree
	 */
	exitSearchCondition?: (ctx: SearchConditionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.valuesClause`.
	 * @param ctx the parse tree
	 */
	enterValuesClause?: (ctx: ValuesClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.valuesClause`.
	 * @param ctx the parse tree
	 */
	exitValuesClause?: (ctx: ValuesClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.valuesTableConstructor`.
	 * @param ctx the parse tree
	 */
	enterValuesTableConstructor?: (ctx: ValuesTableConstructorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.valuesTableConstructor`.
	 * @param ctx the parse tree
	 */
	exitValuesTableConstructor?: (ctx: ValuesTableConstructorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.valueRowConstructor`.
	 * @param ctx the parse tree
	 */
	enterValueRowConstructor?: (ctx: ValueRowConstructorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.valueRowConstructor`.
	 * @param ctx the parse tree
	 */
	exitValueRowConstructor?: (ctx: ValueRowConstructorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.virtualTableSource`.
	 * @param ctx the parse tree
	 */
	enterVirtualTableSource?: (ctx: VirtualTableSourceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.virtualTableSource`.
	 * @param ctx the parse tree
	 */
	exitVirtualTableSource?: (ctx: VirtualTableSourceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupByClause`.
	 * @param ctx the parse tree
	 */
	enterGroupByClause?: (ctx: GroupByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupByClause`.
	 * @param ctx the parse tree
	 */
	exitGroupByClause?: (ctx: GroupByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupby_expression`.
	 * @param ctx the parse tree
	 */
	enterGroupby_expression?: (ctx: Groupby_expressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupby_expression`.
	 * @param ctx the parse tree
	 */
	exitGroupby_expression?: (ctx: Groupby_expressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupByEmpty`.
	 * @param ctx the parse tree
	 */
	enterGroupByEmpty?: (ctx: GroupByEmptyContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupByEmpty`.
	 * @param ctx the parse tree
	 */
	exitGroupByEmpty?: (ctx: GroupByEmptyContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rollupStandard`.
	 * @param ctx the parse tree
	 */
	enterRollupStandard?: (ctx: RollupStandardContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rollupStandard`.
	 * @param ctx the parse tree
	 */
	exitRollupStandard?: (ctx: RollupStandardContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.rollupOldSyntax`.
	 * @param ctx the parse tree
	 */
	enterRollupOldSyntax?: (ctx: RollupOldSyntaxContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.rollupOldSyntax`.
	 * @param ctx the parse tree
	 */
	exitRollupOldSyntax?: (ctx: RollupOldSyntaxContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupingSetExpression`.
	 * @param ctx the parse tree
	 */
	enterGroupingSetExpression?: (ctx: GroupingSetExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupingSetExpression`.
	 * @param ctx the parse tree
	 */
	exitGroupingSetExpression?: (ctx: GroupingSetExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupingSetExpressionMultiple`.
	 * @param ctx the parse tree
	 */
	enterGroupingSetExpressionMultiple?: (ctx: GroupingSetExpressionMultipleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupingSetExpressionMultiple`.
	 * @param ctx the parse tree
	 */
	exitGroupingSetExpressionMultiple?: (ctx: GroupingSetExpressionMultipleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.groupingExpressionSingle`.
	 * @param ctx the parse tree
	 */
	enterGroupingExpressionSingle?: (ctx: GroupingExpressionSingleContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.groupingExpressionSingle`.
	 * @param ctx the parse tree
	 */
	exitGroupingExpressionSingle?: (ctx: GroupingExpressionSingleContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.havingClause`.
	 * @param ctx the parse tree
	 */
	enterHavingClause?: (ctx: HavingClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.havingClause`.
	 * @param ctx the parse tree
	 */
	exitHavingClause?: (ctx: HavingClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.havingCondition`.
	 * @param ctx the parse tree
	 */
	enterHavingCondition?: (ctx: HavingConditionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.havingCondition`.
	 * @param ctx the parse tree
	 */
	exitHavingCondition?: (ctx: HavingConditionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expressionsInParenthesis`.
	 * @param ctx the parse tree
	 */
	enterExpressionsInParenthesis?: (ctx: ExpressionsInParenthesisContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expressionsInParenthesis`.
	 * @param ctx the parse tree
	 */
	exitExpressionsInParenthesis?: (ctx: ExpressionsInParenthesisContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expressionsNotInParenthesis`.
	 * @param ctx the parse tree
	 */
	enterExpressionsNotInParenthesis?: (ctx: ExpressionsNotInParenthesisContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expressionsNotInParenthesis`.
	 * @param ctx the parse tree
	 */
	exitExpressionsNotInParenthesis?: (ctx: ExpressionsNotInParenthesisContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expressionPart`.
	 * @param ctx the parse tree
	 */
	enterExpressionPart?: (ctx: ExpressionPartContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expressionPart`.
	 * @param ctx the parse tree
	 */
	exitExpressionPart?: (ctx: ExpressionPartContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expressions`.
	 * @param ctx the parse tree
	 */
	enterExpressions?: (ctx: ExpressionsContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expressions`.
	 * @param ctx the parse tree
	 */
	exitExpressions?: (ctx: ExpressionsContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnRefOrderInParenthesis`.
	 * @param ctx the parse tree
	 */
	enterColumnRefOrderInParenthesis?: (ctx: ColumnRefOrderInParenthesisContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnRefOrderInParenthesis`.
	 * @param ctx the parse tree
	 */
	exitColumnRefOrderInParenthesis?: (ctx: ColumnRefOrderInParenthesisContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.columnRefOrderNotInParenthesis`.
	 * @param ctx the parse tree
	 */
	enterColumnRefOrderNotInParenthesis?: (ctx: ColumnRefOrderNotInParenthesisContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.columnRefOrderNotInParenthesis`.
	 * @param ctx the parse tree
	 */
	exitColumnRefOrderNotInParenthesis?: (ctx: ColumnRefOrderNotInParenthesisContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.orderByClause`.
	 * @param ctx the parse tree
	 */
	enterOrderByClause?: (ctx: OrderByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.orderByClause`.
	 * @param ctx the parse tree
	 */
	exitOrderByClause?: (ctx: OrderByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.clusterByClause`.
	 * @param ctx the parse tree
	 */
	enterClusterByClause?: (ctx: ClusterByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.clusterByClause`.
	 * @param ctx the parse tree
	 */
	exitClusterByClause?: (ctx: ClusterByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionByClause`.
	 * @param ctx the parse tree
	 */
	enterPartitionByClause?: (ctx: PartitionByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionByClause`.
	 * @param ctx the parse tree
	 */
	exitPartitionByClause?: (ctx: PartitionByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.distributeByClause`.
	 * @param ctx the parse tree
	 */
	enterDistributeByClause?: (ctx: DistributeByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.distributeByClause`.
	 * @param ctx the parse tree
	 */
	exitDistributeByClause?: (ctx: DistributeByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.sortByClause`.
	 * @param ctx the parse tree
	 */
	enterSortByClause?: (ctx: SortByClauseContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.sortByClause`.
	 * @param ctx the parse tree
	 */
	exitSortByClause?: (ctx: SortByClauseContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.function_`.
	 * @param ctx the parse tree
	 */
	enterFunction_?: (ctx: Function_Context) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.function_`.
	 * @param ctx the parse tree
	 */
	exitFunction_?: (ctx: Function_Context) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.functionName`.
	 * @param ctx the parse tree
	 */
	enterFunctionName?: (ctx: FunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.functionName`.
	 * @param ctx the parse tree
	 */
	exitFunctionName?: (ctx: FunctionNameContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.castExpression`.
	 * @param ctx the parse tree
	 */
	enterCastExpression?: (ctx: CastExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.castExpression`.
	 * @param ctx the parse tree
	 */
	exitCastExpression?: (ctx: CastExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.caseExpression`.
	 * @param ctx the parse tree
	 */
	enterCaseExpression?: (ctx: CaseExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.caseExpression`.
	 * @param ctx the parse tree
	 */
	exitCaseExpression?: (ctx: CaseExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.whenExpression`.
	 * @param ctx the parse tree
	 */
	enterWhenExpression?: (ctx: WhenExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.whenExpression`.
	 * @param ctx the parse tree
	 */
	exitWhenExpression?: (ctx: WhenExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.floorExpression`.
	 * @param ctx the parse tree
	 */
	enterFloorExpression?: (ctx: FloorExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.floorExpression`.
	 * @param ctx the parse tree
	 */
	exitFloorExpression?: (ctx: FloorExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.floorDateQualifiers`.
	 * @param ctx the parse tree
	 */
	enterFloorDateQualifiers?: (ctx: FloorDateQualifiersContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.floorDateQualifiers`.
	 * @param ctx the parse tree
	 */
	exitFloorDateQualifiers?: (ctx: FloorDateQualifiersContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.extractExpression`.
	 * @param ctx the parse tree
	 */
	enterExtractExpression?: (ctx: ExtractExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.extractExpression`.
	 * @param ctx the parse tree
	 */
	exitExtractExpression?: (ctx: ExtractExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.timeQualifiers`.
	 * @param ctx the parse tree
	 */
	enterTimeQualifiers?: (ctx: TimeQualifiersContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.timeQualifiers`.
	 * @param ctx the parse tree
	 */
	exitTimeQualifiers?: (ctx: TimeQualifiersContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.constant`.
	 * @param ctx the parse tree
	 */
	enterConstant?: (ctx: ConstantContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.constant`.
	 * @param ctx the parse tree
	 */
	exitConstant?: (ctx: ConstantContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.stringLiteralSequence`.
	 * @param ctx the parse tree
	 */
	enterStringLiteralSequence?: (ctx: StringLiteralSequenceContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.stringLiteralSequence`.
	 * @param ctx the parse tree
	 */
	exitStringLiteralSequence?: (ctx: StringLiteralSequenceContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.charSetStringLiteral`.
	 * @param ctx the parse tree
	 */
	enterCharSetStringLiteral?: (ctx: CharSetStringLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.charSetStringLiteral`.
	 * @param ctx the parse tree
	 */
	exitCharSetStringLiteral?: (ctx: CharSetStringLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dateLiteral`.
	 * @param ctx the parse tree
	 */
	enterDateLiteral?: (ctx: DateLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dateLiteral`.
	 * @param ctx the parse tree
	 */
	exitDateLiteral?: (ctx: DateLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.timestampLiteral`.
	 * @param ctx the parse tree
	 */
	enterTimestampLiteral?: (ctx: TimestampLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.timestampLiteral`.
	 * @param ctx the parse tree
	 */
	exitTimestampLiteral?: (ctx: TimestampLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.timestampLocalTZLiteral`.
	 * @param ctx the parse tree
	 */
	enterTimestampLocalTZLiteral?: (ctx: TimestampLocalTZLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.timestampLocalTZLiteral`.
	 * @param ctx the parse tree
	 */
	exitTimestampLocalTZLiteral?: (ctx: TimestampLocalTZLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.intervalValue`.
	 * @param ctx the parse tree
	 */
	enterIntervalValue?: (ctx: IntervalValueContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.intervalValue`.
	 * @param ctx the parse tree
	 */
	exitIntervalValue?: (ctx: IntervalValueContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.intervalLiteral`.
	 * @param ctx the parse tree
	 */
	enterIntervalLiteral?: (ctx: IntervalLiteralContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.intervalLiteral`.
	 * @param ctx the parse tree
	 */
	exitIntervalLiteral?: (ctx: IntervalLiteralContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.intervalExpression`.
	 * @param ctx the parse tree
	 */
	enterIntervalExpression?: (ctx: IntervalExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.intervalExpression`.
	 * @param ctx the parse tree
	 */
	exitIntervalExpression?: (ctx: IntervalExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.intervalQualifiers`.
	 * @param ctx the parse tree
	 */
	enterIntervalQualifiers?: (ctx: IntervalQualifiersContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.intervalQualifiers`.
	 * @param ctx the parse tree
	 */
	exitIntervalQualifiers?: (ctx: IntervalQualifiersContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.atomExpression`.
	 * @param ctx the parse tree
	 */
	enterAtomExpression?: (ctx: AtomExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.atomExpression`.
	 * @param ctx the parse tree
	 */
	exitAtomExpression?: (ctx: AtomExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceUnaryOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceUnaryOperator?: (ctx: PrecedenceUnaryOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceUnaryOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceUnaryOperator?: (ctx: PrecedenceUnaryOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.isCondition`.
	 * @param ctx the parse tree
	 */
	enterIsCondition?: (ctx: IsConditionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.isCondition`.
	 * @param ctx the parse tree
	 */
	exitIsCondition?: (ctx: IsConditionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceBitwiseXorOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceBitwiseXorOperator?: (ctx: PrecedenceBitwiseXorOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceBitwiseXorOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceBitwiseXorOperator?: (ctx: PrecedenceBitwiseXorOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceStarOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceStarOperator?: (ctx: PrecedenceStarOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceStarOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceStarOperator?: (ctx: PrecedenceStarOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedencePlusOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedencePlusOperator?: (ctx: PrecedencePlusOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedencePlusOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedencePlusOperator?: (ctx: PrecedencePlusOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceConcatenateOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceConcatenateOperator?: (ctx: PrecedenceConcatenateOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceConcatenateOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceConcatenateOperator?: (ctx: PrecedenceConcatenateOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceAmpersandOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceAmpersandOperator?: (ctx: PrecedenceAmpersandOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceAmpersandOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceAmpersandOperator?: (ctx: PrecedenceAmpersandOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceBitwiseOrOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceBitwiseOrOperator?: (ctx: PrecedenceBitwiseOrOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceBitwiseOrOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceBitwiseOrOperator?: (ctx: PrecedenceBitwiseOrOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceRegexpOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceRegexpOperator?: (ctx: PrecedenceRegexpOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceRegexpOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceRegexpOperator?: (ctx: PrecedenceRegexpOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceComparisonOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceComparisonOperator?: (ctx: PrecedenceComparisonOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceComparisonOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceComparisonOperator?: (ctx: PrecedenceComparisonOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceNotOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceNotOperator?: (ctx: PrecedenceNotOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceNotOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceNotOperator?: (ctx: PrecedenceNotOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceLogicOperator`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceLogicOperator?: (ctx: PrecedenceLogicOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceLogicOperator`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceLogicOperator?: (ctx: PrecedenceLogicOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.expression`.
	 * @param ctx the parse tree
	 */
	enterExpression?: (ctx: ExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.expression`.
	 * @param ctx the parse tree
	 */
	exitExpression?: (ctx: ExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.precedenceSimilarExpressionIn`.
	 * @param ctx the parse tree
	 */
	enterPrecedenceSimilarExpressionIn?: (ctx: PrecedenceSimilarExpressionInContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.precedenceSimilarExpressionIn`.
	 * @param ctx the parse tree
	 */
	exitPrecedenceSimilarExpressionIn?: (ctx: PrecedenceSimilarExpressionInContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.subQueryExpression`.
	 * @param ctx the parse tree
	 */
	enterSubQueryExpression?: (ctx: SubQueryExpressionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.subQueryExpression`.
	 * @param ctx the parse tree
	 */
	exitSubQueryExpression?: (ctx: SubQueryExpressionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.booleanValue`.
	 * @param ctx the parse tree
	 */
	enterBooleanValue?: (ctx: BooleanValueContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.booleanValue`.
	 * @param ctx the parse tree
	 */
	exitBooleanValue?: (ctx: BooleanValueContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.booleanValueTok`.
	 * @param ctx the parse tree
	 */
	enterBooleanValueTok?: (ctx: BooleanValueTokContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.booleanValueTok`.
	 * @param ctx the parse tree
	 */
	exitBooleanValueTok?: (ctx: BooleanValueTokContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.tableOrPartition`.
	 * @param ctx the parse tree
	 */
	enterTableOrPartition?: (ctx: TableOrPartitionContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.tableOrPartition`.
	 * @param ctx the parse tree
	 */
	exitTableOrPartition?: (ctx: TableOrPartitionContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionSpec`.
	 * @param ctx the parse tree
	 */
	enterPartitionSpec?: (ctx: PartitionSpecContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionSpec`.
	 * @param ctx the parse tree
	 */
	exitPartitionSpec?: (ctx: PartitionSpecContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.partitionVal`.
	 * @param ctx the parse tree
	 */
	enterPartitionVal?: (ctx: PartitionValContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.partitionVal`.
	 * @param ctx the parse tree
	 */
	exitPartitionVal?: (ctx: PartitionValContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropPartitionSpec`.
	 * @param ctx the parse tree
	 */
	enterDropPartitionSpec?: (ctx: DropPartitionSpecContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropPartitionSpec`.
	 * @param ctx the parse tree
	 */
	exitDropPartitionSpec?: (ctx: DropPartitionSpecContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropPartitionVal`.
	 * @param ctx the parse tree
	 */
	enterDropPartitionVal?: (ctx: DropPartitionValContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropPartitionVal`.
	 * @param ctx the parse tree
	 */
	exitDropPartitionVal?: (ctx: DropPartitionValContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.dropPartitionOperator`.
	 * @param ctx the parse tree
	 */
	enterDropPartitionOperator?: (ctx: DropPartitionOperatorContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.dropPartitionOperator`.
	 * @param ctx the parse tree
	 */
	exitDropPartitionOperator?: (ctx: DropPartitionOperatorContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.sysFuncNames`.
	 * @param ctx the parse tree
	 */
	enterSysFuncNames?: (ctx: SysFuncNamesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.sysFuncNames`.
	 * @param ctx the parse tree
	 */
	exitSysFuncNames?: (ctx: SysFuncNamesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.descFuncNames`.
	 * @param ctx the parse tree
	 */
	enterDescFuncNames?: (ctx: DescFuncNamesContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.descFuncNames`.
	 * @param ctx the parse tree
	 */
	exitDescFuncNames?: (ctx: DescFuncNamesContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.identifier`.
	 * @param ctx the parse tree
	 */
	enterIdentifier?: (ctx: IdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.identifier`.
	 * @param ctx the parse tree
	 */
	exitIdentifier?: (ctx: IdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.functionIdentifier`.
	 * @param ctx the parse tree
	 */
	enterFunctionIdentifier?: (ctx: FunctionIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.functionIdentifier`.
	 * @param ctx the parse tree
	 */
	exitFunctionIdentifier?: (ctx: FunctionIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.principalIdentifier`.
	 * @param ctx the parse tree
	 */
	enterPrincipalIdentifier?: (ctx: PrincipalIdentifierContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.principalIdentifier`.
	 * @param ctx the parse tree
	 */
	exitPrincipalIdentifier?: (ctx: PrincipalIdentifierContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.nonReserved`.
	 * @param ctx the parse tree
	 */
	enterNonReserved?: (ctx: NonReservedContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.nonReserved`.
	 * @param ctx the parse tree
	 */
	exitNonReserved?: (ctx: NonReservedContext) => void;

	/**
	 * Enter a parse tree produced by `HiveParser.sql11ReservedKeywordsUsedAsFunctionName`.
	 * @param ctx the parse tree
	 */
	enterSql11ReservedKeywordsUsedAsFunctionName?: (ctx: Sql11ReservedKeywordsUsedAsFunctionNameContext) => void;
	/**
	 * Exit a parse tree produced by `HiveParser.sql11ReservedKeywordsUsedAsFunctionName`.
	 * @param ctx the parse tree
	 */
	exitSql11ReservedKeywordsUsedAsFunctionName?: (ctx: Sql11ReservedKeywordsUsedAsFunctionNameContext) => void;
}

