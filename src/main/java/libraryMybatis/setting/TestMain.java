package libraryMybatis.setting;

import java.sql.Connection;

import libraryMybatis.DBservice.DbService;
import libraryMybatis.DBservice.ExportService;
import libraryMybatis.DBservice.ImportService;
import libraryMybatis.DBservice.InitService;

public class TestMain {

	public static void main(String[] args) {
		DBCon dbCon = DBCon.getInstance();

		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		DbService serivce = InitService.getInstance();
		serivce.service();
		
		serivce = ImportService.getInstance();
		serivce.service();
		
		serivce = ExportService.getInstance();
		serivce.service();
		
		
		JdbcUtil.close(connection);
	}

}
