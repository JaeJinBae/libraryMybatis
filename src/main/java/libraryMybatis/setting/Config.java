package libraryMybatis.setting;

public class Config {
	public static final String DB_NAME = "mybatis_study";

	public static final String[] TABLE_NAME = { "book_big_group", "book_middle_group",
			"book","publisher", "users", "userrank", "rentalbook", "history"};

	private static final String USER_DIR = System.getProperty("user.dir") + "\\";

	public static final String EXPORT_DIR = USER_DIR + "BackupFiles\\";
	public static final String IMPORT_DIR = USER_DIR + "DataFiles\\";
	public static final String CREATE_SQL = USER_DIR + "resources\\create_sql.txt";

	public static final String getFilePath(String tableName, boolean isExport) {
		StringBuilder sb = new StringBuilder();
		sb.append(isExport ? EXPORT_DIR : IMPORT_DIR).append(tableName).append(".txt");
		return sb.toString().replace("\\", "/");
	}
}
