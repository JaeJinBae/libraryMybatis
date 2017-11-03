package libraryMybatis.DBservice;

import libraryMybatis.setting.Config;
import libraryMybatis.setting.DatabaseDao;

public class ImportService implements DbService {
	private static final ImportService Instance = new ImportService();

	public static ImportService getInstance() {
		return Instance;
	}

	private ImportService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		DatabaseDao.getInstance().executeUpdateSQL("SET FOREIGN_KEY_CHECKS = 0");
		DatabaseDao.getInstance().executeUpdateSQL("use " + Config.DB_NAME);
		
		String[] address = {"강원도", "경기도", "경상남도", "경상북도", "광주광역시",
							"대구광역시", "대전광역시", "부산광역시", "서울특별시", "세종특별자치시",
							"울산광역시", "인천광역시", "전라남도", "전라북도", "제주특별자치도",
							"충청남도", "충청북도"};
		
		for (String tableName : Config.TABLE_NAME) {
			if(tableName.equals("post")) {
				for(int i = 0; i < address.length; i++) {
					DatabaseDao.getInstance().executeUpdateSQL(String.format("LOAD DATA LOCAL INFILE '%s' INTO TABLE %s ",	Config.getFilePath(address[i], false), tableName));
				}
			}
			else {
				DatabaseDao.getInstance().executeUpdateSQL(String.format("LOAD DATA LOCAL INFILE '%s' INTO TABLE %s ",	Config.getFilePath(tableName, false), tableName));
			}
		}
		DatabaseDao.getInstance().executeUpdateSQL("SET FOREIGN_KEY_CHECKS = 1");
	}
}
