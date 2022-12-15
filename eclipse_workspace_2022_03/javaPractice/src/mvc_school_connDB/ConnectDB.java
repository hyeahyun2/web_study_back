package mvc_school_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	Connection conn = null;
	// PreparedStatement
	// Statement
	// ResultSet
	
	public ConnectDB() {}
	
	// DB 연결
	protected void connDB() {
		final String DB_URL = "jdbc:mariadb://localhost:3306/scool";
		final String DB_USER = "root";
		final String DB_PASS = "6995";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
//			System.out.println("DB 연결 성공!");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// DB 닫기
	protected void closeDB() {
		try {
			if(conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
