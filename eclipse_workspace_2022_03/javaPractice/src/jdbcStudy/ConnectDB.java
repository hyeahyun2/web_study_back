package jdbcStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* DBMS�� �����ϱ�
 * java.sql ��Ű���� �����ϴ� Connection ��ü�� ���.
 * Connection ��ü�� ���� java.sql ��Ű���� ���ԵǾ� �ִ� DriverManager Ŭ������
 * getConnection() �޼��带 �̿�.
 * getConnection(String url, String user, String password)�޼���� static �޼���μ�
 * url : ������ �����ͺ��̽� ��ġ
 * user : ����� ���� ���̵�
 * password : ���� ��й�ȣ
 * */
class DB {
	Connection conn = null;
	PreparedStatement preparedStatement = null; // ������ �����ϴ� ��ü
	ResultSet resultSet = null; // �����ÿ� ����� �����ϴ� �뵵�� ���. select�� �ַ� ���
	
	public void connectDB() {
		final String driver = "org.mariadb.jdbc.Driver";
		final String DB_HOST = "127.0.0.1";
		final String DB_PORT = "3306";
		final String DB_NAME = "StudyJDBC"; // ������ ���̽� �̸�
		final String DB_URL = "jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
		final String DB_USER = "root";
		final String DB_PASS = "6995";
		
		// ��� ����
		try {
			Class.forName(driver); // JDBC ����̹� ���
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS); // ��� ����
			if(conn != null) {
				System.out.println("DB���� ����");
			}
		} catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
				System.out.println("DB ���� ����");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

public class ConnectDB {
	// Connection ��ü�� ������ DataBase �����ϱ�
	public static void main(String[] args) {
		DB myDB = new DB();
		myDB.connectDB();
		myDB.closeDB();
	}

}