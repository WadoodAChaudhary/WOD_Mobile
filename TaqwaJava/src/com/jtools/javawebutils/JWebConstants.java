package com.jtools.javawebutils;

/**
 * Title: Description: Copyright: Copyright (c) 2002 Company:
 * 
 * @author
 * @version 1.0
 */

public interface JWebConstants {
	public static final String DIRECTION = "ShapeDirection";
	public static final int NODE_OPEN = 5;
	public static final int NODE_CLOSED = 3;
	public static final int PLUS = 3;
	public static final int MINUS = 5;
	public static final float NULL_VALUE = Float.NaN;
	public static final float NULL_FLOAT = Float.NaN;
	public static final double NULL_DOUBLE = Double.NaN;
	public static final int IMAGE_GIF = 0;
	public static final int IMAGE_PNG = 1;
	public static final int IMAGE_JPEG = 2;
	public static final int MaxInt = 2147483647;
	public static final String EXT_JPEG = "jpg";
	public static final String EXT_GIF = "gif";
	public static final String EXT_TEXT = "txt";
	public static final String EXT_EXCEL = "xls";
	public static final String EXT_XYZ = "xyz";
	public static final String EXT_ZIP = "zip";
	public static final String EXT_ASCII = "asc";
	public static final String EXT_DATA = "dat";
	public static final String EXT_SHAPE = "shp";
	public static final String EXT_DBF = "dbf";
	public static final String EXT_MIF = "mif";
	public static final String EXT_PDF = "pdf";
	public static final String EXT_JDW = "jdw";
	public static final String EXT_EXE = "exe";
	public static final int CENTER = 0;
	public static final int TOP = 1;
	public static final int LEFT = 2;
	public static final int BOTTOM = 3;
	public static final int RIGHT = 4;
	public static final int NORTH = 1;
	public static final int NORTH_EAST = 2;
	public static final int EAST = 3;
	public static final int SOUTH_EAST = 4;
	public static final int SOUTH = 5;
	public static final int SOUTH_WEST = 6;
	public static final int WEST = 7;
	public static final int NORTH_WEST = 8;
	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;
	public static final int ORIENTATION_HORIZONTAL = 0;
	public static final int ORIENTATION_VERTICAL = 1;
	public static final int ORIENTATION_PLUS_90 = 2;
	public static final int ORIENTATION_MINUS_90 = 3;
	public static final int LEADING = 10;
	public static final int TRAILING = 11;
	public static final int ALIGNMENT = 12;
	public static final int VERTICAL_ALIGNMENT = 13;
	public static final int BACKGROUND = 14;
	public static final int FOREGROUND = 15;
	public static final int TEXT_COLOR = 15;
	public static final int FONT = 16;
	public static final int EVENT = 17;
	public static final int NO_EVENT = -1;
	public static final int NOT_ALIGNED = -999;
	public static final String VAR = "_VAR";
	public static final String MULTI_PART = "multipart/form-data;";
	public static int A4 = 1;
	public static int A4_SMALL = 2;
	public static int A5 = 3;;
	public static int LETTER = 4;
	public static int A3 = 5;
	public static int PORTRAIT = 0;
	public static int LANDSCAPE = 1;
	public static final String PAGE_AUTO = "&P";
	public static final char TYPE_DATE = 'D';
	public static final char TYPE_LONG = 'L';
	public static final char TYPE_CHARACTER = 'C';
	public static final char TYPE_NUMERIC = 'N';
	public static final char TYPE_FLOAT = 'F';
	public static final char TYPE_MEMO = 'M';
	public static final char TYPE_GENERAL = 'G';
	public static final int NULL = 0;
	public static final int POINT = 1;
	public static final int ARC = 3;
	public static final int LINE = 4;
	public static final int POLYGON = 5;
	public static final int MULTIPOINT = 8;
	public static final int ARC_M = 23;
	public static final int UNDEFINED = -1;
	public static final int CIRCLE = 6;
	public static final String SEPARATOR_PATTERN = "[SEP]";
	public static final int FILE_NAME_AUTO_GENERATE = 1;
	public static final int FILE_NAME_USER_SPECEFIED = 0;
	public static final int JDBC_ORACLE = 0;
	public static final int JDBC_ODBC = 1;
	public static final int JDBC_SYBASE = 2;
	public static final int JDBC_FOXPRO = 3;
	public static final int JDBC_ACCESS = 4;
	public static final int JDBC_TESSULA = 5;
	public static final int JDBC_CUBE = 6;
	public static final int JDBC_MYSQL = 7;
	public static final int JDBC_MSQL = 8;
    public static final int JDBC_SQLLITE = 9;

    public static final String JDBC_DRIVER_CLASS_ORACLE = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_DRIVER_CLASS_SYBASE_2 = "com.sybase.jdbc2.jdbc.SybDriver";
	public static final String JDBC_DRIVER_CLASS_SYBASE_3 = "com.sybase.jdbc3.jdbc.SybDriver";
	public static final String JDBC_DRIVER_CLASS_MYSQL_1 = "com.mysql.Driver";
	public static final String JDBC_DRIVER_CLASS_MYSQL_2 = "com.mysql.jdbc.Driver";
	public static final int IMAGE = -1;
	public static final int EXCEL = 0;
	public static final int HTML = 1;
	public static final int RTF = 2;
	public static final int PPT = 3;
	public static final int TEXT = 4;
	public static final int SQL = 5;
	public static final int CSV = 6;
	public static final int PDF = 7;
  public static final int DATA_WINDOW = 8;
	public static final int DBF = 9;
	public static final int DB_TABLE = 10;
	public static final int FIXED_LENGTH = 11;
  public static final int STREAM = 12;
  public static final String CUBE = "Cube";
	public static final String METRIC = "Metric";
	public static final String DIMENSION = "Dimension";
	public static final String CUBE_TYPE_TEXT = "Text";
	public static final String CUBE_TYPE_NUMERIC = "Numeric";
	public static final String CUBE_TYPE_MONTH = "Month";
	public static final String EXPR_DELIMITER = "@";
	public static final int QUOTES = 0;
	public static final int CURLY = 1;
	public static final String TIERS = "TIERS";
	public static final String MAIN_CELL = "MainCell";
	public static final String MAIN_DW = "MainDW";
	public static final String ORIENTATION = "orientation";
	public static final String FILE_NAME = "FileName";
	public static final String DATAWINDOW_VAR = "DatawindowVar";
	public static final String TEXT_VAR = "TextVar";
	public static final String CELL_VAR = "CellVar";
	public static final int CROSSTAB = 1;
	public static final int DASHBOARD = 2;
	public static final int CHART = 3;
	public static final int MAP = 4;
	public static final int REPORT = 5;
	public static final int CUSTOM = 6;
	public static final int TABLE=7;
	public static final int DATAWINDOW = 0;
	public static final int DATAWINDOW_LITE = 1;
	public static final float BILLION = 1000000000f;
	public static final float HUNDRED_MILLION = 100000000f;
	public static final float TEN_MILLION = 10000000f;
	public static final float MILLION = 1000000f;
	public static final float HUNDRED_THOUSAND = 100000f;
	public static final float TEN_THOUSAND = 10000f;
	public static final float THOUSAND = 1000f;
	public static final float HUNDRED = 100f;
	public static final String DESELECTED = "x";
	public static final String SELECTED = "*";
	public static final String AGG_SUM = "SUM";
	public static final String AGG_MIN = "MIN";
	public static final String AGG_MAX = "MAX";
	public static final String AGG_COUNT = "COUNT";
	public static final String AGG_AVG = "AVG";
	public static final String UDF_FX = "VALUE";
	public static final String COLUMN_NAME_EXPR = "@COLUMN";
	public static final int MASTER_DETAIL = 100;
	public static final int DETAIL = 101;
	public static final int MASTER = 102;
  public static final char L_PAREN = '(';
  public static final char R_PAREN = ')';
  public static final char COMMA = ',';
  public static final String SINGLE_QUOTE = "S_QT";
  public static final String NO_QUOTE = "N_QT";
  public static final String CURRENCY = "Currency";
  public static final String CURRENCY_RATE = "Rate";
}