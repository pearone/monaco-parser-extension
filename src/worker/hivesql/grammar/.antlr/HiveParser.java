// Generated from /Users/xupengyi/58/antlr/monaco/src/worker/hivesql/grammar/HiveParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HiveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_TRUE=1, KW_FALSE=2, KW_ALL=3, KW_NONE=4, KW_AND=5, KW_OR=6, KW_NOT=7, 
		KW_LIKE=8, KW_ANY=9, KW_IF=10, KW_EXISTS=11, KW_ASC=12, KW_DESC=13, KW_NULLS=14, 
		KW_LAST=15, KW_ORDER=16, KW_GROUP=17, KW_BY=18, KW_HAVING=19, KW_WHERE=20, 
		KW_FROM=21, KW_AS=22, KW_SELECT=23, KW_DISTINCT=24, KW_INSERT=25, KW_OVERWRITE=26, 
		KW_OUTER=27, KW_UNIQUEJOIN=28, KW_PRESERVE=29, KW_JOIN=30, KW_LEFT=31, 
		KW_RIGHT=32, KW_FULL=33, KW_ON=34, KW_PARTITION=35, KW_PARTITIONS=36, 
		KW_TABLE=37, KW_TABLES=38, KW_COLUMNS=39, KW_INDEX=40, KW_INDEXES=41, 
		KW_REBUILD=42, KW_FUNCTIONS=43, KW_SHOW=44, KW_MSCK=45, KW_REPAIR=46, 
		KW_DIRECTORY=47, KW_LOCAL=48, KW_TRANSFORM=49, KW_USING=50, KW_CLUSTER=51, 
		KW_DISTRIBUTE=52, KW_SORT=53, KW_UNION=54, KW_EXCEPT=55, KW_LOAD=56, KW_EXPORT=57, 
		KW_IMPORT=58, KW_REPLICATION=59, KW_METADATA=60, KW_DATA=61, KW_INPATH=62, 
		KW_IS=63, KW_NULL=64, KW_CREATE=65, KW_EXTERNAL=66, KW_ALTER=67, KW_CHANGE=68, 
		KW_COLUMN=69, KW_FIRST=70, KW_AFTER=71, KW_DESCRIBE=72, KW_DROP=73, KW_RENAME=74, 
		KW_TO=75, KW_COMMENT=76, KW_BOOLEAN=77, KW_TINYINT=78, KW_SMALLINT=79, 
		KW_INT=80, KW_BIGINT=81, KW_FLOAT=82, KW_DOUBLE=83, KW_PRECISION=84, KW_DATE=85, 
		KW_DATETIME=86, KW_TIMESTAMP=87, KW_TIMESTAMPLOCALTZ=88, KW_TIME=89, KW_ZONE=90, 
		KW_INTERVAL=91, KW_DECIMAL=92, KW_STRING=93, KW_CHAR=94, KW_VARCHAR=95, 
		KW_ARRAY=96, KW_STRUCT=97, KW_MAP=98, KW_UNIONTYPE=99, KW_REDUCE=100, 
		KW_PARTITIONED=101, KW_CLUSTERED=102, KW_SORTED=103, KW_INTO=104, KW_BUCKETS=105, 
		KW_ROW=106, KW_ROWS=107, KW_FORMAT=108, KW_DELIMITED=109, KW_FIELDS=110, 
		KW_TERMINATED=111, KW_ESCAPED=112, KW_COLLECTION=113, KW_ITEMS=114, KW_KEYS=115, 
		KW_KEY_TYPE=116, KW_KILL=117, KW_LINES=118, KW_STORED=119, KW_FILEFORMAT=120, 
		KW_INPUTFORMAT=121, KW_OUTPUTFORMAT=122, KW_INPUTDRIVER=123, KW_OUTPUTDRIVER=124, 
		KW_ENABLE=125, KW_DISABLE=126, KW_LOCATION=127, KW_TABLESAMPLE=128, KW_BUCKET=129, 
		KW_OUT=130, KW_OF=131, KW_PERCENT=132, KW_CAST=133, KW_ADD=134, KW_REPLACE=135, 
		KW_RLIKE=136, KW_REGEXP=137, KW_TEMPORARY=138, KW_FUNCTION=139, KW_MACRO=140, 
		KW_FILE=141, KW_JAR=142, KW_EXPLAIN=143, KW_EXTENDED=144, KW_FORMATTED=145, 
		KW_DEPENDENCY=146, KW_LOGICAL=147, KW_SERDE=148, KW_WITH=149, KW_DEFERRED=150, 
		KW_SERDEPROPERTIES=151, KW_DBPROPERTIES=152, KW_LIMIT=153, KW_OFFSET=154, 
		KW_SET=155, KW_UNSET=156, KW_TBLPROPERTIES=157, KW_IDXPROPERTIES=158, 
		KW_VALUE_TYPE=159, KW_ELEM_TYPE=160, KW_DEFINED=161, KW_CASE=162, KW_WHEN=163, 
		KW_THEN=164, KW_ELSE=165, KW_END=166, KW_MAPJOIN=167, KW_STREAMTABLE=168, 
		KW_CLUSTERSTATUS=169, KW_UTC=170, KW_UTCTIMESTAMP=171, KW_LONG=172, KW_DELETE=173, 
		KW_PLUS=174, KW_MINUS=175, KW_FETCH=176, KW_INTERSECT=177, KW_VIEW=178, 
		KW_VIEWS=179, KW_IN=180, KW_DATABASE=181, KW_DATABASES=182, KW_MATERIALIZED=183, 
		KW_SCHEMA=184, KW_SCHEMAS=185, KW_GRANT=186, KW_REVOKE=187, KW_SSL=188, 
		KW_UNDO=189, KW_LOCK=190, KW_LOCKS=191, KW_UNLOCK=192, KW_SHARED=193, 
		KW_EXCLUSIVE=194, KW_PROCEDURE=195, KW_UNSIGNED=196, KW_WHILE=197, KW_READ=198, 
		KW_READS=199, KW_PURGE=200, KW_RANGE=201, KW_ANALYZE=202, KW_BEFORE=203, 
		KW_BETWEEN=204, KW_BOTH=205, KW_BINARY=206, KW_CROSS=207, KW_CONTINUE=208, 
		KW_CURSOR=209, KW_TRIGGER=210, KW_RECORDREADER=211, KW_RECORDWRITER=212, 
		KW_SEMI=213, KW_LATERAL=214, KW_TOUCH=215, KW_ARCHIVE=216, KW_UNARCHIVE=217, 
		KW_COMPUTE=218, KW_STATISTICS=219, KW_USE=220, KW_OPTION=221, KW_CONCATENATE=222, 
		KW_SHOW_DATABASE=223, KW_UPDATE=224, KW_RESTRICT=225, KW_CASCADE=226, 
		KW_SKEWED=227, KW_ROLLUP=228, KW_CUBE=229, KW_DIRECTORIES=230, KW_FOR=231, 
		KW_WINDOW=232, KW_UNBOUNDED=233, KW_PRECEDING=234, KW_FOLLOWING=235, KW_CURRENT=236, 
		KW_CURRENT_DATE=237, KW_CURRENT_TIMESTAMP=238, KW_LESS=239, KW_MORE=240, 
		KW_OVER=241, KW_GROUPING=242, KW_SETS=243, KW_TRUNCATE=244, KW_NOSCAN=245, 
		KW_USER=246, KW_ROLE=247, KW_ROLES=248, KW_INNER=249, KW_EXCHANGE=250, 
		KW_URI=251, KW_SERVER=252, KW_ADMIN=253, KW_OWNER=254, KW_PRINCIPALS=255, 
		KW_COMPACT=256, KW_COMPACTIONS=257, KW_TRANSACTIONS=258, KW_REWRITE=259, 
		KW_AUTHORIZATION=260, KW_REOPTIMIZATION=261, KW_CONF=262, KW_VALUES=263, 
		KW_RELOAD=264, KW_YEAR=265, KW_QUERY=266, KW_QUARTER=267, KW_MONTH=268, 
		KW_WEEK=269, KW_DAY=270, KW_DOW=271, KW_HOUR=272, KW_MINUTE=273, KW_SECOND=274, 
		KW_START=275, KW_TRANSACTION=276, KW_COMMIT=277, KW_ROLLBACK=278, KW_WORK=279, 
		KW_ONLY=280, KW_WRITE=281, KW_ISOLATION=282, KW_LEVEL=283, KW_SNAPSHOT=284, 
		KW_AUTOCOMMIT=285, KW_CACHE=286, KW_PRIMARY=287, KW_FOREIGN=288, KW_REFERENCES=289, 
		KW_CONSTRAINT=290, KW_ENFORCED=291, KW_VALIDATE=292, KW_NOVALIDATE=293, 
		KW_RELY=294, KW_NORELY=295, KW_UNIQUE=296, KW_KEY=297, KW_ABORT=298, KW_EXTRACT=299, 
		KW_FLOOR=300, KW_MERGE=301, KW_MATCHED=302, KW_REPL=303, KW_DUMP=304, 
		KW_STATUS=305, KW_VECTORIZATION=306, KW_SUMMARY=307, KW_OPERATOR=308, 
		KW_EXPRESSION=309, KW_DETAIL=310, KW_WAIT=311, KW_RESOURCE=312, KW_PLAN=313, 
		KW_QUERY_PARALLELISM=314, KW_PLANS=315, KW_ACTIVATE=316, KW_DEFAULT=317, 
		KW_CHECK=318, KW_POOL=319, KW_MOVE=320, KW_DO=321, KW_ALLOC_FRACTION=322, 
		KW_SCHEDULING_POLICY=323, KW_PATH=324, KW_MAPPING=325, KW_WORKLOAD=326, 
		KW_MANAGEMENT=327, KW_ACTIVE=328, KW_UNMANAGED=329, KW_APPLICATION=330, 
		KW_SYNC=331, DOT=332, COLON=333, COMMA=334, SEMICOLON=335, LPAREN=336, 
		RPAREN=337, LSQUARE=338, RSQUARE=339, LCURLY=340, RCURLY=341, EQUAL=342, 
		EQUAL_NS=343, NOTEQUAL=344, LESSTHANOREQUALTO=345, LESSTHAN=346, GREATERTHANOREQUALTO=347, 
		GREATERTHAN=348, DIVIDE=349, PLUS=350, MINUS=351, STAR=352, MOD=353, DIV=354, 
		AMPERSAND=355, TILDE=356, BITWISEOR=357, CONCATENATE=358, BITWISEXOR=359, 
		QUESTION=360, DOLLAR=361, StringLiteral=362, CharSetLiteral=363, IntegralLiteral=364, 
		NumberLiteral=365, ByteLengthLiteral=366, Number=367, Identifier=368, 
		QuotedIdentifier=369, CharSetName=370, WS=371, LINE_COMMENT=372, QUERY_HINT=373, 
		SHOW_HINT=374, HIDDEN_HINT=375;
	public static final int
		RULE_statements = 0, RULE_statementSeparator = 1, RULE_statement = 2, 
		RULE_explainStatement = 3, RULE_explainOption = 4, RULE_vectorizationOnly = 5, 
		RULE_vectorizatonDetail = 6, RULE_execStatement = 7, RULE_loadStatement = 8, 
		RULE_replicationClause = 9, RULE_exportStatement = 10, RULE_importStatement = 11, 
		RULE_replDumpStatement = 12, RULE_replLoadStatement = 13, RULE_replConfigs = 14, 
		RULE_replConfigsList = 15, RULE_replStatusStatement = 16, RULE_ddlStatement = 17, 
		RULE_ifExists = 18, RULE_restrictOrCascade = 19, RULE_ifNotExists = 20, 
		RULE_rewriteEnabled = 21, RULE_rewriteDisabled = 22, RULE_storedAsDirs = 23, 
		RULE_orReplace = 24, RULE_createDatabaseStatement = 25, RULE_dbLocation = 26, 
		RULE_dbProperties = 27, RULE_dbPropertiesList = 28, RULE_switchDatabaseStatement = 29, 
		RULE_dropDatabaseStatement = 30, RULE_databaseComment = 31, RULE_createTableStatement = 32, 
		RULE_truncateTableStatement = 33, RULE_dropTableStatement = 34, RULE_alterStatement = 35, 
		RULE_alterTableStatementSuffix = 36, RULE_alterTblPartitionStatementSuffix = 37, 
		RULE_alterStatementPartitionKeyType = 38, RULE_alterViewStatementSuffix = 39, 
		RULE_alterMaterializedViewStatementSuffix = 40, RULE_alterDatabaseStatementSuffix = 41, 
		RULE_alterDatabaseSuffixProperties = 42, RULE_alterDatabaseSuffixSetOwner = 43, 
		RULE_alterDatabaseSuffixSetLocation = 44, RULE_alterStatementSuffixRename = 45, 
		RULE_alterStatementSuffixAddCol = 46, RULE_alterStatementSuffixAddConstraint = 47, 
		RULE_alterStatementSuffixDropConstraint = 48, RULE_alterStatementSuffixRenameCol = 49, 
		RULE_alterStatementSuffixUpdateStatsCol = 50, RULE_alterStatementSuffixUpdateStats = 51, 
		RULE_alterStatementChangeColPosition = 52, RULE_alterStatementSuffixAddPartitions = 53, 
		RULE_alterStatementSuffixAddPartitionsElement = 54, RULE_alterStatementSuffixTouch = 55, 
		RULE_alterStatementSuffixArchive = 56, RULE_alterStatementSuffixUnArchive = 57, 
		RULE_partitionLocation = 58, RULE_alterStatementSuffixDropPartitions = 59, 
		RULE_alterStatementSuffixProperties = 60, RULE_alterViewSuffixProperties = 61, 
		RULE_alterMaterializedViewSuffixRewrite = 62, RULE_alterMaterializedViewSuffixRebuild = 63, 
		RULE_alterStatementSuffixSerdeProperties = 64, RULE_alterIndexStatementSuffix = 65, 
		RULE_alterStatementSuffixFileFormat = 66, RULE_alterStatementSuffixClusterbySortby = 67, 
		RULE_alterTblPartitionStatementSuffixSkewedLocation = 68, RULE_skewedLocations = 69, 
		RULE_skewedLocationsList = 70, RULE_skewedLocationMap = 71, RULE_alterStatementSuffixLocation = 72, 
		RULE_alterStatementSuffixSkewedby = 73, RULE_alterStatementSuffixExchangePartition = 74, 
		RULE_alterStatementSuffixRenamePart = 75, RULE_alterStatementSuffixStatsPart = 76, 
		RULE_alterStatementSuffixMergeFiles = 77, RULE_alterStatementSuffixBucketNum = 78, 
		RULE_createIndexStatement = 79, RULE_locationPath = 80, RULE_dropIndexStatement = 81, 
		RULE_tablePartitionPrefix = 82, RULE_blocking = 83, RULE_alterStatementSuffixCompact = 84, 
		RULE_alterStatementSuffixSetOwner = 85, RULE_fileFormat = 86, RULE_inputFileFormat = 87, 
		RULE_tabTypeExpr = 88, RULE_partTypeExpr = 89, RULE_tabPartColTypeExpr = 90, 
		RULE_descStatement = 91, RULE_analyzeStatement = 92, RULE_showStatement = 93, 
		RULE_lockStatement = 94, RULE_lockDatabase = 95, RULE_lockMode = 96, RULE_unlockStatement = 97, 
		RULE_unlockDatabase = 98, RULE_createRoleStatement = 99, RULE_dropRoleStatement = 100, 
		RULE_grantPrivileges = 101, RULE_revokePrivileges = 102, RULE_grantRole = 103, 
		RULE_revokeRole = 104, RULE_showRoleGrants = 105, RULE_showRoles = 106, 
		RULE_showCurrentRole = 107, RULE_setRole = 108, RULE_showGrants = 109, 
		RULE_showRolePrincipals = 110, RULE_privilegeIncludeColObject = 111, RULE_privilegeObject = 112, 
		RULE_privObject = 113, RULE_privObjectCols = 114, RULE_privilegeList = 115, 
		RULE_privlegeDef = 116, RULE_privilegeType = 117, RULE_principalSpecification = 118, 
		RULE_principalName = 119, RULE_withGrantOption = 120, RULE_grantOptionFor = 121, 
		RULE_adminOptionFor = 122, RULE_withAdminOption = 123, RULE_metastoreCheck = 124, 
		RULE_resourceList = 125, RULE_resource = 126, RULE_resourceType = 127, 
		RULE_createFunctionStatement = 128, RULE_dropFunctionStatement = 129, 
		RULE_reloadFunctionStatement = 130, RULE_createMacroStatement = 131, RULE_dropMacroStatement = 132, 
		RULE_createViewStatement = 133, RULE_createMaterializedViewStatement = 134, 
		RULE_viewPartition = 135, RULE_dropViewStatement = 136, RULE_dropMaterializedViewStatement = 137, 
		RULE_showFunctionIdentifier = 138, RULE_showStmtIdentifier = 139, RULE_tableComment = 140, 
		RULE_tablePartition = 141, RULE_tableBuckets = 142, RULE_tableSkewed = 143, 
		RULE_rowFormat = 144, RULE_recordReader = 145, RULE_recordWriter = 146, 
		RULE_rowFormatSerde = 147, RULE_rowFormatDelimited = 148, RULE_tableRowFormat = 149, 
		RULE_tablePropertiesPrefixed = 150, RULE_tableProperties = 151, RULE_tablePropertiesList = 152, 
		RULE_keyValueProperty = 153, RULE_keyProperty = 154, RULE_tableRowFormatFieldIdentifier = 155, 
		RULE_tableRowFormatCollItemsIdentifier = 156, RULE_tableRowFormatMapKeysIdentifier = 157, 
		RULE_tableRowFormatLinesIdentifier = 158, RULE_tableRowNullFormat = 159, 
		RULE_tableFileFormat = 160, RULE_tableLocation = 161, RULE_columnNameTypeList = 162, 
		RULE_columnNameTypeOrConstraintList = 163, RULE_columnNameColonTypeList = 164, 
		RULE_columnNameList = 165, RULE_columnName = 166, RULE_extColumnName = 167, 
		RULE_columnNameOrderList = 168, RULE_columnParenthesesList = 169, RULE_enableValidateSpecification = 170, 
		RULE_enableSpecification = 171, RULE_validateSpecification = 172, RULE_enforcedSpecification = 173, 
		RULE_relySpecification = 174, RULE_createConstraint = 175, RULE_alterConstraintWithName = 176, 
		RULE_pkConstraint = 177, RULE_createForeignKey = 178, RULE_alterForeignKeyWithName = 179, 
		RULE_skewedValueElement = 180, RULE_skewedColumnValuePairList = 181, RULE_skewedColumnValuePair = 182, 
		RULE_skewedColumnValues = 183, RULE_skewedColumnValue = 184, RULE_skewedValueLocationElement = 185, 
		RULE_orderSpecification = 186, RULE_nullOrdering = 187, RULE_columnNameOrder = 188, 
		RULE_columnNameCommentList = 189, RULE_columnNameComment = 190, RULE_columnRefOrder = 191, 
		RULE_columnNameType = 192, RULE_columnNameTypeOrConstraint = 193, RULE_tableConstraint = 194, 
		RULE_columnNameTypeConstraint = 195, RULE_columnConstraint = 196, RULE_foreignKeyConstraint = 197, 
		RULE_colConstraint = 198, RULE_alterColumnConstraint = 199, RULE_alterForeignKeyConstraint = 200, 
		RULE_alterColConstraint = 201, RULE_tableConstraintPrimaryKey = 202, RULE_constraintOptsCreate = 203, 
		RULE_constraintOptsAlter = 204, RULE_columnNameColonType = 205, RULE_colType = 206, 
		RULE_colTypeList = 207, RULE_type_db_col = 208, RULE_primitiveType = 209, 
		RULE_listType = 210, RULE_structType = 211, RULE_mapType = 212, RULE_unionType = 213, 
		RULE_setOperator = 214, RULE_queryStatementExpression = 215, RULE_queryStatementExpressionBody = 216, 
		RULE_withClause = 217, RULE_cteStatement = 218, RULE_fromStatement = 219, 
		RULE_singleFromStatement = 220, RULE_regularBody = 221, RULE_atomSelectStatement = 222, 
		RULE_selectStatement = 223, RULE_setOpSelectStatement = 224, RULE_selectStatementWithCTE = 225, 
		RULE_body = 226, RULE_insertClause = 227, RULE_destination = 228, RULE_limitClause = 229, 
		RULE_deleteStatement = 230, RULE_columnAssignmentClause = 231, RULE_setColumnsClause = 232, 
		RULE_updateStatement = 233, RULE_sqlTransactionStatement = 234, RULE_startTransactionStatement = 235, 
		RULE_transactionMode = 236, RULE_transactionAccessMode = 237, RULE_isolationLevel = 238, 
		RULE_levelOfIsolation = 239, RULE_commitStatement = 240, RULE_rollbackStatement = 241, 
		RULE_setAutoCommitStatement = 242, RULE_abortTransactionStatement = 243, 
		RULE_mergeStatement = 244, RULE_whenClauses = 245, RULE_whenNotMatchedClause = 246, 
		RULE_whenMatchedAndClause = 247, RULE_whenMatchedThenClause = 248, RULE_updateOrDelete = 249, 
		RULE_killQueryStatement = 250, RULE_selectClause = 251, RULE_selectList = 252, 
		RULE_selectTrfmClause = 253, RULE_selectItem = 254, RULE_trfmClause = 255, 
		RULE_selectExpression = 256, RULE_selectExpressionList = 257, RULE_window_clause = 258, 
		RULE_window_defn = 259, RULE_window_specification = 260, RULE_window_frame = 261, 
		RULE_window_range_expression = 262, RULE_window_value_expression = 263, 
		RULE_window_frame_start_boundary = 264, RULE_window_frame_boundary = 265, 
		RULE_tableAllColumns = 266, RULE_tableOrColumn = 267, RULE_expressionList = 268, 
		RULE_aliasList = 269, RULE_fromClause = 270, RULE_fromSource = 271, RULE_atomjoinSource = 272, 
		RULE_joinSource = 273, RULE_joinSourcePart = 274, RULE_uniqueJoinSource = 275, 
		RULE_uniqueJoinExpr = 276, RULE_uniqueJoinToken = 277, RULE_joinToken = 278, 
		RULE_lateralView = 279, RULE_tableAlias = 280, RULE_tableBucketSample = 281, 
		RULE_splitSample = 282, RULE_tableSample = 283, RULE_tableSource = 284, 
		RULE_uniqueJoinTableSource = 285, RULE_tableName = 286, RULE_viewName = 287, 
		RULE_subQuerySource = 288, RULE_partitioningSpec = 289, RULE_partitionTableFunctionSource = 290, 
		RULE_partitionedTableFunction = 291, RULE_whereClause = 292, RULE_searchCondition = 293, 
		RULE_valuesClause = 294, RULE_valuesTableConstructor = 295, RULE_valueRowConstructor = 296, 
		RULE_virtualTableSource = 297, RULE_groupByClause = 298, RULE_groupby_expression = 299, 
		RULE_groupByEmpty = 300, RULE_rollupStandard = 301, RULE_rollupOldSyntax = 302, 
		RULE_groupingSetExpression = 303, RULE_groupingSetExpressionMultiple = 304, 
		RULE_groupingExpressionSingle = 305, RULE_havingClause = 306, RULE_havingCondition = 307, 
		RULE_expressionsInParenthesis = 308, RULE_expressionsNotInParenthesis = 309, 
		RULE_expressionPart = 310, RULE_expressions = 311, RULE_columnRefOrderInParenthesis = 312, 
		RULE_columnRefOrderNotInParenthesis = 313, RULE_orderByClause = 314, RULE_clusterByClause = 315, 
		RULE_partitionByClause = 316, RULE_distributeByClause = 317, RULE_sortByClause = 318, 
		RULE_function_ = 319, RULE_functionName = 320, RULE_castExpression = 321, 
		RULE_caseExpression = 322, RULE_whenExpression = 323, RULE_floorExpression = 324, 
		RULE_floorDateQualifiers = 325, RULE_extractExpression = 326, RULE_timeQualifiers = 327, 
		RULE_constant = 328, RULE_stringLiteralSequence = 329, RULE_charSetStringLiteral = 330, 
		RULE_dateLiteral = 331, RULE_timestampLiteral = 332, RULE_timestampLocalTZLiteral = 333, 
		RULE_intervalValue = 334, RULE_intervalLiteral = 335, RULE_intervalExpression = 336, 
		RULE_intervalQualifiers = 337, RULE_atomExpression = 338, RULE_precedenceUnaryOperator = 339, 
		RULE_isCondition = 340, RULE_precedenceBitwiseXorOperator = 341, RULE_precedenceStarOperator = 342, 
		RULE_precedencePlusOperator = 343, RULE_precedenceConcatenateOperator = 344, 
		RULE_precedenceAmpersandOperator = 345, RULE_precedenceBitwiseOrOperator = 346, 
		RULE_precedenceRegexpOperator = 347, RULE_precedenceComparisonOperator = 348, 
		RULE_precedenceNotOperator = 349, RULE_precedenceLogicOperator = 350, 
		RULE_expression = 351, RULE_precedenceSimilarExpressionIn = 352, RULE_subQueryExpression = 353, 
		RULE_booleanValue = 354, RULE_booleanValueTok = 355, RULE_tableOrPartition = 356, 
		RULE_partitionSpec = 357, RULE_partitionVal = 358, RULE_dropPartitionSpec = 359, 
		RULE_dropPartitionVal = 360, RULE_dropPartitionOperator = 361, RULE_sysFuncNames = 362, 
		RULE_descFuncNames = 363, RULE_identifier = 364, RULE_functionIdentifier = 365, 
		RULE_principalIdentifier = 366, RULE_nonReserved = 367, RULE_sql11ReservedKeywordsUsedAsFunctionName = 368;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statementSeparator", "statement", "explainStatement", 
			"explainOption", "vectorizationOnly", "vectorizatonDetail", "execStatement", 
			"loadStatement", "replicationClause", "exportStatement", "importStatement", 
			"replDumpStatement", "replLoadStatement", "replConfigs", "replConfigsList", 
			"replStatusStatement", "ddlStatement", "ifExists", "restrictOrCascade", 
			"ifNotExists", "rewriteEnabled", "rewriteDisabled", "storedAsDirs", "orReplace", 
			"createDatabaseStatement", "dbLocation", "dbProperties", "dbPropertiesList", 
			"switchDatabaseStatement", "dropDatabaseStatement", "databaseComment", 
			"createTableStatement", "truncateTableStatement", "dropTableStatement", 
			"alterStatement", "alterTableStatementSuffix", "alterTblPartitionStatementSuffix", 
			"alterStatementPartitionKeyType", "alterViewStatementSuffix", "alterMaterializedViewStatementSuffix", 
			"alterDatabaseStatementSuffix", "alterDatabaseSuffixProperties", "alterDatabaseSuffixSetOwner", 
			"alterDatabaseSuffixSetLocation", "alterStatementSuffixRename", "alterStatementSuffixAddCol", 
			"alterStatementSuffixAddConstraint", "alterStatementSuffixDropConstraint", 
			"alterStatementSuffixRenameCol", "alterStatementSuffixUpdateStatsCol", 
			"alterStatementSuffixUpdateStats", "alterStatementChangeColPosition", 
			"alterStatementSuffixAddPartitions", "alterStatementSuffixAddPartitionsElement", 
			"alterStatementSuffixTouch", "alterStatementSuffixArchive", "alterStatementSuffixUnArchive", 
			"partitionLocation", "alterStatementSuffixDropPartitions", "alterStatementSuffixProperties", 
			"alterViewSuffixProperties", "alterMaterializedViewSuffixRewrite", "alterMaterializedViewSuffixRebuild", 
			"alterStatementSuffixSerdeProperties", "alterIndexStatementSuffix", "alterStatementSuffixFileFormat", 
			"alterStatementSuffixClusterbySortby", "alterTblPartitionStatementSuffixSkewedLocation", 
			"skewedLocations", "skewedLocationsList", "skewedLocationMap", "alterStatementSuffixLocation", 
			"alterStatementSuffixSkewedby", "alterStatementSuffixExchangePartition", 
			"alterStatementSuffixRenamePart", "alterStatementSuffixStatsPart", "alterStatementSuffixMergeFiles", 
			"alterStatementSuffixBucketNum", "createIndexStatement", "locationPath", 
			"dropIndexStatement", "tablePartitionPrefix", "blocking", "alterStatementSuffixCompact", 
			"alterStatementSuffixSetOwner", "fileFormat", "inputFileFormat", "tabTypeExpr", 
			"partTypeExpr", "tabPartColTypeExpr", "descStatement", "analyzeStatement", 
			"showStatement", "lockStatement", "lockDatabase", "lockMode", "unlockStatement", 
			"unlockDatabase", "createRoleStatement", "dropRoleStatement", "grantPrivileges", 
			"revokePrivileges", "grantRole", "revokeRole", "showRoleGrants", "showRoles", 
			"showCurrentRole", "setRole", "showGrants", "showRolePrincipals", "privilegeIncludeColObject", 
			"privilegeObject", "privObject", "privObjectCols", "privilegeList", "privlegeDef", 
			"privilegeType", "principalSpecification", "principalName", "withGrantOption", 
			"grantOptionFor", "adminOptionFor", "withAdminOption", "metastoreCheck", 
			"resourceList", "resource", "resourceType", "createFunctionStatement", 
			"dropFunctionStatement", "reloadFunctionStatement", "createMacroStatement", 
			"dropMacroStatement", "createViewStatement", "createMaterializedViewStatement", 
			"viewPartition", "dropViewStatement", "dropMaterializedViewStatement", 
			"showFunctionIdentifier", "showStmtIdentifier", "tableComment", "tablePartition", 
			"tableBuckets", "tableSkewed", "rowFormat", "recordReader", "recordWriter", 
			"rowFormatSerde", "rowFormatDelimited", "tableRowFormat", "tablePropertiesPrefixed", 
			"tableProperties", "tablePropertiesList", "keyValueProperty", "keyProperty", 
			"tableRowFormatFieldIdentifier", "tableRowFormatCollItemsIdentifier", 
			"tableRowFormatMapKeysIdentifier", "tableRowFormatLinesIdentifier", "tableRowNullFormat", 
			"tableFileFormat", "tableLocation", "columnNameTypeList", "columnNameTypeOrConstraintList", 
			"columnNameColonTypeList", "columnNameList", "columnName", "extColumnName", 
			"columnNameOrderList", "columnParenthesesList", "enableValidateSpecification", 
			"enableSpecification", "validateSpecification", "enforcedSpecification", 
			"relySpecification", "createConstraint", "alterConstraintWithName", "pkConstraint", 
			"createForeignKey", "alterForeignKeyWithName", "skewedValueElement", 
			"skewedColumnValuePairList", "skewedColumnValuePair", "skewedColumnValues", 
			"skewedColumnValue", "skewedValueLocationElement", "orderSpecification", 
			"nullOrdering", "columnNameOrder", "columnNameCommentList", "columnNameComment", 
			"columnRefOrder", "columnNameType", "columnNameTypeOrConstraint", "tableConstraint", 
			"columnNameTypeConstraint", "columnConstraint", "foreignKeyConstraint", 
			"colConstraint", "alterColumnConstraint", "alterForeignKeyConstraint", 
			"alterColConstraint", "tableConstraintPrimaryKey", "constraintOptsCreate", 
			"constraintOptsAlter", "columnNameColonType", "colType", "colTypeList", 
			"type_db_col", "primitiveType", "listType", "structType", "mapType", 
			"unionType", "setOperator", "queryStatementExpression", "queryStatementExpressionBody", 
			"withClause", "cteStatement", "fromStatement", "singleFromStatement", 
			"regularBody", "atomSelectStatement", "selectStatement", "setOpSelectStatement", 
			"selectStatementWithCTE", "body", "insertClause", "destination", "limitClause", 
			"deleteStatement", "columnAssignmentClause", "setColumnsClause", "updateStatement", 
			"sqlTransactionStatement", "startTransactionStatement", "transactionMode", 
			"transactionAccessMode", "isolationLevel", "levelOfIsolation", "commitStatement", 
			"rollbackStatement", "setAutoCommitStatement", "abortTransactionStatement", 
			"mergeStatement", "whenClauses", "whenNotMatchedClause", "whenMatchedAndClause", 
			"whenMatchedThenClause", "updateOrDelete", "killQueryStatement", "selectClause", 
			"selectList", "selectTrfmClause", "selectItem", "trfmClause", "selectExpression", 
			"selectExpressionList", "window_clause", "window_defn", "window_specification", 
			"window_frame", "window_range_expression", "window_value_expression", 
			"window_frame_start_boundary", "window_frame_boundary", "tableAllColumns", 
			"tableOrColumn", "expressionList", "aliasList", "fromClause", "fromSource", 
			"atomjoinSource", "joinSource", "joinSourcePart", "uniqueJoinSource", 
			"uniqueJoinExpr", "uniqueJoinToken", "joinToken", "lateralView", "tableAlias", 
			"tableBucketSample", "splitSample", "tableSample", "tableSource", "uniqueJoinTableSource", 
			"tableName", "viewName", "subQuerySource", "partitioningSpec", "partitionTableFunctionSource", 
			"partitionedTableFunction", "whereClause", "searchCondition", "valuesClause", 
			"valuesTableConstructor", "valueRowConstructor", "virtualTableSource", 
			"groupByClause", "groupby_expression", "groupByEmpty", "rollupStandard", 
			"rollupOldSyntax", "groupingSetExpression", "groupingSetExpressionMultiple", 
			"groupingExpressionSingle", "havingClause", "havingCondition", "expressionsInParenthesis", 
			"expressionsNotInParenthesis", "expressionPart", "expressions", "columnRefOrderInParenthesis", 
			"columnRefOrderNotInParenthesis", "orderByClause", "clusterByClause", 
			"partitionByClause", "distributeByClause", "sortByClause", "function_", 
			"functionName", "castExpression", "caseExpression", "whenExpression", 
			"floorExpression", "floorDateQualifiers", "extractExpression", "timeQualifiers", 
			"constant", "stringLiteralSequence", "charSetStringLiteral", "dateLiteral", 
			"timestampLiteral", "timestampLocalTZLiteral", "intervalValue", "intervalLiteral", 
			"intervalExpression", "intervalQualifiers", "atomExpression", "precedenceUnaryOperator", 
			"isCondition", "precedenceBitwiseXorOperator", "precedenceStarOperator", 
			"precedencePlusOperator", "precedenceConcatenateOperator", "precedenceAmpersandOperator", 
			"precedenceBitwiseOrOperator", "precedenceRegexpOperator", "precedenceComparisonOperator", 
			"precedenceNotOperator", "precedenceLogicOperator", "expression", "precedenceSimilarExpressionIn", 
			"subQueryExpression", "booleanValue", "booleanValueTok", "tableOrPartition", 
			"partitionSpec", "partitionVal", "dropPartitionSpec", "dropPartitionVal", 
			"dropPartitionOperator", "sysFuncNames", "descFuncNames", "identifier", 
			"functionIdentifier", "principalIdentifier", "nonReserved", "sql11ReservedKeywordsUsedAsFunctionName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TRUE'", "'FALSE'", "'ALL'", "'NONE'", "'AND'", "'OR'", null, 
			"'LIKE'", "'ANY'", "'IF'", "'EXISTS'", "'ASC'", "'DESC'", "'NULLS'", 
			"'LAST'", "'ORDER'", "'GROUP'", "'BY'", "'HAVING'", "'WHERE'", "'FROM'", 
			"'AS'", "'SELECT'", "'DISTINCT'", "'INSERT'", "'OVERWRITE'", "'OUTER'", 
			"'UNIQUEJOIN'", "'PRESERVE'", "'JOIN'", "'LEFT'", "'RIGHT'", "'FULL'", 
			"'ON'", "'PARTITION'", "'PARTITIONS'", "'TABLE'", "'TABLES'", "'COLUMNS'", 
			"'INDEX'", "'INDEXES'", "'REBUILD'", "'FUNCTIONS'", "'SHOW'", "'MSCK'", 
			"'REPAIR'", "'DIRECTORY'", "'LOCAL'", "'TRANSFORM'", "'USING'", "'CLUSTER'", 
			"'DISTRIBUTE'", "'SORT'", "'UNION'", "'EXCEPT'", "'LOAD'", "'EXPORT'", 
			"'IMPORT'", "'REPLICATION'", "'METADATA'", "'DATA'", "'INPATH'", "'IS'", 
			"'NULL'", "'CREATE'", "'EXTERNAL'", "'ALTER'", "'CHANGE'", "'COLUMN'", 
			"'FIRST'", "'AFTER'", "'DESCRIBE'", "'DROP'", "'RENAME'", "'TO'", "'COMMENT'", 
			"'BOOLEAN'", "'TINYINT'", "'SMALLINT'", null, "'BIGINT'", "'FLOAT'", 
			"'DOUBLE'", "'PRECISION'", "'DATE'", "'DATETIME'", "'TIMESTAMP'", "'TIMESTAMPLOCALTZ'", 
			"'TIME'", "'ZONE'", "'INTERVAL'", null, "'STRING'", "'CHAR'", "'VARCHAR'", 
			"'ARRAY'", "'STRUCT'", "'MAP'", "'UNIONTYPE'", "'REDUCE'", "'PARTITIONED'", 
			"'CLUSTERED'", "'SORTED'", "'INTO'", "'BUCKETS'", "'ROW'", "'ROWS'", 
			"'FORMAT'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'ESCAPED'", "'COLLECTION'", 
			"'ITEMS'", "'KEYS'", "'$KEY$'", "'KILL'", "'LINES'", "'STORED'", "'FILEFORMAT'", 
			"'INPUTFORMAT'", "'OUTPUTFORMAT'", "'INPUTDRIVER'", "'OUTPUTDRIVER'", 
			"'ENABLE'", "'DISABLE'", "'LOCATION'", "'TABLESAMPLE'", "'BUCKET'", "'OUT'", 
			"'OF'", "'PERCENT'", "'CAST'", "'ADD'", "'REPLACE'", "'RLIKE'", "'REGEXP'", 
			"'TEMPORARY'", "'FUNCTION'", "'MACRO'", "'FILE'", "'JAR'", "'EXPLAIN'", 
			"'EXTENDED'", "'FORMATTED'", "'DEPENDENCY'", "'LOGICAL'", "'SERDE'", 
			"'WITH'", "'DEFERRED'", "'SERDEPROPERTIES'", "'DBPROPERTIES'", "'LIMIT'", 
			"'OFFSET'", "'SET'", "'UNSET'", "'TBLPROPERTIES'", "'IDXPROPERTIES'", 
			"'$VALUE$'", "'$ELEM$'", "'DEFINED'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
			"'END'", "'MAPJOIN'", "'STREAMTABLE'", "'CLUSTERSTATUS'", "'UTC'", "'UTC_TMESTAMP'", 
			"'LONG'", "'DELETE'", "'PLUS'", "'MINUS'", "'FETCH'", "'INTERSECT'", 
			"'VIEW'", "'VIEWS'", "'IN'", "'DATABASE'", "'DATABASES'", "'MATERIALIZED'", 
			"'SCHEMA'", "'SCHEMAS'", "'GRANT'", "'REVOKE'", "'SSL'", "'UNDO'", "'LOCK'", 
			"'LOCKS'", "'UNLOCK'", "'SHARED'", "'EXCLUSIVE'", "'PROCEDURE'", "'UNSIGNED'", 
			"'WHILE'", "'READ'", "'READS'", "'PURGE'", "'RANGE'", "'ANALYZE'", "'BEFORE'", 
			"'BETWEEN'", "'BOTH'", "'BINARY'", "'CROSS'", "'CONTINUE'", "'CURSOR'", 
			"'TRIGGER'", "'RECORDREADER'", "'RECORDWRITER'", "'SEMI'", "'LATERAL'", 
			"'TOUCH'", "'ARCHIVE'", "'UNARCHIVE'", "'COMPUTE'", "'STATISTICS'", "'USE'", 
			"'OPTION'", "'CONCATENATE'", "'SHOW_DATABASE'", "'UPDATE'", "'RESTRICT'", 
			"'CASCADE'", "'SKEWED'", "'ROLLUP'", "'CUBE'", "'DIRECTORIES'", "'FOR'", 
			"'WINDOW'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", 
			"'CURRENT_DATE'", "'CURRENT_TIMESTAMP'", "'LESS'", "'MORE'", "'OVER'", 
			"'GROUPING'", "'SETS'", "'TRUNCATE'", "'NOSCAN'", "'USER'", "'ROLE'", 
			"'ROLES'", "'INNER'", "'EXCHANGE'", "'URI'", "'SERVER'", "'ADMIN'", "'OWNER'", 
			"'PRINCIPALS'", "'COMPACT'", "'COMPACTIONS'", "'TRANSACTIONS'", "'REWRITE'", 
			"'AUTHORIZATION'", "'REOPTIMIZATION'", "'CONF'", "'VALUES'", "'RELOAD'", 
			null, "'QUERY'", "'QUARTER'", null, null, null, "'DAYOFWEEK'", null, 
			null, null, "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'WORK'", 
			"'ONLY'", "'WRITE'", "'ISOLATION'", "'LEVEL'", "'SNAPSHOT'", "'AUTOCOMMIT'", 
			"'CACHE'", "'PRIMARY'", "'FOREIGN'", "'REFERENCES'", "'CONSTRAINT'", 
			"'ENFORCED'", "'VALIDATE'", "'NOVALIDATE'", "'RELY'", "'NORELY'", "'UNIQUE'", 
			"'KEY'", "'ABORT'", "'EXTRACT'", "'FLOOR'", "'MERGE'", "'MATCHED'", "'REPL'", 
			"'DUMP'", "'STATUS'", "'VECTORIZATION'", "'SUMMARY'", "'OPERATOR'", "'EXPRESSION'", 
			"'DETAIL'", "'WAIT'", "'RESOURCE'", "'PLAN'", "'QUERY_PARALLELISM'", 
			"'PLANS'", "'ACTIVATE'", "'DEFAULT'", "'CHECK'", "'POOL'", "'MOVE'", 
			"'DO'", "'ALLOC_FRACTION'", "'SCHEDULING_POLICY'", "'PATH'", "'MAPPING'", 
			"'WORKLOAD'", "'MANAGEMENT'", "'ACTIVE'", "'UNMANAGED'", "'APPLICATION'", 
			"'SYNC'", "'.'", "':'", "','", "';'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", null, "'<=>'", null, "'<='", "'<'", "'>='", "'>'", "'/'", "'+'", 
			"'-'", "'*'", "'%'", "'DIV'", "'&'", "'~'", "'|'", "'||'", "'^'", "'?'", 
			"'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_TRUE", "KW_FALSE", "KW_ALL", "KW_NONE", "KW_AND", "KW_OR", 
			"KW_NOT", "KW_LIKE", "KW_ANY", "KW_IF", "KW_EXISTS", "KW_ASC", "KW_DESC", 
			"KW_NULLS", "KW_LAST", "KW_ORDER", "KW_GROUP", "KW_BY", "KW_HAVING", 
			"KW_WHERE", "KW_FROM", "KW_AS", "KW_SELECT", "KW_DISTINCT", "KW_INSERT", 
			"KW_OVERWRITE", "KW_OUTER", "KW_UNIQUEJOIN", "KW_PRESERVE", "KW_JOIN", 
			"KW_LEFT", "KW_RIGHT", "KW_FULL", "KW_ON", "KW_PARTITION", "KW_PARTITIONS", 
			"KW_TABLE", "KW_TABLES", "KW_COLUMNS", "KW_INDEX", "KW_INDEXES", "KW_REBUILD", 
			"KW_FUNCTIONS", "KW_SHOW", "KW_MSCK", "KW_REPAIR", "KW_DIRECTORY", "KW_LOCAL", 
			"KW_TRANSFORM", "KW_USING", "KW_CLUSTER", "KW_DISTRIBUTE", "KW_SORT", 
			"KW_UNION", "KW_EXCEPT", "KW_LOAD", "KW_EXPORT", "KW_IMPORT", "KW_REPLICATION", 
			"KW_METADATA", "KW_DATA", "KW_INPATH", "KW_IS", "KW_NULL", "KW_CREATE", 
			"KW_EXTERNAL", "KW_ALTER", "KW_CHANGE", "KW_COLUMN", "KW_FIRST", "KW_AFTER", 
			"KW_DESCRIBE", "KW_DROP", "KW_RENAME", "KW_TO", "KW_COMMENT", "KW_BOOLEAN", 
			"KW_TINYINT", "KW_SMALLINT", "KW_INT", "KW_BIGINT", "KW_FLOAT", "KW_DOUBLE", 
			"KW_PRECISION", "KW_DATE", "KW_DATETIME", "KW_TIMESTAMP", "KW_TIMESTAMPLOCALTZ", 
			"KW_TIME", "KW_ZONE", "KW_INTERVAL", "KW_DECIMAL", "KW_STRING", "KW_CHAR", 
			"KW_VARCHAR", "KW_ARRAY", "KW_STRUCT", "KW_MAP", "KW_UNIONTYPE", "KW_REDUCE", 
			"KW_PARTITIONED", "KW_CLUSTERED", "KW_SORTED", "KW_INTO", "KW_BUCKETS", 
			"KW_ROW", "KW_ROWS", "KW_FORMAT", "KW_DELIMITED", "KW_FIELDS", "KW_TERMINATED", 
			"KW_ESCAPED", "KW_COLLECTION", "KW_ITEMS", "KW_KEYS", "KW_KEY_TYPE", 
			"KW_KILL", "KW_LINES", "KW_STORED", "KW_FILEFORMAT", "KW_INPUTFORMAT", 
			"KW_OUTPUTFORMAT", "KW_INPUTDRIVER", "KW_OUTPUTDRIVER", "KW_ENABLE", 
			"KW_DISABLE", "KW_LOCATION", "KW_TABLESAMPLE", "KW_BUCKET", "KW_OUT", 
			"KW_OF", "KW_PERCENT", "KW_CAST", "KW_ADD", "KW_REPLACE", "KW_RLIKE", 
			"KW_REGEXP", "KW_TEMPORARY", "KW_FUNCTION", "KW_MACRO", "KW_FILE", "KW_JAR", 
			"KW_EXPLAIN", "KW_EXTENDED", "KW_FORMATTED", "KW_DEPENDENCY", "KW_LOGICAL", 
			"KW_SERDE", "KW_WITH", "KW_DEFERRED", "KW_SERDEPROPERTIES", "KW_DBPROPERTIES", 
			"KW_LIMIT", "KW_OFFSET", "KW_SET", "KW_UNSET", "KW_TBLPROPERTIES", "KW_IDXPROPERTIES", 
			"KW_VALUE_TYPE", "KW_ELEM_TYPE", "KW_DEFINED", "KW_CASE", "KW_WHEN", 
			"KW_THEN", "KW_ELSE", "KW_END", "KW_MAPJOIN", "KW_STREAMTABLE", "KW_CLUSTERSTATUS", 
			"KW_UTC", "KW_UTCTIMESTAMP", "KW_LONG", "KW_DELETE", "KW_PLUS", "KW_MINUS", 
			"KW_FETCH", "KW_INTERSECT", "KW_VIEW", "KW_VIEWS", "KW_IN", "KW_DATABASE", 
			"KW_DATABASES", "KW_MATERIALIZED", "KW_SCHEMA", "KW_SCHEMAS", "KW_GRANT", 
			"KW_REVOKE", "KW_SSL", "KW_UNDO", "KW_LOCK", "KW_LOCKS", "KW_UNLOCK", 
			"KW_SHARED", "KW_EXCLUSIVE", "KW_PROCEDURE", "KW_UNSIGNED", "KW_WHILE", 
			"KW_READ", "KW_READS", "KW_PURGE", "KW_RANGE", "KW_ANALYZE", "KW_BEFORE", 
			"KW_BETWEEN", "KW_BOTH", "KW_BINARY", "KW_CROSS", "KW_CONTINUE", "KW_CURSOR", 
			"KW_TRIGGER", "KW_RECORDREADER", "KW_RECORDWRITER", "KW_SEMI", "KW_LATERAL", 
			"KW_TOUCH", "KW_ARCHIVE", "KW_UNARCHIVE", "KW_COMPUTE", "KW_STATISTICS", 
			"KW_USE", "KW_OPTION", "KW_CONCATENATE", "KW_SHOW_DATABASE", "KW_UPDATE", 
			"KW_RESTRICT", "KW_CASCADE", "KW_SKEWED", "KW_ROLLUP", "KW_CUBE", "KW_DIRECTORIES", 
			"KW_FOR", "KW_WINDOW", "KW_UNBOUNDED", "KW_PRECEDING", "KW_FOLLOWING", 
			"KW_CURRENT", "KW_CURRENT_DATE", "KW_CURRENT_TIMESTAMP", "KW_LESS", "KW_MORE", 
			"KW_OVER", "KW_GROUPING", "KW_SETS", "KW_TRUNCATE", "KW_NOSCAN", "KW_USER", 
			"KW_ROLE", "KW_ROLES", "KW_INNER", "KW_EXCHANGE", "KW_URI", "KW_SERVER", 
			"KW_ADMIN", "KW_OWNER", "KW_PRINCIPALS", "KW_COMPACT", "KW_COMPACTIONS", 
			"KW_TRANSACTIONS", "KW_REWRITE", "KW_AUTHORIZATION", "KW_REOPTIMIZATION", 
			"KW_CONF", "KW_VALUES", "KW_RELOAD", "KW_YEAR", "KW_QUERY", "KW_QUARTER", 
			"KW_MONTH", "KW_WEEK", "KW_DAY", "KW_DOW", "KW_HOUR", "KW_MINUTE", "KW_SECOND", 
			"KW_START", "KW_TRANSACTION", "KW_COMMIT", "KW_ROLLBACK", "KW_WORK", 
			"KW_ONLY", "KW_WRITE", "KW_ISOLATION", "KW_LEVEL", "KW_SNAPSHOT", "KW_AUTOCOMMIT", 
			"KW_CACHE", "KW_PRIMARY", "KW_FOREIGN", "KW_REFERENCES", "KW_CONSTRAINT", 
			"KW_ENFORCED", "KW_VALIDATE", "KW_NOVALIDATE", "KW_RELY", "KW_NORELY", 
			"KW_UNIQUE", "KW_KEY", "KW_ABORT", "KW_EXTRACT", "KW_FLOOR", "KW_MERGE", 
			"KW_MATCHED", "KW_REPL", "KW_DUMP", "KW_STATUS", "KW_VECTORIZATION", 
			"KW_SUMMARY", "KW_OPERATOR", "KW_EXPRESSION", "KW_DETAIL", "KW_WAIT", 
			"KW_RESOURCE", "KW_PLAN", "KW_QUERY_PARALLELISM", "KW_PLANS", "KW_ACTIVATE", 
			"KW_DEFAULT", "KW_CHECK", "KW_POOL", "KW_MOVE", "KW_DO", "KW_ALLOC_FRACTION", 
			"KW_SCHEDULING_POLICY", "KW_PATH", "KW_MAPPING", "KW_WORKLOAD", "KW_MANAGEMENT", 
			"KW_ACTIVE", "KW_UNMANAGED", "KW_APPLICATION", "KW_SYNC", "DOT", "COLON", 
			"COMMA", "SEMICOLON", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", 
			"RCURLY", "EQUAL", "EQUAL_NS", "NOTEQUAL", "LESSTHANOREQUALTO", "LESSTHAN", 
			"GREATERTHANOREQUALTO", "GREATERTHAN", "DIVIDE", "PLUS", "MINUS", "STAR", 
			"MOD", "DIV", "AMPERSAND", "TILDE", "BITWISEOR", "CONCATENATE", "BITWISEXOR", 
			"QUESTION", "DOLLAR", "StringLiteral", "CharSetLiteral", "IntegralLiteral", 
			"NumberLiteral", "ByteLengthLiteral", "Number", "Identifier", "QuotedIdentifier", 
			"CharSetName", "WS", "LINE_COMMENT", "QUERY_HINT", "SHOW_HINT", "HIDDEN_HINT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HiveParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HiveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HiveParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementSeparatorContext> statementSeparator() {
			return getRuleContexts(StatementSeparatorContext.class);
		}
		public StatementSeparatorContext statementSeparator(int i) {
			return getRuleContext(StatementSeparatorContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_DESC) | (1L << KW_FROM) | (1L << KW_SELECT) | (1L << KW_INSERT) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_IMPORT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KW_CREATE - 65)) | (1L << (KW_ALTER - 65)) | (1L << (KW_DESCRIBE - 65)) | (1L << (KW_DROP - 65)) | (1L << (KW_MAP - 65)) | (1L << (KW_REDUCE - 65)) | (1L << (KW_KILL - 65)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (KW_EXPLAIN - 143)) | (1L << (KW_WITH - 143)) | (1L << (KW_SET - 143)) | (1L << (KW_DELETE - 143)) | (1L << (KW_GRANT - 143)) | (1L << (KW_REVOKE - 143)) | (1L << (KW_LOCK - 143)) | (1L << (KW_UNLOCK - 143)) | (1L << (KW_ANALYZE - 143)))) != 0) || ((((_la - 220)) & ~0x3f) == 0 && ((1L << (_la - 220)) & ((1L << (KW_USE - 220)) | (1L << (KW_UPDATE - 220)) | (1L << (KW_TRUNCATE - 220)) | (1L << (KW_RELOAD - 220)) | (1L << (KW_START - 220)) | (1L << (KW_COMMIT - 220)) | (1L << (KW_ROLLBACK - 220)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (KW_ABORT - 298)) | (1L << (KW_MERGE - 298)) | (1L << (KW_REPL - 298)) | (1L << (LPAREN - 298)))) != 0)) {
				{
				{
				setState(738);
				statement();
				setState(739);
				statementSeparator();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSeparatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(HiveParser.SEMICOLON, 0); }
		public StatementSeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeparator; }
	}

	public final StatementSeparatorContext statementSeparator() throws RecognitionException {
		StatementSeparatorContext _localctx = new StatementSeparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementSeparator);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(SEMICOLON);
				}
				break;
			case EOF:
			case KW_DESC:
			case KW_FROM:
			case KW_SELECT:
			case KW_INSERT:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_MAP:
			case KW_REDUCE:
			case KW_KILL:
			case KW_EXPLAIN:
			case KW_WITH:
			case KW_SET:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_TRUNCATE:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExplainStatementContext explainStatement() {
			return getRuleContext(ExplainStatementContext.class,0);
		}
		public ExecStatementContext execStatement() {
			return getRuleContext(ExecStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_EXPLAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				explainStatement();
				}
				break;
			case KW_DESC:
			case KW_FROM:
			case KW_SELECT:
			case KW_INSERT:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_MAP:
			case KW_REDUCE:
			case KW_KILL:
			case KW_WITH:
			case KW_SET:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_TRUNCATE:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				execStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainStatementContext extends ParserRuleContext {
		public TerminalNode KW_EXPLAIN() { return getToken(HiveParser.KW_EXPLAIN, 0); }
		public ExecStatementContext execStatement() {
			return getRuleContext(ExecStatementContext.class,0);
		}
		public TerminalNode KW_REWRITE() { return getToken(HiveParser.KW_REWRITE, 0); }
		public QueryStatementExpressionContext queryStatementExpression() {
			return getRuleContext(QueryStatementExpressionContext.class,0);
		}
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainStatement; }
	}

	public final ExplainStatementContext explainStatement() throws RecognitionException {
		ExplainStatementContext _localctx = new ExplainStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explainStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(KW_EXPLAIN);
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DESC:
			case KW_FROM:
			case KW_SELECT:
			case KW_INSERT:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_MAP:
			case KW_REDUCE:
			case KW_KILL:
			case KW_EXTENDED:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_WITH:
			case KW_SET:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_TRUNCATE:
			case KW_AUTHORIZATION:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case KW_VECTORIZATION:
			case LPAREN:
				{
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(757);
						explainOption();
						}
						} 
					}
					setState(762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(763);
				execStatement();
				}
				break;
			case KW_REWRITE:
				{
				setState(764);
				match(KW_REWRITE);
				setState(765);
				queryStatementExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public TerminalNode KW_EXTENDED() { return getToken(HiveParser.KW_EXTENDED, 0); }
		public TerminalNode KW_FORMATTED() { return getToken(HiveParser.KW_FORMATTED, 0); }
		public TerminalNode KW_DEPENDENCY() { return getToken(HiveParser.KW_DEPENDENCY, 0); }
		public TerminalNode KW_LOGICAL() { return getToken(HiveParser.KW_LOGICAL, 0); }
		public TerminalNode KW_AUTHORIZATION() { return getToken(HiveParser.KW_AUTHORIZATION, 0); }
		public TerminalNode KW_ANALYZE() { return getToken(HiveParser.KW_ANALYZE, 0); }
		public TerminalNode KW_REOPTIMIZATION() { return getToken(HiveParser.KW_REOPTIMIZATION, 0); }
		public TerminalNode KW_VECTORIZATION() { return getToken(HiveParser.KW_VECTORIZATION, 0); }
		public VectorizationOnlyContext vectorizationOnly() {
			return getRuleContext(VectorizationOnlyContext.class,0);
		}
		public VectorizatonDetailContext vectorizatonDetail() {
			return getRuleContext(VectorizatonDetailContext.class,0);
		}
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_explainOption);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_EXTENDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(KW_EXTENDED);
				}
				break;
			case KW_FORMATTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(KW_FORMATTED);
				}
				break;
			case KW_DEPENDENCY:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				match(KW_DEPENDENCY);
				}
				break;
			case KW_LOGICAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				match(KW_LOGICAL);
				}
				break;
			case KW_AUTHORIZATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(772);
				match(KW_AUTHORIZATION);
				}
				break;
			case KW_ANALYZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(773);
				match(KW_ANALYZE);
				}
				break;
			case KW_REOPTIMIZATION:
				enterOuterAlt(_localctx, 7);
				{
				setState(774);
				match(KW_REOPTIMIZATION);
				}
				break;
			case KW_VECTORIZATION:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(775);
				match(KW_VECTORIZATION);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ONLY) {
					{
					setState(776);
					vectorizationOnly();
					}
				}

				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (KW_SUMMARY - 307)) | (1L << (KW_OPERATOR - 307)) | (1L << (KW_EXPRESSION - 307)) | (1L << (KW_DETAIL - 307)))) != 0)) {
					{
					setState(779);
					vectorizatonDetail();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorizationOnlyContext extends ParserRuleContext {
		public TerminalNode KW_ONLY() { return getToken(HiveParser.KW_ONLY, 0); }
		public VectorizationOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorizationOnly; }
	}

	public final VectorizationOnlyContext vectorizationOnly() throws RecognitionException {
		VectorizationOnlyContext _localctx = new VectorizationOnlyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vectorizationOnly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(KW_ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorizatonDetailContext extends ParserRuleContext {
		public TerminalNode KW_SUMMARY() { return getToken(HiveParser.KW_SUMMARY, 0); }
		public TerminalNode KW_OPERATOR() { return getToken(HiveParser.KW_OPERATOR, 0); }
		public TerminalNode KW_EXPRESSION() { return getToken(HiveParser.KW_EXPRESSION, 0); }
		public TerminalNode KW_DETAIL() { return getToken(HiveParser.KW_DETAIL, 0); }
		public VectorizatonDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorizatonDetail; }
	}

	public final VectorizatonDetailContext vectorizatonDetail() throws RecognitionException {
		VectorizatonDetailContext _localctx = new VectorizatonDetailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vectorizatonDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_la = _input.LA(1);
			if ( !(((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (KW_SUMMARY - 307)) | (1L << (KW_OPERATOR - 307)) | (1L << (KW_EXPRESSION - 307)) | (1L << (KW_DETAIL - 307)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecStatementContext extends ParserRuleContext {
		public QueryStatementExpressionContext queryStatementExpression() {
			return getRuleContext(QueryStatementExpressionContext.class,0);
		}
		public LoadStatementContext loadStatement() {
			return getRuleContext(LoadStatementContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ReplDumpStatementContext replDumpStatement() {
			return getRuleContext(ReplDumpStatementContext.class,0);
		}
		public ReplLoadStatementContext replLoadStatement() {
			return getRuleContext(ReplLoadStatementContext.class,0);
		}
		public ReplStatusStatementContext replStatusStatement() {
			return getRuleContext(ReplStatusStatementContext.class,0);
		}
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public SqlTransactionStatementContext sqlTransactionStatement() {
			return getRuleContext(SqlTransactionStatementContext.class,0);
		}
		public MergeStatementContext mergeStatement() {
			return getRuleContext(MergeStatementContext.class,0);
		}
		public ExecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStatement; }
	}

	public final ExecStatementContext execStatement() throws RecognitionException {
		ExecStatementContext _localctx = new ExecStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_execStatement);
		try {
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				queryStatementExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				loadStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				exportStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				importStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(792);
				replDumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(793);
				replLoadStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(794);
				replStatusStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(795);
				ddlStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(796);
				deleteStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(797);
				updateStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(798);
				sqlTransactionStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(799);
				mergeStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadStatementContext extends ParserRuleContext {
		public TerminalNode KW_LOAD() { return getToken(HiveParser.KW_LOAD, 0); }
		public TerminalNode KW_DATA() { return getToken(HiveParser.KW_DATA, 0); }
		public TerminalNode KW_INPATH() { return getToken(HiveParser.KW_INPATH, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_INTO() { return getToken(HiveParser.KW_INTO, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public TerminalNode KW_LOCAL() { return getToken(HiveParser.KW_LOCAL, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(HiveParser.KW_OVERWRITE, 0); }
		public InputFileFormatContext inputFileFormat() {
			return getRuleContext(InputFileFormatContext.class,0);
		}
		public LoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadStatement; }
	}

	public final LoadStatementContext loadStatement() throws RecognitionException {
		LoadStatementContext _localctx = new LoadStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(KW_LOAD);
			setState(803);
			match(KW_DATA);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCAL) {
				{
				setState(804);
				match(KW_LOCAL);
				}
			}

			setState(807);
			match(KW_INPATH);
			setState(808);
			match(StringLiteral);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_OVERWRITE) {
				{
				setState(809);
				match(KW_OVERWRITE);
				}
			}

			setState(812);
			match(KW_INTO);
			setState(813);
			match(KW_TABLE);
			setState(814);
			tableOrPartition();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_INPUTFORMAT) {
				{
				setState(815);
				inputFileFormat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplicationClauseContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public TerminalNode KW_REPLICATION() { return getToken(HiveParser.KW_REPLICATION, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_METADATA() { return getToken(HiveParser.KW_METADATA, 0); }
		public ReplicationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replicationClause; }
	}

	public final ReplicationClauseContext replicationClause() throws RecognitionException {
		ReplicationClauseContext _localctx = new ReplicationClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_replicationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			match(KW_FOR);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_METADATA) {
				{
				setState(819);
				match(KW_METADATA);
				}
			}

			setState(822);
			match(KW_REPLICATION);
			setState(823);
			match(LPAREN);
			setState(824);
			match(StringLiteral);
			setState(825);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode KW_EXPORT() { return getToken(HiveParser.KW_EXPORT, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ReplicationClauseContext replicationClause() {
			return getRuleContext(ReplicationClauseContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(KW_EXPORT);
			setState(828);
			match(KW_TABLE);
			setState(829);
			tableOrPartition();
			setState(830);
			match(KW_TO);
			setState(831);
			match(StringLiteral);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(832);
				replicationClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public Token path;
		public TerminalNode KW_IMPORT() { return getToken(HiveParser.KW_IMPORT, 0); }
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableLocationContext tableLocation() {
			return getRuleContext(TableLocationContext.class,0);
		}
		public TerminalNode KW_EXTERNAL() { return getToken(HiveParser.KW_EXTERNAL, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(KW_IMPORT);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TABLE || _la==KW_EXTERNAL) {
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_EXTERNAL) {
					{
					setState(836);
					match(KW_EXTERNAL);
					}
				}

				setState(839);
				match(KW_TABLE);
				setState(840);
				tableOrPartition();
				}
			}

			setState(843);
			match(KW_FROM);
			{
			setState(844);
			((ImportStatementContext)_localctx).path = match(StringLiteral);
			}
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCATION) {
				{
				setState(845);
				tableLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplDumpStatementContext extends ParserRuleContext {
		public TerminalNode KW_REPL() { return getToken(HiveParser.KW_REPL, 0); }
		public TerminalNode KW_DUMP() { return getToken(HiveParser.KW_DUMP, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public List<TerminalNode> Number() { return getTokens(HiveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HiveParser.Number, i);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public ReplConfigsContext replConfigs() {
			return getRuleContext(ReplConfigsContext.class,0);
		}
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public TerminalNode KW_LIMIT() { return getToken(HiveParser.KW_LIMIT, 0); }
		public ReplDumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replDumpStatement; }
	}

	public final ReplDumpStatementContext replDumpStatement() throws RecognitionException {
		ReplDumpStatementContext _localctx = new ReplDumpStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replDumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(KW_REPL);
			setState(849);
			match(KW_DUMP);
			setState(850);
			identifier();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(851);
				match(DOT);
				setState(852);
				identifier();
				}
			}

			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(855);
				match(KW_FROM);
				setState(856);
				match(Number);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TO) {
					{
					setState(857);
					match(KW_TO);
					setState(858);
					match(Number);
					}
				}

				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LIMIT) {
					{
					setState(861);
					match(KW_LIMIT);
					setState(862);
					match(Number);
					}
				}

				}
				break;
			}
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(867);
				match(KW_WITH);
				setState(868);
				replConfigs();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplLoadStatementContext extends ParserRuleContext {
		public TerminalNode KW_REPL() { return getToken(HiveParser.KW_REPL, 0); }
		public TerminalNode KW_LOAD() { return getToken(HiveParser.KW_LOAD, 0); }
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public ReplConfigsContext replConfigs() {
			return getRuleContext(ReplConfigsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public ReplLoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replLoadStatement; }
	}

	public final ReplLoadStatementContext replLoadStatement() throws RecognitionException {
		ReplLoadStatementContext _localctx = new ReplLoadStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_replLoadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(KW_REPL);
			setState(872);
			match(KW_LOAD);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KW_CHANGE - 68)) | (1L << (KW_FIRST - 68)) | (1L << (KW_AFTER - 68)) | (1L << (KW_RENAME - 68)) | (1L << (KW_COMMENT - 68)) | (1L << (KW_TINYINT - 68)) | (1L << (KW_DATETIME - 68)) | (1L << (KW_ZONE - 68)) | (1L << (KW_STRING - 68)) | (1L << (KW_STRUCT - 68)) | (1L << (KW_UNIONTYPE - 68)) | (1L << (KW_PARTITIONED - 68)) | (1L << (KW_CLUSTERED - 68)) | (1L << (KW_SORTED - 68)) | (1L << (KW_BUCKETS - 68)) | (1L << (KW_FORMAT - 68)) | (1L << (KW_DELIMITED - 68)) | (1L << (KW_FIELDS - 68)) | (1L << (KW_TERMINATED - 68)) | (1L << (KW_ESCAPED - 68)) | (1L << (KW_COLLECTION - 68)) | (1L << (KW_ITEMS - 68)) | (1L << (KW_KEYS - 68)) | (1L << (KW_KEY_TYPE - 68)) | (1L << (KW_KILL - 68)) | (1L << (KW_LINES - 68)) | (1L << (KW_STORED - 68)) | (1L << (KW_FILEFORMAT - 68)) | (1L << (KW_INPUTFORMAT - 68)) | (1L << (KW_OUTPUTFORMAT - 68)) | (1L << (KW_INPUTDRIVER - 68)) | (1L << (KW_OUTPUTDRIVER - 68)) | (1L << (KW_ENABLE - 68)) | (1L << (KW_DISABLE - 68)) | (1L << (KW_LOCATION - 68)) | (1L << (KW_BUCKET - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (KW_ADD - 134)) | (1L << (KW_REPLACE - 134)) | (1L << (KW_TEMPORARY - 134)) | (1L << (KW_FILE - 134)) | (1L << (KW_JAR - 134)) | (1L << (KW_EXPLAIN - 134)) | (1L << (KW_FORMATTED - 134)) | (1L << (KW_DEPENDENCY - 134)) | (1L << (KW_LOGICAL - 134)) | (1L << (KW_SERDE - 134)) | (1L << (KW_DEFERRED - 134)) | (1L << (KW_SERDEPROPERTIES - 134)) | (1L << (KW_DBPROPERTIES - 134)) | (1L << (KW_LIMIT - 134)) | (1L << (KW_OFFSET - 134)) | (1L << (KW_UNSET - 134)) | (1L << (KW_TBLPROPERTIES - 134)) | (1L << (KW_IDXPROPERTIES - 134)) | (1L << (KW_VALUE_TYPE - 134)) | (1L << (KW_ELEM_TYPE - 134)) | (1L << (KW_DEFINED - 134)) | (1L << (KW_MAPJOIN - 134)) | (1L << (KW_STREAMTABLE - 134)) | (1L << (KW_CLUSTERSTATUS - 134)) | (1L << (KW_UTC - 134)) | (1L << (KW_UTCTIMESTAMP - 134)) | (1L << (KW_LONG - 134)) | (1L << (KW_PLUS - 134)) | (1L << (KW_VIEW - 134)) | (1L << (KW_VIEWS - 134)) | (1L << (KW_DATABASES - 134)) | (1L << (KW_MATERIALIZED - 134)) | (1L << (KW_SCHEMA - 134)) | (1L << (KW_SCHEMAS - 134)) | (1L << (KW_SSL - 134)) | (1L << (KW_UNDO - 134)) | (1L << (KW_LOCK - 134)) | (1L << (KW_LOCKS - 134)) | (1L << (KW_UNLOCK - 134)) | (1L << (KW_SHARED - 134)) | (1L << (KW_EXCLUSIVE - 134)) | (1L << (KW_UNSIGNED - 134)) | (1L << (KW_WHILE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (KW_READ - 198)) | (1L << (KW_PURGE - 198)) | (1L << (KW_ANALYZE - 198)) | (1L << (KW_BEFORE - 198)) | (1L << (KW_CONTINUE - 198)) | (1L << (KW_RECORDREADER - 198)) | (1L << (KW_RECORDWRITER - 198)) | (1L << (KW_SEMI - 198)) | (1L << (KW_TOUCH - 198)) | (1L << (KW_ARCHIVE - 198)) | (1L << (KW_UNARCHIVE - 198)) | (1L << (KW_COMPUTE - 198)) | (1L << (KW_STATISTICS - 198)) | (1L << (KW_USE - 198)) | (1L << (KW_OPTION - 198)) | (1L << (KW_CONCATENATE - 198)) | (1L << (KW_SHOW_DATABASE - 198)) | (1L << (KW_RESTRICT - 198)) | (1L << (KW_CASCADE - 198)) | (1L << (KW_SKEWED - 198)) | (1L << (KW_DIRECTORIES - 198)) | (1L << (KW_SETS - 198)) | (1L << (KW_NOSCAN - 198)) | (1L << (KW_ROLE - 198)) | (1L << (KW_ROLES - 198)) | (1L << (KW_URI - 198)) | (1L << (KW_SERVER - 198)) | (1L << (KW_ADMIN - 198)) | (1L << (KW_OWNER - 198)) | (1L << (KW_PRINCIPALS - 198)) | (1L << (KW_COMPACT - 198)) | (1L << (KW_COMPACTIONS - 198)) | (1L << (KW_TRANSACTIONS - 198)) | (1L << (KW_REWRITE - 198)) | (1L << (KW_REOPTIMIZATION - 198)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (KW_RELOAD - 264)) | (1L << (KW_YEAR - 264)) | (1L << (KW_QUERY - 264)) | (1L << (KW_QUARTER - 264)) | (1L << (KW_MONTH - 264)) | (1L << (KW_WEEK - 264)) | (1L << (KW_DAY - 264)) | (1L << (KW_DOW - 264)) | (1L << (KW_HOUR - 264)) | (1L << (KW_MINUTE - 264)) | (1L << (KW_SECOND - 264)) | (1L << (KW_TRANSACTION - 264)) | (1L << (KW_WORK - 264)) | (1L << (KW_WRITE - 264)) | (1L << (KW_ISOLATION - 264)) | (1L << (KW_LEVEL - 264)) | (1L << (KW_SNAPSHOT - 264)) | (1L << (KW_AUTOCOMMIT - 264)) | (1L << (KW_CACHE - 264)) | (1L << (KW_ENFORCED - 264)) | (1L << (KW_VALIDATE - 264)) | (1L << (KW_NOVALIDATE - 264)) | (1L << (KW_RELY - 264)) | (1L << (KW_NORELY - 264)) | (1L << (KW_KEY - 264)) | (1L << (KW_ABORT - 264)) | (1L << (KW_MATCHED - 264)) | (1L << (KW_REPL - 264)) | (1L << (KW_DUMP - 264)) | (1L << (KW_STATUS - 264)) | (1L << (KW_VECTORIZATION - 264)) | (1L << (KW_SUMMARY - 264)) | (1L << (KW_OPERATOR - 264)) | (1L << (KW_EXPRESSION - 264)) | (1L << (KW_DETAIL - 264)) | (1L << (KW_WAIT - 264)) | (1L << (KW_RESOURCE - 264)) | (1L << (KW_PLAN - 264)) | (1L << (KW_QUERY_PARALLELISM - 264)) | (1L << (KW_PLANS - 264)) | (1L << (KW_ACTIVATE - 264)) | (1L << (KW_DEFAULT - 264)) | (1L << (KW_CHECK - 264)) | (1L << (KW_POOL - 264)) | (1L << (KW_MOVE - 264)) | (1L << (KW_DO - 264)) | (1L << (KW_ALLOC_FRACTION - 264)) | (1L << (KW_SCHEDULING_POLICY - 264)) | (1L << (KW_PATH - 264)) | (1L << (KW_MAPPING - 264)) | (1L << (KW_WORKLOAD - 264)) | (1L << (KW_MANAGEMENT - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (KW_ACTIVE - 328)) | (1L << (KW_UNMANAGED - 328)) | (1L << (Identifier - 328)))) != 0)) {
				{
				setState(873);
				identifier();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(874);
					match(DOT);
					setState(875);
					identifier();
					}
				}

				}
			}

			setState(880);
			match(KW_FROM);
			setState(881);
			match(StringLiteral);
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(882);
				match(KW_WITH);
				setState(883);
				replConfigs();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplConfigsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ReplConfigsListContext replConfigsList() {
			return getRuleContext(ReplConfigsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ReplConfigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replConfigs; }
	}

	public final ReplConfigsContext replConfigs() throws RecognitionException {
		ReplConfigsContext _localctx = new ReplConfigsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_replConfigs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(LPAREN);
			setState(887);
			replConfigsList();
			setState(888);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplConfigsListContext extends ParserRuleContext {
		public List<KeyValuePropertyContext> keyValueProperty() {
			return getRuleContexts(KeyValuePropertyContext.class);
		}
		public KeyValuePropertyContext keyValueProperty(int i) {
			return getRuleContext(KeyValuePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ReplConfigsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replConfigsList; }
	}

	public final ReplConfigsListContext replConfigsList() throws RecognitionException {
		ReplConfigsListContext _localctx = new ReplConfigsListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_replConfigsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			keyValueProperty();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(891);
				match(COMMA);
				setState(892);
				keyValueProperty();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplStatusStatementContext extends ParserRuleContext {
		public TerminalNode KW_REPL() { return getToken(HiveParser.KW_REPL, 0); }
		public TerminalNode KW_STATUS() { return getToken(HiveParser.KW_STATUS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public ReplConfigsContext replConfigs() {
			return getRuleContext(ReplConfigsContext.class,0);
		}
		public ReplStatusStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replStatusStatement; }
	}

	public final ReplStatusStatementContext replStatusStatement() throws RecognitionException {
		ReplStatusStatementContext _localctx = new ReplStatusStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_replStatusStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(KW_REPL);
			setState(899);
			match(KW_STATUS);
			setState(900);
			identifier();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(901);
				match(DOT);
				setState(902);
				identifier();
				}
			}

			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(905);
				match(KW_WITH);
				setState(906);
				replConfigs();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DdlStatementContext extends ParserRuleContext {
		public CreateDatabaseStatementContext createDatabaseStatement() {
			return getRuleContext(CreateDatabaseStatementContext.class,0);
		}
		public SwitchDatabaseStatementContext switchDatabaseStatement() {
			return getRuleContext(SwitchDatabaseStatementContext.class,0);
		}
		public DropDatabaseStatementContext dropDatabaseStatement() {
			return getRuleContext(DropDatabaseStatementContext.class,0);
		}
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public DropTableStatementContext dropTableStatement() {
			return getRuleContext(DropTableStatementContext.class,0);
		}
		public TruncateTableStatementContext truncateTableStatement() {
			return getRuleContext(TruncateTableStatementContext.class,0);
		}
		public AlterStatementContext alterStatement() {
			return getRuleContext(AlterStatementContext.class,0);
		}
		public DescStatementContext descStatement() {
			return getRuleContext(DescStatementContext.class,0);
		}
		public ShowStatementContext showStatement() {
			return getRuleContext(ShowStatementContext.class,0);
		}
		public MetastoreCheckContext metastoreCheck() {
			return getRuleContext(MetastoreCheckContext.class,0);
		}
		public CreateViewStatementContext createViewStatement() {
			return getRuleContext(CreateViewStatementContext.class,0);
		}
		public CreateMaterializedViewStatementContext createMaterializedViewStatement() {
			return getRuleContext(CreateMaterializedViewStatementContext.class,0);
		}
		public DropViewStatementContext dropViewStatement() {
			return getRuleContext(DropViewStatementContext.class,0);
		}
		public DropMaterializedViewStatementContext dropMaterializedViewStatement() {
			return getRuleContext(DropMaterializedViewStatementContext.class,0);
		}
		public CreateFunctionStatementContext createFunctionStatement() {
			return getRuleContext(CreateFunctionStatementContext.class,0);
		}
		public CreateMacroStatementContext createMacroStatement() {
			return getRuleContext(CreateMacroStatementContext.class,0);
		}
		public DropFunctionStatementContext dropFunctionStatement() {
			return getRuleContext(DropFunctionStatementContext.class,0);
		}
		public ReloadFunctionStatementContext reloadFunctionStatement() {
			return getRuleContext(ReloadFunctionStatementContext.class,0);
		}
		public DropMacroStatementContext dropMacroStatement() {
			return getRuleContext(DropMacroStatementContext.class,0);
		}
		public AnalyzeStatementContext analyzeStatement() {
			return getRuleContext(AnalyzeStatementContext.class,0);
		}
		public LockStatementContext lockStatement() {
			return getRuleContext(LockStatementContext.class,0);
		}
		public UnlockStatementContext unlockStatement() {
			return getRuleContext(UnlockStatementContext.class,0);
		}
		public LockDatabaseContext lockDatabase() {
			return getRuleContext(LockDatabaseContext.class,0);
		}
		public UnlockDatabaseContext unlockDatabase() {
			return getRuleContext(UnlockDatabaseContext.class,0);
		}
		public CreateRoleStatementContext createRoleStatement() {
			return getRuleContext(CreateRoleStatementContext.class,0);
		}
		public DropRoleStatementContext dropRoleStatement() {
			return getRuleContext(DropRoleStatementContext.class,0);
		}
		public GrantPrivilegesContext grantPrivileges() {
			return getRuleContext(GrantPrivilegesContext.class,0);
		}
		public RevokePrivilegesContext revokePrivileges() {
			return getRuleContext(RevokePrivilegesContext.class,0);
		}
		public ShowGrantsContext showGrants() {
			return getRuleContext(ShowGrantsContext.class,0);
		}
		public ShowRoleGrantsContext showRoleGrants() {
			return getRuleContext(ShowRoleGrantsContext.class,0);
		}
		public ShowRolePrincipalsContext showRolePrincipals() {
			return getRuleContext(ShowRolePrincipalsContext.class,0);
		}
		public ShowRolesContext showRoles() {
			return getRuleContext(ShowRolesContext.class,0);
		}
		public GrantRoleContext grantRole() {
			return getRuleContext(GrantRoleContext.class,0);
		}
		public RevokeRoleContext revokeRole() {
			return getRuleContext(RevokeRoleContext.class,0);
		}
		public SetRoleContext setRole() {
			return getRuleContext(SetRoleContext.class,0);
		}
		public ShowCurrentRoleContext showCurrentRole() {
			return getRuleContext(ShowCurrentRoleContext.class,0);
		}
		public AbortTransactionStatementContext abortTransactionStatement() {
			return getRuleContext(AbortTransactionStatementContext.class,0);
		}
		public KillQueryStatementContext killQueryStatement() {
			return getRuleContext(KillQueryStatementContext.class,0);
		}
		public CreateIndexStatementContext createIndexStatement() {
			return getRuleContext(CreateIndexStatementContext.class,0);
		}
		public DropIndexStatementContext dropIndexStatement() {
			return getRuleContext(DropIndexStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ddlStatement);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				createDatabaseStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				switchDatabaseStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				dropDatabaseStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(912);
				createTableStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(913);
				dropTableStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(914);
				truncateTableStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(915);
				alterStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(916);
				descStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(917);
				showStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(918);
				metastoreCheck();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(919);
				createViewStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(920);
				createMaterializedViewStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(921);
				dropViewStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(922);
				dropMaterializedViewStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(923);
				createFunctionStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(924);
				createMacroStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(925);
				dropFunctionStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(926);
				reloadFunctionStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(927);
				dropMacroStatement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(928);
				analyzeStatement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(929);
				lockStatement();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(930);
				unlockStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(931);
				lockDatabase();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(932);
				unlockDatabase();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(933);
				createRoleStatement();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(934);
				dropRoleStatement();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(935);
				grantPrivileges();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(936);
				revokePrivileges();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(937);
				showGrants();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(938);
				showRoleGrants();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(939);
				showRolePrincipals();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(940);
				showRoles();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(941);
				grantRole();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(942);
				revokeRole();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(943);
				setRole();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(944);
				showCurrentRole();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(945);
				abortTransactionStatement();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(946);
				killQueryStatement();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(947);
				createIndexStatement();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(948);
				dropIndexStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(HiveParser.KW_IF, 0); }
		public TerminalNode KW_EXISTS() { return getToken(HiveParser.KW_EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(KW_IF);
			setState(952);
			match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestrictOrCascadeContext extends ParserRuleContext {
		public TerminalNode KW_RESTRICT() { return getToken(HiveParser.KW_RESTRICT, 0); }
		public TerminalNode KW_CASCADE() { return getToken(HiveParser.KW_CASCADE, 0); }
		public RestrictOrCascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restrictOrCascade; }
	}

	public final RestrictOrCascadeContext restrictOrCascade() throws RecognitionException {
		RestrictOrCascadeContext _localctx = new RestrictOrCascadeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_restrictOrCascade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_la = _input.LA(1);
			if ( !(_la==KW_RESTRICT || _la==KW_CASCADE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(HiveParser.KW_IF, 0); }
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_EXISTS() { return getToken(HiveParser.KW_EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(KW_IF);
			setState(957);
			match(KW_NOT);
			setState(958);
			match(KW_EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RewriteEnabledContext extends ParserRuleContext {
		public TerminalNode KW_ENABLE() { return getToken(HiveParser.KW_ENABLE, 0); }
		public TerminalNode KW_REWRITE() { return getToken(HiveParser.KW_REWRITE, 0); }
		public RewriteEnabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteEnabled; }
	}

	public final RewriteEnabledContext rewriteEnabled() throws RecognitionException {
		RewriteEnabledContext _localctx = new RewriteEnabledContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rewriteEnabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(KW_ENABLE);
			setState(961);
			match(KW_REWRITE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RewriteDisabledContext extends ParserRuleContext {
		public TerminalNode KW_DISABLE() { return getToken(HiveParser.KW_DISABLE, 0); }
		public TerminalNode KW_REWRITE() { return getToken(HiveParser.KW_REWRITE, 0); }
		public RewriteDisabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewriteDisabled; }
	}

	public final RewriteDisabledContext rewriteDisabled() throws RecognitionException {
		RewriteDisabledContext _localctx = new RewriteDisabledContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rewriteDisabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(KW_DISABLE);
			setState(964);
			match(KW_REWRITE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StoredAsDirsContext extends ParserRuleContext {
		public TerminalNode KW_STORED() { return getToken(HiveParser.KW_STORED, 0); }
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode KW_DIRECTORIES() { return getToken(HiveParser.KW_DIRECTORIES, 0); }
		public StoredAsDirsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storedAsDirs; }
	}

	public final StoredAsDirsContext storedAsDirs() throws RecognitionException {
		StoredAsDirsContext _localctx = new StoredAsDirsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_storedAsDirs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(KW_STORED);
			setState(967);
			match(KW_AS);
			setState(968);
			match(KW_DIRECTORIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrReplaceContext extends ParserRuleContext {
		public TerminalNode KW_OR() { return getToken(HiveParser.KW_OR, 0); }
		public TerminalNode KW_REPLACE() { return getToken(HiveParser.KW_REPLACE, 0); }
		public OrReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orReplace; }
	}

	public final OrReplaceContext orReplace() throws RecognitionException {
		OrReplaceContext _localctx = new OrReplaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_orReplace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(KW_OR);
			setState(971);
			match(KW_REPLACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public DatabaseCommentContext databaseComment() {
			return getRuleContext(DatabaseCommentContext.class,0);
		}
		public DbLocationContext dbLocation() {
			return getRuleContext(DbLocationContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_DBPROPERTIES() { return getToken(HiveParser.KW_DBPROPERTIES, 0); }
		public DbPropertiesContext dbProperties() {
			return getRuleContext(DbPropertiesContext.class,0);
		}
		public CreateDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDatabaseStatement; }
	}

	public final CreateDatabaseStatementContext createDatabaseStatement() throws RecognitionException {
		CreateDatabaseStatementContext _localctx = new CreateDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_createDatabaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(KW_CREATE);
			setState(974);
			_la = _input.LA(1);
			if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(975);
				ifNotExists();
				}
			}

			setState(978);
			identifier();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(979);
				databaseComment();
				}
			}

			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCATION) {
				{
				setState(982);
				dbLocation();
				}
			}

			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(985);
				match(KW_WITH);
				setState(986);
				match(KW_DBPROPERTIES);
				setState(987);
				dbProperties();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbLocationContext extends ParserRuleContext {
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public DbLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbLocation; }
	}

	public final DbLocationContext dbLocation() throws RecognitionException {
		DbLocationContext _localctx = new DbLocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dbLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(KW_LOCATION);
			setState(991);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbPropertiesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public DbPropertiesListContext dbPropertiesList() {
			return getRuleContext(DbPropertiesListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public DbPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbProperties; }
	}

	public final DbPropertiesContext dbProperties() throws RecognitionException {
		DbPropertiesContext _localctx = new DbPropertiesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dbProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(LPAREN);
			setState(994);
			dbPropertiesList();
			setState(995);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DbPropertiesListContext extends ParserRuleContext {
		public List<KeyValuePropertyContext> keyValueProperty() {
			return getRuleContexts(KeyValuePropertyContext.class);
		}
		public KeyValuePropertyContext keyValueProperty(int i) {
			return getRuleContext(KeyValuePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public DbPropertiesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbPropertiesList; }
	}

	public final DbPropertiesListContext dbPropertiesList() throws RecognitionException {
		DbPropertiesListContext _localctx = new DbPropertiesListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dbPropertiesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			keyValueProperty();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(998);
				match(COMMA);
				setState(999);
				keyValueProperty();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(HiveParser.KW_USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SwitchDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDatabaseStatement; }
	}

	public final SwitchDatabaseStatementContext switchDatabaseStatement() throws RecognitionException {
		SwitchDatabaseStatementContext _localctx = new SwitchDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchDatabaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(KW_USE);
			setState(1006);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropDatabaseStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public RestrictOrCascadeContext restrictOrCascade() {
			return getRuleContext(RestrictOrCascadeContext.class,0);
		}
		public DropDatabaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropDatabaseStatement; }
	}

	public final DropDatabaseStatementContext dropDatabaseStatement() throws RecognitionException {
		DropDatabaseStatementContext _localctx = new DropDatabaseStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dropDatabaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(KW_DROP);
			setState(1009);
			_la = _input.LA(1);
			if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1010);
				ifExists();
				}
			}

			setState(1013);
			identifier();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RESTRICT || _la==KW_CASCADE) {
				{
				setState(1014);
				restrictOrCascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseCommentContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public DatabaseCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseComment; }
	}

	public final DatabaseCommentContext databaseComment() throws RecognitionException {
		DatabaseCommentContext _localctx = new DatabaseCommentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_databaseComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(KW_COMMENT);
			setState(1018);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode KW_LIKE() { return getToken(HiveParser.KW_LIKE, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_EXTERNAL() { return getToken(HiveParser.KW_EXTERNAL, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public TableRowFormatContext tableRowFormat() {
			return getRuleContext(TableRowFormatContext.class,0);
		}
		public TableFileFormatContext tableFileFormat() {
			return getRuleContext(TableFileFormatContext.class,0);
		}
		public TableLocationContext tableLocation() {
			return getRuleContext(TableLocationContext.class,0);
		}
		public TablePropertiesPrefixedContext tablePropertiesPrefixed() {
			return getRuleContext(TablePropertiesPrefixedContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameTypeOrConstraintListContext columnNameTypeOrConstraintList() {
			return getRuleContext(ColumnNameTypeOrConstraintListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public TablePartitionContext tablePartition() {
			return getRuleContext(TablePartitionContext.class,0);
		}
		public TableBucketsContext tableBuckets() {
			return getRuleContext(TableBucketsContext.class,0);
		}
		public TableSkewedContext tableSkewed() {
			return getRuleContext(TableSkewedContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public SelectStatementWithCTEContext selectStatementWithCTE() {
			return getRuleContext(SelectStatementWithCTEContext.class,0);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(KW_CREATE);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TEMPORARY) {
				{
				setState(1021);
				match(KW_TEMPORARY);
				}
			}

			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERNAL) {
				{
				setState(1024);
				match(KW_EXTERNAL);
				}
			}

			setState(1027);
			match(KW_TABLE);
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1028);
				ifNotExists();
				}
			}

			setState(1031);
			tableName();
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_LIKE:
				{
				setState(1032);
				match(KW_LIKE);
				setState(1033);
				tableName();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ROW) {
					{
					setState(1034);
					tableRowFormat();
					}
				}

				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STORED) {
					{
					setState(1037);
					tableFileFormat();
					}
				}

				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LOCATION) {
					{
					setState(1040);
					tableLocation();
					}
				}

				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TBLPROPERTIES) {
					{
					setState(1043);
					tablePropertiesPrefixed();
					}
				}

				}
				break;
			case EOF:
			case KW_DESC:
			case KW_FROM:
			case KW_AS:
			case KW_SELECT:
			case KW_INSERT:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_COMMENT:
			case KW_MAP:
			case KW_REDUCE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_ROW:
			case KW_KILL:
			case KW_STORED:
			case KW_LOCATION:
			case KW_EXPLAIN:
			case KW_WITH:
			case KW_SET:
			case KW_TBLPROPERTIES:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_SKEWED:
			case KW_TRUNCATE:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case SEMICOLON:
			case LPAREN:
				{
				setState(1050);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(1046);
					match(LPAREN);
					setState(1047);
					columnNameTypeOrConstraintList();
					setState(1048);
					match(RPAREN);
					}
					break;
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_COMMENT) {
					{
					setState(1052);
					tableComment();
					}
				}

				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITIONED) {
					{
					setState(1055);
					tablePartition();
					}
				}

				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CLUSTERED) {
					{
					setState(1058);
					tableBuckets();
					}
				}

				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SKEWED) {
					{
					setState(1061);
					tableSkewed();
					}
				}

				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ROW) {
					{
					setState(1064);
					tableRowFormat();
					}
				}

				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STORED) {
					{
					setState(1067);
					tableFileFormat();
					}
				}

				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LOCATION) {
					{
					setState(1070);
					tableLocation();
					}
				}

				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TBLPROPERTIES) {
					{
					setState(1073);
					tablePropertiesPrefixed();
					}
				}

				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(1076);
					match(KW_AS);
					setState(1077);
					selectStatementWithCTE();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableStatementContext extends ParserRuleContext {
		public TerminalNode KW_TRUNCATE() { return getToken(HiveParser.KW_TRUNCATE, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TablePartitionPrefixContext tablePartitionPrefix() {
			return getRuleContext(TablePartitionPrefixContext.class,0);
		}
		public TerminalNode KW_COLUMNS() { return getToken(HiveParser.KW_COLUMNS, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TruncateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTableStatement; }
	}

	public final TruncateTableStatementContext truncateTableStatement() throws RecognitionException {
		TruncateTableStatementContext _localctx = new TruncateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_truncateTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(KW_TRUNCATE);
			setState(1083);
			match(KW_TABLE);
			setState(1084);
			tablePartitionPrefix();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLUMNS) {
				{
				setState(1085);
				match(KW_COLUMNS);
				setState(1086);
				match(LPAREN);
				setState(1087);
				columnNameList();
				setState(1088);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public TerminalNode KW_PURGE() { return getToken(HiveParser.KW_PURGE, 0); }
		public ReplicationClauseContext replicationClause() {
			return getRuleContext(ReplicationClauseContext.class,0);
		}
		public DropTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStatement; }
	}

	public final DropTableStatementContext dropTableStatement() throws RecognitionException {
		DropTableStatementContext _localctx = new DropTableStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_dropTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(KW_DROP);
			setState(1093);
			match(KW_TABLE);
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1094);
				ifExists();
				}
			}

			setState(1097);
			tableName();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PURGE) {
				{
				setState(1098);
				match(KW_PURGE);
				}
			}

			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1101);
				replicationClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementContext extends ParserRuleContext {
		public TerminalNode KW_ALTER() { return getToken(HiveParser.KW_ALTER, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTableStatementSuffixContext alterTableStatementSuffix() {
			return getRuleContext(AlterTableStatementSuffixContext.class,0);
		}
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public AlterViewStatementSuffixContext alterViewStatementSuffix() {
			return getRuleContext(AlterViewStatementSuffixContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode KW_MATERIALIZED() { return getToken(HiveParser.KW_MATERIALIZED, 0); }
		public AlterMaterializedViewStatementSuffixContext alterMaterializedViewStatementSuffix() {
			return getRuleContext(AlterMaterializedViewStatementSuffixContext.class,0);
		}
		public AlterDatabaseStatementSuffixContext alterDatabaseStatementSuffix() {
			return getRuleContext(AlterDatabaseStatementSuffixContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TerminalNode KW_INDEX() { return getToken(HiveParser.KW_INDEX, 0); }
		public AlterIndexStatementSuffixContext alterIndexStatementSuffix() {
			return getRuleContext(AlterIndexStatementSuffixContext.class,0);
		}
		public AlterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatement; }
	}

	public final AlterStatementContext alterStatement() throws RecognitionException {
		AlterStatementContext _localctx = new AlterStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alterStatement);
		int _la;
		try {
			setState(1129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				match(KW_ALTER);
				setState(1105);
				match(KW_TABLE);
				setState(1106);
				tableName();
				setState(1107);
				alterTableStatementSuffix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1109);
				match(KW_ALTER);
				setState(1110);
				match(KW_VIEW);
				setState(1111);
				tableName();
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(1112);
					match(KW_AS);
					}
				}

				setState(1115);
				alterViewStatementSuffix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				match(KW_ALTER);
				setState(1118);
				match(KW_MATERIALIZED);
				setState(1119);
				match(KW_VIEW);
				setState(1120);
				tableName();
				setState(1121);
				alterMaterializedViewStatementSuffix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1123);
				match(KW_ALTER);
				setState(1124);
				_la = _input.LA(1);
				if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1125);
				alterDatabaseStatementSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1126);
				match(KW_ALTER);
				setState(1127);
				match(KW_INDEX);
				setState(1128);
				alterIndexStatementSuffix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableStatementSuffixContext extends ParserRuleContext {
		public AlterStatementSuffixRenameContext alterStatementSuffixRename() {
			return getRuleContext(AlterStatementSuffixRenameContext.class,0);
		}
		public AlterStatementSuffixDropPartitionsContext alterStatementSuffixDropPartitions() {
			return getRuleContext(AlterStatementSuffixDropPartitionsContext.class,0);
		}
		public AlterStatementSuffixAddPartitionsContext alterStatementSuffixAddPartitions() {
			return getRuleContext(AlterStatementSuffixAddPartitionsContext.class,0);
		}
		public AlterStatementSuffixTouchContext alterStatementSuffixTouch() {
			return getRuleContext(AlterStatementSuffixTouchContext.class,0);
		}
		public AlterStatementSuffixArchiveContext alterStatementSuffixArchive() {
			return getRuleContext(AlterStatementSuffixArchiveContext.class,0);
		}
		public AlterStatementSuffixUnArchiveContext alterStatementSuffixUnArchive() {
			return getRuleContext(AlterStatementSuffixUnArchiveContext.class,0);
		}
		public AlterStatementSuffixPropertiesContext alterStatementSuffixProperties() {
			return getRuleContext(AlterStatementSuffixPropertiesContext.class,0);
		}
		public AlterStatementSuffixSkewedbyContext alterStatementSuffixSkewedby() {
			return getRuleContext(AlterStatementSuffixSkewedbyContext.class,0);
		}
		public AlterStatementSuffixExchangePartitionContext alterStatementSuffixExchangePartition() {
			return getRuleContext(AlterStatementSuffixExchangePartitionContext.class,0);
		}
		public AlterStatementPartitionKeyTypeContext alterStatementPartitionKeyType() {
			return getRuleContext(AlterStatementPartitionKeyTypeContext.class,0);
		}
		public AlterStatementSuffixDropConstraintContext alterStatementSuffixDropConstraint() {
			return getRuleContext(AlterStatementSuffixDropConstraintContext.class,0);
		}
		public AlterStatementSuffixAddConstraintContext alterStatementSuffixAddConstraint() {
			return getRuleContext(AlterStatementSuffixAddConstraintContext.class,0);
		}
		public AlterTblPartitionStatementSuffixContext alterTblPartitionStatementSuffix() {
			return getRuleContext(AlterTblPartitionStatementSuffixContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public AlterStatementSuffixSetOwnerContext alterStatementSuffixSetOwner() {
			return getRuleContext(AlterStatementSuffixSetOwnerContext.class,0);
		}
		public AlterTableStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStatementSuffix; }
	}

	public final AlterTableStatementSuffixContext alterTableStatementSuffix() throws RecognitionException {
		AlterTableStatementSuffixContext _localctx = new AlterTableStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alterTableStatementSuffix);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				alterStatementSuffixRename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				alterStatementSuffixDropPartitions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				alterStatementSuffixAddPartitions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				alterStatementSuffixTouch();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				alterStatementSuffixArchive();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1136);
				alterStatementSuffixUnArchive();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1137);
				alterStatementSuffixProperties();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1138);
				alterStatementSuffixSkewedby();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1139);
				alterStatementSuffixExchangePartition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1140);
				alterStatementPartitionKeyType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1141);
				alterStatementSuffixDropConstraint();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1142);
				alterStatementSuffixAddConstraint();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1143);
					partitionSpec();
					}
				}

				setState(1146);
				alterTblPartitionStatementSuffix();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1147);
				alterStatementSuffixSetOwner();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTblPartitionStatementSuffixContext extends ParserRuleContext {
		public AlterStatementSuffixFileFormatContext alterStatementSuffixFileFormat() {
			return getRuleContext(AlterStatementSuffixFileFormatContext.class,0);
		}
		public AlterStatementSuffixLocationContext alterStatementSuffixLocation() {
			return getRuleContext(AlterStatementSuffixLocationContext.class,0);
		}
		public AlterStatementSuffixMergeFilesContext alterStatementSuffixMergeFiles() {
			return getRuleContext(AlterStatementSuffixMergeFilesContext.class,0);
		}
		public AlterStatementSuffixSerdePropertiesContext alterStatementSuffixSerdeProperties() {
			return getRuleContext(AlterStatementSuffixSerdePropertiesContext.class,0);
		}
		public AlterStatementSuffixRenamePartContext alterStatementSuffixRenamePart() {
			return getRuleContext(AlterStatementSuffixRenamePartContext.class,0);
		}
		public AlterStatementSuffixBucketNumContext alterStatementSuffixBucketNum() {
			return getRuleContext(AlterStatementSuffixBucketNumContext.class,0);
		}
		public AlterTblPartitionStatementSuffixSkewedLocationContext alterTblPartitionStatementSuffixSkewedLocation() {
			return getRuleContext(AlterTblPartitionStatementSuffixSkewedLocationContext.class,0);
		}
		public AlterStatementSuffixClusterbySortbyContext alterStatementSuffixClusterbySortby() {
			return getRuleContext(AlterStatementSuffixClusterbySortbyContext.class,0);
		}
		public AlterStatementSuffixCompactContext alterStatementSuffixCompact() {
			return getRuleContext(AlterStatementSuffixCompactContext.class,0);
		}
		public AlterStatementSuffixUpdateStatsColContext alterStatementSuffixUpdateStatsCol() {
			return getRuleContext(AlterStatementSuffixUpdateStatsColContext.class,0);
		}
		public AlterStatementSuffixUpdateStatsContext alterStatementSuffixUpdateStats() {
			return getRuleContext(AlterStatementSuffixUpdateStatsContext.class,0);
		}
		public AlterStatementSuffixRenameColContext alterStatementSuffixRenameCol() {
			return getRuleContext(AlterStatementSuffixRenameColContext.class,0);
		}
		public AlterStatementSuffixAddColContext alterStatementSuffixAddCol() {
			return getRuleContext(AlterStatementSuffixAddColContext.class,0);
		}
		public AlterTblPartitionStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTblPartitionStatementSuffix; }
	}

	public final AlterTblPartitionStatementSuffixContext alterTblPartitionStatementSuffix() throws RecognitionException {
		AlterTblPartitionStatementSuffixContext _localctx = new AlterTblPartitionStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alterTblPartitionStatementSuffix);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				alterStatementSuffixFileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				alterStatementSuffixLocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				alterStatementSuffixMergeFiles();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1153);
				alterStatementSuffixSerdeProperties();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1154);
				alterStatementSuffixRenamePart();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1155);
				alterStatementSuffixBucketNum();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1156);
				alterTblPartitionStatementSuffixSkewedLocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1157);
				alterStatementSuffixClusterbySortby();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1158);
				alterStatementSuffixCompact();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1159);
				alterStatementSuffixUpdateStatsCol();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1160);
				alterStatementSuffixUpdateStats();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1161);
				alterStatementSuffixRenameCol();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1162);
				alterStatementSuffixAddCol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementPartitionKeyTypeContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(HiveParser.KW_PARTITION, 0); }
		public TerminalNode KW_COLUMN() { return getToken(HiveParser.KW_COLUMN, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameTypeContext columnNameType() {
			return getRuleContext(ColumnNameTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public AlterStatementPartitionKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementPartitionKeyType; }
	}

	public final AlterStatementPartitionKeyTypeContext alterStatementPartitionKeyType() throws RecognitionException {
		AlterStatementPartitionKeyTypeContext _localctx = new AlterStatementPartitionKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alterStatementPartitionKeyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(KW_PARTITION);
			setState(1166);
			match(KW_COLUMN);
			setState(1167);
			match(LPAREN);
			setState(1168);
			columnNameType();
			setState(1169);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterViewStatementSuffixContext extends ParserRuleContext {
		public AlterViewSuffixPropertiesContext alterViewSuffixProperties() {
			return getRuleContext(AlterViewSuffixPropertiesContext.class,0);
		}
		public AlterStatementSuffixRenameContext alterStatementSuffixRename() {
			return getRuleContext(AlterStatementSuffixRenameContext.class,0);
		}
		public AlterStatementSuffixAddPartitionsContext alterStatementSuffixAddPartitions() {
			return getRuleContext(AlterStatementSuffixAddPartitionsContext.class,0);
		}
		public AlterStatementSuffixDropPartitionsContext alterStatementSuffixDropPartitions() {
			return getRuleContext(AlterStatementSuffixDropPartitionsContext.class,0);
		}
		public SelectStatementWithCTEContext selectStatementWithCTE() {
			return getRuleContext(SelectStatementWithCTEContext.class,0);
		}
		public AlterViewStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterViewStatementSuffix; }
	}

	public final AlterViewStatementSuffixContext alterViewStatementSuffix() throws RecognitionException {
		AlterViewStatementSuffixContext _localctx = new AlterViewStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alterViewStatementSuffix);
		try {
			setState(1176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SET:
			case KW_UNSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				alterViewSuffixProperties();
				}
				break;
			case KW_RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				alterStatementSuffixRename();
				}
				break;
			case KW_ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1173);
				alterStatementSuffixAddPartitions();
				}
				break;
			case KW_DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				alterStatementSuffixDropPartitions();
				}
				break;
			case KW_SELECT:
			case KW_MAP:
			case KW_REDUCE:
			case KW_WITH:
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1175);
				selectStatementWithCTE();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterMaterializedViewStatementSuffixContext extends ParserRuleContext {
		public AlterMaterializedViewSuffixRewriteContext alterMaterializedViewSuffixRewrite() {
			return getRuleContext(AlterMaterializedViewSuffixRewriteContext.class,0);
		}
		public AlterMaterializedViewSuffixRebuildContext alterMaterializedViewSuffixRebuild() {
			return getRuleContext(AlterMaterializedViewSuffixRebuildContext.class,0);
		}
		public AlterMaterializedViewStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaterializedViewStatementSuffix; }
	}

	public final AlterMaterializedViewStatementSuffixContext alterMaterializedViewStatementSuffix() throws RecognitionException {
		AlterMaterializedViewStatementSuffixContext _localctx = new AlterMaterializedViewStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alterMaterializedViewStatementSuffix);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ENABLE:
			case KW_DISABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				alterMaterializedViewSuffixRewrite();
				}
				break;
			case KW_REBUILD:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				alterMaterializedViewSuffixRebuild();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseStatementSuffixContext extends ParserRuleContext {
		public AlterDatabaseSuffixPropertiesContext alterDatabaseSuffixProperties() {
			return getRuleContext(AlterDatabaseSuffixPropertiesContext.class,0);
		}
		public AlterDatabaseSuffixSetOwnerContext alterDatabaseSuffixSetOwner() {
			return getRuleContext(AlterDatabaseSuffixSetOwnerContext.class,0);
		}
		public AlterDatabaseSuffixSetLocationContext alterDatabaseSuffixSetLocation() {
			return getRuleContext(AlterDatabaseSuffixSetLocationContext.class,0);
		}
		public AlterDatabaseStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabaseStatementSuffix; }
	}

	public final AlterDatabaseStatementSuffixContext alterDatabaseStatementSuffix() throws RecognitionException {
		AlterDatabaseStatementSuffixContext _localctx = new AlterDatabaseStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alterDatabaseStatementSuffix);
		try {
			setState(1185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				alterDatabaseSuffixProperties();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1183);
				alterDatabaseSuffixSetOwner();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				alterDatabaseSuffixSetLocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseSuffixPropertiesContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_DBPROPERTIES() { return getToken(HiveParser.KW_DBPROPERTIES, 0); }
		public DbPropertiesContext dbProperties() {
			return getRuleContext(DbPropertiesContext.class,0);
		}
		public AlterDatabaseSuffixPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabaseSuffixProperties; }
	}

	public final AlterDatabaseSuffixPropertiesContext alterDatabaseSuffixProperties() throws RecognitionException {
		AlterDatabaseSuffixPropertiesContext _localctx = new AlterDatabaseSuffixPropertiesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alterDatabaseSuffixProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			identifier();
			setState(1188);
			match(KW_SET);
			setState(1189);
			match(KW_DBPROPERTIES);
			setState(1190);
			dbProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseSuffixSetOwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_OWNER() { return getToken(HiveParser.KW_OWNER, 0); }
		public PrincipalNameContext principalName() {
			return getRuleContext(PrincipalNameContext.class,0);
		}
		public AlterDatabaseSuffixSetOwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabaseSuffixSetOwner; }
	}

	public final AlterDatabaseSuffixSetOwnerContext alterDatabaseSuffixSetOwner() throws RecognitionException {
		AlterDatabaseSuffixSetOwnerContext _localctx = new AlterDatabaseSuffixSetOwnerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alterDatabaseSuffixSetOwner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			identifier();
			setState(1193);
			match(KW_SET);
			setState(1194);
			match(KW_OWNER);
			setState(1195);
			principalName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterDatabaseSuffixSetLocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public AlterDatabaseSuffixSetLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterDatabaseSuffixSetLocation; }
	}

	public final AlterDatabaseSuffixSetLocationContext alterDatabaseSuffixSetLocation() throws RecognitionException {
		AlterDatabaseSuffixSetLocationContext _localctx = new AlterDatabaseSuffixSetLocationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alterDatabaseSuffixSetLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			identifier();
			setState(1198);
			match(KW_SET);
			setState(1199);
			match(KW_LOCATION);
			setState(1200);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixRenameContext extends ParserRuleContext {
		public TerminalNode KW_RENAME() { return getToken(HiveParser.KW_RENAME, 0); }
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterStatementSuffixRenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixRename; }
	}

	public final AlterStatementSuffixRenameContext alterStatementSuffixRename() throws RecognitionException {
		AlterStatementSuffixRenameContext _localctx = new AlterStatementSuffixRenameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alterStatementSuffixRename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(KW_RENAME);
			setState(1203);
			match(KW_TO);
			setState(1204);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixAddColContext extends ParserRuleContext {
		public TerminalNode KW_COLUMNS() { return getToken(HiveParser.KW_COLUMNS, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_ADD() { return getToken(HiveParser.KW_ADD, 0); }
		public TerminalNode KW_REPLACE() { return getToken(HiveParser.KW_REPLACE, 0); }
		public RestrictOrCascadeContext restrictOrCascade() {
			return getRuleContext(RestrictOrCascadeContext.class,0);
		}
		public AlterStatementSuffixAddColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixAddCol; }
	}

	public final AlterStatementSuffixAddColContext alterStatementSuffixAddCol() throws RecognitionException {
		AlterStatementSuffixAddColContext _localctx = new AlterStatementSuffixAddColContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alterStatementSuffixAddCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_la = _input.LA(1);
			if ( !(_la==KW_ADD || _la==KW_REPLACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1207);
			match(KW_COLUMNS);
			setState(1208);
			match(LPAREN);
			setState(1209);
			columnNameTypeList();
			setState(1210);
			match(RPAREN);
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RESTRICT || _la==KW_CASCADE) {
				{
				setState(1211);
				restrictOrCascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixAddConstraintContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(HiveParser.KW_ADD, 0); }
		public AlterForeignKeyWithNameContext alterForeignKeyWithName() {
			return getRuleContext(AlterForeignKeyWithNameContext.class,0);
		}
		public AlterConstraintWithNameContext alterConstraintWithName() {
			return getRuleContext(AlterConstraintWithNameContext.class,0);
		}
		public AlterStatementSuffixAddConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixAddConstraint; }
	}

	public final AlterStatementSuffixAddConstraintContext alterStatementSuffixAddConstraint() throws RecognitionException {
		AlterStatementSuffixAddConstraintContext _localctx = new AlterStatementSuffixAddConstraintContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alterStatementSuffixAddConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(KW_ADD);
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(1215);
				alterForeignKeyWithName();
				}
				break;
			case 2:
				{
				setState(1216);
				alterConstraintWithName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixDropConstraintContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AlterStatementSuffixDropConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixDropConstraint; }
	}

	public final AlterStatementSuffixDropConstraintContext alterStatementSuffixDropConstraint() throws RecognitionException {
		AlterStatementSuffixDropConstraintContext _localctx = new AlterStatementSuffixDropConstraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_alterStatementSuffixDropConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(KW_DROP);
			setState(1220);
			match(KW_CONSTRAINT);
			setState(1221);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixRenameColContext extends ParserRuleContext {
		public TerminalNode KW_CHANGE() { return getToken(HiveParser.KW_CHANGE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public TerminalNode KW_COLUMN() { return getToken(HiveParser.KW_COLUMN, 0); }
		public AlterColumnConstraintContext alterColumnConstraint() {
			return getRuleContext(AlterColumnConstraintContext.class,0);
		}
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public AlterStatementChangeColPositionContext alterStatementChangeColPosition() {
			return getRuleContext(AlterStatementChangeColPositionContext.class,0);
		}
		public RestrictOrCascadeContext restrictOrCascade() {
			return getRuleContext(RestrictOrCascadeContext.class,0);
		}
		public AlterStatementSuffixRenameColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixRenameCol; }
	}

	public final AlterStatementSuffixRenameColContext alterStatementSuffixRenameCol() throws RecognitionException {
		AlterStatementSuffixRenameColContext _localctx = new AlterStatementSuffixRenameColContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_alterStatementSuffixRenameCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(KW_CHANGE);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLUMN) {
				{
				setState(1224);
				match(KW_COLUMN);
				}
			}

			setState(1227);
			identifier();
			setState(1228);
			identifier();
			setState(1229);
			colType();
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (KW_PRIMARY - 287)) | (1L << (KW_REFERENCES - 287)) | (1L << (KW_CONSTRAINT - 287)))) != 0)) {
				{
				setState(1230);
				alterColumnConstraint();
				}
			}

			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1233);
				match(KW_COMMENT);
				setState(1234);
				match(StringLiteral);
				}
			}

			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FIRST || _la==KW_AFTER) {
				{
				setState(1237);
				alterStatementChangeColPosition();
				}
			}

			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RESTRICT || _la==KW_CASCADE) {
				{
				setState(1240);
				restrictOrCascade();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixUpdateStatsColContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public TerminalNode KW_STATISTICS() { return getToken(HiveParser.KW_STATISTICS, 0); }
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode KW_COLUMN() { return getToken(HiveParser.KW_COLUMN, 0); }
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public AlterStatementSuffixUpdateStatsColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixUpdateStatsCol; }
	}

	public final AlterStatementSuffixUpdateStatsColContext alterStatementSuffixUpdateStatsCol() throws RecognitionException {
		AlterStatementSuffixUpdateStatsColContext _localctx = new AlterStatementSuffixUpdateStatsColContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_alterStatementSuffixUpdateStatsCol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(KW_UPDATE);
			setState(1244);
			match(KW_STATISTICS);
			setState(1245);
			match(KW_FOR);
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLUMN) {
				{
				setState(1246);
				match(KW_COLUMN);
				}
			}

			setState(1249);
			identifier();
			setState(1250);
			match(KW_SET);
			setState(1251);
			tableProperties();
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1252);
				match(KW_COMMENT);
				setState(1253);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixUpdateStatsContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public TerminalNode KW_STATISTICS() { return getToken(HiveParser.KW_STATISTICS, 0); }
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public AlterStatementSuffixUpdateStatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixUpdateStats; }
	}

	public final AlterStatementSuffixUpdateStatsContext alterStatementSuffixUpdateStats() throws RecognitionException {
		AlterStatementSuffixUpdateStatsContext _localctx = new AlterStatementSuffixUpdateStatsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_alterStatementSuffixUpdateStats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(KW_UPDATE);
			setState(1257);
			match(KW_STATISTICS);
			setState(1258);
			match(KW_SET);
			setState(1259);
			tableProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementChangeColPositionContext extends ParserRuleContext {
		public Token first;
		public TerminalNode KW_FIRST() { return getToken(HiveParser.KW_FIRST, 0); }
		public TerminalNode KW_AFTER() { return getToken(HiveParser.KW_AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AlterStatementChangeColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementChangeColPosition; }
	}

	public final AlterStatementChangeColPositionContext alterStatementChangeColPosition() throws RecognitionException {
		AlterStatementChangeColPositionContext _localctx = new AlterStatementChangeColPositionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alterStatementChangeColPosition);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1261);
				((AlterStatementChangeColPositionContext)_localctx).first = match(KW_FIRST);
				}
				break;
			case KW_AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1262);
				match(KW_AFTER);
				setState(1263);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixAddPartitionsContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(HiveParser.KW_ADD, 0); }
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public List<AlterStatementSuffixAddPartitionsElementContext> alterStatementSuffixAddPartitionsElement() {
			return getRuleContexts(AlterStatementSuffixAddPartitionsElementContext.class);
		}
		public AlterStatementSuffixAddPartitionsElementContext alterStatementSuffixAddPartitionsElement(int i) {
			return getRuleContext(AlterStatementSuffixAddPartitionsElementContext.class,i);
		}
		public AlterStatementSuffixAddPartitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixAddPartitions; }
	}

	public final AlterStatementSuffixAddPartitionsContext alterStatementSuffixAddPartitions() throws RecognitionException {
		AlterStatementSuffixAddPartitionsContext _localctx = new AlterStatementSuffixAddPartitionsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alterStatementSuffixAddPartitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(KW_ADD);
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1267);
				ifNotExists();
				}
			}

			setState(1271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1270);
				alterStatementSuffixAddPartitionsElement();
				}
				}
				setState(1273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_PARTITION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixAddPartitionsElementContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public PartitionLocationContext partitionLocation() {
			return getRuleContext(PartitionLocationContext.class,0);
		}
		public AlterStatementSuffixAddPartitionsElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixAddPartitionsElement; }
	}

	public final AlterStatementSuffixAddPartitionsElementContext alterStatementSuffixAddPartitionsElement() throws RecognitionException {
		AlterStatementSuffixAddPartitionsElementContext _localctx = new AlterStatementSuffixAddPartitionsElementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_alterStatementSuffixAddPartitionsElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			partitionSpec();
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCATION) {
				{
				setState(1276);
				partitionLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixTouchContext extends ParserRuleContext {
		public TerminalNode KW_TOUCH() { return getToken(HiveParser.KW_TOUCH, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AlterStatementSuffixTouchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixTouch; }
	}

	public final AlterStatementSuffixTouchContext alterStatementSuffixTouch() throws RecognitionException {
		AlterStatementSuffixTouchContext _localctx = new AlterStatementSuffixTouchContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_alterStatementSuffixTouch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(KW_TOUCH);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_PARTITION) {
				{
				{
				setState(1280);
				partitionSpec();
				}
				}
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixArchiveContext extends ParserRuleContext {
		public TerminalNode KW_ARCHIVE() { return getToken(HiveParser.KW_ARCHIVE, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AlterStatementSuffixArchiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixArchive; }
	}

	public final AlterStatementSuffixArchiveContext alterStatementSuffixArchive() throws RecognitionException {
		AlterStatementSuffixArchiveContext _localctx = new AlterStatementSuffixArchiveContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_alterStatementSuffixArchive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(KW_ARCHIVE);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_PARTITION) {
				{
				{
				setState(1287);
				partitionSpec();
				}
				}
				setState(1292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixUnArchiveContext extends ParserRuleContext {
		public TerminalNode KW_UNARCHIVE() { return getToken(HiveParser.KW_UNARCHIVE, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AlterStatementSuffixUnArchiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixUnArchive; }
	}

	public final AlterStatementSuffixUnArchiveContext alterStatementSuffixUnArchive() throws RecognitionException {
		AlterStatementSuffixUnArchiveContext _localctx = new AlterStatementSuffixUnArchiveContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_alterStatementSuffixUnArchive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(KW_UNARCHIVE);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_PARTITION) {
				{
				{
				setState(1294);
				partitionSpec();
				}
				}
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionLocationContext extends ParserRuleContext {
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public PartitionLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionLocation; }
	}

	public final PartitionLocationContext partitionLocation() throws RecognitionException {
		PartitionLocationContext _localctx = new PartitionLocationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_partitionLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
			match(KW_LOCATION);
			setState(1301);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixDropPartitionsContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public List<DropPartitionSpecContext> dropPartitionSpec() {
			return getRuleContexts(DropPartitionSpecContext.class);
		}
		public DropPartitionSpecContext dropPartitionSpec(int i) {
			return getRuleContext(DropPartitionSpecContext.class,i);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public TerminalNode KW_PURGE() { return getToken(HiveParser.KW_PURGE, 0); }
		public ReplicationClauseContext replicationClause() {
			return getRuleContext(ReplicationClauseContext.class,0);
		}
		public AlterStatementSuffixDropPartitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixDropPartitions; }
	}

	public final AlterStatementSuffixDropPartitionsContext alterStatementSuffixDropPartitions() throws RecognitionException {
		AlterStatementSuffixDropPartitionsContext _localctx = new AlterStatementSuffixDropPartitionsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alterStatementSuffixDropPartitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(KW_DROP);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1304);
				ifExists();
				}
			}

			setState(1307);
			dropPartitionSpec();
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1308);
				match(COMMA);
				setState(1309);
				dropPartitionSpec();
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PURGE) {
				{
				setState(1315);
				match(KW_PURGE);
				}
			}

			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(1318);
				replicationClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixPropertiesContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode KW_UNSET() { return getToken(HiveParser.KW_UNSET, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public AlterStatementSuffixPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixProperties; }
	}

	public final AlterStatementSuffixPropertiesContext alterStatementSuffixProperties() throws RecognitionException {
		AlterStatementSuffixPropertiesContext _localctx = new AlterStatementSuffixPropertiesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alterStatementSuffixProperties);
		int _la;
		try {
			setState(1330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1321);
				match(KW_SET);
				setState(1322);
				match(KW_TBLPROPERTIES);
				setState(1323);
				tableProperties();
				}
				break;
			case KW_UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				match(KW_UNSET);
				setState(1325);
				match(KW_TBLPROPERTIES);
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(1326);
					ifExists();
					}
				}

				setState(1329);
				tableProperties();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterViewSuffixPropertiesContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode KW_UNSET() { return getToken(HiveParser.KW_UNSET, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public AlterViewSuffixPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterViewSuffixProperties; }
	}

	public final AlterViewSuffixPropertiesContext alterViewSuffixProperties() throws RecognitionException {
		AlterViewSuffixPropertiesContext _localctx = new AlterViewSuffixPropertiesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_alterViewSuffixProperties);
		int _la;
		try {
			setState(1341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(KW_SET);
				setState(1333);
				match(KW_TBLPROPERTIES);
				setState(1334);
				tableProperties();
				}
				break;
			case KW_UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				match(KW_UNSET);
				setState(1336);
				match(KW_TBLPROPERTIES);
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(1337);
					ifExists();
					}
				}

				setState(1340);
				tableProperties();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterMaterializedViewSuffixRewriteContext extends ParserRuleContext {
		public RewriteEnabledContext rewriteEnabled() {
			return getRuleContext(RewriteEnabledContext.class,0);
		}
		public RewriteDisabledContext rewriteDisabled() {
			return getRuleContext(RewriteDisabledContext.class,0);
		}
		public AlterMaterializedViewSuffixRewriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaterializedViewSuffixRewrite; }
	}

	public final AlterMaterializedViewSuffixRewriteContext alterMaterializedViewSuffixRewrite() throws RecognitionException {
		AlterMaterializedViewSuffixRewriteContext _localctx = new AlterMaterializedViewSuffixRewriteContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_alterMaterializedViewSuffixRewrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ENABLE:
				{
				setState(1343);
				rewriteEnabled();
				}
				break;
			case KW_DISABLE:
				{
				setState(1344);
				rewriteDisabled();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterMaterializedViewSuffixRebuildContext extends ParserRuleContext {
		public TerminalNode KW_REBUILD() { return getToken(HiveParser.KW_REBUILD, 0); }
		public AlterMaterializedViewSuffixRebuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterMaterializedViewSuffixRebuild; }
	}

	public final AlterMaterializedViewSuffixRebuildContext alterMaterializedViewSuffixRebuild() throws RecognitionException {
		AlterMaterializedViewSuffixRebuildContext _localctx = new AlterMaterializedViewSuffixRebuildContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_alterMaterializedViewSuffixRebuild);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(KW_REBUILD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixSerdePropertiesContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_SERDE() { return getToken(HiveParser.KW_SERDE, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_SERDEPROPERTIES() { return getToken(HiveParser.KW_SERDEPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public AlterStatementSuffixSerdePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixSerdeProperties; }
	}

	public final AlterStatementSuffixSerdePropertiesContext alterStatementSuffixSerdeProperties() throws RecognitionException {
		AlterStatementSuffixSerdePropertiesContext _localctx = new AlterStatementSuffixSerdePropertiesContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_alterStatementSuffixSerdeProperties);
		try {
			setState(1360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1349);
				match(KW_SET);
				setState(1350);
				match(KW_SERDE);
				setState(1351);
				match(StringLiteral);
				setState(1355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(1352);
					match(KW_WITH);
					setState(1353);
					match(KW_SERDEPROPERTIES);
					setState(1354);
					tableProperties();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				match(KW_SET);
				setState(1358);
				match(KW_SERDEPROPERTIES);
				setState(1359);
				tableProperties();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterIndexStatementSuffixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_REBUILD() { return getToken(HiveParser.KW_REBUILD, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public AlterIndexStatementSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexStatementSuffix; }
	}

	public final AlterIndexStatementSuffixContext alterIndexStatementSuffix() throws RecognitionException {
		AlterIndexStatementSuffixContext _localctx = new AlterIndexStatementSuffixContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_alterIndexStatementSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			identifier();
			setState(1363);
			match(KW_ON);
			setState(1364);
			tableName();
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1365);
				partitionSpec();
				}
			}

			setState(1368);
			match(KW_REBUILD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixFileFormatContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_FILEFORMAT() { return getToken(HiveParser.KW_FILEFORMAT, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public AlterStatementSuffixFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixFileFormat; }
	}

	public final AlterStatementSuffixFileFormatContext alterStatementSuffixFileFormat() throws RecognitionException {
		AlterStatementSuffixFileFormatContext _localctx = new AlterStatementSuffixFileFormatContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alterStatementSuffixFileFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			match(KW_SET);
			setState(1371);
			match(KW_FILEFORMAT);
			setState(1372);
			fileFormat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixClusterbySortbyContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_CLUSTERED() { return getToken(HiveParser.KW_CLUSTERED, 0); }
		public TerminalNode KW_SORTED() { return getToken(HiveParser.KW_SORTED, 0); }
		public TableBucketsContext tableBuckets() {
			return getRuleContext(TableBucketsContext.class,0);
		}
		public AlterStatementSuffixClusterbySortbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixClusterbySortby; }
	}

	public final AlterStatementSuffixClusterbySortbyContext alterStatementSuffixClusterbySortby() throws RecognitionException {
		AlterStatementSuffixClusterbySortbyContext _localctx = new AlterStatementSuffixClusterbySortbyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_alterStatementSuffixClusterbySortby);
		try {
			setState(1379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				match(KW_NOT);
				setState(1375);
				match(KW_CLUSTERED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				match(KW_NOT);
				setState(1377);
				match(KW_SORTED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1378);
				tableBuckets();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTblPartitionStatementSuffixSkewedLocationContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_SKEWED() { return getToken(HiveParser.KW_SKEWED, 0); }
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public SkewedLocationsContext skewedLocations() {
			return getRuleContext(SkewedLocationsContext.class,0);
		}
		public AlterTblPartitionStatementSuffixSkewedLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTblPartitionStatementSuffixSkewedLocation; }
	}

	public final AlterTblPartitionStatementSuffixSkewedLocationContext alterTblPartitionStatementSuffixSkewedLocation() throws RecognitionException {
		AlterTblPartitionStatementSuffixSkewedLocationContext _localctx = new AlterTblPartitionStatementSuffixSkewedLocationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alterTblPartitionStatementSuffixSkewedLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(KW_SET);
			setState(1382);
			match(KW_SKEWED);
			setState(1383);
			match(KW_LOCATION);
			setState(1384);
			skewedLocations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedLocationsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public SkewedLocationsListContext skewedLocationsList() {
			return getRuleContext(SkewedLocationsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public SkewedLocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedLocations; }
	}

	public final SkewedLocationsContext skewedLocations() throws RecognitionException {
		SkewedLocationsContext _localctx = new SkewedLocationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_skewedLocations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(LPAREN);
			setState(1387);
			skewedLocationsList();
			setState(1388);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedLocationsListContext extends ParserRuleContext {
		public List<SkewedLocationMapContext> skewedLocationMap() {
			return getRuleContexts(SkewedLocationMapContext.class);
		}
		public SkewedLocationMapContext skewedLocationMap(int i) {
			return getRuleContext(SkewedLocationMapContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SkewedLocationsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedLocationsList; }
	}

	public final SkewedLocationsListContext skewedLocationsList() throws RecognitionException {
		SkewedLocationsListContext _localctx = new SkewedLocationsListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_skewedLocationsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			skewedLocationMap();
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1391);
				match(COMMA);
				setState(1392);
				skewedLocationMap();
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedLocationMapContext extends ParserRuleContext {
		public SkewedValueLocationElementContext skewedValueLocationElement() {
			return getRuleContext(SkewedValueLocationElementContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public SkewedLocationMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedLocationMap; }
	}

	public final SkewedLocationMapContext skewedLocationMap() throws RecognitionException {
		SkewedLocationMapContext _localctx = new SkewedLocationMapContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_skewedLocationMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			skewedValueLocationElement();
			setState(1399);
			match(EQUAL);
			setState(1400);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixLocationContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public AlterStatementSuffixLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixLocation; }
	}

	public final AlterStatementSuffixLocationContext alterStatementSuffixLocation() throws RecognitionException {
		AlterStatementSuffixLocationContext _localctx = new AlterStatementSuffixLocationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alterStatementSuffixLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(KW_SET);
			setState(1403);
			match(KW_LOCATION);
			setState(1404);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixSkewedbyContext extends ParserRuleContext {
		public TableSkewedContext tableSkewed() {
			return getRuleContext(TableSkewedContext.class,0);
		}
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_SKEWED() { return getToken(HiveParser.KW_SKEWED, 0); }
		public StoredAsDirsContext storedAsDirs() {
			return getRuleContext(StoredAsDirsContext.class,0);
		}
		public AlterStatementSuffixSkewedbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixSkewedby; }
	}

	public final AlterStatementSuffixSkewedbyContext alterStatementSuffixSkewedby() throws RecognitionException {
		AlterStatementSuffixSkewedbyContext _localctx = new AlterStatementSuffixSkewedbyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_alterStatementSuffixSkewedby);
		try {
			setState(1411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				tableSkewed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407);
				match(KW_NOT);
				setState(1408);
				match(KW_SKEWED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1409);
				match(KW_NOT);
				setState(1410);
				storedAsDirs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixExchangePartitionContext extends ParserRuleContext {
		public TerminalNode KW_EXCHANGE() { return getToken(HiveParser.KW_EXCHANGE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterStatementSuffixExchangePartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixExchangePartition; }
	}

	public final AlterStatementSuffixExchangePartitionContext alterStatementSuffixExchangePartition() throws RecognitionException {
		AlterStatementSuffixExchangePartitionContext _localctx = new AlterStatementSuffixExchangePartitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_alterStatementSuffixExchangePartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(KW_EXCHANGE);
			setState(1414);
			partitionSpec();
			setState(1415);
			match(KW_WITH);
			setState(1416);
			match(KW_TABLE);
			setState(1417);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixRenamePartContext extends ParserRuleContext {
		public TerminalNode KW_RENAME() { return getToken(HiveParser.KW_RENAME, 0); }
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public AlterStatementSuffixRenamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixRenamePart; }
	}

	public final AlterStatementSuffixRenamePartContext alterStatementSuffixRenamePart() throws RecognitionException {
		AlterStatementSuffixRenamePartContext _localctx = new AlterStatementSuffixRenamePartContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_alterStatementSuffixRenamePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(KW_RENAME);
			setState(1420);
			match(KW_TO);
			setState(1421);
			partitionSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixStatsPartContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public TerminalNode KW_STATISTICS() { return getToken(HiveParser.KW_STATISTICS, 0); }
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode KW_COLUMN() { return getToken(HiveParser.KW_COLUMN, 0); }
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public AlterStatementSuffixStatsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixStatsPart; }
	}

	public final AlterStatementSuffixStatsPartContext alterStatementSuffixStatsPart() throws RecognitionException {
		AlterStatementSuffixStatsPartContext _localctx = new AlterStatementSuffixStatsPartContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_alterStatementSuffixStatsPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(KW_UPDATE);
			setState(1424);
			match(KW_STATISTICS);
			setState(1425);
			match(KW_FOR);
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLUMN) {
				{
				setState(1426);
				match(KW_COLUMN);
				}
			}

			setState(1429);
			identifier();
			setState(1430);
			match(KW_SET);
			setState(1431);
			tableProperties();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1432);
				match(KW_COMMENT);
				setState(1433);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixMergeFilesContext extends ParserRuleContext {
		public TerminalNode KW_CONCATENATE() { return getToken(HiveParser.KW_CONCATENATE, 0); }
		public AlterStatementSuffixMergeFilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixMergeFiles; }
	}

	public final AlterStatementSuffixMergeFilesContext alterStatementSuffixMergeFiles() throws RecognitionException {
		AlterStatementSuffixMergeFilesContext _localctx = new AlterStatementSuffixMergeFilesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_alterStatementSuffixMergeFiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(KW_CONCATENATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixBucketNumContext extends ParserRuleContext {
		public TerminalNode KW_INTO() { return getToken(HiveParser.KW_INTO, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public TerminalNode KW_BUCKETS() { return getToken(HiveParser.KW_BUCKETS, 0); }
		public AlterStatementSuffixBucketNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixBucketNum; }
	}

	public final AlterStatementSuffixBucketNumContext alterStatementSuffixBucketNum() throws RecognitionException {
		AlterStatementSuffixBucketNumContext _localctx = new AlterStatementSuffixBucketNumContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_alterStatementSuffixBucketNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(KW_INTO);
			setState(1439);
			match(Number);
			setState(1440);
			match(KW_BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_INDEX() { return getToken(HiveParser.KW_INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public List<TerminalNode> KW_TABLE() { return getTokens(HiveParser.KW_TABLE); }
		public TerminalNode KW_TABLE(int i) {
			return getToken(HiveParser.KW_TABLE, i);
		}
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<ColumnParenthesesListContext> columnParenthesesList() {
			return getRuleContexts(ColumnParenthesesListContext.class);
		}
		public ColumnParenthesesListContext columnParenthesesList(int i) {
			return getRuleContext(ColumnParenthesesListContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_DEFERRED() { return getToken(HiveParser.KW_DEFERRED, 0); }
		public TerminalNode KW_REBUILD() { return getToken(HiveParser.KW_REBUILD, 0); }
		public TerminalNode KW_IDXPROPERTIES() { return getToken(HiveParser.KW_IDXPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(HiveParser.KW_IN, 0); }
		public TerminalNode KW_PARTITIONED() { return getToken(HiveParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TableFileFormatContext tableFileFormat() {
			return getRuleContext(TableFileFormatContext.class,0);
		}
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public LocationPathContext locationPath() {
			return getRuleContext(LocationPathContext.class,0);
		}
		public TablePropertiesPrefixedContext tablePropertiesPrefixed() {
			return getRuleContext(TablePropertiesPrefixedContext.class,0);
		}
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public TableRowFormatContext tableRowFormat() {
			return getRuleContext(TableRowFormatContext.class,0);
		}
		public CreateIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndexStatement; }
	}

	public final CreateIndexStatementContext createIndexStatement() throws RecognitionException {
		CreateIndexStatementContext _localctx = new CreateIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_createIndexStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(KW_CREATE);
			setState(1443);
			match(KW_INDEX);
			setState(1444);
			identifier();
			setState(1445);
			match(KW_ON);
			setState(1446);
			match(KW_TABLE);
			setState(1447);
			tableName();
			setState(1448);
			columnParenthesesList();
			setState(1449);
			match(KW_AS);
			setState(1450);
			match(StringLiteral);
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1451);
				match(KW_WITH);
				setState(1452);
				match(KW_DEFERRED);
				setState(1453);
				match(KW_REBUILD);
				}
				break;
			}
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IDXPROPERTIES) {
				{
				setState(1456);
				match(KW_IDXPROPERTIES);
				setState(1457);
				tableProperties();
				}
			}

			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(1460);
				match(KW_IN);
				setState(1461);
				match(KW_TABLE);
				setState(1462);
				tableName();
				}
			}

			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITIONED) {
				{
				setState(1465);
				match(KW_PARTITIONED);
				setState(1466);
				match(KW_BY);
				setState(1467);
				columnParenthesesList();
				}
			}

			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW || _la==KW_STORED) {
				{
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ROW) {
					{
					setState(1470);
					tableRowFormat();
					}
				}

				setState(1473);
				tableFileFormat();
				}
			}

			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCATION) {
				{
				setState(1476);
				match(KW_LOCATION);
				setState(1477);
				locationPath();
				}
			}

			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TBLPROPERTIES) {
				{
				setState(1480);
				tablePropertiesPrefixed();
				}
			}

			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(1483);
				tableComment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HiveParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HiveParser.DOT, i);
		}
		public LocationPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationPath; }
	}

	public final LocationPathContext locationPath() throws RecognitionException {
		LocationPathContext _localctx = new LocationPathContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_locationPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			identifier();
			setState(1491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1487);
				match(DOT);
				setState(1488);
				identifier();
				}
				}
				setState(1493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_INDEX() { return getToken(HiveParser.KW_INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropIndexStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexStatement; }
	}

	public final DropIndexStatementContext dropIndexStatement() throws RecognitionException {
		DropIndexStatementContext _localctx = new DropIndexStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_dropIndexStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(KW_DROP);
			setState(1495);
			match(KW_INDEX);
			setState(1496);
			identifier();
			setState(1497);
			match(KW_ON);
			setState(1498);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePartitionPrefixContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TablePartitionPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePartitionPrefix; }
	}

	public final TablePartitionPrefixContext tablePartitionPrefix() throws RecognitionException {
		TablePartitionPrefixContext _localctx = new TablePartitionPrefixContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tablePartitionPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			tableName();
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1501);
				partitionSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockingContext extends ParserRuleContext {
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public TerminalNode KW_WAIT() { return getToken(HiveParser.KW_WAIT, 0); }
		public BlockingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocking; }
	}

	public final BlockingContext blocking() throws RecognitionException {
		BlockingContext _localctx = new BlockingContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_blocking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(KW_AND);
			setState(1505);
			match(KW_WAIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixCompactContext extends ParserRuleContext {
		public TerminalNode KW_COMPACT() { return getToken(HiveParser.KW_COMPACT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public BlockingContext blocking() {
			return getRuleContext(BlockingContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(HiveParser.KW_OVERWRITE, 0); }
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public AlterStatementSuffixCompactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixCompact; }
	}

	public final AlterStatementSuffixCompactContext alterStatementSuffixCompact() throws RecognitionException {
		AlterStatementSuffixCompactContext _localctx = new AlterStatementSuffixCompactContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_alterStatementSuffixCompact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(KW_COMPACT);
			setState(1508);
			match(StringLiteral);
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AND) {
				{
				setState(1509);
				blocking();
				}
			}

			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1512);
				match(KW_WITH);
				setState(1513);
				match(KW_OVERWRITE);
				setState(1514);
				match(KW_TBLPROPERTIES);
				setState(1515);
				tableProperties();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterStatementSuffixSetOwnerContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_OWNER() { return getToken(HiveParser.KW_OWNER, 0); }
		public PrincipalNameContext principalName() {
			return getRuleContext(PrincipalNameContext.class,0);
		}
		public AlterStatementSuffixSetOwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterStatementSuffixSetOwner; }
	}

	public final AlterStatementSuffixSetOwnerContext alterStatementSuffixSetOwner() throws RecognitionException {
		AlterStatementSuffixSetOwnerContext _localctx = new AlterStatementSuffixSetOwnerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_alterStatementSuffixSetOwner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			match(KW_SET);
			setState(1519);
			match(KW_OWNER);
			setState(1520);
			principalName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public TerminalNode KW_INPUTFORMAT() { return getToken(HiveParser.KW_INPUTFORMAT, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public TerminalNode KW_OUTPUTFORMAT() { return getToken(HiveParser.KW_OUTPUTFORMAT, 0); }
		public TerminalNode KW_SERDE() { return getToken(HiveParser.KW_SERDE, 0); }
		public TerminalNode KW_INPUTDRIVER() { return getToken(HiveParser.KW_INPUTDRIVER, 0); }
		public TerminalNode KW_OUTPUTDRIVER() { return getToken(HiveParser.KW_OUTPUTDRIVER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_fileFormat);
		int _la;
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				match(KW_INPUTFORMAT);
				setState(1523);
				match(StringLiteral);
				setState(1524);
				match(KW_OUTPUTFORMAT);
				setState(1525);
				match(StringLiteral);
				setState(1526);
				match(KW_SERDE);
				setState(1527);
				match(StringLiteral);
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_INPUTDRIVER) {
					{
					setState(1528);
					match(KW_INPUTDRIVER);
					setState(1529);
					match(StringLiteral);
					setState(1530);
					match(KW_OUTPUTDRIVER);
					setState(1531);
					match(StringLiteral);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputFileFormatContext extends ParserRuleContext {
		public TerminalNode KW_INPUTFORMAT() { return getToken(HiveParser.KW_INPUTFORMAT, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public TerminalNode KW_SERDE() { return getToken(HiveParser.KW_SERDE, 0); }
		public InputFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputFileFormat; }
	}

	public final InputFileFormatContext inputFileFormat() throws RecognitionException {
		InputFileFormatContext _localctx = new InputFileFormatContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_inputFileFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			match(KW_INPUTFORMAT);
			setState(1538);
			match(StringLiteral);
			setState(1539);
			match(KW_SERDE);
			setState(1540);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabTypeExprContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HiveParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HiveParser.DOT, i);
		}
		public List<TerminalNode> KW_ELEM_TYPE() { return getTokens(HiveParser.KW_ELEM_TYPE); }
		public TerminalNode KW_ELEM_TYPE(int i) {
			return getToken(HiveParser.KW_ELEM_TYPE, i);
		}
		public List<TerminalNode> KW_KEY_TYPE() { return getTokens(HiveParser.KW_KEY_TYPE); }
		public TerminalNode KW_KEY_TYPE(int i) {
			return getToken(HiveParser.KW_KEY_TYPE, i);
		}
		public List<TerminalNode> KW_VALUE_TYPE() { return getTokens(HiveParser.KW_VALUE_TYPE); }
		public TerminalNode KW_VALUE_TYPE(int i) {
			return getToken(HiveParser.KW_VALUE_TYPE, i);
		}
		public TabTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabTypeExpr; }
	}

	public final TabTypeExprContext tabTypeExpr() throws RecognitionException {
		TabTypeExprContext _localctx = new TabTypeExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tabTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			identifier();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1543);
				match(DOT);
				setState(1544);
				identifier();
				}
			}

			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1547);
				identifier();
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1548);
					match(DOT);
					setState(1553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1549);
						match(KW_ELEM_TYPE);
						}
						break;
					case 2:
						{
						setState(1550);
						match(KW_KEY_TYPE);
						}
						break;
					case 3:
						{
						setState(1551);
						match(KW_VALUE_TYPE);
						}
						break;
					case 4:
						{
						setState(1552);
						identifier();
						}
						break;
					}
					}
					}
					setState(1559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartTypeExprContext extends ParserRuleContext {
		public TabTypeExprContext tabTypeExpr() {
			return getRuleContext(TabTypeExprContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public PartTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partTypeExpr; }
	}

	public final PartTypeExprContext partTypeExpr() throws RecognitionException {
		PartTypeExprContext _localctx = new PartTypeExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_partTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			tabTypeExpr();
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1563);
				partitionSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TabPartColTypeExprContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ExtColumnNameContext extColumnName() {
			return getRuleContext(ExtColumnNameContext.class,0);
		}
		public TabPartColTypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabPartColTypeExpr; }
	}

	public final TabPartColTypeExprContext tabPartColTypeExpr() throws RecognitionException {
		TabPartColTypeExprContext _localctx = new TabPartColTypeExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_tabPartColTypeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			tableName();
			setState(1568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1567);
				partitionSpec();
				}
			}

			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1570);
				extColumnName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescStatementContext extends ParserRuleContext {
		public TerminalNode KW_DESCRIBE() { return getToken(HiveParser.KW_DESCRIBE, 0); }
		public TerminalNode KW_DESC() { return getToken(HiveParser.KW_DESC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(HiveParser.KW_FUNCTION, 0); }
		public DescFuncNamesContext descFuncNames() {
			return getRuleContext(DescFuncNamesContext.class,0);
		}
		public TabPartColTypeExprContext tabPartColTypeExpr() {
			return getRuleContext(TabPartColTypeExprContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TerminalNode KW_EXTENDED() { return getToken(HiveParser.KW_EXTENDED, 0); }
		public TerminalNode KW_FORMATTED() { return getToken(HiveParser.KW_FORMATTED, 0); }
		public DescStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descStatement; }
	}

	public final DescStatementContext descStatement() throws RecognitionException {
		DescStatementContext _localctx = new DescStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_descStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			_la = _input.LA(1);
			if ( !(_la==KW_DESC || _la==KW_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1574);
				_la = _input.LA(1);
				if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_EXTENDED) {
					{
					setState(1575);
					match(KW_EXTENDED);
					}
				}

				setState(1578);
				identifier();
				}
				break;
			case 2:
				{
				setState(1579);
				match(KW_FUNCTION);
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_EXTENDED) {
					{
					setState(1580);
					match(KW_EXTENDED);
					}
				}

				setState(1583);
				descFuncNames();
				}
				break;
			case 3:
				{
				{
				setState(1584);
				_la = _input.LA(1);
				if ( !(_la==KW_EXTENDED || _la==KW_FORMATTED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1585);
				tabPartColTypeExpr();
				}
				}
				break;
			case 4:
				{
				setState(1586);
				tabPartColTypeExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalyzeStatementContext extends ParserRuleContext {
		public TerminalNode KW_ANALYZE() { return getToken(HiveParser.KW_ANALYZE, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public TerminalNode KW_COMPUTE() { return getToken(HiveParser.KW_COMPUTE, 0); }
		public TerminalNode KW_STATISTICS() { return getToken(HiveParser.KW_STATISTICS, 0); }
		public TerminalNode KW_CACHE() { return getToken(HiveParser.KW_CACHE, 0); }
		public TerminalNode KW_METADATA() { return getToken(HiveParser.KW_METADATA, 0); }
		public TerminalNode KW_NOSCAN() { return getToken(HiveParser.KW_NOSCAN, 0); }
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public TerminalNode KW_COLUMNS() { return getToken(HiveParser.KW_COLUMNS, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public AnalyzeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyzeStatement; }
	}

	public final AnalyzeStatementContext analyzeStatement() throws RecognitionException {
		AnalyzeStatementContext _localctx = new AnalyzeStatementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_analyzeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(KW_ANALYZE);
			setState(1590);
			match(KW_TABLE);
			{
			setState(1591);
			tableOrPartition();
			}
			setState(1604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_COMPUTE:
				{
				setState(1592);
				match(KW_COMPUTE);
				setState(1593);
				match(KW_STATISTICS);
				setState(1600);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_NOSCAN:
					{
					setState(1594);
					match(KW_NOSCAN);
					}
					break;
				case KW_FOR:
					{
					{
					setState(1595);
					match(KW_FOR);
					setState(1596);
					match(KW_COLUMNS);
					setState(1598);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(1597);
						columnNameList();
						}
						break;
					}
					}
					}
					break;
				case EOF:
				case KW_DESC:
				case KW_FROM:
				case KW_SELECT:
				case KW_INSERT:
				case KW_SHOW:
				case KW_MSCK:
				case KW_LOAD:
				case KW_EXPORT:
				case KW_IMPORT:
				case KW_CREATE:
				case KW_ALTER:
				case KW_DESCRIBE:
				case KW_DROP:
				case KW_MAP:
				case KW_REDUCE:
				case KW_KILL:
				case KW_EXPLAIN:
				case KW_WITH:
				case KW_SET:
				case KW_DELETE:
				case KW_GRANT:
				case KW_REVOKE:
				case KW_LOCK:
				case KW_UNLOCK:
				case KW_ANALYZE:
				case KW_USE:
				case KW_UPDATE:
				case KW_TRUNCATE:
				case KW_RELOAD:
				case KW_START:
				case KW_COMMIT:
				case KW_ROLLBACK:
				case KW_ABORT:
				case KW_MERGE:
				case KW_REPL:
				case SEMICOLON:
				case LPAREN:
					break;
				default:
					break;
				}
				}
				break;
			case KW_CACHE:
				{
				setState(1602);
				match(KW_CACHE);
				setState(1603);
				match(KW_METADATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowStatementContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_DATABASES() { return getToken(HiveParser.KW_DATABASES, 0); }
		public TerminalNode KW_SCHEMAS() { return getToken(HiveParser.KW_SCHEMAS, 0); }
		public TerminalNode KW_LIKE() { return getToken(HiveParser.KW_LIKE, 0); }
		public ShowStmtIdentifierContext showStmtIdentifier() {
			return getRuleContext(ShowStmtIdentifierContext.class,0);
		}
		public TerminalNode KW_TABLES() { return getToken(HiveParser.KW_TABLES, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> KW_FROM() { return getTokens(HiveParser.KW_FROM); }
		public TerminalNode KW_FROM(int i) {
			return getToken(HiveParser.KW_FROM, i);
		}
		public List<TerminalNode> KW_IN() { return getTokens(HiveParser.KW_IN); }
		public TerminalNode KW_IN(int i) {
			return getToken(HiveParser.KW_IN, i);
		}
		public TerminalNode KW_VIEWS() { return getToken(HiveParser.KW_VIEWS, 0); }
		public TerminalNode KW_MATERIALIZED() { return getToken(HiveParser.KW_MATERIALIZED, 0); }
		public TerminalNode KW_COLUMNS() { return getToken(HiveParser.KW_COLUMNS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_FUNCTIONS() { return getToken(HiveParser.KW_FUNCTIONS, 0); }
		public ShowFunctionIdentifierContext showFunctionIdentifier() {
			return getRuleContext(ShowFunctionIdentifierContext.class,0);
		}
		public TerminalNode KW_PARTITIONS() { return getToken(HiveParser.KW_PARTITIONS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TerminalNode KW_EXTENDED() { return getToken(HiveParser.KW_EXTENDED, 0); }
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_LOCKS() { return getToken(HiveParser.KW_LOCKS, 0); }
		public PartTypeExprContext partTypeExpr() {
			return getRuleContext(PartTypeExprContext.class,0);
		}
		public TerminalNode KW_COMPACTIONS() { return getToken(HiveParser.KW_COMPACTIONS, 0); }
		public TerminalNode KW_TRANSACTIONS() { return getToken(HiveParser.KW_TRANSACTIONS, 0); }
		public TerminalNode KW_CONF() { return getToken(HiveParser.KW_CONF, 0); }
		public TerminalNode KW_RESOURCE() { return getToken(HiveParser.KW_RESOURCE, 0); }
		public TerminalNode KW_PLANS() { return getToken(HiveParser.KW_PLANS, 0); }
		public TerminalNode KW_PLAN() { return getToken(HiveParser.KW_PLAN, 0); }
		public ShowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStatement; }
	}

	public final ShowStatementContext showStatement() throws RecognitionException {
		ShowStatementContext _localctx = new ShowStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_showStatement);
		int _la;
		try {
			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				match(KW_SHOW);
				setState(1607);
				_la = _input.LA(1);
				if ( !(_la==KW_DATABASES || _la==KW_SCHEMAS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LIKE) {
					{
					setState(1608);
					match(KW_LIKE);
					setState(1609);
					showStmtIdentifier();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				match(KW_SHOW);
				setState(1613);
				match(KW_TABLES);
				setState(1616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1614);
					_la = _input.LA(1);
					if ( !(_la==KW_FROM || _la==KW_IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1615);
					identifier();
					}
					break;
				}
				setState(1621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1618);
					match(KW_LIKE);
					setState(1619);
					showStmtIdentifier();
					}
					break;
				case 2:
					{
					setState(1620);
					showStmtIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1623);
				match(KW_SHOW);
				setState(1624);
				match(KW_VIEWS);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1625);
					_la = _input.LA(1);
					if ( !(_la==KW_FROM || _la==KW_IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1626);
					identifier();
					}
					break;
				}
				setState(1632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1629);
					match(KW_LIKE);
					setState(1630);
					showStmtIdentifier();
					}
					break;
				case 2:
					{
					setState(1631);
					showStmtIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1634);
				match(KW_SHOW);
				setState(1635);
				match(KW_MATERIALIZED);
				setState(1636);
				match(KW_VIEWS);
				setState(1639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1637);
					_la = _input.LA(1);
					if ( !(_la==KW_FROM || _la==KW_IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1638);
					identifier();
					}
					break;
				}
				setState(1644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1641);
					match(KW_LIKE);
					setState(1642);
					showStmtIdentifier();
					}
					break;
				case 2:
					{
					setState(1643);
					showStmtIdentifier();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1646);
				match(KW_SHOW);
				setState(1647);
				match(KW_COLUMNS);
				setState(1648);
				_la = _input.LA(1);
				if ( !(_la==KW_FROM || _la==KW_IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1649);
				tableName();
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1650);
					_la = _input.LA(1);
					if ( !(_la==KW_FROM || _la==KW_IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1651);
					identifier();
					}
					break;
				}
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1654);
					match(KW_LIKE);
					setState(1655);
					showStmtIdentifier();
					}
					break;
				case 2:
					{
					setState(1656);
					showStmtIdentifier();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1659);
				match(KW_SHOW);
				setState(1660);
				match(KW_FUNCTIONS);
				setState(1664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1661);
					match(KW_LIKE);
					setState(1662);
					showFunctionIdentifier();
					}
					break;
				case 2:
					{
					setState(1663);
					showFunctionIdentifier();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1666);
				match(KW_SHOW);
				setState(1667);
				match(KW_PARTITIONS);
				setState(1668);
				tableName();
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1669);
					partitionSpec();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1672);
				match(KW_SHOW);
				setState(1673);
				match(KW_CREATE);
				setState(1678);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_DATABASE:
				case KW_SCHEMA:
					{
					setState(1674);
					_la = _input.LA(1);
					if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1675);
					identifier();
					}
					break;
				case KW_TABLE:
					{
					setState(1676);
					match(KW_TABLE);
					setState(1677);
					tableName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1680);
				match(KW_SHOW);
				setState(1681);
				match(KW_TABLE);
				setState(1682);
				match(KW_EXTENDED);
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FROM || _la==KW_IN) {
					{
					setState(1683);
					_la = _input.LA(1);
					if ( !(_la==KW_FROM || _la==KW_IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1684);
					identifier();
					}
				}

				setState(1687);
				match(KW_LIKE);
				setState(1688);
				showStmtIdentifier();
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1689);
					partitionSpec();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1692);
				match(KW_SHOW);
				setState(1693);
				match(KW_TBLPROPERTIES);
				setState(1694);
				tableName();
				setState(1698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1695);
					match(LPAREN);
					setState(1696);
					match(StringLiteral);
					setState(1697);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1700);
				match(KW_SHOW);
				setState(1701);
				match(KW_LOCKS);
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1702);
					_la = _input.LA(1);
					if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1703);
					identifier();
					setState(1705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_EXTENDED) {
						{
						setState(1704);
						match(KW_EXTENDED);
						}
					}

					}
					break;
				case 2:
					{
					setState(1708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						setState(1707);
						partTypeExpr();
						}
						break;
					}
					setState(1711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_EXTENDED) {
						{
						setState(1710);
						match(KW_EXTENDED);
						}
					}

					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1715);
				match(KW_SHOW);
				setState(1716);
				match(KW_COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1717);
				match(KW_SHOW);
				setState(1718);
				match(KW_TRANSACTIONS);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1719);
				match(KW_SHOW);
				setState(1720);
				match(KW_CONF);
				setState(1721);
				match(StringLiteral);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1722);
				match(KW_SHOW);
				setState(1723);
				match(KW_RESOURCE);
				setState(1727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_PLAN:
					{
					{
					setState(1724);
					match(KW_PLAN);
					setState(1725);
					identifier();
					}
					}
					break;
				case KW_PLANS:
					{
					setState(1726);
					match(KW_PLANS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockStatementContext extends ParserRuleContext {
		public TerminalNode KW_LOCK() { return getToken(HiveParser.KW_LOCK, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public LockModeContext lockMode() {
			return getRuleContext(LockModeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStatement; }
	}

	public final LockStatementContext lockStatement() throws RecognitionException {
		LockStatementContext _localctx = new LockStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_lockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(KW_LOCK);
			setState(1732);
			match(KW_TABLE);
			setState(1733);
			tableName();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1734);
				partitionSpec();
				}
			}

			setState(1737);
			lockMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockDatabaseContext extends ParserRuleContext {
		public TerminalNode KW_LOCK() { return getToken(HiveParser.KW_LOCK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LockModeContext lockMode() {
			return getRuleContext(LockModeContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public LockDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockDatabase; }
	}

	public final LockDatabaseContext lockDatabase() throws RecognitionException {
		LockDatabaseContext _localctx = new LockDatabaseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_lockDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(KW_LOCK);
			setState(1740);
			_la = _input.LA(1);
			if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1741);
			identifier();
			setState(1742);
			lockMode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockModeContext extends ParserRuleContext {
		public TerminalNode KW_SHARED() { return getToken(HiveParser.KW_SHARED, 0); }
		public TerminalNode KW_EXCLUSIVE() { return getToken(HiveParser.KW_EXCLUSIVE, 0); }
		public LockModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockMode; }
	}

	public final LockModeContext lockMode() throws RecognitionException {
		LockModeContext _localctx = new LockModeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_lockMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ( !(_la==KW_SHARED || _la==KW_EXCLUSIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlockStatementContext extends ParserRuleContext {
		public TerminalNode KW_UNLOCK() { return getToken(HiveParser.KW_UNLOCK, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public UnlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockStatement; }
	}

	public final UnlockStatementContext unlockStatement() throws RecognitionException {
		UnlockStatementContext _localctx = new UnlockStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(KW_UNLOCK);
			setState(1747);
			match(KW_TABLE);
			setState(1748);
			tableName();
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(1749);
				partitionSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlockDatabaseContext extends ParserRuleContext {
		public TerminalNode KW_UNLOCK() { return getToken(HiveParser.KW_UNLOCK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public UnlockDatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlockDatabase; }
	}

	public final UnlockDatabaseContext unlockDatabase() throws RecognitionException {
		UnlockDatabaseContext _localctx = new UnlockDatabaseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unlockDatabase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(KW_UNLOCK);
			setState(1753);
			_la = _input.LA(1);
			if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1754);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CreateRoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRoleStatement; }
	}

	public final CreateRoleStatementContext createRoleStatement() throws RecognitionException {
		CreateRoleStatementContext _localctx = new CreateRoleStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_createRoleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(KW_CREATE);
			setState(1757);
			match(KW_ROLE);
			setState(1758);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRoleStatement; }
	}

	public final DropRoleStatementContext dropRoleStatement() throws RecognitionException {
		DropRoleStatementContext _localctx = new DropRoleStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_dropRoleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(KW_DROP);
			setState(1761);
			match(KW_ROLE);
			setState(1762);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantPrivilegesContext extends ParserRuleContext {
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public PrivilegeListContext privilegeList() {
			return getRuleContext(PrivilegeListContext.class,0);
		}
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public PrincipalSpecificationContext principalSpecification() {
			return getRuleContext(PrincipalSpecificationContext.class,0);
		}
		public PrivilegeObjectContext privilegeObject() {
			return getRuleContext(PrivilegeObjectContext.class,0);
		}
		public WithGrantOptionContext withGrantOption() {
			return getRuleContext(WithGrantOptionContext.class,0);
		}
		public GrantPrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantPrivileges; }
	}

	public final GrantPrivilegesContext grantPrivileges() throws RecognitionException {
		GrantPrivilegesContext _localctx = new GrantPrivilegesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_grantPrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(KW_GRANT);
			setState(1765);
			privilegeList();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ON) {
				{
				setState(1766);
				privilegeObject();
				}
			}

			setState(1769);
			match(KW_TO);
			setState(1770);
			principalSpecification();
			setState(1772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1771);
				withGrantOption();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokePrivilegesContext extends ParserRuleContext {
		public TerminalNode KW_REVOKE() { return getToken(HiveParser.KW_REVOKE, 0); }
		public PrivilegeListContext privilegeList() {
			return getRuleContext(PrivilegeListContext.class,0);
		}
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public PrincipalSpecificationContext principalSpecification() {
			return getRuleContext(PrincipalSpecificationContext.class,0);
		}
		public GrantOptionForContext grantOptionFor() {
			return getRuleContext(GrantOptionForContext.class,0);
		}
		public PrivilegeObjectContext privilegeObject() {
			return getRuleContext(PrivilegeObjectContext.class,0);
		}
		public RevokePrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokePrivileges; }
	}

	public final RevokePrivilegesContext revokePrivileges() throws RecognitionException {
		RevokePrivilegesContext _localctx = new RevokePrivilegesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_revokePrivileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(KW_REVOKE);
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GRANT) {
				{
				setState(1775);
				grantOptionFor();
				}
			}

			setState(1778);
			privilegeList();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ON) {
				{
				setState(1779);
				privilegeObject();
				}
			}

			setState(1782);
			match(KW_FROM);
			setState(1783);
			principalSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantRoleContext extends ParserRuleContext {
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public PrincipalSpecificationContext principalSpecification() {
			return getRuleContext(PrincipalSpecificationContext.class,0);
		}
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public WithAdminOptionContext withAdminOption() {
			return getRuleContext(WithAdminOptionContext.class,0);
		}
		public GrantRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantRole; }
	}

	public final GrantRoleContext grantRole() throws RecognitionException {
		GrantRoleContext _localctx = new GrantRoleContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_grantRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(KW_GRANT);
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1786);
				match(KW_ROLE);
				}
				break;
			}
			setState(1789);
			identifier();
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1790);
				match(COMMA);
				setState(1791);
				identifier();
				}
				}
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1797);
			match(KW_TO);
			setState(1798);
			principalSpecification();
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1799);
				withAdminOption();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeRoleContext extends ParserRuleContext {
		public TerminalNode KW_REVOKE() { return getToken(HiveParser.KW_REVOKE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public PrincipalSpecificationContext principalSpecification() {
			return getRuleContext(PrincipalSpecificationContext.class,0);
		}
		public AdminOptionForContext adminOptionFor() {
			return getRuleContext(AdminOptionForContext.class,0);
		}
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public RevokeRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revokeRole; }
	}

	public final RevokeRoleContext revokeRole() throws RecognitionException {
		RevokeRoleContext _localctx = new RevokeRoleContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_revokeRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(KW_REVOKE);
			setState(1804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1803);
				adminOptionFor();
				}
				break;
			}
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1806);
				match(KW_ROLE);
				}
				break;
			}
			setState(1809);
			identifier();
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1810);
				match(COMMA);
				setState(1811);
				identifier();
				}
				}
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1817);
			match(KW_FROM);
			setState(1818);
			principalSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRoleGrantsContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public PrincipalNameContext principalName() {
			return getRuleContext(PrincipalNameContext.class,0);
		}
		public ShowRoleGrantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRoleGrants; }
	}

	public final ShowRoleGrantsContext showRoleGrants() throws RecognitionException {
		ShowRoleGrantsContext _localctx = new ShowRoleGrantsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_showRoleGrants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(KW_SHOW);
			setState(1821);
			match(KW_ROLE);
			setState(1822);
			match(KW_GRANT);
			setState(1823);
			principalName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRolesContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_ROLES() { return getToken(HiveParser.KW_ROLES, 0); }
		public ShowRolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRoles; }
	}

	public final ShowRolesContext showRoles() throws RecognitionException {
		ShowRolesContext _localctx = new ShowRolesContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_showRoles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(KW_SHOW);
			setState(1826);
			match(KW_ROLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowCurrentRoleContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_CURRENT() { return getToken(HiveParser.KW_CURRENT, 0); }
		public TerminalNode KW_ROLES() { return getToken(HiveParser.KW_ROLES, 0); }
		public ShowCurrentRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCurrentRole; }
	}

	public final ShowCurrentRoleContext showCurrentRole() throws RecognitionException {
		ShowCurrentRoleContext _localctx = new ShowCurrentRoleContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_showCurrentRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(KW_SHOW);
			setState(1829);
			match(KW_CURRENT);
			setState(1830);
			match(KW_ROLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRoleContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public TerminalNode KW_NONE() { return getToken(HiveParser.KW_NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRole; }
	}

	public final SetRoleContext setRole() throws RecognitionException {
		SetRoleContext _localctx = new SetRoleContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_setRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(KW_SET);
			setState(1833);
			match(KW_ROLE);
			setState(1837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				{
				setState(1834);
				match(KW_ALL);
				}
				break;
			case KW_NONE:
				{
				setState(1835);
				match(KW_NONE);
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				{
				setState(1836);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowGrantsContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public PrincipalNameContext principalName() {
			return getRuleContext(PrincipalNameContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public PrivilegeIncludeColObjectContext privilegeIncludeColObject() {
			return getRuleContext(PrivilegeIncludeColObjectContext.class,0);
		}
		public ShowGrantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showGrants; }
	}

	public final ShowGrantsContext showGrants() throws RecognitionException {
		ShowGrantsContext _localctx = new ShowGrantsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_showGrants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(KW_SHOW);
			setState(1840);
			match(KW_GRANT);
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GROUP || _la==KW_USER || _la==KW_ROLE) {
				{
				setState(1841);
				principalName();
				}
			}

			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ON) {
				{
				setState(1844);
				match(KW_ON);
				setState(1845);
				privilegeIncludeColObject();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowRolePrincipalsContext extends ParserRuleContext {
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_PRINCIPALS() { return getToken(HiveParser.KW_PRINCIPALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowRolePrincipalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showRolePrincipals; }
	}

	public final ShowRolePrincipalsContext showRolePrincipals() throws RecognitionException {
		ShowRolePrincipalsContext _localctx = new ShowRolePrincipalsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_showRolePrincipals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(KW_SHOW);
			setState(1849);
			match(KW_PRINCIPALS);
			setState(1850);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeIncludeColObjectContext extends ParserRuleContext {
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public PrivObjectColsContext privObjectCols() {
			return getRuleContext(PrivObjectColsContext.class,0);
		}
		public PrivilegeIncludeColObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeIncludeColObject; }
	}

	public final PrivilegeIncludeColObjectContext privilegeIncludeColObject() throws RecognitionException {
		PrivilegeIncludeColObjectContext _localctx = new PrivilegeIncludeColObjectContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_privilegeIncludeColObject);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1852);
				match(KW_ALL);
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLE:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASE:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
				privObjectCols();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeObjectContext extends ParserRuleContext {
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public PrivObjectContext privObject() {
			return getRuleContext(PrivObjectContext.class,0);
		}
		public PrivilegeObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeObject; }
	}

	public final PrivilegeObjectContext privilegeObject() throws RecognitionException {
		PrivilegeObjectContext _localctx = new PrivilegeObjectContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_privilegeObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(KW_ON);
			setState(1857);
			privObject();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivObjectContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode KW_URI() { return getToken(HiveParser.KW_URI, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_SERVER() { return getToken(HiveParser.KW_SERVER, 0); }
		public PrivObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privObject; }
	}

	public final PrivObjectContext privObject() throws RecognitionException {
		PrivObjectContext _localctx = new PrivObjectContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_privObject);
		int _la;
		try {
			setState(1872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				_la = _input.LA(1);
				if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1860);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TABLE) {
					{
					setState(1861);
					match(KW_TABLE);
					}
				}

				setState(1864);
				tableName();
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1865);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1868);
				match(KW_URI);
				setState(1869);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1870);
				match(KW_SERVER);
				setState(1871);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivObjectColsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_DATABASE() { return getToken(HiveParser.KW_DATABASE, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode KW_URI() { return getToken(HiveParser.KW_URI, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_SERVER() { return getToken(HiveParser.KW_SERVER, 0); }
		public PrivObjectColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privObjectCols; }
	}

	public final PrivObjectColsContext privObjectCols() throws RecognitionException {
		PrivObjectColsContext _localctx = new PrivObjectColsContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_privObjectCols);
		int _la;
		try {
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				_la = _input.LA(1);
				if ( !(_la==KW_DATABASE || _la==KW_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1875);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TABLE) {
					{
					setState(1876);
					match(KW_TABLE);
					}
				}

				setState(1879);
				tableName();
				setState(1884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1880);
					match(LPAREN);
					setState(1881);
					columnNameList();
					setState(1882);
					match(RPAREN);
					}
					break;
				}
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1886);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1889);
				match(KW_URI);
				setState(1890);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1891);
				match(KW_SERVER);
				setState(1892);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeListContext extends ParserRuleContext {
		public List<PrivlegeDefContext> privlegeDef() {
			return getRuleContexts(PrivlegeDefContext.class);
		}
		public PrivlegeDefContext privlegeDef(int i) {
			return getRuleContext(PrivlegeDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public PrivilegeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeList; }
	}

	public final PrivilegeListContext privilegeList() throws RecognitionException {
		PrivilegeListContext _localctx = new PrivilegeListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_privilegeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			privlegeDef();
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1896);
				match(COMMA);
				setState(1897);
				privlegeDef();
				}
				}
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivlegeDefContext extends ParserRuleContext {
		public PrivilegeTypeContext privilegeType() {
			return getRuleContext(PrivilegeTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public PrivlegeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privlegeDef; }
	}

	public final PrivlegeDefContext privlegeDef() throws RecognitionException {
		PrivlegeDefContext _localctx = new PrivlegeDefContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_privlegeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			privilegeType();
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1904);
				match(LPAREN);
				setState(1905);
				columnNameList();
				setState(1906);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeTypeContext extends ParserRuleContext {
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public TerminalNode KW_ALTER() { return getToken(HiveParser.KW_ALTER, 0); }
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_LOCK() { return getToken(HiveParser.KW_LOCK, 0); }
		public TerminalNode KW_SELECT() { return getToken(HiveParser.KW_SELECT, 0); }
		public TerminalNode KW_SHOW_DATABASE() { return getToken(HiveParser.KW_SHOW_DATABASE, 0); }
		public TerminalNode KW_INSERT() { return getToken(HiveParser.KW_INSERT, 0); }
		public TerminalNode KW_DELETE() { return getToken(HiveParser.KW_DELETE, 0); }
		public PrivilegeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType; }
	}

	public final PrivilegeTypeContext privilegeType() throws RecognitionException {
		PrivilegeTypeContext _localctx = new PrivilegeTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_privilegeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ALL) | (1L << KW_SELECT) | (1L << KW_INSERT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (KW_CREATE - 65)) | (1L << (KW_ALTER - 65)) | (1L << (KW_DROP - 65)))) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & ((1L << (KW_DELETE - 173)) | (1L << (KW_LOCK - 173)) | (1L << (KW_SHOW_DATABASE - 173)) | (1L << (KW_UPDATE - 173)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalSpecificationContext extends ParserRuleContext {
		public List<PrincipalNameContext> principalName() {
			return getRuleContexts(PrincipalNameContext.class);
		}
		public PrincipalNameContext principalName(int i) {
			return getRuleContext(PrincipalNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public PrincipalSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principalSpecification; }
	}

	public final PrincipalSpecificationContext principalSpecification() throws RecognitionException {
		PrincipalSpecificationContext _localctx = new PrincipalSpecificationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_principalSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1912);
			principalName();
			setState(1917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1913);
				match(COMMA);
				setState(1914);
				principalName();
				}
				}
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalNameContext extends ParserRuleContext {
		public TerminalNode KW_USER() { return getToken(HiveParser.KW_USER, 0); }
		public PrincipalIdentifierContext principalIdentifier() {
			return getRuleContext(PrincipalIdentifierContext.class,0);
		}
		public TerminalNode KW_GROUP() { return getToken(HiveParser.KW_GROUP, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrincipalNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principalName; }
	}

	public final PrincipalNameContext principalName() throws RecognitionException {
		PrincipalNameContext _localctx = new PrincipalNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_principalName);
		try {
			setState(1926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_USER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				match(KW_USER);
				setState(1921);
				principalIdentifier();
				}
				break;
			case KW_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1922);
				match(KW_GROUP);
				setState(1923);
				principalIdentifier();
				}
				break;
			case KW_ROLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1924);
				match(KW_ROLE);
				setState(1925);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithGrantOptionContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public TerminalNode KW_OPTION() { return getToken(HiveParser.KW_OPTION, 0); }
		public WithGrantOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withGrantOption; }
	}

	public final WithGrantOptionContext withGrantOption() throws RecognitionException {
		WithGrantOptionContext _localctx = new WithGrantOptionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_withGrantOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			match(KW_WITH);
			setState(1929);
			match(KW_GRANT);
			setState(1930);
			match(KW_OPTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantOptionForContext extends ParserRuleContext {
		public TerminalNode KW_GRANT() { return getToken(HiveParser.KW_GRANT, 0); }
		public TerminalNode KW_OPTION() { return getToken(HiveParser.KW_OPTION, 0); }
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public GrantOptionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantOptionFor; }
	}

	public final GrantOptionForContext grantOptionFor() throws RecognitionException {
		GrantOptionForContext _localctx = new GrantOptionForContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_grantOptionFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			match(KW_GRANT);
			setState(1933);
			match(KW_OPTION);
			setState(1934);
			match(KW_FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdminOptionForContext extends ParserRuleContext {
		public TerminalNode KW_ADMIN() { return getToken(HiveParser.KW_ADMIN, 0); }
		public TerminalNode KW_OPTION() { return getToken(HiveParser.KW_OPTION, 0); }
		public TerminalNode KW_FOR() { return getToken(HiveParser.KW_FOR, 0); }
		public AdminOptionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adminOptionFor; }
	}

	public final AdminOptionForContext adminOptionFor() throws RecognitionException {
		AdminOptionForContext _localctx = new AdminOptionForContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_adminOptionFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(KW_ADMIN);
			setState(1937);
			match(KW_OPTION);
			setState(1938);
			match(KW_FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithAdminOptionContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_ADMIN() { return getToken(HiveParser.KW_ADMIN, 0); }
		public TerminalNode KW_OPTION() { return getToken(HiveParser.KW_OPTION, 0); }
		public WithAdminOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withAdminOption; }
	}

	public final WithAdminOptionContext withAdminOption() throws RecognitionException {
		WithAdminOptionContext _localctx = new WithAdminOptionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_withAdminOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			match(KW_WITH);
			setState(1941);
			match(KW_ADMIN);
			setState(1942);
			match(KW_OPTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetastoreCheckContext extends ParserRuleContext {
		public TerminalNode KW_MSCK() { return getToken(HiveParser.KW_MSCK, 0); }
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_REPAIR() { return getToken(HiveParser.KW_REPAIR, 0); }
		public TerminalNode KW_PARTITIONS() { return getToken(HiveParser.KW_PARTITIONS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode KW_ADD() { return getToken(HiveParser.KW_ADD, 0); }
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_SYNC() { return getToken(HiveParser.KW_SYNC, 0); }
		public MetastoreCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metastoreCheck; }
	}

	public final MetastoreCheckContext metastoreCheck() throws RecognitionException {
		MetastoreCheckContext _localctx = new MetastoreCheckContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_metastoreCheck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(KW_MSCK);
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_REPAIR) {
				{
				setState(1945);
				match(KW_REPAIR);
				}
			}

			setState(1957);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TABLE:
				{
				setState(1948);
				match(KW_TABLE);
				setState(1949);
				tableName();
				setState(1952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1950);
					_la = _input.LA(1);
					if ( !(_la==KW_DROP || _la==KW_ADD || _la==KW_SYNC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1951);
					match(KW_PARTITIONS);
					}
					break;
				}
				}
				break;
			case EOF:
			case KW_DESC:
			case KW_FROM:
			case KW_SELECT:
			case KW_INSERT:
			case KW_PARTITION:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_MAP:
			case KW_REDUCE:
			case KW_KILL:
			case KW_EXPLAIN:
			case KW_WITH:
			case KW_SET:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_TRUNCATE:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case SEMICOLON:
			case LPAREN:
				{
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PARTITION) {
					{
					setState(1954);
					partitionSpec();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_resourceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			resource();
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1960);
				match(COMMA);
				setState(1961);
				resource();
				}
				}
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ResourceTypeContext resourceType() {
			return getRuleContext(ResourceTypeContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			resourceType();
			setState(1968);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceTypeContext extends ParserRuleContext {
		public TerminalNode KW_JAR() { return getToken(HiveParser.KW_JAR, 0); }
		public TerminalNode KW_FILE() { return getToken(HiveParser.KW_FILE, 0); }
		public TerminalNode KW_ARCHIVE() { return getToken(HiveParser.KW_ARCHIVE, 0); }
		public ResourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceType; }
	}

	public final ResourceTypeContext resourceType() throws RecognitionException {
		ResourceTypeContext _localctx = new ResourceTypeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_resourceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			_la = _input.LA(1);
			if ( !(_la==KW_FILE || _la==KW_JAR || _la==KW_ARCHIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFunctionStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(HiveParser.KW_FUNCTION, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_USING() { return getToken(HiveParser.KW_USING, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public CreateFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunctionStatement; }
	}

	public final CreateFunctionStatementContext createFunctionStatement() throws RecognitionException {
		CreateFunctionStatementContext _localctx = new CreateFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_createFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(KW_CREATE);
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TEMPORARY) {
				{
				setState(1973);
				match(KW_TEMPORARY);
				}
			}

			setState(1976);
			match(KW_FUNCTION);
			setState(1977);
			functionIdentifier();
			setState(1978);
			match(KW_AS);
			setState(1979);
			match(StringLiteral);
			setState(1982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_USING) {
				{
				setState(1980);
				match(KW_USING);
				setState(1981);
				resourceList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropFunctionStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(HiveParser.KW_FUNCTION, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropFunctionStatement; }
	}

	public final DropFunctionStatementContext dropFunctionStatement() throws RecognitionException {
		DropFunctionStatementContext _localctx = new DropFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_dropFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(KW_DROP);
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TEMPORARY) {
				{
				setState(1985);
				match(KW_TEMPORARY);
				}
			}

			setState(1988);
			match(KW_FUNCTION);
			setState(1990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1989);
				ifExists();
				}
			}

			setState(1992);
			functionIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReloadFunctionStatementContext extends ParserRuleContext {
		public TerminalNode KW_RELOAD() { return getToken(HiveParser.KW_RELOAD, 0); }
		public TerminalNode KW_FUNCTION() { return getToken(HiveParser.KW_FUNCTION, 0); }
		public ReloadFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloadFunctionStatement; }
	}

	public final ReloadFunctionStatementContext reloadFunctionStatement() throws RecognitionException {
		ReloadFunctionStatementContext _localctx = new ReloadFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_reloadFunctionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			match(KW_RELOAD);
			setState(1995);
			match(KW_FUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateMacroStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_MACRO() { return getToken(HiveParser.KW_MACRO, 0); }
		public TerminalNode Identifier() { return getToken(HiveParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public CreateMacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMacroStatement; }
	}

	public final CreateMacroStatementContext createMacroStatement() throws RecognitionException {
		CreateMacroStatementContext _localctx = new CreateMacroStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_createMacroStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(KW_CREATE);
			setState(1998);
			match(KW_TEMPORARY);
			setState(1999);
			match(KW_MACRO);
			setState(2000);
			match(Identifier);
			setState(2001);
			match(LPAREN);
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KW_CHANGE - 68)) | (1L << (KW_FIRST - 68)) | (1L << (KW_AFTER - 68)) | (1L << (KW_RENAME - 68)) | (1L << (KW_COMMENT - 68)) | (1L << (KW_TINYINT - 68)) | (1L << (KW_DATETIME - 68)) | (1L << (KW_ZONE - 68)) | (1L << (KW_STRING - 68)) | (1L << (KW_STRUCT - 68)) | (1L << (KW_UNIONTYPE - 68)) | (1L << (KW_PARTITIONED - 68)) | (1L << (KW_CLUSTERED - 68)) | (1L << (KW_SORTED - 68)) | (1L << (KW_BUCKETS - 68)) | (1L << (KW_FORMAT - 68)) | (1L << (KW_DELIMITED - 68)) | (1L << (KW_FIELDS - 68)) | (1L << (KW_TERMINATED - 68)) | (1L << (KW_ESCAPED - 68)) | (1L << (KW_COLLECTION - 68)) | (1L << (KW_ITEMS - 68)) | (1L << (KW_KEYS - 68)) | (1L << (KW_KEY_TYPE - 68)) | (1L << (KW_KILL - 68)) | (1L << (KW_LINES - 68)) | (1L << (KW_STORED - 68)) | (1L << (KW_FILEFORMAT - 68)) | (1L << (KW_INPUTFORMAT - 68)) | (1L << (KW_OUTPUTFORMAT - 68)) | (1L << (KW_INPUTDRIVER - 68)) | (1L << (KW_OUTPUTDRIVER - 68)) | (1L << (KW_ENABLE - 68)) | (1L << (KW_DISABLE - 68)) | (1L << (KW_LOCATION - 68)) | (1L << (KW_BUCKET - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (KW_ADD - 134)) | (1L << (KW_REPLACE - 134)) | (1L << (KW_TEMPORARY - 134)) | (1L << (KW_FILE - 134)) | (1L << (KW_JAR - 134)) | (1L << (KW_EXPLAIN - 134)) | (1L << (KW_FORMATTED - 134)) | (1L << (KW_DEPENDENCY - 134)) | (1L << (KW_LOGICAL - 134)) | (1L << (KW_SERDE - 134)) | (1L << (KW_DEFERRED - 134)) | (1L << (KW_SERDEPROPERTIES - 134)) | (1L << (KW_DBPROPERTIES - 134)) | (1L << (KW_LIMIT - 134)) | (1L << (KW_OFFSET - 134)) | (1L << (KW_UNSET - 134)) | (1L << (KW_TBLPROPERTIES - 134)) | (1L << (KW_IDXPROPERTIES - 134)) | (1L << (KW_VALUE_TYPE - 134)) | (1L << (KW_ELEM_TYPE - 134)) | (1L << (KW_DEFINED - 134)) | (1L << (KW_MAPJOIN - 134)) | (1L << (KW_STREAMTABLE - 134)) | (1L << (KW_CLUSTERSTATUS - 134)) | (1L << (KW_UTC - 134)) | (1L << (KW_UTCTIMESTAMP - 134)) | (1L << (KW_LONG - 134)) | (1L << (KW_PLUS - 134)) | (1L << (KW_VIEW - 134)) | (1L << (KW_VIEWS - 134)) | (1L << (KW_DATABASES - 134)) | (1L << (KW_MATERIALIZED - 134)) | (1L << (KW_SCHEMA - 134)) | (1L << (KW_SCHEMAS - 134)) | (1L << (KW_SSL - 134)) | (1L << (KW_UNDO - 134)) | (1L << (KW_LOCK - 134)) | (1L << (KW_LOCKS - 134)) | (1L << (KW_UNLOCK - 134)) | (1L << (KW_SHARED - 134)) | (1L << (KW_EXCLUSIVE - 134)) | (1L << (KW_UNSIGNED - 134)) | (1L << (KW_WHILE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (KW_READ - 198)) | (1L << (KW_PURGE - 198)) | (1L << (KW_ANALYZE - 198)) | (1L << (KW_BEFORE - 198)) | (1L << (KW_CONTINUE - 198)) | (1L << (KW_RECORDREADER - 198)) | (1L << (KW_RECORDWRITER - 198)) | (1L << (KW_SEMI - 198)) | (1L << (KW_TOUCH - 198)) | (1L << (KW_ARCHIVE - 198)) | (1L << (KW_UNARCHIVE - 198)) | (1L << (KW_COMPUTE - 198)) | (1L << (KW_STATISTICS - 198)) | (1L << (KW_USE - 198)) | (1L << (KW_OPTION - 198)) | (1L << (KW_CONCATENATE - 198)) | (1L << (KW_SHOW_DATABASE - 198)) | (1L << (KW_RESTRICT - 198)) | (1L << (KW_CASCADE - 198)) | (1L << (KW_SKEWED - 198)) | (1L << (KW_DIRECTORIES - 198)) | (1L << (KW_SETS - 198)) | (1L << (KW_NOSCAN - 198)) | (1L << (KW_ROLE - 198)) | (1L << (KW_ROLES - 198)) | (1L << (KW_URI - 198)) | (1L << (KW_SERVER - 198)) | (1L << (KW_ADMIN - 198)) | (1L << (KW_OWNER - 198)) | (1L << (KW_PRINCIPALS - 198)) | (1L << (KW_COMPACT - 198)) | (1L << (KW_COMPACTIONS - 198)) | (1L << (KW_TRANSACTIONS - 198)) | (1L << (KW_REWRITE - 198)) | (1L << (KW_REOPTIMIZATION - 198)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (KW_RELOAD - 264)) | (1L << (KW_YEAR - 264)) | (1L << (KW_QUERY - 264)) | (1L << (KW_QUARTER - 264)) | (1L << (KW_MONTH - 264)) | (1L << (KW_WEEK - 264)) | (1L << (KW_DAY - 264)) | (1L << (KW_DOW - 264)) | (1L << (KW_HOUR - 264)) | (1L << (KW_MINUTE - 264)) | (1L << (KW_SECOND - 264)) | (1L << (KW_TRANSACTION - 264)) | (1L << (KW_WORK - 264)) | (1L << (KW_WRITE - 264)) | (1L << (KW_ISOLATION - 264)) | (1L << (KW_LEVEL - 264)) | (1L << (KW_SNAPSHOT - 264)) | (1L << (KW_AUTOCOMMIT - 264)) | (1L << (KW_CACHE - 264)) | (1L << (KW_ENFORCED - 264)) | (1L << (KW_VALIDATE - 264)) | (1L << (KW_NOVALIDATE - 264)) | (1L << (KW_RELY - 264)) | (1L << (KW_NORELY - 264)) | (1L << (KW_KEY - 264)) | (1L << (KW_ABORT - 264)) | (1L << (KW_MATCHED - 264)) | (1L << (KW_REPL - 264)) | (1L << (KW_DUMP - 264)) | (1L << (KW_STATUS - 264)) | (1L << (KW_VECTORIZATION - 264)) | (1L << (KW_SUMMARY - 264)) | (1L << (KW_OPERATOR - 264)) | (1L << (KW_EXPRESSION - 264)) | (1L << (KW_DETAIL - 264)) | (1L << (KW_WAIT - 264)) | (1L << (KW_RESOURCE - 264)) | (1L << (KW_PLAN - 264)) | (1L << (KW_QUERY_PARALLELISM - 264)) | (1L << (KW_PLANS - 264)) | (1L << (KW_ACTIVATE - 264)) | (1L << (KW_DEFAULT - 264)) | (1L << (KW_CHECK - 264)) | (1L << (KW_POOL - 264)) | (1L << (KW_MOVE - 264)) | (1L << (KW_DO - 264)) | (1L << (KW_ALLOC_FRACTION - 264)) | (1L << (KW_SCHEDULING_POLICY - 264)) | (1L << (KW_PATH - 264)) | (1L << (KW_MAPPING - 264)) | (1L << (KW_WORKLOAD - 264)) | (1L << (KW_MANAGEMENT - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (KW_ACTIVE - 328)) | (1L << (KW_UNMANAGED - 328)) | (1L << (Identifier - 328)))) != 0)) {
				{
				setState(2002);
				columnNameTypeList();
				}
			}

			setState(2005);
			match(RPAREN);
			setState(2006);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropMacroStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_MACRO() { return getToken(HiveParser.KW_MACRO, 0); }
		public TerminalNode Identifier() { return getToken(HiveParser.Identifier, 0); }
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropMacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropMacroStatement; }
	}

	public final DropMacroStatementContext dropMacroStatement() throws RecognitionException {
		DropMacroStatementContext _localctx = new DropMacroStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_dropMacroStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(KW_DROP);
			setState(2009);
			match(KW_TEMPORARY);
			setState(2010);
			match(KW_MACRO);
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2011);
				ifExists();
				}
			}

			setState(2014);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateViewStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public SelectStatementWithCTEContext selectStatementWithCTE() {
			return getRuleContext(SelectStatementWithCTEContext.class,0);
		}
		public OrReplaceContext orReplace() {
			return getRuleContext(OrReplaceContext.class,0);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameCommentListContext columnNameCommentList() {
			return getRuleContext(ColumnNameCommentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public ViewPartitionContext viewPartition() {
			return getRuleContext(ViewPartitionContext.class,0);
		}
		public TablePropertiesPrefixedContext tablePropertiesPrefixed() {
			return getRuleContext(TablePropertiesPrefixedContext.class,0);
		}
		public CreateViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createViewStatement; }
	}

	public final CreateViewStatementContext createViewStatement() throws RecognitionException {
		CreateViewStatementContext _localctx = new CreateViewStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_createViewStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			match(KW_CREATE);
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_OR) {
				{
				setState(2017);
				orReplace();
				}
			}

			setState(2020);
			match(KW_VIEW);
			setState(2022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2021);
				ifNotExists();
				}
			}

			setState(2024);
			tableName();
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2025);
				match(LPAREN);
				setState(2026);
				columnNameCommentList();
				setState(2027);
				match(RPAREN);
				}
			}

			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2031);
				tableComment();
				}
			}

			setState(2035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITIONED) {
				{
				setState(2034);
				viewPartition();
				}
			}

			setState(2038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TBLPROPERTIES) {
				{
				setState(2037);
				tablePropertiesPrefixed();
				}
			}

			setState(2040);
			match(KW_AS);
			setState(2041);
			selectStatementWithCTE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateMaterializedViewStatementContext extends ParserRuleContext {
		public TerminalNode KW_CREATE() { return getToken(HiveParser.KW_CREATE, 0); }
		public TerminalNode KW_MATERIALIZED() { return getToken(HiveParser.KW_MATERIALIZED, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public SelectStatementWithCTEContext selectStatementWithCTE() {
			return getRuleContext(SelectStatementWithCTEContext.class,0);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public RewriteDisabledContext rewriteDisabled() {
			return getRuleContext(RewriteDisabledContext.class,0);
		}
		public TableCommentContext tableComment() {
			return getRuleContext(TableCommentContext.class,0);
		}
		public TableRowFormatContext tableRowFormat() {
			return getRuleContext(TableRowFormatContext.class,0);
		}
		public TableFileFormatContext tableFileFormat() {
			return getRuleContext(TableFileFormatContext.class,0);
		}
		public TableLocationContext tableLocation() {
			return getRuleContext(TableLocationContext.class,0);
		}
		public TablePropertiesPrefixedContext tablePropertiesPrefixed() {
			return getRuleContext(TablePropertiesPrefixedContext.class,0);
		}
		public CreateMaterializedViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMaterializedViewStatement; }
	}

	public final CreateMaterializedViewStatementContext createMaterializedViewStatement() throws RecognitionException {
		CreateMaterializedViewStatementContext _localctx = new CreateMaterializedViewStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_createMaterializedViewStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			match(KW_CREATE);
			setState(2044);
			match(KW_MATERIALIZED);
			setState(2045);
			match(KW_VIEW);
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2046);
				ifNotExists();
				}
			}

			setState(2049);
			tableName();
			setState(2051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DISABLE) {
				{
				setState(2050);
				rewriteDisabled();
				}
			}

			setState(2054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2053);
				tableComment();
				}
			}

			setState(2057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW) {
				{
				setState(2056);
				tableRowFormat();
				}
			}

			setState(2060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_STORED) {
				{
				setState(2059);
				tableFileFormat();
				}
			}

			setState(2063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LOCATION) {
				{
				setState(2062);
				tableLocation();
				}
			}

			setState(2066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TBLPROPERTIES) {
				{
				setState(2065);
				tablePropertiesPrefixed();
				}
			}

			setState(2068);
			match(KW_AS);
			setState(2069);
			selectStatementWithCTE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewPartitionContext extends ParserRuleContext {
		public TerminalNode KW_PARTITIONED() { return getToken(HiveParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ViewPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewPartition; }
	}

	public final ViewPartitionContext viewPartition() throws RecognitionException {
		ViewPartitionContext _localctx = new ViewPartitionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_viewPartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(KW_PARTITIONED);
			setState(2072);
			match(KW_ON);
			setState(2073);
			match(LPAREN);
			setState(2074);
			columnNameList();
			setState(2075);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropViewStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropViewStatement; }
	}

	public final DropViewStatementContext dropViewStatement() throws RecognitionException {
		DropViewStatementContext _localctx = new DropViewStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_dropViewStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			match(KW_DROP);
			setState(2078);
			match(KW_VIEW);
			setState(2080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2079);
				ifExists();
				}
			}

			setState(2082);
			viewName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropMaterializedViewStatementContext extends ParserRuleContext {
		public TerminalNode KW_DROP() { return getToken(HiveParser.KW_DROP, 0); }
		public TerminalNode KW_MATERIALIZED() { return getToken(HiveParser.KW_MATERIALIZED, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public ViewNameContext viewName() {
			return getRuleContext(ViewNameContext.class,0);
		}
		public IfExistsContext ifExists() {
			return getRuleContext(IfExistsContext.class,0);
		}
		public DropMaterializedViewStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropMaterializedViewStatement; }
	}

	public final DropMaterializedViewStatementContext dropMaterializedViewStatement() throws RecognitionException {
		DropMaterializedViewStatementContext _localctx = new DropMaterializedViewStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_dropMaterializedViewStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2084);
			match(KW_DROP);
			setState(2085);
			match(KW_MATERIALIZED);
			setState(2086);
			match(KW_VIEW);
			setState(2088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(2087);
				ifExists();
				}
			}

			setState(2090);
			viewName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ShowFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showFunctionIdentifier; }
	}

	public final ShowFunctionIdentifierContext showFunctionIdentifier() throws RecognitionException {
		ShowFunctionIdentifierContext _localctx = new ShowFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_showFunctionIdentifier);
		try {
			setState(2094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				functionIdentifier();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2093);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowStmtIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ShowStmtIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showStmtIdentifier; }
	}

	public final ShowStmtIdentifierContext showStmtIdentifier() throws RecognitionException {
		ShowStmtIdentifierContext _localctx = new ShowStmtIdentifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_showStmtIdentifier);
		try {
			setState(2098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				identifier();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2097);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableCommentContext extends ParserRuleContext {
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableComment; }
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_tableComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			match(KW_COMMENT);
			setState(2101);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePartitionContext extends ParserRuleContext {
		public TerminalNode KW_PARTITIONED() { return getToken(HiveParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<ColumnNameTypeConstraintContext> columnNameTypeConstraint() {
			return getRuleContexts(ColumnNameTypeConstraintContext.class);
		}
		public ColumnNameTypeConstraintContext columnNameTypeConstraint(int i) {
			return getRuleContext(ColumnNameTypeConstraintContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public TablePartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePartition; }
	}

	public final TablePartitionContext tablePartition() throws RecognitionException {
		TablePartitionContext _localctx = new TablePartitionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_tablePartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(KW_PARTITIONED);
			setState(2104);
			match(KW_BY);
			setState(2105);
			match(LPAREN);
			setState(2106);
			columnNameTypeConstraint();
			setState(2111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2107);
				match(COMMA);
				setState(2108);
				columnNameTypeConstraint();
				}
				}
				setState(2113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2114);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableBucketsContext extends ParserRuleContext {
		public TerminalNode KW_CLUSTERED() { return getToken(HiveParser.KW_CLUSTERED, 0); }
		public List<TerminalNode> KW_BY() { return getTokens(HiveParser.KW_BY); }
		public TerminalNode KW_BY(int i) {
			return getToken(HiveParser.KW_BY, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public TerminalNode KW_INTO() { return getToken(HiveParser.KW_INTO, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public TerminalNode KW_BUCKETS() { return getToken(HiveParser.KW_BUCKETS, 0); }
		public TerminalNode KW_SORTED() { return getToken(HiveParser.KW_SORTED, 0); }
		public ColumnNameOrderListContext columnNameOrderList() {
			return getRuleContext(ColumnNameOrderListContext.class,0);
		}
		public TableBucketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBuckets; }
	}

	public final TableBucketsContext tableBuckets() throws RecognitionException {
		TableBucketsContext _localctx = new TableBucketsContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_tableBuckets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			match(KW_CLUSTERED);
			setState(2117);
			match(KW_BY);
			setState(2118);
			match(LPAREN);
			setState(2119);
			columnNameList();
			setState(2120);
			match(RPAREN);
			setState(2127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SORTED) {
				{
				setState(2121);
				match(KW_SORTED);
				setState(2122);
				match(KW_BY);
				setState(2123);
				match(LPAREN);
				setState(2124);
				columnNameOrderList();
				setState(2125);
				match(RPAREN);
				}
			}

			setState(2129);
			match(KW_INTO);
			setState(2130);
			match(Number);
			setState(2131);
			match(KW_BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSkewedContext extends ParserRuleContext {
		public TerminalNode KW_SKEWED() { return getToken(HiveParser.KW_SKEWED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public SkewedValueElementContext skewedValueElement() {
			return getRuleContext(SkewedValueElementContext.class,0);
		}
		public StoredAsDirsContext storedAsDirs() {
			return getRuleContext(StoredAsDirsContext.class,0);
		}
		public TableSkewedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSkewed; }
	}

	public final TableSkewedContext tableSkewed() throws RecognitionException {
		TableSkewedContext _localctx = new TableSkewedContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_tableSkewed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2133);
			match(KW_SKEWED);
			setState(2134);
			match(KW_BY);
			setState(2135);
			match(LPAREN);
			setState(2136);
			columnNameList();
			setState(2137);
			match(RPAREN);
			setState(2138);
			match(KW_ON);
			setState(2139);
			match(LPAREN);
			setState(2140);
			skewedValueElement();
			setState(2141);
			match(RPAREN);
			setState(2143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(2142);
				storedAsDirs();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatSerdeContext rowFormatSerde() {
			return getRuleContext(RowFormatSerdeContext.class,0);
		}
		public RowFormatDelimitedContext rowFormatDelimited() {
			return getRuleContext(RowFormatDelimitedContext.class,0);
		}
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_rowFormat);
		try {
			setState(2147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2145);
				rowFormatSerde();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2146);
				rowFormatDelimited();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordReaderContext extends ParserRuleContext {
		public TerminalNode KW_RECORDREADER() { return getToken(HiveParser.KW_RECORDREADER, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public RecordReaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordReader; }
	}

	public final RecordReaderContext recordReader() throws RecognitionException {
		RecordReaderContext _localctx = new RecordReaderContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_recordReader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2149);
			match(KW_RECORDREADER);
			setState(2150);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordWriterContext extends ParserRuleContext {
		public TerminalNode KW_RECORDWRITER() { return getToken(HiveParser.KW_RECORDWRITER, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public RecordWriterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordWriter; }
	}

	public final RecordWriterContext recordWriter() throws RecognitionException {
		RecordWriterContext _localctx = new RecordWriterContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_recordWriter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2152);
			match(KW_RECORDWRITER);
			setState(2153);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatSerdeContext extends ParserRuleContext {
		public TerminalNode KW_ROW() { return getToken(HiveParser.KW_ROW, 0); }
		public TerminalNode KW_FORMAT() { return getToken(HiveParser.KW_FORMAT, 0); }
		public TerminalNode KW_SERDE() { return getToken(HiveParser.KW_SERDE, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_SERDEPROPERTIES() { return getToken(HiveParser.KW_SERDEPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public RowFormatSerdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormatSerde; }
	}

	public final RowFormatSerdeContext rowFormatSerde() throws RecognitionException {
		RowFormatSerdeContext _localctx = new RowFormatSerdeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_rowFormatSerde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2155);
			match(KW_ROW);
			setState(2156);
			match(KW_FORMAT);
			setState(2157);
			match(KW_SERDE);
			setState(2158);
			match(StringLiteral);
			setState(2162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(2159);
				match(KW_WITH);
				setState(2160);
				match(KW_SERDEPROPERTIES);
				setState(2161);
				tableProperties();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatDelimitedContext extends ParserRuleContext {
		public TerminalNode KW_ROW() { return getToken(HiveParser.KW_ROW, 0); }
		public TerminalNode KW_FORMAT() { return getToken(HiveParser.KW_FORMAT, 0); }
		public TerminalNode KW_DELIMITED() { return getToken(HiveParser.KW_DELIMITED, 0); }
		public TableRowFormatFieldIdentifierContext tableRowFormatFieldIdentifier() {
			return getRuleContext(TableRowFormatFieldIdentifierContext.class,0);
		}
		public TableRowFormatCollItemsIdentifierContext tableRowFormatCollItemsIdentifier() {
			return getRuleContext(TableRowFormatCollItemsIdentifierContext.class,0);
		}
		public TableRowFormatMapKeysIdentifierContext tableRowFormatMapKeysIdentifier() {
			return getRuleContext(TableRowFormatMapKeysIdentifierContext.class,0);
		}
		public TableRowFormatLinesIdentifierContext tableRowFormatLinesIdentifier() {
			return getRuleContext(TableRowFormatLinesIdentifierContext.class,0);
		}
		public TableRowNullFormatContext tableRowNullFormat() {
			return getRuleContext(TableRowNullFormatContext.class,0);
		}
		public RowFormatDelimitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormatDelimited; }
	}

	public final RowFormatDelimitedContext rowFormatDelimited() throws RecognitionException {
		RowFormatDelimitedContext _localctx = new RowFormatDelimitedContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_rowFormatDelimited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2164);
			match(KW_ROW);
			setState(2165);
			match(KW_FORMAT);
			setState(2166);
			match(KW_DELIMITED);
			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FIELDS) {
				{
				setState(2167);
				tableRowFormatFieldIdentifier();
				}
			}

			setState(2171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COLLECTION) {
				{
				setState(2170);
				tableRowFormatCollItemsIdentifier();
				}
			}

			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(2173);
				tableRowFormatMapKeysIdentifier();
				}
				break;
			}
			setState(2177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LINES) {
				{
				setState(2176);
				tableRowFormatLinesIdentifier();
				}
			}

			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NULL) {
				{
				setState(2179);
				tableRowNullFormat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowFormatContext extends ParserRuleContext {
		public RowFormatDelimitedContext rowFormatDelimited() {
			return getRuleContext(RowFormatDelimitedContext.class,0);
		}
		public RowFormatSerdeContext rowFormatSerde() {
			return getRuleContext(RowFormatSerdeContext.class,0);
		}
		public TableRowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowFormat; }
	}

	public final TableRowFormatContext tableRowFormat() throws RecognitionException {
		TableRowFormatContext _localctx = new TableRowFormatContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_tableRowFormat);
		try {
			setState(2184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2182);
				rowFormatDelimited();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2183);
				rowFormatSerde();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertiesPrefixedContext extends ParserRuleContext {
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TablePropertiesPrefixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertiesPrefixed; }
	}

	public final TablePropertiesPrefixedContext tablePropertiesPrefixed() throws RecognitionException {
		TablePropertiesPrefixedContext _localctx = new TablePropertiesPrefixedContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_tablePropertiesPrefixed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			match(KW_TBLPROPERTIES);
			setState(2187);
			tableProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertiesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TablePropertiesListContext tablePropertiesList() {
			return getRuleContext(TablePropertiesListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_tableProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			match(LPAREN);
			setState(2190);
			tablePropertiesList();
			setState(2191);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertiesListContext extends ParserRuleContext {
		public List<KeyValuePropertyContext> keyValueProperty() {
			return getRuleContexts(KeyValuePropertyContext.class);
		}
		public KeyValuePropertyContext keyValueProperty(int i) {
			return getRuleContext(KeyValuePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public List<KeyPropertyContext> keyProperty() {
			return getRuleContexts(KeyPropertyContext.class);
		}
		public KeyPropertyContext keyProperty(int i) {
			return getRuleContext(KeyPropertyContext.class,i);
		}
		public TablePropertiesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertiesList; }
	}

	public final TablePropertiesListContext tablePropertiesList() throws RecognitionException {
		TablePropertiesListContext _localctx = new TablePropertiesListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_tablePropertiesList);
		int _la;
		try {
			setState(2209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2193);
				keyValueProperty();
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2194);
					match(COMMA);
					setState(2195);
					keyValueProperty();
					}
					}
					setState(2200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2201);
				keyProperty();
				setState(2206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2202);
					match(COMMA);
					setState(2203);
					keyProperty();
					}
					}
					setState(2208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValuePropertyContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public KeyValuePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValueProperty; }
	}

	public final KeyValuePropertyContext keyValueProperty() throws RecognitionException {
		KeyValuePropertyContext _localctx = new KeyValuePropertyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_keyValueProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			match(StringLiteral);
			setState(2212);
			match(EQUAL);
			setState(2213);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPropertyContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public KeyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyProperty; }
	}

	public final KeyPropertyContext keyProperty() throws RecognitionException {
		KeyPropertyContext _localctx = new KeyPropertyContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_keyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowFormatFieldIdentifierContext extends ParserRuleContext {
		public TerminalNode KW_FIELDS() { return getToken(HiveParser.KW_FIELDS, 0); }
		public TerminalNode KW_TERMINATED() { return getToken(HiveParser.KW_TERMINATED, 0); }
		public List<TerminalNode> KW_BY() { return getTokens(HiveParser.KW_BY); }
		public TerminalNode KW_BY(int i) {
			return getToken(HiveParser.KW_BY, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public TerminalNode KW_ESCAPED() { return getToken(HiveParser.KW_ESCAPED, 0); }
		public TableRowFormatFieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowFormatFieldIdentifier; }
	}

	public final TableRowFormatFieldIdentifierContext tableRowFormatFieldIdentifier() throws RecognitionException {
		TableRowFormatFieldIdentifierContext _localctx = new TableRowFormatFieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_tableRowFormatFieldIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2217);
			match(KW_FIELDS);
			setState(2218);
			match(KW_TERMINATED);
			setState(2219);
			match(KW_BY);
			setState(2220);
			match(StringLiteral);
			setState(2224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ESCAPED) {
				{
				setState(2221);
				match(KW_ESCAPED);
				setState(2222);
				match(KW_BY);
				setState(2223);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowFormatCollItemsIdentifierContext extends ParserRuleContext {
		public TerminalNode KW_COLLECTION() { return getToken(HiveParser.KW_COLLECTION, 0); }
		public TerminalNode KW_ITEMS() { return getToken(HiveParser.KW_ITEMS, 0); }
		public TerminalNode KW_TERMINATED() { return getToken(HiveParser.KW_TERMINATED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableRowFormatCollItemsIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowFormatCollItemsIdentifier; }
	}

	public final TableRowFormatCollItemsIdentifierContext tableRowFormatCollItemsIdentifier() throws RecognitionException {
		TableRowFormatCollItemsIdentifierContext _localctx = new TableRowFormatCollItemsIdentifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_tableRowFormatCollItemsIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			match(KW_COLLECTION);
			setState(2227);
			match(KW_ITEMS);
			setState(2228);
			match(KW_TERMINATED);
			setState(2229);
			match(KW_BY);
			setState(2230);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowFormatMapKeysIdentifierContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(HiveParser.KW_MAP, 0); }
		public TerminalNode KW_KEYS() { return getToken(HiveParser.KW_KEYS, 0); }
		public TerminalNode KW_TERMINATED() { return getToken(HiveParser.KW_TERMINATED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableRowFormatMapKeysIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowFormatMapKeysIdentifier; }
	}

	public final TableRowFormatMapKeysIdentifierContext tableRowFormatMapKeysIdentifier() throws RecognitionException {
		TableRowFormatMapKeysIdentifierContext _localctx = new TableRowFormatMapKeysIdentifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_tableRowFormatMapKeysIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2232);
			match(KW_MAP);
			setState(2233);
			match(KW_KEYS);
			setState(2234);
			match(KW_TERMINATED);
			setState(2235);
			match(KW_BY);
			setState(2236);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowFormatLinesIdentifierContext extends ParserRuleContext {
		public TerminalNode KW_LINES() { return getToken(HiveParser.KW_LINES, 0); }
		public TerminalNode KW_TERMINATED() { return getToken(HiveParser.KW_TERMINATED, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableRowFormatLinesIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowFormatLinesIdentifier; }
	}

	public final TableRowFormatLinesIdentifierContext tableRowFormatLinesIdentifier() throws RecognitionException {
		TableRowFormatLinesIdentifierContext _localctx = new TableRowFormatLinesIdentifierContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_tableRowFormatLinesIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(KW_LINES);
			setState(2239);
			match(KW_TERMINATED);
			setState(2240);
			match(KW_BY);
			setState(2241);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRowNullFormatContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(HiveParser.KW_NULL, 0); }
		public TerminalNode KW_DEFINED() { return getToken(HiveParser.KW_DEFINED, 0); }
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableRowNullFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRowNullFormat; }
	}

	public final TableRowNullFormatContext tableRowNullFormat() throws RecognitionException {
		TableRowNullFormatContext _localctx = new TableRowNullFormatContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_tableRowNullFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(KW_NULL);
			setState(2244);
			match(KW_DEFINED);
			setState(2245);
			match(KW_AS);
			setState(2246);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFileFormatContext extends ParserRuleContext {
		public TerminalNode KW_STORED() { return getToken(HiveParser.KW_STORED, 0); }
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode KW_INPUTFORMAT() { return getToken(HiveParser.KW_INPUTFORMAT, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public TerminalNode KW_OUTPUTFORMAT() { return getToken(HiveParser.KW_OUTPUTFORMAT, 0); }
		public TerminalNode KW_INPUTDRIVER() { return getToken(HiveParser.KW_INPUTDRIVER, 0); }
		public TerminalNode KW_OUTPUTDRIVER() { return getToken(HiveParser.KW_OUTPUTDRIVER, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_SERDEPROPERTIES() { return getToken(HiveParser.KW_SERDEPROPERTIES, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFileFormat; }
	}

	public final TableFileFormatContext tableFileFormat() throws RecognitionException {
		TableFileFormatContext _localctx = new TableFileFormatContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_tableFileFormat);
		int _la;
		try {
			setState(2271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2248);
				match(KW_STORED);
				setState(2249);
				match(KW_AS);
				setState(2250);
				match(KW_INPUTFORMAT);
				setState(2251);
				match(StringLiteral);
				setState(2252);
				match(KW_OUTPUTFORMAT);
				setState(2253);
				match(StringLiteral);
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_INPUTDRIVER) {
					{
					setState(2254);
					match(KW_INPUTDRIVER);
					setState(2255);
					match(StringLiteral);
					setState(2256);
					match(KW_OUTPUTDRIVER);
					setState(2257);
					match(StringLiteral);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				match(KW_STORED);
				setState(2261);
				match(KW_BY);
				setState(2262);
				match(StringLiteral);
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(2263);
					match(KW_WITH);
					setState(2264);
					match(KW_SERDEPROPERTIES);
					setState(2265);
					tableProperties();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				match(KW_STORED);
				setState(2269);
				match(KW_AS);
				setState(2270);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableLocationContext extends ParserRuleContext {
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TableLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableLocation; }
	}

	public final TableLocationContext tableLocation() throws RecognitionException {
		TableLocationContext _localctx = new TableLocationContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_tableLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			match(KW_LOCATION);
			setState(2274);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeListContext extends ParserRuleContext {
		public List<ColumnNameTypeContext> columnNameType() {
			return getRuleContexts(ColumnNameTypeContext.class);
		}
		public ColumnNameTypeContext columnNameType(int i) {
			return getRuleContext(ColumnNameTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameTypeList; }
	}

	public final ColumnNameTypeListContext columnNameTypeList() throws RecognitionException {
		ColumnNameTypeListContext _localctx = new ColumnNameTypeListContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_columnNameTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			columnNameType();
			setState(2281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2277);
					match(COMMA);
					setState(2278);
					columnNameType();
					}
					} 
				}
				setState(2283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeOrConstraintListContext extends ParserRuleContext {
		public List<ColumnNameTypeOrConstraintContext> columnNameTypeOrConstraint() {
			return getRuleContexts(ColumnNameTypeOrConstraintContext.class);
		}
		public ColumnNameTypeOrConstraintContext columnNameTypeOrConstraint(int i) {
			return getRuleContext(ColumnNameTypeOrConstraintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameTypeOrConstraintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameTypeOrConstraintList; }
	}

	public final ColumnNameTypeOrConstraintListContext columnNameTypeOrConstraintList() throws RecognitionException {
		ColumnNameTypeOrConstraintListContext _localctx = new ColumnNameTypeOrConstraintListContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_columnNameTypeOrConstraintList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			columnNameTypeOrConstraint();
			setState(2289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2285);
				match(COMMA);
				setState(2286);
				columnNameTypeOrConstraint();
				}
				}
				setState(2291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameColonTypeListContext extends ParserRuleContext {
		public List<ColumnNameColonTypeContext> columnNameColonType() {
			return getRuleContexts(ColumnNameColonTypeContext.class);
		}
		public ColumnNameColonTypeContext columnNameColonType(int i) {
			return getRuleContext(ColumnNameColonTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameColonTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameColonTypeList; }
	}

	public final ColumnNameColonTypeListContext columnNameColonTypeList() throws RecognitionException {
		ColumnNameColonTypeListContext _localctx = new ColumnNameColonTypeListContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_columnNameColonTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			columnNameColonType();
			setState(2297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2293);
				match(COMMA);
				setState(2294);
				columnNameColonType();
				}
				}
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			columnName();
			setState(2305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2301);
				match(COMMA);
				setState(2302);
				columnName();
				}
				}
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtColumnNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HiveParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HiveParser.DOT, i);
		}
		public List<TerminalNode> KW_ELEM_TYPE() { return getTokens(HiveParser.KW_ELEM_TYPE); }
		public TerminalNode KW_ELEM_TYPE(int i) {
			return getToken(HiveParser.KW_ELEM_TYPE, i);
		}
		public List<TerminalNode> KW_KEY_TYPE() { return getTokens(HiveParser.KW_KEY_TYPE); }
		public TerminalNode KW_KEY_TYPE(int i) {
			return getToken(HiveParser.KW_KEY_TYPE, i);
		}
		public List<TerminalNode> KW_VALUE_TYPE() { return getTokens(HiveParser.KW_VALUE_TYPE); }
		public TerminalNode KW_VALUE_TYPE(int i) {
			return getToken(HiveParser.KW_VALUE_TYPE, i);
		}
		public ExtColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extColumnName; }
	}

	public final ExtColumnNameContext extColumnName() throws RecognitionException {
		ExtColumnNameContext _localctx = new ExtColumnNameContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_extColumnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			identifier();
			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2311);
				match(DOT);
				setState(2316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(2312);
					match(KW_ELEM_TYPE);
					}
					break;
				case 2:
					{
					setState(2313);
					match(KW_KEY_TYPE);
					}
					break;
				case 3:
					{
					setState(2314);
					match(KW_VALUE_TYPE);
					}
					break;
				case 4:
					{
					setState(2315);
					identifier();
					}
					break;
				}
				}
				}
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameOrderListContext extends ParserRuleContext {
		public List<ColumnNameOrderContext> columnNameOrder() {
			return getRuleContexts(ColumnNameOrderContext.class);
		}
		public ColumnNameOrderContext columnNameOrder(int i) {
			return getRuleContext(ColumnNameOrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameOrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameOrderList; }
	}

	public final ColumnNameOrderListContext columnNameOrderList() throws RecognitionException {
		ColumnNameOrderListContext _localctx = new ColumnNameOrderListContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_columnNameOrderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			columnNameOrder();
			setState(2328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2324);
				match(COMMA);
				setState(2325);
				columnNameOrder();
				}
				}
				setState(2330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnParenthesesListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ColumnParenthesesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnParenthesesList; }
	}

	public final ColumnParenthesesListContext columnParenthesesList() throws RecognitionException {
		ColumnParenthesesListContext _localctx = new ColumnParenthesesListContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_columnParenthesesList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2331);
			match(LPAREN);
			setState(2332);
			columnNameList();
			setState(2333);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnableValidateSpecificationContext extends ParserRuleContext {
		public EnableSpecificationContext enableSpecification() {
			return getRuleContext(EnableSpecificationContext.class,0);
		}
		public ValidateSpecificationContext validateSpecification() {
			return getRuleContext(ValidateSpecificationContext.class,0);
		}
		public EnforcedSpecificationContext enforcedSpecification() {
			return getRuleContext(EnforcedSpecificationContext.class,0);
		}
		public EnableValidateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableValidateSpecification; }
	}

	public final EnableValidateSpecificationContext enableValidateSpecification() throws RecognitionException {
		EnableValidateSpecificationContext _localctx = new EnableValidateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_enableValidateSpecification);
		int _la;
		try {
			setState(2340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ENABLE:
			case KW_DISABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				enableSpecification();
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_VALIDATE || _la==KW_NOVALIDATE) {
					{
					setState(2336);
					validateSpecification();
					}
				}

				}
				break;
			case KW_NOT:
			case KW_ENFORCED:
				enterOuterAlt(_localctx, 2);
				{
				setState(2339);
				enforcedSpecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnableSpecificationContext extends ParserRuleContext {
		public TerminalNode KW_ENABLE() { return getToken(HiveParser.KW_ENABLE, 0); }
		public TerminalNode KW_DISABLE() { return getToken(HiveParser.KW_DISABLE, 0); }
		public EnableSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableSpecification; }
	}

	public final EnableSpecificationContext enableSpecification() throws RecognitionException {
		EnableSpecificationContext _localctx = new EnableSpecificationContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_enableSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2342);
			_la = _input.LA(1);
			if ( !(_la==KW_ENABLE || _la==KW_DISABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidateSpecificationContext extends ParserRuleContext {
		public TerminalNode KW_VALIDATE() { return getToken(HiveParser.KW_VALIDATE, 0); }
		public TerminalNode KW_NOVALIDATE() { return getToken(HiveParser.KW_NOVALIDATE, 0); }
		public ValidateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validateSpecification; }
	}

	public final ValidateSpecificationContext validateSpecification() throws RecognitionException {
		ValidateSpecificationContext _localctx = new ValidateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_validateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2344);
			_la = _input.LA(1);
			if ( !(_la==KW_VALIDATE || _la==KW_NOVALIDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnforcedSpecificationContext extends ParserRuleContext {
		public TerminalNode KW_ENFORCED() { return getToken(HiveParser.KW_ENFORCED, 0); }
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public EnforcedSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enforcedSpecification; }
	}

	public final EnforcedSpecificationContext enforcedSpecification() throws RecognitionException {
		EnforcedSpecificationContext _localctx = new EnforcedSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_enforcedSpecification);
		try {
			setState(2349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ENFORCED:
				enterOuterAlt(_localctx, 1);
				{
				setState(2346);
				match(KW_ENFORCED);
				}
				break;
			case KW_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				match(KW_NOT);
				setState(2348);
				match(KW_ENFORCED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelySpecificationContext extends ParserRuleContext {
		public TerminalNode KW_RELY() { return getToken(HiveParser.KW_RELY, 0); }
		public TerminalNode KW_NORELY() { return getToken(HiveParser.KW_NORELY, 0); }
		public RelySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relySpecification; }
	}

	public final RelySpecificationContext relySpecification() throws RecognitionException {
		RelySpecificationContext _localctx = new RelySpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_relySpecification);
		int _la;
		try {
			setState(2355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_RELY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				match(KW_RELY);
				}
				break;
			case EOF:
			case KW_DESC:
			case KW_FROM:
			case KW_SELECT:
			case KW_INSERT:
			case KW_SHOW:
			case KW_MSCK:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_IMPORT:
			case KW_CREATE:
			case KW_ALTER:
			case KW_FIRST:
			case KW_AFTER:
			case KW_DESCRIBE:
			case KW_DROP:
			case KW_COMMENT:
			case KW_MAP:
			case KW_REDUCE:
			case KW_KILL:
			case KW_EXPLAIN:
			case KW_WITH:
			case KW_SET:
			case KW_DELETE:
			case KW_GRANT:
			case KW_REVOKE:
			case KW_LOCK:
			case KW_UNLOCK:
			case KW_ANALYZE:
			case KW_USE:
			case KW_UPDATE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_TRUNCATE:
			case KW_RELOAD:
			case KW_START:
			case KW_COMMIT:
			case KW_ROLLBACK:
			case KW_NORELY:
			case KW_ABORT:
			case KW_MERGE:
			case KW_REPL:
			case COMMA:
			case SEMICOLON:
			case LPAREN:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_NORELY) {
					{
					setState(2352);
					match(KW_NORELY);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateConstraintContext extends ParserRuleContext {
		public PkConstraintContext pkConstraint() {
			return getRuleContext(PkConstraintContext.class,0);
		}
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsCreateContext constraintOptsCreate() {
			return getRuleContext(ConstraintOptsCreateContext.class,0);
		}
		public CreateConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createConstraint; }
	}

	public final CreateConstraintContext createConstraint() throws RecognitionException {
		CreateConstraintContext _localctx = new CreateConstraintContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_createConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2357);
				match(KW_CONSTRAINT);
				setState(2358);
				identifier();
				}
			}

			setState(2361);
			pkConstraint();
			setState(2363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2362);
				constraintOptsCreate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PkConstraintContext pkConstraint() {
			return getRuleContext(PkConstraintContext.class,0);
		}
		public ConstraintOptsAlterContext constraintOptsAlter() {
			return getRuleContext(ConstraintOptsAlterContext.class,0);
		}
		public AlterConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterConstraintWithName; }
	}

	public final AlterConstraintWithNameContext alterConstraintWithName() throws RecognitionException {
		AlterConstraintWithNameContext _localctx = new AlterConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_alterConstraintWithName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			match(KW_CONSTRAINT);
			setState(2366);
			identifier();
			setState(2367);
			pkConstraint();
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2368);
				constraintOptsAlter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PkConstraintContext extends ParserRuleContext {
		public ColumnParenthesesListContext pkCols;
		public TableConstraintPrimaryKeyContext tableConstraintPrimaryKey() {
			return getRuleContext(TableConstraintPrimaryKeyContext.class,0);
		}
		public ColumnParenthesesListContext columnParenthesesList() {
			return getRuleContext(ColumnParenthesesListContext.class,0);
		}
		public PkConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkConstraint; }
	}

	public final PkConstraintContext pkConstraint() throws RecognitionException {
		PkConstraintContext _localctx = new PkConstraintContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_pkConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			tableConstraintPrimaryKey();
			setState(2372);
			((PkConstraintContext)_localctx).pkCols = columnParenthesesList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateForeignKeyContext extends ParserRuleContext {
		public TerminalNode KW_FOREIGN() { return getToken(HiveParser.KW_FOREIGN, 0); }
		public TerminalNode KW_KEY() { return getToken(HiveParser.KW_KEY, 0); }
		public List<ColumnParenthesesListContext> columnParenthesesList() {
			return getRuleContexts(ColumnParenthesesListContext.class);
		}
		public ColumnParenthesesListContext columnParenthesesList(int i) {
			return getRuleContext(ColumnParenthesesListContext.class,i);
		}
		public TerminalNode KW_REFERENCES() { return getToken(HiveParser.KW_REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsCreateContext constraintOptsCreate() {
			return getRuleContext(ConstraintOptsCreateContext.class,0);
		}
		public CreateForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createForeignKey; }
	}

	public final CreateForeignKeyContext createForeignKey() throws RecognitionException {
		CreateForeignKeyContext _localctx = new CreateForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_createForeignKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2374);
				match(KW_CONSTRAINT);
				setState(2375);
				identifier();
				}
			}

			setState(2378);
			match(KW_FOREIGN);
			setState(2379);
			match(KW_KEY);
			setState(2380);
			columnParenthesesList();
			setState(2381);
			match(KW_REFERENCES);
			setState(2382);
			tableName();
			setState(2383);
			columnParenthesesList();
			setState(2385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2384);
				constraintOptsCreate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterForeignKeyWithNameContext extends ParserRuleContext {
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_FOREIGN() { return getToken(HiveParser.KW_FOREIGN, 0); }
		public TerminalNode KW_KEY() { return getToken(HiveParser.KW_KEY, 0); }
		public List<ColumnParenthesesListContext> columnParenthesesList() {
			return getRuleContexts(ColumnParenthesesListContext.class);
		}
		public ColumnParenthesesListContext columnParenthesesList(int i) {
			return getRuleContext(ColumnParenthesesListContext.class,i);
		}
		public TerminalNode KW_REFERENCES() { return getToken(HiveParser.KW_REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ConstraintOptsAlterContext constraintOptsAlter() {
			return getRuleContext(ConstraintOptsAlterContext.class,0);
		}
		public AlterForeignKeyWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterForeignKeyWithName; }
	}

	public final AlterForeignKeyWithNameContext alterForeignKeyWithName() throws RecognitionException {
		AlterForeignKeyWithNameContext _localctx = new AlterForeignKeyWithNameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_alterForeignKeyWithName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			match(KW_CONSTRAINT);
			setState(2388);
			identifier();
			setState(2389);
			match(KW_FOREIGN);
			setState(2390);
			match(KW_KEY);
			setState(2391);
			columnParenthesesList();
			setState(2392);
			match(KW_REFERENCES);
			setState(2393);
			tableName();
			setState(2394);
			columnParenthesesList();
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2395);
				constraintOptsAlter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedValueElementContext extends ParserRuleContext {
		public SkewedColumnValuesContext skewedColumnValues() {
			return getRuleContext(SkewedColumnValuesContext.class,0);
		}
		public SkewedColumnValuePairListContext skewedColumnValuePairList() {
			return getRuleContext(SkewedColumnValuePairListContext.class,0);
		}
		public SkewedValueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedValueElement; }
	}

	public final SkewedValueElementContext skewedValueElement() throws RecognitionException {
		SkewedValueElementContext _localctx = new SkewedValueElementContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_skewedValueElement);
		try {
			setState(2400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TRUE:
			case KW_FALSE:
			case KW_NULL:
			case KW_DATE:
			case KW_TIMESTAMP:
			case KW_TIMESTAMPLOCALTZ:
			case KW_CURRENT_DATE:
			case KW_CURRENT_TIMESTAMP:
			case StringLiteral:
			case IntegralLiteral:
			case NumberLiteral:
			case Number:
			case CharSetName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2398);
				skewedColumnValues();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2399);
				skewedColumnValuePairList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedColumnValuePairListContext extends ParserRuleContext {
		public List<SkewedColumnValuePairContext> skewedColumnValuePair() {
			return getRuleContexts(SkewedColumnValuePairContext.class);
		}
		public SkewedColumnValuePairContext skewedColumnValuePair(int i) {
			return getRuleContext(SkewedColumnValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SkewedColumnValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedColumnValuePairList; }
	}

	public final SkewedColumnValuePairListContext skewedColumnValuePairList() throws RecognitionException {
		SkewedColumnValuePairListContext _localctx = new SkewedColumnValuePairListContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_skewedColumnValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			skewedColumnValuePair();
			setState(2407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2403);
				match(COMMA);
				setState(2404);
				skewedColumnValuePair();
				}
				}
				setState(2409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedColumnValuePairContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public SkewedColumnValuesContext skewedColumnValues() {
			return getRuleContext(SkewedColumnValuesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public SkewedColumnValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedColumnValuePair; }
	}

	public final SkewedColumnValuePairContext skewedColumnValuePair() throws RecognitionException {
		SkewedColumnValuePairContext _localctx = new SkewedColumnValuePairContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_skewedColumnValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			match(LPAREN);
			setState(2411);
			skewedColumnValues();
			setState(2412);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedColumnValuesContext extends ParserRuleContext {
		public List<SkewedColumnValueContext> skewedColumnValue() {
			return getRuleContexts(SkewedColumnValueContext.class);
		}
		public SkewedColumnValueContext skewedColumnValue(int i) {
			return getRuleContext(SkewedColumnValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SkewedColumnValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedColumnValues; }
	}

	public final SkewedColumnValuesContext skewedColumnValues() throws RecognitionException {
		SkewedColumnValuesContext _localctx = new SkewedColumnValuesContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_skewedColumnValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2414);
			skewedColumnValue();
			setState(2419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2415);
				match(COMMA);
				setState(2416);
				skewedColumnValue();
				}
				}
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedColumnValueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public SkewedColumnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedColumnValue; }
	}

	public final SkewedColumnValueContext skewedColumnValue() throws RecognitionException {
		SkewedColumnValueContext _localctx = new SkewedColumnValueContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_skewedColumnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2422);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewedValueLocationElementContext extends ParserRuleContext {
		public SkewedColumnValueContext skewedColumnValue() {
			return getRuleContext(SkewedColumnValueContext.class,0);
		}
		public SkewedColumnValuePairContext skewedColumnValuePair() {
			return getRuleContext(SkewedColumnValuePairContext.class,0);
		}
		public SkewedValueLocationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewedValueLocationElement; }
	}

	public final SkewedValueLocationElementContext skewedValueLocationElement() throws RecognitionException {
		SkewedValueLocationElementContext _localctx = new SkewedValueLocationElementContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_skewedValueLocationElement);
		try {
			setState(2426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TRUE:
			case KW_FALSE:
			case KW_NULL:
			case KW_DATE:
			case KW_TIMESTAMP:
			case KW_TIMESTAMPLOCALTZ:
			case KW_CURRENT_DATE:
			case KW_CURRENT_TIMESTAMP:
			case StringLiteral:
			case IntegralLiteral:
			case NumberLiteral:
			case Number:
			case CharSetName:
				enterOuterAlt(_localctx, 1);
				{
				setState(2424);
				skewedColumnValue();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2425);
				skewedColumnValuePair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderSpecificationContext extends ParserRuleContext {
		public TerminalNode KW_ASC() { return getToken(HiveParser.KW_ASC, 0); }
		public TerminalNode KW_DESC() { return getToken(HiveParser.KW_DESC, 0); }
		public OrderSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSpecification; }
	}

	public final OrderSpecificationContext orderSpecification() throws RecognitionException {
		OrderSpecificationContext _localctx = new OrderSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_orderSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			_la = _input.LA(1);
			if ( !(_la==KW_ASC || _la==KW_DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullOrderingContext extends ParserRuleContext {
		public TerminalNode KW_NULLS() { return getToken(HiveParser.KW_NULLS, 0); }
		public TerminalNode KW_FIRST() { return getToken(HiveParser.KW_FIRST, 0); }
		public TerminalNode KW_LAST() { return getToken(HiveParser.KW_LAST, 0); }
		public NullOrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullOrdering; }
	}

	public final NullOrderingContext nullOrdering() throws RecognitionException {
		NullOrderingContext _localctx = new NullOrderingContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_nullOrdering);
		try {
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2430);
				match(KW_NULLS);
				setState(2431);
				match(KW_FIRST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				match(KW_NULLS);
				setState(2433);
				match(KW_LAST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameOrderContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OrderSpecificationContext orderSpecification() {
			return getRuleContext(OrderSpecificationContext.class,0);
		}
		public NullOrderingContext nullOrdering() {
			return getRuleContext(NullOrderingContext.class,0);
		}
		public ColumnNameOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameOrder; }
	}

	public final ColumnNameOrderContext columnNameOrder() throws RecognitionException {
		ColumnNameOrderContext _localctx = new ColumnNameOrderContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_columnNameOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			identifier();
			setState(2438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASC || _la==KW_DESC) {
				{
				setState(2437);
				orderSpecification();
				}
			}

			setState(2441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NULLS) {
				{
				setState(2440);
				nullOrdering();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameCommentListContext extends ParserRuleContext {
		public List<ColumnNameCommentContext> columnNameComment() {
			return getRuleContexts(ColumnNameCommentContext.class);
		}
		public ColumnNameCommentContext columnNameComment(int i) {
			return getRuleContext(ColumnNameCommentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnNameCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameCommentList; }
	}

	public final ColumnNameCommentListContext columnNameCommentList() throws RecognitionException {
		ColumnNameCommentListContext _localctx = new ColumnNameCommentListContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_columnNameCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			columnNameComment();
			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2444);
				match(COMMA);
				setState(2445);
				columnNameComment();
				}
				}
				setState(2450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ColumnNameCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameComment; }
	}

	public final ColumnNameCommentContext columnNameComment() throws RecognitionException {
		ColumnNameCommentContext _localctx = new ColumnNameCommentContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_columnNameComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			identifier();
			setState(2454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2452);
				match(KW_COMMENT);
				setState(2453);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnRefOrderContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderSpecificationContext orderSpecification() {
			return getRuleContext(OrderSpecificationContext.class,0);
		}
		public NullOrderingContext nullOrdering() {
			return getRuleContext(NullOrderingContext.class,0);
		}
		public ColumnRefOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRefOrder; }
	}

	public final ColumnRefOrderContext columnRefOrder() throws RecognitionException {
		ColumnRefOrderContext _localctx = new ColumnRefOrderContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_columnRefOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2456);
			expression(0);
			setState(2458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2457);
				orderSpecification();
				}
				break;
			}
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NULLS) {
				{
				setState(2460);
				nullOrdering();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ColumnNameTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameType; }
	}

	public final ColumnNameTypeContext columnNameType() throws RecognitionException {
		ColumnNameTypeContext _localctx = new ColumnNameTypeContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_columnNameType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			identifier();
			setState(2464);
			colType();
			setState(2467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2465);
				match(KW_COMMENT);
				setState(2466);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeOrConstraintContext extends ParserRuleContext {
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public ColumnNameTypeConstraintContext columnNameTypeConstraint() {
			return getRuleContext(ColumnNameTypeConstraintContext.class,0);
		}
		public ColumnNameTypeOrConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameTypeOrConstraint; }
	}

	public final ColumnNameTypeOrConstraintContext columnNameTypeOrConstraint() throws RecognitionException {
		ColumnNameTypeOrConstraintContext _localctx = new ColumnNameTypeOrConstraintContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_columnNameTypeOrConstraint);
		try {
			setState(2471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PRIMARY:
			case KW_FOREIGN:
			case KW_CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2469);
				tableConstraint();
				}
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2470);
				columnNameTypeConstraint();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintContext extends ParserRuleContext {
		public CreateForeignKeyContext createForeignKey() {
			return getRuleContext(CreateForeignKeyContext.class,0);
		}
		public CreateConstraintContext createConstraint() {
			return getRuleContext(CreateConstraintContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_tableConstraint);
		try {
			setState(2475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2473);
				createForeignKey();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2474);
				createConstraint();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameTypeConstraintContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public ColumnConstraintContext columnConstraint() {
			return getRuleContext(ColumnConstraintContext.class,0);
		}
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ColumnNameTypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameTypeConstraint; }
	}

	public final ColumnNameTypeConstraintContext columnNameTypeConstraint() throws RecognitionException {
		ColumnNameTypeConstraintContext _localctx = new ColumnNameTypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_columnNameTypeConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			identifier();
			setState(2478);
			colType();
			setState(2480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (KW_PRIMARY - 287)) | (1L << (KW_REFERENCES - 287)) | (1L << (KW_CONSTRAINT - 287)))) != 0)) {
				{
				setState(2479);
				columnConstraint();
				}
			}

			setState(2484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2482);
				match(KW_COMMENT);
				setState(2483);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ForeignKeyConstraintContext foreignKeyConstraint() {
			return getRuleContext(ForeignKeyConstraintContext.class,0);
		}
		public ColConstraintContext colConstraint() {
			return getRuleContext(ColConstraintContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_columnConstraint);
		try {
			setState(2488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2486);
				foreignKeyConstraint();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2487);
				colConstraint();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode KW_REFERENCES() { return getToken(HiveParser.KW_REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsCreateContext constraintOptsCreate() {
			return getRuleContext(ConstraintOptsCreateContext.class,0);
		}
		public ForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyConstraint; }
	}

	public final ForeignKeyConstraintContext foreignKeyConstraint() throws RecognitionException {
		ForeignKeyConstraintContext _localctx = new ForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_foreignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2490);
				match(KW_CONSTRAINT);
				setState(2491);
				identifier();
				}
			}

			setState(2494);
			match(KW_REFERENCES);
			setState(2495);
			tableName();
			setState(2496);
			match(LPAREN);
			setState(2497);
			columnName();
			setState(2498);
			match(RPAREN);
			setState(2500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2499);
				constraintOptsCreate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColConstraintContext extends ParserRuleContext {
		public TableConstraintPrimaryKeyContext tableConstraintPrimaryKey() {
			return getRuleContext(TableConstraintPrimaryKeyContext.class,0);
		}
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsCreateContext constraintOptsCreate() {
			return getRuleContext(ConstraintOptsCreateContext.class,0);
		}
		public ColConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colConstraint; }
	}

	public final ColConstraintContext colConstraint() throws RecognitionException {
		ColConstraintContext _localctx = new ColConstraintContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_colConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2502);
				match(KW_CONSTRAINT);
				setState(2503);
				identifier();
				}
			}

			setState(2506);
			tableConstraintPrimaryKey();
			setState(2508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2507);
				constraintOptsCreate();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnConstraintContext extends ParserRuleContext {
		public AlterForeignKeyConstraintContext alterForeignKeyConstraint() {
			return getRuleContext(AlterForeignKeyConstraintContext.class,0);
		}
		public AlterColConstraintContext alterColConstraint() {
			return getRuleContext(AlterColConstraintContext.class,0);
		}
		public AlterColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnConstraint; }
	}

	public final AlterColumnConstraintContext alterColumnConstraint() throws RecognitionException {
		AlterColumnConstraintContext _localctx = new AlterColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_alterColumnConstraint);
		try {
			setState(2512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2510);
				alterForeignKeyConstraint();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2511);
				alterColConstraint();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterForeignKeyConstraintContext extends ParserRuleContext {
		public TerminalNode KW_REFERENCES() { return getToken(HiveParser.KW_REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsAlterContext constraintOptsAlter() {
			return getRuleContext(ConstraintOptsAlterContext.class,0);
		}
		public AlterForeignKeyConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterForeignKeyConstraint; }
	}

	public final AlterForeignKeyConstraintContext alterForeignKeyConstraint() throws RecognitionException {
		AlterForeignKeyConstraintContext _localctx = new AlterForeignKeyConstraintContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_alterForeignKeyConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2514);
				match(KW_CONSTRAINT);
				setState(2515);
				identifier();
				}
			}

			setState(2518);
			match(KW_REFERENCES);
			setState(2519);
			tableName();
			setState(2520);
			match(LPAREN);
			setState(2521);
			columnName();
			setState(2522);
			match(RPAREN);
			setState(2524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2523);
				constraintOptsAlter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColConstraintContext extends ParserRuleContext {
		public TableConstraintPrimaryKeyContext tableConstraintPrimaryKey() {
			return getRuleContext(TableConstraintPrimaryKeyContext.class,0);
		}
		public TerminalNode KW_CONSTRAINT() { return getToken(HiveParser.KW_CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintOptsAlterContext constraintOptsAlter() {
			return getRuleContext(ConstraintOptsAlterContext.class,0);
		}
		public AlterColConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColConstraint; }
	}

	public final AlterColConstraintContext alterColConstraint() throws RecognitionException {
		AlterColConstraintContext _localctx = new AlterColConstraintContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_alterColConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONSTRAINT) {
				{
				setState(2526);
				match(KW_CONSTRAINT);
				setState(2527);
				identifier();
				}
			}

			setState(2530);
			tableConstraintPrimaryKey();
			setState(2532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT || _la==KW_ENABLE || _la==KW_DISABLE || _la==KW_ENFORCED) {
				{
				setState(2531);
				constraintOptsAlter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableConstraintPrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KW_PRIMARY() { return getToken(HiveParser.KW_PRIMARY, 0); }
		public TerminalNode KW_KEY() { return getToken(HiveParser.KW_KEY, 0); }
		public TableConstraintPrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintPrimaryKey; }
	}

	public final TableConstraintPrimaryKeyContext tableConstraintPrimaryKey() throws RecognitionException {
		TableConstraintPrimaryKeyContext _localctx = new TableConstraintPrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_tableConstraintPrimaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2534);
			match(KW_PRIMARY);
			setState(2535);
			match(KW_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintOptsCreateContext extends ParserRuleContext {
		public EnableValidateSpecificationContext enableValidateSpecification() {
			return getRuleContext(EnableValidateSpecificationContext.class,0);
		}
		public RelySpecificationContext relySpecification() {
			return getRuleContext(RelySpecificationContext.class,0);
		}
		public ConstraintOptsCreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptsCreate; }
	}

	public final ConstraintOptsCreateContext constraintOptsCreate() throws RecognitionException {
		ConstraintOptsCreateContext _localctx = new ConstraintOptsCreateContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_constraintOptsCreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			enableValidateSpecification();
			setState(2538);
			relySpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintOptsAlterContext extends ParserRuleContext {
		public EnableValidateSpecificationContext enableValidateSpecification() {
			return getRuleContext(EnableValidateSpecificationContext.class,0);
		}
		public RelySpecificationContext relySpecification() {
			return getRuleContext(RelySpecificationContext.class,0);
		}
		public ConstraintOptsAlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptsAlter; }
	}

	public final ConstraintOptsAlterContext constraintOptsAlter() throws RecognitionException {
		ConstraintOptsAlterContext _localctx = new ConstraintOptsAlterContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_constraintOptsAlter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2540);
			enableValidateSpecification();
			setState(2541);
			relySpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameColonTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(HiveParser.COLON, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public ColumnNameColonTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameColonType; }
	}

	public final ColumnNameColonTypeContext columnNameColonType() throws RecognitionException {
		ColumnNameColonTypeContext _localctx = new ColumnNameColonTypeContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_columnNameColonType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2543);
			identifier();
			setState(2544);
			match(COLON);
			setState(2545);
			colType();
			setState(2548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_COMMENT) {
				{
				setState(2546);
				match(KW_COMMENT);
				setState(2547);
				match(StringLiteral);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public Type_db_colContext type_db_col() {
			return getRuleContext(Type_db_colContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2550);
			type_db_col();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2552);
			colType();
			setState(2557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2553);
				match(COMMA);
				setState(2554);
				colType();
				}
				}
				setState(2559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_db_colContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public UnionTypeContext unionType() {
			return getRuleContext(UnionTypeContext.class,0);
		}
		public Type_db_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_db_col; }
	}

	public final Type_db_colContext type_db_col() throws RecognitionException {
		Type_db_colContext _localctx = new Type_db_colContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_type_db_col);
		try {
			setState(2565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BOOLEAN:
			case KW_TINYINT:
			case KW_SMALLINT:
			case KW_INT:
			case KW_BIGINT:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_DATE:
			case KW_DATETIME:
			case KW_TIMESTAMP:
			case KW_TIMESTAMPLOCALTZ:
			case KW_DECIMAL:
			case KW_STRING:
			case KW_CHAR:
			case KW_VARCHAR:
			case KW_BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(2560);
				primitiveType();
				}
				break;
			case KW_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				listType();
				}
				break;
			case KW_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2562);
				structType();
				}
				break;
			case KW_MAP:
				enterOuterAlt(_localctx, 4);
				{
				setState(2563);
				mapType();
				}
				break;
			case KW_UNIONTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2564);
				unionType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode KW_TINYINT() { return getToken(HiveParser.KW_TINYINT, 0); }
		public TerminalNode KW_SMALLINT() { return getToken(HiveParser.KW_SMALLINT, 0); }
		public TerminalNode KW_INT() { return getToken(HiveParser.KW_INT, 0); }
		public TerminalNode KW_BIGINT() { return getToken(HiveParser.KW_BIGINT, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(HiveParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_FLOAT() { return getToken(HiveParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(HiveParser.KW_DOUBLE, 0); }
		public TerminalNode KW_PRECISION() { return getToken(HiveParser.KW_PRECISION, 0); }
		public TerminalNode KW_DATE() { return getToken(HiveParser.KW_DATE, 0); }
		public TerminalNode KW_DATETIME() { return getToken(HiveParser.KW_DATETIME, 0); }
		public TerminalNode KW_TIMESTAMP() { return getToken(HiveParser.KW_TIMESTAMP, 0); }
		public TerminalNode KW_TIMESTAMPLOCALTZ() { return getToken(HiveParser.KW_TIMESTAMPLOCALTZ, 0); }
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_LOCAL() { return getToken(HiveParser.KW_LOCAL, 0); }
		public TerminalNode KW_TIME() { return getToken(HiveParser.KW_TIME, 0); }
		public TerminalNode KW_ZONE() { return getToken(HiveParser.KW_ZONE, 0); }
		public TerminalNode KW_STRING() { return getToken(HiveParser.KW_STRING, 0); }
		public TerminalNode KW_BINARY() { return getToken(HiveParser.KW_BINARY, 0); }
		public TerminalNode KW_DECIMAL() { return getToken(HiveParser.KW_DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<TerminalNode> Number() { return getTokens(HiveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HiveParser.Number, i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(HiveParser.COMMA, 0); }
		public TerminalNode KW_VARCHAR() { return getToken(HiveParser.KW_VARCHAR, 0); }
		public TerminalNode KW_CHAR() { return getToken(HiveParser.KW_CHAR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_primitiveType);
		int _la;
		try {
			setState(2606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2567);
				match(KW_TINYINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2568);
				match(KW_SMALLINT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2569);
				match(KW_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2570);
				match(KW_BIGINT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2571);
				match(KW_BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2572);
				match(KW_FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2573);
				match(KW_DOUBLE);
				setState(2575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PRECISION) {
					{
					setState(2574);
					match(KW_PRECISION);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2577);
				match(KW_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2578);
				match(KW_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2579);
				match(KW_TIMESTAMP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2580);
				match(KW_TIMESTAMPLOCALTZ);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2581);
				match(KW_TIMESTAMP);
				setState(2582);
				match(KW_WITH);
				setState(2583);
				match(KW_LOCAL);
				setState(2584);
				match(KW_TIME);
				setState(2585);
				match(KW_ZONE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2586);
				match(KW_STRING);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2587);
				match(KW_BINARY);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2588);
				match(KW_DECIMAL);
				setState(2596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2589);
					match(LPAREN);
					setState(2590);
					match(Number);
					setState(2593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2591);
						match(COMMA);
						setState(2592);
						match(Number);
						}
					}

					setState(2595);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2598);
				match(KW_VARCHAR);
				setState(2599);
				match(LPAREN);
				setState(2600);
				match(Number);
				setState(2601);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2602);
				match(KW_CHAR);
				setState(2603);
				match(LPAREN);
				setState(2604);
				match(Number);
				setState(2605);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode KW_ARRAY() { return getToken(HiveParser.KW_ARRAY, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public Type_db_colContext type_db_col() {
			return getRuleContext(Type_db_colContext.class,0);
		}
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2608);
			match(KW_ARRAY);
			setState(2609);
			match(LESSTHAN);
			setState(2610);
			type_db_col();
			setState(2611);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(HiveParser.KW_STRUCT, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public ColumnNameColonTypeListContext columnNameColonTypeList() {
			return getRuleContext(ColumnNameColonTypeListContext.class,0);
		}
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
			match(KW_STRUCT);
			setState(2614);
			match(LESSTHAN);
			setState(2615);
			columnNameColonTypeList();
			setState(2616);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTypeContext extends ParserRuleContext {
		public TerminalNode KW_MAP() { return getToken(HiveParser.KW_MAP, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HiveParser.COMMA, 0); }
		public Type_db_colContext type_db_col() {
			return getRuleContext(Type_db_colContext.class,0);
		}
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			match(KW_MAP);
			setState(2619);
			match(LESSTHAN);
			setState(2620);
			primitiveType();
			setState(2621);
			match(COMMA);
			setState(2622);
			type_db_col();
			setState(2623);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeContext extends ParserRuleContext {
		public TerminalNode KW_UNIONTYPE() { return getToken(HiveParser.KW_UNIONTYPE, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public UnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionType; }
	}

	public final UnionTypeContext unionType() throws RecognitionException {
		UnionTypeContext _localctx = new UnionTypeContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_unionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2625);
			match(KW_UNIONTYPE);
			setState(2626);
			match(LESSTHAN);
			setState(2627);
			colTypeList();
			setState(2628);
			match(GREATERTHAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetOperatorContext extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(HiveParser.KW_UNION, 0); }
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public TerminalNode KW_DISTINCT() { return getToken(HiveParser.KW_DISTINCT, 0); }
		public TerminalNode KW_INTERSECT() { return getToken(HiveParser.KW_INTERSECT, 0); }
		public TerminalNode KW_EXCEPT() { return getToken(HiveParser.KW_EXCEPT, 0); }
		public TerminalNode KW_MINUS() { return getToken(HiveParser.KW_MINUS, 0); }
		public SetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperator; }
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_setOperator);
		int _la;
		try {
			setState(2654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2630);
				match(KW_UNION);
				setState(2631);
				match(KW_ALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2632);
				match(KW_UNION);
				setState(2634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTINCT) {
					{
					setState(2633);
					match(KW_DISTINCT);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2636);
				match(KW_INTERSECT);
				setState(2637);
				match(KW_ALL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2638);
				match(KW_INTERSECT);
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTINCT) {
					{
					setState(2639);
					match(KW_DISTINCT);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2642);
				match(KW_EXCEPT);
				setState(2643);
				match(KW_ALL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2644);
				match(KW_EXCEPT);
				setState(2646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTINCT) {
					{
					setState(2645);
					match(KW_DISTINCT);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2648);
				match(KW_MINUS);
				setState(2649);
				match(KW_ALL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2650);
				match(KW_MINUS);
				setState(2652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTINCT) {
					{
					setState(2651);
					match(KW_DISTINCT);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryStatementExpressionContext extends ParserRuleContext {
		public QueryStatementExpressionBodyContext queryStatementExpressionBody() {
			return getRuleContext(QueryStatementExpressionBodyContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public QueryStatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatementExpression; }
	}

	public final QueryStatementExpressionContext queryStatementExpression() throws RecognitionException {
		QueryStatementExpressionContext _localctx = new QueryStatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_queryStatementExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(2656);
				withClause();
				}
			}

			setState(2659);
			queryStatementExpressionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryStatementExpressionBodyContext extends ParserRuleContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public RegularBodyContext regularBody() {
			return getRuleContext(RegularBodyContext.class,0);
		}
		public QueryStatementExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryStatementExpressionBody; }
	}

	public final QueryStatementExpressionBodyContext queryStatementExpressionBody() throws RecognitionException {
		QueryStatementExpressionBodyContext _localctx = new QueryStatementExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_queryStatementExpressionBody);
		try {
			setState(2663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(2661);
				fromStatement();
				}
				break;
			case KW_SELECT:
			case KW_INSERT:
			case KW_MAP:
			case KW_REDUCE:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2662);
				regularBody();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public List<CteStatementContext> cteStatement() {
			return getRuleContexts(CteStatementContext.class);
		}
		public CteStatementContext cteStatement(int i) {
			return getRuleContext(CteStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			match(KW_WITH);
			setState(2666);
			cteStatement();
			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2667);
				match(COMMA);
				setState(2668);
				cteStatement();
				}
				}
				setState(2673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public QueryStatementExpressionContext queryStatementExpression() {
			return getRuleContext(QueryStatementExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public CteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteStatement; }
	}

	public final CteStatementContext cteStatement() throws RecognitionException {
		CteStatementContext _localctx = new CteStatementContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_cteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2674);
			identifier();
			setState(2675);
			match(KW_AS);
			setState(2676);
			match(LPAREN);
			setState(2677);
			queryStatementExpression();
			setState(2678);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public List<SingleFromStatementContext> singleFromStatement() {
			return getRuleContexts(SingleFromStatementContext.class);
		}
		public SingleFromStatementContext singleFromStatement(int i) {
			return getRuleContext(SingleFromStatementContext.class,i);
		}
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_fromStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2680);
			singleFromStatement();
			}
			setState(2686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW_UNION || _la==KW_EXCEPT || _la==KW_MINUS || _la==KW_INTERSECT) {
				{
				{
				setState(2681);
				setOperator();
				setState(2682);
				singleFromStatement();
				}
				}
				setState(2688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SingleFromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFromStatement; }
	}

	public final SingleFromStatementContext singleFromStatement() throws RecognitionException {
		SingleFromStatementContext _localctx = new SingleFromStatementContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_singleFromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2689);
			fromClause();
			setState(2691); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2690);
					body();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2693); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularBodyContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public RegularBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularBody; }
	}

	public final RegularBodyContext regularBody() throws RecognitionException {
		RegularBodyContext _localctx = new RegularBodyContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_regularBody);
		try {
			setState(2701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2695);
				insertClause();
				setState(2698);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_SELECT:
				case KW_MAP:
				case KW_REDUCE:
				case LPAREN:
					{
					setState(2696);
					selectStatement();
					}
					break;
				case KW_VALUES:
					{
					setState(2697);
					valuesClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case KW_SELECT:
			case KW_MAP:
			case KW_REDUCE:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2700);
				selectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomSelectStatementContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public AtomSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomSelectStatement; }
	}

	public final AtomSelectStatementContext atomSelectStatement() throws RecognitionException {
		AtomSelectStatementContext _localctx = new AtomSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_atomSelectStatement);
		int _la;
		try {
			setState(2723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SELECT:
			case KW_MAP:
			case KW_REDUCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2703);
				selectClause();
				setState(2705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2704);
					fromClause();
					}
					break;
				}
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(2707);
					whereClause();
					}
				}

				setState(2711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_GROUP) {
					{
					setState(2710);
					groupByClause();
					}
				}

				setState(2714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HAVING) {
					{
					setState(2713);
					havingClause();
					}
				}

				setState(2717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WINDOW) {
					{
					setState(2716);
					window_clause();
					}
				}

				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2719);
				match(LPAREN);
				setState(2720);
				selectStatement();
				setState(2721);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public AtomSelectStatementContext atomSelectStatement() {
			return getRuleContext(AtomSelectStatementContext.class,0);
		}
		public SetOpSelectStatementContext setOpSelectStatement() {
			return getRuleContext(SetOpSelectStatementContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public ClusterByClauseContext clusterByClause() {
			return getRuleContext(ClusterByClauseContext.class,0);
		}
		public DistributeByClauseContext distributeByClause() {
			return getRuleContext(DistributeByClauseContext.class,0);
		}
		public SortByClauseContext sortByClause() {
			return getRuleContext(SortByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2725);
			atomSelectStatement();
			setState(2727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNION || _la==KW_EXCEPT || _la==KW_MINUS || _la==KW_INTERSECT) {
				{
				setState(2726);
				setOpSelectStatement();
				}
			}

			setState(2730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ORDER) {
				{
				setState(2729);
				orderByClause();
				}
			}

			setState(2733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CLUSTER) {
				{
				setState(2732);
				clusterByClause();
				}
			}

			setState(2736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DISTRIBUTE) {
				{
				setState(2735);
				distributeByClause();
				}
			}

			setState(2739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SORT) {
				{
				setState(2738);
				sortByClause();
				}
			}

			setState(2742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_LIMIT) {
				{
				setState(2741);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetOpSelectStatementContext extends ParserRuleContext {
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public List<AtomSelectStatementContext> atomSelectStatement() {
			return getRuleContexts(AtomSelectStatementContext.class);
		}
		public AtomSelectStatementContext atomSelectStatement(int i) {
			return getRuleContext(AtomSelectStatementContext.class,i);
		}
		public SetOpSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOpSelectStatement; }
	}

	public final SetOpSelectStatementContext setOpSelectStatement() throws RecognitionException {
		SetOpSelectStatementContext _localctx = new SetOpSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_setOpSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2744);
				setOperator();
				setState(2745);
				atomSelectStatement();
				}
				}
				setState(2749); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_UNION || _la==KW_EXCEPT || _la==KW_MINUS || _la==KW_INTERSECT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementWithCTEContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SelectStatementWithCTEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatementWithCTE; }
	}

	public final SelectStatementWithCTEContext selectStatementWithCTE() throws RecognitionException {
		SelectStatementWithCTEContext _localctx = new SelectStatementWithCTEContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_selectStatementWithCTE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(2751);
				withClause();
				}
			}

			setState(2754);
			selectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public LateralViewContext lateralView() {
			return getRuleContext(LateralViewContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public ClusterByClauseContext clusterByClause() {
			return getRuleContext(ClusterByClauseContext.class,0);
		}
		public DistributeByClauseContext distributeByClause() {
			return getRuleContext(DistributeByClauseContext.class,0);
		}
		public SortByClauseContext sortByClause() {
			return getRuleContext(SortByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_body);
		int _la;
		try {
			setState(2819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2756);
				insertClause();
				setState(2757);
				selectClause();
				setState(2759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LATERAL || _la==COMMA) {
					{
					setState(2758);
					lateralView();
					}
				}

				setState(2762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(2761);
					whereClause();
					}
				}

				setState(2765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_GROUP) {
					{
					setState(2764);
					groupByClause();
					}
				}

				setState(2768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HAVING) {
					{
					setState(2767);
					havingClause();
					}
				}

				setState(2771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WINDOW) {
					{
					setState(2770);
					window_clause();
					}
				}

				setState(2774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ORDER) {
					{
					setState(2773);
					orderByClause();
					}
				}

				setState(2777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CLUSTER) {
					{
					setState(2776);
					clusterByClause();
					}
				}

				setState(2780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTRIBUTE) {
					{
					setState(2779);
					distributeByClause();
					}
				}

				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SORT) {
					{
					setState(2782);
					sortByClause();
					}
				}

				setState(2786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LIMIT) {
					{
					setState(2785);
					limitClause();
					}
				}

				}
				break;
			case KW_SELECT:
			case KW_MAP:
			case KW_REDUCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2788);
				selectClause();
				setState(2790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LATERAL || _la==COMMA) {
					{
					setState(2789);
					lateralView();
					}
				}

				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WHERE) {
					{
					setState(2792);
					whereClause();
					}
				}

				setState(2796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_GROUP) {
					{
					setState(2795);
					groupByClause();
					}
				}

				setState(2799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_HAVING) {
					{
					setState(2798);
					havingClause();
					}
				}

				setState(2802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_WINDOW) {
					{
					setState(2801);
					window_clause();
					}
				}

				setState(2805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ORDER) {
					{
					setState(2804);
					orderByClause();
					}
				}

				setState(2808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_CLUSTER) {
					{
					setState(2807);
					clusterByClause();
					}
				}

				setState(2811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_DISTRIBUTE) {
					{
					setState(2810);
					distributeByClause();
					}
				}

				setState(2814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SORT) {
					{
					setState(2813);
					sortByClause();
					}
				}

				setState(2817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LIMIT) {
					{
					setState(2816);
					limitClause();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode KW_INSERT() { return getToken(HiveParser.KW_INSERT, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(HiveParser.KW_OVERWRITE, 0); }
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public IfNotExistsContext ifNotExists() {
			return getRuleContext(IfNotExistsContext.class,0);
		}
		public TerminalNode KW_INTO() { return getToken(HiveParser.KW_INTO, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_insertClause);
		int _la;
		try {
			setState(2839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2821);
				match(KW_INSERT);
				setState(2822);
				match(KW_OVERWRITE);
				setState(2823);
				destination();
				setState(2825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(2824);
					ifNotExists();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2827);
				match(KW_INSERT);
				setState(2828);
				match(KW_INTO);
				setState(2830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_TABLE) {
					{
					setState(2829);
					match(KW_TABLE);
					}
				}

				setState(2832);
				tableOrPartition();
				setState(2837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2833);
					match(LPAREN);
					setState(2834);
					columnNameList();
					setState(2835);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode KW_DIRECTORY() { return getToken(HiveParser.KW_DIRECTORY, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_LOCAL() { return getToken(HiveParser.KW_LOCAL, 0); }
		public TableRowFormatContext tableRowFormat() {
			return getRuleContext(TableRowFormatContext.class,0);
		}
		public TableFileFormatContext tableFileFormat() {
			return getRuleContext(TableFileFormatContext.class,0);
		}
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public TableOrPartitionContext tableOrPartition() {
			return getRuleContext(TableOrPartitionContext.class,0);
		}
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_destination);
		int _la;
		try {
			setState(2854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DIRECTORY:
			case KW_LOCAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_LOCAL) {
					{
					setState(2841);
					match(KW_LOCAL);
					}
				}

				setState(2844);
				match(KW_DIRECTORY);
				setState(2845);
				match(StringLiteral);
				setState(2847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ROW) {
					{
					setState(2846);
					tableRowFormat();
					}
				}

				setState(2850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_STORED) {
					{
					setState(2849);
					tableFileFormat();
					}
				}

				}
				break;
			case KW_TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2852);
				match(KW_TABLE);
				setState(2853);
				tableOrPartition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode KW_LIMIT() { return getToken(HiveParser.KW_LIMIT, 0); }
		public List<TerminalNode> Number() { return getTokens(HiveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HiveParser.Number, i);
		}
		public TerminalNode COMMA() { return getToken(HiveParser.COMMA, 0); }
		public TerminalNode KW_OFFSET() { return getToken(HiveParser.KW_OFFSET, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_limitClause);
		try {
			setState(2866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2856);
				match(KW_LIMIT);
				{
				setState(2859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2857);
					match(Number);
					setState(2858);
					match(COMMA);
					}
					break;
				}
				setState(2861);
				match(Number);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2862);
				match(KW_LIMIT);
				setState(2863);
				match(Number);
				setState(2864);
				match(KW_OFFSET);
				setState(2865);
				match(Number);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode KW_DELETE() { return getToken(HiveParser.KW_DELETE, 0); }
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2868);
			match(KW_DELETE);
			setState(2869);
			match(KW_FROM);
			setState(2870);
			tableName();
			setState(2872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(2871);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAssignmentClauseContext extends ParserRuleContext {
		public TableOrColumnContext tableOrColumn() {
			return getRuleContext(TableOrColumnContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnAssignmentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAssignmentClause; }
	}

	public final ColumnAssignmentClauseContext columnAssignmentClause() throws RecognitionException {
		ColumnAssignmentClauseContext _localctx = new ColumnAssignmentClauseContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_columnAssignmentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			tableOrColumn();
			setState(2875);
			match(EQUAL);
			setState(2876);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetColumnsClauseContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public List<ColumnAssignmentClauseContext> columnAssignmentClause() {
			return getRuleContexts(ColumnAssignmentClauseContext.class);
		}
		public ColumnAssignmentClauseContext columnAssignmentClause(int i) {
			return getRuleContext(ColumnAssignmentClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SetColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setColumnsClause; }
	}

	public final SetColumnsClauseContext setColumnsClause() throws RecognitionException {
		SetColumnsClauseContext _localctx = new SetColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_setColumnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
			match(KW_SET);
			setState(2879);
			columnAssignmentClause();
			setState(2884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2880);
				match(COMMA);
				setState(2881);
				columnAssignmentClause();
				}
				}
				setState(2886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public SetColumnsClauseContext setColumnsClause() {
			return getRuleContext(SetColumnsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2887);
			match(KW_UPDATE);
			setState(2888);
			tableName();
			setState(2889);
			setColumnsClause();
			setState(2891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(2890);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlTransactionStatementContext extends ParserRuleContext {
		public StartTransactionStatementContext startTransactionStatement() {
			return getRuleContext(StartTransactionStatementContext.class,0);
		}
		public CommitStatementContext commitStatement() {
			return getRuleContext(CommitStatementContext.class,0);
		}
		public RollbackStatementContext rollbackStatement() {
			return getRuleContext(RollbackStatementContext.class,0);
		}
		public SetAutoCommitStatementContext setAutoCommitStatement() {
			return getRuleContext(SetAutoCommitStatementContext.class,0);
		}
		public SqlTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTransactionStatement; }
	}

	public final SqlTransactionStatementContext sqlTransactionStatement() throws RecognitionException {
		SqlTransactionStatementContext _localctx = new SqlTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_sqlTransactionStatement);
		try {
			setState(2897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2893);
				startTransactionStatement();
				}
				break;
			case KW_COMMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2894);
				commitStatement();
				}
				break;
			case KW_ROLLBACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(2895);
				rollbackStatement();
				}
				break;
			case KW_SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(2896);
				setAutoCommitStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartTransactionStatementContext extends ParserRuleContext {
		public TerminalNode KW_START() { return getToken(HiveParser.KW_START, 0); }
		public TerminalNode KW_TRANSACTION() { return getToken(HiveParser.KW_TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public StartTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTransactionStatement; }
	}

	public final StartTransactionStatementContext startTransactionStatement() throws RecognitionException {
		StartTransactionStatementContext _localctx = new StartTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_startTransactionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2899);
			match(KW_START);
			setState(2900);
			match(KW_TRANSACTION);
			setState(2909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_READ || _la==KW_ISOLATION) {
				{
				setState(2901);
				transactionMode();
				setState(2906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2902);
					match(COMMA);
					setState(2903);
					transactionMode();
					}
					}
					setState(2908);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public IsolationLevelContext isolationLevel() {
			return getRuleContext(IsolationLevelContext.class,0);
		}
		public TransactionAccessModeContext transactionAccessMode() {
			return getRuleContext(TransactionAccessModeContext.class,0);
		}
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_transactionMode);
		try {
			setState(2913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ISOLATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2911);
				isolationLevel();
				}
				break;
			case KW_READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(2912);
				transactionAccessMode();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionAccessModeContext extends ParserRuleContext {
		public TerminalNode KW_READ() { return getToken(HiveParser.KW_READ, 0); }
		public TerminalNode KW_ONLY() { return getToken(HiveParser.KW_ONLY, 0); }
		public TerminalNode KW_WRITE() { return getToken(HiveParser.KW_WRITE, 0); }
		public TransactionAccessModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionAccessMode; }
	}

	public final TransactionAccessModeContext transactionAccessMode() throws RecognitionException {
		TransactionAccessModeContext _localctx = new TransactionAccessModeContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_transactionAccessMode);
		try {
			setState(2919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2915);
				match(KW_READ);
				setState(2916);
				match(KW_ONLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2917);
				match(KW_READ);
				setState(2918);
				match(KW_WRITE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsolationLevelContext extends ParserRuleContext {
		public TerminalNode KW_ISOLATION() { return getToken(HiveParser.KW_ISOLATION, 0); }
		public TerminalNode KW_LEVEL() { return getToken(HiveParser.KW_LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isolationLevel; }
	}

	public final IsolationLevelContext isolationLevel() throws RecognitionException {
		IsolationLevelContext _localctx = new IsolationLevelContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_isolationLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			match(KW_ISOLATION);
			setState(2922);
			match(KW_LEVEL);
			setState(2923);
			levelOfIsolation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public TerminalNode KW_SNAPSHOT() { return getToken(HiveParser.KW_SNAPSHOT, 0); }
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_levelOfIsolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2925);
			match(KW_SNAPSHOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitStatementContext extends ParserRuleContext {
		public TerminalNode KW_COMMIT() { return getToken(HiveParser.KW_COMMIT, 0); }
		public TerminalNode KW_WORK() { return getToken(HiveParser.KW_WORK, 0); }
		public CommitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStatement; }
	}

	public final CommitStatementContext commitStatement() throws RecognitionException {
		CommitStatementContext _localctx = new CommitStatementContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_commitStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2927);
			match(KW_COMMIT);
			setState(2929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WORK) {
				{
				setState(2928);
				match(KW_WORK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackStatementContext extends ParserRuleContext {
		public TerminalNode KW_ROLLBACK() { return getToken(HiveParser.KW_ROLLBACK, 0); }
		public TerminalNode KW_WORK() { return getToken(HiveParser.KW_WORK, 0); }
		public RollbackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackStatement; }
	}

	public final RollbackStatementContext rollbackStatement() throws RecognitionException {
		RollbackStatementContext _localctx = new RollbackStatementContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_rollbackStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2931);
			match(KW_ROLLBACK);
			setState(2933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WORK) {
				{
				setState(2932);
				match(KW_WORK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAutoCommitStatementContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(HiveParser.KW_SET, 0); }
		public TerminalNode KW_AUTOCOMMIT() { return getToken(HiveParser.KW_AUTOCOMMIT, 0); }
		public BooleanValueTokContext booleanValueTok() {
			return getRuleContext(BooleanValueTokContext.class,0);
		}
		public SetAutoCommitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommitStatement; }
	}

	public final SetAutoCommitStatementContext setAutoCommitStatement() throws RecognitionException {
		SetAutoCommitStatementContext _localctx = new SetAutoCommitStatementContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_setAutoCommitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2935);
			match(KW_SET);
			setState(2936);
			match(KW_AUTOCOMMIT);
			setState(2937);
			booleanValueTok();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbortTransactionStatementContext extends ParserRuleContext {
		public TerminalNode KW_ABORT() { return getToken(HiveParser.KW_ABORT, 0); }
		public TerminalNode KW_TRANSACTIONS() { return getToken(HiveParser.KW_TRANSACTIONS, 0); }
		public List<TerminalNode> Number() { return getTokens(HiveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HiveParser.Number, i);
		}
		public AbortTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abortTransactionStatement; }
	}

	public final AbortTransactionStatementContext abortTransactionStatement() throws RecognitionException {
		AbortTransactionStatementContext _localctx = new AbortTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_abortTransactionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2939);
			match(KW_ABORT);
			setState(2940);
			match(KW_TRANSACTIONS);
			setState(2942); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2941);
				match(Number);
				}
				}
				setState(2944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Number );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeStatementContext extends ParserRuleContext {
		public TerminalNode KW_MERGE() { return getToken(HiveParser.KW_MERGE, 0); }
		public TerminalNode KW_INTO() { return getToken(HiveParser.KW_INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode KW_USING() { return getToken(HiveParser.KW_USING, 0); }
		public JoinSourcePartContext joinSourcePart() {
			return getRuleContext(JoinSourcePartContext.class,0);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenClausesContext whenClauses() {
			return getRuleContext(WhenClausesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public MergeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeStatement; }
	}

	public final MergeStatementContext mergeStatement() throws RecognitionException {
		MergeStatementContext _localctx = new MergeStatementContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_mergeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
			match(KW_MERGE);
			setState(2947);
			match(KW_INTO);
			setState(2948);
			tableName();
			setState(2953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_AS) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KW_CHANGE - 68)) | (1L << (KW_FIRST - 68)) | (1L << (KW_AFTER - 68)) | (1L << (KW_RENAME - 68)) | (1L << (KW_COMMENT - 68)) | (1L << (KW_TINYINT - 68)) | (1L << (KW_DATETIME - 68)) | (1L << (KW_ZONE - 68)) | (1L << (KW_STRING - 68)) | (1L << (KW_STRUCT - 68)) | (1L << (KW_UNIONTYPE - 68)) | (1L << (KW_PARTITIONED - 68)) | (1L << (KW_CLUSTERED - 68)) | (1L << (KW_SORTED - 68)) | (1L << (KW_BUCKETS - 68)) | (1L << (KW_FORMAT - 68)) | (1L << (KW_DELIMITED - 68)) | (1L << (KW_FIELDS - 68)) | (1L << (KW_TERMINATED - 68)) | (1L << (KW_ESCAPED - 68)) | (1L << (KW_COLLECTION - 68)) | (1L << (KW_ITEMS - 68)) | (1L << (KW_KEYS - 68)) | (1L << (KW_KEY_TYPE - 68)) | (1L << (KW_KILL - 68)) | (1L << (KW_LINES - 68)) | (1L << (KW_STORED - 68)) | (1L << (KW_FILEFORMAT - 68)) | (1L << (KW_INPUTFORMAT - 68)) | (1L << (KW_OUTPUTFORMAT - 68)) | (1L << (KW_INPUTDRIVER - 68)) | (1L << (KW_OUTPUTDRIVER - 68)) | (1L << (KW_ENABLE - 68)) | (1L << (KW_DISABLE - 68)) | (1L << (KW_LOCATION - 68)) | (1L << (KW_BUCKET - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (KW_ADD - 134)) | (1L << (KW_REPLACE - 134)) | (1L << (KW_TEMPORARY - 134)) | (1L << (KW_FILE - 134)) | (1L << (KW_JAR - 134)) | (1L << (KW_EXPLAIN - 134)) | (1L << (KW_FORMATTED - 134)) | (1L << (KW_DEPENDENCY - 134)) | (1L << (KW_LOGICAL - 134)) | (1L << (KW_SERDE - 134)) | (1L << (KW_DEFERRED - 134)) | (1L << (KW_SERDEPROPERTIES - 134)) | (1L << (KW_DBPROPERTIES - 134)) | (1L << (KW_LIMIT - 134)) | (1L << (KW_OFFSET - 134)) | (1L << (KW_UNSET - 134)) | (1L << (KW_TBLPROPERTIES - 134)) | (1L << (KW_IDXPROPERTIES - 134)) | (1L << (KW_VALUE_TYPE - 134)) | (1L << (KW_ELEM_TYPE - 134)) | (1L << (KW_DEFINED - 134)) | (1L << (KW_MAPJOIN - 134)) | (1L << (KW_STREAMTABLE - 134)) | (1L << (KW_CLUSTERSTATUS - 134)) | (1L << (KW_UTC - 134)) | (1L << (KW_UTCTIMESTAMP - 134)) | (1L << (KW_LONG - 134)) | (1L << (KW_PLUS - 134)) | (1L << (KW_VIEW - 134)) | (1L << (KW_VIEWS - 134)) | (1L << (KW_DATABASES - 134)) | (1L << (KW_MATERIALIZED - 134)) | (1L << (KW_SCHEMA - 134)) | (1L << (KW_SCHEMAS - 134)) | (1L << (KW_SSL - 134)) | (1L << (KW_UNDO - 134)) | (1L << (KW_LOCK - 134)) | (1L << (KW_LOCKS - 134)) | (1L << (KW_UNLOCK - 134)) | (1L << (KW_SHARED - 134)) | (1L << (KW_EXCLUSIVE - 134)) | (1L << (KW_UNSIGNED - 134)) | (1L << (KW_WHILE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (KW_READ - 198)) | (1L << (KW_PURGE - 198)) | (1L << (KW_ANALYZE - 198)) | (1L << (KW_BEFORE - 198)) | (1L << (KW_CONTINUE - 198)) | (1L << (KW_RECORDREADER - 198)) | (1L << (KW_RECORDWRITER - 198)) | (1L << (KW_SEMI - 198)) | (1L << (KW_TOUCH - 198)) | (1L << (KW_ARCHIVE - 198)) | (1L << (KW_UNARCHIVE - 198)) | (1L << (KW_COMPUTE - 198)) | (1L << (KW_STATISTICS - 198)) | (1L << (KW_USE - 198)) | (1L << (KW_OPTION - 198)) | (1L << (KW_CONCATENATE - 198)) | (1L << (KW_SHOW_DATABASE - 198)) | (1L << (KW_RESTRICT - 198)) | (1L << (KW_CASCADE - 198)) | (1L << (KW_SKEWED - 198)) | (1L << (KW_DIRECTORIES - 198)) | (1L << (KW_SETS - 198)) | (1L << (KW_NOSCAN - 198)) | (1L << (KW_ROLE - 198)) | (1L << (KW_ROLES - 198)) | (1L << (KW_URI - 198)) | (1L << (KW_SERVER - 198)) | (1L << (KW_ADMIN - 198)) | (1L << (KW_OWNER - 198)) | (1L << (KW_PRINCIPALS - 198)) | (1L << (KW_COMPACT - 198)) | (1L << (KW_COMPACTIONS - 198)) | (1L << (KW_TRANSACTIONS - 198)) | (1L << (KW_REWRITE - 198)) | (1L << (KW_REOPTIMIZATION - 198)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (KW_RELOAD - 264)) | (1L << (KW_YEAR - 264)) | (1L << (KW_QUERY - 264)) | (1L << (KW_QUARTER - 264)) | (1L << (KW_MONTH - 264)) | (1L << (KW_WEEK - 264)) | (1L << (KW_DAY - 264)) | (1L << (KW_DOW - 264)) | (1L << (KW_HOUR - 264)) | (1L << (KW_MINUTE - 264)) | (1L << (KW_SECOND - 264)) | (1L << (KW_TRANSACTION - 264)) | (1L << (KW_WORK - 264)) | (1L << (KW_WRITE - 264)) | (1L << (KW_ISOLATION - 264)) | (1L << (KW_LEVEL - 264)) | (1L << (KW_SNAPSHOT - 264)) | (1L << (KW_AUTOCOMMIT - 264)) | (1L << (KW_CACHE - 264)) | (1L << (KW_ENFORCED - 264)) | (1L << (KW_VALIDATE - 264)) | (1L << (KW_NOVALIDATE - 264)) | (1L << (KW_RELY - 264)) | (1L << (KW_NORELY - 264)) | (1L << (KW_KEY - 264)) | (1L << (KW_ABORT - 264)) | (1L << (KW_MATCHED - 264)) | (1L << (KW_REPL - 264)) | (1L << (KW_DUMP - 264)) | (1L << (KW_STATUS - 264)) | (1L << (KW_VECTORIZATION - 264)) | (1L << (KW_SUMMARY - 264)) | (1L << (KW_OPERATOR - 264)) | (1L << (KW_EXPRESSION - 264)) | (1L << (KW_DETAIL - 264)) | (1L << (KW_WAIT - 264)) | (1L << (KW_RESOURCE - 264)) | (1L << (KW_PLAN - 264)) | (1L << (KW_QUERY_PARALLELISM - 264)) | (1L << (KW_PLANS - 264)) | (1L << (KW_ACTIVATE - 264)) | (1L << (KW_DEFAULT - 264)) | (1L << (KW_CHECK - 264)) | (1L << (KW_POOL - 264)) | (1L << (KW_MOVE - 264)) | (1L << (KW_DO - 264)) | (1L << (KW_ALLOC_FRACTION - 264)) | (1L << (KW_SCHEDULING_POLICY - 264)) | (1L << (KW_PATH - 264)) | (1L << (KW_MAPPING - 264)) | (1L << (KW_WORKLOAD - 264)) | (1L << (KW_MANAGEMENT - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (KW_ACTIVE - 328)) | (1L << (KW_UNMANAGED - 328)) | (1L << (Identifier - 328)))) != 0)) {
				{
				setState(2950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(2949);
					match(KW_AS);
					}
				}

				setState(2952);
				identifier();
				}
			}

			setState(2955);
			match(KW_USING);
			setState(2956);
			joinSourcePart();
			setState(2957);
			match(KW_ON);
			setState(2958);
			expression(0);
			setState(2959);
			whenClauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClausesContext extends ParserRuleContext {
		public List<WhenMatchedAndClauseContext> whenMatchedAndClause() {
			return getRuleContexts(WhenMatchedAndClauseContext.class);
		}
		public WhenMatchedAndClauseContext whenMatchedAndClause(int i) {
			return getRuleContext(WhenMatchedAndClauseContext.class,i);
		}
		public List<WhenMatchedThenClauseContext> whenMatchedThenClause() {
			return getRuleContexts(WhenMatchedThenClauseContext.class);
		}
		public WhenMatchedThenClauseContext whenMatchedThenClause(int i) {
			return getRuleContext(WhenMatchedThenClauseContext.class,i);
		}
		public WhenNotMatchedClauseContext whenNotMatchedClause() {
			return getRuleContext(WhenNotMatchedClauseContext.class,0);
		}
		public WhenClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClauses; }
	}

	public final WhenClausesContext whenClauses() throws RecognitionException {
		WhenClausesContext _localctx = new WhenClausesContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_whenClauses);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
					case 1:
						{
						setState(2961);
						whenMatchedAndClause();
						}
						break;
					case 2:
						{
						setState(2962);
						whenMatchedThenClause();
						}
						break;
					}
					} 
				}
				setState(2967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,343,_ctx);
			}
			setState(2969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHEN) {
				{
				setState(2968);
				whenNotMatchedClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenNotMatchedClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHEN() { return getToken(HiveParser.KW_WHEN, 0); }
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_MATCHED() { return getToken(HiveParser.KW_MATCHED, 0); }
		public TerminalNode KW_THEN() { return getToken(HiveParser.KW_THEN, 0); }
		public TerminalNode KW_INSERT() { return getToken(HiveParser.KW_INSERT, 0); }
		public TerminalNode KW_VALUES() { return getToken(HiveParser.KW_VALUES, 0); }
		public ValueRowConstructorContext valueRowConstructor() {
			return getRuleContext(ValueRowConstructorContext.class,0);
		}
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenNotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenNotMatchedClause; }
	}

	public final WhenNotMatchedClauseContext whenNotMatchedClause() throws RecognitionException {
		WhenNotMatchedClauseContext _localctx = new WhenNotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_whenNotMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2971);
			match(KW_WHEN);
			setState(2972);
			match(KW_NOT);
			setState(2973);
			match(KW_MATCHED);
			setState(2976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AND) {
				{
				setState(2974);
				match(KW_AND);
				setState(2975);
				expression(0);
				}
			}

			setState(2978);
			match(KW_THEN);
			setState(2979);
			match(KW_INSERT);
			setState(2980);
			match(KW_VALUES);
			setState(2981);
			valueRowConstructor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenMatchedAndClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHEN() { return getToken(HiveParser.KW_WHEN, 0); }
		public TerminalNode KW_MATCHED() { return getToken(HiveParser.KW_MATCHED, 0); }
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_THEN() { return getToken(HiveParser.KW_THEN, 0); }
		public UpdateOrDeleteContext updateOrDelete() {
			return getRuleContext(UpdateOrDeleteContext.class,0);
		}
		public WhenMatchedAndClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenMatchedAndClause; }
	}

	public final WhenMatchedAndClauseContext whenMatchedAndClause() throws RecognitionException {
		WhenMatchedAndClauseContext _localctx = new WhenMatchedAndClauseContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_whenMatchedAndClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2983);
			match(KW_WHEN);
			setState(2984);
			match(KW_MATCHED);
			setState(2985);
			match(KW_AND);
			setState(2986);
			expression(0);
			setState(2987);
			match(KW_THEN);
			setState(2988);
			updateOrDelete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenMatchedThenClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHEN() { return getToken(HiveParser.KW_WHEN, 0); }
		public TerminalNode KW_MATCHED() { return getToken(HiveParser.KW_MATCHED, 0); }
		public TerminalNode KW_THEN() { return getToken(HiveParser.KW_THEN, 0); }
		public UpdateOrDeleteContext updateOrDelete() {
			return getRuleContext(UpdateOrDeleteContext.class,0);
		}
		public WhenMatchedThenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenMatchedThenClause; }
	}

	public final WhenMatchedThenClauseContext whenMatchedThenClause() throws RecognitionException {
		WhenMatchedThenClauseContext _localctx = new WhenMatchedThenClauseContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_whenMatchedThenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2990);
			match(KW_WHEN);
			setState(2991);
			match(KW_MATCHED);
			setState(2992);
			match(KW_THEN);
			setState(2993);
			updateOrDelete();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateOrDeleteContext extends ParserRuleContext {
		public TerminalNode KW_UPDATE() { return getToken(HiveParser.KW_UPDATE, 0); }
		public SetColumnsClauseContext setColumnsClause() {
			return getRuleContext(SetColumnsClauseContext.class,0);
		}
		public TerminalNode KW_DELETE() { return getToken(HiveParser.KW_DELETE, 0); }
		public UpdateOrDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateOrDelete; }
	}

	public final UpdateOrDeleteContext updateOrDelete() throws RecognitionException {
		UpdateOrDeleteContext _localctx = new UpdateOrDeleteContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_updateOrDelete);
		try {
			setState(2998);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2995);
				match(KW_UPDATE);
				setState(2996);
				setColumnsClause();
				}
				break;
			case KW_DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2997);
				match(KW_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillQueryStatementContext extends ParserRuleContext {
		public TerminalNode KW_KILL() { return getToken(HiveParser.KW_KILL, 0); }
		public TerminalNode KW_QUERY() { return getToken(HiveParser.KW_QUERY, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public KillQueryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_killQueryStatement; }
	}

	public final KillQueryStatementContext killQueryStatement() throws RecognitionException {
		KillQueryStatementContext _localctx = new KillQueryStatementContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_killQueryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3000);
			match(KW_KILL);
			setState(3001);
			match(KW_QUERY);
			setState(3003); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3002);
				match(StringLiteral);
				}
				}
				setState(3005); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode KW_SELECT() { return getToken(HiveParser.KW_SELECT, 0); }
		public TerminalNode QUERY_HINT() { return getToken(HiveParser.QUERY_HINT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode KW_TRANSFORM() { return getToken(HiveParser.KW_TRANSFORM, 0); }
		public SelectTrfmClauseContext selectTrfmClause() {
			return getRuleContext(SelectTrfmClauseContext.class,0);
		}
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public TerminalNode KW_DISTINCT() { return getToken(HiveParser.KW_DISTINCT, 0); }
		public TrfmClauseContext trfmClause() {
			return getRuleContext(TrfmClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_selectClause);
		int _la;
		try {
			setState(3020);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3007);
				match(KW_SELECT);
				setState(3009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY_HINT) {
					{
					setState(3008);
					match(QUERY_HINT);
					}
				}

				setState(3017);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_TRUE:
				case KW_FALSE:
				case KW_ALL:
				case KW_NOT:
				case KW_IF:
				case KW_EXISTS:
				case KW_ASC:
				case KW_DESC:
				case KW_NULLS:
				case KW_LAST:
				case KW_DISTINCT:
				case KW_OVERWRITE:
				case KW_PARTITIONS:
				case KW_TABLES:
				case KW_COLUMNS:
				case KW_INDEX:
				case KW_INDEXES:
				case KW_REBUILD:
				case KW_FUNCTIONS:
				case KW_SHOW:
				case KW_MSCK:
				case KW_REPAIR:
				case KW_DIRECTORY:
				case KW_CLUSTER:
				case KW_DISTRIBUTE:
				case KW_SORT:
				case KW_LOAD:
				case KW_EXPORT:
				case KW_REPLICATION:
				case KW_METADATA:
				case KW_DATA:
				case KW_INPATH:
				case KW_NULL:
				case KW_CHANGE:
				case KW_FIRST:
				case KW_AFTER:
				case KW_RENAME:
				case KW_COMMENT:
				case KW_BOOLEAN:
				case KW_TINYINT:
				case KW_SMALLINT:
				case KW_INT:
				case KW_BIGINT:
				case KW_FLOAT:
				case KW_DOUBLE:
				case KW_DATE:
				case KW_DATETIME:
				case KW_TIMESTAMP:
				case KW_TIMESTAMPLOCALTZ:
				case KW_ZONE:
				case KW_INTERVAL:
				case KW_STRING:
				case KW_ARRAY:
				case KW_STRUCT:
				case KW_MAP:
				case KW_UNIONTYPE:
				case KW_PARTITIONED:
				case KW_CLUSTERED:
				case KW_SORTED:
				case KW_BUCKETS:
				case KW_FORMAT:
				case KW_DELIMITED:
				case KW_FIELDS:
				case KW_TERMINATED:
				case KW_ESCAPED:
				case KW_COLLECTION:
				case KW_ITEMS:
				case KW_KEYS:
				case KW_KEY_TYPE:
				case KW_KILL:
				case KW_LINES:
				case KW_STORED:
				case KW_FILEFORMAT:
				case KW_INPUTFORMAT:
				case KW_OUTPUTFORMAT:
				case KW_INPUTDRIVER:
				case KW_OUTPUTDRIVER:
				case KW_ENABLE:
				case KW_DISABLE:
				case KW_LOCATION:
				case KW_BUCKET:
				case KW_CAST:
				case KW_ADD:
				case KW_REPLACE:
				case KW_TEMPORARY:
				case KW_FILE:
				case KW_JAR:
				case KW_EXPLAIN:
				case KW_FORMATTED:
				case KW_DEPENDENCY:
				case KW_LOGICAL:
				case KW_SERDE:
				case KW_DEFERRED:
				case KW_SERDEPROPERTIES:
				case KW_DBPROPERTIES:
				case KW_LIMIT:
				case KW_OFFSET:
				case KW_UNSET:
				case KW_TBLPROPERTIES:
				case KW_IDXPROPERTIES:
				case KW_VALUE_TYPE:
				case KW_ELEM_TYPE:
				case KW_DEFINED:
				case KW_CASE:
				case KW_MAPJOIN:
				case KW_STREAMTABLE:
				case KW_CLUSTERSTATUS:
				case KW_UTC:
				case KW_UTCTIMESTAMP:
				case KW_LONG:
				case KW_PLUS:
				case KW_VIEW:
				case KW_VIEWS:
				case KW_DATABASES:
				case KW_MATERIALIZED:
				case KW_SCHEMA:
				case KW_SCHEMAS:
				case KW_SSL:
				case KW_UNDO:
				case KW_LOCK:
				case KW_LOCKS:
				case KW_UNLOCK:
				case KW_SHARED:
				case KW_EXCLUSIVE:
				case KW_UNSIGNED:
				case KW_WHILE:
				case KW_READ:
				case KW_PURGE:
				case KW_ANALYZE:
				case KW_BEFORE:
				case KW_BINARY:
				case KW_CONTINUE:
				case KW_RECORDREADER:
				case KW_RECORDWRITER:
				case KW_SEMI:
				case KW_TOUCH:
				case KW_ARCHIVE:
				case KW_UNARCHIVE:
				case KW_COMPUTE:
				case KW_STATISTICS:
				case KW_USE:
				case KW_OPTION:
				case KW_CONCATENATE:
				case KW_SHOW_DATABASE:
				case KW_RESTRICT:
				case KW_CASCADE:
				case KW_SKEWED:
				case KW_DIRECTORIES:
				case KW_CURRENT_DATE:
				case KW_CURRENT_TIMESTAMP:
				case KW_GROUPING:
				case KW_SETS:
				case KW_NOSCAN:
				case KW_ROLE:
				case KW_ROLES:
				case KW_URI:
				case KW_SERVER:
				case KW_ADMIN:
				case KW_OWNER:
				case KW_PRINCIPALS:
				case KW_COMPACT:
				case KW_COMPACTIONS:
				case KW_TRANSACTIONS:
				case KW_REWRITE:
				case KW_REOPTIMIZATION:
				case KW_RELOAD:
				case KW_YEAR:
				case KW_QUERY:
				case KW_QUARTER:
				case KW_MONTH:
				case KW_WEEK:
				case KW_DAY:
				case KW_DOW:
				case KW_HOUR:
				case KW_MINUTE:
				case KW_SECOND:
				case KW_TRANSACTION:
				case KW_WORK:
				case KW_WRITE:
				case KW_ISOLATION:
				case KW_LEVEL:
				case KW_SNAPSHOT:
				case KW_AUTOCOMMIT:
				case KW_CACHE:
				case KW_ENFORCED:
				case KW_VALIDATE:
				case KW_NOVALIDATE:
				case KW_RELY:
				case KW_NORELY:
				case KW_KEY:
				case KW_ABORT:
				case KW_EXTRACT:
				case KW_FLOOR:
				case KW_MATCHED:
				case KW_REPL:
				case KW_DUMP:
				case KW_STATUS:
				case KW_VECTORIZATION:
				case KW_SUMMARY:
				case KW_OPERATOR:
				case KW_EXPRESSION:
				case KW_DETAIL:
				case KW_WAIT:
				case KW_RESOURCE:
				case KW_PLAN:
				case KW_QUERY_PARALLELISM:
				case KW_PLANS:
				case KW_ACTIVATE:
				case KW_DEFAULT:
				case KW_CHECK:
				case KW_POOL:
				case KW_MOVE:
				case KW_DO:
				case KW_ALLOC_FRACTION:
				case KW_SCHEDULING_POLICY:
				case KW_PATH:
				case KW_MAPPING:
				case KW_WORKLOAD:
				case KW_MANAGEMENT:
				case KW_ACTIVE:
				case KW_UNMANAGED:
				case LPAREN:
				case PLUS:
				case MINUS:
				case STAR:
				case TILDE:
				case StringLiteral:
				case IntegralLiteral:
				case NumberLiteral:
				case Number:
				case Identifier:
				case CharSetName:
					{
					{
					setState(3012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_ALL || _la==KW_DISTINCT) {
						{
						setState(3011);
						_la = _input.LA(1);
						if ( !(_la==KW_ALL || _la==KW_DISTINCT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(3014);
					selectList();
					}
					}
					break;
				case KW_TRANSFORM:
					{
					{
					setState(3015);
					match(KW_TRANSFORM);
					setState(3016);
					selectTrfmClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case KW_MAP:
			case KW_REDUCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3019);
				trfmClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_selectList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3022);
			selectItem();
			setState(3027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3023);
					match(COMMA);
					setState(3024);
					selectItem();
					}
					} 
				}
				setState(3029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectTrfmClauseContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public SelectExpressionListContext selectExpressionList() {
			return getRuleContext(SelectExpressionListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public TerminalNode KW_USING() { return getToken(HiveParser.KW_USING, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public RecordWriterContext recordWriter() {
			return getRuleContext(RecordWriterContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public RecordReaderContext recordReader() {
			return getRuleContext(RecordReaderContext.class,0);
		}
		public AliasListContext aliasList() {
			return getRuleContext(AliasListContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public SelectTrfmClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectTrfmClause; }
	}

	public final SelectTrfmClauseContext selectTrfmClause() throws RecognitionException {
		SelectTrfmClauseContext _localctx = new SelectTrfmClauseContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_selectTrfmClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3030);
			match(LPAREN);
			setState(3031);
			selectExpressionList();
			setState(3032);
			match(RPAREN);
			setState(3034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW) {
				{
				setState(3033);
				rowFormat();
				}
			}

			setState(3037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RECORDWRITER) {
				{
				setState(3036);
				recordWriter();
				}
			}

			setState(3039);
			match(KW_USING);
			setState(3040);
			match(StringLiteral);
			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(3041);
				match(KW_AS);
				setState(3053);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(3042);
					match(LPAREN);
					setState(3045);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
					case 1:
						{
						setState(3043);
						aliasList();
						}
						break;
					case 2:
						{
						setState(3044);
						columnNameTypeList();
						}
						break;
					}
					setState(3047);
					match(RPAREN);
					}
					}
					break;
				case KW_ASC:
				case KW_DESC:
				case KW_NULLS:
				case KW_LAST:
				case KW_OVERWRITE:
				case KW_PARTITIONS:
				case KW_TABLES:
				case KW_COLUMNS:
				case KW_INDEX:
				case KW_INDEXES:
				case KW_REBUILD:
				case KW_FUNCTIONS:
				case KW_SHOW:
				case KW_MSCK:
				case KW_REPAIR:
				case KW_DIRECTORY:
				case KW_CLUSTER:
				case KW_DISTRIBUTE:
				case KW_SORT:
				case KW_LOAD:
				case KW_EXPORT:
				case KW_REPLICATION:
				case KW_METADATA:
				case KW_DATA:
				case KW_INPATH:
				case KW_CHANGE:
				case KW_FIRST:
				case KW_AFTER:
				case KW_RENAME:
				case KW_COMMENT:
				case KW_TINYINT:
				case KW_DATETIME:
				case KW_ZONE:
				case KW_STRING:
				case KW_STRUCT:
				case KW_UNIONTYPE:
				case KW_PARTITIONED:
				case KW_CLUSTERED:
				case KW_SORTED:
				case KW_BUCKETS:
				case KW_FORMAT:
				case KW_DELIMITED:
				case KW_FIELDS:
				case KW_TERMINATED:
				case KW_ESCAPED:
				case KW_COLLECTION:
				case KW_ITEMS:
				case KW_KEYS:
				case KW_KEY_TYPE:
				case KW_KILL:
				case KW_LINES:
				case KW_STORED:
				case KW_FILEFORMAT:
				case KW_INPUTFORMAT:
				case KW_OUTPUTFORMAT:
				case KW_INPUTDRIVER:
				case KW_OUTPUTDRIVER:
				case KW_ENABLE:
				case KW_DISABLE:
				case KW_LOCATION:
				case KW_BUCKET:
				case KW_ADD:
				case KW_REPLACE:
				case KW_TEMPORARY:
				case KW_FILE:
				case KW_JAR:
				case KW_EXPLAIN:
				case KW_FORMATTED:
				case KW_DEPENDENCY:
				case KW_LOGICAL:
				case KW_SERDE:
				case KW_DEFERRED:
				case KW_SERDEPROPERTIES:
				case KW_DBPROPERTIES:
				case KW_LIMIT:
				case KW_OFFSET:
				case KW_UNSET:
				case KW_TBLPROPERTIES:
				case KW_IDXPROPERTIES:
				case KW_VALUE_TYPE:
				case KW_ELEM_TYPE:
				case KW_DEFINED:
				case KW_MAPJOIN:
				case KW_STREAMTABLE:
				case KW_CLUSTERSTATUS:
				case KW_UTC:
				case KW_UTCTIMESTAMP:
				case KW_LONG:
				case KW_PLUS:
				case KW_VIEW:
				case KW_VIEWS:
				case KW_DATABASES:
				case KW_MATERIALIZED:
				case KW_SCHEMA:
				case KW_SCHEMAS:
				case KW_SSL:
				case KW_UNDO:
				case KW_LOCK:
				case KW_LOCKS:
				case KW_UNLOCK:
				case KW_SHARED:
				case KW_EXCLUSIVE:
				case KW_UNSIGNED:
				case KW_WHILE:
				case KW_READ:
				case KW_PURGE:
				case KW_ANALYZE:
				case KW_BEFORE:
				case KW_CONTINUE:
				case KW_RECORDREADER:
				case KW_RECORDWRITER:
				case KW_SEMI:
				case KW_TOUCH:
				case KW_ARCHIVE:
				case KW_UNARCHIVE:
				case KW_COMPUTE:
				case KW_STATISTICS:
				case KW_USE:
				case KW_OPTION:
				case KW_CONCATENATE:
				case KW_SHOW_DATABASE:
				case KW_RESTRICT:
				case KW_CASCADE:
				case KW_SKEWED:
				case KW_DIRECTORIES:
				case KW_SETS:
				case KW_NOSCAN:
				case KW_ROLE:
				case KW_ROLES:
				case KW_URI:
				case KW_SERVER:
				case KW_ADMIN:
				case KW_OWNER:
				case KW_PRINCIPALS:
				case KW_COMPACT:
				case KW_COMPACTIONS:
				case KW_TRANSACTIONS:
				case KW_REWRITE:
				case KW_REOPTIMIZATION:
				case KW_RELOAD:
				case KW_YEAR:
				case KW_QUERY:
				case KW_QUARTER:
				case KW_MONTH:
				case KW_WEEK:
				case KW_DAY:
				case KW_DOW:
				case KW_HOUR:
				case KW_MINUTE:
				case KW_SECOND:
				case KW_TRANSACTION:
				case KW_WORK:
				case KW_WRITE:
				case KW_ISOLATION:
				case KW_LEVEL:
				case KW_SNAPSHOT:
				case KW_AUTOCOMMIT:
				case KW_CACHE:
				case KW_ENFORCED:
				case KW_VALIDATE:
				case KW_NOVALIDATE:
				case KW_RELY:
				case KW_NORELY:
				case KW_KEY:
				case KW_ABORT:
				case KW_MATCHED:
				case KW_REPL:
				case KW_DUMP:
				case KW_STATUS:
				case KW_VECTORIZATION:
				case KW_SUMMARY:
				case KW_OPERATOR:
				case KW_EXPRESSION:
				case KW_DETAIL:
				case KW_WAIT:
				case KW_RESOURCE:
				case KW_PLAN:
				case KW_QUERY_PARALLELISM:
				case KW_PLANS:
				case KW_ACTIVATE:
				case KW_DEFAULT:
				case KW_CHECK:
				case KW_POOL:
				case KW_MOVE:
				case KW_DO:
				case KW_ALLOC_FRACTION:
				case KW_SCHEDULING_POLICY:
				case KW_PATH:
				case KW_MAPPING:
				case KW_WORKLOAD:
				case KW_MANAGEMENT:
				case KW_ACTIVE:
				case KW_UNMANAGED:
				case Identifier:
					{
					setState(3051);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
					case 1:
						{
						setState(3049);
						aliasList();
						}
						break;
					case 2:
						{
						setState(3050);
						columnNameTypeList();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW) {
				{
				setState(3057);
				rowFormat();
				}
			}

			setState(3061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RECORDREADER) {
				{
				setState(3060);
				recordReader();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public TableAllColumnsContext tableAllColumns() {
			return getRuleContext(TableAllColumnsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_selectItem);
		int _la;
		try {
			setState(3083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3063);
				tableAllColumns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(3064);
				expression(0);
				setState(3081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					{
					setState(3066);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==KW_AS) {
						{
						setState(3065);
						match(KW_AS);
						}
					}

					setState(3068);
					identifier();
					}
					}
					break;
				case 2:
					{
					{
					setState(3069);
					match(KW_AS);
					setState(3070);
					match(LPAREN);
					setState(3071);
					identifier();
					setState(3076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3072);
						match(COMMA);
						setState(3073);
						identifier();
						}
						}
						setState(3078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3079);
					match(RPAREN);
					}
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrfmClauseContext extends ParserRuleContext {
		public TerminalNode KW_USING() { return getToken(HiveParser.KW_USING, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_MAP() { return getToken(HiveParser.KW_MAP, 0); }
		public SelectExpressionListContext selectExpressionList() {
			return getRuleContext(SelectExpressionListContext.class,0);
		}
		public TerminalNode KW_REDUCE() { return getToken(HiveParser.KW_REDUCE, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public RecordWriterContext recordWriter() {
			return getRuleContext(RecordWriterContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public RecordReaderContext recordReader() {
			return getRuleContext(RecordReaderContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public AliasListContext aliasList() {
			return getRuleContext(AliasListContext.class,0);
		}
		public ColumnNameTypeListContext columnNameTypeList() {
			return getRuleContext(ColumnNameTypeListContext.class,0);
		}
		public TrfmClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trfmClause; }
	}

	public final TrfmClauseContext trfmClause() throws RecognitionException {
		TrfmClauseContext _localctx = new TrfmClauseContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_trfmClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3089);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MAP:
				{
				setState(3085);
				match(KW_MAP);
				setState(3086);
				selectExpressionList();
				}
				break;
			case KW_REDUCE:
				{
				setState(3087);
				match(KW_REDUCE);
				setState(3088);
				selectExpressionList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(3092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW) {
				{
				setState(3091);
				rowFormat();
				}
			}

			setState(3095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RECORDWRITER) {
				{
				setState(3094);
				recordWriter();
				}
			}

			setState(3097);
			match(KW_USING);
			setState(3098);
			match(StringLiteral);
			setState(3113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(3099);
				match(KW_AS);
				setState(3111);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					{
					setState(3100);
					match(LPAREN);
					setState(3103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
					case 1:
						{
						setState(3101);
						aliasList();
						}
						break;
					case 2:
						{
						setState(3102);
						columnNameTypeList();
						}
						break;
					}
					setState(3105);
					match(RPAREN);
					}
					}
					break;
				case KW_ASC:
				case KW_DESC:
				case KW_NULLS:
				case KW_LAST:
				case KW_OVERWRITE:
				case KW_PARTITIONS:
				case KW_TABLES:
				case KW_COLUMNS:
				case KW_INDEX:
				case KW_INDEXES:
				case KW_REBUILD:
				case KW_FUNCTIONS:
				case KW_SHOW:
				case KW_MSCK:
				case KW_REPAIR:
				case KW_DIRECTORY:
				case KW_CLUSTER:
				case KW_DISTRIBUTE:
				case KW_SORT:
				case KW_LOAD:
				case KW_EXPORT:
				case KW_REPLICATION:
				case KW_METADATA:
				case KW_DATA:
				case KW_INPATH:
				case KW_CHANGE:
				case KW_FIRST:
				case KW_AFTER:
				case KW_RENAME:
				case KW_COMMENT:
				case KW_TINYINT:
				case KW_DATETIME:
				case KW_ZONE:
				case KW_STRING:
				case KW_STRUCT:
				case KW_UNIONTYPE:
				case KW_PARTITIONED:
				case KW_CLUSTERED:
				case KW_SORTED:
				case KW_BUCKETS:
				case KW_FORMAT:
				case KW_DELIMITED:
				case KW_FIELDS:
				case KW_TERMINATED:
				case KW_ESCAPED:
				case KW_COLLECTION:
				case KW_ITEMS:
				case KW_KEYS:
				case KW_KEY_TYPE:
				case KW_KILL:
				case KW_LINES:
				case KW_STORED:
				case KW_FILEFORMAT:
				case KW_INPUTFORMAT:
				case KW_OUTPUTFORMAT:
				case KW_INPUTDRIVER:
				case KW_OUTPUTDRIVER:
				case KW_ENABLE:
				case KW_DISABLE:
				case KW_LOCATION:
				case KW_BUCKET:
				case KW_ADD:
				case KW_REPLACE:
				case KW_TEMPORARY:
				case KW_FILE:
				case KW_JAR:
				case KW_EXPLAIN:
				case KW_FORMATTED:
				case KW_DEPENDENCY:
				case KW_LOGICAL:
				case KW_SERDE:
				case KW_DEFERRED:
				case KW_SERDEPROPERTIES:
				case KW_DBPROPERTIES:
				case KW_LIMIT:
				case KW_OFFSET:
				case KW_UNSET:
				case KW_TBLPROPERTIES:
				case KW_IDXPROPERTIES:
				case KW_VALUE_TYPE:
				case KW_ELEM_TYPE:
				case KW_DEFINED:
				case KW_MAPJOIN:
				case KW_STREAMTABLE:
				case KW_CLUSTERSTATUS:
				case KW_UTC:
				case KW_UTCTIMESTAMP:
				case KW_LONG:
				case KW_PLUS:
				case KW_VIEW:
				case KW_VIEWS:
				case KW_DATABASES:
				case KW_MATERIALIZED:
				case KW_SCHEMA:
				case KW_SCHEMAS:
				case KW_SSL:
				case KW_UNDO:
				case KW_LOCK:
				case KW_LOCKS:
				case KW_UNLOCK:
				case KW_SHARED:
				case KW_EXCLUSIVE:
				case KW_UNSIGNED:
				case KW_WHILE:
				case KW_READ:
				case KW_PURGE:
				case KW_ANALYZE:
				case KW_BEFORE:
				case KW_CONTINUE:
				case KW_RECORDREADER:
				case KW_RECORDWRITER:
				case KW_SEMI:
				case KW_TOUCH:
				case KW_ARCHIVE:
				case KW_UNARCHIVE:
				case KW_COMPUTE:
				case KW_STATISTICS:
				case KW_USE:
				case KW_OPTION:
				case KW_CONCATENATE:
				case KW_SHOW_DATABASE:
				case KW_RESTRICT:
				case KW_CASCADE:
				case KW_SKEWED:
				case KW_DIRECTORIES:
				case KW_SETS:
				case KW_NOSCAN:
				case KW_ROLE:
				case KW_ROLES:
				case KW_URI:
				case KW_SERVER:
				case KW_ADMIN:
				case KW_OWNER:
				case KW_PRINCIPALS:
				case KW_COMPACT:
				case KW_COMPACTIONS:
				case KW_TRANSACTIONS:
				case KW_REWRITE:
				case KW_REOPTIMIZATION:
				case KW_RELOAD:
				case KW_YEAR:
				case KW_QUERY:
				case KW_QUARTER:
				case KW_MONTH:
				case KW_WEEK:
				case KW_DAY:
				case KW_DOW:
				case KW_HOUR:
				case KW_MINUTE:
				case KW_SECOND:
				case KW_TRANSACTION:
				case KW_WORK:
				case KW_WRITE:
				case KW_ISOLATION:
				case KW_LEVEL:
				case KW_SNAPSHOT:
				case KW_AUTOCOMMIT:
				case KW_CACHE:
				case KW_ENFORCED:
				case KW_VALIDATE:
				case KW_NOVALIDATE:
				case KW_RELY:
				case KW_NORELY:
				case KW_KEY:
				case KW_ABORT:
				case KW_MATCHED:
				case KW_REPL:
				case KW_DUMP:
				case KW_STATUS:
				case KW_VECTORIZATION:
				case KW_SUMMARY:
				case KW_OPERATOR:
				case KW_EXPRESSION:
				case KW_DETAIL:
				case KW_WAIT:
				case KW_RESOURCE:
				case KW_PLAN:
				case KW_QUERY_PARALLELISM:
				case KW_PLANS:
				case KW_ACTIVATE:
				case KW_DEFAULT:
				case KW_CHECK:
				case KW_POOL:
				case KW_MOVE:
				case KW_DO:
				case KW_ALLOC_FRACTION:
				case KW_SCHEDULING_POLICY:
				case KW_PATH:
				case KW_MAPPING:
				case KW_WORKLOAD:
				case KW_MANAGEMENT:
				case KW_ACTIVE:
				case KW_UNMANAGED:
				case Identifier:
					{
					setState(3109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
					case 1:
						{
						setState(3107);
						aliasList();
						}
						break;
					case 2:
						{
						setState(3108);
						columnNameTypeList();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ROW) {
				{
				setState(3115);
				rowFormat();
				}
			}

			setState(3119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_RECORDREADER) {
				{
				setState(3118);
				recordReader();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionContext extends ParserRuleContext {
		public TableAllColumnsContext tableAllColumns() {
			return getRuleContext(TableAllColumnsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_selectExpression);
		try {
			setState(3123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3121);
				tableAllColumns();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3122);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExpressionListContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public SelectExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpressionList; }
	}

	public final SelectExpressionListContext selectExpressionList() throws RecognitionException {
		SelectExpressionListContext _localctx = new SelectExpressionListContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_selectExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3125);
			selectExpression();
			setState(3130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3126);
				match(COMMA);
				setState(3127);
				selectExpression();
				}
				}
				setState(3132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_clauseContext extends ParserRuleContext {
		public TerminalNode KW_WINDOW() { return getToken(HiveParser.KW_WINDOW, 0); }
		public List<Window_defnContext> window_defn() {
			return getRuleContexts(Window_defnContext.class);
		}
		public Window_defnContext window_defn(int i) {
			return getRuleContext(Window_defnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public Window_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_clause; }
	}

	public final Window_clauseContext window_clause() throws RecognitionException {
		Window_clauseContext _localctx = new Window_clauseContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_window_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3133);
			match(KW_WINDOW);
			setState(3134);
			window_defn();
			setState(3139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3135);
				match(COMMA);
				setState(3136);
				window_defn();
				}
				}
				setState(3141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_defnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public Window_specificationContext window_specification() {
			return getRuleContext(Window_specificationContext.class,0);
		}
		public Window_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_defn; }
	}

	public final Window_defnContext window_defn() throws RecognitionException {
		Window_defnContext _localctx = new Window_defnContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_window_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3142);
			identifier();
			setState(3143);
			match(KW_AS);
			setState(3144);
			window_specification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_specificationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public PartitioningSpecContext partitioningSpec() {
			return getRuleContext(PartitioningSpecContext.class,0);
		}
		public Window_frameContext window_frame() {
			return getRuleContext(Window_frameContext.class,0);
		}
		public Window_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_specification; }
	}

	public final Window_specificationContext window_specification() throws RecognitionException {
		Window_specificationContext _localctx = new Window_specificationContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_window_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				{
				setState(3146);
				identifier();
				}
				break;
			case LPAREN:
				{
				{
				setState(3147);
				match(LPAREN);
				setState(3149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
				case 1:
					{
					setState(3148);
					identifier();
					}
					break;
				}
				setState(3152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ORDER) | (1L << KW_PARTITION) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT))) != 0)) {
					{
					setState(3151);
					partitioningSpec();
					}
				}

				setState(3155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ROWS || _la==KW_RANGE) {
					{
					setState(3154);
					window_frame();
					}
				}

				setState(3157);
				match(RPAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frameContext extends ParserRuleContext {
		public Window_range_expressionContext window_range_expression() {
			return getRuleContext(Window_range_expressionContext.class,0);
		}
		public Window_value_expressionContext window_value_expression() {
			return getRuleContext(Window_value_expressionContext.class,0);
		}
		public Window_frameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame; }
	}

	public final Window_frameContext window_frame() throws RecognitionException {
		Window_frameContext _localctx = new Window_frameContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_window_frame);
		try {
			setState(3162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ROWS:
				enterOuterAlt(_localctx, 1);
				{
				setState(3160);
				window_range_expression();
				}
				break;
			case KW_RANGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3161);
				window_value_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_range_expressionContext extends ParserRuleContext {
		public TerminalNode KW_ROWS() { return getToken(HiveParser.KW_ROWS, 0); }
		public Window_frame_start_boundaryContext window_frame_start_boundary() {
			return getRuleContext(Window_frame_start_boundaryContext.class,0);
		}
		public TerminalNode KW_BETWEEN() { return getToken(HiveParser.KW_BETWEEN, 0); }
		public List<Window_frame_boundaryContext> window_frame_boundary() {
			return getRuleContexts(Window_frame_boundaryContext.class);
		}
		public Window_frame_boundaryContext window_frame_boundary(int i) {
			return getRuleContext(Window_frame_boundaryContext.class,i);
		}
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public Window_range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_range_expression; }
	}

	public final Window_range_expressionContext window_range_expression() throws RecognitionException {
		Window_range_expressionContext _localctx = new Window_range_expressionContext(_ctx, getState());
		enterRule(_localctx, 524, RULE_window_range_expression);
		try {
			setState(3172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3164);
				match(KW_ROWS);
				setState(3165);
				window_frame_start_boundary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3166);
				match(KW_ROWS);
				setState(3167);
				match(KW_BETWEEN);
				setState(3168);
				window_frame_boundary();
				setState(3169);
				match(KW_AND);
				setState(3170);
				window_frame_boundary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_value_expressionContext extends ParserRuleContext {
		public TerminalNode KW_RANGE() { return getToken(HiveParser.KW_RANGE, 0); }
		public Window_frame_start_boundaryContext window_frame_start_boundary() {
			return getRuleContext(Window_frame_start_boundaryContext.class,0);
		}
		public TerminalNode KW_BETWEEN() { return getToken(HiveParser.KW_BETWEEN, 0); }
		public List<Window_frame_boundaryContext> window_frame_boundary() {
			return getRuleContexts(Window_frame_boundaryContext.class);
		}
		public Window_frame_boundaryContext window_frame_boundary(int i) {
			return getRuleContext(Window_frame_boundaryContext.class,i);
		}
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public Window_value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_value_expression; }
	}

	public final Window_value_expressionContext window_value_expression() throws RecognitionException {
		Window_value_expressionContext _localctx = new Window_value_expressionContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_window_value_expression);
		try {
			setState(3182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3174);
				match(KW_RANGE);
				setState(3175);
				window_frame_start_boundary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3176);
				match(KW_RANGE);
				setState(3177);
				match(KW_BETWEEN);
				setState(3178);
				window_frame_boundary();
				setState(3179);
				match(KW_AND);
				setState(3180);
				window_frame_boundary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_start_boundaryContext extends ParserRuleContext {
		public TerminalNode KW_UNBOUNDED() { return getToken(HiveParser.KW_UNBOUNDED, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(HiveParser.KW_PRECEDING, 0); }
		public TerminalNode KW_CURRENT() { return getToken(HiveParser.KW_CURRENT, 0); }
		public TerminalNode KW_ROW() { return getToken(HiveParser.KW_ROW, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public Window_frame_start_boundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_start_boundary; }
	}

	public final Window_frame_start_boundaryContext window_frame_start_boundary() throws RecognitionException {
		Window_frame_start_boundaryContext _localctx = new Window_frame_start_boundaryContext(_ctx, getState());
		enterRule(_localctx, 528, RULE_window_frame_start_boundary);
		try {
			setState(3190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(3184);
				match(KW_UNBOUNDED);
				setState(3185);
				match(KW_PRECEDING);
				}
				break;
			case KW_CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186);
				match(KW_CURRENT);
				setState(3187);
				match(KW_ROW);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(3188);
				match(Number);
				setState(3189);
				match(KW_PRECEDING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_frame_boundaryContext extends ParserRuleContext {
		public TerminalNode KW_UNBOUNDED() { return getToken(HiveParser.KW_UNBOUNDED, 0); }
		public TerminalNode KW_PRECEDING() { return getToken(HiveParser.KW_PRECEDING, 0); }
		public TerminalNode KW_FOLLOWING() { return getToken(HiveParser.KW_FOLLOWING, 0); }
		public TerminalNode KW_CURRENT() { return getToken(HiveParser.KW_CURRENT, 0); }
		public TerminalNode KW_ROW() { return getToken(HiveParser.KW_ROW, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public Window_frame_boundaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_frame_boundary; }
	}

	public final Window_frame_boundaryContext window_frame_boundary() throws RecognitionException {
		Window_frame_boundaryContext _localctx = new Window_frame_boundaryContext(_ctx, getState());
		enterRule(_localctx, 530, RULE_window_frame_boundary);
		int _la;
		try {
			setState(3198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNBOUNDED:
				enterOuterAlt(_localctx, 1);
				{
				setState(3192);
				match(KW_UNBOUNDED);
				setState(3193);
				_la = _input.LA(1);
				if ( !(_la==KW_PRECEDING || _la==KW_FOLLOWING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KW_CURRENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3194);
				match(KW_CURRENT);
				setState(3195);
				match(KW_ROW);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 3);
				{
				setState(3196);
				match(Number);
				setState(3197);
				_la = _input.LA(1);
				if ( !(_la==KW_PRECEDING || _la==KW_FOLLOWING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAllColumnsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(HiveParser.STAR, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public TableAllColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAllColumns; }
	}

	public final TableAllColumnsContext tableAllColumns() throws RecognitionException {
		TableAllColumnsContext _localctx = new TableAllColumnsContext(_ctx, getState());
		enterRule(_localctx, 532, RULE_tableAllColumns);
		try {
			setState(3205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(3200);
				match(STAR);
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3201);
				tableName();
				setState(3202);
				match(DOT);
				setState(3203);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOrColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableOrColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOrColumn; }
	}

	public final TableOrColumnContext tableOrColumn() throws RecognitionException {
		TableOrColumnContext _localctx = new TableOrColumnContext(_ctx, getState());
		enterRule(_localctx, 534, RULE_tableOrColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3207);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 536, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3209);
			expression(0);
			setState(3214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3210);
				match(COMMA);
				setState(3211);
				expression(0);
				}
				}
				setState(3216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public AliasListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasList; }
	}

	public final AliasListContext aliasList() throws RecognitionException {
		AliasListContext _localctx = new AliasListContext(_ctx, getState());
		enterRule(_localctx, 538, RULE_aliasList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3217);
			identifier();
			setState(3222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3218);
					match(COMMA);
					setState(3219);
					identifier();
					}
					} 
				}
				setState(3224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public FromSourceContext fromSource() {
			return getRuleContext(FromSourceContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 540, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3225);
			match(KW_FROM);
			setState(3226);
			fromSource();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSourceContext extends ParserRuleContext {
		public UniqueJoinTokenContext uniqueJoinToken() {
			return getRuleContext(UniqueJoinTokenContext.class,0);
		}
		public List<UniqueJoinSourceContext> uniqueJoinSource() {
			return getRuleContexts(UniqueJoinSourceContext.class);
		}
		public UniqueJoinSourceContext uniqueJoinSource(int i) {
			return getRuleContext(UniqueJoinSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public JoinSourceContext joinSource() {
			return getRuleContext(JoinSourceContext.class,0);
		}
		public FromSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSource; }
	}

	public final FromSourceContext fromSource() throws RecognitionException {
		FromSourceContext _localctx = new FromSourceContext(_ctx, getState());
		enterRule(_localctx, 542, RULE_fromSource);
		int _la;
		try {
			setState(3237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_UNIQUEJOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(3228);
				uniqueJoinToken();
				setState(3229);
				uniqueJoinSource();
				setState(3232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3230);
					match(COMMA);
					setState(3231);
					uniqueJoinSource();
					}
					}
					setState(3234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLE:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(3236);
				joinSource();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomjoinSourceContext extends ParserRuleContext {
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public VirtualTableSourceContext virtualTableSource() {
			return getRuleContext(VirtualTableSourceContext.class,0);
		}
		public SubQuerySourceContext subQuerySource() {
			return getRuleContext(SubQuerySourceContext.class,0);
		}
		public PartitionedTableFunctionContext partitionedTableFunction() {
			return getRuleContext(PartitionedTableFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public JoinSourceContext joinSource() {
			return getRuleContext(JoinSourceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public AtomjoinSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomjoinSource; }
	}

	public final AtomjoinSourceContext atomjoinSource() throws RecognitionException {
		AtomjoinSourceContext _localctx = new AtomjoinSourceContext(_ctx, getState());
		enterRule(_localctx, 544, RULE_atomjoinSource);
		try {
			int _alt;
			setState(3271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3239);
				tableSource();
				setState(3243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3240);
						lateralView();
						}
						} 
					}
					setState(3245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3246);
				virtualTableSource();
				setState(3250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3247);
						lateralView();
						}
						} 
					}
					setState(3252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3253);
				subQuerySource();
				setState(3257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,393,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3254);
						lateralView();
						}
						} 
					}
					setState(3259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,393,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3260);
				partitionedTableFunction();
				setState(3264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3261);
						lateralView();
						}
						} 
					}
					setState(3266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,394,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3267);
				match(LPAREN);
				setState(3268);
				joinSource();
				setState(3269);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSourceContext extends ParserRuleContext {
		public AtomjoinSourceContext atomjoinSource() {
			return getRuleContext(AtomjoinSourceContext.class,0);
		}
		public List<JoinTokenContext> joinToken() {
			return getRuleContexts(JoinTokenContext.class);
		}
		public JoinTokenContext joinToken(int i) {
			return getRuleContext(JoinTokenContext.class,i);
		}
		public List<JoinSourcePartContext> joinSourcePart() {
			return getRuleContexts(JoinSourcePartContext.class);
		}
		public JoinSourcePartContext joinSourcePart(int i) {
			return getRuleContext(JoinSourcePartContext.class,i);
		}
		public List<TerminalNode> KW_ON() { return getTokens(HiveParser.KW_ON); }
		public TerminalNode KW_ON(int i) {
			return getToken(HiveParser.KW_ON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> KW_USING() { return getTokens(HiveParser.KW_USING); }
		public TerminalNode KW_USING(int i) {
			return getToken(HiveParser.KW_USING, i);
		}
		public List<ColumnParenthesesListContext> columnParenthesesList() {
			return getRuleContexts(ColumnParenthesesListContext.class);
		}
		public ColumnParenthesesListContext columnParenthesesList(int i) {
			return getRuleContext(ColumnParenthesesListContext.class,i);
		}
		public JoinSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSource; }
	}

	public final JoinSourceContext joinSource() throws RecognitionException {
		JoinSourceContext _localctx = new JoinSourceContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_joinSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3273);
			atomjoinSource();
			setState(3284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_JOIN) | (1L << KW_LEFT) | (1L << KW_RIGHT) | (1L << KW_FULL))) != 0) || _la==KW_CROSS || _la==KW_INNER || _la==COMMA) {
				{
				{
				setState(3274);
				joinToken();
				setState(3275);
				joinSourcePart();
				setState(3280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_ON:
					{
					setState(3276);
					match(KW_ON);
					setState(3277);
					expression(0);
					}
					break;
				case KW_USING:
					{
					setState(3278);
					match(KW_USING);
					setState(3279);
					columnParenthesesList();
					}
					break;
				case EOF:
				case KW_DESC:
				case KW_ORDER:
				case KW_GROUP:
				case KW_HAVING:
				case KW_WHERE:
				case KW_FROM:
				case KW_SELECT:
				case KW_INSERT:
				case KW_JOIN:
				case KW_LEFT:
				case KW_RIGHT:
				case KW_FULL:
				case KW_SHOW:
				case KW_MSCK:
				case KW_CLUSTER:
				case KW_DISTRIBUTE:
				case KW_SORT:
				case KW_UNION:
				case KW_EXCEPT:
				case KW_LOAD:
				case KW_EXPORT:
				case KW_IMPORT:
				case KW_CREATE:
				case KW_ALTER:
				case KW_DESCRIBE:
				case KW_DROP:
				case KW_MAP:
				case KW_REDUCE:
				case KW_KILL:
				case KW_EXPLAIN:
				case KW_WITH:
				case KW_LIMIT:
				case KW_SET:
				case KW_DELETE:
				case KW_MINUS:
				case KW_INTERSECT:
				case KW_GRANT:
				case KW_REVOKE:
				case KW_LOCK:
				case KW_UNLOCK:
				case KW_ANALYZE:
				case KW_CROSS:
				case KW_USE:
				case KW_UPDATE:
				case KW_WINDOW:
				case KW_TRUNCATE:
				case KW_INNER:
				case KW_RELOAD:
				case KW_START:
				case KW_COMMIT:
				case KW_ROLLBACK:
				case KW_ABORT:
				case KW_MERGE:
				case KW_REPL:
				case COMMA:
				case SEMICOLON:
				case LPAREN:
				case RPAREN:
					break;
				default:
					break;
				}
				}
				}
				setState(3286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSourcePartContext extends ParserRuleContext {
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public VirtualTableSourceContext virtualTableSource() {
			return getRuleContext(VirtualTableSourceContext.class,0);
		}
		public SubQuerySourceContext subQuerySource() {
			return getRuleContext(SubQuerySourceContext.class,0);
		}
		public PartitionedTableFunctionContext partitionedTableFunction() {
			return getRuleContext(PartitionedTableFunctionContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public JoinSourcePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSourcePart; }
	}

	public final JoinSourcePartContext joinSourcePart() throws RecognitionException {
		JoinSourcePartContext _localctx = new JoinSourcePartContext(_ctx, getState());
		enterRule(_localctx, 548, RULE_joinSourcePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(3287);
				tableSource();
				}
				break;
			case 2:
				{
				setState(3288);
				virtualTableSource();
				}
				break;
			case 3:
				{
				setState(3289);
				subQuerySource();
				}
				break;
			case 4:
				{
				setState(3290);
				partitionedTableFunction();
				}
				break;
			}
			setState(3296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3293);
					lateralView();
					}
					} 
				}
				setState(3298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,399,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueJoinSourceContext extends ParserRuleContext {
		public UniqueJoinTableSourceContext uniqueJoinTableSource() {
			return getRuleContext(UniqueJoinTableSourceContext.class,0);
		}
		public UniqueJoinExprContext uniqueJoinExpr() {
			return getRuleContext(UniqueJoinExprContext.class,0);
		}
		public TerminalNode KW_PRESERVE() { return getToken(HiveParser.KW_PRESERVE, 0); }
		public UniqueJoinSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueJoinSource; }
	}

	public final UniqueJoinSourceContext uniqueJoinSource() throws RecognitionException {
		UniqueJoinSourceContext _localctx = new UniqueJoinSourceContext(_ctx, getState());
		enterRule(_localctx, 550, RULE_uniqueJoinSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PRESERVE) {
				{
				setState(3299);
				match(KW_PRESERVE);
				}
			}

			setState(3302);
			uniqueJoinTableSource();
			setState(3303);
			uniqueJoinExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueJoinExprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public UniqueJoinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueJoinExpr; }
	}

	public final UniqueJoinExprContext uniqueJoinExpr() throws RecognitionException {
		UniqueJoinExprContext _localctx = new UniqueJoinExprContext(_ctx, getState());
		enterRule(_localctx, 552, RULE_uniqueJoinExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3305);
			match(LPAREN);
			setState(3306);
			expressionList();
			setState(3307);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueJoinTokenContext extends ParserRuleContext {
		public TerminalNode KW_UNIQUEJOIN() { return getToken(HiveParser.KW_UNIQUEJOIN, 0); }
		public UniqueJoinTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueJoinToken; }
	}

	public final UniqueJoinTokenContext uniqueJoinToken() throws RecognitionException {
		UniqueJoinTokenContext _localctx = new UniqueJoinTokenContext(_ctx, getState());
		enterRule(_localctx, 554, RULE_uniqueJoinToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3309);
			match(KW_UNIQUEJOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTokenContext extends ParserRuleContext {
		public TerminalNode KW_JOIN() { return getToken(HiveParser.KW_JOIN, 0); }
		public TerminalNode KW_INNER() { return getToken(HiveParser.KW_INNER, 0); }
		public TerminalNode COMMA() { return getToken(HiveParser.COMMA, 0); }
		public TerminalNode KW_CROSS() { return getToken(HiveParser.KW_CROSS, 0); }
		public TerminalNode KW_LEFT() { return getToken(HiveParser.KW_LEFT, 0); }
		public TerminalNode KW_OUTER() { return getToken(HiveParser.KW_OUTER, 0); }
		public TerminalNode KW_RIGHT() { return getToken(HiveParser.KW_RIGHT, 0); }
		public TerminalNode KW_FULL() { return getToken(HiveParser.KW_FULL, 0); }
		public TerminalNode KW_SEMI() { return getToken(HiveParser.KW_SEMI, 0); }
		public JoinTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinToken; }
	}

	public final JoinTokenContext joinToken() throws RecognitionException {
		JoinTokenContext _localctx = new JoinTokenContext(_ctx, getState());
		enterRule(_localctx, 556, RULE_joinToken);
		int _la;
		try {
			setState(3335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3311);
				match(KW_JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3312);
				match(KW_INNER);
				setState(3313);
				match(KW_JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3314);
				match(COMMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3315);
				match(KW_CROSS);
				setState(3316);
				match(KW_JOIN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3317);
				match(KW_LEFT);
				setState(3319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_OUTER) {
					{
					setState(3318);
					match(KW_OUTER);
					}
				}

				setState(3321);
				match(KW_JOIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3322);
				match(KW_RIGHT);
				setState(3324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_OUTER) {
					{
					setState(3323);
					match(KW_OUTER);
					}
				}

				setState(3326);
				match(KW_JOIN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3327);
				match(KW_FULL);
				setState(3329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_OUTER) {
					{
					setState(3328);
					match(KW_OUTER);
					}
				}

				setState(3331);
				match(KW_JOIN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3332);
				match(KW_LEFT);
				setState(3333);
				match(KW_SEMI);
				setState(3334);
				match(KW_JOIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public TerminalNode KW_LATERAL() { return getToken(HiveParser.KW_LATERAL, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public TerminalNode KW_OUTER() { return getToken(HiveParser.KW_OUTER, 0); }
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 558, RULE_lateralView);
		int _la;
		try {
			int _alt;
			setState(3396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3337);
				match(KW_LATERAL);
				setState(3338);
				match(KW_VIEW);
				setState(3339);
				match(KW_OUTER);
				setState(3340);
				function_();
				setState(3341);
				tableAlias();
				setState(3351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(3342);
					match(KW_AS);
					setState(3343);
					identifier();
					setState(3348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3344);
							match(COMMA);
							setState(3345);
							identifier();
							}
							} 
						}
						setState(3350);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,405,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3353);
					match(COMMA);
					}
				}

				setState(3356);
				match(KW_LATERAL);
				setState(3357);
				match(KW_VIEW);
				setState(3358);
				function_();
				setState(3359);
				tableAlias();
				setState(3369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(3360);
					match(KW_AS);
					setState(3361);
					identifier();
					setState(3366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(3362);
							match(COMMA);
							setState(3363);
							identifier();
							}
							} 
						}
						setState(3368);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(3371);
					match(COMMA);
					}
				}

				setState(3374);
				match(KW_LATERAL);
				setState(3375);
				match(KW_TABLE);
				setState(3376);
				match(LPAREN);
				setState(3377);
				valuesClause();
				setState(3378);
				match(RPAREN);
				setState(3380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(3379);
					match(KW_AS);
					}
				}

				setState(3382);
				tableAlias();
				setState(3394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(3383);
					match(LPAREN);
					setState(3384);
					identifier();
					setState(3389);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3385);
						match(COMMA);
						setState(3386);
						identifier();
						}
						}
						setState(3391);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3392);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 560, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3398);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableBucketSampleContext extends ParserRuleContext {
		public TerminalNode KW_TABLESAMPLE() { return getToken(HiveParser.KW_TABLESAMPLE, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode KW_BUCKET() { return getToken(HiveParser.KW_BUCKET, 0); }
		public List<TerminalNode> Number() { return getTokens(HiveParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(HiveParser.Number, i);
		}
		public TerminalNode KW_OUT() { return getToken(HiveParser.KW_OUT, 0); }
		public TerminalNode KW_OF() { return getToken(HiveParser.KW_OF, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public TableBucketSampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableBucketSample; }
	}

	public final TableBucketSampleContext tableBucketSample() throws RecognitionException {
		TableBucketSampleContext _localctx = new TableBucketSampleContext(_ctx, getState());
		enterRule(_localctx, 562, RULE_tableBucketSample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3400);
			match(KW_TABLESAMPLE);
			setState(3401);
			match(LPAREN);
			setState(3402);
			match(KW_BUCKET);
			setState(3403);
			match(Number);
			setState(3404);
			match(KW_OUT);
			setState(3405);
			match(KW_OF);
			setState(3406);
			match(Number);
			setState(3416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ON) {
				{
				setState(3407);
				match(KW_ON);
				setState(3408);
				expression(0);
				setState(3413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3409);
					match(COMMA);
					setState(3410);
					expression(0);
					}
					}
					setState(3415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3418);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SplitSampleContext extends ParserRuleContext {
		public TerminalNode KW_TABLESAMPLE() { return getToken(HiveParser.KW_TABLESAMPLE, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_PERCENT() { return getToken(HiveParser.KW_PERCENT, 0); }
		public TerminalNode KW_ROWS() { return getToken(HiveParser.KW_ROWS, 0); }
		public TerminalNode ByteLengthLiteral() { return getToken(HiveParser.ByteLengthLiteral, 0); }
		public SplitSampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitSample; }
	}

	public final SplitSampleContext splitSample() throws RecognitionException {
		SplitSampleContext _localctx = new SplitSampleContext(_ctx, getState());
		enterRule(_localctx, 564, RULE_splitSample);
		int _la;
		try {
			setState(3429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3420);
				match(KW_TABLESAMPLE);
				setState(3421);
				match(LPAREN);
				setState(3422);
				match(Number);
				setState(3423);
				_la = _input.LA(1);
				if ( !(_la==KW_ROWS || _la==KW_PERCENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3424);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3425);
				match(KW_TABLESAMPLE);
				setState(3426);
				match(LPAREN);
				setState(3427);
				match(ByteLengthLiteral);
				setState(3428);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSampleContext extends ParserRuleContext {
		public TableBucketSampleContext tableBucketSample() {
			return getRuleContext(TableBucketSampleContext.class,0);
		}
		public SplitSampleContext splitSample() {
			return getRuleContext(SplitSampleContext.class,0);
		}
		public TableSampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSample; }
	}

	public final TableSampleContext tableSample() throws RecognitionException {
		TableSampleContext _localctx = new TableSampleContext(_ctx, getState());
		enterRule(_localctx, 566, RULE_tableSample);
		try {
			setState(3433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3431);
				tableBucketSample();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3432);
				splitSample();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TableSampleContext tableSample() {
			return getRuleContext(TableSampleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 568, RULE_tableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3435);
			tableName();
			setState(3437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,419,_ctx) ) {
			case 1:
				{
				setState(3436);
				tableProperties();
				}
				break;
			}
			setState(3440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TABLESAMPLE) {
				{
				setState(3439);
				tableSample();
				}
			}

			setState(3446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
			case 1:
				{
				setState(3443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(3442);
					match(KW_AS);
					}
				}

				setState(3445);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueJoinTableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableSampleContext tableSample() {
			return getRuleContext(TableSampleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public UniqueJoinTableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueJoinTableSource; }
	}

	public final UniqueJoinTableSourceContext uniqueJoinTableSource() throws RecognitionException {
		UniqueJoinTableSourceContext _localctx = new UniqueJoinTableSourceContext(_ctx, getState());
		enterRule(_localctx, 570, RULE_uniqueJoinTableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3448);
			tableName();
			setState(3450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TABLESAMPLE) {
				{
				setState(3449);
				tableSample();
				}
			}

			setState(3456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_AS) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (KW_CHANGE - 68)) | (1L << (KW_FIRST - 68)) | (1L << (KW_AFTER - 68)) | (1L << (KW_RENAME - 68)) | (1L << (KW_COMMENT - 68)) | (1L << (KW_TINYINT - 68)) | (1L << (KW_DATETIME - 68)) | (1L << (KW_ZONE - 68)) | (1L << (KW_STRING - 68)) | (1L << (KW_STRUCT - 68)) | (1L << (KW_UNIONTYPE - 68)) | (1L << (KW_PARTITIONED - 68)) | (1L << (KW_CLUSTERED - 68)) | (1L << (KW_SORTED - 68)) | (1L << (KW_BUCKETS - 68)) | (1L << (KW_FORMAT - 68)) | (1L << (KW_DELIMITED - 68)) | (1L << (KW_FIELDS - 68)) | (1L << (KW_TERMINATED - 68)) | (1L << (KW_ESCAPED - 68)) | (1L << (KW_COLLECTION - 68)) | (1L << (KW_ITEMS - 68)) | (1L << (KW_KEYS - 68)) | (1L << (KW_KEY_TYPE - 68)) | (1L << (KW_KILL - 68)) | (1L << (KW_LINES - 68)) | (1L << (KW_STORED - 68)) | (1L << (KW_FILEFORMAT - 68)) | (1L << (KW_INPUTFORMAT - 68)) | (1L << (KW_OUTPUTFORMAT - 68)) | (1L << (KW_INPUTDRIVER - 68)) | (1L << (KW_OUTPUTDRIVER - 68)) | (1L << (KW_ENABLE - 68)) | (1L << (KW_DISABLE - 68)) | (1L << (KW_LOCATION - 68)) | (1L << (KW_BUCKET - 68)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (KW_ADD - 134)) | (1L << (KW_REPLACE - 134)) | (1L << (KW_TEMPORARY - 134)) | (1L << (KW_FILE - 134)) | (1L << (KW_JAR - 134)) | (1L << (KW_EXPLAIN - 134)) | (1L << (KW_FORMATTED - 134)) | (1L << (KW_DEPENDENCY - 134)) | (1L << (KW_LOGICAL - 134)) | (1L << (KW_SERDE - 134)) | (1L << (KW_DEFERRED - 134)) | (1L << (KW_SERDEPROPERTIES - 134)) | (1L << (KW_DBPROPERTIES - 134)) | (1L << (KW_LIMIT - 134)) | (1L << (KW_OFFSET - 134)) | (1L << (KW_UNSET - 134)) | (1L << (KW_TBLPROPERTIES - 134)) | (1L << (KW_IDXPROPERTIES - 134)) | (1L << (KW_VALUE_TYPE - 134)) | (1L << (KW_ELEM_TYPE - 134)) | (1L << (KW_DEFINED - 134)) | (1L << (KW_MAPJOIN - 134)) | (1L << (KW_STREAMTABLE - 134)) | (1L << (KW_CLUSTERSTATUS - 134)) | (1L << (KW_UTC - 134)) | (1L << (KW_UTCTIMESTAMP - 134)) | (1L << (KW_LONG - 134)) | (1L << (KW_PLUS - 134)) | (1L << (KW_VIEW - 134)) | (1L << (KW_VIEWS - 134)) | (1L << (KW_DATABASES - 134)) | (1L << (KW_MATERIALIZED - 134)) | (1L << (KW_SCHEMA - 134)) | (1L << (KW_SCHEMAS - 134)) | (1L << (KW_SSL - 134)) | (1L << (KW_UNDO - 134)) | (1L << (KW_LOCK - 134)) | (1L << (KW_LOCKS - 134)) | (1L << (KW_UNLOCK - 134)) | (1L << (KW_SHARED - 134)) | (1L << (KW_EXCLUSIVE - 134)) | (1L << (KW_UNSIGNED - 134)) | (1L << (KW_WHILE - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (KW_READ - 198)) | (1L << (KW_PURGE - 198)) | (1L << (KW_ANALYZE - 198)) | (1L << (KW_BEFORE - 198)) | (1L << (KW_CONTINUE - 198)) | (1L << (KW_RECORDREADER - 198)) | (1L << (KW_RECORDWRITER - 198)) | (1L << (KW_SEMI - 198)) | (1L << (KW_TOUCH - 198)) | (1L << (KW_ARCHIVE - 198)) | (1L << (KW_UNARCHIVE - 198)) | (1L << (KW_COMPUTE - 198)) | (1L << (KW_STATISTICS - 198)) | (1L << (KW_USE - 198)) | (1L << (KW_OPTION - 198)) | (1L << (KW_CONCATENATE - 198)) | (1L << (KW_SHOW_DATABASE - 198)) | (1L << (KW_RESTRICT - 198)) | (1L << (KW_CASCADE - 198)) | (1L << (KW_SKEWED - 198)) | (1L << (KW_DIRECTORIES - 198)) | (1L << (KW_SETS - 198)) | (1L << (KW_NOSCAN - 198)) | (1L << (KW_ROLE - 198)) | (1L << (KW_ROLES - 198)) | (1L << (KW_URI - 198)) | (1L << (KW_SERVER - 198)) | (1L << (KW_ADMIN - 198)) | (1L << (KW_OWNER - 198)) | (1L << (KW_PRINCIPALS - 198)) | (1L << (KW_COMPACT - 198)) | (1L << (KW_COMPACTIONS - 198)) | (1L << (KW_TRANSACTIONS - 198)) | (1L << (KW_REWRITE - 198)) | (1L << (KW_REOPTIMIZATION - 198)))) != 0) || ((((_la - 264)) & ~0x3f) == 0 && ((1L << (_la - 264)) & ((1L << (KW_RELOAD - 264)) | (1L << (KW_YEAR - 264)) | (1L << (KW_QUERY - 264)) | (1L << (KW_QUARTER - 264)) | (1L << (KW_MONTH - 264)) | (1L << (KW_WEEK - 264)) | (1L << (KW_DAY - 264)) | (1L << (KW_DOW - 264)) | (1L << (KW_HOUR - 264)) | (1L << (KW_MINUTE - 264)) | (1L << (KW_SECOND - 264)) | (1L << (KW_TRANSACTION - 264)) | (1L << (KW_WORK - 264)) | (1L << (KW_WRITE - 264)) | (1L << (KW_ISOLATION - 264)) | (1L << (KW_LEVEL - 264)) | (1L << (KW_SNAPSHOT - 264)) | (1L << (KW_AUTOCOMMIT - 264)) | (1L << (KW_CACHE - 264)) | (1L << (KW_ENFORCED - 264)) | (1L << (KW_VALIDATE - 264)) | (1L << (KW_NOVALIDATE - 264)) | (1L << (KW_RELY - 264)) | (1L << (KW_NORELY - 264)) | (1L << (KW_KEY - 264)) | (1L << (KW_ABORT - 264)) | (1L << (KW_MATCHED - 264)) | (1L << (KW_REPL - 264)) | (1L << (KW_DUMP - 264)) | (1L << (KW_STATUS - 264)) | (1L << (KW_VECTORIZATION - 264)) | (1L << (KW_SUMMARY - 264)) | (1L << (KW_OPERATOR - 264)) | (1L << (KW_EXPRESSION - 264)) | (1L << (KW_DETAIL - 264)) | (1L << (KW_WAIT - 264)) | (1L << (KW_RESOURCE - 264)) | (1L << (KW_PLAN - 264)) | (1L << (KW_QUERY_PARALLELISM - 264)) | (1L << (KW_PLANS - 264)) | (1L << (KW_ACTIVATE - 264)) | (1L << (KW_DEFAULT - 264)) | (1L << (KW_CHECK - 264)) | (1L << (KW_POOL - 264)) | (1L << (KW_MOVE - 264)) | (1L << (KW_DO - 264)) | (1L << (KW_ALLOC_FRACTION - 264)) | (1L << (KW_SCHEDULING_POLICY - 264)) | (1L << (KW_PATH - 264)) | (1L << (KW_MAPPING - 264)) | (1L << (KW_WORKLOAD - 264)) | (1L << (KW_MANAGEMENT - 264)))) != 0) || ((((_la - 328)) & ~0x3f) == 0 && ((1L << (_la - 328)) & ((1L << (KW_ACTIVE - 328)) | (1L << (KW_UNMANAGED - 328)) | (1L << (Identifier - 328)))) != 0)) {
				{
				setState(3453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(3452);
					match(KW_AS);
					}
				}

				setState(3455);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 572, RULE_tableName);
		try {
			setState(3463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3458);
				identifier();
				setState(3459);
				match(DOT);
				setState(3460);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3462);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 574, RULE_viewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
			case 1:
				{
				setState(3465);
				identifier();
				setState(3466);
				match(DOT);
				}
				break;
			}
			setState(3470);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQuerySourceContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public QueryStatementExpressionContext queryStatementExpression() {
			return getRuleContext(QueryStatementExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public SubQuerySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQuerySource; }
	}

	public final SubQuerySourceContext subQuerySource() throws RecognitionException {
		SubQuerySourceContext _localctx = new SubQuerySourceContext(_ctx, getState());
		enterRule(_localctx, 576, RULE_subQuerySource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3472);
			match(LPAREN);
			setState(3473);
			queryStatementExpression();
			setState(3474);
			match(RPAREN);
			setState(3476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(3475);
				match(KW_AS);
				}
			}

			setState(3478);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitioningSpecContext extends ParserRuleContext {
		public PartitionByClauseContext partitionByClause() {
			return getRuleContext(PartitionByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public DistributeByClauseContext distributeByClause() {
			return getRuleContext(DistributeByClauseContext.class,0);
		}
		public SortByClauseContext sortByClause() {
			return getRuleContext(SortByClauseContext.class,0);
		}
		public ClusterByClauseContext clusterByClause() {
			return getRuleContext(ClusterByClauseContext.class,0);
		}
		public PartitioningSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitioningSpec; }
	}

	public final PartitioningSpecContext partitioningSpec() throws RecognitionException {
		PartitioningSpecContext _localctx = new PartitioningSpecContext(_ctx, getState());
		enterRule(_localctx, 578, RULE_partitioningSpec);
		int _la;
		try {
			setState(3491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_PARTITION:
				enterOuterAlt(_localctx, 1);
				{
				setState(3480);
				partitionByClause();
				setState(3482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ORDER) {
					{
					setState(3481);
					orderByClause();
					}
				}

				}
				break;
			case KW_ORDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3484);
				orderByClause();
				}
				break;
			case KW_DISTRIBUTE:
				enterOuterAlt(_localctx, 3);
				{
				setState(3485);
				distributeByClause();
				setState(3487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_SORT) {
					{
					setState(3486);
					sortByClause();
					}
				}

				}
				break;
			case KW_SORT:
				enterOuterAlt(_localctx, 4);
				{
				setState(3489);
				sortByClause();
				}
				break;
			case KW_CLUSTER:
				enterOuterAlt(_localctx, 5);
				{
				setState(3490);
				clusterByClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionTableFunctionSourceContext extends ParserRuleContext {
		public SubQuerySourceContext subQuerySource() {
			return getRuleContext(SubQuerySourceContext.class,0);
		}
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public PartitionedTableFunctionContext partitionedTableFunction() {
			return getRuleContext(PartitionedTableFunctionContext.class,0);
		}
		public PartitionTableFunctionSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionTableFunctionSource; }
	}

	public final PartitionTableFunctionSourceContext partitionTableFunctionSource() throws RecognitionException {
		PartitionTableFunctionSourceContext _localctx = new PartitionTableFunctionSourceContext(_ctx, getState());
		enterRule(_localctx, 580, RULE_partitionTableFunctionSource);
		try {
			setState(3496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3493);
				subQuerySource();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3494);
				tableSource();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3495);
				partitionedTableFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionedTableFunctionContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public TerminalNode KW_ON() { return getToken(HiveParser.KW_ON, 0); }
		public PartitionTableFunctionSourceContext partitionTableFunctionSource() {
			return getRuleContext(PartitionTableFunctionSourceContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public PartitioningSpecContext partitioningSpec() {
			return getRuleContext(PartitioningSpecContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(HiveParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(HiveParser.Identifier, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public PartitionedTableFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionedTableFunction; }
	}

	public final PartitionedTableFunctionContext partitionedTableFunction() throws RecognitionException {
		PartitionedTableFunctionContext _localctx = new PartitionedTableFunctionContext(_ctx, getState());
		enterRule(_localctx, 582, RULE_partitionedTableFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3498);
			identifier();
			setState(3499);
			match(LPAREN);
			setState(3500);
			match(KW_ON);
			setState(3501);
			partitionTableFunctionSource();
			setState(3503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_ORDER) | (1L << KW_PARTITION) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT))) != 0)) {
				{
				setState(3502);
				partitioningSpec();
				}
			}

			setState(3520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(3505);
				match(Identifier);
				setState(3506);
				match(LPAREN);
				setState(3507);
				expression(0);
				setState(3508);
				match(RPAREN);
				setState(3517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3509);
					match(COMMA);
					setState(3510);
					match(Identifier);
					setState(3511);
					match(LPAREN);
					setState(3512);
					expression(0);
					setState(3513);
					match(RPAREN);
					}
					}
					setState(3519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3522);
			match(RPAREN);
			setState(3524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
			case 1:
				{
				setState(3523);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(HiveParser.KW_WHERE, 0); }
		public SearchConditionContext searchCondition() {
			return getRuleContext(SearchConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 584, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3526);
			match(KW_WHERE);
			setState(3527);
			searchCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchCondition; }
	}

	public final SearchConditionContext searchCondition() throws RecognitionException {
		SearchConditionContext _localctx = new SearchConditionContext(_ctx, getState());
		enterRule(_localctx, 586, RULE_searchCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3529);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesClauseContext extends ParserRuleContext {
		public TerminalNode KW_VALUES() { return getToken(HiveParser.KW_VALUES, 0); }
		public ValuesTableConstructorContext valuesTableConstructor() {
			return getRuleContext(ValuesTableConstructorContext.class,0);
		}
		public ValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesClause; }
	}

	public final ValuesClauseContext valuesClause() throws RecognitionException {
		ValuesClauseContext _localctx = new ValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 588, RULE_valuesClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3531);
			match(KW_VALUES);
			setState(3532);
			valuesTableConstructor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesTableConstructorContext extends ParserRuleContext {
		public List<ValueRowConstructorContext> valueRowConstructor() {
			return getRuleContexts(ValueRowConstructorContext.class);
		}
		public ValueRowConstructorContext valueRowConstructor(int i) {
			return getRuleContext(ValueRowConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ValuesTableConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesTableConstructor; }
	}

	public final ValuesTableConstructorContext valuesTableConstructor() throws RecognitionException {
		ValuesTableConstructorContext _localctx = new ValuesTableConstructorContext(_ctx, getState());
		enterRule(_localctx, 590, RULE_valuesTableConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3534);
			valueRowConstructor();
			setState(3539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3535);
				match(COMMA);
				setState(3536);
				valueRowConstructor();
				}
				}
				setState(3541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueRowConstructorContext extends ParserRuleContext {
		public ExpressionsInParenthesisContext expressionsInParenthesis() {
			return getRuleContext(ExpressionsInParenthesisContext.class,0);
		}
		public ValueRowConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueRowConstructor; }
	}

	public final ValueRowConstructorContext valueRowConstructor() throws RecognitionException {
		ValueRowConstructorContext _localctx = new ValueRowConstructorContext(_ctx, getState());
		enterRule(_localctx, 592, RULE_valueRowConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3542);
			expressionsInParenthesis();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtualTableSourceContext extends ParserRuleContext {
		public TerminalNode KW_TABLE() { return getToken(HiveParser.KW_TABLE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(HiveParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HiveParser.LPAREN, i);
		}
		public ValuesClauseContext valuesClause() {
			return getRuleContext(ValuesClauseContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HiveParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HiveParser.RPAREN, i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public VirtualTableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualTableSource; }
	}

	public final VirtualTableSourceContext virtualTableSource() throws RecognitionException {
		VirtualTableSourceContext _localctx = new VirtualTableSourceContext(_ctx, getState());
		enterRule(_localctx, 594, RULE_virtualTableSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3544);
			match(KW_TABLE);
			setState(3545);
			match(LPAREN);
			setState(3546);
			valuesClause();
			setState(3547);
			match(RPAREN);
			setState(3549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(3548);
				match(KW_AS);
				}
			}

			setState(3551);
			tableAlias();
			setState(3561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3552);
				match(LPAREN);
				setState(3553);
				identifier();
				setState(3558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3554);
					match(COMMA);
					setState(3555);
					identifier();
					}
					}
					setState(3560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(3563);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode KW_GROUP() { return getToken(HiveParser.KW_GROUP, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public Groupby_expressionContext groupby_expression() {
			return getRuleContext(Groupby_expressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 596, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3565);
			match(KW_GROUP);
			setState(3566);
			match(KW_BY);
			setState(3567);
			groupby_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Groupby_expressionContext extends ParserRuleContext {
		public RollupStandardContext rollupStandard() {
			return getRuleContext(RollupStandardContext.class,0);
		}
		public RollupOldSyntaxContext rollupOldSyntax() {
			return getRuleContext(RollupOldSyntaxContext.class,0);
		}
		public GroupByEmptyContext groupByEmpty() {
			return getRuleContext(GroupByEmptyContext.class,0);
		}
		public Groupby_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_expression; }
	}

	public final Groupby_expressionContext groupby_expression() throws RecognitionException {
		Groupby_expressionContext _localctx = new Groupby_expressionContext(_ctx, getState());
		enterRule(_localctx, 598, RULE_groupby_expression);
		try {
			setState(3572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3569);
				rollupStandard();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3570);
				rollupOldSyntax();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3571);
				groupByEmpty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByEmptyContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public GroupByEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByEmpty; }
	}

	public final GroupByEmptyContext groupByEmpty() throws RecognitionException {
		GroupByEmptyContext _localctx = new GroupByEmptyContext(_ctx, getState());
		enterRule(_localctx, 600, RULE_groupByEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3574);
			match(LPAREN);
			setState(3575);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupStandardContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_ROLLUP() { return getToken(HiveParser.KW_ROLLUP, 0); }
		public TerminalNode KW_CUBE() { return getToken(HiveParser.KW_CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public RollupStandardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupStandard; }
	}

	public final RollupStandardContext rollupStandard() throws RecognitionException {
		RollupStandardContext _localctx = new RollupStandardContext(_ctx, getState());
		enterRule(_localctx, 602, RULE_rollupStandard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3577);
			_la = _input.LA(1);
			if ( !(_la==KW_ROLLUP || _la==KW_CUBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3578);
			match(LPAREN);
			setState(3579);
			expression(0);
			setState(3584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3580);
				match(COMMA);
				setState(3581);
				expression(0);
				}
				}
				setState(3586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3587);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollupOldSyntaxContext extends ParserRuleContext {
		public ExpressionsNotInParenthesisContext expressionsNotInParenthesis() {
			return getRuleContext(ExpressionsNotInParenthesisContext.class,0);
		}
		public TerminalNode KW_WITH() { return getToken(HiveParser.KW_WITH, 0); }
		public TerminalNode KW_ROLLUP() { return getToken(HiveParser.KW_ROLLUP, 0); }
		public TerminalNode KW_CUBE() { return getToken(HiveParser.KW_CUBE, 0); }
		public TerminalNode KW_GROUPING() { return getToken(HiveParser.KW_GROUPING, 0); }
		public TerminalNode KW_SETS() { return getToken(HiveParser.KW_SETS, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<GroupingSetExpressionContext> groupingSetExpression() {
			return getRuleContexts(GroupingSetExpressionContext.class);
		}
		public GroupingSetExpressionContext groupingSetExpression(int i) {
			return getRuleContext(GroupingSetExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public RollupOldSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollupOldSyntax; }
	}

	public final RollupOldSyntaxContext rollupOldSyntax() throws RecognitionException {
		RollupOldSyntaxContext _localctx = new RollupOldSyntaxContext(_ctx, getState());
		enterRule(_localctx, 604, RULE_rollupOldSyntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3589);
			expressionsNotInParenthesis();
			setState(3594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				{
				setState(3590);
				match(KW_WITH);
				setState(3591);
				match(KW_ROLLUP);
				}
				break;
			case 2:
				{
				setState(3592);
				match(KW_WITH);
				setState(3593);
				match(KW_CUBE);
				}
				break;
			}
			setState(3609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_GROUPING) {
				{
				setState(3596);
				match(KW_GROUPING);
				setState(3597);
				match(KW_SETS);
				setState(3598);
				match(LPAREN);
				setState(3599);
				groupingSetExpression();
				setState(3604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(3600);
					match(COMMA);
					setState(3601);
					groupingSetExpression();
					}
					}
					setState(3606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3607);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetExpressionContext extends ParserRuleContext {
		public GroupingSetExpressionMultipleContext groupingSetExpressionMultiple() {
			return getRuleContext(GroupingSetExpressionMultipleContext.class,0);
		}
		public GroupingExpressionSingleContext groupingExpressionSingle() {
			return getRuleContext(GroupingExpressionSingleContext.class,0);
		}
		public GroupingSetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSetExpression; }
	}

	public final GroupingSetExpressionContext groupingSetExpression() throws RecognitionException {
		GroupingSetExpressionContext _localctx = new GroupingSetExpressionContext(_ctx, getState());
		enterRule(_localctx, 606, RULE_groupingSetExpression);
		try {
			setState(3613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3611);
				groupingSetExpressionMultiple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3612);
				groupingExpressionSingle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetExpressionMultipleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public GroupingSetExpressionMultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSetExpressionMultiple; }
	}

	public final GroupingSetExpressionMultipleContext groupingSetExpressionMultiple() throws RecognitionException {
		GroupingSetExpressionMultipleContext _localctx = new GroupingSetExpressionMultipleContext(_ctx, getState());
		enterRule(_localctx, 608, RULE_groupingSetExpressionMultiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3615);
			match(LPAREN);
			setState(3617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_NOT) | (1L << KW_IF) | (1L << KW_EXISTS) | (1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_NULL - 64)) | (1L << (KW_CHANGE - 64)) | (1L << (KW_FIRST - 64)) | (1L << (KW_AFTER - 64)) | (1L << (KW_RENAME - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_TINYINT - 64)) | (1L << (KW_SMALLINT - 64)) | (1L << (KW_INT - 64)) | (1L << (KW_BIGINT - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_DATE - 64)) | (1L << (KW_DATETIME - 64)) | (1L << (KW_TIMESTAMP - 64)) | (1L << (KW_TIMESTAMPLOCALTZ - 64)) | (1L << (KW_ZONE - 64)) | (1L << (KW_INTERVAL - 64)) | (1L << (KW_STRING - 64)) | (1L << (KW_ARRAY - 64)) | (1L << (KW_STRUCT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_UNIONTYPE - 64)) | (1L << (KW_PARTITIONED - 64)) | (1L << (KW_CLUSTERED - 64)) | (1L << (KW_SORTED - 64)) | (1L << (KW_BUCKETS - 64)) | (1L << (KW_FORMAT - 64)) | (1L << (KW_DELIMITED - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_TERMINATED - 64)) | (1L << (KW_ESCAPED - 64)) | (1L << (KW_COLLECTION - 64)) | (1L << (KW_ITEMS - 64)) | (1L << (KW_KEYS - 64)) | (1L << (KW_KEY_TYPE - 64)) | (1L << (KW_KILL - 64)) | (1L << (KW_LINES - 64)) | (1L << (KW_STORED - 64)) | (1L << (KW_FILEFORMAT - 64)) | (1L << (KW_INPUTFORMAT - 64)) | (1L << (KW_OUTPUTFORMAT - 64)) | (1L << (KW_INPUTDRIVER - 64)) | (1L << (KW_OUTPUTDRIVER - 64)) | (1L << (KW_ENABLE - 64)) | (1L << (KW_DISABLE - 64)) | (1L << (KW_LOCATION - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KW_BUCKET - 129)) | (1L << (KW_CAST - 129)) | (1L << (KW_ADD - 129)) | (1L << (KW_REPLACE - 129)) | (1L << (KW_TEMPORARY - 129)) | (1L << (KW_FILE - 129)) | (1L << (KW_JAR - 129)) | (1L << (KW_EXPLAIN - 129)) | (1L << (KW_FORMATTED - 129)) | (1L << (KW_DEPENDENCY - 129)) | (1L << (KW_LOGICAL - 129)) | (1L << (KW_SERDE - 129)) | (1L << (KW_DEFERRED - 129)) | (1L << (KW_SERDEPROPERTIES - 129)) | (1L << (KW_DBPROPERTIES - 129)) | (1L << (KW_LIMIT - 129)) | (1L << (KW_OFFSET - 129)) | (1L << (KW_UNSET - 129)) | (1L << (KW_TBLPROPERTIES - 129)) | (1L << (KW_IDXPROPERTIES - 129)) | (1L << (KW_VALUE_TYPE - 129)) | (1L << (KW_ELEM_TYPE - 129)) | (1L << (KW_DEFINED - 129)) | (1L << (KW_CASE - 129)) | (1L << (KW_MAPJOIN - 129)) | (1L << (KW_STREAMTABLE - 129)) | (1L << (KW_CLUSTERSTATUS - 129)) | (1L << (KW_UTC - 129)) | (1L << (KW_UTCTIMESTAMP - 129)) | (1L << (KW_LONG - 129)) | (1L << (KW_PLUS - 129)) | (1L << (KW_VIEW - 129)) | (1L << (KW_VIEWS - 129)) | (1L << (KW_DATABASES - 129)) | (1L << (KW_MATERIALIZED - 129)) | (1L << (KW_SCHEMA - 129)) | (1L << (KW_SCHEMAS - 129)) | (1L << (KW_SSL - 129)) | (1L << (KW_UNDO - 129)) | (1L << (KW_LOCK - 129)) | (1L << (KW_LOCKS - 129)) | (1L << (KW_UNLOCK - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (KW_SHARED - 193)) | (1L << (KW_EXCLUSIVE - 193)) | (1L << (KW_UNSIGNED - 193)) | (1L << (KW_WHILE - 193)) | (1L << (KW_READ - 193)) | (1L << (KW_PURGE - 193)) | (1L << (KW_ANALYZE - 193)) | (1L << (KW_BEFORE - 193)) | (1L << (KW_BINARY - 193)) | (1L << (KW_CONTINUE - 193)) | (1L << (KW_RECORDREADER - 193)) | (1L << (KW_RECORDWRITER - 193)) | (1L << (KW_SEMI - 193)) | (1L << (KW_TOUCH - 193)) | (1L << (KW_ARCHIVE - 193)) | (1L << (KW_UNARCHIVE - 193)) | (1L << (KW_COMPUTE - 193)) | (1L << (KW_STATISTICS - 193)) | (1L << (KW_USE - 193)) | (1L << (KW_OPTION - 193)) | (1L << (KW_CONCATENATE - 193)) | (1L << (KW_SHOW_DATABASE - 193)) | (1L << (KW_RESTRICT - 193)) | (1L << (KW_CASCADE - 193)) | (1L << (KW_SKEWED - 193)) | (1L << (KW_DIRECTORIES - 193)) | (1L << (KW_CURRENT_DATE - 193)) | (1L << (KW_CURRENT_TIMESTAMP - 193)) | (1L << (KW_GROUPING - 193)) | (1L << (KW_SETS - 193)) | (1L << (KW_NOSCAN - 193)) | (1L << (KW_ROLE - 193)) | (1L << (KW_ROLES - 193)) | (1L << (KW_URI - 193)) | (1L << (KW_SERVER - 193)) | (1L << (KW_ADMIN - 193)) | (1L << (KW_OWNER - 193)) | (1L << (KW_PRINCIPALS - 193)) | (1L << (KW_COMPACT - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (KW_COMPACTIONS - 257)) | (1L << (KW_TRANSACTIONS - 257)) | (1L << (KW_REWRITE - 257)) | (1L << (KW_REOPTIMIZATION - 257)) | (1L << (KW_RELOAD - 257)) | (1L << (KW_YEAR - 257)) | (1L << (KW_QUERY - 257)) | (1L << (KW_QUARTER - 257)) | (1L << (KW_MONTH - 257)) | (1L << (KW_WEEK - 257)) | (1L << (KW_DAY - 257)) | (1L << (KW_DOW - 257)) | (1L << (KW_HOUR - 257)) | (1L << (KW_MINUTE - 257)) | (1L << (KW_SECOND - 257)) | (1L << (KW_TRANSACTION - 257)) | (1L << (KW_WORK - 257)) | (1L << (KW_WRITE - 257)) | (1L << (KW_ISOLATION - 257)) | (1L << (KW_LEVEL - 257)) | (1L << (KW_SNAPSHOT - 257)) | (1L << (KW_AUTOCOMMIT - 257)) | (1L << (KW_CACHE - 257)) | (1L << (KW_ENFORCED - 257)) | (1L << (KW_VALIDATE - 257)) | (1L << (KW_NOVALIDATE - 257)) | (1L << (KW_RELY - 257)) | (1L << (KW_NORELY - 257)) | (1L << (KW_KEY - 257)) | (1L << (KW_ABORT - 257)) | (1L << (KW_EXTRACT - 257)) | (1L << (KW_FLOOR - 257)) | (1L << (KW_MATCHED - 257)) | (1L << (KW_REPL - 257)) | (1L << (KW_DUMP - 257)) | (1L << (KW_STATUS - 257)) | (1L << (KW_VECTORIZATION - 257)) | (1L << (KW_SUMMARY - 257)) | (1L << (KW_OPERATOR - 257)) | (1L << (KW_EXPRESSION - 257)) | (1L << (KW_DETAIL - 257)) | (1L << (KW_WAIT - 257)) | (1L << (KW_RESOURCE - 257)) | (1L << (KW_PLAN - 257)) | (1L << (KW_QUERY_PARALLELISM - 257)) | (1L << (KW_PLANS - 257)) | (1L << (KW_ACTIVATE - 257)) | (1L << (KW_DEFAULT - 257)) | (1L << (KW_CHECK - 257)) | (1L << (KW_POOL - 257)) | (1L << (KW_MOVE - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (KW_DO - 321)) | (1L << (KW_ALLOC_FRACTION - 321)) | (1L << (KW_SCHEDULING_POLICY - 321)) | (1L << (KW_PATH - 321)) | (1L << (KW_MAPPING - 321)) | (1L << (KW_WORKLOAD - 321)) | (1L << (KW_MANAGEMENT - 321)) | (1L << (KW_ACTIVE - 321)) | (1L << (KW_UNMANAGED - 321)) | (1L << (LPAREN - 321)) | (1L << (PLUS - 321)) | (1L << (MINUS - 321)) | (1L << (TILDE - 321)) | (1L << (StringLiteral - 321)) | (1L << (IntegralLiteral - 321)) | (1L << (NumberLiteral - 321)) | (1L << (Number - 321)) | (1L << (Identifier - 321)) | (1L << (CharSetName - 321)))) != 0)) {
				{
				setState(3616);
				expression(0);
				}
			}

			setState(3623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3619);
				match(COMMA);
				setState(3620);
				expression(0);
				}
				}
				setState(3625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3626);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingExpressionSingleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupingExpressionSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpressionSingle; }
	}

	public final GroupingExpressionSingleContext groupingExpressionSingle() throws RecognitionException {
		GroupingExpressionSingleContext _localctx = new GroupingExpressionSingleContext(_ctx, getState());
		enterRule(_localctx, 610, RULE_groupingExpressionSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3628);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode KW_HAVING() { return getToken(HiveParser.KW_HAVING, 0); }
		public HavingConditionContext havingCondition() {
			return getRuleContext(HavingConditionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 612, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3630);
			match(KW_HAVING);
			setState(3631);
			havingCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingCondition; }
	}

	public final HavingConditionContext havingCondition() throws RecognitionException {
		HavingConditionContext _localctx = new HavingConditionContext(_ctx, getState());
		enterRule(_localctx, 614, RULE_havingCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3633);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsInParenthesisContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ExpressionsNotInParenthesisContext expressionsNotInParenthesis() {
			return getRuleContext(ExpressionsNotInParenthesisContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ExpressionsInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsInParenthesis; }
	}

	public final ExpressionsInParenthesisContext expressionsInParenthesis() throws RecognitionException {
		ExpressionsInParenthesisContext _localctx = new ExpressionsInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 616, RULE_expressionsInParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3635);
			match(LPAREN);
			setState(3636);
			expressionsNotInParenthesis();
			setState(3637);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsNotInParenthesisContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPartContext expressionPart() {
			return getRuleContext(ExpressionPartContext.class,0);
		}
		public ExpressionsNotInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsNotInParenthesis; }
	}

	public final ExpressionsNotInParenthesisContext expressionsNotInParenthesis() throws RecognitionException {
		ExpressionsNotInParenthesisContext _localctx = new ExpressionsNotInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 618, RULE_expressionsNotInParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3639);
			expression(0);
			setState(3641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(3640);
				expressionPart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPartContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPart; }
	}

	public final ExpressionPartContext expressionPart() throws RecognitionException {
		ExpressionPartContext _localctx = new ExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 620, RULE_expressionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3643);
				match(COMMA);
				setState(3644);
				expression(0);
				}
				}
				setState(3647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionsInParenthesisContext expressionsInParenthesis() {
			return getRuleContext(ExpressionsInParenthesisContext.class,0);
		}
		public ExpressionsNotInParenthesisContext expressionsNotInParenthesis() {
			return getRuleContext(ExpressionsNotInParenthesisContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 622, RULE_expressions);
		try {
			setState(3651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3649);
				expressionsInParenthesis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3650);
				expressionsNotInParenthesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnRefOrderInParenthesisContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<ColumnRefOrderContext> columnRefOrder() {
			return getRuleContexts(ColumnRefOrderContext.class);
		}
		public ColumnRefOrderContext columnRefOrder(int i) {
			return getRuleContext(ColumnRefOrderContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnRefOrderInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRefOrderInParenthesis; }
	}

	public final ColumnRefOrderInParenthesisContext columnRefOrderInParenthesis() throws RecognitionException {
		ColumnRefOrderInParenthesisContext _localctx = new ColumnRefOrderInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 624, RULE_columnRefOrderInParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3653);
			match(LPAREN);
			setState(3654);
			columnRefOrder();
			setState(3659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3655);
				match(COMMA);
				setState(3656);
				columnRefOrder();
				}
				}
				setState(3661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3662);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnRefOrderNotInParenthesisContext extends ParserRuleContext {
		public List<ColumnRefOrderContext> columnRefOrder() {
			return getRuleContexts(ColumnRefOrderContext.class);
		}
		public ColumnRefOrderContext columnRefOrder(int i) {
			return getRuleContext(ColumnRefOrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public ColumnRefOrderNotInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRefOrderNotInParenthesis; }
	}

	public final ColumnRefOrderNotInParenthesisContext columnRefOrderNotInParenthesis() throws RecognitionException {
		ColumnRefOrderNotInParenthesisContext _localctx = new ColumnRefOrderNotInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 626, RULE_columnRefOrderNotInParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3664);
			columnRefOrder();
			setState(3669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3665);
				match(COMMA);
				setState(3666);
				columnRefOrder();
				}
				}
				setState(3671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode KW_ORDER() { return getToken(HiveParser.KW_ORDER, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public List<ColumnRefOrderContext> columnRefOrder() {
			return getRuleContexts(ColumnRefOrderContext.class);
		}
		public ColumnRefOrderContext columnRefOrder(int i) {
			return getRuleContext(ColumnRefOrderContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 628, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3672);
			match(KW_ORDER);
			setState(3673);
			match(KW_BY);
			setState(3674);
			columnRefOrder();
			setState(3679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3675);
				match(COMMA);
				setState(3676);
				columnRefOrder();
				}
				}
				setState(3681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusterByClauseContext extends ParserRuleContext {
		public TerminalNode KW_CLUSTER() { return getToken(HiveParser.KW_CLUSTER, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ClusterByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterByClause; }
	}

	public final ClusterByClauseContext clusterByClause() throws RecognitionException {
		ClusterByClauseContext _localctx = new ClusterByClauseContext(_ctx, getState());
		enterRule(_localctx, 630, RULE_clusterByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3682);
			match(KW_CLUSTER);
			setState(3683);
			match(KW_BY);
			setState(3684);
			expressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionByClauseContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(HiveParser.KW_PARTITION, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public PartitionByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionByClause; }
	}

	public final PartitionByClauseContext partitionByClause() throws RecognitionException {
		PartitionByClauseContext _localctx = new PartitionByClauseContext(_ctx, getState());
		enterRule(_localctx, 632, RULE_partitionByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3686);
			match(KW_PARTITION);
			setState(3687);
			match(KW_BY);
			setState(3688);
			expressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistributeByClauseContext extends ParserRuleContext {
		public TerminalNode KW_DISTRIBUTE() { return getToken(HiveParser.KW_DISTRIBUTE, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public DistributeByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributeByClause; }
	}

	public final DistributeByClauseContext distributeByClause() throws RecognitionException {
		DistributeByClauseContext _localctx = new DistributeByClauseContext(_ctx, getState());
		enterRule(_localctx, 634, RULE_distributeByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3690);
			match(KW_DISTRIBUTE);
			setState(3691);
			match(KW_BY);
			setState(3692);
			expressions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortByClauseContext extends ParserRuleContext {
		public TerminalNode KW_SORT() { return getToken(HiveParser.KW_SORT, 0); }
		public TerminalNode KW_BY() { return getToken(HiveParser.KW_BY, 0); }
		public ColumnRefOrderInParenthesisContext columnRefOrderInParenthesis() {
			return getRuleContext(ColumnRefOrderInParenthesisContext.class,0);
		}
		public ColumnRefOrderNotInParenthesisContext columnRefOrderNotInParenthesis() {
			return getRuleContext(ColumnRefOrderNotInParenthesisContext.class,0);
		}
		public SortByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortByClause; }
	}

	public final SortByClauseContext sortByClause() throws RecognitionException {
		SortByClauseContext _localctx = new SortByClauseContext(_ctx, getState());
		enterRule(_localctx, 636, RULE_sortByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3694);
			match(KW_SORT);
			setState(3695);
			match(KW_BY);
			setState(3698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,455,_ctx) ) {
			case 1:
				{
				setState(3696);
				columnRefOrderInParenthesis();
				}
				break;
			case 2:
				{
				setState(3697);
				columnRefOrderNotInParenthesis();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_Context extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode STAR() { return getToken(HiveParser.STAR, 0); }
		public TerminalNode KW_OVER() { return getToken(HiveParser.KW_OVER, 0); }
		public Window_specificationContext window_specification() {
			return getRuleContext(Window_specificationContext.class,0);
		}
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public TerminalNode KW_DISTINCT() { return getToken(HiveParser.KW_DISTINCT, 0); }
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 638, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3700);
			functionName();
			setState(3701);
			match(LPAREN);
			setState(3716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,459,_ctx) ) {
			case 1:
				{
				setState(3702);
				match(STAR);
				}
				break;
			case 2:
				{
				setState(3704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ALL || _la==KW_DISTINCT) {
					{
					setState(3703);
					_la = _input.LA(1);
					if ( !(_la==KW_ALL || _la==KW_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(3714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_NOT) | (1L << KW_IF) | (1L << KW_EXISTS) | (1L << KW_ASC) | (1L << KW_DESC) | (1L << KW_NULLS) | (1L << KW_LAST) | (1L << KW_OVERWRITE) | (1L << KW_PARTITIONS) | (1L << KW_TABLES) | (1L << KW_COLUMNS) | (1L << KW_INDEX) | (1L << KW_INDEXES) | (1L << KW_REBUILD) | (1L << KW_FUNCTIONS) | (1L << KW_SHOW) | (1L << KW_MSCK) | (1L << KW_REPAIR) | (1L << KW_DIRECTORY) | (1L << KW_CLUSTER) | (1L << KW_DISTRIBUTE) | (1L << KW_SORT) | (1L << KW_LOAD) | (1L << KW_EXPORT) | (1L << KW_REPLICATION) | (1L << KW_METADATA) | (1L << KW_DATA) | (1L << KW_INPATH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_NULL - 64)) | (1L << (KW_CHANGE - 64)) | (1L << (KW_FIRST - 64)) | (1L << (KW_AFTER - 64)) | (1L << (KW_RENAME - 64)) | (1L << (KW_COMMENT - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_TINYINT - 64)) | (1L << (KW_SMALLINT - 64)) | (1L << (KW_INT - 64)) | (1L << (KW_BIGINT - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_DATE - 64)) | (1L << (KW_DATETIME - 64)) | (1L << (KW_TIMESTAMP - 64)) | (1L << (KW_TIMESTAMPLOCALTZ - 64)) | (1L << (KW_ZONE - 64)) | (1L << (KW_INTERVAL - 64)) | (1L << (KW_STRING - 64)) | (1L << (KW_ARRAY - 64)) | (1L << (KW_STRUCT - 64)) | (1L << (KW_MAP - 64)) | (1L << (KW_UNIONTYPE - 64)) | (1L << (KW_PARTITIONED - 64)) | (1L << (KW_CLUSTERED - 64)) | (1L << (KW_SORTED - 64)) | (1L << (KW_BUCKETS - 64)) | (1L << (KW_FORMAT - 64)) | (1L << (KW_DELIMITED - 64)) | (1L << (KW_FIELDS - 64)) | (1L << (KW_TERMINATED - 64)) | (1L << (KW_ESCAPED - 64)) | (1L << (KW_COLLECTION - 64)) | (1L << (KW_ITEMS - 64)) | (1L << (KW_KEYS - 64)) | (1L << (KW_KEY_TYPE - 64)) | (1L << (KW_KILL - 64)) | (1L << (KW_LINES - 64)) | (1L << (KW_STORED - 64)) | (1L << (KW_FILEFORMAT - 64)) | (1L << (KW_INPUTFORMAT - 64)) | (1L << (KW_OUTPUTFORMAT - 64)) | (1L << (KW_INPUTDRIVER - 64)) | (1L << (KW_OUTPUTDRIVER - 64)) | (1L << (KW_ENABLE - 64)) | (1L << (KW_DISABLE - 64)) | (1L << (KW_LOCATION - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KW_BUCKET - 129)) | (1L << (KW_CAST - 129)) | (1L << (KW_ADD - 129)) | (1L << (KW_REPLACE - 129)) | (1L << (KW_TEMPORARY - 129)) | (1L << (KW_FILE - 129)) | (1L << (KW_JAR - 129)) | (1L << (KW_EXPLAIN - 129)) | (1L << (KW_FORMATTED - 129)) | (1L << (KW_DEPENDENCY - 129)) | (1L << (KW_LOGICAL - 129)) | (1L << (KW_SERDE - 129)) | (1L << (KW_DEFERRED - 129)) | (1L << (KW_SERDEPROPERTIES - 129)) | (1L << (KW_DBPROPERTIES - 129)) | (1L << (KW_LIMIT - 129)) | (1L << (KW_OFFSET - 129)) | (1L << (KW_UNSET - 129)) | (1L << (KW_TBLPROPERTIES - 129)) | (1L << (KW_IDXPROPERTIES - 129)) | (1L << (KW_VALUE_TYPE - 129)) | (1L << (KW_ELEM_TYPE - 129)) | (1L << (KW_DEFINED - 129)) | (1L << (KW_CASE - 129)) | (1L << (KW_MAPJOIN - 129)) | (1L << (KW_STREAMTABLE - 129)) | (1L << (KW_CLUSTERSTATUS - 129)) | (1L << (KW_UTC - 129)) | (1L << (KW_UTCTIMESTAMP - 129)) | (1L << (KW_LONG - 129)) | (1L << (KW_PLUS - 129)) | (1L << (KW_VIEW - 129)) | (1L << (KW_VIEWS - 129)) | (1L << (KW_DATABASES - 129)) | (1L << (KW_MATERIALIZED - 129)) | (1L << (KW_SCHEMA - 129)) | (1L << (KW_SCHEMAS - 129)) | (1L << (KW_SSL - 129)) | (1L << (KW_UNDO - 129)) | (1L << (KW_LOCK - 129)) | (1L << (KW_LOCKS - 129)) | (1L << (KW_UNLOCK - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (KW_SHARED - 193)) | (1L << (KW_EXCLUSIVE - 193)) | (1L << (KW_UNSIGNED - 193)) | (1L << (KW_WHILE - 193)) | (1L << (KW_READ - 193)) | (1L << (KW_PURGE - 193)) | (1L << (KW_ANALYZE - 193)) | (1L << (KW_BEFORE - 193)) | (1L << (KW_BINARY - 193)) | (1L << (KW_CONTINUE - 193)) | (1L << (KW_RECORDREADER - 193)) | (1L << (KW_RECORDWRITER - 193)) | (1L << (KW_SEMI - 193)) | (1L << (KW_TOUCH - 193)) | (1L << (KW_ARCHIVE - 193)) | (1L << (KW_UNARCHIVE - 193)) | (1L << (KW_COMPUTE - 193)) | (1L << (KW_STATISTICS - 193)) | (1L << (KW_USE - 193)) | (1L << (KW_OPTION - 193)) | (1L << (KW_CONCATENATE - 193)) | (1L << (KW_SHOW_DATABASE - 193)) | (1L << (KW_RESTRICT - 193)) | (1L << (KW_CASCADE - 193)) | (1L << (KW_SKEWED - 193)) | (1L << (KW_DIRECTORIES - 193)) | (1L << (KW_CURRENT_DATE - 193)) | (1L << (KW_CURRENT_TIMESTAMP - 193)) | (1L << (KW_GROUPING - 193)) | (1L << (KW_SETS - 193)) | (1L << (KW_NOSCAN - 193)) | (1L << (KW_ROLE - 193)) | (1L << (KW_ROLES - 193)) | (1L << (KW_URI - 193)) | (1L << (KW_SERVER - 193)) | (1L << (KW_ADMIN - 193)) | (1L << (KW_OWNER - 193)) | (1L << (KW_PRINCIPALS - 193)) | (1L << (KW_COMPACT - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (KW_COMPACTIONS - 257)) | (1L << (KW_TRANSACTIONS - 257)) | (1L << (KW_REWRITE - 257)) | (1L << (KW_REOPTIMIZATION - 257)) | (1L << (KW_RELOAD - 257)) | (1L << (KW_YEAR - 257)) | (1L << (KW_QUERY - 257)) | (1L << (KW_QUARTER - 257)) | (1L << (KW_MONTH - 257)) | (1L << (KW_WEEK - 257)) | (1L << (KW_DAY - 257)) | (1L << (KW_DOW - 257)) | (1L << (KW_HOUR - 257)) | (1L << (KW_MINUTE - 257)) | (1L << (KW_SECOND - 257)) | (1L << (KW_TRANSACTION - 257)) | (1L << (KW_WORK - 257)) | (1L << (KW_WRITE - 257)) | (1L << (KW_ISOLATION - 257)) | (1L << (KW_LEVEL - 257)) | (1L << (KW_SNAPSHOT - 257)) | (1L << (KW_AUTOCOMMIT - 257)) | (1L << (KW_CACHE - 257)) | (1L << (KW_ENFORCED - 257)) | (1L << (KW_VALIDATE - 257)) | (1L << (KW_NOVALIDATE - 257)) | (1L << (KW_RELY - 257)) | (1L << (KW_NORELY - 257)) | (1L << (KW_KEY - 257)) | (1L << (KW_ABORT - 257)) | (1L << (KW_EXTRACT - 257)) | (1L << (KW_FLOOR - 257)) | (1L << (KW_MATCHED - 257)) | (1L << (KW_REPL - 257)) | (1L << (KW_DUMP - 257)) | (1L << (KW_STATUS - 257)) | (1L << (KW_VECTORIZATION - 257)) | (1L << (KW_SUMMARY - 257)) | (1L << (KW_OPERATOR - 257)) | (1L << (KW_EXPRESSION - 257)) | (1L << (KW_DETAIL - 257)) | (1L << (KW_WAIT - 257)) | (1L << (KW_RESOURCE - 257)) | (1L << (KW_PLAN - 257)) | (1L << (KW_QUERY_PARALLELISM - 257)) | (1L << (KW_PLANS - 257)) | (1L << (KW_ACTIVATE - 257)) | (1L << (KW_DEFAULT - 257)) | (1L << (KW_CHECK - 257)) | (1L << (KW_POOL - 257)) | (1L << (KW_MOVE - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (KW_DO - 321)) | (1L << (KW_ALLOC_FRACTION - 321)) | (1L << (KW_SCHEDULING_POLICY - 321)) | (1L << (KW_PATH - 321)) | (1L << (KW_MAPPING - 321)) | (1L << (KW_WORKLOAD - 321)) | (1L << (KW_MANAGEMENT - 321)) | (1L << (KW_ACTIVE - 321)) | (1L << (KW_UNMANAGED - 321)) | (1L << (LPAREN - 321)) | (1L << (PLUS - 321)) | (1L << (MINUS - 321)) | (1L << (STAR - 321)) | (1L << (TILDE - 321)) | (1L << (StringLiteral - 321)) | (1L << (IntegralLiteral - 321)) | (1L << (NumberLiteral - 321)) | (1L << (Number - 321)) | (1L << (Identifier - 321)) | (1L << (CharSetName - 321)))) != 0)) {
					{
					setState(3706);
					selectExpression();
					setState(3711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3707);
						match(COMMA);
						setState(3708);
						selectExpression();
						}
						}
						setState(3713);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			}
			setState(3718);
			match(RPAREN);
			setState(3721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,460,_ctx) ) {
			case 1:
				{
				setState(3719);
				match(KW_OVER);
				setState(3720);
				window_specification();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public Sql11ReservedKeywordsUsedAsFunctionNameContext sql11ReservedKeywordsUsedAsFunctionName() {
			return getRuleContext(Sql11ReservedKeywordsUsedAsFunctionNameContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 640, RULE_functionName);
		try {
			setState(3725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(3723);
				functionIdentifier();
				}
				break;
			case KW_IF:
			case KW_BOOLEAN:
			case KW_SMALLINT:
			case KW_INT:
			case KW_BIGINT:
			case KW_FLOAT:
			case KW_DOUBLE:
			case KW_DATE:
			case KW_TIMESTAMP:
			case KW_ARRAY:
			case KW_MAP:
			case KW_BINARY:
			case KW_CURRENT_DATE:
			case KW_CURRENT_TIMESTAMP:
			case KW_GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(3724);
				sql11ReservedKeywordsUsedAsFunctionName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CAST() { return getToken(HiveParser.KW_CAST, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(HiveParser.KW_AS, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 642, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3727);
			match(KW_CAST);
			setState(3728);
			match(LPAREN);
			setState(3729);
			expression(0);
			setState(3730);
			match(KW_AS);
			setState(3731);
			primitiveType();
			setState(3732);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CASE() { return getToken(HiveParser.KW_CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_END() { return getToken(HiveParser.KW_END, 0); }
		public List<TerminalNode> KW_WHEN() { return getTokens(HiveParser.KW_WHEN); }
		public TerminalNode KW_WHEN(int i) {
			return getToken(HiveParser.KW_WHEN, i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(HiveParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(HiveParser.KW_THEN, i);
		}
		public TerminalNode KW_ELSE() { return getToken(HiveParser.KW_ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 644, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3734);
			match(KW_CASE);
			setState(3735);
			expression(0);
			setState(3741); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3736);
				match(KW_WHEN);
				setState(3737);
				expression(0);
				setState(3738);
				match(KW_THEN);
				setState(3739);
				expression(0);
				}
				}
				setState(3743); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_WHEN );
			setState(3747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(3745);
				match(KW_ELSE);
				setState(3746);
				expression(0);
				}
			}

			setState(3749);
			match(KW_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpressionContext extends ParserRuleContext {
		public TerminalNode KW_CASE() { return getToken(HiveParser.KW_CASE, 0); }
		public TerminalNode KW_END() { return getToken(HiveParser.KW_END, 0); }
		public List<TerminalNode> KW_WHEN() { return getTokens(HiveParser.KW_WHEN); }
		public TerminalNode KW_WHEN(int i) {
			return getToken(HiveParser.KW_WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> KW_THEN() { return getTokens(HiveParser.KW_THEN); }
		public TerminalNode KW_THEN(int i) {
			return getToken(HiveParser.KW_THEN, i);
		}
		public TerminalNode KW_ELSE() { return getToken(HiveParser.KW_ELSE, 0); }
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 646, RULE_whenExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3751);
			match(KW_CASE);
			setState(3757); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3752);
				match(KW_WHEN);
				setState(3753);
				expression(0);
				setState(3754);
				match(KW_THEN);
				setState(3755);
				expression(0);
				}
				}
				setState(3759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_WHEN );
			setState(3763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(3761);
				match(KW_ELSE);
				setState(3762);
				expression(0);
				}
			}

			setState(3765);
			match(KW_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloorExpressionContext extends ParserRuleContext {
		public TerminalNode KW_FLOOR() { return getToken(HiveParser.KW_FLOOR, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public FloorDateQualifiersContext floorDateQualifiers() {
			return getRuleContext(FloorDateQualifiersContext.class,0);
		}
		public FloorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floorExpression; }
	}

	public final FloorExpressionContext floorExpression() throws RecognitionException {
		FloorExpressionContext _localctx = new FloorExpressionContext(_ctx, getState());
		enterRule(_localctx, 648, RULE_floorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3767);
			match(KW_FLOOR);
			setState(3768);
			match(LPAREN);
			setState(3769);
			expression(0);
			setState(3772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_TO) {
				{
				setState(3770);
				match(KW_TO);
				setState(3771);
				floorDateQualifiers();
				}
			}

			setState(3774);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloorDateQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_YEAR() { return getToken(HiveParser.KW_YEAR, 0); }
		public TerminalNode KW_QUARTER() { return getToken(HiveParser.KW_QUARTER, 0); }
		public TerminalNode KW_MONTH() { return getToken(HiveParser.KW_MONTH, 0); }
		public TerminalNode KW_WEEK() { return getToken(HiveParser.KW_WEEK, 0); }
		public TerminalNode KW_DAY() { return getToken(HiveParser.KW_DAY, 0); }
		public TerminalNode KW_HOUR() { return getToken(HiveParser.KW_HOUR, 0); }
		public TerminalNode KW_MINUTE() { return getToken(HiveParser.KW_MINUTE, 0); }
		public TerminalNode KW_SECOND() { return getToken(HiveParser.KW_SECOND, 0); }
		public FloorDateQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floorDateQualifiers; }
	}

	public final FloorDateQualifiersContext floorDateQualifiers() throws RecognitionException {
		FloorDateQualifiersContext _localctx = new FloorDateQualifiersContext(_ctx, getState());
		enterRule(_localctx, 650, RULE_floorDateQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3776);
			_la = _input.LA(1);
			if ( !(((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (KW_YEAR - 265)) | (1L << (KW_QUARTER - 265)) | (1L << (KW_MONTH - 265)) | (1L << (KW_WEEK - 265)) | (1L << (KW_DAY - 265)) | (1L << (KW_HOUR - 265)) | (1L << (KW_MINUTE - 265)) | (1L << (KW_SECOND - 265)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractExpressionContext extends ParserRuleContext {
		public TerminalNode KW_EXTRACT() { return getToken(HiveParser.KW_EXTRACT, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TimeQualifiersContext timeQualifiers() {
			return getRuleContext(TimeQualifiersContext.class,0);
		}
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public ExtractExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractExpression; }
	}

	public final ExtractExpressionContext extractExpression() throws RecognitionException {
		ExtractExpressionContext _localctx = new ExtractExpressionContext(_ctx, getState());
		enterRule(_localctx, 652, RULE_extractExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3778);
			match(KW_EXTRACT);
			setState(3779);
			match(LPAREN);
			setState(3780);
			timeQualifiers();
			setState(3781);
			match(KW_FROM);
			setState(3782);
			expression(0);
			setState(3783);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_YEAR() { return getToken(HiveParser.KW_YEAR, 0); }
		public TerminalNode KW_QUARTER() { return getToken(HiveParser.KW_QUARTER, 0); }
		public TerminalNode KW_MONTH() { return getToken(HiveParser.KW_MONTH, 0); }
		public TerminalNode KW_WEEK() { return getToken(HiveParser.KW_WEEK, 0); }
		public TerminalNode KW_DAY() { return getToken(HiveParser.KW_DAY, 0); }
		public TerminalNode KW_DOW() { return getToken(HiveParser.KW_DOW, 0); }
		public TerminalNode KW_HOUR() { return getToken(HiveParser.KW_HOUR, 0); }
		public TerminalNode KW_MINUTE() { return getToken(HiveParser.KW_MINUTE, 0); }
		public TerminalNode KW_SECOND() { return getToken(HiveParser.KW_SECOND, 0); }
		public TimeQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQualifiers; }
	}

	public final TimeQualifiersContext timeQualifiers() throws RecognitionException {
		TimeQualifiersContext _localctx = new TimeQualifiersContext(_ctx, getState());
		enterRule(_localctx, 654, RULE_timeQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3785);
			_la = _input.LA(1);
			if ( !(((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & ((1L << (KW_YEAR - 265)) | (1L << (KW_QUARTER - 265)) | (1L << (KW_MONTH - 265)) | (1L << (KW_WEEK - 265)) | (1L << (KW_DAY - 265)) | (1L << (KW_DOW - 265)) | (1L << (KW_HOUR - 265)) | (1L << (KW_MINUTE - 265)) | (1L << (KW_SECOND - 265)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public IntervalLiteralContext intervalLiteral() {
			return getRuleContext(IntervalLiteralContext.class,0);
		}
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public DateLiteralContext dateLiteral() {
			return getRuleContext(DateLiteralContext.class,0);
		}
		public TimestampLiteralContext timestampLiteral() {
			return getRuleContext(TimestampLiteralContext.class,0);
		}
		public TimestampLocalTZLiteralContext timestampLocalTZLiteral() {
			return getRuleContext(TimestampLocalTZLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public StringLiteralSequenceContext stringLiteralSequence() {
			return getRuleContext(StringLiteralSequenceContext.class,0);
		}
		public TerminalNode IntegralLiteral() { return getToken(HiveParser.IntegralLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(HiveParser.NumberLiteral, 0); }
		public CharSetStringLiteralContext charSetStringLiteral() {
			return getRuleContext(CharSetStringLiteralContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode KW_NULL() { return getToken(HiveParser.KW_NULL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 656, RULE_constant);
		try {
			setState(3799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,467,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3787);
				intervalLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3788);
				match(Number);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3789);
				dateLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3790);
				timestampLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3791);
				timestampLocalTZLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3792);
				match(StringLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3793);
				stringLiteralSequence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3794);
				match(IntegralLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3795);
				match(NumberLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3796);
				charSetStringLiteral();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3797);
				booleanValue();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3798);
				match(KW_NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralSequenceContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(HiveParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(HiveParser.StringLiteral, i);
		}
		public StringLiteralSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralSequence; }
	}

	public final StringLiteralSequenceContext stringLiteralSequence() throws RecognitionException {
		StringLiteralSequenceContext _localctx = new StringLiteralSequenceContext(_ctx, getState());
		enterRule(_localctx, 658, RULE_stringLiteralSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3801);
			match(StringLiteral);
			setState(3803); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3802);
					match(StringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3805); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,468,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharSetStringLiteralContext extends ParserRuleContext {
		public TerminalNode CharSetName() { return getToken(HiveParser.CharSetName, 0); }
		public TerminalNode CharSetLiteral() { return getToken(HiveParser.CharSetLiteral, 0); }
		public CharSetStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charSetStringLiteral; }
	}

	public final CharSetStringLiteralContext charSetStringLiteral() throws RecognitionException {
		CharSetStringLiteralContext _localctx = new CharSetStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 660, RULE_charSetStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3807);
			match(CharSetName);
			setState(3808);
			match(CharSetLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateLiteralContext extends ParserRuleContext {
		public TerminalNode KW_DATE() { return getToken(HiveParser.KW_DATE, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_CURRENT_DATE() { return getToken(HiveParser.KW_CURRENT_DATE, 0); }
		public DateLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateLiteral; }
	}

	public final DateLiteralContext dateLiteral() throws RecognitionException {
		DateLiteralContext _localctx = new DateLiteralContext(_ctx, getState());
		enterRule(_localctx, 662, RULE_dateLiteral);
		try {
			setState(3813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3810);
				match(KW_DATE);
				setState(3811);
				match(StringLiteral);
				}
				break;
			case KW_CURRENT_DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(3812);
				match(KW_CURRENT_DATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TIMESTAMP() { return getToken(HiveParser.KW_TIMESTAMP, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode KW_CURRENT_TIMESTAMP() { return getToken(HiveParser.KW_CURRENT_TIMESTAMP, 0); }
		public TimestampLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampLiteral; }
	}

	public final TimestampLiteralContext timestampLiteral() throws RecognitionException {
		TimestampLiteralContext _localctx = new TimestampLiteralContext(_ctx, getState());
		enterRule(_localctx, 664, RULE_timestampLiteral);
		try {
			setState(3818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(3815);
				match(KW_TIMESTAMP);
				setState(3816);
				match(StringLiteral);
				}
				break;
			case KW_CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(3817);
				match(KW_CURRENT_TIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampLocalTZLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TIMESTAMPLOCALTZ() { return getToken(HiveParser.KW_TIMESTAMPLOCALTZ, 0); }
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TimestampLocalTZLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestampLocalTZLiteral; }
	}

	public final TimestampLocalTZLiteralContext timestampLocalTZLiteral() throws RecognitionException {
		TimestampLocalTZLiteralContext _localctx = new TimestampLocalTZLiteralContext(_ctx, getState());
		enterRule(_localctx, 666, RULE_timestampLocalTZLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3820);
			match(KW_TIMESTAMPLOCALTZ);
			setState(3821);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public TerminalNode Number() { return getToken(HiveParser.Number, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 668, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3823);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalLiteralContext extends ParserRuleContext {
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public IntervalQualifiersContext intervalQualifiers() {
			return getRuleContext(IntervalQualifiersContext.class,0);
		}
		public IntervalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalLiteral; }
	}

	public final IntervalLiteralContext intervalLiteral() throws RecognitionException {
		IntervalLiteralContext _localctx = new IntervalLiteralContext(_ctx, getState());
		enterRule(_localctx, 670, RULE_intervalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3825);
			intervalValue();
			setState(3826);
			intervalQualifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public IntervalQualifiersContext intervalQualifiers() {
			return getRuleContext(IntervalQualifiersContext.class,0);
		}
		public TerminalNode KW_INTERVAL() { return getToken(HiveParser.KW_INTERVAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 672, RULE_intervalExpression);
		try {
			setState(3843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,471,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3828);
				match(LPAREN);
				setState(3829);
				intervalValue();
				setState(3830);
				match(RPAREN);
				setState(3831);
				intervalQualifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3833);
				match(KW_INTERVAL);
				setState(3834);
				intervalValue();
				setState(3835);
				intervalQualifiers();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3837);
				match(KW_INTERVAL);
				setState(3838);
				match(LPAREN);
				setState(3839);
				expression(0);
				setState(3840);
				match(RPAREN);
				setState(3841);
				intervalQualifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_YEAR() { return getToken(HiveParser.KW_YEAR, 0); }
		public TerminalNode KW_TO() { return getToken(HiveParser.KW_TO, 0); }
		public TerminalNode KW_MONTH() { return getToken(HiveParser.KW_MONTH, 0); }
		public TerminalNode KW_DAY() { return getToken(HiveParser.KW_DAY, 0); }
		public TerminalNode KW_SECOND() { return getToken(HiveParser.KW_SECOND, 0); }
		public TerminalNode KW_HOUR() { return getToken(HiveParser.KW_HOUR, 0); }
		public TerminalNode KW_MINUTE() { return getToken(HiveParser.KW_MINUTE, 0); }
		public IntervalQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalQualifiers; }
	}

	public final IntervalQualifiersContext intervalQualifiers() throws RecognitionException {
		IntervalQualifiersContext _localctx = new IntervalQualifiersContext(_ctx, getState());
		enterRule(_localctx, 674, RULE_intervalQualifiers);
		try {
			setState(3857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3845);
				match(KW_YEAR);
				setState(3846);
				match(KW_TO);
				setState(3847);
				match(KW_MONTH);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3848);
				match(KW_DAY);
				setState(3849);
				match(KW_TO);
				setState(3850);
				match(KW_SECOND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3851);
				match(KW_YEAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3852);
				match(KW_MONTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3853);
				match(KW_DAY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3854);
				match(KW_HOUR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3855);
				match(KW_MINUTE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3856);
				match(KW_SECOND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExtractExpressionContext extractExpression() {
			return getRuleContext(ExtractExpressionContext.class,0);
		}
		public FloorExpressionContext floorExpression() {
			return getRuleContext(FloorExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public WhenExpressionContext whenExpression() {
			return getRuleContext(WhenExpressionContext.class,0);
		}
		public SubQueryExpressionContext subQueryExpression() {
			return getRuleContext(SubQueryExpressionContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public TableOrColumnContext tableOrColumn() {
			return getRuleContext(TableOrColumnContext.class,0);
		}
		public ExpressionsInParenthesisContext expressionsInParenthesis() {
			return getRuleContext(ExpressionsInParenthesisContext.class,0);
		}
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 676, RULE_atomExpression);
		try {
			setState(3870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,473,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3859);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3860);
				intervalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3861);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3862);
				extractExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3863);
				floorExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3864);
				caseExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3865);
				whenExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3866);
				subQueryExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3867);
				function_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3868);
				tableOrColumn();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3869);
				expressionsInParenthesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HiveParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HiveParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(HiveParser.TILDE, 0); }
		public PrecedenceUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceUnaryOperator; }
	}

	public final PrecedenceUnaryOperatorContext precedenceUnaryOperator() throws RecognitionException {
		PrecedenceUnaryOperatorContext _localctx = new PrecedenceUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 678, RULE_precedenceUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3872);
			_la = _input.LA(1);
			if ( !(((((_la - 350)) & ~0x3f) == 0 && ((1L << (_la - 350)) & ((1L << (PLUS - 350)) | (1L << (MINUS - 350)) | (1L << (TILDE - 350)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsConditionContext extends ParserRuleContext {
		public TerminalNode KW_NULL() { return getToken(HiveParser.KW_NULL, 0); }
		public TerminalNode KW_TRUE() { return getToken(HiveParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(HiveParser.KW_FALSE, 0); }
		public TerminalNode KW_DISTINCT() { return getToken(HiveParser.KW_DISTINCT, 0); }
		public TerminalNode KW_FROM() { return getToken(HiveParser.KW_FROM, 0); }
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public IsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isCondition; }
	}

	public final IsConditionContext isCondition() throws RecognitionException {
		IsConditionContext _localctx = new IsConditionContext(_ctx, getState());
		enterRule(_localctx, 680, RULE_isCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_NOT) {
				{
				setState(3874);
				match(KW_NOT);
				}
			}

			setState(3882);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_NULL:
				{
				setState(3877);
				match(KW_NULL);
				}
				break;
			case KW_TRUE:
				{
				setState(3878);
				match(KW_TRUE);
				}
				break;
			case KW_FALSE:
				{
				setState(3879);
				match(KW_FALSE);
				}
				break;
			case KW_DISTINCT:
				{
				setState(3880);
				match(KW_DISTINCT);
				setState(3881);
				match(KW_FROM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceBitwiseXorOperatorContext extends ParserRuleContext {
		public TerminalNode BITWISEXOR() { return getToken(HiveParser.BITWISEXOR, 0); }
		public PrecedenceBitwiseXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceBitwiseXorOperator; }
	}

	public final PrecedenceBitwiseXorOperatorContext precedenceBitwiseXorOperator() throws RecognitionException {
		PrecedenceBitwiseXorOperatorContext _localctx = new PrecedenceBitwiseXorOperatorContext(_ctx, getState());
		enterRule(_localctx, 682, RULE_precedenceBitwiseXorOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3884);
			match(BITWISEXOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceStarOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(HiveParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(HiveParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(HiveParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(HiveParser.DIV, 0); }
		public PrecedenceStarOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceStarOperator; }
	}

	public final PrecedenceStarOperatorContext precedenceStarOperator() throws RecognitionException {
		PrecedenceStarOperatorContext _localctx = new PrecedenceStarOperatorContext(_ctx, getState());
		enterRule(_localctx, 684, RULE_precedenceStarOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3886);
			_la = _input.LA(1);
			if ( !(((((_la - 349)) & ~0x3f) == 0 && ((1L << (_la - 349)) & ((1L << (DIVIDE - 349)) | (1L << (STAR - 349)) | (1L << (MOD - 349)) | (1L << (DIV - 349)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedencePlusOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(HiveParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HiveParser.MINUS, 0); }
		public PrecedencePlusOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedencePlusOperator; }
	}

	public final PrecedencePlusOperatorContext precedencePlusOperator() throws RecognitionException {
		PrecedencePlusOperatorContext _localctx = new PrecedencePlusOperatorContext(_ctx, getState());
		enterRule(_localctx, 686, RULE_precedencePlusOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3888);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceConcatenateOperatorContext extends ParserRuleContext {
		public TerminalNode CONCATENATE() { return getToken(HiveParser.CONCATENATE, 0); }
		public PrecedenceConcatenateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceConcatenateOperator; }
	}

	public final PrecedenceConcatenateOperatorContext precedenceConcatenateOperator() throws RecognitionException {
		PrecedenceConcatenateOperatorContext _localctx = new PrecedenceConcatenateOperatorContext(_ctx, getState());
		enterRule(_localctx, 688, RULE_precedenceConcatenateOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3890);
			match(CONCATENATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceAmpersandOperatorContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(HiveParser.AMPERSAND, 0); }
		public PrecedenceAmpersandOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceAmpersandOperator; }
	}

	public final PrecedenceAmpersandOperatorContext precedenceAmpersandOperator() throws RecognitionException {
		PrecedenceAmpersandOperatorContext _localctx = new PrecedenceAmpersandOperatorContext(_ctx, getState());
		enterRule(_localctx, 690, RULE_precedenceAmpersandOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3892);
			match(AMPERSAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceBitwiseOrOperatorContext extends ParserRuleContext {
		public TerminalNode BITWISEOR() { return getToken(HiveParser.BITWISEOR, 0); }
		public PrecedenceBitwiseOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceBitwiseOrOperator; }
	}

	public final PrecedenceBitwiseOrOperatorContext precedenceBitwiseOrOperator() throws RecognitionException {
		PrecedenceBitwiseOrOperatorContext _localctx = new PrecedenceBitwiseOrOperatorContext(_ctx, getState());
		enterRule(_localctx, 692, RULE_precedenceBitwiseOrOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3894);
			match(BITWISEOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceRegexpOperatorContext extends ParserRuleContext {
		public TerminalNode KW_LIKE() { return getToken(HiveParser.KW_LIKE, 0); }
		public TerminalNode KW_RLIKE() { return getToken(HiveParser.KW_RLIKE, 0); }
		public TerminalNode KW_REGEXP() { return getToken(HiveParser.KW_REGEXP, 0); }
		public PrecedenceRegexpOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceRegexpOperator; }
	}

	public final PrecedenceRegexpOperatorContext precedenceRegexpOperator() throws RecognitionException {
		PrecedenceRegexpOperatorContext _localctx = new PrecedenceRegexpOperatorContext(_ctx, getState());
		enterRule(_localctx, 694, RULE_precedenceRegexpOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3896);
			_la = _input.LA(1);
			if ( !(_la==KW_LIKE || _la==KW_RLIKE || _la==KW_REGEXP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHANOREQUALTO() { return getToken(HiveParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(HiveParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public TerminalNode EQUAL_NS() { return getToken(HiveParser.EQUAL_NS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HiveParser.NOTEQUAL, 0); }
		public PrecedenceComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceComparisonOperator; }
	}

	public final PrecedenceComparisonOperatorContext precedenceComparisonOperator() throws RecognitionException {
		PrecedenceComparisonOperatorContext _localctx = new PrecedenceComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 696, RULE_precedenceComparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3898);
			_la = _input.LA(1);
			if ( !(((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (EQUAL - 342)) | (1L << (EQUAL_NS - 342)) | (1L << (NOTEQUAL - 342)) | (1L << (LESSTHANOREQUALTO - 342)) | (1L << (LESSTHAN - 342)) | (1L << (GREATERTHANOREQUALTO - 342)) | (1L << (GREATERTHAN - 342)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceNotOperatorContext extends ParserRuleContext {
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public PrecedenceNotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceNotOperator; }
	}

	public final PrecedenceNotOperatorContext precedenceNotOperator() throws RecognitionException {
		PrecedenceNotOperatorContext _localctx = new PrecedenceNotOperatorContext(_ctx, getState());
		enterRule(_localctx, 698, RULE_precedenceNotOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3900);
			match(KW_NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceLogicOperatorContext extends ParserRuleContext {
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public TerminalNode KW_OR() { return getToken(HiveParser.KW_OR, 0); }
		public PrecedenceLogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceLogicOperator; }
	}

	public final PrecedenceLogicOperatorContext precedenceLogicOperator() throws RecognitionException {
		PrecedenceLogicOperatorContext _localctx = new PrecedenceLogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 700, RULE_precedenceLogicOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3902);
			_la = _input.LA(1);
			if ( !(_la==KW_AND || _la==KW_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AtomExpressionContext atomExpression() {
			return getRuleContext(AtomExpressionContext.class,0);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(HiveParser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(HiveParser.LSQUARE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(HiveParser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(HiveParser.RSQUARE, i);
		}
		public List<TerminalNode> DOT() { return getTokens(HiveParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HiveParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PrecedenceUnaryOperatorContext precedenceUnaryOperator() {
			return getRuleContext(PrecedenceUnaryOperatorContext.class,0);
		}
		public TerminalNode KW_EXISTS() { return getToken(HiveParser.KW_EXISTS, 0); }
		public SubQueryExpressionContext subQueryExpression() {
			return getRuleContext(SubQueryExpressionContext.class,0);
		}
		public PrecedenceNotOperatorContext precedenceNotOperator() {
			return getRuleContext(PrecedenceNotOperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public PrecedenceBitwiseXorOperatorContext precedenceBitwiseXorOperator() {
			return getRuleContext(PrecedenceBitwiseXorOperatorContext.class,0);
		}
		public PrecedenceStarOperatorContext precedenceStarOperator() {
			return getRuleContext(PrecedenceStarOperatorContext.class,0);
		}
		public PrecedencePlusOperatorContext precedencePlusOperator() {
			return getRuleContext(PrecedencePlusOperatorContext.class,0);
		}
		public PrecedenceConcatenateOperatorContext precedenceConcatenateOperator() {
			return getRuleContext(PrecedenceConcatenateOperatorContext.class,0);
		}
		public PrecedenceAmpersandOperatorContext precedenceAmpersandOperator() {
			return getRuleContext(PrecedenceAmpersandOperatorContext.class,0);
		}
		public PrecedenceBitwiseOrOperatorContext precedenceBitwiseOrOperator() {
			return getRuleContext(PrecedenceBitwiseOrOperatorContext.class,0);
		}
		public PrecedenceComparisonOperatorContext precedenceComparisonOperator() {
			return getRuleContext(PrecedenceComparisonOperatorContext.class,0);
		}
		public PrecedenceRegexpOperatorContext precedenceRegexpOperator() {
			return getRuleContext(PrecedenceRegexpOperatorContext.class,0);
		}
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_BETWEEN() { return getToken(HiveParser.KW_BETWEEN, 0); }
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public PrecedenceLogicOperatorContext precedenceLogicOperator() {
			return getRuleContext(PrecedenceLogicOperatorContext.class,0);
		}
		public TerminalNode KW_IS() { return getToken(HiveParser.KW_IS, 0); }
		public IsConditionContext isCondition() {
			return getRuleContext(IsConditionContext.class,0);
		}
		public TerminalNode KW_LIKE() { return getToken(HiveParser.KW_LIKE, 0); }
		public ExpressionsInParenthesisContext expressionsInParenthesis() {
			return getRuleContext(ExpressionsInParenthesisContext.class,0);
		}
		public TerminalNode KW_ANY() { return getToken(HiveParser.KW_ANY, 0); }
		public TerminalNode KW_ALL() { return getToken(HiveParser.KW_ALL, 0); }
		public TerminalNode KW_IN() { return getToken(HiveParser.KW_IN, 0); }
		public PrecedenceSimilarExpressionInContext precedenceSimilarExpressionIn() {
			return getRuleContext(PrecedenceSimilarExpressionInContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 702;
		enterRecursionRule(_localctx, 702, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,478,_ctx) ) {
			case 1:
				{
				setState(3905);
				atomExpression();
				setState(3914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(3912);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LSQUARE:
							{
							{
							setState(3906);
							match(LSQUARE);
							setState(3907);
							expression(0);
							setState(3908);
							match(RSQUARE);
							}
							}
							break;
						case DOT:
							{
							{
							setState(3910);
							match(DOT);
							setState(3911);
							identifier();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(3916);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(3917);
				precedenceUnaryOperator();
				setState(3918);
				expression(17);
				}
				break;
			case 3:
				{
				setState(3920);
				match(KW_EXISTS);
				setState(3921);
				subQueryExpression();
				}
				break;
			case 4:
				{
				setState(3922);
				precedenceNotOperator();
				setState(3923);
				expression(3);
				}
				break;
			case 5:
				{
				setState(3925);
				match(LPAREN);
				setState(3926);
				expression(0);
				setState(3927);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3995);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,483,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3931);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(3932);
						precedenceBitwiseXorOperator();
						setState(3933);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3935);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(3936);
						precedenceStarOperator();
						setState(3937);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3939);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(3940);
						precedencePlusOperator();
						setState(3941);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3943);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(3944);
						precedenceConcatenateOperator();
						setState(3945);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3947);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(3948);
						precedenceAmpersandOperator();
						setState(3949);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3951);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(3952);
						precedenceBitwiseOrOperator();
						setState(3953);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3955);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(3956);
						precedenceComparisonOperator();
						setState(3957);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3959);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(3961);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NOT) {
							{
							setState(3960);
							match(KW_NOT);
							}
						}

						setState(3963);
						precedenceRegexpOperator();
						setState(3964);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3966);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(3968);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NOT) {
							{
							setState(3967);
							match(KW_NOT);
							}
						}

						setState(3970);
						match(KW_BETWEEN);
						setState(3971);
						expression(0);
						setState(3972);
						match(KW_AND);
						setState(3973);
						expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3975);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(3976);
						precedenceLogicOperator();
						setState(3977);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3979);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(3980);
						match(KW_IS);
						setState(3981);
						isCondition();
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3982);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(3984);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NOT) {
							{
							setState(3983);
							match(KW_NOT);
							}
						}

						setState(3986);
						match(KW_LIKE);
						setState(3987);
						_la = _input.LA(1);
						if ( !(_la==KW_ALL || _la==KW_ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3988);
						expressionsInParenthesis();
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(3989);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(3991);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_NOT) {
							{
							setState(3990);
							match(KW_NOT);
							}
						}

						setState(3993);
						match(KW_IN);
						setState(3994);
						precedenceSimilarExpressionIn();
						}
						break;
					}
					} 
				}
				setState(3999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,484,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrecedenceSimilarExpressionInContext extends ParserRuleContext {
		public SubQueryExpressionContext subQueryExpression() {
			return getRuleContext(SubQueryExpressionContext.class,0);
		}
		public ExpressionsInParenthesisContext expressionsInParenthesis() {
			return getRuleContext(ExpressionsInParenthesisContext.class,0);
		}
		public PrecedenceSimilarExpressionInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceSimilarExpressionIn; }
	}

	public final PrecedenceSimilarExpressionInContext precedenceSimilarExpressionIn() throws RecognitionException {
		PrecedenceSimilarExpressionInContext _localctx = new PrecedenceSimilarExpressionInContext(_ctx, getState());
		enterRule(_localctx, 704, RULE_precedenceSimilarExpressionIn);
		try {
			setState(4002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,485,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4000);
				subQueryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4001);
				expressionsInParenthesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubQueryExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public SubQueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subQueryExpression; }
	}

	public final SubQueryExpressionContext subQueryExpression() throws RecognitionException {
		SubQueryExpressionContext _localctx = new SubQueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 706, RULE_subQueryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4004);
			match(LPAREN);
			setState(4005);
			selectStatement();
			setState(4006);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(HiveParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(HiveParser.KW_FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 708, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4008);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueTokContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(HiveParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(HiveParser.KW_FALSE, 0); }
		public BooleanValueTokContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValueTok; }
	}

	public final BooleanValueTokContext booleanValueTok() throws RecognitionException {
		BooleanValueTokContext _localctx = new BooleanValueTokContext(_ctx, getState());
		enterRule(_localctx, 710, RULE_booleanValueTok);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4010);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOrPartitionContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TableOrPartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOrPartition; }
	}

	public final TableOrPartitionContext tableOrPartition() throws RecognitionException {
		TableOrPartitionContext _localctx = new TableOrPartitionContext(_ctx, getState());
		enterRule(_localctx, 712, RULE_tableOrPartition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4012);
			tableName();
			setState(4014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PARTITION) {
				{
				setState(4013);
				partitionSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(HiveParser.KW_PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 714, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4016);
			match(KW_PARTITION);
			setState(4017);
			match(LPAREN);
			setState(4018);
			partitionVal();
			setState(4023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(4019);
				match(COMMA);
				setState(4020);
				partitionVal();
				}
				}
				setState(4025);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4026);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 716, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4028);
			identifier();
			setState(4031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(4029);
				match(EQUAL);
				setState(4030);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPartitionSpecContext extends ParserRuleContext {
		public TerminalNode KW_PARTITION() { return getToken(HiveParser.KW_PARTITION, 0); }
		public TerminalNode LPAREN() { return getToken(HiveParser.LPAREN, 0); }
		public List<DropPartitionValContext> dropPartitionVal() {
			return getRuleContexts(DropPartitionValContext.class);
		}
		public DropPartitionValContext dropPartitionVal(int i) {
			return getRuleContext(DropPartitionValContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(HiveParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HiveParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HiveParser.COMMA, i);
		}
		public DropPartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPartitionSpec; }
	}

	public final DropPartitionSpecContext dropPartitionSpec() throws RecognitionException {
		DropPartitionSpecContext _localctx = new DropPartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 718, RULE_dropPartitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4033);
			match(KW_PARTITION);
			setState(4034);
			match(LPAREN);
			setState(4035);
			dropPartitionVal();
			setState(4040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(4036);
				match(COMMA);
				setState(4037);
				dropPartitionVal();
				}
				}
				setState(4042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(4043);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropPartitionOperatorContext dropPartitionOperator() {
			return getRuleContext(DropPartitionOperatorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DropPartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPartitionVal; }
	}

	public final DropPartitionValContext dropPartitionVal() throws RecognitionException {
		DropPartitionValContext _localctx = new DropPartitionValContext(_ctx, getState());
		enterRule(_localctx, 720, RULE_dropPartitionVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4045);
			identifier();
			setState(4046);
			dropPartitionOperator();
			setState(4047);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPartitionOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HiveParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(HiveParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(HiveParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public DropPartitionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPartitionOperator; }
	}

	public final DropPartitionOperatorContext dropPartitionOperator() throws RecognitionException {
		DropPartitionOperatorContext _localctx = new DropPartitionOperatorContext(_ctx, getState());
		enterRule(_localctx, 722, RULE_dropPartitionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4049);
			_la = _input.LA(1);
			if ( !(((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (EQUAL - 342)) | (1L << (NOTEQUAL - 342)) | (1L << (LESSTHANOREQUALTO - 342)) | (1L << (LESSTHAN - 342)) | (1L << (GREATERTHANOREQUALTO - 342)) | (1L << (GREATERTHAN - 342)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SysFuncNamesContext extends ParserRuleContext {
		public TerminalNode KW_AND() { return getToken(HiveParser.KW_AND, 0); }
		public TerminalNode KW_OR() { return getToken(HiveParser.KW_OR, 0); }
		public TerminalNode KW_NOT() { return getToken(HiveParser.KW_NOT, 0); }
		public TerminalNode KW_LIKE() { return getToken(HiveParser.KW_LIKE, 0); }
		public TerminalNode KW_IF() { return getToken(HiveParser.KW_IF, 0); }
		public TerminalNode KW_CASE() { return getToken(HiveParser.KW_CASE, 0); }
		public TerminalNode KW_WHEN() { return getToken(HiveParser.KW_WHEN, 0); }
		public TerminalNode KW_FLOOR() { return getToken(HiveParser.KW_FLOOR, 0); }
		public TerminalNode KW_TINYINT() { return getToken(HiveParser.KW_TINYINT, 0); }
		public TerminalNode KW_SMALLINT() { return getToken(HiveParser.KW_SMALLINT, 0); }
		public TerminalNode KW_INT() { return getToken(HiveParser.KW_INT, 0); }
		public TerminalNode KW_BIGINT() { return getToken(HiveParser.KW_BIGINT, 0); }
		public TerminalNode KW_FLOAT() { return getToken(HiveParser.KW_FLOAT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(HiveParser.KW_DOUBLE, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(HiveParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_STRING() { return getToken(HiveParser.KW_STRING, 0); }
		public TerminalNode KW_BINARY() { return getToken(HiveParser.KW_BINARY, 0); }
		public TerminalNode KW_ARRAY() { return getToken(HiveParser.KW_ARRAY, 0); }
		public TerminalNode KW_MAP() { return getToken(HiveParser.KW_MAP, 0); }
		public TerminalNode KW_STRUCT() { return getToken(HiveParser.KW_STRUCT, 0); }
		public TerminalNode KW_UNIONTYPE() { return getToken(HiveParser.KW_UNIONTYPE, 0); }
		public TerminalNode EQUAL() { return getToken(HiveParser.EQUAL, 0); }
		public TerminalNode EQUAL_NS() { return getToken(HiveParser.EQUAL_NS, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HiveParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHANOREQUALTO() { return getToken(HiveParser.LESSTHANOREQUALTO, 0); }
		public TerminalNode LESSTHAN() { return getToken(HiveParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANOREQUALTO() { return getToken(HiveParser.GREATERTHANOREQUALTO, 0); }
		public TerminalNode GREATERTHAN() { return getToken(HiveParser.GREATERTHAN, 0); }
		public TerminalNode DIVIDE() { return getToken(HiveParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(HiveParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HiveParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(HiveParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(HiveParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(HiveParser.DIV, 0); }
		public TerminalNode AMPERSAND() { return getToken(HiveParser.AMPERSAND, 0); }
		public TerminalNode TILDE() { return getToken(HiveParser.TILDE, 0); }
		public TerminalNode BITWISEOR() { return getToken(HiveParser.BITWISEOR, 0); }
		public TerminalNode BITWISEXOR() { return getToken(HiveParser.BITWISEXOR, 0); }
		public TerminalNode KW_RLIKE() { return getToken(HiveParser.KW_RLIKE, 0); }
		public TerminalNode KW_REGEXP() { return getToken(HiveParser.KW_REGEXP, 0); }
		public TerminalNode KW_IN() { return getToken(HiveParser.KW_IN, 0); }
		public TerminalNode KW_BETWEEN() { return getToken(HiveParser.KW_BETWEEN, 0); }
		public SysFuncNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysFuncNames; }
	}

	public final SysFuncNamesContext sysFuncNames() throws RecognitionException {
		SysFuncNamesContext _localctx = new SysFuncNamesContext(_ctx, getState());
		enterRule(_localctx, 724, RULE_sysFuncNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4051);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AND) | (1L << KW_OR) | (1L << KW_NOT) | (1L << KW_LIKE) | (1L << KW_IF))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (KW_BOOLEAN - 77)) | (1L << (KW_TINYINT - 77)) | (1L << (KW_SMALLINT - 77)) | (1L << (KW_INT - 77)) | (1L << (KW_BIGINT - 77)) | (1L << (KW_FLOAT - 77)) | (1L << (KW_DOUBLE - 77)) | (1L << (KW_STRING - 77)) | (1L << (KW_ARRAY - 77)) | (1L << (KW_STRUCT - 77)) | (1L << (KW_MAP - 77)) | (1L << (KW_UNIONTYPE - 77)) | (1L << (KW_RLIKE - 77)) | (1L << (KW_REGEXP - 77)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (KW_CASE - 162)) | (1L << (KW_WHEN - 162)) | (1L << (KW_IN - 162)) | (1L << (KW_BETWEEN - 162)) | (1L << (KW_BINARY - 162)))) != 0) || ((((_la - 300)) & ~0x3f) == 0 && ((1L << (_la - 300)) & ((1L << (KW_FLOOR - 300)) | (1L << (EQUAL - 300)) | (1L << (EQUAL_NS - 300)) | (1L << (NOTEQUAL - 300)) | (1L << (LESSTHANOREQUALTO - 300)) | (1L << (LESSTHAN - 300)) | (1L << (GREATERTHANOREQUALTO - 300)) | (1L << (GREATERTHAN - 300)) | (1L << (DIVIDE - 300)) | (1L << (PLUS - 300)) | (1L << (MINUS - 300)) | (1L << (STAR - 300)) | (1L << (MOD - 300)) | (1L << (DIV - 300)) | (1L << (AMPERSAND - 300)) | (1L << (TILDE - 300)) | (1L << (BITWISEOR - 300)) | (1L << (BITWISEXOR - 300)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescFuncNamesContext extends ParserRuleContext {
		public SysFuncNamesContext sysFuncNames() {
			return getRuleContext(SysFuncNamesContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(HiveParser.StringLiteral, 0); }
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public DescFuncNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descFuncNames; }
	}

	public final DescFuncNamesContext descFuncNames() throws RecognitionException {
		DescFuncNamesContext _localctx = new DescFuncNamesContext(_ctx, getState());
		enterRule(_localctx, 726, RULE_descFuncNames);
		try {
			setState(4056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,490,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4053);
				sysFuncNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4054);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(4055);
				functionIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(HiveParser.Identifier, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 728, RULE_identifier);
		try {
			setState(4060);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(4058);
				match(Identifier);
				}
				break;
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
				enterOuterAlt(_localctx, 2);
				{
				setState(4059);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(HiveParser.DOT, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 730, RULE_functionIdentifier);
		try {
			setState(4067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,492,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4062);
				identifier();
				setState(4063);
				match(DOT);
				setState(4064);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(4066);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode QuotedIdentifier() { return getToken(HiveParser.QuotedIdentifier, 0); }
		public PrincipalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principalIdentifier; }
	}

	public final PrincipalIdentifierContext principalIdentifier() throws RecognitionException {
		PrincipalIdentifierContext _localctx = new PrincipalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 732, RULE_principalIdentifier);
		try {
			setState(4071);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ASC:
			case KW_DESC:
			case KW_NULLS:
			case KW_LAST:
			case KW_OVERWRITE:
			case KW_PARTITIONS:
			case KW_TABLES:
			case KW_COLUMNS:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_REBUILD:
			case KW_FUNCTIONS:
			case KW_SHOW:
			case KW_MSCK:
			case KW_REPAIR:
			case KW_DIRECTORY:
			case KW_CLUSTER:
			case KW_DISTRIBUTE:
			case KW_SORT:
			case KW_LOAD:
			case KW_EXPORT:
			case KW_REPLICATION:
			case KW_METADATA:
			case KW_DATA:
			case KW_INPATH:
			case KW_CHANGE:
			case KW_FIRST:
			case KW_AFTER:
			case KW_RENAME:
			case KW_COMMENT:
			case KW_TINYINT:
			case KW_DATETIME:
			case KW_ZONE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_UNIONTYPE:
			case KW_PARTITIONED:
			case KW_CLUSTERED:
			case KW_SORTED:
			case KW_BUCKETS:
			case KW_FORMAT:
			case KW_DELIMITED:
			case KW_FIELDS:
			case KW_TERMINATED:
			case KW_ESCAPED:
			case KW_COLLECTION:
			case KW_ITEMS:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LINES:
			case KW_STORED:
			case KW_FILEFORMAT:
			case KW_INPUTFORMAT:
			case KW_OUTPUTFORMAT:
			case KW_INPUTDRIVER:
			case KW_OUTPUTDRIVER:
			case KW_ENABLE:
			case KW_DISABLE:
			case KW_LOCATION:
			case KW_BUCKET:
			case KW_ADD:
			case KW_REPLACE:
			case KW_TEMPORARY:
			case KW_FILE:
			case KW_JAR:
			case KW_EXPLAIN:
			case KW_FORMATTED:
			case KW_DEPENDENCY:
			case KW_LOGICAL:
			case KW_SERDE:
			case KW_DEFERRED:
			case KW_SERDEPROPERTIES:
			case KW_DBPROPERTIES:
			case KW_LIMIT:
			case KW_OFFSET:
			case KW_UNSET:
			case KW_TBLPROPERTIES:
			case KW_IDXPROPERTIES:
			case KW_VALUE_TYPE:
			case KW_ELEM_TYPE:
			case KW_DEFINED:
			case KW_MAPJOIN:
			case KW_STREAMTABLE:
			case KW_CLUSTERSTATUS:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_LONG:
			case KW_PLUS:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_DATABASES:
			case KW_MATERIALIZED:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SSL:
			case KW_UNDO:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_UNLOCK:
			case KW_SHARED:
			case KW_EXCLUSIVE:
			case KW_UNSIGNED:
			case KW_WHILE:
			case KW_READ:
			case KW_PURGE:
			case KW_ANALYZE:
			case KW_BEFORE:
			case KW_CONTINUE:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_SEMI:
			case KW_TOUCH:
			case KW_ARCHIVE:
			case KW_UNARCHIVE:
			case KW_COMPUTE:
			case KW_STATISTICS:
			case KW_USE:
			case KW_OPTION:
			case KW_CONCATENATE:
			case KW_SHOW_DATABASE:
			case KW_RESTRICT:
			case KW_CASCADE:
			case KW_SKEWED:
			case KW_DIRECTORIES:
			case KW_SETS:
			case KW_NOSCAN:
			case KW_ROLE:
			case KW_ROLES:
			case KW_URI:
			case KW_SERVER:
			case KW_ADMIN:
			case KW_OWNER:
			case KW_PRINCIPALS:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_TRANSACTIONS:
			case KW_REWRITE:
			case KW_REOPTIMIZATION:
			case KW_RELOAD:
			case KW_YEAR:
			case KW_QUERY:
			case KW_QUARTER:
			case KW_MONTH:
			case KW_WEEK:
			case KW_DAY:
			case KW_DOW:
			case KW_HOUR:
			case KW_MINUTE:
			case KW_SECOND:
			case KW_TRANSACTION:
			case KW_WORK:
			case KW_WRITE:
			case KW_ISOLATION:
			case KW_LEVEL:
			case KW_SNAPSHOT:
			case KW_AUTOCOMMIT:
			case KW_CACHE:
			case KW_ENFORCED:
			case KW_VALIDATE:
			case KW_NOVALIDATE:
			case KW_RELY:
			case KW_NORELY:
			case KW_KEY:
			case KW_ABORT:
			case KW_MATCHED:
			case KW_REPL:
			case KW_DUMP:
			case KW_STATUS:
			case KW_VECTORIZATION:
			case KW_SUMMARY:
			case KW_OPERATOR:
			case KW_EXPRESSION:
			case KW_DETAIL:
			case KW_WAIT:
			case KW_RESOURCE:
			case KW_PLAN:
			case KW_QUERY_PARALLELISM:
			case KW_PLANS:
			case KW_ACTIVATE:
			case KW_DEFAULT:
			case KW_CHECK:
			case KW_POOL:
			case KW_MOVE:
			case KW_DO:
			case KW_ALLOC_FRACTION:
			case KW_SCHEDULING_POLICY:
			case KW_PATH:
			case KW_MAPPING:
			case KW_WORKLOAD:
			case KW_MANAGEMENT:
			case KW_ACTIVE:
			case KW_UNMANAGED:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(4069);
				identifier();
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(4070);
				match(QuotedIdentifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode KW_ABORT() { return getToken(HiveParser.KW_ABORT, 0); }
		public TerminalNode KW_ADD() { return getToken(HiveParser.KW_ADD, 0); }
		public TerminalNode KW_ADMIN() { return getToken(HiveParser.KW_ADMIN, 0); }
		public TerminalNode KW_AFTER() { return getToken(HiveParser.KW_AFTER, 0); }
		public TerminalNode KW_ANALYZE() { return getToken(HiveParser.KW_ANALYZE, 0); }
		public TerminalNode KW_ARCHIVE() { return getToken(HiveParser.KW_ARCHIVE, 0); }
		public TerminalNode KW_ASC() { return getToken(HiveParser.KW_ASC, 0); }
		public TerminalNode KW_BEFORE() { return getToken(HiveParser.KW_BEFORE, 0); }
		public TerminalNode KW_BUCKET() { return getToken(HiveParser.KW_BUCKET, 0); }
		public TerminalNode KW_BUCKETS() { return getToken(HiveParser.KW_BUCKETS, 0); }
		public TerminalNode KW_CASCADE() { return getToken(HiveParser.KW_CASCADE, 0); }
		public TerminalNode KW_CHANGE() { return getToken(HiveParser.KW_CHANGE, 0); }
		public TerminalNode KW_CHECK() { return getToken(HiveParser.KW_CHECK, 0); }
		public TerminalNode KW_CLUSTER() { return getToken(HiveParser.KW_CLUSTER, 0); }
		public TerminalNode KW_CLUSTERED() { return getToken(HiveParser.KW_CLUSTERED, 0); }
		public TerminalNode KW_CLUSTERSTATUS() { return getToken(HiveParser.KW_CLUSTERSTATUS, 0); }
		public TerminalNode KW_COLLECTION() { return getToken(HiveParser.KW_COLLECTION, 0); }
		public TerminalNode KW_COLUMNS() { return getToken(HiveParser.KW_COLUMNS, 0); }
		public TerminalNode KW_COMMENT() { return getToken(HiveParser.KW_COMMENT, 0); }
		public TerminalNode KW_COMPACT() { return getToken(HiveParser.KW_COMPACT, 0); }
		public TerminalNode KW_COMPACTIONS() { return getToken(HiveParser.KW_COMPACTIONS, 0); }
		public TerminalNode KW_COMPUTE() { return getToken(HiveParser.KW_COMPUTE, 0); }
		public TerminalNode KW_CONCATENATE() { return getToken(HiveParser.KW_CONCATENATE, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(HiveParser.KW_CONTINUE, 0); }
		public TerminalNode KW_DATA() { return getToken(HiveParser.KW_DATA, 0); }
		public TerminalNode KW_DAY() { return getToken(HiveParser.KW_DAY, 0); }
		public TerminalNode KW_DATABASES() { return getToken(HiveParser.KW_DATABASES, 0); }
		public TerminalNode KW_DATETIME() { return getToken(HiveParser.KW_DATETIME, 0); }
		public TerminalNode KW_DBPROPERTIES() { return getToken(HiveParser.KW_DBPROPERTIES, 0); }
		public TerminalNode KW_DEFERRED() { return getToken(HiveParser.KW_DEFERRED, 0); }
		public TerminalNode KW_DEFINED() { return getToken(HiveParser.KW_DEFINED, 0); }
		public TerminalNode KW_DELIMITED() { return getToken(HiveParser.KW_DELIMITED, 0); }
		public TerminalNode KW_DEPENDENCY() { return getToken(HiveParser.KW_DEPENDENCY, 0); }
		public TerminalNode KW_DESC() { return getToken(HiveParser.KW_DESC, 0); }
		public TerminalNode KW_DIRECTORIES() { return getToken(HiveParser.KW_DIRECTORIES, 0); }
		public TerminalNode KW_DIRECTORY() { return getToken(HiveParser.KW_DIRECTORY, 0); }
		public TerminalNode KW_DISABLE() { return getToken(HiveParser.KW_DISABLE, 0); }
		public TerminalNode KW_DISTRIBUTE() { return getToken(HiveParser.KW_DISTRIBUTE, 0); }
		public TerminalNode KW_DOW() { return getToken(HiveParser.KW_DOW, 0); }
		public TerminalNode KW_ELEM_TYPE() { return getToken(HiveParser.KW_ELEM_TYPE, 0); }
		public TerminalNode KW_ENABLE() { return getToken(HiveParser.KW_ENABLE, 0); }
		public TerminalNode KW_ENFORCED() { return getToken(HiveParser.KW_ENFORCED, 0); }
		public TerminalNode KW_ESCAPED() { return getToken(HiveParser.KW_ESCAPED, 0); }
		public TerminalNode KW_EXCLUSIVE() { return getToken(HiveParser.KW_EXCLUSIVE, 0); }
		public TerminalNode KW_EXPLAIN() { return getToken(HiveParser.KW_EXPLAIN, 0); }
		public TerminalNode KW_EXPORT() { return getToken(HiveParser.KW_EXPORT, 0); }
		public TerminalNode KW_FIELDS() { return getToken(HiveParser.KW_FIELDS, 0); }
		public TerminalNode KW_FILE() { return getToken(HiveParser.KW_FILE, 0); }
		public TerminalNode KW_FILEFORMAT() { return getToken(HiveParser.KW_FILEFORMAT, 0); }
		public TerminalNode KW_FIRST() { return getToken(HiveParser.KW_FIRST, 0); }
		public TerminalNode KW_FORMAT() { return getToken(HiveParser.KW_FORMAT, 0); }
		public TerminalNode KW_FORMATTED() { return getToken(HiveParser.KW_FORMATTED, 0); }
		public TerminalNode KW_FUNCTIONS() { return getToken(HiveParser.KW_FUNCTIONS, 0); }
		public TerminalNode KW_HOUR() { return getToken(HiveParser.KW_HOUR, 0); }
		public TerminalNode KW_IDXPROPERTIES() { return getToken(HiveParser.KW_IDXPROPERTIES, 0); }
		public TerminalNode KW_INDEX() { return getToken(HiveParser.KW_INDEX, 0); }
		public TerminalNode KW_INDEXES() { return getToken(HiveParser.KW_INDEXES, 0); }
		public TerminalNode KW_INPATH() { return getToken(HiveParser.KW_INPATH, 0); }
		public TerminalNode KW_INPUTDRIVER() { return getToken(HiveParser.KW_INPUTDRIVER, 0); }
		public TerminalNode KW_INPUTFORMAT() { return getToken(HiveParser.KW_INPUTFORMAT, 0); }
		public TerminalNode KW_ITEMS() { return getToken(HiveParser.KW_ITEMS, 0); }
		public TerminalNode KW_JAR() { return getToken(HiveParser.KW_JAR, 0); }
		public TerminalNode KW_KILL() { return getToken(HiveParser.KW_KILL, 0); }
		public TerminalNode KW_KEYS() { return getToken(HiveParser.KW_KEYS, 0); }
		public TerminalNode KW_KEY_TYPE() { return getToken(HiveParser.KW_KEY_TYPE, 0); }
		public TerminalNode KW_LAST() { return getToken(HiveParser.KW_LAST, 0); }
		public TerminalNode KW_LIMIT() { return getToken(HiveParser.KW_LIMIT, 0); }
		public TerminalNode KW_OFFSET() { return getToken(HiveParser.KW_OFFSET, 0); }
		public TerminalNode KW_LINES() { return getToken(HiveParser.KW_LINES, 0); }
		public TerminalNode KW_LOAD() { return getToken(HiveParser.KW_LOAD, 0); }
		public TerminalNode KW_LOCATION() { return getToken(HiveParser.KW_LOCATION, 0); }
		public TerminalNode KW_LOCK() { return getToken(HiveParser.KW_LOCK, 0); }
		public TerminalNode KW_LOCKS() { return getToken(HiveParser.KW_LOCKS, 0); }
		public TerminalNode KW_LOGICAL() { return getToken(HiveParser.KW_LOGICAL, 0); }
		public TerminalNode KW_LONG() { return getToken(HiveParser.KW_LONG, 0); }
		public TerminalNode KW_MAPJOIN() { return getToken(HiveParser.KW_MAPJOIN, 0); }
		public TerminalNode KW_MATERIALIZED() { return getToken(HiveParser.KW_MATERIALIZED, 0); }
		public TerminalNode KW_METADATA() { return getToken(HiveParser.KW_METADATA, 0); }
		public TerminalNode KW_MINUTE() { return getToken(HiveParser.KW_MINUTE, 0); }
		public TerminalNode KW_MONTH() { return getToken(HiveParser.KW_MONTH, 0); }
		public TerminalNode KW_MSCK() { return getToken(HiveParser.KW_MSCK, 0); }
		public TerminalNode KW_NOSCAN() { return getToken(HiveParser.KW_NOSCAN, 0); }
		public TerminalNode KW_NULLS() { return getToken(HiveParser.KW_NULLS, 0); }
		public TerminalNode KW_OPTION() { return getToken(HiveParser.KW_OPTION, 0); }
		public TerminalNode KW_OUTPUTDRIVER() { return getToken(HiveParser.KW_OUTPUTDRIVER, 0); }
		public TerminalNode KW_OUTPUTFORMAT() { return getToken(HiveParser.KW_OUTPUTFORMAT, 0); }
		public TerminalNode KW_OVERWRITE() { return getToken(HiveParser.KW_OVERWRITE, 0); }
		public TerminalNode KW_OWNER() { return getToken(HiveParser.KW_OWNER, 0); }
		public TerminalNode KW_PARTITIONED() { return getToken(HiveParser.KW_PARTITIONED, 0); }
		public TerminalNode KW_PARTITIONS() { return getToken(HiveParser.KW_PARTITIONS, 0); }
		public TerminalNode KW_PLUS() { return getToken(HiveParser.KW_PLUS, 0); }
		public TerminalNode KW_PRINCIPALS() { return getToken(HiveParser.KW_PRINCIPALS, 0); }
		public TerminalNode KW_PURGE() { return getToken(HiveParser.KW_PURGE, 0); }
		public TerminalNode KW_QUERY() { return getToken(HiveParser.KW_QUERY, 0); }
		public TerminalNode KW_QUARTER() { return getToken(HiveParser.KW_QUARTER, 0); }
		public TerminalNode KW_READ() { return getToken(HiveParser.KW_READ, 0); }
		public TerminalNode KW_REBUILD() { return getToken(HiveParser.KW_REBUILD, 0); }
		public TerminalNode KW_RECORDREADER() { return getToken(HiveParser.KW_RECORDREADER, 0); }
		public TerminalNode KW_RECORDWRITER() { return getToken(HiveParser.KW_RECORDWRITER, 0); }
		public TerminalNode KW_RELOAD() { return getToken(HiveParser.KW_RELOAD, 0); }
		public TerminalNode KW_RENAME() { return getToken(HiveParser.KW_RENAME, 0); }
		public TerminalNode KW_REPAIR() { return getToken(HiveParser.KW_REPAIR, 0); }
		public TerminalNode KW_REPLACE() { return getToken(HiveParser.KW_REPLACE, 0); }
		public TerminalNode KW_REPLICATION() { return getToken(HiveParser.KW_REPLICATION, 0); }
		public TerminalNode KW_RESTRICT() { return getToken(HiveParser.KW_RESTRICT, 0); }
		public TerminalNode KW_REWRITE() { return getToken(HiveParser.KW_REWRITE, 0); }
		public TerminalNode KW_ROLE() { return getToken(HiveParser.KW_ROLE, 0); }
		public TerminalNode KW_ROLES() { return getToken(HiveParser.KW_ROLES, 0); }
		public TerminalNode KW_SCHEMA() { return getToken(HiveParser.KW_SCHEMA, 0); }
		public TerminalNode KW_SCHEMAS() { return getToken(HiveParser.KW_SCHEMAS, 0); }
		public TerminalNode KW_SECOND() { return getToken(HiveParser.KW_SECOND, 0); }
		public TerminalNode KW_SEMI() { return getToken(HiveParser.KW_SEMI, 0); }
		public TerminalNode KW_SERDE() { return getToken(HiveParser.KW_SERDE, 0); }
		public TerminalNode KW_SERDEPROPERTIES() { return getToken(HiveParser.KW_SERDEPROPERTIES, 0); }
		public TerminalNode KW_SERVER() { return getToken(HiveParser.KW_SERVER, 0); }
		public TerminalNode KW_SETS() { return getToken(HiveParser.KW_SETS, 0); }
		public TerminalNode KW_SHARED() { return getToken(HiveParser.KW_SHARED, 0); }
		public TerminalNode KW_SHOW() { return getToken(HiveParser.KW_SHOW, 0); }
		public TerminalNode KW_SHOW_DATABASE() { return getToken(HiveParser.KW_SHOW_DATABASE, 0); }
		public TerminalNode KW_SKEWED() { return getToken(HiveParser.KW_SKEWED, 0); }
		public TerminalNode KW_SORT() { return getToken(HiveParser.KW_SORT, 0); }
		public TerminalNode KW_SORTED() { return getToken(HiveParser.KW_SORTED, 0); }
		public TerminalNode KW_SSL() { return getToken(HiveParser.KW_SSL, 0); }
		public TerminalNode KW_STATISTICS() { return getToken(HiveParser.KW_STATISTICS, 0); }
		public TerminalNode KW_STORED() { return getToken(HiveParser.KW_STORED, 0); }
		public TerminalNode KW_STREAMTABLE() { return getToken(HiveParser.KW_STREAMTABLE, 0); }
		public TerminalNode KW_STRING() { return getToken(HiveParser.KW_STRING, 0); }
		public TerminalNode KW_STRUCT() { return getToken(HiveParser.KW_STRUCT, 0); }
		public TerminalNode KW_TABLES() { return getToken(HiveParser.KW_TABLES, 0); }
		public TerminalNode KW_TBLPROPERTIES() { return getToken(HiveParser.KW_TBLPROPERTIES, 0); }
		public TerminalNode KW_TEMPORARY() { return getToken(HiveParser.KW_TEMPORARY, 0); }
		public TerminalNode KW_TERMINATED() { return getToken(HiveParser.KW_TERMINATED, 0); }
		public TerminalNode KW_TINYINT() { return getToken(HiveParser.KW_TINYINT, 0); }
		public TerminalNode KW_TOUCH() { return getToken(HiveParser.KW_TOUCH, 0); }
		public TerminalNode KW_TRANSACTIONS() { return getToken(HiveParser.KW_TRANSACTIONS, 0); }
		public TerminalNode KW_UNARCHIVE() { return getToken(HiveParser.KW_UNARCHIVE, 0); }
		public TerminalNode KW_UNDO() { return getToken(HiveParser.KW_UNDO, 0); }
		public TerminalNode KW_UNIONTYPE() { return getToken(HiveParser.KW_UNIONTYPE, 0); }
		public TerminalNode KW_UNLOCK() { return getToken(HiveParser.KW_UNLOCK, 0); }
		public TerminalNode KW_UNSET() { return getToken(HiveParser.KW_UNSET, 0); }
		public TerminalNode KW_UNSIGNED() { return getToken(HiveParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_URI() { return getToken(HiveParser.KW_URI, 0); }
		public TerminalNode KW_USE() { return getToken(HiveParser.KW_USE, 0); }
		public TerminalNode KW_UTC() { return getToken(HiveParser.KW_UTC, 0); }
		public TerminalNode KW_UTCTIMESTAMP() { return getToken(HiveParser.KW_UTCTIMESTAMP, 0); }
		public TerminalNode KW_VALUE_TYPE() { return getToken(HiveParser.KW_VALUE_TYPE, 0); }
		public TerminalNode KW_VIEW() { return getToken(HiveParser.KW_VIEW, 0); }
		public TerminalNode KW_WEEK() { return getToken(HiveParser.KW_WEEK, 0); }
		public TerminalNode KW_WHILE() { return getToken(HiveParser.KW_WHILE, 0); }
		public TerminalNode KW_YEAR() { return getToken(HiveParser.KW_YEAR, 0); }
		public TerminalNode KW_WORK() { return getToken(HiveParser.KW_WORK, 0); }
		public TerminalNode KW_TRANSACTION() { return getToken(HiveParser.KW_TRANSACTION, 0); }
		public TerminalNode KW_WRITE() { return getToken(HiveParser.KW_WRITE, 0); }
		public TerminalNode KW_ISOLATION() { return getToken(HiveParser.KW_ISOLATION, 0); }
		public TerminalNode KW_LEVEL() { return getToken(HiveParser.KW_LEVEL, 0); }
		public TerminalNode KW_SNAPSHOT() { return getToken(HiveParser.KW_SNAPSHOT, 0); }
		public TerminalNode KW_AUTOCOMMIT() { return getToken(HiveParser.KW_AUTOCOMMIT, 0); }
		public TerminalNode KW_RELY() { return getToken(HiveParser.KW_RELY, 0); }
		public TerminalNode KW_NORELY() { return getToken(HiveParser.KW_NORELY, 0); }
		public TerminalNode KW_VALIDATE() { return getToken(HiveParser.KW_VALIDATE, 0); }
		public TerminalNode KW_NOVALIDATE() { return getToken(HiveParser.KW_NOVALIDATE, 0); }
		public TerminalNode KW_KEY() { return getToken(HiveParser.KW_KEY, 0); }
		public TerminalNode KW_MATCHED() { return getToken(HiveParser.KW_MATCHED, 0); }
		public TerminalNode KW_REPL() { return getToken(HiveParser.KW_REPL, 0); }
		public TerminalNode KW_DUMP() { return getToken(HiveParser.KW_DUMP, 0); }
		public TerminalNode KW_STATUS() { return getToken(HiveParser.KW_STATUS, 0); }
		public TerminalNode KW_CACHE() { return getToken(HiveParser.KW_CACHE, 0); }
		public TerminalNode KW_VIEWS() { return getToken(HiveParser.KW_VIEWS, 0); }
		public TerminalNode KW_VECTORIZATION() { return getToken(HiveParser.KW_VECTORIZATION, 0); }
		public TerminalNode KW_SUMMARY() { return getToken(HiveParser.KW_SUMMARY, 0); }
		public TerminalNode KW_OPERATOR() { return getToken(HiveParser.KW_OPERATOR, 0); }
		public TerminalNode KW_EXPRESSION() { return getToken(HiveParser.KW_EXPRESSION, 0); }
		public TerminalNode KW_DETAIL() { return getToken(HiveParser.KW_DETAIL, 0); }
		public TerminalNode KW_WAIT() { return getToken(HiveParser.KW_WAIT, 0); }
		public TerminalNode KW_ZONE() { return getToken(HiveParser.KW_ZONE, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(HiveParser.KW_DEFAULT, 0); }
		public TerminalNode KW_REOPTIMIZATION() { return getToken(HiveParser.KW_REOPTIMIZATION, 0); }
		public TerminalNode KW_RESOURCE() { return getToken(HiveParser.KW_RESOURCE, 0); }
		public TerminalNode KW_PLAN() { return getToken(HiveParser.KW_PLAN, 0); }
		public TerminalNode KW_PLANS() { return getToken(HiveParser.KW_PLANS, 0); }
		public TerminalNode KW_QUERY_PARALLELISM() { return getToken(HiveParser.KW_QUERY_PARALLELISM, 0); }
		public TerminalNode KW_ACTIVATE() { return getToken(HiveParser.KW_ACTIVATE, 0); }
		public TerminalNode KW_MOVE() { return getToken(HiveParser.KW_MOVE, 0); }
		public TerminalNode KW_DO() { return getToken(HiveParser.KW_DO, 0); }
		public TerminalNode KW_POOL() { return getToken(HiveParser.KW_POOL, 0); }
		public TerminalNode KW_ALLOC_FRACTION() { return getToken(HiveParser.KW_ALLOC_FRACTION, 0); }
		public TerminalNode KW_SCHEDULING_POLICY() { return getToken(HiveParser.KW_SCHEDULING_POLICY, 0); }
		public TerminalNode KW_PATH() { return getToken(HiveParser.KW_PATH, 0); }
		public TerminalNode KW_MAPPING() { return getToken(HiveParser.KW_MAPPING, 0); }
		public TerminalNode KW_WORKLOAD() { return getToken(HiveParser.KW_WORKLOAD, 0); }
		public TerminalNode KW_MANAGEMENT() { return getToken(HiveParser.KW_MANAGEMENT, 0); }
		public TerminalNode KW_ACTIVE() { return getToken(HiveParser.KW_ACTIVE, 0); }
		public TerminalNode KW_UNMANAGED() { return getToken(HiveParser.KW_UNMANAGED, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 734, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4073);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (KW_ASC - 12)) | (1L << (KW_DESC - 12)) | (1L << (KW_NULLS - 12)) | (1L << (KW_LAST - 12)) | (1L << (KW_OVERWRITE - 12)) | (1L << (KW_PARTITIONS - 12)) | (1L << (KW_TABLES - 12)) | (1L << (KW_COLUMNS - 12)) | (1L << (KW_INDEX - 12)) | (1L << (KW_INDEXES - 12)) | (1L << (KW_REBUILD - 12)) | (1L << (KW_FUNCTIONS - 12)) | (1L << (KW_SHOW - 12)) | (1L << (KW_MSCK - 12)) | (1L << (KW_REPAIR - 12)) | (1L << (KW_DIRECTORY - 12)) | (1L << (KW_CLUSTER - 12)) | (1L << (KW_DISTRIBUTE - 12)) | (1L << (KW_SORT - 12)) | (1L << (KW_LOAD - 12)) | (1L << (KW_EXPORT - 12)) | (1L << (KW_REPLICATION - 12)) | (1L << (KW_METADATA - 12)) | (1L << (KW_DATA - 12)) | (1L << (KW_INPATH - 12)) | (1L << (KW_CHANGE - 12)) | (1L << (KW_FIRST - 12)) | (1L << (KW_AFTER - 12)) | (1L << (KW_RENAME - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (KW_COMMENT - 76)) | (1L << (KW_TINYINT - 76)) | (1L << (KW_DATETIME - 76)) | (1L << (KW_ZONE - 76)) | (1L << (KW_STRING - 76)) | (1L << (KW_STRUCT - 76)) | (1L << (KW_UNIONTYPE - 76)) | (1L << (KW_PARTITIONED - 76)) | (1L << (KW_CLUSTERED - 76)) | (1L << (KW_SORTED - 76)) | (1L << (KW_BUCKETS - 76)) | (1L << (KW_FORMAT - 76)) | (1L << (KW_DELIMITED - 76)) | (1L << (KW_FIELDS - 76)) | (1L << (KW_TERMINATED - 76)) | (1L << (KW_ESCAPED - 76)) | (1L << (KW_COLLECTION - 76)) | (1L << (KW_ITEMS - 76)) | (1L << (KW_KEYS - 76)) | (1L << (KW_KEY_TYPE - 76)) | (1L << (KW_KILL - 76)) | (1L << (KW_LINES - 76)) | (1L << (KW_STORED - 76)) | (1L << (KW_FILEFORMAT - 76)) | (1L << (KW_INPUTFORMAT - 76)) | (1L << (KW_OUTPUTFORMAT - 76)) | (1L << (KW_INPUTDRIVER - 76)) | (1L << (KW_OUTPUTDRIVER - 76)) | (1L << (KW_ENABLE - 76)) | (1L << (KW_DISABLE - 76)) | (1L << (KW_LOCATION - 76)) | (1L << (KW_BUCKET - 76)) | (1L << (KW_ADD - 76)) | (1L << (KW_REPLACE - 76)) | (1L << (KW_TEMPORARY - 76)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (KW_FILE - 141)) | (1L << (KW_JAR - 141)) | (1L << (KW_EXPLAIN - 141)) | (1L << (KW_FORMATTED - 141)) | (1L << (KW_DEPENDENCY - 141)) | (1L << (KW_LOGICAL - 141)) | (1L << (KW_SERDE - 141)) | (1L << (KW_DEFERRED - 141)) | (1L << (KW_SERDEPROPERTIES - 141)) | (1L << (KW_DBPROPERTIES - 141)) | (1L << (KW_LIMIT - 141)) | (1L << (KW_OFFSET - 141)) | (1L << (KW_UNSET - 141)) | (1L << (KW_TBLPROPERTIES - 141)) | (1L << (KW_IDXPROPERTIES - 141)) | (1L << (KW_VALUE_TYPE - 141)) | (1L << (KW_ELEM_TYPE - 141)) | (1L << (KW_DEFINED - 141)) | (1L << (KW_MAPJOIN - 141)) | (1L << (KW_STREAMTABLE - 141)) | (1L << (KW_CLUSTERSTATUS - 141)) | (1L << (KW_UTC - 141)) | (1L << (KW_UTCTIMESTAMP - 141)) | (1L << (KW_LONG - 141)) | (1L << (KW_PLUS - 141)) | (1L << (KW_VIEW - 141)) | (1L << (KW_VIEWS - 141)) | (1L << (KW_DATABASES - 141)) | (1L << (KW_MATERIALIZED - 141)) | (1L << (KW_SCHEMA - 141)) | (1L << (KW_SCHEMAS - 141)) | (1L << (KW_SSL - 141)) | (1L << (KW_UNDO - 141)) | (1L << (KW_LOCK - 141)) | (1L << (KW_LOCKS - 141)) | (1L << (KW_UNLOCK - 141)) | (1L << (KW_SHARED - 141)) | (1L << (KW_EXCLUSIVE - 141)) | (1L << (KW_UNSIGNED - 141)) | (1L << (KW_WHILE - 141)) | (1L << (KW_READ - 141)) | (1L << (KW_PURGE - 141)) | (1L << (KW_ANALYZE - 141)) | (1L << (KW_BEFORE - 141)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (KW_CONTINUE - 208)) | (1L << (KW_RECORDREADER - 208)) | (1L << (KW_RECORDWRITER - 208)) | (1L << (KW_SEMI - 208)) | (1L << (KW_TOUCH - 208)) | (1L << (KW_ARCHIVE - 208)) | (1L << (KW_UNARCHIVE - 208)) | (1L << (KW_COMPUTE - 208)) | (1L << (KW_STATISTICS - 208)) | (1L << (KW_USE - 208)) | (1L << (KW_OPTION - 208)) | (1L << (KW_CONCATENATE - 208)) | (1L << (KW_SHOW_DATABASE - 208)) | (1L << (KW_RESTRICT - 208)) | (1L << (KW_CASCADE - 208)) | (1L << (KW_SKEWED - 208)) | (1L << (KW_DIRECTORIES - 208)) | (1L << (KW_SETS - 208)) | (1L << (KW_NOSCAN - 208)) | (1L << (KW_ROLE - 208)) | (1L << (KW_ROLES - 208)) | (1L << (KW_URI - 208)) | (1L << (KW_SERVER - 208)) | (1L << (KW_ADMIN - 208)) | (1L << (KW_OWNER - 208)) | (1L << (KW_PRINCIPALS - 208)) | (1L << (KW_COMPACT - 208)) | (1L << (KW_COMPACTIONS - 208)) | (1L << (KW_TRANSACTIONS - 208)) | (1L << (KW_REWRITE - 208)) | (1L << (KW_REOPTIMIZATION - 208)) | (1L << (KW_RELOAD - 208)) | (1L << (KW_YEAR - 208)) | (1L << (KW_QUERY - 208)) | (1L << (KW_QUARTER - 208)) | (1L << (KW_MONTH - 208)) | (1L << (KW_WEEK - 208)) | (1L << (KW_DAY - 208)) | (1L << (KW_DOW - 208)))) != 0) || ((((_la - 272)) & ~0x3f) == 0 && ((1L << (_la - 272)) & ((1L << (KW_HOUR - 272)) | (1L << (KW_MINUTE - 272)) | (1L << (KW_SECOND - 272)) | (1L << (KW_TRANSACTION - 272)) | (1L << (KW_WORK - 272)) | (1L << (KW_WRITE - 272)) | (1L << (KW_ISOLATION - 272)) | (1L << (KW_LEVEL - 272)) | (1L << (KW_SNAPSHOT - 272)) | (1L << (KW_AUTOCOMMIT - 272)) | (1L << (KW_CACHE - 272)) | (1L << (KW_ENFORCED - 272)) | (1L << (KW_VALIDATE - 272)) | (1L << (KW_NOVALIDATE - 272)) | (1L << (KW_RELY - 272)) | (1L << (KW_NORELY - 272)) | (1L << (KW_KEY - 272)) | (1L << (KW_ABORT - 272)) | (1L << (KW_MATCHED - 272)) | (1L << (KW_REPL - 272)) | (1L << (KW_DUMP - 272)) | (1L << (KW_STATUS - 272)) | (1L << (KW_VECTORIZATION - 272)) | (1L << (KW_SUMMARY - 272)) | (1L << (KW_OPERATOR - 272)) | (1L << (KW_EXPRESSION - 272)) | (1L << (KW_DETAIL - 272)) | (1L << (KW_WAIT - 272)) | (1L << (KW_RESOURCE - 272)) | (1L << (KW_PLAN - 272)) | (1L << (KW_QUERY_PARALLELISM - 272)) | (1L << (KW_PLANS - 272)) | (1L << (KW_ACTIVATE - 272)) | (1L << (KW_DEFAULT - 272)) | (1L << (KW_CHECK - 272)) | (1L << (KW_POOL - 272)) | (1L << (KW_MOVE - 272)) | (1L << (KW_DO - 272)) | (1L << (KW_ALLOC_FRACTION - 272)) | (1L << (KW_SCHEDULING_POLICY - 272)) | (1L << (KW_PATH - 272)) | (1L << (KW_MAPPING - 272)) | (1L << (KW_WORKLOAD - 272)) | (1L << (KW_MANAGEMENT - 272)) | (1L << (KW_ACTIVE - 272)) | (1L << (KW_UNMANAGED - 272)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql11ReservedKeywordsUsedAsFunctionNameContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(HiveParser.KW_IF, 0); }
		public TerminalNode KW_ARRAY() { return getToken(HiveParser.KW_ARRAY, 0); }
		public TerminalNode KW_MAP() { return getToken(HiveParser.KW_MAP, 0); }
		public TerminalNode KW_BIGINT() { return getToken(HiveParser.KW_BIGINT, 0); }
		public TerminalNode KW_BINARY() { return getToken(HiveParser.KW_BINARY, 0); }
		public TerminalNode KW_BOOLEAN() { return getToken(HiveParser.KW_BOOLEAN, 0); }
		public TerminalNode KW_CURRENT_DATE() { return getToken(HiveParser.KW_CURRENT_DATE, 0); }
		public TerminalNode KW_CURRENT_TIMESTAMP() { return getToken(HiveParser.KW_CURRENT_TIMESTAMP, 0); }
		public TerminalNode KW_DATE() { return getToken(HiveParser.KW_DATE, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(HiveParser.KW_DOUBLE, 0); }
		public TerminalNode KW_FLOAT() { return getToken(HiveParser.KW_FLOAT, 0); }
		public TerminalNode KW_GROUPING() { return getToken(HiveParser.KW_GROUPING, 0); }
		public TerminalNode KW_INT() { return getToken(HiveParser.KW_INT, 0); }
		public TerminalNode KW_SMALLINT() { return getToken(HiveParser.KW_SMALLINT, 0); }
		public TerminalNode KW_TIMESTAMP() { return getToken(HiveParser.KW_TIMESTAMP, 0); }
		public Sql11ReservedKeywordsUsedAsFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql11ReservedKeywordsUsedAsFunctionName; }
	}

	public final Sql11ReservedKeywordsUsedAsFunctionNameContext sql11ReservedKeywordsUsedAsFunctionName() throws RecognitionException {
		Sql11ReservedKeywordsUsedAsFunctionNameContext _localctx = new Sql11ReservedKeywordsUsedAsFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 736, RULE_sql11ReservedKeywordsUsedAsFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4075);
			_la = _input.LA(1);
			if ( !(_la==KW_IF || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (KW_BOOLEAN - 77)) | (1L << (KW_SMALLINT - 77)) | (1L << (KW_INT - 77)) | (1L << (KW_BIGINT - 77)) | (1L << (KW_FLOAT - 77)) | (1L << (KW_DOUBLE - 77)) | (1L << (KW_DATE - 77)) | (1L << (KW_TIMESTAMP - 77)) | (1L << (KW_ARRAY - 77)) | (1L << (KW_MAP - 77)))) != 0) || ((((_la - 206)) & ~0x3f) == 0 && ((1L << (_la - 206)) & ((1L << (KW_BINARY - 206)) | (1L << (KW_CURRENT_DATE - 206)) | (1L << (KW_CURRENT_TIMESTAMP - 206)) | (1L << (KW_GROUPING - 206)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 351:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0179\u0ff0\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\4\u0119\t\u0119"+
		"\4\u011a\t\u011a\4\u011b\t\u011b\4\u011c\t\u011c\4\u011d\t\u011d\4\u011e"+
		"\t\u011e\4\u011f\t\u011f\4\u0120\t\u0120\4\u0121\t\u0121\4\u0122\t\u0122"+
		"\4\u0123\t\u0123\4\u0124\t\u0124\4\u0125\t\u0125\4\u0126\t\u0126\4\u0127"+
		"\t\u0127\4\u0128\t\u0128\4\u0129\t\u0129\4\u012a\t\u012a\4\u012b\t\u012b"+
		"\4\u012c\t\u012c\4\u012d\t\u012d\4\u012e\t\u012e\4\u012f\t\u012f\4\u0130"+
		"\t\u0130\4\u0131\t\u0131\4\u0132\t\u0132\4\u0133\t\u0133\4\u0134\t\u0134"+
		"\4\u0135\t\u0135\4\u0136\t\u0136\4\u0137\t\u0137\4\u0138\t\u0138\4\u0139"+
		"\t\u0139\4\u013a\t\u013a\4\u013b\t\u013b\4\u013c\t\u013c\4\u013d\t\u013d"+
		"\4\u013e\t\u013e\4\u013f\t\u013f\4\u0140\t\u0140\4\u0141\t\u0141\4\u0142"+
		"\t\u0142\4\u0143\t\u0143\4\u0144\t\u0144\4\u0145\t\u0145\4\u0146\t\u0146"+
		"\4\u0147\t\u0147\4\u0148\t\u0148\4\u0149\t\u0149\4\u014a\t\u014a\4\u014b"+
		"\t\u014b\4\u014c\t\u014c\4\u014d\t\u014d\4\u014e\t\u014e\4\u014f\t\u014f"+
		"\4\u0150\t\u0150\4\u0151\t\u0151\4\u0152\t\u0152\4\u0153\t\u0153\4\u0154"+
		"\t\u0154\4\u0155\t\u0155\4\u0156\t\u0156\4\u0157\t\u0157\4\u0158\t\u0158"+
		"\4\u0159\t\u0159\4\u015a\t\u015a\4\u015b\t\u015b\4\u015c\t\u015c\4\u015d"+
		"\t\u015d\4\u015e\t\u015e\4\u015f\t\u015f\4\u0160\t\u0160\4\u0161\t\u0161"+
		"\4\u0162\t\u0162\4\u0163\t\u0163\4\u0164\t\u0164\4\u0165\t\u0165\4\u0166"+
		"\t\u0166\4\u0167\t\u0167\4\u0168\t\u0168\4\u0169\t\u0169\4\u016a\t\u016a"+
		"\4\u016b\t\u016b\4\u016c\t\u016c\4\u016d\t\u016d\4\u016e\t\u016e\4\u016f"+
		"\t\u016f\4\u0170\t\u0170\4\u0171\t\u0171\4\u0172\t\u0172\3\2\3\2\3\2\7"+
		"\2\u02e8\n\2\f\2\16\2\u02eb\13\2\3\2\3\2\3\3\3\3\5\3\u02f1\n\3\3\4\3\4"+
		"\5\4\u02f5\n\4\3\5\3\5\7\5\u02f9\n\5\f\5\16\5\u02fc\13\5\3\5\3\5\3\5\5"+
		"\5\u0301\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u030c\n\6\3\6\5\6"+
		"\u030f\n\6\5\6\u0311\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0323\n\t\3\n\3\n\3\n\5\n\u0328\n\n\3\n\3\n\3\n"+
		"\5\n\u032d\n\n\3\n\3\n\3\n\3\n\5\n\u0333\n\n\3\13\3\13\5\13\u0337\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0344\n\f\3\r\3"+
		"\r\5\r\u0348\n\r\3\r\3\r\5\r\u034c\n\r\3\r\3\r\3\r\5\r\u0351\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0358\n\16\3\16\3\16\3\16\3\16\5\16\u035e\n"+
		"\16\3\16\3\16\5\16\u0362\n\16\5\16\u0364\n\16\3\16\3\16\5\16\u0368\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u036f\n\17\5\17\u0371\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0377\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0380"+
		"\n\21\f\21\16\21\u0383\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u038a\n\22"+
		"\3\22\3\22\5\22\u038e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u03b8\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\5\33\u03d3\n\33\3\33\3\33\5\33\u03d7\n\33\3\33\5\33\u03da"+
		"\n\33\3\33\3\33\3\33\5\33\u03df\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\7\36\u03eb\n\36\f\36\16\36\u03ee\13\36\3\37\3\37\3\37"+
		"\3 \3 \3 \5 \u03f6\n \3 \3 \5 \u03fa\n \3!\3!\3!\3\"\3\"\5\"\u0401\n\""+
		"\3\"\5\"\u0404\n\"\3\"\3\"\5\"\u0408\n\"\3\"\3\"\3\"\3\"\5\"\u040e\n\""+
		"\3\"\5\"\u0411\n\"\3\"\5\"\u0414\n\"\3\"\5\"\u0417\n\"\3\"\3\"\3\"\3\""+
		"\5\"\u041d\n\"\3\"\5\"\u0420\n\"\3\"\5\"\u0423\n\"\3\"\5\"\u0426\n\"\3"+
		"\"\5\"\u0429\n\"\3\"\5\"\u042c\n\"\3\"\5\"\u042f\n\"\3\"\5\"\u0432\n\""+
		"\3\"\5\"\u0435\n\"\3\"\3\"\5\"\u0439\n\"\5\"\u043b\n\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\5#\u0445\n#\3$\3$\3$\5$\u044a\n$\3$\3$\5$\u044e\n$\3$\5$\u0451"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u045c\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u046c\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u047b\n&\3&\3&\5&\u047f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u048e\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\5)\u049b\n)"+
		"\3*\3*\5*\u049f\n*\3+\3+\3+\5+\u04a4\n+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u04bf\n"+
		"\60\3\61\3\61\3\61\5\61\u04c4\n\61\3\62\3\62\3\62\3\62\3\63\3\63\5\63"+
		"\u04cc\n\63\3\63\3\63\3\63\3\63\5\63\u04d2\n\63\3\63\3\63\5\63\u04d6\n"+
		"\63\3\63\5\63\u04d9\n\63\3\63\5\63\u04dc\n\63\3\64\3\64\3\64\3\64\5\64"+
		"\u04e2\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u04e9\n\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\5\66\u04f3\n\66\3\67\3\67\5\67\u04f7\n\67\3\67"+
		"\6\67\u04fa\n\67\r\67\16\67\u04fb\38\38\58\u0500\n8\39\39\79\u0504\n9"+
		"\f9\169\u0507\139\3:\3:\7:\u050b\n:\f:\16:\u050e\13:\3;\3;\7;\u0512\n"+
		";\f;\16;\u0515\13;\3<\3<\3<\3=\3=\5=\u051c\n=\3=\3=\3=\7=\u0521\n=\f="+
		"\16=\u0524\13=\3=\5=\u0527\n=\3=\5=\u052a\n=\3>\3>\3>\3>\3>\3>\5>\u0532"+
		"\n>\3>\5>\u0535\n>\3?\3?\3?\3?\3?\3?\5?\u053d\n?\3?\5?\u0540\n?\3@\3@"+
		"\5@\u0544\n@\3A\3A\3B\3B\3B\3B\3B\3B\5B\u054e\nB\3B\3B\3B\5B\u0553\nB"+
		"\3C\3C\3C\3C\5C\u0559\nC\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\5E\u0566\nE"+
		"\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\7H\u0574\nH\fH\16H\u0577\13H\3I\3"+
		"I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3K\5K\u0586\nK\3L\3L\3L\3L\3L\3L\3M\3"+
		"M\3M\3M\3N\3N\3N\3N\5N\u0596\nN\3N\3N\3N\3N\3N\5N\u059d\nN\3O\3O\3P\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u05b1\nQ\3Q\3Q\5Q\u05b5"+
		"\nQ\3Q\3Q\3Q\5Q\u05ba\nQ\3Q\3Q\3Q\5Q\u05bf\nQ\3Q\5Q\u05c2\nQ\3Q\5Q\u05c5"+
		"\nQ\3Q\3Q\5Q\u05c9\nQ\3Q\5Q\u05cc\nQ\3Q\5Q\u05cf\nQ\3R\3R\3R\7R\u05d4"+
		"\nR\fR\16R\u05d7\13R\3S\3S\3S\3S\3S\3S\3T\3T\5T\u05e1\nT\3U\3U\3U\3V\3"+
		"V\3V\5V\u05e9\nV\3V\3V\3V\3V\5V\u05ef\nV\3W\3W\3W\3W\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\5X\u05ff\nX\3X\5X\u0602\nX\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u060c"+
		"\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0614\nZ\7Z\u0616\nZ\fZ\16Z\u0619\13Z\5Z\u061b"+
		"\nZ\3[\3[\5[\u061f\n[\3\\\3\\\5\\\u0623\n\\\3\\\5\\\u0626\n\\\3]\3]\3"+
		"]\5]\u062b\n]\3]\3]\3]\5]\u0630\n]\3]\3]\3]\3]\5]\u0636\n]\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\3^\5^\u0641\n^\5^\u0643\n^\3^\3^\5^\u0647\n^\3_\3_\3_\3"+
		"_\5_\u064d\n_\3_\3_\3_\3_\5_\u0653\n_\3_\3_\3_\5_\u0658\n_\3_\3_\3_\3"+
		"_\5_\u065e\n_\3_\3_\3_\5_\u0663\n_\3_\3_\3_\3_\3_\5_\u066a\n_\3_\3_\3"+
		"_\5_\u066f\n_\3_\3_\3_\3_\3_\3_\5_\u0677\n_\3_\3_\3_\5_\u067c\n_\3_\3"+
		"_\3_\3_\3_\5_\u0683\n_\3_\3_\3_\3_\5_\u0689\n_\3_\3_\3_\3_\3_\3_\5_\u0691"+
		"\n_\3_\3_\3_\3_\3_\5_\u0698\n_\3_\3_\3_\5_\u069d\n_\3_\3_\3_\3_\3_\3_"+
		"\5_\u06a5\n_\3_\3_\3_\3_\3_\5_\u06ac\n_\3_\5_\u06af\n_\3_\5_\u06b2\n_"+
		"\5_\u06b4\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u06c2\n_\5_\u06c4"+
		"\n_\3`\3`\3`\3`\5`\u06ca\n`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3c\3c\3c\3c\5c"+
		"\u06d9\nc\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\5g\u06ea\ng\3g"+
		"\3g\3g\5g\u06ef\ng\3h\3h\5h\u06f3\nh\3h\3h\5h\u06f7\nh\3h\3h\3h\3i\3i"+
		"\5i\u06fe\ni\3i\3i\3i\7i\u0703\ni\fi\16i\u0706\13i\3i\3i\3i\5i\u070b\n"+
		"i\3j\3j\5j\u070f\nj\3j\5j\u0712\nj\3j\3j\3j\7j\u0717\nj\fj\16j\u071a\13"+
		"j\3j\3j\3j\3k\3k\3k\3k\3k\3l\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3n\5n\u0730"+
		"\nn\3o\3o\3o\5o\u0735\no\3o\3o\5o\u0739\no\3p\3p\3p\3p\3q\3q\5q\u0741"+
		"\nq\3r\3r\3r\3s\3s\3s\5s\u0749\ns\3s\3s\5s\u074d\ns\3s\3s\3s\3s\5s\u0753"+
		"\ns\3t\3t\3t\5t\u0758\nt\3t\3t\3t\3t\3t\5t\u075f\nt\3t\5t\u0762\nt\3t"+
		"\3t\3t\3t\5t\u0768\nt\3u\3u\3u\7u\u076d\nu\fu\16u\u0770\13u\3v\3v\3v\3"+
		"v\3v\5v\u0777\nv\3w\3w\3x\3x\3x\7x\u077e\nx\fx\16x\u0781\13x\3y\3y\3y"+
		"\3y\3y\3y\5y\u0789\ny\3z\3z\3z\3z\3{\3{\3{\3{\3|\3|\3|\3|\3}\3}\3}\3}"+
		"\3~\3~\5~\u079d\n~\3~\3~\3~\3~\5~\u07a3\n~\3~\5~\u07a6\n~\5~\u07a8\n~"+
		"\3\177\3\177\3\177\7\177\u07ad\n\177\f\177\16\177\u07b0\13\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u07b9\n\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u07c1\n\u0082"+
		"\3\u0083\3\u0083\5\u0083\u07c5\n\u0083\3\u0083\3\u0083\5\u0083\u07c9\n"+
		"\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\5\u0085\u07d6\n\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u07df\n\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\5\u0087\u07e5\n\u0087\3\u0087\3\u0087\5\u0087\u07e9\n"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07f0\n\u0087\3"+
		"\u0087\5\u0087\u07f3\n\u0087\3\u0087\5\u0087\u07f6\n\u0087\3\u0087\5\u0087"+
		"\u07f9\n\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\5\u0088\u0802\n\u0088\3\u0088\3\u0088\5\u0088\u0806\n\u0088\3\u0088\5"+
		"\u0088\u0809\n\u0088\3\u0088\5\u0088\u080c\n\u0088\3\u0088\5\u0088\u080f"+
		"\n\u0088\3\u0088\5\u0088\u0812\n\u0088\3\u0088\5\u0088\u0815\n\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u0823\n\u008a\3\u008a\3\u008a\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u082b\n\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\5\u008c\u0831\n\u008c\3\u008d\3\u008d\5\u008d\u0835\n\u008d\3"+
		"\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u0840\n\u008f\f\u008f\16\u008f\u0843\13\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\5\u0090\u0852\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0862\n\u0091\3\u0092\3\u0092\5\u0092\u0866\n\u0092\3"+
		"\u0093\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0875\n\u0095\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\5\u0096\u087b\n\u0096\3\u0096\5\u0096\u087e\n\u0096\3"+
		"\u0096\5\u0096\u0881\n\u0096\3\u0096\5\u0096\u0884\n\u0096\3\u0096\5\u0096"+
		"\u0887\n\u0096\3\u0097\3\u0097\5\u0097\u088b\n\u0097\3\u0098\3\u0098\3"+
		"\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\7\u009a"+
		"\u0897\n\u009a\f\u009a\16\u009a\u089a\13\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u089f\n\u009a\f\u009a\16\u009a\u08a2\13\u009a\5\u009a\u08a4\n"+
		"\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u08b3\n\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08d5\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u08dd\n\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u08e2\n\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\7\u00a4\u08ea\n\u00a4\f\u00a4\16\u00a4\u08ed\13\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\7\u00a5\u08f2\n\u00a5\f\u00a5\16\u00a5\u08f5\13\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\7\u00a6\u08fa\n\u00a6\f\u00a6\16\u00a6\u08fd"+
		"\13\u00a6\3\u00a7\3\u00a7\3\u00a7\7\u00a7\u0902\n\u00a7\f\u00a7\16\u00a7"+
		"\u0905\13\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\5\u00a9\u090f\n\u00a9\7\u00a9\u0911\n\u00a9\f\u00a9\16\u00a9"+
		"\u0914\13\u00a9\3\u00aa\3\u00aa\3\u00aa\7\u00aa\u0919\n\u00aa\f\u00aa"+
		"\16\u00aa\u091c\13\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac"+
		"\5\u00ac\u0924\n\u00ac\3\u00ac\5\u00ac\u0927\n\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0930\n\u00af\3\u00b0\3"+
		"\u00b0\5\u00b0\u0934\n\u00b0\5\u00b0\u0936\n\u00b0\3\u00b1\3\u00b1\5\u00b1"+
		"\u093a\n\u00b1\3\u00b1\3\u00b1\5\u00b1\u093e\n\u00b1\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\5\u00b2\u0944\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3"+
		"\u00b4\5\u00b4\u094b\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\5\u00b4\u0954\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u095f\n\u00b5\3\u00b6\3"+
		"\u00b6\5\u00b6\u0963\n\u00b6\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0968\n\u00b7"+
		"\f\u00b7\16\u00b7\u096b\13\u00b7\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\7\u00b9\u0974\n\u00b9\f\u00b9\16\u00b9\u0977\13\u00b9"+
		"\3\u00ba\3\u00ba\3\u00bb\3\u00bb\5\u00bb\u097d\n\u00bb\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0985\n\u00bd\3\u00be\3\u00be"+
		"\5\u00be\u0989\n\u00be\3\u00be\5\u00be\u098c\n\u00be\3\u00bf\3\u00bf\3"+
		"\u00bf\7\u00bf\u0991\n\u00bf\f\u00bf\16\u00bf\u0994\13\u00bf\3\u00c0\3"+
		"\u00c0\3\u00c0\5\u00c0\u0999\n\u00c0\3\u00c1\3\u00c1\5\u00c1\u099d\n\u00c1"+
		"\3\u00c1\5\u00c1\u09a0\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u09a6\n\u00c2\3\u00c3\3\u00c3\5\u00c3\u09aa\n\u00c3\3\u00c4\3\u00c4\5"+
		"\u00c4\u09ae\n\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09b3\n\u00c5\3\u00c5"+
		"\3\u00c5\5\u00c5\u09b7\n\u00c5\3\u00c6\3\u00c6\5\u00c6\u09bb\n\u00c6\3"+
		"\u00c7\3\u00c7\5\u00c7\u09bf\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\5\u00c7\u09c7\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u09cb\n\u00c8"+
		"\3\u00c8\3\u00c8\5\u00c8\u09cf\n\u00c8\3\u00c9\3\u00c9\5\u00c9\u09d3\n"+
		"\u00c9\3\u00ca\3\u00ca\5\u00ca\u09d7\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\5\u00ca\u09df\n\u00ca\3\u00cb\3\u00cb\5\u00cb\u09e3"+
		"\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u09e7\n\u00cb\3\u00cc\3\u00cc\3\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\5\u00cf\u09f7\n\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1"+
		"\3\u00d1\7\u00d1\u09fe\n\u00d1\f\u00d1\16\u00d1\u0a01\13\u00d1\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\5\u00d2\u0a08\n\u00d2\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a12\n\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a24"+
		"\n\u00d3\3\u00d3\5\u00d3\u0a27\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a31\n\u00d3\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d6"+
		"\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d7"+
		"\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a4d\n\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u0a53\n\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\5\u00d8\u0a59\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\5\u00d8\u0a5f\n\u00d8\5\u00d8\u0a61\n\u00d8\3\u00d9\5\u00d9\u0a64\n\u00d9"+
		"\3\u00d9\3\u00d9\3\u00da\3\u00da\5\u00da\u0a6a\n\u00da\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\7\u00db\u0a70\n\u00db\f\u00db\16\u00db\u0a73\13\u00db"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\7\u00dd\u0a7f\n\u00dd\f\u00dd\16\u00dd\u0a82\13\u00dd\3\u00de"+
		"\3\u00de\6\u00de\u0a86\n\u00de\r\u00de\16\u00de\u0a87\3\u00df\3\u00df"+
		"\3\u00df\5\u00df\u0a8d\n\u00df\3\u00df\5\u00df\u0a90\n\u00df\3\u00e0\3"+
		"\u00e0\5\u00e0\u0a94\n\u00e0\3\u00e0\5\u00e0\u0a97\n\u00e0\3\u00e0\5\u00e0"+
		"\u0a9a\n\u00e0\3\u00e0\5\u00e0\u0a9d\n\u00e0\3\u00e0\5\u00e0\u0aa0\n\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0aa6\n\u00e0\3\u00e1\3\u00e1"+
		"\5\u00e1\u0aaa\n\u00e1\3\u00e1\5\u00e1\u0aad\n\u00e1\3\u00e1\5\u00e1\u0ab0"+
		"\n\u00e1\3\u00e1\5\u00e1\u0ab3\n\u00e1\3\u00e1\5\u00e1\u0ab6\n\u00e1\3"+
		"\u00e1\5\u00e1\u0ab9\n\u00e1\3\u00e2\3\u00e2\3\u00e2\6\u00e2\u0abe\n\u00e2"+
		"\r\u00e2\16\u00e2\u0abf\3\u00e3\5\u00e3\u0ac3\n\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e4\5\u00e4\u0aca\n\u00e4\3\u00e4\5\u00e4\u0acd\n"+
		"\u00e4\3\u00e4\5\u00e4\u0ad0\n\u00e4\3\u00e4\5\u00e4\u0ad3\n\u00e4\3\u00e4"+
		"\5\u00e4\u0ad6\n\u00e4\3\u00e4\5\u00e4\u0ad9\n\u00e4\3\u00e4\5\u00e4\u0adc"+
		"\n\u00e4\3\u00e4\5\u00e4\u0adf\n\u00e4\3\u00e4\5\u00e4\u0ae2\n\u00e4\3"+
		"\u00e4\5\u00e4\u0ae5\n\u00e4\3\u00e4\3\u00e4\5\u00e4\u0ae9\n\u00e4\3\u00e4"+
		"\5\u00e4\u0aec\n\u00e4\3\u00e4\5\u00e4\u0aef\n\u00e4\3\u00e4\5\u00e4\u0af2"+
		"\n\u00e4\3\u00e4\5\u00e4\u0af5\n\u00e4\3\u00e4\5\u00e4\u0af8\n\u00e4\3"+
		"\u00e4\5\u00e4\u0afb\n\u00e4\3\u00e4\5\u00e4\u0afe\n\u00e4\3\u00e4\5\u00e4"+
		"\u0b01\n\u00e4\3\u00e4\5\u00e4\u0b04\n\u00e4\5\u00e4\u0b06\n\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0b0c\n\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\5\u00e5\u0b11\n\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5"+
		"\u0b18\n\u00e5\5\u00e5\u0b1a\n\u00e5\3\u00e6\5\u00e6\u0b1d\n\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\5\u00e6\u0b22\n\u00e6\3\u00e6\5\u00e6\u0b25\n\u00e6\3"+
		"\u00e6\3\u00e6\5\u00e6\u0b29\n\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b2e"+
		"\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0b35\n\u00e7"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b3b\n\u00e8\3\u00e9\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0b45\n\u00ea"+
		"\f\u00ea\16\u00ea\u0b48\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb"+
		"\u0b4e\n\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0b54\n\u00ec\3"+
		"\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0b5b\n\u00ed\f\u00ed\16"+
		"\u00ed\u0b5e\13\u00ed\5\u00ed\u0b60\n\u00ed\3\u00ee\3\u00ee\5\u00ee\u0b64"+
		"\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0b6a\n\u00ef\3\u00f0"+
		"\3\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f2\3\u00f2\5\u00f2\u0b74"+
		"\n\u00f2\3\u00f3\3\u00f3\5\u00f3\u0b78\n\u00f3\3\u00f4\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f5\3\u00f5\3\u00f5\6\u00f5\u0b81\n\u00f5\r\u00f5\16\u00f5"+
		"\u0b82\3\u00f6\3\u00f6\3\u00f6\3\u00f6\5\u00f6\u0b89\n\u00f6\3\u00f6\5"+
		"\u00f6\u0b8c\n\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3"+
		"\u00f7\3\u00f7\7\u00f7\u0b96\n\u00f7\f\u00f7\16\u00f7\u0b99\13\u00f7\3"+
		"\u00f7\5\u00f7\u0b9c\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\5"+
		"\u00f8\u0ba3\n\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f9\3"+
		"\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fa"+
		"\3\u00fa\3\u00fa\3\u00fb\3\u00fb\3\u00fb\5\u00fb\u0bb9\n\u00fb\3\u00fc"+
		"\3\u00fc\3\u00fc\6\u00fc\u0bbe\n\u00fc\r\u00fc\16\u00fc\u0bbf\3\u00fd"+
		"\3\u00fd\5\u00fd\u0bc4\n\u00fd\3\u00fd\5\u00fd\u0bc7\n\u00fd\3\u00fd\3"+
		"\u00fd\3\u00fd\5\u00fd\u0bcc\n\u00fd\3\u00fd\5\u00fd\u0bcf\n\u00fd\3\u00fe"+
		"\3\u00fe\3\u00fe\7\u00fe\u0bd4\n\u00fe\f\u00fe\16\u00fe\u0bd7\13\u00fe"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u0bdd\n\u00ff\3\u00ff\5\u00ff"+
		"\u0be0\n\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff"+
		"\u0be8\n\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u0bee\n\u00ff\5"+
		"\u00ff\u0bf0\n\u00ff\5\u00ff\u0bf2\n\u00ff\3\u00ff\5\u00ff\u0bf5\n\u00ff"+
		"\3\u00ff\5\u00ff\u0bf8\n\u00ff\3\u0100\3\u0100\3\u0100\5\u0100\u0bfd\n"+
		"\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\3\u0100\7\u0100\u0c05\n"+
		"\u0100\f\u0100\16\u0100\u0c08\13\u0100\3\u0100\3\u0100\5\u0100\u0c0c\n"+
		"\u0100\5\u0100\u0c0e\n\u0100\3\u0101\3\u0101\3\u0101\3\u0101\5\u0101\u0c14"+
		"\n\u0101\3\u0101\5\u0101\u0c17\n\u0101\3\u0101\5\u0101\u0c1a\n\u0101\3"+
		"\u0101\3\u0101\3\u0101\3\u0101\3\u0101\3\u0101\5\u0101\u0c22\n\u0101\3"+
		"\u0101\3\u0101\3\u0101\3\u0101\5\u0101\u0c28\n\u0101\5\u0101\u0c2a\n\u0101"+
		"\5\u0101\u0c2c\n\u0101\3\u0101\5\u0101\u0c2f\n\u0101\3\u0101\5\u0101\u0c32"+
		"\n\u0101\3\u0102\3\u0102\5\u0102\u0c36\n\u0102\3\u0103\3\u0103\3\u0103"+
		"\7\u0103\u0c3b\n\u0103\f\u0103\16\u0103\u0c3e\13\u0103\3\u0104\3\u0104"+
		"\3\u0104\3\u0104\7\u0104\u0c44\n\u0104\f\u0104\16\u0104\u0c47\13\u0104"+
		"\3\u0105\3\u0105\3\u0105\3\u0105\3\u0106\3\u0106\3\u0106\5\u0106\u0c50"+
		"\n\u0106\3\u0106\5\u0106\u0c53\n\u0106\3\u0106\5\u0106\u0c56\n\u0106\3"+
		"\u0106\5\u0106\u0c59\n\u0106\3\u0107\3\u0107\5\u0107\u0c5d\n\u0107\3\u0108"+
		"\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\5\u0108\u0c67"+
		"\n\u0108\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109"+
		"\5\u0109\u0c71\n\u0109\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a\3\u010a"+
		"\5\u010a\u0c79\n\u010a\3\u010b\3\u010b\3\u010b\3\u010b\3\u010b\3\u010b"+
		"\5\u010b\u0c81\n\u010b\3\u010c\3\u010c\3\u010c\3\u010c\3\u010c\5\u010c"+
		"\u0c88\n\u010c\3\u010d\3\u010d\3\u010e\3\u010e\3\u010e\7\u010e\u0c8f\n"+
		"\u010e\f\u010e\16\u010e\u0c92\13\u010e\3\u010f\3\u010f\3\u010f\7\u010f"+
		"\u0c97\n\u010f\f\u010f\16\u010f\u0c9a\13\u010f\3\u0110\3\u0110\3\u0110"+
		"\3\u0111\3\u0111\3\u0111\3\u0111\6\u0111\u0ca3\n\u0111\r\u0111\16\u0111"+
		"\u0ca4\3\u0111\5\u0111\u0ca8\n\u0111\3\u0112\3\u0112\7\u0112\u0cac\n\u0112"+
		"\f\u0112\16\u0112\u0caf\13\u0112\3\u0112\3\u0112\7\u0112\u0cb3\n\u0112"+
		"\f\u0112\16\u0112\u0cb6\13\u0112\3\u0112\3\u0112\7\u0112\u0cba\n\u0112"+
		"\f\u0112\16\u0112\u0cbd\13\u0112\3\u0112\3\u0112\7\u0112\u0cc1\n\u0112"+
		"\f\u0112\16\u0112\u0cc4\13\u0112\3\u0112\3\u0112\3\u0112\3\u0112\5\u0112"+
		"\u0cca\n\u0112\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113\3\u0113"+
		"\5\u0113\u0cd3\n\u0113\7\u0113\u0cd5\n\u0113\f\u0113\16\u0113\u0cd8\13"+
		"\u0113\3\u0114\3\u0114\3\u0114\3\u0114\5\u0114\u0cde\n\u0114\3\u0114\7"+
		"\u0114\u0ce1\n\u0114\f\u0114\16\u0114\u0ce4\13\u0114\3\u0115\5\u0115\u0ce7"+
		"\n\u0115\3\u0115\3\u0115\3\u0115\3\u0116\3\u0116\3\u0116\3\u0116\3\u0117"+
		"\3\u0117\3\u0118\3\u0118\3\u0118\3\u0118\3\u0118\3\u0118\3\u0118\3\u0118"+
		"\5\u0118\u0cfa\n\u0118\3\u0118\3\u0118\3\u0118\5\u0118\u0cff\n\u0118\3"+
		"\u0118\3\u0118\3\u0118\5\u0118\u0d04\n\u0118\3\u0118\3\u0118\3\u0118\3"+
		"\u0118\5\u0118\u0d0a\n\u0118\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3"+
		"\u0119\3\u0119\3\u0119\3\u0119\7\u0119\u0d15\n\u0119\f\u0119\16\u0119"+
		"\u0d18\13\u0119\5\u0119\u0d1a\n\u0119\3\u0119\5\u0119\u0d1d\n\u0119\3"+
		"\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\7\u0119"+
		"\u0d27\n\u0119\f\u0119\16\u0119\u0d2a\13\u0119\5\u0119\u0d2c\n\u0119\3"+
		"\u0119\5\u0119\u0d2f\n\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3"+
		"\u0119\5\u0119\u0d37\n\u0119\3\u0119\3\u0119\3\u0119\3\u0119\3\u0119\7"+
		"\u0119\u0d3e\n\u0119\f\u0119\16\u0119\u0d41\13\u0119\3\u0119\3\u0119\5"+
		"\u0119\u0d45\n\u0119\5\u0119\u0d47\n\u0119\3\u011a\3\u011a\3\u011b\3\u011b"+
		"\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b\3\u011b"+
		"\7\u011b\u0d56\n\u011b\f\u011b\16\u011b\u0d59\13\u011b\5\u011b\u0d5b\n"+
		"\u011b\3\u011b\3\u011b\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c\3\u011c"+
		"\3\u011c\3\u011c\3\u011c\5\u011c\u0d68\n\u011c\3\u011d\3\u011d\5\u011d"+
		"\u0d6c\n\u011d\3\u011e\3\u011e\5\u011e\u0d70\n\u011e\3\u011e\5\u011e\u0d73"+
		"\n\u011e\3\u011e\5\u011e\u0d76\n\u011e\3\u011e\5\u011e\u0d79\n\u011e\3"+
		"\u011f\3\u011f\5\u011f\u0d7d\n\u011f\3\u011f\5\u011f\u0d80\n\u011f\3\u011f"+
		"\5\u011f\u0d83\n\u011f\3\u0120\3\u0120\3\u0120\3\u0120\3\u0120\5\u0120"+
		"\u0d8a\n\u0120\3\u0121\3\u0121\3\u0121\5\u0121\u0d8f\n\u0121\3\u0121\3"+
		"\u0121\3\u0122\3\u0122\3\u0122\3\u0122\5\u0122\u0d97\n\u0122\3\u0122\3"+
		"\u0122\3\u0123\3\u0123\5\u0123\u0d9d\n\u0123\3\u0123\3\u0123\3\u0123\5"+
		"\u0123\u0da2\n\u0123\3\u0123\3\u0123\5\u0123\u0da6\n\u0123\3\u0124\3\u0124"+
		"\3\u0124\5\u0124\u0dab\n\u0124\3\u0125\3\u0125\3\u0125\3\u0125\3\u0125"+
		"\5\u0125\u0db2\n\u0125\3\u0125\3\u0125\3\u0125\3\u0125\3\u0125\3\u0125"+
		"\3\u0125\3\u0125\3\u0125\3\u0125\7\u0125\u0dbe\n\u0125\f\u0125\16\u0125"+
		"\u0dc1\13\u0125\5\u0125\u0dc3\n\u0125\3\u0125\3\u0125\5\u0125\u0dc7\n"+
		"\u0125\3\u0126\3\u0126\3\u0126\3\u0127\3\u0127\3\u0128\3\u0128\3\u0128"+
		"\3\u0129\3\u0129\3\u0129\7\u0129\u0dd4\n\u0129\f\u0129\16\u0129\u0dd7"+
		"\13\u0129\3\u012a\3\u012a\3\u012b\3\u012b\3\u012b\3\u012b\3\u012b\5\u012b"+
		"\u0de0\n\u012b\3\u012b\3\u012b\3\u012b\3\u012b\3\u012b\7\u012b\u0de7\n"+
		"\u012b\f\u012b\16\u012b\u0dea\13\u012b\5\u012b\u0dec\n\u012b\3\u012b\3"+
		"\u012b\3\u012c\3\u012c\3\u012c\3\u012c\3\u012d\3\u012d\3\u012d\5\u012d"+
		"\u0df7\n\u012d\3\u012e\3\u012e\3\u012e\3\u012f\3\u012f\3\u012f\3\u012f"+
		"\3\u012f\7\u012f\u0e01\n\u012f\f\u012f\16\u012f\u0e04\13\u012f\3\u012f"+
		"\3\u012f\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\5\u0130\u0e0d\n\u0130"+
		"\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\3\u0130\7\u0130\u0e15\n\u0130"+
		"\f\u0130\16\u0130\u0e18\13\u0130\3\u0130\3\u0130\5\u0130\u0e1c\n\u0130"+
		"\3\u0131\3\u0131\5\u0131\u0e20\n\u0131\3\u0132\3\u0132\5\u0132\u0e24\n"+
		"\u0132\3\u0132\3\u0132\7\u0132\u0e28\n\u0132\f\u0132\16\u0132\u0e2b\13"+
		"\u0132\3\u0132\3\u0132\3\u0133\3\u0133\3\u0134\3\u0134\3\u0134\3\u0135"+
		"\3\u0135\3\u0136\3\u0136\3\u0136\3\u0136\3\u0137\3\u0137\5\u0137\u0e3c"+
		"\n\u0137\3\u0138\3\u0138\6\u0138\u0e40\n\u0138\r\u0138\16\u0138\u0e41"+
		"\3\u0139\3\u0139\5\u0139\u0e46\n\u0139\3\u013a\3\u013a\3\u013a\3\u013a"+
		"\7\u013a\u0e4c\n\u013a\f\u013a\16\u013a\u0e4f\13\u013a\3\u013a\3\u013a"+
		"\3\u013b\3\u013b\3\u013b\7\u013b\u0e56\n\u013b\f\u013b\16\u013b\u0e59"+
		"\13\u013b\3\u013c\3\u013c\3\u013c\3\u013c\3\u013c\7\u013c\u0e60\n\u013c"+
		"\f\u013c\16\u013c\u0e63\13\u013c\3\u013d\3\u013d\3\u013d\3\u013d\3\u013e"+
		"\3\u013e\3\u013e\3\u013e\3\u013f\3\u013f\3\u013f\3\u013f\3\u0140\3\u0140"+
		"\3\u0140\3\u0140\5\u0140\u0e75\n\u0140\3\u0141\3\u0141\3\u0141\3\u0141"+
		"\5\u0141\u0e7b\n\u0141\3\u0141\3\u0141\3\u0141\7\u0141\u0e80\n\u0141\f"+
		"\u0141\16\u0141\u0e83\13\u0141\5\u0141\u0e85\n\u0141\5\u0141\u0e87\n\u0141"+
		"\3\u0141\3\u0141\3\u0141\5\u0141\u0e8c\n\u0141\3\u0142\3\u0142\5\u0142"+
		"\u0e90\n\u0142\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143\3\u0143"+
		"\3\u0144\3\u0144\3\u0144\3\u0144\3\u0144\3\u0144\3\u0144\6\u0144\u0ea0"+
		"\n\u0144\r\u0144\16\u0144\u0ea1\3\u0144\3\u0144\5\u0144\u0ea6\n\u0144"+
		"\3\u0144\3\u0144\3\u0145\3\u0145\3\u0145\3\u0145\3\u0145\3\u0145\6\u0145"+
		"\u0eb0\n\u0145\r\u0145\16\u0145\u0eb1\3\u0145\3\u0145\5\u0145\u0eb6\n"+
		"\u0145\3\u0145\3\u0145\3\u0146\3\u0146\3\u0146\3\u0146\3\u0146\5\u0146"+
		"\u0ebf\n\u0146\3\u0146\3\u0146\3\u0147\3\u0147\3\u0148\3\u0148\3\u0148"+
		"\3\u0148\3\u0148\3\u0148\3\u0148\3\u0149\3\u0149\3\u014a\3\u014a\3\u014a"+
		"\3\u014a\3\u014a\3\u014a\3\u014a\3\u014a\3\u014a\3\u014a\3\u014a\3\u014a"+
		"\5\u014a\u0eda\n\u014a\3\u014b\3\u014b\6\u014b\u0ede\n\u014b\r\u014b\16"+
		"\u014b\u0edf\3\u014c\3\u014c\3\u014c\3\u014d\3\u014d\3\u014d\5\u014d\u0ee8"+
		"\n\u014d\3\u014e\3\u014e\3\u014e\5\u014e\u0eed\n\u014e\3\u014f\3\u014f"+
		"\3\u014f\3\u0150\3\u0150\3\u0151\3\u0151\3\u0151\3\u0152\3\u0152\3\u0152"+
		"\3\u0152\3\u0152\3\u0152\3\u0152\3\u0152\3\u0152\3\u0152\3\u0152\3\u0152"+
		"\3\u0152\3\u0152\3\u0152\5\u0152\u0f06\n\u0152\3\u0153\3\u0153\3\u0153"+
		"\3\u0153\3\u0153\3\u0153\3\u0153\3\u0153\3\u0153\3\u0153\3\u0153\3\u0153"+
		"\5\u0153\u0f14\n\u0153\3\u0154\3\u0154\3\u0154\3\u0154\3\u0154\3\u0154"+
		"\3\u0154\3\u0154\3\u0154\3\u0154\3\u0154\5\u0154\u0f21\n\u0154\3\u0155"+
		"\3\u0155\3\u0156\5\u0156\u0f26\n\u0156\3\u0156\3\u0156\3\u0156\3\u0156"+
		"\3\u0156\5\u0156\u0f2d\n\u0156\3\u0157\3\u0157\3\u0158\3\u0158\3\u0159"+
		"\3\u0159\3\u015a\3\u015a\3\u015b\3\u015b\3\u015c\3\u015c\3\u015d\3\u015d"+
		"\3\u015e\3\u015e\3\u015f\3\u015f\3\u0160\3\u0160\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\7\u0161\u0f4b\n\u0161\f\u0161"+
		"\16\u0161\u0f4e\13\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\5\u0161\u0f5c\n\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\5\u0161\u0f7c\n\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\5\u0161\u0f83\n\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\3\u0161\5\u0161\u0f93\n\u0161\3\u0161\3\u0161\3\u0161\3\u0161\3\u0161"+
		"\5\u0161\u0f9a\n\u0161\3\u0161\3\u0161\7\u0161\u0f9e\n\u0161\f\u0161\16"+
		"\u0161\u0fa1\13\u0161\3\u0162\3\u0162\5\u0162\u0fa5\n\u0162\3\u0163\3"+
		"\u0163\3\u0163\3\u0163\3\u0164\3\u0164\3\u0165\3\u0165\3\u0166\3\u0166"+
		"\5\u0166\u0fb1\n\u0166\3\u0167\3\u0167\3\u0167\3\u0167\3\u0167\7\u0167"+
		"\u0fb8\n\u0167\f\u0167\16\u0167\u0fbb\13\u0167\3\u0167\3\u0167\3\u0168"+
		"\3\u0168\3\u0168\5\u0168\u0fc2\n\u0168\3\u0169\3\u0169\3\u0169\3\u0169"+
		"\3\u0169\7\u0169\u0fc9\n\u0169\f\u0169\16\u0169\u0fcc\13\u0169\3\u0169"+
		"\3\u0169\3\u016a\3\u016a\3\u016a\3\u016a\3\u016b\3\u016b\3\u016c\3\u016c"+
		"\3\u016d\3\u016d\3\u016d\5\u016d\u0fdb\n\u016d\3\u016e\3\u016e\5\u016e"+
		"\u0fdf\n\u016e\3\u016f\3\u016f\3\u016f\3\u016f\3\u016f\5\u016f\u0fe6\n"+
		"\u016f\3\u0170\3\u0170\5\u0170\u0fea\n\u0170\3\u0171\3\u0171\3\u0172\3"+
		"\u0172\3\u0172\2\3\u02c0\u0173\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2"+
		"\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea"+
		"\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202"+
		"\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214\u0216\u0218\u021a"+
		"\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a\u022c\u022e\u0230\u0232"+
		"\u0234\u0236\u0238\u023a\u023c\u023e\u0240\u0242\u0244\u0246\u0248\u024a"+
		"\u024c\u024e\u0250\u0252\u0254\u0256\u0258\u025a\u025c\u025e\u0260\u0262"+
		"\u0264\u0266\u0268\u026a\u026c\u026e\u0270\u0272\u0274\u0276\u0278\u027a"+
		"\u027c\u027e\u0280\u0282\u0284\u0286\u0288\u028a\u028c\u028e\u0290\u0292"+
		"\u0294\u0296\u0298\u029a\u029c\u029e\u02a0\u02a2\u02a4\u02a6\u02a8\u02aa"+
		"\u02ac\u02ae\u02b0\u02b2\u02b4\u02b6\u02b8\u02ba\u02bc\u02be\u02c0\u02c2"+
		"\u02c4\u02c6\u02c8\u02ca\u02cc\u02ce\u02d0\u02d2\u02d4\u02d6\u02d8\u02da"+
		"\u02dc\u02de\u02e0\u02e2\2$\3\2\u0135\u0138\3\2\u00e3\u00e4\4\2\u00b7"+
		"\u00b7\u00ba\u00ba\3\2\u0088\u0089\4\2\17\17JJ\3\2\u0092\u0093\4\2\u00b8"+
		"\u00b8\u00bb\u00bb\4\2\27\27\u00b6\u00b6\3\2\u00c3\u00c4\13\2\5\5\31\31"+
		"\33\33CCEEKK\u00af\u00af\u00c0\u00c0\u00e1\u00e2\5\2KK\u0088\u0088\u014d"+
		"\u014d\4\2\u008f\u0090\u00da\u00da\3\2\177\u0080\3\2\u0126\u0127\3\2\16"+
		"\17\4\2\5\5\32\32\3\2\u00ec\u00ed\4\2mm\u0086\u0086\3\2\u00e6\u00e7\5"+
		"\2\u010b\u010b\u010d\u0110\u0112\u0114\4\2\u010b\u010b\u010d\u0114\4\2"+
		"\u016c\u016c\u0171\u0171\4\2\u0160\u0161\u0166\u0166\4\2\u015f\u015f\u0162"+
		"\u0164\3\2\u0160\u0161\4\2\n\n\u008a\u008b\3\2\u0158\u015e\3\2\7\b\4\2"+
		"\5\5\13\13\3\2\3\4\4\2\u0158\u0158\u015a\u015e\17\2\7\n\f\fOU__be\u008a"+
		"\u008b\u00a4\u00a5\u00b6\u00b6\u00ce\u00ce\u00d0\u00d0\u012e\u012e\u0158"+
		"\u0167\u0169\u0169\66\2\16\21\34\34&&(\61\65\67:;=@FFHILLNNPPXX\\\\__"+
		"cceegikkn\u0081\u0083\u0083\u0088\u0089\u008c\u008c\u008f\u0091\u0093"+
		"\u0096\u0098\u009c\u009e\u00a3\u00a9\u00ae\u00b0\u00b0\u00b4\u00b5\u00b8"+
		"\u00bb\u00be\u00c4\u00c6\u00c8\u00ca\u00ca\u00cc\u00cd\u00d2\u00d2\u00d5"+
		"\u00d7\u00d9\u00e1\u00e3\u00e5\u00e8\u00e8\u00f5\u00f5\u00f7\u00f7\u00f9"+
		"\u00fa\u00fd\u0105\u0107\u0107\u010a\u0114\u0116\u0116\u0119\u0119\u011b"+
		"\u0120\u0125\u0129\u012b\u012c\u0130\u014b\f\2\f\fOOQUWWYYbbdd\u00d0\u00d0"+
		"\u00ef\u00f0\u00f4\u00f4\2\u113d\2\u02e9\3\2\2\2\4\u02f0\3\2\2\2\6\u02f4"+
		"\3\2\2\2\b\u02f6\3\2\2\2\n\u0310\3\2\2\2\f\u0312\3\2\2\2\16\u0314\3\2"+
		"\2\2\20\u0322\3\2\2\2\22\u0324\3\2\2\2\24\u0334\3\2\2\2\26\u033d\3\2\2"+
		"\2\30\u0345\3\2\2\2\32\u0352\3\2\2\2\34\u0369\3\2\2\2\36\u0378\3\2\2\2"+
		" \u037c\3\2\2\2\"\u0384\3\2\2\2$\u03b7\3\2\2\2&\u03b9\3\2\2\2(\u03bc\3"+
		"\2\2\2*\u03be\3\2\2\2,\u03c2\3\2\2\2.\u03c5\3\2\2\2\60\u03c8\3\2\2\2\62"+
		"\u03cc\3\2\2\2\64\u03cf\3\2\2\2\66\u03e0\3\2\2\28\u03e3\3\2\2\2:\u03e7"+
		"\3\2\2\2<\u03ef\3\2\2\2>\u03f2\3\2\2\2@\u03fb\3\2\2\2B\u03fe\3\2\2\2D"+
		"\u043c\3\2\2\2F\u0446\3\2\2\2H\u046b\3\2\2\2J\u047e\3\2\2\2L\u048d\3\2"+
		"\2\2N\u048f\3\2\2\2P\u049a\3\2\2\2R\u049e\3\2\2\2T\u04a3\3\2\2\2V\u04a5"+
		"\3\2\2\2X\u04aa\3\2\2\2Z\u04af\3\2\2\2\\\u04b4\3\2\2\2^\u04b8\3\2\2\2"+
		"`\u04c0\3\2\2\2b\u04c5\3\2\2\2d\u04c9\3\2\2\2f\u04dd\3\2\2\2h\u04ea\3"+
		"\2\2\2j\u04f2\3\2\2\2l\u04f4\3\2\2\2n\u04fd\3\2\2\2p\u0501\3\2\2\2r\u0508"+
		"\3\2\2\2t\u050f\3\2\2\2v\u0516\3\2\2\2x\u0519\3\2\2\2z\u0534\3\2\2\2|"+
		"\u053f\3\2\2\2~\u0543\3\2\2\2\u0080\u0545\3\2\2\2\u0082\u0552\3\2\2\2"+
		"\u0084\u0554\3\2\2\2\u0086\u055c\3\2\2\2\u0088\u0565\3\2\2\2\u008a\u0567"+
		"\3\2\2\2\u008c\u056c\3\2\2\2\u008e\u0570\3\2\2\2\u0090\u0578\3\2\2\2\u0092"+
		"\u057c\3\2\2\2\u0094\u0585\3\2\2\2\u0096\u0587\3\2\2\2\u0098\u058d\3\2"+
		"\2\2\u009a\u0591\3\2\2\2\u009c\u059e\3\2\2\2\u009e\u05a0\3\2\2\2\u00a0"+
		"\u05a4\3\2\2\2\u00a2\u05d0\3\2\2\2\u00a4\u05d8\3\2\2\2\u00a6\u05de\3\2"+
		"\2\2\u00a8\u05e2\3\2\2\2\u00aa\u05e5\3\2\2\2\u00ac\u05f0\3\2\2\2\u00ae"+
		"\u0601\3\2\2\2\u00b0\u0603\3\2\2\2\u00b2\u0608\3\2\2\2\u00b4\u061c\3\2"+
		"\2\2\u00b6\u0620\3\2\2\2\u00b8\u0627\3\2\2\2\u00ba\u0637\3\2\2\2\u00bc"+
		"\u06c3\3\2\2\2\u00be\u06c5\3\2\2\2\u00c0\u06cd\3\2\2\2\u00c2\u06d2\3\2"+
		"\2\2\u00c4\u06d4\3\2\2\2\u00c6\u06da\3\2\2\2\u00c8\u06de\3\2\2\2\u00ca"+
		"\u06e2\3\2\2\2\u00cc\u06e6\3\2\2\2\u00ce\u06f0\3\2\2\2\u00d0\u06fb\3\2"+
		"\2\2\u00d2\u070c\3\2\2\2\u00d4\u071e\3\2\2\2\u00d6\u0723\3\2\2\2\u00d8"+
		"\u0726\3\2\2\2\u00da\u072a\3\2\2\2\u00dc\u0731\3\2\2\2\u00de\u073a\3\2"+
		"\2\2\u00e0\u0740\3\2\2\2\u00e2\u0742\3\2\2\2\u00e4\u0752\3\2\2\2\u00e6"+
		"\u0767\3\2\2\2\u00e8\u0769\3\2\2\2\u00ea\u0771\3\2\2\2\u00ec\u0778\3\2"+
		"\2\2\u00ee\u077a\3\2\2\2\u00f0\u0788\3\2\2\2\u00f2\u078a\3\2\2\2\u00f4"+
		"\u078e\3\2\2\2\u00f6\u0792\3\2\2\2\u00f8\u0796\3\2\2\2\u00fa\u079a\3\2"+
		"\2\2\u00fc\u07a9\3\2\2\2\u00fe\u07b1\3\2\2\2\u0100\u07b4\3\2\2\2\u0102"+
		"\u07b6\3\2\2\2\u0104\u07c2\3\2\2\2\u0106\u07cc\3\2\2\2\u0108\u07cf\3\2"+
		"\2\2\u010a\u07da\3\2\2\2\u010c\u07e2\3\2\2\2\u010e\u07fd\3\2\2\2\u0110"+
		"\u0819\3\2\2\2\u0112\u081f\3\2\2\2\u0114\u0826\3\2\2\2\u0116\u0830\3\2"+
		"\2\2\u0118\u0834\3\2\2\2\u011a\u0836\3\2\2\2\u011c\u0839\3\2\2\2\u011e"+
		"\u0846\3\2\2\2\u0120\u0857\3\2\2\2\u0122\u0865\3\2\2\2\u0124\u0867\3\2"+
		"\2\2\u0126\u086a\3\2\2\2\u0128\u086d\3\2\2\2\u012a\u0876\3\2\2\2\u012c"+
		"\u088a\3\2\2\2\u012e\u088c\3\2\2\2\u0130\u088f\3\2\2\2\u0132\u08a3\3\2"+
		"\2\2\u0134\u08a5\3\2\2\2\u0136\u08a9\3\2\2\2\u0138\u08ab\3\2\2\2\u013a"+
		"\u08b4\3\2\2\2\u013c\u08ba\3\2\2\2\u013e\u08c0\3\2\2\2\u0140\u08c5\3\2"+
		"\2\2\u0142\u08e1\3\2\2\2\u0144\u08e3\3\2\2\2\u0146\u08e6\3\2\2\2\u0148"+
		"\u08ee\3\2\2\2\u014a\u08f6\3\2\2\2\u014c\u08fe\3\2\2\2\u014e\u0906\3\2"+
		"\2\2\u0150\u0908\3\2\2\2\u0152\u0915\3\2\2\2\u0154\u091d\3\2\2\2\u0156"+
		"\u0926\3\2\2\2\u0158\u0928\3\2\2\2\u015a\u092a\3\2\2\2\u015c\u092f\3\2"+
		"\2\2\u015e\u0935\3\2\2\2\u0160\u0939\3\2\2\2\u0162\u093f\3\2\2\2\u0164"+
		"\u0945\3\2\2\2\u0166\u094a\3\2\2\2\u0168\u0955\3\2\2\2\u016a\u0962\3\2"+
		"\2\2\u016c\u0964\3\2\2\2\u016e\u096c\3\2\2\2\u0170\u0970\3\2\2\2\u0172"+
		"\u0978\3\2\2\2\u0174\u097c\3\2\2\2\u0176\u097e\3\2\2\2\u0178\u0984\3\2"+
		"\2\2\u017a\u0986\3\2\2\2\u017c\u098d\3\2\2\2\u017e\u0995\3\2\2\2\u0180"+
		"\u099a\3\2\2\2\u0182\u09a1\3\2\2\2\u0184\u09a9\3\2\2\2\u0186\u09ad\3\2"+
		"\2\2\u0188\u09af\3\2\2\2\u018a\u09ba\3\2\2\2\u018c\u09be\3\2\2\2\u018e"+
		"\u09ca\3\2\2\2\u0190\u09d2\3\2\2\2\u0192\u09d6\3\2\2\2\u0194\u09e2\3\2"+
		"\2\2\u0196\u09e8\3\2\2\2\u0198\u09eb\3\2\2\2\u019a\u09ee\3\2\2\2\u019c"+
		"\u09f1\3\2\2\2\u019e\u09f8\3\2\2\2\u01a0\u09fa\3\2\2\2\u01a2\u0a07\3\2"+
		"\2\2\u01a4\u0a30\3\2\2\2\u01a6\u0a32\3\2\2\2\u01a8\u0a37\3\2\2\2\u01aa"+
		"\u0a3c\3\2\2\2\u01ac\u0a43\3\2\2\2\u01ae\u0a60\3\2\2\2\u01b0\u0a63\3\2"+
		"\2\2\u01b2\u0a69\3\2\2\2\u01b4\u0a6b\3\2\2\2\u01b6\u0a74\3\2\2\2\u01b8"+
		"\u0a7a\3\2\2\2\u01ba\u0a83\3\2\2\2\u01bc\u0a8f\3\2\2\2\u01be\u0aa5\3\2"+
		"\2\2\u01c0\u0aa7\3\2\2\2\u01c2\u0abd\3\2\2\2\u01c4\u0ac2\3\2\2\2\u01c6"+
		"\u0b05\3\2\2\2\u01c8\u0b19\3\2\2\2\u01ca\u0b28\3\2\2\2\u01cc\u0b34\3\2"+
		"\2\2\u01ce\u0b36\3\2\2\2\u01d0\u0b3c\3\2\2\2\u01d2\u0b40\3\2\2\2\u01d4"+
		"\u0b49\3\2\2\2\u01d6\u0b53\3\2\2\2\u01d8\u0b55\3\2\2\2\u01da\u0b63\3\2"+
		"\2\2\u01dc\u0b69\3\2\2\2\u01de\u0b6b\3\2\2\2\u01e0\u0b6f\3\2\2\2\u01e2"+
		"\u0b71\3\2\2\2\u01e4\u0b75\3\2\2\2\u01e6\u0b79\3\2\2\2\u01e8\u0b7d\3\2"+
		"\2\2\u01ea\u0b84\3\2\2\2\u01ec\u0b97\3\2\2\2\u01ee\u0b9d\3\2\2\2\u01f0"+
		"\u0ba9\3\2\2\2\u01f2\u0bb0\3\2\2\2\u01f4\u0bb8\3\2\2\2\u01f6\u0bba\3\2"+
		"\2\2\u01f8\u0bce\3\2\2\2\u01fa\u0bd0\3\2\2\2\u01fc\u0bd8\3\2\2\2\u01fe"+
		"\u0c0d\3\2\2\2\u0200\u0c13\3\2\2\2\u0202\u0c35\3\2\2\2\u0204\u0c37\3\2"+
		"\2\2\u0206\u0c3f\3\2\2\2\u0208\u0c48\3\2\2\2\u020a\u0c58\3\2\2\2\u020c"+
		"\u0c5c\3\2\2\2\u020e\u0c66\3\2\2\2\u0210\u0c70\3\2\2\2\u0212\u0c78\3\2"+
		"\2\2\u0214\u0c80\3\2\2\2\u0216\u0c87\3\2\2\2\u0218\u0c89\3\2\2\2\u021a"+
		"\u0c8b\3\2\2\2\u021c\u0c93\3\2\2\2\u021e\u0c9b\3\2\2\2\u0220\u0ca7\3\2"+
		"\2\2\u0222\u0cc9\3\2\2\2\u0224\u0ccb\3\2\2\2\u0226\u0cdd\3\2\2\2\u0228"+
		"\u0ce6\3\2\2\2\u022a\u0ceb\3\2\2\2\u022c\u0cef\3\2\2\2\u022e\u0d09\3\2"+
		"\2\2\u0230\u0d46\3\2\2\2\u0232\u0d48\3\2\2\2\u0234\u0d4a\3\2\2\2\u0236"+
		"\u0d67\3\2\2\2\u0238\u0d6b\3\2\2\2\u023a\u0d6d\3\2\2\2\u023c\u0d7a\3\2"+
		"\2\2\u023e\u0d89\3\2\2\2\u0240\u0d8e\3\2\2\2\u0242\u0d92\3\2\2\2\u0244"+
		"\u0da5\3\2\2\2\u0246\u0daa\3\2\2\2\u0248\u0dac\3\2\2\2\u024a\u0dc8\3\2"+
		"\2\2\u024c\u0dcb\3\2\2\2\u024e\u0dcd\3\2\2\2\u0250\u0dd0\3\2\2\2\u0252"+
		"\u0dd8\3\2\2\2\u0254\u0dda\3\2\2\2\u0256\u0def\3\2\2\2\u0258\u0df6\3\2"+
		"\2\2\u025a\u0df8\3\2\2\2\u025c\u0dfb\3\2\2\2\u025e\u0e07\3\2\2\2\u0260"+
		"\u0e1f\3\2\2\2\u0262\u0e21\3\2\2\2\u0264\u0e2e\3\2\2\2\u0266\u0e30\3\2"+
		"\2\2\u0268\u0e33\3\2\2\2\u026a\u0e35\3\2\2\2\u026c\u0e39\3\2\2\2\u026e"+
		"\u0e3f\3\2\2\2\u0270\u0e45\3\2\2\2\u0272\u0e47\3\2\2\2\u0274\u0e52\3\2"+
		"\2\2\u0276\u0e5a\3\2\2\2\u0278\u0e64\3\2\2\2\u027a\u0e68\3\2\2\2\u027c"+
		"\u0e6c\3\2\2\2\u027e\u0e70\3\2\2\2\u0280\u0e76\3\2\2\2\u0282\u0e8f\3\2"+
		"\2\2\u0284\u0e91\3\2\2\2\u0286\u0e98\3\2\2\2\u0288\u0ea9\3\2\2\2\u028a"+
		"\u0eb9\3\2\2\2\u028c\u0ec2\3\2\2\2\u028e\u0ec4\3\2\2\2\u0290\u0ecb\3\2"+
		"\2\2\u0292\u0ed9\3\2\2\2\u0294\u0edb\3\2\2\2\u0296\u0ee1\3\2\2\2\u0298"+
		"\u0ee7\3\2\2\2\u029a\u0eec\3\2\2\2\u029c\u0eee\3\2\2\2\u029e\u0ef1\3\2"+
		"\2\2\u02a0\u0ef3\3\2\2\2\u02a2\u0f05\3\2\2\2\u02a4\u0f13\3\2\2\2\u02a6"+
		"\u0f20\3\2\2\2\u02a8\u0f22\3\2\2\2\u02aa\u0f25\3\2\2\2\u02ac\u0f2e\3\2"+
		"\2\2\u02ae\u0f30\3\2\2\2\u02b0\u0f32\3\2\2\2\u02b2\u0f34\3\2\2\2\u02b4"+
		"\u0f36\3\2\2\2\u02b6\u0f38\3\2\2\2\u02b8\u0f3a\3\2\2\2\u02ba\u0f3c\3\2"+
		"\2\2\u02bc\u0f3e\3\2\2\2\u02be\u0f40\3\2\2\2\u02c0\u0f5b\3\2\2\2\u02c2"+
		"\u0fa4\3\2\2\2\u02c4\u0fa6\3\2\2\2\u02c6\u0faa\3\2\2\2\u02c8\u0fac\3\2"+
		"\2\2\u02ca\u0fae\3\2\2\2\u02cc\u0fb2\3\2\2\2\u02ce\u0fbe\3\2\2\2\u02d0"+
		"\u0fc3\3\2\2\2\u02d2\u0fcf\3\2\2\2\u02d4\u0fd3\3\2\2\2\u02d6\u0fd5\3\2"+
		"\2\2\u02d8\u0fda\3\2\2\2\u02da\u0fde\3\2\2\2\u02dc\u0fe5\3\2\2\2\u02de"+
		"\u0fe9\3\2\2\2\u02e0\u0feb\3\2\2\2\u02e2\u0fed\3\2\2\2\u02e4\u02e5\5\6"+
		"\4\2\u02e5\u02e6\5\4\3\2\u02e6\u02e8\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7\2\2\3\u02ed\3\3\2\2\2\u02ee\u02f1"+
		"\7\u0151\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02ef\3\2\2"+
		"\2\u02f1\5\3\2\2\2\u02f2\u02f5\5\b\5\2\u02f3\u02f5\5\20\t\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\7\3\2\2\2\u02f6\u0300\7\u0091\2\2\u02f7"+
		"\u02f9\5\n\6\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd"+
		"\u0301\5\20\t\2\u02fe\u02ff\7\u0105\2\2\u02ff\u0301\5\u01b0\u00d9\2\u0300"+
		"\u02fa\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\t\3\2\2\2\u0302\u0311\7\u0092"+
		"\2\2\u0303\u0311\7\u0093\2\2\u0304\u0311\7\u0094\2\2\u0305\u0311\7\u0095"+
		"\2\2\u0306\u0311\7\u0106\2\2\u0307\u0311\7\u00cc\2\2\u0308\u0311\7\u0107"+
		"\2\2\u0309\u030b\7\u0134\2\2\u030a\u030c\5\f\7\2\u030b\u030a\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f\5\16\b\2\u030e\u030d\3"+
		"\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0302\3\2\2\2\u0310"+
		"\u0303\3\2\2\2\u0310\u0304\3\2\2\2\u0310\u0305\3\2\2\2\u0310\u0306\3\2"+
		"\2\2\u0310\u0307\3\2\2\2\u0310\u0308\3\2\2\2\u0310\u0309\3\2\2\2\u0311"+
		"\13\3\2\2\2\u0312\u0313\7\u011a\2\2\u0313\r\3\2\2\2\u0314\u0315\t\2\2"+
		"\2\u0315\17\3\2\2\2\u0316\u0323\5\u01b0\u00d9\2\u0317\u0323\5\22\n\2\u0318"+
		"\u0323\5\26\f\2\u0319\u0323\5\30\r\2\u031a\u0323\5\32\16\2\u031b\u0323"+
		"\5\34\17\2\u031c\u0323\5\"\22\2\u031d\u0323\5$\23\2\u031e\u0323\5\u01ce"+
		"\u00e8\2\u031f\u0323\5\u01d4\u00eb\2\u0320\u0323\5\u01d6\u00ec\2\u0321"+
		"\u0323\5\u01ea\u00f6\2\u0322\u0316\3\2\2\2\u0322\u0317\3\2\2\2\u0322\u0318"+
		"\3\2\2\2\u0322\u0319\3\2\2\2\u0322\u031a\3\2\2\2\u0322\u031b\3\2\2\2\u0322"+
		"\u031c\3\2\2\2\u0322\u031d\3\2\2\2\u0322\u031e\3\2\2\2\u0322\u031f\3\2"+
		"\2\2\u0322\u0320\3\2\2\2\u0322\u0321\3\2\2\2\u0323\21\3\2\2\2\u0324\u0325"+
		"\7:\2\2\u0325\u0327\7?\2\2\u0326\u0328\7\62\2\2\u0327\u0326\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\7@\2\2\u032a\u032c\7\u016c"+
		"\2\2\u032b\u032d\7\34\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u032f\7j\2\2\u032f\u0330\7\'\2\2\u0330\u0332\5\u02ca"+
		"\u0166\2\u0331\u0333\5\u00b0Y\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2"+
		"\2\u0333\23\3\2\2\2\u0334\u0336\7\u00e9\2\2\u0335\u0337\7>\2\2\u0336\u0335"+
		"\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\7=\2\2\u0339"+
		"\u033a\7\u0152\2\2\u033a\u033b\7\u016c\2\2\u033b\u033c\7\u0153\2\2\u033c"+
		"\25\3\2\2\2\u033d\u033e\7;\2\2\u033e\u033f\7\'\2\2\u033f\u0340\5\u02ca"+
		"\u0166\2\u0340\u0341\7M\2\2\u0341\u0343\7\u016c\2\2\u0342\u0344\5\24\13"+
		"\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\27\3\2\2\2\u0345\u034b"+
		"\7<\2\2\u0346\u0348\7D\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u0349\3\2\2\2\u0349\u034a\7\'\2\2\u034a\u034c\5\u02ca\u0166\2\u034b\u0347"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7\27\2\2"+
		"\u034e\u0350\7\u016c\2\2\u034f\u0351\5\u0144\u00a3\2\u0350\u034f\3\2\2"+
		"\2\u0350\u0351\3\2\2\2\u0351\31\3\2\2\2\u0352\u0353\7\u0131\2\2\u0353"+
		"\u0354\7\u0132\2\2\u0354\u0357\5\u02da\u016e\2\u0355\u0356\7\u014e\2\2"+
		"\u0356\u0358\5\u02da\u016e\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"\u0363\3\2\2\2\u0359\u035a\7\27\2\2\u035a\u035d\7\u0171\2\2\u035b\u035c"+
		"\7M\2\2\u035c\u035e\7\u0171\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2"+
		"\2\u035e\u0361\3\2\2\2\u035f\u0360\7\u009b\2\2\u0360\u0362\7\u0171\2\2"+
		"\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0359"+
		"\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0366\7\u0097\2"+
		"\2\u0366\u0368\5\36\20\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\33\3\2\2\2\u0369\u036a\7\u0131\2\2\u036a\u0370\7:\2\2\u036b\u036e\5\u02da"+
		"\u016e\2\u036c\u036d\7\u014e\2\2\u036d\u036f\5\u02da\u016e\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036b\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\7\27\2\2\u0373\u0376\7"+
		"\u016c\2\2\u0374\u0375\7\u0097\2\2\u0375\u0377\5\36\20\2\u0376\u0374\3"+
		"\2\2\2\u0376\u0377\3\2\2\2\u0377\35\3\2\2\2\u0378\u0379\7\u0152\2\2\u0379"+
		"\u037a\5 \21\2\u037a\u037b\7\u0153\2\2\u037b\37\3\2\2\2\u037c\u0381\5"+
		"\u0134\u009b\2\u037d\u037e\7\u0150\2\2\u037e\u0380\5\u0134\u009b\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2"+
		"\2\2\u0382!\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\7\u0131\2\2\u0385"+
		"\u0386\7\u0133\2\2\u0386\u0389\5\u02da\u016e\2\u0387\u0388\7\u014e\2\2"+
		"\u0388\u038a\5\u02da\u016e\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038d\3\2\2\2\u038b\u038c\7\u0097\2\2\u038c\u038e\5\36\20\2\u038d\u038b"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e#\3\2\2\2\u038f\u03b8\5\64\33\2\u0390"+
		"\u03b8\5<\37\2\u0391\u03b8\5> \2\u0392\u03b8\5B\"\2\u0393\u03b8\5F$\2"+
		"\u0394\u03b8\5D#\2\u0395\u03b8\5H%\2\u0396\u03b8\5\u00b8]\2\u0397\u03b8"+
		"\5\u00bc_\2\u0398\u03b8\5\u00fa~\2\u0399\u03b8\5\u010c\u0087\2\u039a\u03b8"+
		"\5\u010e\u0088\2\u039b\u03b8\5\u0112\u008a\2\u039c\u03b8\5\u0114\u008b"+
		"\2\u039d\u03b8\5\u0102\u0082\2\u039e\u03b8\5\u0108\u0085\2\u039f\u03b8"+
		"\5\u0104\u0083\2\u03a0\u03b8\5\u0106\u0084\2\u03a1\u03b8\5\u010a\u0086"+
		"\2\u03a2\u03b8\5\u00ba^\2\u03a3\u03b8\5\u00be`\2\u03a4\u03b8\5\u00c4c"+
		"\2\u03a5\u03b8\5\u00c0a\2\u03a6\u03b8\5\u00c6d\2\u03a7\u03b8\5\u00c8e"+
		"\2\u03a8\u03b8\5\u00caf\2\u03a9\u03b8\5\u00ccg\2\u03aa\u03b8\5\u00ceh"+
		"\2\u03ab\u03b8\5\u00dco\2\u03ac\u03b8\5\u00d4k\2\u03ad\u03b8\5\u00dep"+
		"\2\u03ae\u03b8\5\u00d6l\2\u03af\u03b8\5\u00d0i\2\u03b0\u03b8\5\u00d2j"+
		"\2\u03b1\u03b8\5\u00dan\2\u03b2\u03b8\5\u00d8m\2\u03b3\u03b8\5\u01e8\u00f5"+
		"\2\u03b4\u03b8\5\u01f6\u00fc\2\u03b5\u03b8\5\u00a0Q\2\u03b6\u03b8\5\u00a4"+
		"S\2\u03b7\u038f\3\2\2\2\u03b7\u0390\3\2\2\2\u03b7\u0391\3\2\2\2\u03b7"+
		"\u0392\3\2\2\2\u03b7\u0393\3\2\2\2\u03b7\u0394\3\2\2\2\u03b7\u0395\3\2"+
		"\2\2\u03b7\u0396\3\2\2\2\u03b7\u0397\3\2\2\2\u03b7\u0398\3\2\2\2\u03b7"+
		"\u0399\3\2\2\2\u03b7\u039a\3\2\2\2\u03b7\u039b\3\2\2\2\u03b7\u039c\3\2"+
		"\2\2\u03b7\u039d\3\2\2\2\u03b7\u039e\3\2\2\2\u03b7\u039f\3\2\2\2\u03b7"+
		"\u03a0\3\2\2\2\u03b7\u03a1\3\2\2\2\u03b7\u03a2\3\2\2\2\u03b7\u03a3\3\2"+
		"\2\2\u03b7\u03a4\3\2\2\2\u03b7\u03a5\3\2\2\2\u03b7\u03a6\3\2\2\2\u03b7"+
		"\u03a7\3\2\2\2\u03b7\u03a8\3\2\2\2\u03b7\u03a9\3\2\2\2\u03b7\u03aa\3\2"+
		"\2\2\u03b7\u03ab\3\2\2\2\u03b7\u03ac\3\2\2\2\u03b7\u03ad\3\2\2\2\u03b7"+
		"\u03ae\3\2\2\2\u03b7\u03af\3\2\2\2\u03b7\u03b0\3\2\2\2\u03b7\u03b1\3\2"+
		"\2\2\u03b7\u03b2\3\2\2\2\u03b7\u03b3\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b7"+
		"\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8%\3\2\2\2\u03b9\u03ba\7\f\2\2"+
		"\u03ba\u03bb\7\r\2\2\u03bb\'\3\2\2\2\u03bc\u03bd\t\3\2\2\u03bd)\3\2\2"+
		"\2\u03be\u03bf\7\f\2\2\u03bf\u03c0\7\t\2\2\u03c0\u03c1\7\r\2\2\u03c1+"+
		"\3\2\2\2\u03c2\u03c3\7\177\2\2\u03c3\u03c4\7\u0105\2\2\u03c4-\3\2\2\2"+
		"\u03c5\u03c6\7\u0080\2\2\u03c6\u03c7\7\u0105\2\2\u03c7/\3\2\2\2\u03c8"+
		"\u03c9\7y\2\2\u03c9\u03ca\7\30\2\2\u03ca\u03cb\7\u00e8\2\2\u03cb\61\3"+
		"\2\2\2\u03cc\u03cd\7\b\2\2\u03cd\u03ce\7\u0089\2\2\u03ce\63\3\2\2\2\u03cf"+
		"\u03d0\7C\2\2\u03d0\u03d2\t\4\2\2\u03d1\u03d3\5*\26\2\u03d2\u03d1\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\5\u02da\u016e"+
		"\2\u03d5\u03d7\5@!\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9"+
		"\3\2\2\2\u03d8\u03da\5\66\34\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2"+
		"\u03da\u03de\3\2\2\2\u03db\u03dc\7\u0097\2\2\u03dc\u03dd\7\u009a\2\2\u03dd"+
		"\u03df\58\35\2\u03de\u03db\3\2\2\2\u03de\u03df\3\2\2\2\u03df\65\3\2\2"+
		"\2\u03e0\u03e1\7\u0081\2\2\u03e1\u03e2\7\u016c\2\2\u03e2\67\3\2\2\2\u03e3"+
		"\u03e4\7\u0152\2\2\u03e4\u03e5\5:\36\2\u03e5\u03e6\7\u0153\2\2\u03e69"+
		"\3\2\2\2\u03e7\u03ec\5\u0134\u009b\2\u03e8\u03e9\7\u0150\2\2\u03e9\u03eb"+
		"\5\u0134\u009b\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee\3\2\2\2\u03ec\u03ea\3"+
		"\2\2\2\u03ec\u03ed\3\2\2\2\u03ed;\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef\u03f0"+
		"\7\u00de\2\2\u03f0\u03f1\5\u02da\u016e\2\u03f1=\3\2\2\2\u03f2\u03f3\7"+
		"K\2\2\u03f3\u03f5\t\4\2\2\u03f4\u03f6\5&\24\2\u03f5\u03f4\3\2\2\2\u03f5"+
		"\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\5\u02da\u016e\2\u03f8\u03fa"+
		"\5(\25\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa?\3\2\2\2\u03fb"+
		"\u03fc\7N\2\2\u03fc\u03fd\7\u016c\2\2\u03fdA\3\2\2\2\u03fe\u0400\7C\2"+
		"\2\u03ff\u0401\7\u008c\2\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0403\3\2\2\2\u0402\u0404\7D\2\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0407\7\'\2\2\u0406\u0408\5*\26\2\u0407"+
		"\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u043a\5\u023e"+
		"\u0120\2\u040a\u040b\7\n\2\2\u040b\u040d\5\u023e\u0120\2\u040c\u040e\5"+
		"\u012c\u0097\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2"+
		"\2\2\u040f\u0411\5\u0142\u00a2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2"+
		"\2\u0411\u0413\3\2\2\2\u0412\u0414\5\u0144\u00a3\2\u0413\u0412\3\2\2\2"+
		"\u0413\u0414\3\2\2\2\u0414\u0416\3\2\2\2\u0415\u0417\5\u012e\u0098\2\u0416"+
		"\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u043b\3\2\2\2\u0418\u0419\7\u0152"+
		"\2\2\u0419\u041a\5\u0148\u00a5\2\u041a\u041b\7\u0153\2\2\u041b\u041d\3"+
		"\2\2\2\u041c\u0418\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e"+
		"\u0420\5\u011a\u008e\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422"+
		"\3\2\2\2\u0421\u0423\5\u011c\u008f\2\u0422\u0421\3\2\2\2\u0422\u0423\3"+
		"\2\2\2\u0423\u0425\3\2\2\2\u0424\u0426\5\u011e\u0090\2\u0425\u0424\3\2"+
		"\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427\u0429\5\u0120\u0091"+
		"\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u042c"+
		"\5\u012c\u0097\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042e\3"+
		"\2\2\2\u042d\u042f\5\u0142\u00a2\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2"+
		"\2\2\u042f\u0431\3\2\2\2\u0430\u0432\5\u0144\u00a3\2\u0431\u0430\3\2\2"+
		"\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0435\5\u012e\u0098\2"+
		"\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0437"+
		"\7\30\2\2\u0437\u0439\5\u01c4\u00e3\2\u0438\u0436\3\2\2\2\u0438\u0439"+
		"\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u040a\3\2\2\2\u043a\u041c\3\2\2\2\u043b"+
		"C\3\2\2\2\u043c\u043d\7\u00f6\2\2\u043d\u043e\7\'\2\2\u043e\u0444\5\u00a6"+
		"T\2\u043f\u0440\7)\2\2\u0440\u0441\7\u0152\2\2\u0441\u0442\5\u014c\u00a7"+
		"\2\u0442\u0443\7\u0153\2\2\u0443\u0445\3\2\2\2\u0444\u043f\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445E\3\2\2\2\u0446\u0447\7K\2\2\u0447\u0449\7\'\2\2\u0448"+
		"\u044a\5&\24\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044d\5\u023e\u0120\2\u044c\u044e\7\u00ca\2\2\u044d\u044c\3"+
		"\2\2\2\u044d\u044e\3\2\2\2\u044e\u0450\3\2\2\2\u044f\u0451\5\24\13\2\u0450"+
		"\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451G\3\2\2\2\u0452\u0453\7E\2\2\u0453"+
		"\u0454\7\'\2\2\u0454\u0455\5\u023e\u0120\2\u0455\u0456\5J&\2\u0456\u046c"+
		"\3\2\2\2\u0457\u0458\7E\2\2\u0458\u0459\7\u00b4\2\2\u0459\u045b\5\u023e"+
		"\u0120\2\u045a\u045c\7\30\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2"+
		"\u045c\u045d\3\2\2\2\u045d\u045e\5P)\2\u045e\u046c\3\2\2\2\u045f\u0460"+
		"\7E\2\2\u0460\u0461\7\u00b9\2\2\u0461\u0462\7\u00b4\2\2\u0462\u0463\5"+
		"\u023e\u0120\2\u0463\u0464\5R*\2\u0464\u046c\3\2\2\2\u0465\u0466\7E\2"+
		"\2\u0466\u0467\t\4\2\2\u0467\u046c\5T+\2\u0468\u0469\7E\2\2\u0469\u046a"+
		"\7*\2\2\u046a\u046c\5\u0084C\2\u046b\u0452\3\2\2\2\u046b\u0457\3\2\2\2"+
		"\u046b\u045f\3\2\2\2\u046b\u0465\3\2\2\2\u046b\u0468\3\2\2\2\u046cI\3"+
		"\2\2\2\u046d\u047f\5\\/\2\u046e\u047f\5x=\2\u046f\u047f\5l\67\2\u0470"+
		"\u047f\5p9\2\u0471\u047f\5r:\2\u0472\u047f\5t;\2\u0473\u047f\5z>\2\u0474"+
		"\u047f\5\u0094K\2\u0475\u047f\5\u0096L\2\u0476\u047f\5N(\2\u0477\u047f"+
		"\5b\62\2\u0478\u047f\5`\61\2\u0479\u047b\5\u02cc\u0167\2\u047a\u0479\3"+
		"\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\5L\'\2\u047d"+
		"\u047f\5\u00acW\2\u047e\u046d\3\2\2\2\u047e\u046e\3\2\2\2\u047e\u046f"+
		"\3\2\2\2\u047e\u0470\3\2\2\2\u047e\u0471\3\2\2\2\u047e\u0472\3\2\2\2\u047e"+
		"\u0473\3\2\2\2\u047e\u0474\3\2\2\2\u047e\u0475\3\2\2\2\u047e\u0476\3\2"+
		"\2\2\u047e\u0477\3\2\2\2\u047e\u0478\3\2\2\2\u047e\u047a\3\2\2\2\u047e"+
		"\u047d\3\2\2\2\u047fK\3\2\2\2\u0480\u048e\5\u0086D\2\u0481\u048e\5\u0092"+
		"J\2\u0482\u048e\5\u009cO\2\u0483\u048e\5\u0082B\2\u0484\u048e\5\u0098"+
		"M\2\u0485\u048e\5\u009eP\2\u0486\u048e\5\u008aF\2\u0487\u048e\5\u0088"+
		"E\2\u0488\u048e\5\u00aaV\2\u0489\u048e\5f\64\2\u048a\u048e\5h\65\2\u048b"+
		"\u048e\5d\63\2\u048c\u048e\5^\60\2\u048d\u0480\3\2\2\2\u048d\u0481\3\2"+
		"\2\2\u048d\u0482\3\2\2\2\u048d\u0483\3\2\2\2\u048d\u0484\3\2\2\2\u048d"+
		"\u0485\3\2\2\2\u048d\u0486\3\2\2\2\u048d\u0487\3\2\2\2\u048d\u0488\3\2"+
		"\2\2\u048d\u0489\3\2\2\2\u048d\u048a\3\2\2\2\u048d\u048b\3\2\2\2\u048d"+
		"\u048c\3\2\2\2\u048eM\3\2\2\2\u048f\u0490\7%\2\2\u0490\u0491\7G\2\2\u0491"+
		"\u0492\7\u0152\2\2\u0492\u0493\5\u0182\u00c2\2\u0493\u0494\7\u0153\2\2"+
		"\u0494O\3\2\2\2\u0495\u049b\5|?\2\u0496\u049b\5\\/\2\u0497\u049b\5l\67"+
		"\2\u0498\u049b\5x=\2\u0499\u049b\5\u01c4\u00e3\2\u049a\u0495\3\2\2\2\u049a"+
		"\u0496\3\2\2\2\u049a\u0497\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u0499\3\2"+
		"\2\2\u049bQ\3\2\2\2\u049c\u049f\5~@\2\u049d\u049f\5\u0080A\2\u049e\u049c"+
		"\3\2\2\2\u049e\u049d\3\2\2\2\u049fS\3\2\2\2\u04a0\u04a4\5V,\2\u04a1\u04a4"+
		"\5X-\2\u04a2\u04a4\5Z.\2\u04a3\u04a0\3\2\2\2\u04a3\u04a1\3\2\2\2\u04a3"+
		"\u04a2\3\2\2\2\u04a4U\3\2\2\2\u04a5\u04a6\5\u02da\u016e\2\u04a6\u04a7"+
		"\7\u009d\2\2\u04a7\u04a8\7\u009a\2\2\u04a8\u04a9\58\35\2\u04a9W\3\2\2"+
		"\2\u04aa\u04ab\5\u02da\u016e\2\u04ab\u04ac\7\u009d\2\2\u04ac\u04ad\7\u0100"+
		"\2\2\u04ad\u04ae\5\u00f0y\2\u04aeY\3\2\2\2\u04af\u04b0\5\u02da\u016e\2"+
		"\u04b0\u04b1\7\u009d\2\2\u04b1\u04b2\7\u0081\2\2\u04b2\u04b3\7\u016c\2"+
		"\2\u04b3[\3\2\2\2\u04b4\u04b5\7L\2\2\u04b5\u04b6\7M\2\2\u04b6\u04b7\5"+
		"\u023e\u0120\2\u04b7]\3\2\2\2\u04b8\u04b9\t\5\2\2\u04b9\u04ba\7)\2\2\u04ba"+
		"\u04bb\7\u0152\2\2\u04bb\u04bc\5\u0146\u00a4\2\u04bc\u04be\7\u0153\2\2"+
		"\u04bd\u04bf\5(\25\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf_\3"+
		"\2\2\2\u04c0\u04c3\7\u0088\2\2\u04c1\u04c4\5\u0168\u00b5\2\u04c2\u04c4"+
		"\5\u0162\u00b2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4a\3\2\2"+
		"\2\u04c5\u04c6\7K\2\2\u04c6\u04c7\7\u0124\2\2\u04c7\u04c8\5\u02da\u016e"+
		"\2\u04c8c\3\2\2\2\u04c9\u04cb\7F\2\2\u04ca\u04cc\7G\2\2\u04cb\u04ca\3"+
		"\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\5\u02da\u016e"+
		"\2\u04ce\u04cf\5\u02da\u016e\2\u04cf\u04d1\5\u019e\u00d0\2\u04d0\u04d2"+
		"\5\u0190\u00c9\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d5\3"+
		"\2\2\2\u04d3\u04d4\7N\2\2\u04d4\u04d6\7\u016c\2\2\u04d5\u04d3\3\2\2\2"+
		"\u04d5\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5j\66\2\u04d8\u04d7"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04dc\5(\25\2\u04db"+
		"\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dce\3\2\2\2\u04dd\u04de\7\u00e2"+
		"\2\2\u04de\u04df\7\u00dd\2\2\u04df\u04e1\7\u00e9\2\2\u04e0\u04e2\7G\2"+
		"\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4"+
		"\5\u02da\u016e\2\u04e4\u04e5\7\u009d\2\2\u04e5\u04e8\5\u0130\u0099\2\u04e6"+
		"\u04e7\7N\2\2\u04e7\u04e9\7\u016c\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9g\3\2\2\2\u04ea\u04eb\7\u00e2\2\2\u04eb\u04ec\7\u00dd\2"+
		"\2\u04ec\u04ed\7\u009d\2\2\u04ed\u04ee\5\u0130\u0099\2\u04eei\3\2\2\2"+
		"\u04ef\u04f3\7H\2\2\u04f0\u04f1\7I\2\2\u04f1\u04f3\5\u02da\u016e\2\u04f2"+
		"\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3k\3\2\2\2\u04f4\u04f6\7\u0088"+
		"\2\2\u04f5\u04f7\5*\26\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04f9\3\2\2\2\u04f8\u04fa\5n8\2\u04f9\u04f8\3\2\2\2\u04fa\u04fb\3\2\2"+
		"\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fcm\3\2\2\2\u04fd\u04ff"+
		"\5\u02cc\u0167\2\u04fe\u0500\5v<\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2"+
		"\2\2\u0500o\3\2\2\2\u0501\u0505\7\u00d9\2\2\u0502\u0504\5\u02cc\u0167"+
		"\2\u0503\u0502\3\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506q\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050c\7\u00da\2\2\u0509"+
		"\u050b\5\u02cc\u0167\2\u050a\u0509\3\2\2\2\u050b\u050e\3\2\2\2\u050c\u050a"+
		"\3\2\2\2\u050c\u050d\3\2\2\2\u050ds\3\2\2\2\u050e\u050c\3\2\2\2\u050f"+
		"\u0513\7\u00db\2\2\u0510\u0512\5\u02cc\u0167\2\u0511\u0510\3\2\2\2\u0512"+
		"\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514u\3\2\2\2"+
		"\u0515\u0513\3\2\2\2\u0516\u0517\7\u0081\2\2\u0517\u0518\7\u016c\2\2\u0518"+
		"w\3\2\2\2\u0519\u051b\7K\2\2\u051a\u051c\5&\24\2\u051b\u051a\3\2\2\2\u051b"+
		"\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u0522\5\u02d0\u0169\2\u051e\u051f"+
		"\7\u0150\2\2\u051f\u0521\5\u02d0\u0169\2\u0520\u051e\3\2\2\2\u0521\u0524"+
		"\3\2\2\2\u0522\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0526\3\2\2\2\u0524"+
		"\u0522\3\2\2\2\u0525\u0527\7\u00ca\2\2\u0526\u0525\3\2\2\2\u0526\u0527"+
		"\3\2\2\2\u0527\u0529\3\2\2\2\u0528\u052a\5\24\13\2\u0529\u0528\3\2\2\2"+
		"\u0529\u052a\3\2\2\2\u052ay\3\2\2\2\u052b\u052c\7\u009d\2\2\u052c\u052d"+
		"\7\u009f\2\2\u052d\u0535\5\u0130\u0099\2\u052e\u052f\7\u009e\2\2\u052f"+
		"\u0531\7\u009f\2\2\u0530\u0532\5&\24\2\u0531\u0530\3\2\2\2\u0531\u0532"+
		"\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0535\5\u0130\u0099\2\u0534\u052b\3"+
		"\2\2\2\u0534\u052e\3\2\2\2\u0535{\3\2\2\2\u0536\u0537\7\u009d\2\2\u0537"+
		"\u0538\7\u009f\2\2\u0538\u0540\5\u0130\u0099\2\u0539\u053a\7\u009e\2\2"+
		"\u053a\u053c\7\u009f\2\2\u053b\u053d\5&\24\2\u053c\u053b\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\5\u0130\u0099\2\u053f\u0536"+
		"\3\2\2\2\u053f\u0539\3\2\2\2\u0540}\3\2\2\2\u0541\u0544\5,\27\2\u0542"+
		"\u0544\5.\30\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2\2\u0544\177\3\2\2"+
		"\2\u0545\u0546\7,\2\2\u0546\u0081\3\2\2\2\u0547\u0548\7\u009d\2\2\u0548"+
		"\u0549\7\u0096\2\2\u0549\u054d\7\u016c\2\2\u054a\u054b\7\u0097\2\2\u054b"+
		"\u054c\7\u0099\2\2\u054c\u054e\5\u0130\u0099\2\u054d\u054a\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u0553\3\2\2\2\u054f\u0550\7\u009d\2\2\u0550\u0551"+
		"\7\u0099\2\2\u0551\u0553\5\u0130\u0099\2\u0552\u0547\3\2\2\2\u0552\u054f"+
		"\3\2\2\2\u0553\u0083\3\2\2\2\u0554\u0555\5\u02da\u016e\2\u0555\u0556\7"+
		"$\2\2\u0556\u0558\5\u023e\u0120\2\u0557\u0559\5\u02cc\u0167\2\u0558\u0557"+
		"\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\7,\2\2\u055b"+
		"\u0085\3\2\2\2\u055c\u055d\7\u009d\2\2\u055d\u055e\7z\2\2\u055e\u055f"+
		"\5\u00aeX\2\u055f\u0087\3\2\2\2\u0560\u0561\7\t\2\2\u0561\u0566\7h\2\2"+
		"\u0562\u0563\7\t\2\2\u0563\u0566\7i\2\2\u0564\u0566\5\u011e\u0090\2\u0565"+
		"\u0560\3\2\2\2\u0565\u0562\3\2\2\2\u0565\u0564\3\2\2\2\u0566\u0089\3\2"+
		"\2\2\u0567\u0568\7\u009d\2\2\u0568\u0569\7\u00e5\2\2\u0569\u056a\7\u0081"+
		"\2\2\u056a\u056b\5\u008cG\2\u056b\u008b\3\2\2\2\u056c\u056d\7\u0152\2"+
		"\2\u056d\u056e\5\u008eH\2\u056e\u056f\7\u0153\2\2\u056f\u008d\3\2\2\2"+
		"\u0570\u0575\5\u0090I\2\u0571\u0572\7\u0150\2\2\u0572\u0574\5\u0090I\2"+
		"\u0573\u0571\3\2\2\2\u0574\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u008f\3\2\2\2\u0577\u0575\3\2\2\2\u0578\u0579\5\u0174\u00bb"+
		"\2\u0579\u057a\7\u0158\2\2\u057a\u057b\7\u016c\2\2\u057b\u0091\3\2\2\2"+
		"\u057c\u057d\7\u009d\2\2\u057d\u057e\7\u0081\2\2\u057e\u057f\7\u016c\2"+
		"\2\u057f\u0093\3\2\2\2\u0580\u0586\5\u0120\u0091\2\u0581\u0582\7\t\2\2"+
		"\u0582\u0586\7\u00e5\2\2\u0583\u0584\7\t\2\2\u0584\u0586\5\60\31\2\u0585"+
		"\u0580\3\2\2\2\u0585\u0581\3\2\2\2\u0585\u0583\3\2\2\2\u0586\u0095\3\2"+
		"\2\2\u0587\u0588\7\u00fc\2\2\u0588\u0589\5\u02cc\u0167\2\u0589\u058a\7"+
		"\u0097\2\2\u058a\u058b\7\'\2\2\u058b\u058c\5\u023e\u0120\2\u058c\u0097"+
		"\3\2\2\2\u058d\u058e\7L\2\2\u058e\u058f\7M\2\2\u058f\u0590\5\u02cc\u0167"+
		"\2\u0590\u0099\3\2\2\2\u0591\u0592\7\u00e2\2\2\u0592\u0593\7\u00dd\2\2"+
		"\u0593\u0595\7\u00e9\2\2\u0594\u0596\7G\2\2\u0595\u0594\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\5\u02da\u016e\2\u0598\u0599"+
		"\7\u009d\2\2\u0599\u059c\5\u0130\u0099\2\u059a\u059b\7N\2\2\u059b\u059d"+
		"\7\u016c\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u009b\3\2\2"+
		"\2\u059e\u059f\7\u00e0\2\2\u059f\u009d\3\2\2\2\u05a0\u05a1\7j\2\2\u05a1"+
		"\u05a2\7\u0171\2\2\u05a2\u05a3\7k\2\2\u05a3\u009f\3\2\2\2\u05a4\u05a5"+
		"\7C\2\2\u05a5\u05a6\7*\2\2\u05a6\u05a7\5\u02da\u016e\2\u05a7\u05a8\7$"+
		"\2\2\u05a8\u05a9\7\'\2\2\u05a9\u05aa\5\u023e\u0120\2\u05aa\u05ab\5\u0154"+
		"\u00ab\2\u05ab\u05ac\7\30\2\2\u05ac\u05b0\7\u016c\2\2\u05ad\u05ae\7\u0097"+
		"\2\2\u05ae\u05af\7\u0098\2\2\u05af\u05b1\7,\2\2\u05b0\u05ad\3\2\2\2\u05b0"+
		"\u05b1\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b3\7\u00a0\2\2\u05b3\u05b5"+
		"\5\u0130\u0099\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b9\3"+
		"\2\2\2\u05b6\u05b7\7\u00b6\2\2\u05b7\u05b8\7\'\2\2\u05b8\u05ba\5\u023e"+
		"\u0120\2\u05b9\u05b6\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05be\3\2\2\2\u05bb"+
		"\u05bc\7g\2\2\u05bc\u05bd\7\24\2\2\u05bd\u05bf\5\u0154\u00ab\2\u05be\u05bb"+
		"\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c4\3\2\2\2\u05c0\u05c2\5\u012c\u0097"+
		"\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5"+
		"\5\u0142\u00a2\2\u05c4\u05c1\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c8\3"+
		"\2\2\2\u05c6\u05c7\7\u0081\2\2\u05c7\u05c9\5\u00a2R\2\u05c8\u05c6\3\2"+
		"\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05cc\5\u012e\u0098"+
		"\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cf"+
		"\5\u011a\u008e\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00a1\3"+
		"\2\2\2\u05d0\u05d5\5\u02da\u016e\2\u05d1\u05d2\7\u014e\2\2\u05d2\u05d4"+
		"\5\u02da\u016e\2\u05d3\u05d1\3\2\2\2\u05d4\u05d7\3\2\2\2\u05d5\u05d3\3"+
		"\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u00a3\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d8"+
		"\u05d9\7K\2\2\u05d9\u05da\7*\2\2\u05da\u05db\5\u02da\u016e\2\u05db\u05dc"+
		"\7$\2\2\u05dc\u05dd\5\u023e\u0120\2\u05dd\u00a5\3\2\2\2\u05de\u05e0\5"+
		"\u023e\u0120\2\u05df\u05e1\5\u02cc\u0167\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u00a7\3\2\2\2\u05e2\u05e3\7\7\2\2\u05e3\u05e4\7\u0139\2"+
		"\2\u05e4\u00a9\3\2\2\2\u05e5\u05e6\7\u0102\2\2\u05e6\u05e8\7\u016c\2\2"+
		"\u05e7\u05e9\5\u00a8U\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"+
		"\u05ee\3\2\2\2\u05ea\u05eb\7\u0097\2\2\u05eb\u05ec\7\34\2\2\u05ec\u05ed"+
		"\7\u009f\2\2\u05ed\u05ef\5\u0130\u0099\2\u05ee\u05ea\3\2\2\2\u05ee\u05ef"+
		"\3\2\2\2\u05ef\u00ab\3\2\2\2\u05f0\u05f1\7\u009d\2\2\u05f1\u05f2\7\u0100"+
		"\2\2\u05f2\u05f3\5\u00f0y\2\u05f3\u00ad\3\2\2\2\u05f4\u05f5\7{\2\2\u05f5"+
		"\u05f6\7\u016c\2\2\u05f6\u05f7\7|\2\2\u05f7\u05f8\7\u016c\2\2\u05f8\u05f9"+
		"\7\u0096\2\2\u05f9\u05fe\7\u016c\2\2\u05fa\u05fb\7}\2\2\u05fb\u05fc\7"+
		"\u016c\2\2\u05fc\u05fd\7~\2\2\u05fd\u05ff\7\u016c\2\2\u05fe\u05fa\3\2"+
		"\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u0602\5\u02da\u016e"+
		"\2\u0601\u05f4\3\2\2\2\u0601\u0600\3\2\2\2\u0602\u00af\3\2\2\2\u0603\u0604"+
		"\7{\2\2\u0604\u0605\7\u016c\2\2\u0605\u0606\7\u0096\2\2\u0606\u0607\7"+
		"\u016c\2\2\u0607\u00b1\3\2\2\2\u0608\u060b\5\u02da\u016e\2\u0609\u060a"+
		"\7\u014e\2\2\u060a\u060c\5\u02da\u016e\2\u060b\u0609\3\2\2\2\u060b\u060c"+
		"\3\2\2\2\u060c\u061a\3\2\2\2\u060d\u0617\5\u02da\u016e\2\u060e\u0613\7"+
		"\u014e\2\2\u060f\u0614\7\u00a2\2\2\u0610\u0614\7v\2\2\u0611\u0614\7\u00a1"+
		"\2\2\u0612\u0614\5\u02da\u016e\2\u0613\u060f\3\2\2\2\u0613\u0610\3\2\2"+
		"\2\u0613\u0611\3\2\2\2\u0613\u0612\3\2\2\2\u0614\u0616\3\2\2\2\u0615\u060e"+
		"\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617\u0618\3\2\2\2\u0618"+
		"\u061b\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u060d\3\2\2\2\u061a\u061b\3\2"+
		"\2\2\u061b\u00b3\3\2\2\2\u061c\u061e\5\u00b2Z\2\u061d\u061f\5\u02cc\u0167"+
		"\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u00b5\3\2\2\2\u0620\u0622"+
		"\5\u023e\u0120\2\u0621\u0623\5\u02cc\u0167\2\u0622\u0621\3\2\2\2\u0622"+
		"\u0623\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u0626\5\u0150\u00a9\2\u0625\u0624"+
		"\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u00b7\3\2\2\2\u0627\u0635\t\6\2\2\u0628"+
		"\u062a\t\4\2\2\u0629\u062b\7\u0092\2\2\u062a\u0629\3\2\2\2\u062a\u062b"+
		"\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u0636\5\u02da\u016e\2\u062d\u062f\7"+
		"\u008d\2\2\u062e\u0630\7\u0092\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2"+
		"\2\2\u0630\u0631\3\2\2\2\u0631\u0636\5\u02d8\u016d\2\u0632\u0633\t\7\2"+
		"\2\u0633\u0636\5\u00b6\\\2\u0634\u0636\5\u00b6\\\2\u0635\u0628\3\2\2\2"+
		"\u0635\u062d\3\2\2\2\u0635\u0632\3\2\2\2\u0635\u0634\3\2\2\2\u0636\u00b9"+
		"\3\2\2\2\u0637\u0638\7\u00cc\2\2\u0638\u0639\7\'\2\2\u0639\u0646\5\u02ca"+
		"\u0166\2\u063a\u063b\7\u00dc\2\2\u063b\u0642\7\u00dd\2\2\u063c\u0643\7"+
		"\u00f7\2\2\u063d\u063e\7\u00e9\2\2\u063e\u0640\7)\2\2\u063f\u0641\5\u014c"+
		"\u00a7\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642"+
		"\u063c\3\2\2\2\u0642\u063d\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0647\3\2"+
		"\2\2\u0644\u0645\7\u0120\2\2\u0645\u0647\7>\2\2\u0646\u063a\3\2\2\2\u0646"+
		"\u0644\3\2\2\2\u0647\u00bb\3\2\2\2\u0648\u0649\7.\2\2\u0649\u064c\t\b"+
		"\2\2\u064a\u064b\7\n\2\2\u064b\u064d\5\u0118\u008d\2\u064c\u064a\3\2\2"+
		"\2\u064c\u064d\3\2\2\2\u064d\u06c4\3\2\2\2\u064e\u064f\7.\2\2\u064f\u0652"+
		"\7(\2\2\u0650\u0651\t\t\2\2\u0651\u0653\5\u02da\u016e\2\u0652\u0650\3"+
		"\2\2\2\u0652\u0653\3\2\2\2\u0653\u0657\3\2\2\2\u0654\u0655\7\n\2\2\u0655"+
		"\u0658\5\u0118\u008d\2\u0656\u0658\5\u0118\u008d\2\u0657\u0654\3\2\2\2"+
		"\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u06c4\3\2\2\2\u0659\u065a"+
		"\7.\2\2\u065a\u065d\7\u00b5\2\2\u065b\u065c\t\t\2\2\u065c\u065e\5\u02da"+
		"\u016e\2\u065d\u065b\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0662\3\2\2\2\u065f"+
		"\u0660\7\n\2\2\u0660\u0663\5\u0118\u008d\2\u0661\u0663\5\u0118\u008d\2"+
		"\u0662\u065f\3\2\2\2\u0662\u0661\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u06c4"+
		"\3\2\2\2\u0664\u0665\7.\2\2\u0665\u0666\7\u00b9\2\2\u0666\u0669\7\u00b5"+
		"\2\2\u0667\u0668\t\t\2\2\u0668\u066a\5\u02da\u016e\2\u0669\u0667\3\2\2"+
		"\2\u0669\u066a\3\2\2\2\u066a\u066e\3\2\2\2\u066b\u066c\7\n\2\2\u066c\u066f"+
		"\5\u0118\u008d\2\u066d\u066f\5\u0118\u008d\2\u066e\u066b\3\2\2\2\u066e"+
		"\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u06c4\3\2\2\2\u0670\u0671\7."+
		"\2\2\u0671\u0672\7)\2\2\u0672\u0673\t\t\2\2\u0673\u0676\5\u023e\u0120"+
		"\2\u0674\u0675\t\t\2\2\u0675\u0677\5\u02da\u016e\2\u0676\u0674\3\2\2\2"+
		"\u0676\u0677\3\2\2\2\u0677\u067b\3\2\2\2\u0678\u0679\7\n\2\2\u0679\u067c"+
		"\5\u0118\u008d\2\u067a\u067c\5\u0118\u008d\2\u067b\u0678\3\2\2\2\u067b"+
		"\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u06c4\3\2\2\2\u067d\u067e\7."+
		"\2\2\u067e\u0682\7-\2\2\u067f\u0680\7\n\2\2\u0680\u0683\5\u0116\u008c"+
		"\2\u0681\u0683\5\u0116\u008c\2\u0682\u067f\3\2\2\2\u0682\u0681\3\2\2\2"+
		"\u0682\u0683\3\2\2\2\u0683\u06c4\3\2\2\2\u0684\u0685\7.\2\2\u0685\u0686"+
		"\7&\2\2\u0686\u0688\5\u023e\u0120\2\u0687\u0689\5\u02cc\u0167\2\u0688"+
		"\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u06c4\3\2\2\2\u068a\u068b\7."+
		"\2\2\u068b\u0690\7C\2\2\u068c\u068d\t\4\2\2\u068d\u0691\5\u02da\u016e"+
		"\2\u068e\u068f\7\'\2\2\u068f\u0691\5\u023e\u0120\2\u0690\u068c\3\2\2\2"+
		"\u0690\u068e\3\2\2\2\u0691\u06c4\3\2\2\2\u0692\u0693\7.\2\2\u0693\u0694"+
		"\7\'\2\2\u0694\u0697\7\u0092\2\2\u0695\u0696\t\t\2\2\u0696\u0698\5\u02da"+
		"\u016e\2\u0697\u0695\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699"+
		"\u069a\7\n\2\2\u069a\u069c\5\u0118\u008d\2\u069b\u069d\5\u02cc\u0167\2"+
		"\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06c4\3\2\2\2\u069e\u069f"+
		"\7.\2\2\u069f\u06a0\7\u009f\2\2\u06a0\u06a4\5\u023e\u0120\2\u06a1\u06a2"+
		"\7\u0152\2\2\u06a2\u06a3\7\u016c\2\2\u06a3\u06a5\7\u0153\2\2\u06a4\u06a1"+
		"\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06c4\3\2\2\2\u06a6\u06a7\7.\2\2\u06a7"+
		"\u06b3\7\u00c1\2\2\u06a8\u06a9\t\4\2\2\u06a9\u06ab\5\u02da\u016e\2\u06aa"+
		"\u06ac\7\u0092\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06b4"+
		"\3\2\2\2\u06ad\u06af\5\u00b4[\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2"+
		"\2\u06af\u06b1\3\2\2\2\u06b0\u06b2\7\u0092\2\2\u06b1\u06b0\3\2\2\2\u06b1"+
		"\u06b2\3\2\2\2\u06b2\u06b4\3\2\2\2\u06b3\u06a8\3\2\2\2\u06b3\u06ae\3\2"+
		"\2\2\u06b4\u06c4\3\2\2\2\u06b5\u06b6\7.\2\2\u06b6\u06c4\7\u0103\2\2\u06b7"+
		"\u06b8\7.\2\2\u06b8\u06c4\7\u0104\2\2\u06b9\u06ba\7.\2\2\u06ba\u06bb\7"+
		"\u0108\2\2\u06bb\u06c4\7\u016c\2\2\u06bc\u06bd\7.\2\2\u06bd\u06c1\7\u013a"+
		"\2\2\u06be\u06bf\7\u013b\2\2\u06bf\u06c2\5\u02da\u016e\2\u06c0\u06c2\7"+
		"\u013d\2\2\u06c1\u06be\3\2\2\2\u06c1\u06c0\3\2\2\2\u06c2\u06c4\3\2\2\2"+
		"\u06c3\u0648\3\2\2\2\u06c3\u064e\3\2\2\2\u06c3\u0659\3\2\2\2\u06c3\u0664"+
		"\3\2\2\2\u06c3\u0670\3\2\2\2\u06c3\u067d\3\2\2\2\u06c3\u0684\3\2\2\2\u06c3"+
		"\u068a\3\2\2\2\u06c3\u0692\3\2\2\2\u06c3\u069e\3\2\2\2\u06c3\u06a6\3\2"+
		"\2\2\u06c3\u06b5\3\2\2\2\u06c3\u06b7\3\2\2\2\u06c3\u06b9\3\2\2\2\u06c3"+
		"\u06bc\3\2\2\2\u06c4\u00bd\3\2\2\2\u06c5\u06c6\7\u00c0\2\2\u06c6\u06c7"+
		"\7\'\2\2\u06c7\u06c9\5\u023e\u0120\2\u06c8\u06ca\5\u02cc\u0167\2\u06c9"+
		"\u06c8\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cc\5\u00c2"+
		"b\2\u06cc\u00bf\3\2\2\2\u06cd\u06ce\7\u00c0\2\2\u06ce\u06cf\t\4\2\2\u06cf"+
		"\u06d0\5\u02da\u016e\2\u06d0\u06d1\5\u00c2b\2\u06d1\u00c1\3\2\2\2\u06d2"+
		"\u06d3\t\n\2\2\u06d3\u00c3\3\2\2\2\u06d4\u06d5\7\u00c2\2\2\u06d5\u06d6"+
		"\7\'\2\2\u06d6\u06d8\5\u023e\u0120\2\u06d7\u06d9\5\u02cc\u0167\2\u06d8"+
		"\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u00c5\3\2\2\2\u06da\u06db\7\u00c2"+
		"\2\2\u06db\u06dc\t\4\2\2\u06dc\u06dd\5\u02da\u016e\2\u06dd\u00c7\3\2\2"+
		"\2\u06de\u06df\7C\2\2\u06df\u06e0\7\u00f9\2\2\u06e0\u06e1\5\u02da\u016e"+
		"\2\u06e1\u00c9\3\2\2\2\u06e2\u06e3\7K\2\2\u06e3\u06e4\7\u00f9\2\2\u06e4"+
		"\u06e5\5\u02da\u016e\2\u06e5\u00cb\3\2\2\2\u06e6\u06e7\7\u00bc\2\2\u06e7"+
		"\u06e9\5\u00e8u\2\u06e8\u06ea\5\u00e2r\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ec\7M\2\2\u06ec\u06ee\5\u00eex\2"+
		"\u06ed\u06ef\5\u00f2z\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef"+
		"\u00cd\3\2\2\2\u06f0\u06f2\7\u00bd\2\2\u06f1\u06f3\5\u00f4{\2\u06f2\u06f1"+
		"\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f6\5\u00e8u"+
		"\2\u06f5\u06f7\5\u00e2r\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f8\3\2\2\2\u06f8\u06f9\7\27\2\2\u06f9\u06fa\5\u00eex\2\u06fa\u00cf"+
		"\3\2\2\2\u06fb\u06fd\7\u00bc\2\2\u06fc\u06fe\7\u00f9\2\2\u06fd\u06fc\3"+
		"\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0704\5\u02da\u016e"+
		"\2\u0700\u0701\7\u0150\2\2\u0701\u0703\5\u02da\u016e\2\u0702\u0700\3\2"+
		"\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705"+
		"\u0707\3\2\2\2\u0706\u0704\3\2\2\2\u0707\u0708\7M\2\2\u0708\u070a\5\u00ee"+
		"x\2\u0709\u070b\5\u00f8}\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b"+
		"\u00d1\3\2\2\2\u070c\u070e\7\u00bd\2\2\u070d\u070f\5\u00f6|\2\u070e\u070d"+
		"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u0712\7\u00f9\2"+
		"\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0718"+
		"\5\u02da\u016e\2\u0714\u0715\7\u0150\2\2\u0715\u0717\5\u02da\u016e\2\u0716"+
		"\u0714\3\2\2\2\u0717\u071a\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0719\3\2"+
		"\2\2\u0719\u071b\3\2\2\2\u071a\u0718\3\2\2\2\u071b\u071c\7\27\2\2\u071c"+
		"\u071d\5\u00eex\2\u071d\u00d3\3\2\2\2\u071e\u071f\7.\2\2\u071f\u0720\7"+
		"\u00f9\2\2\u0720\u0721\7\u00bc\2\2\u0721\u0722\5\u00f0y\2\u0722\u00d5"+
		"\3\2\2\2\u0723\u0724\7.\2\2\u0724\u0725\7\u00fa\2\2\u0725\u00d7\3\2\2"+
		"\2\u0726\u0727\7.\2\2\u0727\u0728\7\u00ee\2\2\u0728\u0729\7\u00fa\2\2"+
		"\u0729\u00d9\3\2\2\2\u072a\u072b\7\u009d\2\2\u072b\u072f\7\u00f9\2\2\u072c"+
		"\u0730\7\5\2\2\u072d\u0730\7\6\2\2\u072e\u0730\5\u02da\u016e\2\u072f\u072c"+
		"\3\2\2\2\u072f\u072d\3\2\2\2\u072f\u072e\3\2\2\2\u0730\u00db\3\2\2\2\u0731"+
		"\u0732\7.\2\2\u0732\u0734\7\u00bc\2\2\u0733\u0735\5\u00f0y\2\u0734\u0733"+
		"\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0737\7$\2\2\u0737"+
		"\u0739\5\u00e0q\2\u0738\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u00dd"+
		"\3\2\2\2\u073a\u073b\7.\2\2\u073b\u073c\7\u0101\2\2\u073c\u073d\5\u02da"+
		"\u016e\2\u073d\u00df\3\2\2\2\u073e\u0741\7\5\2\2\u073f\u0741\5\u00e6t"+
		"\2\u0740\u073e\3\2\2\2\u0740\u073f\3\2\2\2\u0741\u00e1\3\2\2\2\u0742\u0743"+
		"\7$\2\2\u0743\u0744\5\u00e4s\2\u0744\u00e3\3\2\2\2\u0745\u0746\t\4\2\2"+
		"\u0746\u0753\5\u02da\u016e\2\u0747\u0749\7\'\2\2\u0748\u0747\3\2\2\2\u0748"+
		"\u0749\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074c\5\u023e\u0120\2\u074b\u074d"+
		"\5\u02cc\u0167\2\u074c\u074b\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0753\3"+
		"\2\2\2\u074e\u074f\7\u00fd\2\2\u074f\u0753\7\u016c\2\2\u0750\u0751\7\u00fe"+
		"\2\2\u0751\u0753\5\u02da\u016e\2\u0752\u0745\3\2\2\2\u0752\u0748\3\2\2"+
		"\2\u0752\u074e\3\2\2\2\u0752\u0750\3\2\2\2\u0753\u00e5\3\2\2\2\u0754\u0755"+
		"\t\4\2\2\u0755\u0768\5\u02da\u016e\2\u0756\u0758\7\'\2\2\u0757\u0756\3"+
		"\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075e\5\u023e\u0120"+
		"\2\u075a\u075b\7\u0152\2\2\u075b\u075c\5\u014c\u00a7\2\u075c\u075d\7\u0153"+
		"\2\2\u075d\u075f\3\2\2\2\u075e\u075a\3\2\2\2\u075e\u075f\3\2\2\2\u075f"+
		"\u0761\3\2\2\2\u0760\u0762\5\u02cc\u0167\2\u0761\u0760\3\2\2\2\u0761\u0762"+
		"\3\2\2\2\u0762\u0768\3\2\2\2\u0763\u0764\7\u00fd\2\2\u0764\u0768\7\u016c"+
		"\2\2\u0765\u0766\7\u00fe\2\2\u0766\u0768\5\u02da\u016e\2\u0767\u0754\3"+
		"\2\2\2\u0767\u0757\3\2\2\2\u0767\u0763\3\2\2\2\u0767\u0765\3\2\2\2\u0768"+
		"\u00e7\3\2\2\2\u0769\u076e\5\u00eav\2\u076a\u076b\7\u0150\2\2\u076b\u076d"+
		"\5\u00eav\2\u076c\u076a\3\2\2\2\u076d\u0770\3\2\2\2\u076e\u076c\3\2\2"+
		"\2\u076e\u076f\3\2\2\2\u076f\u00e9\3\2\2\2\u0770\u076e\3\2\2\2\u0771\u0776"+
		"\5\u00ecw\2\u0772\u0773\7\u0152\2\2\u0773\u0774\5\u014c\u00a7\2\u0774"+
		"\u0775\7\u0153\2\2\u0775\u0777\3\2\2\2\u0776\u0772\3\2\2\2\u0776\u0777"+
		"\3\2\2\2\u0777\u00eb\3\2\2\2\u0778\u0779\t\13\2\2\u0779\u00ed\3\2\2\2"+
		"\u077a\u077f\5\u00f0y\2\u077b\u077c\7\u0150\2\2\u077c\u077e\5\u00f0y\2"+
		"\u077d\u077b\3\2\2\2\u077e\u0781\3\2\2\2\u077f\u077d\3\2\2\2\u077f\u0780"+
		"\3\2\2\2\u0780\u00ef\3\2\2\2\u0781\u077f\3\2\2\2\u0782\u0783\7\u00f8\2"+
		"\2\u0783\u0789\5\u02de\u0170\2\u0784\u0785\7\23\2\2\u0785\u0789\5\u02de"+
		"\u0170\2\u0786\u0787\7\u00f9\2\2\u0787\u0789\5\u02da\u016e\2\u0788\u0782"+
		"\3\2\2\2\u0788\u0784\3\2\2\2\u0788\u0786\3\2\2\2\u0789\u00f1\3\2\2\2\u078a"+
		"\u078b\7\u0097\2\2\u078b\u078c\7\u00bc\2\2\u078c\u078d\7\u00df\2\2\u078d"+
		"\u00f3\3\2\2\2\u078e\u078f\7\u00bc\2\2\u078f\u0790\7\u00df\2\2\u0790\u0791"+
		"\7\u00e9\2\2\u0791\u00f5\3\2\2\2\u0792\u0793\7\u00ff\2\2\u0793\u0794\7"+
		"\u00df\2\2\u0794\u0795\7\u00e9\2\2\u0795\u00f7\3\2\2\2\u0796\u0797\7\u0097"+
		"\2\2\u0797\u0798\7\u00ff\2\2\u0798\u0799\7\u00df\2\2\u0799\u00f9\3\2\2"+
		"\2\u079a\u079c\7/\2\2\u079b\u079d\7\60\2\2\u079c\u079b\3\2\2\2\u079c\u079d"+
		"\3\2\2\2\u079d\u07a7\3\2\2\2\u079e\u079f\7\'\2\2\u079f\u07a2\5\u023e\u0120"+
		"\2\u07a0\u07a1\t\f\2\2\u07a1\u07a3\7&\2\2\u07a2\u07a0\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a8\3\2\2\2\u07a4\u07a6\5\u02cc\u0167\2\u07a5\u07a4\3"+
		"\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a8\3\2\2\2\u07a7\u079e\3\2\2\2\u07a7"+
		"\u07a5\3\2\2\2\u07a8\u00fb\3\2\2\2\u07a9\u07ae\5\u00fe\u0080\2\u07aa\u07ab"+
		"\7\u0150\2\2\u07ab\u07ad\5\u00fe\u0080\2\u07ac\u07aa\3\2\2\2\u07ad\u07b0"+
		"\3\2\2\2\u07ae\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u00fd\3\2\2\2\u07b0"+
		"\u07ae\3\2\2\2\u07b1\u07b2\5\u0100\u0081\2\u07b2\u07b3\7\u016c\2\2\u07b3"+
		"\u00ff\3\2\2\2\u07b4\u07b5\t\r\2\2\u07b5\u0101\3\2\2\2\u07b6\u07b8\7C"+
		"\2\2\u07b7\u07b9\7\u008c\2\2\u07b8\u07b7\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9"+
		"\u07ba\3\2\2\2\u07ba\u07bb\7\u008d\2\2\u07bb\u07bc\5\u02dc\u016f\2\u07bc"+
		"\u07bd\7\30\2\2\u07bd\u07c0\7\u016c\2\2\u07be\u07bf\7\64\2\2\u07bf\u07c1"+
		"\5\u00fc\177\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u0103\3\2"+
		"\2\2\u07c2\u07c4\7K\2\2\u07c3\u07c5\7\u008c\2\2\u07c4\u07c3\3\2\2\2\u07c4"+
		"\u07c5\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\7\u008d\2\2\u07c7\u07c9"+
		"\5&\24\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca"+
		"\u07cb\5\u02dc\u016f\2\u07cb\u0105\3\2\2\2\u07cc\u07cd\7\u010a\2\2\u07cd"+
		"\u07ce\7\u008d\2\2\u07ce\u0107\3\2\2\2\u07cf\u07d0\7C\2\2\u07d0\u07d1"+
		"\7\u008c\2\2\u07d1\u07d2\7\u008e\2\2\u07d2\u07d3\7\u0172\2\2\u07d3\u07d5"+
		"\7\u0152\2\2\u07d4\u07d6\5\u0146\u00a4\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6"+
		"\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d8\7\u0153\2\2\u07d8\u07d9\5\u02c0"+
		"\u0161\2\u07d9\u0109\3\2\2\2\u07da\u07db\7K\2\2\u07db\u07dc\7\u008c\2"+
		"\2\u07dc\u07de\7\u008e\2\2\u07dd\u07df\5&\24\2\u07de\u07dd\3\2\2\2\u07de"+
		"\u07df\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\7\u0172\2\2\u07e1\u010b"+
		"\3\2\2\2\u07e2\u07e4\7C\2\2\u07e3\u07e5\5\62\32\2\u07e4\u07e3\3\2\2\2"+
		"\u07e4\u07e5\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8\7\u00b4\2\2\u07e7"+
		"\u07e9\5*\26\2\u07e8\u07e7\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ea\3\2"+
		"\2\2\u07ea\u07ef\5\u023e\u0120\2\u07eb\u07ec\7\u0152\2\2\u07ec\u07ed\5"+
		"\u017c\u00bf\2\u07ed\u07ee\7\u0153\2\2\u07ee\u07f0\3\2\2\2\u07ef\u07eb"+
		"\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\3\2\2\2\u07f1\u07f3\5\u011a\u008e"+
		"\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f5\3\2\2\2\u07f4\u07f6"+
		"\5\u0110\u0089\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f8\3"+
		"\2\2\2\u07f7\u07f9\5\u012e\u0098\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2"+
		"\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\7\30\2\2\u07fb\u07fc\5\u01c4\u00e3"+
		"\2\u07fc\u010d\3\2\2\2\u07fd\u07fe\7C\2\2\u07fe\u07ff\7\u00b9\2\2\u07ff"+
		"\u0801\7\u00b4\2\2\u0800\u0802\5*\26\2\u0801\u0800\3\2\2\2\u0801\u0802"+
		"\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0805\5\u023e\u0120\2\u0804\u0806\5"+
		".\30\2\u0805\u0804\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0808\3\2\2\2\u0807"+
		"\u0809\5\u011a\u008e\2\u0808\u0807\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b"+
		"\3\2\2\2\u080a\u080c\5\u012c\u0097\2\u080b\u080a\3\2\2\2\u080b\u080c\3"+
		"\2\2\2\u080c\u080e\3\2\2\2\u080d\u080f\5\u0142\u00a2\2\u080e\u080d\3\2"+
		"\2\2\u080e\u080f\3\2\2\2\u080f\u0811\3\2\2\2\u0810\u0812\5\u0144\u00a3"+
		"\2\u0811\u0810\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0815"+
		"\5\u012e\u0098\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0816\3"+
		"\2\2\2\u0816\u0817\7\30\2\2\u0817\u0818\5\u01c4\u00e3\2\u0818\u010f\3"+
		"\2\2\2\u0819\u081a\7g\2\2\u081a\u081b\7$\2\2\u081b\u081c\7\u0152\2\2\u081c"+
		"\u081d\5\u014c\u00a7\2\u081d\u081e\7\u0153\2\2\u081e\u0111\3\2\2\2\u081f"+
		"\u0820\7K\2\2\u0820\u0822\7\u00b4\2\2\u0821\u0823\5&\24\2\u0822\u0821"+
		"\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\5\u0240\u0121"+
		"\2\u0825\u0113\3\2\2\2\u0826\u0827\7K\2\2\u0827\u0828\7\u00b9\2\2\u0828"+
		"\u082a\7\u00b4\2\2\u0829\u082b\5&\24\2\u082a\u0829\3\2\2\2\u082a\u082b"+
		"\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d\5\u0240\u0121\2\u082d\u0115\3"+
		"\2\2\2\u082e\u0831\5\u02dc\u016f\2\u082f\u0831\7\u016c\2\2\u0830\u082e"+
		"\3\2\2\2\u0830\u082f\3\2\2\2\u0831\u0117\3\2\2\2\u0832\u0835\5\u02da\u016e"+
		"\2\u0833\u0835\7\u016c\2\2\u0834\u0832\3\2\2\2\u0834\u0833\3\2\2\2\u0835"+
		"\u0119\3\2\2\2\u0836\u0837\7N\2\2\u0837\u0838\7\u016c\2\2\u0838\u011b"+
		"\3\2\2\2\u0839\u083a\7g\2\2\u083a\u083b\7\24\2\2\u083b\u083c\7\u0152\2"+
		"\2\u083c\u0841\5\u0188\u00c5\2\u083d\u083e\7\u0150\2\2\u083e\u0840\5\u0188"+
		"\u00c5\2\u083f\u083d\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841"+
		"\u0842\3\2\2\2\u0842\u0844\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0845\7\u0153"+
		"\2\2\u0845\u011d\3\2\2\2\u0846\u0847\7h\2\2\u0847";
	private static final String _serializedATNSegment1 =
		"\u0848\7\24\2\2\u0848\u0849\7\u0152\2\2\u0849\u084a\5\u014c\u00a7\2\u084a"+
		"\u0851\7\u0153\2\2\u084b\u084c\7i\2\2\u084c\u084d\7\24\2\2\u084d\u084e"+
		"\7\u0152\2\2\u084e\u084f\5\u0152\u00aa\2\u084f\u0850\7\u0153\2\2\u0850"+
		"\u0852\3\2\2\2\u0851\u084b\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0853\3\2"+
		"\2\2\u0853\u0854\7j\2\2\u0854\u0855\7\u0171\2\2\u0855\u0856\7k\2\2\u0856"+
		"\u011f\3\2\2\2\u0857\u0858\7\u00e5\2\2\u0858\u0859\7\24\2\2\u0859\u085a"+
		"\7\u0152\2\2\u085a\u085b\5\u014c\u00a7\2\u085b\u085c\7\u0153\2\2\u085c"+
		"\u085d\7$\2\2\u085d\u085e\7\u0152\2\2\u085e\u085f\5\u016a\u00b6\2\u085f"+
		"\u0861\7\u0153\2\2\u0860\u0862\5\60\31\2\u0861\u0860\3\2\2\2\u0861\u0862"+
		"\3\2\2\2\u0862\u0121\3\2\2\2\u0863\u0866\5\u0128\u0095\2\u0864\u0866\5"+
		"\u012a\u0096\2\u0865\u0863\3\2\2\2\u0865\u0864\3\2\2\2\u0866\u0123\3\2"+
		"\2\2\u0867\u0868\7\u00d5\2\2\u0868\u0869\7\u016c\2\2\u0869\u0125\3\2\2"+
		"\2\u086a\u086b\7\u00d6\2\2\u086b\u086c\7\u016c\2\2\u086c\u0127\3\2\2\2"+
		"\u086d\u086e\7l\2\2\u086e\u086f\7n\2\2\u086f\u0870\7\u0096\2\2\u0870\u0874"+
		"\7\u016c\2\2\u0871\u0872\7\u0097\2\2\u0872\u0873\7\u0099\2\2\u0873\u0875"+
		"\5\u0130\u0099\2\u0874\u0871\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0129\3"+
		"\2\2\2\u0876\u0877\7l\2\2\u0877\u0878\7n\2\2\u0878\u087a\7o\2\2\u0879"+
		"\u087b\5\u0138\u009d\2\u087a\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087d"+
		"\3\2\2\2\u087c\u087e\5\u013a\u009e\2\u087d\u087c\3\2\2\2\u087d\u087e\3"+
		"\2\2\2\u087e\u0880\3\2\2\2\u087f\u0881\5\u013c\u009f\2\u0880\u087f\3\2"+
		"\2\2\u0880\u0881\3\2\2\2\u0881\u0883\3\2\2\2\u0882\u0884\5\u013e\u00a0"+
		"\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0886\3\2\2\2\u0885\u0887"+
		"\5\u0140\u00a1\2\u0886\u0885\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u012b\3"+
		"\2\2\2\u0888\u088b\5\u012a\u0096\2\u0889\u088b\5\u0128\u0095\2\u088a\u0888"+
		"\3\2\2\2\u088a\u0889\3\2\2\2\u088b\u012d\3\2\2\2\u088c\u088d\7\u009f\2"+
		"\2\u088d\u088e\5\u0130\u0099\2\u088e\u012f\3\2\2\2\u088f\u0890\7\u0152"+
		"\2\2\u0890\u0891\5\u0132\u009a\2\u0891\u0892\7\u0153\2\2\u0892\u0131\3"+
		"\2\2\2\u0893\u0898\5\u0134\u009b\2\u0894\u0895\7\u0150\2\2\u0895\u0897"+
		"\5\u0134\u009b\2\u0896\u0894\3\2\2\2\u0897\u089a\3\2\2\2\u0898\u0896\3"+
		"\2\2\2\u0898\u0899\3\2\2\2\u0899\u08a4\3\2\2\2\u089a\u0898\3\2\2\2\u089b"+
		"\u08a0\5\u0136\u009c\2\u089c\u089d\7\u0150\2\2\u089d\u089f\5\u0136\u009c"+
		"\2\u089e\u089c\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e\3\2\2\2\u08a0\u08a1"+
		"\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3\u0893\3\2\2\2\u08a3"+
		"\u089b\3\2\2\2\u08a4\u0133\3\2\2\2\u08a5\u08a6\7\u016c\2\2\u08a6\u08a7"+
		"\7\u0158\2\2\u08a7\u08a8\7\u016c\2\2\u08a8\u0135\3\2\2\2\u08a9\u08aa\7"+
		"\u016c\2\2\u08aa\u0137\3\2\2\2\u08ab\u08ac\7p\2\2\u08ac\u08ad\7q\2\2\u08ad"+
		"\u08ae\7\24\2\2\u08ae\u08b2\7\u016c\2\2\u08af\u08b0\7r\2\2\u08b0\u08b1"+
		"\7\24\2\2\u08b1\u08b3\7\u016c\2\2\u08b2\u08af\3\2\2\2\u08b2\u08b3\3\2"+
		"\2\2\u08b3\u0139\3\2\2\2\u08b4\u08b5\7s\2\2\u08b5\u08b6\7t\2\2\u08b6\u08b7"+
		"\7q\2\2\u08b7\u08b8\7\24\2\2\u08b8\u08b9\7\u016c\2\2\u08b9\u013b\3\2\2"+
		"\2\u08ba\u08bb\7d\2\2\u08bb\u08bc\7u\2\2\u08bc\u08bd\7q\2\2\u08bd\u08be"+
		"\7\24\2\2\u08be\u08bf\7\u016c\2\2\u08bf\u013d\3\2\2\2\u08c0\u08c1\7x\2"+
		"\2\u08c1\u08c2\7q\2\2\u08c2\u08c3\7\24\2\2\u08c3\u08c4\7\u016c\2\2\u08c4"+
		"\u013f\3\2\2\2\u08c5\u08c6\7B\2\2\u08c6\u08c7\7\u00a3\2\2\u08c7\u08c8"+
		"\7\30\2\2\u08c8\u08c9\7\u016c\2\2\u08c9\u0141\3\2\2\2\u08ca\u08cb\7y\2"+
		"\2\u08cb\u08cc\7\30\2\2\u08cc\u08cd\7{\2\2\u08cd\u08ce\7\u016c\2\2\u08ce"+
		"\u08cf\7|\2\2\u08cf\u08d4\7\u016c\2\2\u08d0\u08d1\7}\2\2\u08d1\u08d2\7"+
		"\u016c\2\2\u08d2\u08d3\7~\2\2\u08d3\u08d5\7\u016c\2\2\u08d4\u08d0\3\2"+
		"\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08e2\3\2\2\2\u08d6\u08d7\7y\2\2\u08d7"+
		"\u08d8\7\24\2\2\u08d8\u08dc\7\u016c\2\2\u08d9\u08da\7\u0097\2\2\u08da"+
		"\u08db\7\u0099\2\2\u08db\u08dd\5\u0130\u0099\2\u08dc\u08d9\3\2\2\2\u08dc"+
		"\u08dd\3\2\2\2\u08dd\u08e2\3\2\2\2\u08de\u08df\7y\2\2\u08df\u08e0\7\30"+
		"\2\2\u08e0\u08e2\5\u02da\u016e\2\u08e1\u08ca\3\2\2\2\u08e1\u08d6\3\2\2"+
		"\2\u08e1\u08de\3\2\2\2\u08e2\u0143\3\2\2\2\u08e3\u08e4\7\u0081\2\2\u08e4"+
		"\u08e5\7\u016c\2\2\u08e5\u0145\3\2\2\2\u08e6\u08eb\5\u0182\u00c2\2\u08e7"+
		"\u08e8\7\u0150\2\2\u08e8\u08ea\5\u0182\u00c2\2\u08e9\u08e7\3\2\2\2\u08ea"+
		"\u08ed\3\2\2\2\u08eb\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u0147\3\2"+
		"\2\2\u08ed\u08eb\3\2\2\2\u08ee\u08f3\5\u0184\u00c3\2\u08ef\u08f0\7\u0150"+
		"\2\2\u08f0\u08f2\5\u0184\u00c3\2\u08f1\u08ef\3\2\2\2\u08f2\u08f5\3\2\2"+
		"\2\u08f3\u08f1\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u0149\3\2\2\2\u08f5\u08f3"+
		"\3\2\2\2\u08f6\u08fb\5\u019c\u00cf\2\u08f7\u08f8\7\u0150\2\2\u08f8\u08fa"+
		"\5\u019c\u00cf\2\u08f9\u08f7\3\2\2\2\u08fa\u08fd\3\2\2\2\u08fb\u08f9\3"+
		"\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u014b\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fe"+
		"\u0903\5\u014e\u00a8\2\u08ff\u0900\7\u0150\2\2\u0900\u0902\5\u014e\u00a8"+
		"\2\u0901\u08ff\3\2\2\2\u0902\u0905\3\2\2\2\u0903\u0901\3\2\2\2\u0903\u0904"+
		"\3\2\2\2\u0904\u014d\3\2\2\2\u0905\u0903\3\2\2\2\u0906\u0907\5\u02da\u016e"+
		"\2\u0907\u014f\3\2\2\2\u0908\u0912\5\u02da\u016e\2\u0909\u090e\7\u014e"+
		"\2\2\u090a\u090f\7\u00a2\2\2\u090b\u090f\7v\2\2\u090c\u090f\7\u00a1\2"+
		"\2\u090d\u090f\5\u02da\u016e\2\u090e\u090a\3\2\2\2\u090e\u090b\3\2\2\2"+
		"\u090e\u090c\3\2\2\2\u090e\u090d\3\2\2\2\u090f\u0911\3\2\2\2\u0910\u0909"+
		"\3\2\2\2\u0911\u0914\3\2\2\2\u0912\u0910\3\2\2\2\u0912\u0913\3\2\2\2\u0913"+
		"\u0151\3\2\2\2\u0914\u0912\3\2\2\2\u0915\u091a\5\u017a\u00be\2\u0916\u0917"+
		"\7\u0150\2\2\u0917\u0919\5\u017a\u00be\2\u0918\u0916\3\2\2\2\u0919\u091c"+
		"\3\2\2\2\u091a\u0918\3\2\2\2\u091a\u091b\3\2\2\2\u091b\u0153\3\2\2\2\u091c"+
		"\u091a\3\2\2\2\u091d\u091e\7\u0152\2\2\u091e\u091f\5\u014c\u00a7\2\u091f"+
		"\u0920\7\u0153\2\2\u0920\u0155\3\2\2\2\u0921\u0923\5\u0158\u00ad\2\u0922"+
		"\u0924\5\u015a\u00ae\2\u0923\u0922\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0927"+
		"\3\2\2\2\u0925\u0927\5\u015c\u00af\2\u0926\u0921\3\2\2\2\u0926\u0925\3"+
		"\2\2\2\u0927\u0157\3\2\2\2\u0928\u0929\t\16\2\2\u0929\u0159\3\2\2\2\u092a"+
		"\u092b\t\17\2\2\u092b\u015b\3\2\2\2\u092c\u0930\7\u0125\2\2\u092d\u092e"+
		"\7\t\2\2\u092e\u0930\7\u0125\2\2\u092f\u092c\3\2\2\2\u092f\u092d\3\2\2"+
		"\2\u0930\u015d\3\2\2\2\u0931\u0936\7\u0128\2\2\u0932\u0934\7\u0129\2\2"+
		"\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0936\3\2\2\2\u0935\u0931"+
		"\3\2\2\2\u0935\u0933\3\2\2\2\u0936\u015f\3\2\2\2\u0937\u0938\7\u0124\2"+
		"\2\u0938\u093a\5\u02da\u016e\2\u0939\u0937\3\2\2\2\u0939\u093a\3\2\2\2"+
		"\u093a\u093b\3\2\2\2\u093b\u093d\5\u0164\u00b3\2\u093c\u093e\5\u0198\u00cd"+
		"\2\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0161\3\2\2\2\u093f\u0940"+
		"\7\u0124\2\2\u0940\u0941\5\u02da\u016e\2\u0941\u0943\5\u0164\u00b3\2\u0942"+
		"\u0944\5\u019a\u00ce\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0163"+
		"\3\2\2\2\u0945\u0946\5\u0196\u00cc\2\u0946\u0947\5\u0154\u00ab\2\u0947"+
		"\u0165\3\2\2\2\u0948\u0949\7\u0124\2\2\u0949\u094b\5\u02da\u016e\2\u094a"+
		"\u0948\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3\2\2\2\u094c\u094d\7\u0122"+
		"\2\2\u094d\u094e\7\u012b\2\2\u094e\u094f\5\u0154\u00ab\2\u094f\u0950\7"+
		"\u0123\2\2\u0950\u0951\5\u023e\u0120\2\u0951\u0953\5\u0154\u00ab\2\u0952"+
		"\u0954\5\u0198\u00cd\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0167"+
		"\3\2\2\2\u0955\u0956\7\u0124\2\2\u0956\u0957\5\u02da\u016e\2\u0957\u0958"+
		"\7\u0122\2\2\u0958\u0959\7\u012b\2\2\u0959\u095a\5\u0154\u00ab\2\u095a"+
		"\u095b\7\u0123\2\2\u095b\u095c\5\u023e\u0120\2\u095c\u095e\5\u0154\u00ab"+
		"\2\u095d\u095f\5\u019a\u00ce\2\u095e\u095d\3\2\2\2\u095e\u095f\3\2\2\2"+
		"\u095f\u0169\3\2\2\2\u0960\u0963\5\u0170\u00b9\2\u0961\u0963\5\u016c\u00b7"+
		"\2\u0962\u0960\3\2\2\2\u0962\u0961\3\2\2\2\u0963\u016b\3\2\2\2\u0964\u0969"+
		"\5\u016e\u00b8\2\u0965\u0966\7\u0150\2\2\u0966\u0968\5\u016e\u00b8\2\u0967"+
		"\u0965\3\2\2\2\u0968\u096b\3\2\2\2\u0969\u0967\3\2\2\2\u0969\u096a\3\2"+
		"\2\2\u096a\u016d\3\2\2\2\u096b\u0969\3\2\2\2\u096c\u096d\7\u0152\2\2\u096d"+
		"\u096e\5\u0170\u00b9\2\u096e\u096f\7\u0153\2\2\u096f\u016f\3\2\2\2\u0970"+
		"\u0975\5\u0172\u00ba\2\u0971\u0972\7\u0150\2\2\u0972\u0974\5\u0172\u00ba"+
		"\2\u0973\u0971\3\2\2\2\u0974\u0977\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0976"+
		"\3\2\2\2\u0976\u0171\3\2\2\2\u0977\u0975\3\2\2\2\u0978\u0979\5\u0292\u014a"+
		"\2\u0979\u0173\3\2\2\2\u097a\u097d\5\u0172\u00ba\2\u097b\u097d\5\u016e"+
		"\u00b8\2\u097c\u097a\3\2\2\2\u097c\u097b\3\2\2\2\u097d\u0175\3\2\2\2\u097e"+
		"\u097f\t\20\2\2\u097f\u0177\3\2\2\2\u0980\u0981\7\20\2\2\u0981\u0985\7"+
		"H\2\2\u0982\u0983\7\20\2\2\u0983\u0985\7\21\2\2\u0984\u0980\3\2\2\2\u0984"+
		"\u0982\3\2\2\2\u0985\u0179\3\2\2\2\u0986\u0988\5\u02da\u016e\2\u0987\u0989"+
		"\5\u0176\u00bc\2\u0988\u0987\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098b\3"+
		"\2\2\2\u098a\u098c\5\u0178\u00bd\2\u098b\u098a\3\2\2\2\u098b\u098c\3\2"+
		"\2\2\u098c\u017b\3\2\2\2\u098d\u0992\5\u017e\u00c0\2\u098e\u098f\7\u0150"+
		"\2\2\u098f\u0991\5\u017e\u00c0\2\u0990\u098e\3\2\2\2\u0991\u0994\3\2\2"+
		"\2\u0992\u0990\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u017d\3\2\2\2\u0994\u0992"+
		"\3\2\2\2\u0995\u0998\5\u02da\u016e\2\u0996\u0997\7N\2\2\u0997\u0999\7"+
		"\u016c\2\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u017f\3\2\2\2"+
		"\u099a\u099c\5\u02c0\u0161\2\u099b\u099d\5\u0176\u00bc\2\u099c\u099b\3"+
		"\2\2\2\u099c\u099d\3\2\2\2\u099d\u099f\3\2\2\2\u099e\u09a0\5\u0178\u00bd"+
		"\2\u099f\u099e\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u0181\3\2\2\2\u09a1\u09a2"+
		"\5\u02da\u016e\2\u09a2\u09a5\5\u019e\u00d0\2\u09a3\u09a4\7N\2\2\u09a4"+
		"\u09a6\7\u016c\2\2\u09a5\u09a3\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u0183"+
		"\3\2\2\2\u09a7\u09aa\5\u0186\u00c4\2\u09a8\u09aa\5\u0188\u00c5\2\u09a9"+
		"\u09a7\3\2\2\2\u09a9\u09a8\3\2\2\2\u09aa\u0185\3\2\2\2\u09ab\u09ae\5\u0166"+
		"\u00b4\2\u09ac\u09ae\5\u0160\u00b1\2\u09ad\u09ab\3\2\2\2\u09ad\u09ac\3"+
		"\2\2\2\u09ae\u0187\3\2\2\2\u09af\u09b0\5\u02da\u016e\2\u09b0\u09b2\5\u019e"+
		"\u00d0\2\u09b1\u09b3\5\u018a\u00c6\2\u09b2\u09b1\3\2\2\2\u09b2\u09b3\3"+
		"\2\2\2\u09b3\u09b6\3\2\2\2\u09b4\u09b5\7N\2\2\u09b5\u09b7\7\u016c\2\2"+
		"\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7\u0189\3\2\2\2\u09b8\u09bb"+
		"\5\u018c\u00c7\2\u09b9\u09bb\5\u018e\u00c8\2\u09ba\u09b8\3\2\2\2\u09ba"+
		"\u09b9\3\2\2\2\u09bb\u018b\3\2\2\2\u09bc\u09bd\7\u0124\2\2\u09bd\u09bf"+
		"\5\u02da\u016e\2\u09be\u09bc\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\3"+
		"\2\2\2\u09c0\u09c1\7\u0123\2\2\u09c1\u09c2\5\u023e\u0120\2\u09c2\u09c3"+
		"\7\u0152\2\2\u09c3\u09c4\5\u014e\u00a8\2\u09c4\u09c6\7\u0153\2\2\u09c5"+
		"\u09c7\5\u0198\u00cd\2\u09c6\u09c5\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u018d"+
		"\3\2\2\2\u09c8\u09c9\7\u0124\2\2\u09c9\u09cb\5\u02da\u016e\2\u09ca\u09c8"+
		"\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09ce\5\u0196\u00cc"+
		"\2\u09cd\u09cf\5\u0198\u00cd\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2"+
		"\u09cf\u018f\3\2\2\2\u09d0\u09d3\5\u0192\u00ca\2\u09d1\u09d3\5\u0194\u00cb"+
		"\2\u09d2\u09d0\3\2\2\2\u09d2\u09d1\3\2\2\2\u09d3\u0191\3\2\2\2\u09d4\u09d5"+
		"\7\u0124\2\2\u09d5\u09d7\5\u02da\u016e\2\u09d6\u09d4\3\2\2\2\u09d6\u09d7"+
		"\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09d9\7\u0123\2\2\u09d9\u09da\5\u023e"+
		"\u0120\2\u09da\u09db\7\u0152\2\2\u09db\u09dc\5\u014e\u00a8\2\u09dc\u09de"+
		"\7\u0153\2\2\u09dd\u09df\5\u019a\u00ce\2\u09de\u09dd\3\2\2\2\u09de\u09df"+
		"\3\2\2\2\u09df\u0193\3\2\2\2\u09e0\u09e1\7\u0124\2\2\u09e1\u09e3\5\u02da"+
		"\u016e\2\u09e2\u09e0\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4\3\2\2\2\u09e4"+
		"\u09e6\5\u0196\u00cc\2\u09e5\u09e7\5\u019a\u00ce\2\u09e6\u09e5\3\2\2\2"+
		"\u09e6\u09e7\3\2\2\2\u09e7\u0195\3\2\2\2\u09e8\u09e9\7\u0121\2\2\u09e9"+
		"\u09ea\7\u012b\2\2\u09ea\u0197\3\2\2\2\u09eb\u09ec\5\u0156\u00ac\2\u09ec"+
		"\u09ed\5\u015e\u00b0\2\u09ed\u0199\3\2\2\2\u09ee\u09ef\5\u0156\u00ac\2"+
		"\u09ef\u09f0\5\u015e\u00b0\2\u09f0\u019b\3\2\2\2\u09f1\u09f2\5\u02da\u016e"+
		"\2\u09f2\u09f3\7\u014f\2\2\u09f3\u09f6\5\u019e\u00d0\2\u09f4\u09f5\7N"+
		"\2\2\u09f5\u09f7\7\u016c\2\2\u09f6\u09f4\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7"+
		"\u019d\3\2\2\2\u09f8\u09f9\5\u01a2\u00d2\2\u09f9\u019f\3\2\2\2\u09fa\u09ff"+
		"\5\u019e\u00d0\2\u09fb\u09fc\7\u0150\2\2\u09fc\u09fe\5\u019e\u00d0\2\u09fd"+
		"\u09fb\3\2\2\2\u09fe\u0a01\3\2\2\2\u09ff\u09fd\3\2\2\2\u09ff\u0a00\3\2"+
		"\2\2\u0a00\u01a1\3\2\2\2\u0a01\u09ff\3\2\2\2\u0a02\u0a08\5\u01a4\u00d3"+
		"\2\u0a03\u0a08\5\u01a6\u00d4\2\u0a04\u0a08\5\u01a8\u00d5\2\u0a05\u0a08"+
		"\5\u01aa\u00d6\2\u0a06\u0a08\5\u01ac\u00d7\2\u0a07\u0a02\3\2\2\2\u0a07"+
		"\u0a03\3\2\2\2\u0a07\u0a04\3\2\2\2\u0a07\u0a05\3\2\2\2\u0a07\u0a06\3\2"+
		"\2\2\u0a08\u01a3\3\2\2\2\u0a09\u0a31\7P\2\2\u0a0a\u0a31\7Q\2\2\u0a0b\u0a31"+
		"\7R\2\2\u0a0c\u0a31\7S\2\2\u0a0d\u0a31\7O\2\2\u0a0e\u0a31\7T\2\2\u0a0f"+
		"\u0a11\7U\2\2\u0a10\u0a12\7V\2\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12\3\2\2"+
		"\2\u0a12\u0a31\3\2\2\2\u0a13\u0a31\7W\2\2\u0a14\u0a31\7X\2\2\u0a15\u0a31"+
		"\7Y\2\2\u0a16\u0a31\7Z\2\2\u0a17\u0a18\7Y\2\2\u0a18\u0a19\7\u0097\2\2"+
		"\u0a19\u0a1a\7\62\2\2\u0a1a\u0a1b\7[\2\2\u0a1b\u0a31\7\\\2\2\u0a1c\u0a31"+
		"\7_\2\2\u0a1d\u0a31\7\u00d0\2\2\u0a1e\u0a26\7^\2\2\u0a1f\u0a20\7\u0152"+
		"\2\2\u0a20\u0a23\7\u0171\2\2\u0a21\u0a22\7\u0150\2\2\u0a22\u0a24\7\u0171"+
		"\2\2\u0a23\u0a21\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25"+
		"\u0a27\7\u0153\2\2\u0a26\u0a1f\3\2\2\2\u0a26\u0a27\3\2\2\2\u0a27\u0a31"+
		"\3\2\2\2\u0a28\u0a29\7a\2\2\u0a29\u0a2a\7\u0152\2\2\u0a2a\u0a2b\7\u0171"+
		"\2\2\u0a2b\u0a31\7\u0153\2\2\u0a2c\u0a2d\7`\2\2\u0a2d\u0a2e\7\u0152\2"+
		"\2\u0a2e\u0a2f\7\u0171\2\2\u0a2f\u0a31\7\u0153\2\2\u0a30\u0a09\3\2\2\2"+
		"\u0a30\u0a0a\3\2\2\2\u0a30\u0a0b\3\2\2\2\u0a30\u0a0c\3\2\2\2\u0a30\u0a0d"+
		"\3\2\2\2\u0a30\u0a0e\3\2\2\2\u0a30\u0a0f\3\2\2\2\u0a30\u0a13\3\2\2\2\u0a30"+
		"\u0a14\3\2\2\2\u0a30\u0a15\3\2\2\2\u0a30\u0a16\3\2\2\2\u0a30\u0a17\3\2"+
		"\2\2\u0a30\u0a1c\3\2\2\2\u0a30\u0a1d\3\2\2\2\u0a30\u0a1e\3\2\2\2\u0a30"+
		"\u0a28\3\2\2\2\u0a30\u0a2c\3\2\2\2\u0a31\u01a5\3\2\2\2\u0a32\u0a33\7b"+
		"\2\2\u0a33\u0a34\7\u015c\2\2\u0a34\u0a35\5\u01a2\u00d2\2\u0a35\u0a36\7"+
		"\u015e\2\2\u0a36\u01a7\3\2\2\2\u0a37\u0a38\7c\2\2\u0a38\u0a39\7\u015c"+
		"\2\2\u0a39\u0a3a\5\u014a\u00a6\2\u0a3a\u0a3b\7\u015e\2\2\u0a3b\u01a9\3"+
		"\2\2\2\u0a3c\u0a3d\7d\2\2\u0a3d\u0a3e\7\u015c\2\2\u0a3e\u0a3f\5\u01a4"+
		"\u00d3\2\u0a3f\u0a40\7\u0150\2\2\u0a40\u0a41\5\u01a2\u00d2\2\u0a41\u0a42"+
		"\7\u015e\2\2\u0a42\u01ab\3\2\2\2\u0a43\u0a44\7e\2\2\u0a44\u0a45\7\u015c"+
		"\2\2\u0a45\u0a46\5\u01a0\u00d1\2\u0a46\u0a47\7\u015e\2\2\u0a47\u01ad\3"+
		"\2\2\2\u0a48\u0a49\78\2\2\u0a49\u0a61\7\5\2\2\u0a4a\u0a4c\78\2\2\u0a4b"+
		"\u0a4d\7\32\2\2\u0a4c\u0a4b\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a61\3"+
		"\2\2\2\u0a4e\u0a4f\7\u00b3\2\2\u0a4f\u0a61\7\5\2\2\u0a50\u0a52\7\u00b3"+
		"\2\2\u0a51\u0a53\7\32\2\2\u0a52\u0a51\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53"+
		"\u0a61\3\2\2\2\u0a54\u0a55\79\2\2\u0a55\u0a61\7\5\2\2\u0a56\u0a58\79\2"+
		"\2\u0a57\u0a59\7\32\2\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59"+
		"\u0a61\3\2\2\2\u0a5a\u0a5b\7\u00b1\2\2\u0a5b\u0a61\7\5\2\2\u0a5c\u0a5e"+
		"\7\u00b1\2\2\u0a5d\u0a5f\7\32\2\2\u0a5e\u0a5d\3\2\2\2\u0a5e\u0a5f\3\2"+
		"\2\2\u0a5f\u0a61\3\2\2\2\u0a60\u0a48\3\2\2\2\u0a60\u0a4a\3\2\2\2\u0a60"+
		"\u0a4e\3\2\2\2\u0a60\u0a50\3\2\2\2\u0a60\u0a54\3\2\2\2\u0a60\u0a56\3\2"+
		"\2\2\u0a60\u0a5a\3\2\2\2\u0a60\u0a5c\3\2\2\2\u0a61\u01af\3\2\2\2\u0a62"+
		"\u0a64\5\u01b4\u00db\2\u0a63\u0a62\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64\u0a65"+
		"\3\2\2\2\u0a65\u0a66\5\u01b2\u00da\2\u0a66\u01b1\3\2\2\2\u0a67\u0a6a\5"+
		"\u01b8\u00dd\2\u0a68\u0a6a\5\u01bc\u00df\2\u0a69\u0a67\3\2\2\2\u0a69\u0a68"+
		"\3\2\2\2\u0a6a\u01b3\3\2\2\2\u0a6b\u0a6c\7\u0097\2\2\u0a6c\u0a71\5\u01b6"+
		"\u00dc\2\u0a6d\u0a6e\7\u0150\2\2\u0a6e\u0a70\5\u01b6\u00dc\2\u0a6f\u0a6d"+
		"\3\2\2\2\u0a70\u0a73\3\2\2\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72"+
		"\u01b5\3\2\2\2\u0a73\u0a71\3\2\2\2\u0a74\u0a75\5\u02da\u016e\2\u0a75\u0a76"+
		"\7\30\2\2\u0a76\u0a77\7\u0152\2\2\u0a77\u0a78\5\u01b0\u00d9\2\u0a78\u0a79"+
		"\7\u0153\2\2\u0a79\u01b7\3\2\2\2\u0a7a\u0a80\5\u01ba\u00de\2\u0a7b\u0a7c"+
		"\5\u01ae\u00d8\2\u0a7c\u0a7d\5\u01ba\u00de\2\u0a7d\u0a7f\3\2\2\2\u0a7e"+
		"\u0a7b\3\2\2\2\u0a7f\u0a82\3\2\2\2\u0a80\u0a7e\3\2\2\2\u0a80\u0a81\3\2"+
		"\2\2\u0a81\u01b9\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a83\u0a85\5\u021e\u0110"+
		"\2\u0a84\u0a86\5\u01c6\u00e4\2\u0a85\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2"+
		"\u0a87\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u01bb\3\2\2\2\u0a89\u0a8c"+
		"\5\u01c8\u00e5\2\u0a8a\u0a8d\5\u01c0\u00e1\2\u0a8b\u0a8d\5\u024e\u0128"+
		"\2\u0a8c\u0a8a\3\2\2\2\u0a8c\u0a8b\3\2\2\2\u0a8d\u0a90\3\2\2\2\u0a8e\u0a90"+
		"\5\u01c0\u00e1\2\u0a8f\u0a89\3\2\2\2\u0a8f\u0a8e\3\2\2\2\u0a90\u01bd\3"+
		"\2\2\2\u0a91\u0a93\5\u01f8\u00fd\2\u0a92\u0a94\5\u021e\u0110\2\u0a93\u0a92"+
		"\3\2\2\2\u0a93\u0a94\3\2\2\2\u0a94\u0a96\3\2\2\2\u0a95\u0a97\5\u024a\u0126"+
		"\2\u0a96\u0a95\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a99\3\2\2\2\u0a98\u0a9a"+
		"\5\u0256\u012c\2\u0a99\u0a98\3\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a\u0a9c\3"+
		"\2\2\2\u0a9b\u0a9d\5\u0266\u0134\2\u0a9c\u0a9b\3\2\2\2\u0a9c\u0a9d\3\2"+
		"\2\2\u0a9d\u0a9f\3\2\2\2\u0a9e\u0aa0\5\u0206\u0104\2\u0a9f\u0a9e\3\2\2"+
		"\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa6\3\2\2\2\u0aa1\u0aa2\7\u0152\2\2\u0aa2"+
		"\u0aa3\5\u01c0\u00e1\2\u0aa3\u0aa4\7\u0153\2\2\u0aa4\u0aa6\3\2\2\2\u0aa5"+
		"\u0a91\3\2\2\2\u0aa5\u0aa1\3\2\2\2\u0aa6\u01bf\3\2\2\2\u0aa7\u0aa9\5\u01be"+
		"\u00e0\2\u0aa8\u0aaa\5\u01c2\u00e2\2\u0aa9\u0aa8\3\2\2\2\u0aa9\u0aaa\3"+
		"\2\2\2\u0aaa\u0aac\3\2\2\2\u0aab\u0aad\5\u0276\u013c\2\u0aac\u0aab\3\2"+
		"\2\2\u0aac\u0aad\3\2\2\2\u0aad\u0aaf\3\2\2\2\u0aae\u0ab0\5\u0278\u013d"+
		"\2\u0aaf\u0aae\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u0ab2\3\2\2\2\u0ab1\u0ab3"+
		"\5\u027c\u013f\2\u0ab2\u0ab1\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0ab5\3"+
		"\2\2\2\u0ab4\u0ab6\5\u027e\u0140\2\u0ab5\u0ab4\3\2\2\2\u0ab5\u0ab6\3\2"+
		"\2\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab9\5\u01cc\u00e7\2\u0ab8\u0ab7\3\2\2"+
		"\2\u0ab8\u0ab9\3\2\2\2\u0ab9\u01c1\3\2\2\2\u0aba\u0abb\5\u01ae\u00d8\2"+
		"\u0abb\u0abc\5\u01be\u00e0\2\u0abc\u0abe\3\2\2\2\u0abd\u0aba\3\2\2\2\u0abe"+
		"\u0abf\3\2\2\2\u0abf\u0abd\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u01c3\3\2"+
		"\2\2\u0ac1\u0ac3\5\u01b4\u00db\2\u0ac2\u0ac1\3\2\2\2\u0ac2\u0ac3\3\2\2"+
		"\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\5\u01c0\u00e1\2\u0ac5\u01c5\3\2\2\2"+
		"\u0ac6\u0ac7\5\u01c8\u00e5\2\u0ac7\u0ac9\5\u01f8\u00fd\2\u0ac8\u0aca\5"+
		"\u0230\u0119\2\u0ac9\u0ac8\3\2\2\2\u0ac9\u0aca\3\2\2\2\u0aca\u0acc\3\2"+
		"\2\2\u0acb\u0acd\5\u024a\u0126\2\u0acc\u0acb\3\2\2\2\u0acc\u0acd\3\2\2"+
		"\2\u0acd\u0acf\3\2\2\2\u0ace\u0ad0\5\u0256\u012c\2\u0acf\u0ace\3\2\2\2"+
		"\u0acf\u0ad0\3\2\2\2\u0ad0\u0ad2\3\2\2\2\u0ad1\u0ad3\5\u0266\u0134\2\u0ad2"+
		"\u0ad1\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3\u0ad5\3\2\2\2\u0ad4\u0ad6\5\u0206"+
		"\u0104\2\u0ad5\u0ad4\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad8\3\2\2\2\u0ad7"+
		"\u0ad9\5\u0276\u013c\2\u0ad8\u0ad7\3\2\2\2\u0ad8\u0ad9\3\2\2\2\u0ad9\u0adb"+
		"\3\2\2\2\u0ada\u0adc\5\u0278\u013d\2\u0adb\u0ada\3\2\2\2\u0adb\u0adc\3"+
		"\2\2\2\u0adc\u0ade\3\2\2\2\u0add\u0adf\5\u027c\u013f\2\u0ade\u0add\3\2"+
		"\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0ae1\3\2\2\2\u0ae0\u0ae2\5\u027e\u0140"+
		"\2\u0ae1\u0ae0\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0ae4\3\2\2\2\u0ae3\u0ae5"+
		"\5\u01cc\u00e7\2\u0ae4\u0ae3\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u0b06\3"+
		"\2\2\2\u0ae6\u0ae8\5\u01f8\u00fd\2\u0ae7\u0ae9\5\u0230\u0119\2\u0ae8\u0ae7"+
		"\3\2\2\2\u0ae8\u0ae9\3\2\2\2\u0ae9\u0aeb\3\2\2\2\u0aea\u0aec\5\u024a\u0126"+
		"\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aee\3\2\2\2\u0aed\u0aef"+
		"\5\u0256\u012c\2\u0aee\u0aed\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0af1\3"+
		"\2\2\2\u0af0\u0af2\5\u0266\u0134\2\u0af1\u0af0\3\2\2\2\u0af1\u0af2\3\2"+
		"\2\2\u0af2\u0af4\3\2\2\2\u0af3\u0af5\5\u0206\u0104\2\u0af4\u0af3\3\2\2"+
		"\2\u0af4\u0af5\3\2\2\2\u0af5\u0af7\3\2\2\2\u0af6\u0af8\5\u0276\u013c\2"+
		"\u0af7\u0af6\3\2\2\2\u0af7\u0af8\3\2\2\2\u0af8\u0afa\3\2\2\2\u0af9\u0afb"+
		"\5\u0278\u013d\2\u0afa\u0af9\3\2\2\2\u0afa\u0afb\3\2\2\2\u0afb\u0afd\3"+
		"\2\2\2\u0afc\u0afe\5\u027c\u013f\2\u0afd\u0afc\3\2\2\2\u0afd\u0afe\3\2"+
		"\2\2\u0afe\u0b00\3\2\2\2\u0aff\u0b01\5\u027e\u0140\2\u0b00\u0aff\3\2\2"+
		"\2\u0b00\u0b01\3\2\2\2\u0b01\u0b03\3\2\2\2\u0b02\u0b04\5\u01cc\u00e7\2"+
		"\u0b03\u0b02\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b06\3\2\2\2\u0b05\u0ac6"+
		"\3\2\2\2\u0b05\u0ae6\3\2\2\2\u0b06\u01c7\3\2\2\2\u0b07\u0b08\7\33\2\2"+
		"\u0b08\u0b09\7\34\2\2\u0b09\u0b0b\5\u01ca\u00e6\2\u0b0a\u0b0c\5*\26\2"+
		"\u0b0b\u0b0a\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b1a\3\2\2\2\u0b0d\u0b0e"+
		"\7\33\2\2\u0b0e\u0b10\7j\2\2\u0b0f\u0b11\7\'\2\2\u0b10\u0b0f\3\2\2\2\u0b10"+
		"\u0b11\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b17\5\u02ca\u0166\2\u0b13\u0b14"+
		"\7\u0152\2\2\u0b14\u0b15\5\u014c\u00a7\2\u0b15\u0b16\7\u0153\2\2\u0b16"+
		"\u0b18\3\2\2\2\u0b17\u0b13\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b1a\3\2"+
		"\2\2\u0b19\u0b07\3\2\2\2\u0b19\u0b0d\3\2\2\2\u0b1a\u01c9\3\2\2\2\u0b1b"+
		"\u0b1d\7\62\2\2\u0b1c\u0b1b\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1e\3"+
		"\2\2\2\u0b1e\u0b1f\7\61\2\2\u0b1f\u0b21\7\u016c\2\2\u0b20\u0b22\5\u012c"+
		"\u0097\2\u0b21\u0b20\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b24\3\2\2\2\u0b23"+
		"\u0b25\5\u0142\u00a2\2\u0b24\u0b23\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b29"+
		"\3\2\2\2\u0b26\u0b27\7\'\2\2\u0b27\u0b29\5\u02ca\u0166\2\u0b28\u0b1c\3"+
		"\2\2\2\u0b28\u0b26\3\2\2\2\u0b29\u01cb\3\2\2\2\u0b2a\u0b2d\7\u009b\2\2"+
		"\u0b2b\u0b2c\7\u0171\2\2\u0b2c\u0b2e\7\u0150\2\2\u0b2d\u0b2b\3\2\2\2\u0b2d"+
		"\u0b2e\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f\u0b35\7\u0171\2\2\u0b30\u0b31"+
		"\7\u009b\2\2\u0b31\u0b32\7\u0171\2\2\u0b32\u0b33\7\u009c\2\2\u0b33\u0b35"+
		"\7\u0171\2\2\u0b34\u0b2a\3\2\2\2\u0b34\u0b30\3\2\2\2\u0b35\u01cd\3\2\2"+
		"\2\u0b36\u0b37\7\u00af\2\2\u0b37\u0b38\7\27\2\2\u0b38\u0b3a\5\u023e\u0120"+
		"\2\u0b39\u0b3b\5\u024a\u0126\2\u0b3a\u0b39\3\2\2\2\u0b3a\u0b3b\3\2\2\2"+
		"\u0b3b\u01cf\3\2\2\2\u0b3c\u0b3d\5\u0218\u010d\2\u0b3d\u0b3e\7\u0158\2"+
		"\2\u0b3e\u0b3f\5\u02c0\u0161\2\u0b3f\u01d1\3\2\2\2\u0b40\u0b41\7\u009d"+
		"\2\2\u0b41\u0b46\5\u01d0\u00e9\2\u0b42\u0b43\7\u0150\2\2\u0b43\u0b45\5"+
		"\u01d0\u00e9\2\u0b44\u0b42\3\2\2\2\u0b45\u0b48\3\2\2\2\u0b46\u0b44\3\2"+
		"\2\2\u0b46\u0b47\3\2\2\2\u0b47\u01d3\3\2\2\2\u0b48\u0b46\3\2\2\2\u0b49"+
		"\u0b4a\7\u00e2\2\2\u0b4a\u0b4b\5\u023e\u0120\2\u0b4b\u0b4d\5\u01d2\u00ea"+
		"\2\u0b4c\u0b4e\5\u024a\u0126\2\u0b4d\u0b4c\3\2\2\2\u0b4d\u0b4e\3\2\2\2"+
		"\u0b4e\u01d5\3\2\2\2\u0b4f\u0b54\5\u01d8\u00ed\2\u0b50\u0b54\5\u01e2\u00f2"+
		"\2\u0b51\u0b54\5\u01e4\u00f3\2\u0b52\u0b54\5\u01e6\u00f4\2\u0b53\u0b4f"+
		"\3\2\2\2\u0b53\u0b50\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b53\u0b52\3\2\2\2\u0b54"+
		"\u01d7\3\2\2\2\u0b55\u0b56\7\u0115\2\2\u0b56\u0b5f\7\u0116\2\2\u0b57\u0b5c"+
		"\5\u01da\u00ee\2\u0b58\u0b59\7\u0150\2\2\u0b59\u0b5b\5\u01da\u00ee\2\u0b5a"+
		"\u0b58\3\2\2\2\u0b5b\u0b5e\3\2\2\2\u0b5c\u0b5a\3\2\2\2\u0b5c\u0b5d\3\2"+
		"\2\2\u0b5d\u0b60\3\2\2\2\u0b5e\u0b5c\3\2\2\2\u0b5f\u0b57\3\2\2\2\u0b5f"+
		"\u0b60\3\2\2\2\u0b60\u01d9\3\2\2\2\u0b61\u0b64\5\u01de\u00f0\2\u0b62\u0b64"+
		"\5\u01dc\u00ef\2\u0b63\u0b61\3\2\2\2\u0b63\u0b62\3\2\2\2\u0b64\u01db\3"+
		"\2\2\2\u0b65\u0b66\7\u00c8\2\2\u0b66\u0b6a\7\u011a\2\2\u0b67\u0b68\7\u00c8"+
		"\2\2\u0b68\u0b6a\7\u011b\2\2\u0b69\u0b65\3\2\2\2\u0b69\u0b67\3\2\2\2\u0b6a"+
		"\u01dd\3\2\2\2\u0b6b\u0b6c\7\u011c\2\2\u0b6c\u0b6d\7\u011d\2\2\u0b6d\u0b6e"+
		"\5\u01e0\u00f1\2\u0b6e\u01df\3\2\2\2\u0b6f\u0b70\7\u011e\2\2\u0b70\u01e1"+
		"\3\2\2\2\u0b71\u0b73\7\u0117\2\2\u0b72\u0b74\7\u0119\2\2\u0b73\u0b72\3"+
		"\2\2\2\u0b73\u0b74\3\2\2\2\u0b74\u01e3\3\2\2\2\u0b75\u0b77\7\u0118\2\2"+
		"\u0b76\u0b78\7\u0119\2\2\u0b77\u0b76\3\2\2\2\u0b77\u0b78\3\2\2\2\u0b78"+
		"\u01e5\3\2\2\2\u0b79\u0b7a\7\u009d\2\2\u0b7a\u0b7b\7\u011f\2\2\u0b7b\u0b7c"+
		"\5\u02c8\u0165\2\u0b7c\u01e7\3\2\2\2\u0b7d\u0b7e\7\u012c\2\2\u0b7e\u0b80"+
		"\7\u0104\2\2\u0b7f\u0b81\7\u0171\2\2\u0b80\u0b7f\3\2\2\2\u0b81\u0b82\3"+
		"\2\2\2\u0b82\u0b80\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u01e9\3\2\2\2\u0b84"+
		"\u0b85\7\u012f\2\2\u0b85\u0b86\7j\2\2\u0b86\u0b8b\5\u023e\u0120\2\u0b87"+
		"\u0b89\7\30\2\2\u0b88\u0b87\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89\u0b8a\3"+
		"\2\2\2\u0b8a\u0b8c\5\u02da\u016e\2\u0b8b\u0b88\3\2\2\2\u0b8b\u0b8c\3\2"+
		"\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b8e\7\64\2\2\u0b8e\u0b8f\5\u0226\u0114"+
		"\2\u0b8f\u0b90\7$\2\2\u0b90\u0b91\5\u02c0\u0161\2\u0b91\u0b92\5\u01ec"+
		"\u00f7\2\u0b92\u01eb\3\2\2\2\u0b93\u0b96\5\u01f0\u00f9\2\u0b94\u0b96\5"+
		"\u01f2\u00fa\2\u0b95\u0b93\3\2\2\2\u0b95\u0b94\3\2\2\2\u0b96\u0b99\3\2"+
		"\2\2\u0b97\u0b95\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b9b\3\2\2\2\u0b99"+
		"\u0b97\3\2\2\2\u0b9a\u0b9c\5\u01ee\u00f8\2\u0b9b\u0b9a\3\2\2\2\u0b9b\u0b9c"+
		"\3\2\2\2\u0b9c\u01ed\3\2\2\2\u0b9d\u0b9e\7\u00a5\2\2\u0b9e\u0b9f\7\t\2"+
		"\2\u0b9f\u0ba2\7\u0130\2\2\u0ba0\u0ba1\7\7\2\2\u0ba1\u0ba3\5\u02c0\u0161"+
		"\2\u0ba2\u0ba0\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u0ba4\3\2\2\2\u0ba4\u0ba5"+
		"\7\u00a6\2\2\u0ba5\u0ba6\7\33\2\2\u0ba6\u0ba7\7\u0109\2\2\u0ba7\u0ba8"+
		"\5\u0252\u012a\2\u0ba8\u01ef\3\2\2\2\u0ba9\u0baa\7\u00a5\2\2\u0baa\u0bab"+
		"\7\u0130\2\2\u0bab\u0bac\7\7\2\2\u0bac\u0bad\5\u02c0\u0161\2\u0bad\u0bae"+
		"\7\u00a6\2\2\u0bae\u0baf\5\u01f4\u00fb\2\u0baf\u01f1\3\2\2\2\u0bb0\u0bb1"+
		"\7\u00a5\2\2\u0bb1\u0bb2\7\u0130\2\2\u0bb2\u0bb3\7\u00a6\2\2\u0bb3\u0bb4"+
		"\5\u01f4\u00fb\2\u0bb4\u01f3\3\2\2\2\u0bb5\u0bb6\7\u00e2\2\2\u0bb6\u0bb9"+
		"\5\u01d2\u00ea\2\u0bb7\u0bb9\7\u00af\2\2\u0bb8\u0bb5\3\2\2\2\u0bb8\u0bb7"+
		"\3\2\2\2\u0bb9\u01f5\3\2\2\2\u0bba\u0bbb\7w\2\2\u0bbb\u0bbd\7\u010c\2"+
		"\2\u0bbc\u0bbe\7\u016c\2\2\u0bbd\u0bbc\3\2\2\2\u0bbe\u0bbf\3\2\2\2\u0bbf"+
		"\u0bbd\3\2\2\2\u0bbf\u0bc0\3\2\2\2\u0bc0\u01f7\3\2\2\2\u0bc1\u0bc3\7\31"+
		"\2\2\u0bc2\u0bc4\7\u0177\2\2\u0bc3\u0bc2\3\2\2\2\u0bc3\u0bc4\3\2\2\2\u0bc4"+
		"\u0bcb\3\2\2\2\u0bc5\u0bc7\t\21\2\2\u0bc6\u0bc5\3\2\2\2\u0bc6\u0bc7\3"+
		"\2\2\2\u0bc7\u0bc8\3\2\2\2\u0bc8\u0bcc\5\u01fa\u00fe\2\u0bc9\u0bca\7\63"+
		"\2\2\u0bca\u0bcc\5\u01fc\u00ff\2\u0bcb\u0bc6\3\2\2\2\u0bcb\u0bc9\3\2\2"+
		"\2\u0bcc\u0bcf\3\2\2\2\u0bcd\u0bcf\5\u0200\u0101\2\u0bce\u0bc1\3\2\2\2"+
		"\u0bce\u0bcd\3\2\2\2\u0bcf\u01f9\3\2\2\2\u0bd0\u0bd5\5\u01fe\u0100\2\u0bd1"+
		"\u0bd2\7\u0150\2\2\u0bd2\u0bd4\5\u01fe\u0100\2\u0bd3\u0bd1\3\2\2\2\u0bd4"+
		"\u0bd7\3\2\2\2\u0bd5\u0bd3\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u01fb\3\2"+
		"\2\2\u0bd7\u0bd5\3\2\2\2\u0bd8\u0bd9\7\u0152\2\2\u0bd9\u0bda\5\u0204\u0103"+
		"\2\u0bda\u0bdc\7\u0153\2\2\u0bdb\u0bdd\5\u0122\u0092\2\u0bdc\u0bdb\3\2"+
		"\2\2\u0bdc\u0bdd\3\2\2\2\u0bdd\u0bdf\3\2\2\2\u0bde\u0be0\5\u0126\u0094"+
		"\2\u0bdf\u0bde\3\2\2\2\u0bdf\u0be0\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1\u0be2"+
		"\7\64\2\2\u0be2\u0bf1\7\u016c\2\2\u0be3\u0bef\7\30\2\2\u0be4\u0be7\7\u0152"+
		"\2\2\u0be5\u0be8\5\u021c\u010f\2\u0be6\u0be8\5\u0146\u00a4\2\u0be7\u0be5"+
		"\3\2\2\2\u0be7\u0be6\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\7\u0153\2"+
		"\2\u0bea\u0bf0\3\2\2\2\u0beb\u0bee\5\u021c\u010f\2\u0bec\u0bee\5\u0146"+
		"\u00a4\2\u0bed\u0beb\3\2\2\2\u0bed\u0bec\3\2\2\2\u0bee\u0bf0\3\2\2\2\u0bef"+
		"\u0be4\3\2\2\2\u0bef\u0bed\3\2\2\2\u0bf0\u0bf2\3\2\2\2\u0bf1\u0be3\3\2"+
		"\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf4\3\2\2\2\u0bf3\u0bf5\5\u0122\u0092"+
		"\2\u0bf4\u0bf3\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0bf7\3\2\2\2\u0bf6\u0bf8"+
		"\5\u0124\u0093\2\u0bf7\u0bf6\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u01fd\3"+
		"\2\2\2\u0bf9\u0c0e\5\u0216\u010c\2\u0bfa\u0c0b\5\u02c0\u0161\2\u0bfb\u0bfd"+
		"\7\30\2\2\u0bfc\u0bfb\3\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0bfe\3\2\2\2"+
		"\u0bfe\u0c0c\5\u02da\u016e\2\u0bff\u0c00\7\30\2\2\u0c00\u0c01\7\u0152"+
		"\2\2\u0c01\u0c06\5\u02da\u016e\2\u0c02\u0c03\7\u0150\2\2\u0c03\u0c05\5"+
		"\u02da\u016e\2\u0c04\u0c02\3\2\2\2\u0c05\u0c08\3\2\2\2\u0c06\u0c04\3\2"+
		"\2\2\u0c06\u0c07\3\2\2\2\u0c07\u0c09\3\2\2\2\u0c08\u0c06\3\2\2\2\u0c09"+
		"\u0c0a\7\u0153\2\2\u0c0a\u0c0c\3\2\2\2\u0c0b\u0bfc\3\2\2\2\u0c0b\u0bff"+
		"\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0e\3\2\2\2\u0c0d\u0bf9\3\2\2\2\u0c0d"+
		"\u0bfa\3\2\2\2\u0c0e\u01ff\3\2\2\2\u0c0f\u0c10\7d\2\2\u0c10\u0c14\5\u0204"+
		"\u0103\2\u0c11\u0c12\7f\2\2\u0c12\u0c14\5\u0204\u0103\2\u0c13\u0c0f\3"+
		"\2\2\2\u0c13\u0c11\3\2\2\2\u0c14\u0c16\3\2\2\2\u0c15\u0c17\5\u0122\u0092"+
		"\2\u0c16\u0c15\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0c19\3\2\2\2\u0c18\u0c1a"+
		"\5\u0126\u0094\2\u0c19\u0c18\3\2\2\2\u0c19\u0c1a\3\2\2\2\u0c1a\u0c1b\3"+
		"\2\2\2\u0c1b\u0c1c\7\64\2\2\u0c1c\u0c2b\7\u016c\2\2\u0c1d\u0c29\7\30\2"+
		"\2\u0c1e\u0c21\7\u0152\2\2\u0c1f\u0c22\5\u021c\u010f\2\u0c20\u0c22\5\u0146"+
		"\u00a4\2\u0c21\u0c1f\3\2\2\2\u0c21\u0c20\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23"+
		"\u0c24\7\u0153\2\2\u0c24\u0c2a\3\2\2\2\u0c25\u0c28\5\u021c\u010f\2\u0c26"+
		"\u0c28\5\u0146\u00a4\2\u0c27\u0c25\3\2\2\2\u0c27\u0c26\3\2\2\2\u0c28\u0c2a"+
		"\3\2\2\2\u0c29\u0c1e\3\2\2\2\u0c29\u0c27\3\2\2\2\u0c2a\u0c2c\3\2\2\2\u0c2b"+
		"\u0c1d\3\2\2\2\u0c2b\u0c2c\3\2\2\2\u0c2c\u0c2e\3\2\2\2\u0c2d\u0c2f\5\u0122"+
		"\u0092\2\u0c2e\u0c2d\3\2\2\2\u0c2e\u0c2f\3\2\2\2\u0c2f\u0c31\3\2\2\2\u0c30"+
		"\u0c32\5\u0124\u0093\2\u0c31\u0c30\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0201"+
		"\3\2\2\2\u0c33\u0c36\5\u0216\u010c\2\u0c34\u0c36\5\u02c0\u0161\2\u0c35"+
		"\u0c33\3\2\2\2\u0c35\u0c34\3\2\2\2\u0c36\u0203\3\2\2\2\u0c37\u0c3c\5\u0202"+
		"\u0102\2\u0c38\u0c39\7\u0150\2\2\u0c39\u0c3b\5\u0202\u0102\2\u0c3a\u0c38"+
		"\3\2\2\2\u0c3b\u0c3e\3\2\2\2\u0c3c\u0c3a\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d"+
		"\u0205\3\2\2\2\u0c3e\u0c3c\3\2\2\2\u0c3f\u0c40\7\u00ea\2\2\u0c40\u0c45"+
		"\5\u0208\u0105\2\u0c41\u0c42\7\u0150\2\2\u0c42\u0c44\5\u0208\u0105\2\u0c43"+
		"\u0c41\3\2\2\2\u0c44\u0c47\3\2\2\2\u0c45\u0c43\3\2\2\2\u0c45\u0c46\3\2"+
		"\2\2\u0c46\u0207\3\2\2\2\u0c47\u0c45\3\2\2\2\u0c48\u0c49\5\u02da\u016e"+
		"\2\u0c49\u0c4a\7\30\2\2\u0c4a\u0c4b\5\u020a\u0106\2\u0c4b\u0209\3\2\2"+
		"\2\u0c4c\u0c59\5\u02da\u016e\2\u0c4d\u0c4f\7\u0152\2\2\u0c4e\u0c50\5\u02da"+
		"\u016e\2\u0c4f\u0c4e\3\2\2\2\u0c4f\u0c50\3\2\2\2\u0c50\u0c52\3\2\2\2\u0c51"+
		"\u0c53\5\u0244\u0123\2\u0c52\u0c51\3\2\2\2\u0c52\u0c53\3\2\2\2\u0c53\u0c55"+
		"\3\2\2\2\u0c54\u0c56\5\u020c\u0107\2\u0c55\u0c54\3\2\2\2\u0c55\u0c56\3"+
		"\2\2\2\u0c56\u0c57\3\2\2\2\u0c57\u0c59\7\u0153\2\2\u0c58\u0c4c\3\2\2\2"+
		"\u0c58\u0c4d\3\2\2\2\u0c59\u020b\3\2\2\2\u0c5a\u0c5d\5\u020e\u0108\2\u0c5b"+
		"\u0c5d\5\u0210\u0109\2\u0c5c\u0c5a\3\2\2\2\u0c5c\u0c5b\3\2\2\2\u0c5d\u020d"+
		"\3\2\2\2\u0c5e\u0c5f\7m\2\2\u0c5f\u0c67\5\u0212\u010a\2\u0c60\u0c61\7"+
		"m\2\2\u0c61\u0c62\7\u00ce\2\2\u0c62\u0c63\5\u0214\u010b\2\u0c63\u0c64"+
		"\7\7\2\2\u0c64\u0c65\5\u0214\u010b\2\u0c65\u0c67\3\2\2\2\u0c66\u0c5e\3"+
		"\2\2\2\u0c66\u0c60\3\2\2\2\u0c67\u020f\3\2\2\2\u0c68\u0c69\7\u00cb\2\2"+
		"\u0c69\u0c71\5\u0212\u010a\2\u0c6a\u0c6b\7\u00cb\2\2\u0c6b\u0c6c\7\u00ce"+
		"\2\2\u0c6c\u0c6d\5\u0214\u010b\2\u0c6d\u0c6e\7\7\2\2\u0c6e\u0c6f\5\u0214"+
		"\u010b\2\u0c6f\u0c71\3\2\2\2\u0c70\u0c68\3\2\2\2\u0c70\u0c6a\3\2\2\2\u0c71"+
		"\u0211\3\2\2\2\u0c72\u0c73\7\u00eb\2\2\u0c73\u0c79\7\u00ec\2\2\u0c74\u0c75"+
		"\7\u00ee\2\2\u0c75\u0c79\7l\2\2\u0c76\u0c77\7\u0171\2\2\u0c77\u0c79\7"+
		"\u00ec\2\2\u0c78\u0c72\3\2\2\2\u0c78\u0c74\3\2\2\2\u0c78\u0c76\3\2\2\2"+
		"\u0c79\u0213\3\2\2\2\u0c7a\u0c7b\7\u00eb\2\2\u0c7b\u0c81\t\22\2\2\u0c7c"+
		"\u0c7d\7\u00ee\2\2\u0c7d\u0c81\7l\2\2\u0c7e\u0c7f\7\u0171\2\2\u0c7f\u0c81"+
		"\t\22\2\2\u0c80\u0c7a\3\2\2\2\u0c80\u0c7c\3\2\2\2\u0c80\u0c7e\3\2\2\2"+
		"\u0c81\u0215\3\2\2\2\u0c82\u0c88\7\u0162\2\2\u0c83\u0c84\5\u023e\u0120"+
		"\2\u0c84\u0c85\7\u014e\2\2\u0c85\u0c86\7\u0162\2\2\u0c86\u0c88\3\2\2\2"+
		"\u0c87\u0c82\3\2\2\2\u0c87\u0c83\3\2\2\2\u0c88\u0217\3\2\2\2\u0c89\u0c8a"+
		"\5\u02da\u016e\2\u0c8a\u0219\3\2\2\2\u0c8b\u0c90\5\u02c0\u0161\2\u0c8c"+
		"\u0c8d\7\u0150\2\2\u0c8d\u0c8f\5\u02c0\u0161\2\u0c8e\u0c8c\3\2\2\2\u0c8f"+
		"\u0c92\3\2\2\2\u0c90\u0c8e\3\2\2\2\u0c90\u0c91\3\2\2\2\u0c91\u021b\3\2"+
		"\2\2\u0c92\u0c90\3\2\2\2\u0c93\u0c98\5\u02da\u016e\2\u0c94\u0c95\7\u0150"+
		"\2\2\u0c95\u0c97\5\u02da\u016e\2\u0c96\u0c94\3\2\2\2\u0c97\u0c9a\3\2\2"+
		"\2\u0c98\u0c96\3\2\2\2\u0c98\u0c99\3\2\2\2\u0c99\u021d\3\2\2\2\u0c9a\u0c98"+
		"\3\2\2\2\u0c9b\u0c9c\7\27\2\2\u0c9c\u0c9d\5\u0220\u0111\2\u0c9d\u021f"+
		"\3\2\2\2\u0c9e\u0c9f\5\u022c\u0117\2\u0c9f\u0ca2\5\u0228\u0115\2\u0ca0"+
		"\u0ca1\7\u0150\2\2\u0ca1\u0ca3\5\u0228\u0115\2\u0ca2\u0ca0\3\2\2\2\u0ca3"+
		"\u0ca4\3\2\2\2\u0ca4\u0ca2\3\2\2\2\u0ca4\u0ca5\3\2\2\2\u0ca5\u0ca8\3\2"+
		"\2\2\u0ca6\u0ca8\5\u0224\u0113\2\u0ca7\u0c9e\3\2\2\2\u0ca7\u0ca6\3\2\2"+
		"\2\u0ca8\u0221\3\2\2\2\u0ca9\u0cad\5\u023a\u011e\2\u0caa\u0cac\5\u0230"+
		"\u0119\2\u0cab\u0caa\3\2\2\2\u0cac\u0caf\3\2\2\2\u0cad\u0cab\3\2\2\2\u0cad"+
		"\u0cae\3\2\2\2\u0cae\u0cca\3\2\2\2\u0caf\u0cad\3\2\2\2\u0cb0\u0cb4\5\u0254"+
		"\u012b\2\u0cb1\u0cb3\5\u0230\u0119\2\u0cb2\u0cb1\3\2\2\2\u0cb3\u0cb6\3"+
		"\2\2\2\u0cb4\u0cb2\3\2\2\2\u0cb4\u0cb5\3\2\2\2\u0cb5\u0cca\3\2\2\2\u0cb6"+
		"\u0cb4\3\2\2\2\u0cb7\u0cbb\5\u0242\u0122\2\u0cb8\u0cba\5\u0230\u0119\2"+
		"\u0cb9\u0cb8\3\2\2\2\u0cba\u0cbd\3\2\2\2\u0cbb\u0cb9\3\2\2\2\u0cbb\u0cbc"+
		"\3\2\2\2\u0cbc\u0cca\3\2\2\2\u0cbd\u0cbb\3\2\2\2\u0cbe\u0cc2\5\u0248\u0125"+
		"\2\u0cbf\u0cc1\5\u0230\u0119\2\u0cc0\u0cbf\3\2\2\2\u0cc1\u0cc4\3\2\2\2"+
		"\u0cc2\u0cc0\3\2\2\2\u0cc2\u0cc3\3\2\2\2\u0cc3\u0cca\3\2\2\2\u0cc4\u0cc2"+
		"\3\2\2\2\u0cc5\u0cc6\7\u0152\2\2\u0cc6\u0cc7\5\u0224\u0113\2\u0cc7\u0cc8"+
		"\7\u0153\2\2\u0cc8\u0cca\3\2\2\2\u0cc9\u0ca9\3\2\2\2\u0cc9\u0cb0\3\2\2"+
		"\2\u0cc9\u0cb7\3\2\2\2\u0cc9\u0cbe\3\2\2\2\u0cc9\u0cc5\3\2\2\2\u0cca\u0223"+
		"\3\2\2\2\u0ccb\u0cd6\5\u0222\u0112\2\u0ccc\u0ccd\5\u022e\u0118\2\u0ccd"+
		"\u0cd2\5\u0226\u0114\2\u0cce\u0ccf\7$\2\2\u0ccf\u0cd3\5\u02c0\u0161\2"+
		"\u0cd0\u0cd1\7\64\2\2\u0cd1\u0cd3\5\u0154\u00ab\2\u0cd2\u0cce\3\2\2\2"+
		"\u0cd2\u0cd0\3\2\2\2\u0cd2\u0cd3\3\2\2\2\u0cd3\u0cd5\3\2\2\2\u0cd4\u0ccc"+
		"\3\2\2\2\u0cd5\u0cd8\3\2\2\2\u0cd6\u0cd4\3\2\2\2\u0cd6\u0cd7\3\2\2\2\u0cd7"+
		"\u0225\3\2\2\2\u0cd8\u0cd6\3\2\2\2\u0cd9\u0cde\5\u023a\u011e\2\u0cda\u0cde"+
		"\5\u0254\u012b\2\u0cdb\u0cde\5\u0242\u0122\2\u0cdc\u0cde\5\u0248\u0125"+
		"\2\u0cdd\u0cd9\3\2\2\2\u0cdd\u0cda\3\2\2\2\u0cdd\u0cdb\3\2\2\2\u0cdd\u0cdc"+
		"\3\2\2\2\u0cde\u0ce2\3\2\2\2\u0cdf\u0ce1\5\u0230\u0119\2\u0ce0\u0cdf\3"+
		"\2\2\2\u0ce1\u0ce4\3\2\2\2\u0ce2\u0ce0\3\2\2\2\u0ce2\u0ce3\3\2\2\2\u0ce3"+
		"\u0227\3\2\2\2\u0ce4\u0ce2\3\2\2\2\u0ce5\u0ce7\7\37\2\2\u0ce6\u0ce5\3"+
		"\2\2\2\u0ce6\u0ce7\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8\u0ce9\5\u023c\u011f"+
		"\2\u0ce9\u0cea\5\u022a\u0116\2\u0cea\u0229\3\2\2\2\u0ceb\u0cec\7\u0152"+
		"\2\2\u0cec\u0ced\5\u021a\u010e\2\u0ced\u0cee\7\u0153\2\2\u0cee\u022b\3"+
		"\2\2\2\u0cef\u0cf0\7\36\2\2\u0cf0\u022d\3\2\2\2\u0cf1\u0d0a\7 \2\2\u0cf2"+
		"\u0cf3\7\u00fb\2\2\u0cf3\u0d0a\7 \2\2\u0cf4\u0d0a\7\u0150\2\2\u0cf5\u0cf6"+
		"\7\u00d1\2\2\u0cf6\u0d0a\7 \2\2\u0cf7\u0cf9\7!\2\2\u0cf8\u0cfa\7\35\2"+
		"\2\u0cf9\u0cf8\3\2\2\2\u0cf9\u0cfa\3\2\2\2\u0cfa\u0cfb\3\2\2\2\u0cfb\u0d0a"+
		"\7 \2\2\u0cfc\u0cfe\7\"\2\2\u0cfd\u0cff\7\35\2\2\u0cfe\u0cfd\3\2\2\2\u0cfe"+
		"\u0cff\3\2\2\2\u0cff\u0d00\3\2\2\2\u0d00\u0d0a\7 \2\2\u0d01\u0d03\7#\2"+
		"\2\u0d02\u0d04\7\35\2\2\u0d03\u0d02\3\2\2\2\u0d03\u0d04\3\2\2\2\u0d04"+
		"\u0d05\3\2\2\2\u0d05\u0d0a\7 \2\2\u0d06\u0d07\7!\2\2\u0d07\u0d08\7\u00d7"+
		"\2\2\u0d08\u0d0a\7 \2\2\u0d09\u0cf1\3\2\2\2\u0d09\u0cf2\3\2\2\2\u0d09"+
		"\u0cf4\3\2\2\2\u0d09\u0cf5\3\2\2\2\u0d09\u0cf7\3\2\2\2\u0d09\u0cfc\3\2"+
		"\2\2\u0d09\u0d01\3\2\2\2\u0d09\u0d06\3\2\2\2\u0d0a\u022f\3\2\2\2\u0d0b"+
		"\u0d0c\7\u00d8\2\2\u0d0c\u0d0d\7\u00b4\2\2\u0d0d\u0d0e\7\35\2\2\u0d0e"+
		"\u0d0f\5\u0280\u0141\2\u0d0f\u0d19\5\u0232\u011a\2\u0d10\u0d11\7\30\2"+
		"\2\u0d11\u0d16\5\u02da\u016e\2\u0d12\u0d13\7\u0150\2\2\u0d13\u0d15\5\u02da"+
		"\u016e\2\u0d14\u0d12\3\2\2\2\u0d15\u0d18\3\2\2\2\u0d16\u0d14\3\2\2\2\u0d16"+
		"\u0d17\3\2\2\2\u0d17\u0d1a\3\2\2\2\u0d18\u0d16\3\2\2\2\u0d19\u0d10\3\2"+
		"\2\2\u0d19\u0d1a\3\2\2\2\u0d1a\u0d47\3\2\2\2\u0d1b\u0d1d\7\u0150\2\2\u0d1c"+
		"\u0d1b\3\2\2\2\u0d1c\u0d1d\3\2\2\2\u0d1d\u0d1e\3\2\2\2\u0d1e\u0d1f\7\u00d8"+
		"\2\2\u0d1f\u0d20\7\u00b4\2\2\u0d20\u0d21\5\u0280\u0141\2\u0d21\u0d2b\5"+
		"\u0232\u011a\2\u0d22\u0d23\7\30\2\2\u0d23\u0d28\5\u02da\u016e\2\u0d24"+
		"\u0d25\7\u0150\2\2\u0d25\u0d27\5\u02da\u016e\2\u0d26\u0d24\3\2\2\2\u0d27"+
		"\u0d2a\3\2\2\2\u0d28\u0d26\3\2\2\2\u0d28\u0d29\3\2\2\2\u0d29\u0d2c\3\2"+
		"\2\2\u0d2a\u0d28\3\2\2\2\u0d2b\u0d22\3\2\2\2\u0d2b\u0d2c\3\2\2\2\u0d2c"+
		"\u0d47\3\2\2\2\u0d2d\u0d2f\7\u0150\2\2\u0d2e\u0d2d\3\2\2\2\u0d2e\u0d2f"+
		"\3\2\2\2\u0d2f\u0d30\3\2\2\2\u0d30\u0d31\7\u00d8\2\2\u0d31\u0d32\7\'\2"+
		"\2\u0d32\u0d33\7\u0152\2\2\u0d33\u0d34\5\u024e\u0128\2\u0d34\u0d36\7\u0153"+
		"\2\2\u0d35\u0d37\7\30\2\2\u0d36\u0d35\3\2\2\2\u0d36\u0d37\3\2\2\2\u0d37"+
		"\u0d38\3\2\2\2\u0d38\u0d44\5\u0232\u011a\2\u0d39\u0d3a\7\u0152\2\2\u0d3a"+
		"\u0d3f\5\u02da\u016e\2\u0d3b\u0d3c\7\u0150\2\2\u0d3c\u0d3e\5\u02da\u016e"+
		"\2\u0d3d\u0d3b\3\2\2\2\u0d3e\u0d41\3\2\2\2\u0d3f\u0d3d\3\2\2\2\u0d3f\u0d40"+
		"\3\2\2\2\u0d40\u0d42\3\2\2\2\u0d41\u0d3f\3\2\2\2\u0d42\u0d43\7\u0153\2"+
		"\2\u0d43\u0d45\3\2\2\2\u0d44\u0d39\3\2\2\2\u0d44\u0d45\3\2\2\2\u0d45\u0d47"+
		"\3\2\2\2\u0d46\u0d0b\3\2\2\2\u0d46\u0d1c\3\2\2\2\u0d46\u0d2e\3\2\2\2\u0d47"+
		"\u0231\3\2\2\2\u0d48\u0d49\5\u02da\u016e\2\u0d49\u0233\3\2\2\2\u0d4a\u0d4b"+
		"\7\u0082\2\2\u0d4b\u0d4c\7\u0152\2\2\u0d4c\u0d4d\7\u0083\2\2\u0d4d\u0d4e"+
		"\7\u0171\2\2\u0d4e\u0d4f\7\u0084\2\2\u0d4f\u0d50\7\u0085\2\2\u0d50\u0d5a"+
		"\7\u0171\2\2\u0d51\u0d52\7$\2\2\u0d52\u0d57\5\u02c0\u0161\2\u0d53\u0d54"+
		"\7\u0150\2\2\u0d54\u0d56\5\u02c0\u0161\2\u0d55\u0d53\3\2\2\2\u0d56\u0d59"+
		"\3\2\2\2\u0d57\u0d55\3\2\2\2\u0d57\u0d58\3\2\2\2\u0d58\u0d5b\3\2\2\2\u0d59"+
		"\u0d57\3\2\2\2\u0d5a\u0d51\3\2\2\2\u0d5a\u0d5b\3\2\2\2\u0d5b\u0d5c\3\2"+
		"\2\2\u0d5c\u0d5d\7\u0153\2\2\u0d5d\u0235\3\2\2\2\u0d5e\u0d5f\7\u0082\2"+
		"\2\u0d5f\u0d60\7\u0152\2\2\u0d60\u0d61\7\u0171\2\2\u0d61\u0d62\t\23\2"+
		"\2\u0d62\u0d68\7\u0153\2\2\u0d63\u0d64\7\u0082\2\2\u0d64\u0d65\7\u0152"+
		"\2\2\u0d65\u0d66\7\u0170\2\2\u0d66\u0d68\7\u0153\2\2\u0d67\u0d5e\3\2\2"+
		"\2\u0d67\u0d63\3\2\2\2\u0d68\u0237\3\2\2\2\u0d69\u0d6c\5\u0234\u011b\2"+
		"\u0d6a\u0d6c\5\u0236\u011c\2\u0d6b\u0d69\3\2\2\2\u0d6b\u0d6a\3\2\2\2\u0d6c"+
		"\u0239\3\2\2\2\u0d6d\u0d6f\5\u023e\u0120\2\u0d6e\u0d70\5\u0130\u0099\2"+
		"\u0d6f\u0d6e\3\2\2\2\u0d6f\u0d70\3\2\2\2\u0d70\u0d72\3\2\2\2\u0d71\u0d73"+
		"\5\u0238\u011d\2\u0d72\u0d71\3\2\2\2\u0d72\u0d73\3\2\2\2\u0d73\u0d78\3"+
		"\2\2\2\u0d74\u0d76\7\30\2\2\u0d75\u0d74\3\2\2\2\u0d75\u0d76\3\2\2\2\u0d76"+
		"\u0d77\3\2\2\2\u0d77\u0d79\5\u02da\u016e\2\u0d78\u0d75\3\2\2\2\u0d78\u0d79"+
		"\3\2\2\2\u0d79\u023b\3\2\2\2\u0d7a\u0d7c\5\u023e\u0120\2\u0d7b\u0d7d\5"+
		"\u0238\u011d\2\u0d7c\u0d7b\3\2\2\2\u0d7c\u0d7d\3\2\2\2\u0d7d\u0d82\3\2"+
		"\2\2\u0d7e\u0d80\7\30\2\2\u0d7f\u0d7e\3\2\2\2\u0d7f\u0d80\3\2\2\2\u0d80"+
		"\u0d81\3\2\2\2\u0d81\u0d83\5\u02da\u016e\2\u0d82\u0d7f\3\2\2\2\u0d82\u0d83"+
		"\3\2\2\2\u0d83\u023d\3\2\2\2\u0d84\u0d85\5\u02da\u016e\2\u0d85\u0d86\7"+
		"\u014e\2\2\u0d86\u0d87\5\u02da\u016e\2\u0d87\u0d8a\3\2\2\2\u0d88\u0d8a"+
		"\5\u02da\u016e\2\u0d89\u0d84\3\2\2\2\u0d89\u0d88\3\2\2\2\u0d8a\u023f\3"+
		"\2\2\2\u0d8b\u0d8c\5\u02da\u016e\2\u0d8c\u0d8d\7\u014e\2\2\u0d8d\u0d8f"+
		"\3\2\2\2\u0d8e\u0d8b\3\2\2\2\u0d8e\u0d8f\3\2\2\2\u0d8f\u0d90\3\2\2\2\u0d90"+
		"\u0d91\5\u02da\u016e\2\u0d91\u0241\3\2\2\2\u0d92\u0d93\7\u0152\2\2\u0d93"+
		"\u0d94\5\u01b0\u00d9\2\u0d94\u0d96\7\u0153\2\2\u0d95\u0d97\7\30\2\2\u0d96"+
		"\u0d95\3\2\2\2\u0d96\u0d97\3\2\2\2\u0d97\u0d98\3\2\2\2\u0d98\u0d99\5\u02da"+
		"\u016e\2\u0d99\u0243\3\2\2\2\u0d9a\u0d9c\5\u027a\u013e\2\u0d9b\u0d9d\5"+
		"\u0276\u013c\2\u0d9c\u0d9b\3\2\2\2\u0d9c\u0d9d\3\2\2\2\u0d9d\u0da6\3\2"+
		"\2\2\u0d9e\u0da6\5\u0276\u013c\2\u0d9f\u0da1\5\u027c\u013f\2\u0da0\u0da2"+
		"\5\u027e\u0140\2\u0da1\u0da0\3\2\2\2\u0da1\u0da2\3\2\2\2\u0da2\u0da6\3"+
		"\2\2\2\u0da3\u0da6\5\u027e\u0140\2\u0da4\u0da6\5\u0278\u013d\2\u0da5\u0d9a"+
		"\3\2\2\2\u0da5\u0d9e\3\2\2\2\u0da5\u0d9f\3\2\2\2\u0da5\u0da3\3\2\2\2\u0da5"+
		"\u0da4\3\2\2\2\u0da6\u0245\3\2\2\2\u0da7\u0dab\5\u0242\u0122\2\u0da8\u0dab"+
		"\5\u023a\u011e\2\u0da9\u0dab\5\u0248\u0125\2\u0daa\u0da7\3\2\2\2\u0daa"+
		"\u0da8\3\2\2\2\u0daa\u0da9\3\2\2\2\u0dab\u0247\3\2\2\2\u0dac\u0dad\5\u02da"+
		"\u016e\2\u0dad\u0dae\7\u0152\2\2\u0dae\u0daf\7$\2\2\u0daf\u0db1\5\u0246"+
		"\u0124\2\u0db0\u0db2\5\u0244\u0123\2\u0db1\u0db0\3\2\2\2\u0db1\u0db2\3"+
		"\2\2\2\u0db2\u0dc2\3\2\2\2\u0db3\u0db4\7\u0172\2\2\u0db4\u0db5\7\u0152"+
		"\2\2\u0db5\u0db6\5\u02c0\u0161\2\u0db6\u0dbf\7\u0153\2\2\u0db7\u0db8\7"+
		"\u0150\2\2\u0db8\u0db9\7\u0172\2\2\u0db9\u0dba\7\u0152\2\2\u0dba\u0dbb"+
		"\5\u02c0\u0161\2\u0dbb\u0dbc\7\u0153\2\2\u0dbc\u0dbe\3\2\2\2\u0dbd\u0db7"+
		"\3\2\2\2\u0dbe\u0dc1\3\2\2\2\u0dbf\u0dbd\3\2\2\2\u0dbf\u0dc0\3\2\2\2\u0dc0"+
		"\u0dc3\3\2\2\2\u0dc1\u0dbf\3\2\2\2\u0dc2\u0db3\3\2\2\2\u0dc2\u0dc3\3\2"+
		"\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4\u0dc6\7\u0153\2\2\u0dc5\u0dc7\5\u02da\u016e"+
		"\2\u0dc6\u0dc5\3\2\2\2\u0dc6\u0dc7\3\2\2\2\u0dc7\u0249\3\2\2\2\u0dc8\u0dc9"+
		"\7\26\2\2\u0dc9\u0dca\5\u024c\u0127\2\u0dca\u024b\3\2\2\2\u0dcb\u0dcc"+
		"\5\u02c0\u0161\2\u0dcc\u024d\3\2\2\2\u0dcd\u0dce\7\u0109\2\2\u0dce\u0dcf"+
		"\5\u0250\u0129\2\u0dcf\u024f\3\2\2\2\u0dd0\u0dd5\5\u0252\u012a\2\u0dd1"+
		"\u0dd2\7\u0150\2\2\u0dd2\u0dd4\5\u0252\u012a\2\u0dd3\u0dd1\3\2\2\2\u0dd4"+
		"\u0dd7\3\2\2\2\u0dd5\u0dd3\3\2\2\2\u0dd5\u0dd6\3\2\2\2\u0dd6\u0251\3\2"+
		"\2\2\u0dd7\u0dd5\3\2\2\2\u0dd8\u0dd9\5\u026a\u0136\2\u0dd9\u0253\3\2\2"+
		"\2\u0dda\u0ddb\7\'\2\2\u0ddb\u0ddc\7\u0152\2\2\u0ddc\u0ddd\5\u024e\u0128"+
		"\2\u0ddd\u0ddf\7\u0153\2\2\u0dde\u0de0\7\30\2\2\u0ddf\u0dde\3\2\2\2\u0ddf"+
		"\u0de0\3\2\2\2\u0de0\u0de1\3\2\2\2\u0de1\u0deb\5\u0232\u011a\2\u0de2\u0de3"+
		"\7\u0152\2\2\u0de3\u0de8\5\u02da\u016e\2\u0de4\u0de5\7\u0150\2\2\u0de5"+
		"\u0de7\5\u02da\u016e\2\u0de6\u0de4\3\2\2\2\u0de7\u0dea\3\2\2\2\u0de8\u0de6"+
		"\3\2\2\2\u0de8\u0de9\3\2\2\2\u0de9\u0dec\3\2\2\2\u0dea\u0de8\3\2\2\2\u0deb"+
		"\u0de2\3\2\2\2\u0deb\u0dec\3\2\2\2\u0dec\u0ded\3\2\2\2\u0ded\u0dee\7\u0153"+
		"\2\2\u0dee\u0255\3\2\2\2\u0def\u0df0\7\23\2\2\u0df0\u0df1\7\24\2\2\u0df1"+
		"\u0df2\5\u0258\u012d\2\u0df2\u0257\3\2\2\2\u0df3\u0df7\5\u025c\u012f\2"+
		"\u0df4\u0df7\5\u025e\u0130\2\u0df5\u0df7\5\u025a\u012e\2\u0df6\u0df3\3"+
		"\2\2\2\u0df6\u0df4\3\2\2\2\u0df6\u0df5\3\2\2\2\u0df7\u0259\3\2\2\2\u0df8"+
		"\u0df9\7\u0152\2\2\u0df9\u0dfa\7\u0153\2\2\u0dfa\u025b\3\2\2\2\u0dfb\u0dfc"+
		"\t\24\2\2\u0dfc\u0dfd\7\u0152\2\2\u0dfd\u0e02\5\u02c0\u0161\2\u0dfe\u0dff"+
		"\7\u0150\2\2\u0dff\u0e01\5\u02c0\u0161\2\u0e00\u0dfe\3\2\2\2\u0e01\u0e04"+
		"\3\2\2\2\u0e02\u0e00\3\2\2\2\u0e02\u0e03\3\2\2\2\u0e03\u0e05\3\2\2\2\u0e04"+
		"\u0e02\3\2\2\2\u0e05\u0e06\7\u0153\2\2\u0e06\u025d\3\2\2\2\u0e07\u0e0c"+
		"\5\u026c\u0137\2\u0e08\u0e09\7\u0097\2\2\u0e09\u0e0d\7\u00e6\2\2\u0e0a"+
		"\u0e0b\7\u0097\2\2\u0e0b\u0e0d\7\u00e7\2\2\u0e0c\u0e08\3\2\2\2\u0e0c\u0e0a"+
		"\3\2\2\2\u0e0c\u0e0d\3\2\2\2\u0e0d\u0e1b\3\2\2\2\u0e0e\u0e0f\7\u00f4\2"+
		"\2\u0e0f\u0e10\7\u00f5\2\2\u0e10\u0e11\7\u0152\2\2\u0e11\u0e16\5\u0260"+
		"\u0131\2\u0e12\u0e13\7\u0150\2\2\u0e13\u0e15\5\u0260\u0131\2\u0e14\u0e12"+
		"\3\2\2\2\u0e15\u0e18\3\2\2\2\u0e16\u0e14\3\2\2\2\u0e16\u0e17\3\2\2\2\u0e17"+
		"\u0e19\3\2\2\2\u0e18\u0e16\3\2\2\2\u0e19\u0e1a\7\u0153\2\2\u0e1a\u0e1c"+
		"\3\2\2\2\u0e1b\u0e0e\3\2\2\2\u0e1b\u0e1c\3\2\2\2\u0e1c\u025f\3\2\2\2\u0e1d"+
		"\u0e20\5\u0262\u0132\2\u0e1e\u0e20\5\u0264\u0133\2\u0e1f\u0e1d\3\2\2\2"+
		"\u0e1f\u0e1e\3\2\2\2\u0e20\u0261\3\2\2\2\u0e21\u0e23\7\u0152\2\2\u0e22"+
		"\u0e24\5\u02c0\u0161\2\u0e23\u0e22\3\2\2\2\u0e23\u0e24\3\2\2\2\u0e24\u0e29"+
		"\3\2\2\2\u0e25\u0e26\7\u0150\2\2\u0e26\u0e28\5\u02c0\u0161\2\u0e27\u0e25"+
		"\3\2\2\2\u0e28\u0e2b\3\2\2\2\u0e29\u0e27\3\2\2\2\u0e29\u0e2a\3\2\2\2\u0e2a"+
		"\u0e2c\3\2\2\2\u0e2b\u0e29\3\2\2\2\u0e2c\u0e2d\7\u0153\2\2\u0e2d\u0263"+
		"\3\2\2\2\u0e2e\u0e2f\5\u02c0\u0161\2\u0e2f\u0265\3\2\2\2\u0e30\u0e31\7"+
		"\25\2\2\u0e31\u0e32\5\u0268\u0135\2\u0e32\u0267\3\2\2\2\u0e33\u0e34\5"+
		"\u02c0\u0161\2\u0e34\u0269\3\2\2\2\u0e35\u0e36\7\u0152\2\2\u0e36\u0e37"+
		"\5\u026c\u0137\2\u0e37\u0e38\7\u0153\2\2\u0e38\u026b\3\2\2\2\u0e39\u0e3b"+
		"\5\u02c0\u0161\2\u0e3a\u0e3c\5\u026e\u0138\2\u0e3b\u0e3a\3\2\2\2\u0e3b"+
		"\u0e3c\3\2\2\2\u0e3c\u026d\3\2\2\2\u0e3d\u0e3e\7\u0150\2\2\u0e3e\u0e40"+
		"\5\u02c0\u0161\2\u0e3f\u0e3d\3\2\2\2\u0e40\u0e41\3\2\2\2\u0e41\u0e3f\3"+
		"\2\2\2\u0e41\u0e42\3\2\2\2\u0e42\u026f\3\2\2\2\u0e43\u0e46\5\u026a\u0136"+
		"\2\u0e44\u0e46\5\u026c\u0137\2\u0e45\u0e43\3\2\2\2\u0e45\u0e44\3\2\2\2"+
		"\u0e46\u0271\3\2\2\2\u0e47\u0e48\7\u0152\2\2\u0e48\u0e4d\5\u0180\u00c1"+
		"\2\u0e49\u0e4a\7\u0150\2\2\u0e4a\u0e4c\5\u0180\u00c1\2\u0e4b\u0e49\3\2"+
		"\2\2\u0e4c\u0e4f\3\2\2\2\u0e4d\u0e4b\3\2\2\2\u0e4d\u0e4e\3\2\2\2\u0e4e"+
		"\u0e50\3\2\2\2\u0e4f\u0e4d\3\2\2\2\u0e50\u0e51\7\u0153\2\2\u0e51\u0273"+
		"\3\2\2\2\u0e52\u0e57\5\u0180\u00c1\2\u0e53\u0e54\7\u0150\2\2\u0e54\u0e56"+
		"\5\u0180\u00c1\2\u0e55\u0e53\3\2\2\2\u0e56\u0e59\3\2\2\2\u0e57\u0e55\3"+
		"\2\2\2\u0e57\u0e58\3\2\2\2\u0e58\u0275\3\2\2\2\u0e59\u0e57\3\2\2\2\u0e5a"+
		"\u0e5b\7\22\2\2\u0e5b\u0e5c\7\24\2\2\u0e5c\u0e61\5\u0180\u00c1\2\u0e5d"+
		"\u0e5e\7\u0150\2\2\u0e5e\u0e60\5\u0180\u00c1\2\u0e5f\u0e5d\3\2\2\2\u0e60"+
		"\u0e63\3\2\2\2\u0e61\u0e5f\3\2\2\2\u0e61\u0e62\3\2\2\2\u0e62\u0277\3\2"+
		"\2\2\u0e63\u0e61\3\2\2\2\u0e64\u0e65\7\65\2\2\u0e65\u0e66\7\24\2\2\u0e66"+
		"\u0e67\5\u0270\u0139\2\u0e67\u0279\3\2\2\2\u0e68\u0e69\7%\2\2\u0e69\u0e6a"+
		"\7\24\2\2\u0e6a\u0e6b\5\u0270\u0139\2\u0e6b\u027b\3\2\2\2\u0e6c\u0e6d"+
		"\7\66\2\2\u0e6d\u0e6e\7\24\2\2\u0e6e\u0e6f\5\u0270\u0139\2\u0e6f\u027d"+
		"\3\2\2\2\u0e70\u0e71\7\67\2\2\u0e71\u0e74\7\24\2\2\u0e72\u0e75\5\u0272"+
		"\u013a\2\u0e73\u0e75\5\u0274\u013b\2\u0e74\u0e72\3\2\2\2\u0e74\u0e73\3"+
		"\2\2\2\u0e75\u027f\3\2\2\2\u0e76\u0e77\5\u0282\u0142\2\u0e77\u0e86\7\u0152"+
		"\2\2\u0e78\u0e87\7\u0162\2\2\u0e79\u0e7b\t\21\2\2\u0e7a\u0e79\3\2\2\2"+
		"\u0e7a\u0e7b\3\2\2\2\u0e7b\u0e84\3\2\2\2\u0e7c\u0e81\5\u0202\u0102\2\u0e7d"+
		"\u0e7e\7\u0150\2\2\u0e7e\u0e80\5\u0202\u0102\2\u0e7f\u0e7d\3\2\2\2\u0e80"+
		"\u0e83\3\2\2\2\u0e81\u0e7f\3\2\2\2\u0e81\u0e82\3\2\2\2\u0e82\u0e85\3\2"+
		"\2\2\u0e83\u0e81\3\2\2\2\u0e84\u0e7c\3\2\2\2\u0e84\u0e85\3\2\2\2\u0e85"+
		"\u0e87\3\2\2\2\u0e86\u0e78\3\2\2\2\u0e86\u0e7a\3\2\2\2\u0e87\u0e88\3\2"+
		"\2\2\u0e88\u0e8b\7\u0153\2\2\u0e89\u0e8a\7\u00f3\2\2\u0e8a\u0e8c\5\u020a"+
		"\u0106\2\u0e8b\u0e89\3\2\2\2\u0e8b\u0e8c\3\2\2\2\u0e8c\u0281\3\2\2\2\u0e8d"+
		"\u0e90\5\u02dc\u016f\2\u0e8e\u0e90\5\u02e2\u0172\2\u0e8f\u0e8d\3\2\2\2"+
		"\u0e8f\u0e8e\3\2\2\2\u0e90\u0283\3\2\2\2\u0e91\u0e92\7\u0087\2\2\u0e92"+
		"\u0e93\7\u0152\2\2\u0e93\u0e94\5\u02c0\u0161\2\u0e94\u0e95\7\30\2\2\u0e95"+
		"\u0e96\5\u01a4\u00d3\2\u0e96\u0e97\7\u0153\2\2\u0e97\u0285\3\2\2\2\u0e98"+
		"\u0e99\7\u00a4\2\2\u0e99\u0e9f\5\u02c0\u0161\2\u0e9a\u0e9b\7\u00a5\2\2"+
		"\u0e9b\u0e9c\5\u02c0\u0161\2\u0e9c\u0e9d\7\u00a6\2\2\u0e9d\u0e9e\5\u02c0"+
		"\u0161\2\u0e9e\u0ea0\3\2\2\2\u0e9f\u0e9a\3\2\2\2\u0ea0\u0ea1\3\2\2\2\u0ea1"+
		"\u0e9f\3\2\2\2\u0ea1\u0ea2\3\2\2\2\u0ea2\u0ea5\3\2\2\2\u0ea3\u0ea4\7\u00a7"+
		"\2\2\u0ea4\u0ea6\5\u02c0\u0161\2\u0ea5\u0ea3\3\2\2\2\u0ea5\u0ea6\3\2\2"+
		"\2\u0ea6\u0ea7\3\2\2\2\u0ea7\u0ea8\7\u00a8\2\2\u0ea8\u0287\3\2\2\2\u0ea9"+
		"\u0eaf\7\u00a4\2\2\u0eaa\u0eab\7\u00a5\2\2\u0eab\u0eac\5\u02c0\u0161\2"+
		"\u0eac\u0ead\7\u00a6\2\2\u0ead\u0eae\5\u02c0\u0161\2\u0eae\u0eb0\3\2\2"+
		"\2\u0eaf\u0eaa\3\2\2\2\u0eb0\u0eb1\3\2\2\2\u0eb1\u0eaf\3\2\2\2\u0eb1\u0eb2"+
		"\3\2\2\2\u0eb2\u0eb5\3\2\2\2\u0eb3\u0eb4\7\u00a7\2\2\u0eb4\u0eb6\5\u02c0"+
		"\u0161\2\u0eb5\u0eb3\3\2\2\2\u0eb5\u0eb6\3\2\2\2\u0eb6\u0eb7\3\2\2\2\u0eb7"+
		"\u0eb8\7\u00a8\2\2\u0eb8\u0289\3\2\2\2\u0eb9\u0eba\7\u012e\2\2\u0eba\u0ebb"+
		"\7\u0152\2\2\u0ebb\u0ebe\5\u02c0\u0161\2\u0ebc\u0ebd\7M\2\2\u0ebd\u0ebf"+
		"\5\u028c\u0147\2\u0ebe\u0ebc\3\2\2\2\u0ebe\u0ebf\3\2\2\2\u0ebf\u0ec0\3"+
		"\2\2\2\u0ec0\u0ec1\7\u0153\2\2\u0ec1\u028b\3\2\2\2\u0ec2\u0ec3\t\25\2"+
		"\2\u0ec3\u028d\3\2\2\2\u0ec4\u0ec5\7\u012d\2\2\u0ec5\u0ec6\7\u0152\2\2"+
		"\u0ec6\u0ec7\5\u0290\u0149\2\u0ec7\u0ec8\7\27\2\2\u0ec8\u0ec9\5\u02c0"+
		"\u0161\2\u0ec9\u0eca\7\u0153\2\2\u0eca\u028f\3\2\2\2\u0ecb\u0ecc\t\26"+
		"\2\2\u0ecc\u0291\3\2\2\2\u0ecd\u0eda\5\u02a0\u0151\2\u0ece\u0eda\7\u0171"+
		"\2\2\u0ecf\u0eda\5\u0298\u014d\2\u0ed0\u0eda\5\u029a\u014e\2\u0ed1\u0eda"+
		"\5\u029c\u014f\2\u0ed2\u0eda\7\u016c\2\2\u0ed3\u0eda\5\u0294\u014b\2\u0ed4"+
		"\u0eda\7\u016e\2\2\u0ed5\u0eda\7\u016f\2\2\u0ed6\u0eda\5\u0296\u014c\2"+
		"\u0ed7\u0eda\5\u02c6\u0164\2\u0ed8\u0eda\7B\2\2\u0ed9\u0ecd\3\2\2\2\u0ed9"+
		"\u0ece\3\2\2\2\u0ed9\u0ecf\3\2\2\2\u0ed9\u0ed0\3\2\2\2\u0ed9\u0ed1\3\2"+
		"\2\2\u0ed9\u0ed2\3\2\2\2\u0ed9\u0ed3\3\2\2\2\u0ed9\u0ed4\3\2\2\2\u0ed9"+
		"\u0ed5\3\2\2\2\u0ed9\u0ed6\3\2\2\2\u0ed9\u0ed7\3\2\2\2\u0ed9\u0ed8\3\2"+
		"\2\2\u0eda\u0293\3\2\2\2\u0edb\u0edd\7\u016c\2\2\u0edc\u0ede\7\u016c\2"+
		"\2\u0edd\u0edc\3\2\2\2\u0ede\u0edf\3\2\2\2\u0edf\u0edd\3\2\2\2\u0edf\u0ee0"+
		"\3\2\2\2\u0ee0\u0295\3\2\2\2\u0ee1\u0ee2\7\u0174\2\2\u0ee2\u0ee3\7\u016d"+
		"\2\2\u0ee3\u0297\3\2\2\2\u0ee4\u0ee5\7W\2\2\u0ee5\u0ee8\7\u016c\2\2\u0ee6"+
		"\u0ee8\7\u00ef\2\2\u0ee7\u0ee4\3\2\2\2\u0ee7\u0ee6\3\2\2\2\u0ee8\u0299"+
		"\3\2\2\2\u0ee9\u0eea\7Y\2\2\u0eea\u0eed\7\u016c\2\2\u0eeb\u0eed\7\u00f0"+
		"\2\2\u0eec\u0ee9\3\2\2\2\u0eec\u0eeb\3\2\2\2\u0eed\u029b\3\2\2\2\u0eee"+
		"\u0eef\7Z\2\2\u0eef\u0ef0\7\u016c\2\2\u0ef0\u029d\3\2\2\2\u0ef1\u0ef2"+
		"\t\27\2\2\u0ef2\u029f\3\2\2\2\u0ef3\u0ef4\5\u029e\u0150\2\u0ef4\u0ef5"+
		"\5\u02a4\u0153\2\u0ef5\u02a1\3\2\2\2\u0ef6\u0ef7\7\u0152\2\2\u0ef7\u0ef8"+
		"\5\u029e\u0150\2\u0ef8\u0ef9\7\u0153\2\2\u0ef9\u0efa\5\u02a4\u0153\2\u0efa"+
		"\u0f06\3\2\2\2\u0efb\u0efc\7]\2\2\u0efc\u0efd\5\u029e\u0150\2\u0efd\u0efe"+
		"\5\u02a4\u0153\2\u0efe\u0f06\3\2\2\2\u0eff\u0f00\7]\2\2\u0f00\u0f01\7"+
		"\u0152\2\2\u0f01\u0f02\5\u02c0\u0161\2\u0f02\u0f03\7\u0153\2\2\u0f03\u0f04"+
		"\5\u02a4\u0153\2\u0f04\u0f06\3\2\2\2\u0f05\u0ef6\3\2\2\2\u0f05\u0efb\3"+
		"\2\2\2\u0f05\u0eff\3\2\2\2\u0f06\u02a3\3\2\2\2\u0f07\u0f08\7\u010b\2\2"+
		"\u0f08\u0f09\7M\2\2\u0f09\u0f14\7\u010e\2\2\u0f0a\u0f0b\7\u0110\2\2\u0f0b"+
		"\u0f0c\7M\2\2\u0f0c\u0f14\7\u0114\2\2\u0f0d\u0f14\7\u010b\2\2\u0f0e\u0f14"+
		"\7\u010e\2\2\u0f0f\u0f14\7\u0110\2\2\u0f10\u0f14\7\u0112\2\2\u0f11\u0f14"+
		"\7\u0113\2\2\u0f12\u0f14\7\u0114\2\2\u0f13\u0f07\3\2\2\2\u0f13\u0f0a\3"+
		"\2\2\2\u0f13\u0f0d\3\2\2\2\u0f13\u0f0e\3\2\2\2\u0f13\u0f0f\3\2\2\2\u0f13"+
		"\u0f10\3\2\2\2\u0f13\u0f11\3\2\2\2\u0f13\u0f12\3\2\2\2\u0f14\u02a5\3\2"+
		"\2\2\u0f15\u0f21\5\u0292\u014a\2\u0f16\u0f21\5\u02a2\u0152\2\u0f17\u0f21"+
		"\5\u0284\u0143\2\u0f18\u0f21\5\u028e\u0148\2\u0f19\u0f21\5\u028a\u0146"+
		"\2\u0f1a\u0f21\5\u0286\u0144\2\u0f1b\u0f21\5\u0288\u0145\2\u0f1c\u0f21"+
		"\5\u02c4\u0163\2\u0f1d\u0f21\5\u0280\u0141\2\u0f1e\u0f21\5\u0218\u010d"+
		"\2\u0f1f\u0f21\5\u026a\u0136\2\u0f20\u0f15\3\2\2\2\u0f20\u0f16\3\2\2\2"+
		"\u0f20\u0f17\3\2\2\2\u0f20\u0f18\3\2\2\2\u0f20\u0f19\3\2\2\2\u0f20\u0f1a"+
		"\3\2\2\2\u0f20\u0f1b\3\2\2\2\u0f20\u0f1c\3\2\2\2\u0f20\u0f1d\3\2\2\2\u0f20"+
		"\u0f1e\3\2\2\2\u0f20\u0f1f\3\2\2\2\u0f21\u02a7\3\2\2\2\u0f22\u0f23\t\30"+
		"\2\2\u0f23\u02a9\3\2\2\2\u0f24\u0f26\7\t\2\2\u0f25\u0f24\3\2\2\2\u0f25"+
		"\u0f26\3\2\2\2\u0f26\u0f2c\3\2\2\2\u0f27\u0f2d\7B\2\2\u0f28\u0f2d\7\3"+
		"\2\2\u0f29\u0f2d\7\4\2\2\u0f2a\u0f2b\7\32\2\2\u0f2b\u0f2d\7\27\2\2\u0f2c"+
		"\u0f27\3\2\2\2\u0f2c\u0f28\3\2\2\2\u0f2c\u0f29\3\2\2\2\u0f2c\u0f2a\3\2"+
		"\2\2\u0f2d\u02ab\3\2\2\2\u0f2e\u0f2f\7\u0169\2\2\u0f2f\u02ad\3\2\2\2\u0f30"+
		"\u0f31\t\31\2\2\u0f31\u02af\3\2\2\2\u0f32\u0f33\t\32\2\2\u0f33\u02b1\3"+
		"\2\2\2\u0f34\u0f35\7\u0168\2\2\u0f35\u02b3\3\2\2\2\u0f36\u0f37\7\u0165"+
		"\2\2\u0f37\u02b5\3\2\2\2\u0f38\u0f39\7\u0167\2\2\u0f39\u02b7\3\2\2\2\u0f3a"+
		"\u0f3b\t\33\2\2\u0f3b\u02b9\3\2\2\2\u0f3c\u0f3d\t\34\2\2\u0f3d\u02bb\3"+
		"\2\2\2\u0f3e\u0f3f\7\t\2\2\u0f3f\u02bd\3\2\2\2\u0f40\u0f41\t\35\2\2\u0f41"+
		"\u02bf\3\2\2\2\u0f42\u0f43\b\u0161\1\2\u0f43\u0f4c\5\u02a6\u0154\2\u0f44"+
		"\u0f45\7\u0154\2\2\u0f45\u0f46\5\u02c0\u0161\2\u0f46\u0f47\7\u0155\2\2"+
		"\u0f47\u0f4b\3\2\2\2\u0f48\u0f49\7\u014e\2\2\u0f49\u0f4b\5\u02da\u016e"+
		"\2\u0f4a\u0f44\3\2\2\2\u0f4a\u0f48\3\2\2\2\u0f4b\u0f4e\3\2\2\2\u0f4c\u0f4a"+
		"\3\2\2\2\u0f4c\u0f4d\3\2\2\2\u0f4d\u0f5c\3\2\2\2\u0f4e\u0f4c\3\2\2\2\u0f4f"+
		"\u0f50\5\u02a8\u0155\2\u0f50\u0f51\5\u02c0\u0161\23\u0f51\u0f5c\3\2\2"+
		"\2\u0f52\u0f53\7\r\2\2\u0f53\u0f5c\5\u02c4\u0163\2\u0f54\u0f55\5\u02bc"+
		"\u015f\2\u0f55\u0f56\5\u02c0\u0161\5\u0f56\u0f5c\3\2\2\2\u0f57\u0f58\7"+
		"\u0152\2\2\u0f58\u0f59\5\u02c0\u0161\2\u0f59\u0f5a\7\u0153\2\2\u0f5a\u0f5c"+
		"\3\2\2\2\u0f5b\u0f42\3\2\2\2\u0f5b\u0f4f\3\2\2\2\u0f5b\u0f52\3\2\2\2\u0f5b"+
		"\u0f54\3\2\2\2\u0f5b\u0f57\3\2\2\2\u0f5c\u0f9f\3\2\2\2\u0f5d\u0f5e\f\21"+
		"\2\2\u0f5e\u0f5f\5\u02ac\u0157\2\u0f5f\u0f60\5\u02c0\u0161\22\u0f60\u0f9e"+
		"\3\2\2\2\u0f61\u0f62\f\20\2\2\u0f62\u0f63\5\u02ae\u0158\2\u0f63\u0f64"+
		"\5\u02c0\u0161\21\u0f64\u0f9e\3\2\2\2\u0f65\u0f66\f\17\2\2\u0f66\u0f67"+
		"\5\u02b0\u0159\2\u0f67\u0f68\5\u02c0\u0161\20\u0f68\u0f9e\3\2\2\2\u0f69"+
		"\u0f6a\f\16\2\2\u0f6a\u0f6b\5\u02b2\u015a\2\u0f6b\u0f6c\5\u02c0\u0161"+
		"\17\u0f6c\u0f9e\3\2\2\2\u0f6d\u0f6e\f\r\2\2\u0f6e\u0f6f\5\u02b4\u015b"+
		"\2\u0f6f\u0f70\5\u02c0\u0161\16\u0f70\u0f9e\3\2\2\2\u0f71\u0f72\f\f\2"+
		"\2\u0f72\u0f73\5\u02b6\u015c\2\u0f73\u0f74\5\u02c0\u0161\r\u0f74\u0f9e"+
		"\3\2\2\2\u0f75\u0f76\f\13\2\2\u0f76\u0f77\5\u02ba\u015e\2\u0f77\u0f78"+
		"\5\u02c0\u0161\f\u0f78\u0f9e\3\2\2\2\u0f79\u0f7b\f\n\2\2\u0f7a\u0f7c\7"+
		"\t\2\2\u0f7b\u0f7a\3\2\2\2\u0f7b\u0f7c\3\2\2\2\u0f7c\u0f7d\3\2\2\2\u0f7d"+
		"\u0f7e\5\u02b8\u015d\2\u0f7e\u0f7f\5\u02c0\u0161\13\u0f7f\u0f9e\3\2\2"+
		"\2\u0f80\u0f82\f\7\2\2\u0f81\u0f83\7\t\2\2\u0f82\u0f81\3\2\2\2\u0f82\u0f83"+
		"\3\2\2\2\u0f83\u0f84\3\2\2\2\u0f84\u0f85\7\u00ce\2\2\u0f85\u0f86\5\u02c0"+
		"\u0161\2\u0f86\u0f87\7\7\2\2\u0f87\u0f88\5\u02c0\u0161\b\u0f88\u0f9e\3"+
		"\2\2\2\u0f89\u0f8a\f\4\2\2\u0f8a\u0f8b\5\u02be\u0160\2\u0f8b\u0f8c\5\u02c0"+
		"\u0161\5\u0f8c\u0f9e\3\2\2\2\u0f8d\u0f8e\f\22\2\2\u0f8e\u0f8f\7A\2\2\u0f8f"+
		"\u0f9e\5\u02aa\u0156\2\u0f90\u0f92\f\t\2\2\u0f91\u0f93\7\t\2\2\u0f92\u0f91"+
		"\3\2\2\2\u0f92\u0f93\3\2\2\2\u0f93\u0f94\3\2\2\2\u0f94\u0f95\7\n\2\2\u0f95"+
		"\u0f96\t\36\2\2\u0f96\u0f9e\5\u026a\u0136\2\u0f97\u0f99\f\b\2\2\u0f98"+
		"\u0f9a\7\t\2\2\u0f99\u0f98\3\2\2\2\u0f99\u0f9a\3\2\2\2\u0f9a\u0f9b\3\2"+
		"\2\2\u0f9b\u0f9c\7\u00b6\2\2\u0f9c\u0f9e\5\u02c2\u0162\2\u0f9d\u0f5d\3"+
		"\2\2\2\u0f9d\u0f61\3\2\2\2\u0f9d\u0f65\3\2\2\2\u0f9d\u0f69\3\2\2\2\u0f9d"+
		"\u0f6d\3\2\2\2\u0f9d\u0f71\3\2\2\2\u0f9d\u0f75\3\2\2\2\u0f9d\u0f79\3\2"+
		"\2\2\u0f9d\u0f80\3\2\2\2\u0f9d\u0f89\3\2\2\2\u0f9d\u0f8d\3\2\2\2\u0f9d"+
		"\u0f90\3\2\2\2\u0f9d\u0f97\3\2\2\2\u0f9e\u0fa1\3\2\2\2\u0f9f\u0f9d\3\2"+
		"\2\2\u0f9f\u0fa0\3\2\2\2\u0fa0\u02c1\3\2\2\2\u0fa1\u0f9f\3\2\2\2\u0fa2"+
		"\u0fa5\5\u02c4\u0163\2\u0fa3\u0fa5\5\u026a\u0136\2\u0fa4\u0fa2\3\2\2\2"+
		"\u0fa4\u0fa3\3\2\2\2\u0fa5\u02c3\3\2\2\2\u0fa6\u0fa7\7\u0152\2\2\u0fa7"+
		"\u0fa8\5\u01c0\u00e1\2\u0fa8\u0fa9\7\u0153\2\2\u0fa9\u02c5\3\2\2\2\u0faa"+
		"\u0fab\t\37\2\2\u0fab\u02c7\3\2\2\2\u0fac\u0fad\t\37\2\2\u0fad\u02c9\3"+
		"\2\2\2\u0fae\u0fb0\5\u023e\u0120\2\u0faf\u0fb1\5\u02cc\u0167\2\u0fb0\u0faf"+
		"\3\2\2\2\u0fb0\u0fb1\3\2\2\2\u0fb1\u02cb\3\2\2\2\u0fb2\u0fb3\7%\2\2\u0fb3"+
		"\u0fb4\7\u0152\2\2\u0fb4\u0fb9\5\u02ce\u0168\2\u0fb5\u0fb6\7\u0150\2\2"+
		"\u0fb6\u0fb8\5\u02ce\u0168\2\u0fb7\u0fb5\3\2\2\2\u0fb8\u0fbb\3\2\2\2\u0fb9"+
		"\u0fb7\3\2\2\2\u0fb9\u0fba\3\2\2\2\u0fba\u0fbc\3\2\2\2\u0fbb\u0fb9\3\2"+
		"\2\2\u0fbc\u0fbd\7\u0153\2\2\u0fbd\u02cd\3\2\2\2\u0fbe\u0fc1\5\u02da\u016e"+
		"\2\u0fbf\u0fc0\7\u0158\2\2\u0fc0\u0fc2\5\u0292\u014a\2\u0fc1\u0fbf\3\2"+
		"\2\2\u0fc1\u0fc2\3\2\2\2\u0fc2\u02cf\3\2\2\2\u0fc3\u0fc4\7%\2\2\u0fc4"+
		"\u0fc5\7\u0152\2\2\u0fc5\u0fca\5\u02d2\u016a\2\u0fc6\u0fc7\7\u0150\2\2"+
		"\u0fc7\u0fc9\5\u02d2\u016a\2\u0fc8\u0fc6\3\2\2\2\u0fc9\u0fcc\3\2\2\2\u0fca"+
		"\u0fc8\3\2\2\2\u0fca\u0fcb\3\2\2\2\u0fcb\u0fcd\3\2\2\2\u0fcc\u0fca\3\2"+
		"\2\2\u0fcd\u0fce\7\u0153\2\2\u0fce\u02d1\3\2\2\2\u0fcf\u0fd0\5\u02da\u016e"+
		"\2\u0fd0\u0fd1\5\u02d4\u016b\2\u0fd1\u0fd2\5\u0292\u014a\2\u0fd2\u02d3"+
		"\3\2\2\2\u0fd3\u0fd4\t \2\2\u0fd4\u02d5\3\2\2\2\u0fd5\u0fd6\t!\2\2\u0fd6"+
		"\u02d7\3\2\2\2\u0fd7\u0fdb\5\u02d6\u016c\2\u0fd8\u0fdb\7\u016c\2\2\u0fd9"+
		"\u0fdb\5\u02dc\u016f\2\u0fda\u0fd7\3\2\2\2\u0fda\u0fd8\3\2\2\2\u0fda\u0fd9"+
		"\3\2\2\2\u0fdb\u02d9\3\2\2\2\u0fdc\u0fdf\7\u0172\2\2\u0fdd\u0fdf\5\u02e0"+
		"\u0171\2\u0fde\u0fdc\3\2\2\2\u0fde\u0fdd\3\2\2\2\u0fdf\u02db\3\2\2\2\u0fe0"+
		"\u0fe1\5\u02da\u016e\2\u0fe1\u0fe2\7\u014e\2\2\u0fe2\u0fe3\5\u02da\u016e"+
		"\2\u0fe3\u0fe6\3\2\2\2\u0fe4\u0fe6\5\u02da\u016e\2\u0fe5\u0fe0\3\2\2\2"+
		"\u0fe5\u0fe4\3\2\2\2\u0fe6\u02dd\3\2\2\2\u0fe7\u0fea\5\u02da\u016e\2\u0fe8"+
		"\u0fea\7\u0173\2\2\u0fe9\u0fe7\3\2\2\2\u0fe9\u0fe8\3\2\2\2\u0fea\u02df"+
		"\3\2\2\2\u0feb\u0fec\t\"\2\2\u0fec\u02e1\3\2\2\2\u0fed\u0fee\t#\2\2\u0fee"+
		"\u02e3\3\2\2\2\u01f0\u02e9\u02f0\u02f4\u02fa\u0300\u030b\u030e\u0310\u0322"+
		"\u0327\u032c\u0332\u0336\u0343\u0347\u034b\u0350\u0357\u035d\u0361\u0363"+
		"\u0367\u036e\u0370\u0376\u0381\u0389\u038d\u03b7\u03d2\u03d6\u03d9\u03de"+
		"\u03ec\u03f5\u03f9\u0400\u0403\u0407\u040d\u0410\u0413\u0416\u041c\u041f"+
		"\u0422\u0425\u0428\u042b\u042e\u0431\u0434\u0438\u043a\u0444\u0449\u044d"+
		"\u0450\u045b\u046b\u047a\u047e\u048d\u049a\u049e\u04a3\u04be\u04c3\u04cb"+
		"\u04d1\u04d5\u04d8\u04db\u04e1\u04e8\u04f2\u04f6\u04fb\u04ff\u0505\u050c"+
		"\u0513\u051b\u0522\u0526\u0529\u0531\u0534\u053c\u053f\u0543\u054d\u0552"+
		"\u0558\u0565\u0575\u0585\u0595\u059c\u05b0\u05b4\u05b9\u05be\u05c1\u05c4"+
		"\u05c8\u05cb\u05ce\u05d5\u05e0\u05e8\u05ee\u05fe\u0601\u060b\u0613\u0617"+
		"\u061a\u061e\u0622\u0625\u062a\u062f\u0635\u0640\u0642\u0646\u064c\u0652"+
		"\u0657\u065d\u0662\u0669\u066e\u0676\u067b\u0682\u0688\u0690\u0697\u069c"+
		"\u06a4\u06ab\u06ae\u06b1\u06b3\u06c1\u06c3\u06c9\u06d8\u06e9\u06ee\u06f2"+
		"\u06f6\u06fd\u0704\u070a\u070e\u0711\u0718\u072f\u0734\u0738\u0740\u0748"+
		"\u074c\u0752\u0757\u075e\u0761\u0767\u076e\u0776\u077f\u0788\u079c\u07a2"+
		"\u07a5\u07a7\u07ae\u07b8\u07c0\u07c4\u07c8\u07d5\u07de\u07e4\u07e8\u07ef"+
		"\u07f2\u07f5\u07f8\u0801\u0805\u0808\u080b\u080e\u0811\u0814\u0822\u082a"+
		"\u0830\u0834\u0841\u0851\u0861\u0865\u0874\u087a\u087d\u0880\u0883\u0886"+
		"\u088a\u0898\u08a0\u08a3\u08b2\u08d4\u08dc\u08e1\u08eb\u08f3\u08fb\u0903"+
		"\u090e\u0912\u091a\u0923\u0926\u092f\u0933\u0935\u0939\u093d\u0943\u094a"+
		"\u0953\u095e\u0962\u0969\u0975\u097c\u0984\u0988\u098b\u0992\u0998\u099c"+
		"\u099f\u09a5\u09a9\u09ad\u09b2\u09b6\u09ba\u09be\u09c6\u09ca\u09ce\u09d2"+
		"\u09d6\u09de\u09e2\u09e6\u09f6\u09ff\u0a07\u0a11\u0a23\u0a26\u0a30\u0a4c"+
		"\u0a52\u0a58\u0a5e\u0a60\u0a63\u0a69\u0a71\u0a80\u0a87\u0a8c\u0a8f\u0a93"+
		"\u0a96\u0a99\u0a9c\u0a9f\u0aa5\u0aa9\u0aac\u0aaf\u0ab2\u0ab5\u0ab8\u0abf"+
		"\u0ac2\u0ac9\u0acc\u0acf\u0ad2\u0ad5\u0ad8\u0adb\u0ade\u0ae1\u0ae4\u0ae8"+
		"\u0aeb\u0aee\u0af1\u0af4\u0af7\u0afa\u0afd\u0b00\u0b03\u0b05\u0b0b\u0b10"+
		"\u0b17\u0b19\u0b1c\u0b21\u0b24\u0b28\u0b2d\u0b34\u0b3a\u0b46\u0b4d\u0b53"+
		"\u0b5c\u0b5f\u0b63\u0b69\u0b73\u0b77\u0b82\u0b88\u0b8b\u0b95\u0b97\u0b9b"+
		"\u0ba2\u0bb8\u0bbf\u0bc3\u0bc6\u0bcb\u0bce\u0bd5\u0bdc\u0bdf\u0be7\u0bed"+
		"\u0bef\u0bf1\u0bf4\u0bf7\u0bfc\u0c06\u0c0b\u0c0d\u0c13\u0c16\u0c19\u0c21"+
		"\u0c27\u0c29\u0c2b\u0c2e\u0c31\u0c35\u0c3c\u0c45\u0c4f\u0c52\u0c55\u0c58"+
		"\u0c5c\u0c66\u0c70\u0c78\u0c80\u0c87\u0c90\u0c98\u0ca4\u0ca7\u0cad\u0cb4"+
		"\u0cbb\u0cc2\u0cc9\u0cd2\u0cd6\u0cdd\u0ce2\u0ce6\u0cf9\u0cfe\u0d03\u0d09"+
		"\u0d16\u0d19\u0d1c\u0d28\u0d2b\u0d2e\u0d36\u0d3f\u0d44\u0d46\u0d57\u0d5a"+
		"\u0d67\u0d6b\u0d6f\u0d72\u0d75\u0d78\u0d7c\u0d7f\u0d82\u0d89\u0d8e\u0d96"+
		"\u0d9c\u0da1\u0da5\u0daa\u0db1\u0dbf\u0dc2\u0dc6\u0dd5\u0ddf\u0de8\u0deb"+
		"\u0df6\u0e02\u0e0c\u0e16\u0e1b\u0e1f\u0e23\u0e29\u0e3b\u0e41\u0e45\u0e4d"+
		"\u0e57\u0e61\u0e74\u0e7a\u0e81\u0e84\u0e86\u0e8b\u0e8f\u0ea1\u0ea5\u0eb1"+
		"\u0eb5\u0ebe\u0ed9\u0edf\u0ee7\u0eec\u0f05\u0f13\u0f20\u0f25\u0f2c\u0f4a"+
		"\u0f4c\u0f5b\u0f7b\u0f82\u0f92\u0f99\u0f9d\u0f9f\u0fa4\u0fb0\u0fb9\u0fc1"+
		"\u0fca\u0fda\u0fde\u0fe5\u0fe9";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}