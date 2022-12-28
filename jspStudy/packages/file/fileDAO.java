package file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class fileDAO {
	private Connection conn = null;
	
	// 생성자를 통해 db 연결
	public fileDAO() {
		try {
			String url = "jdbc:mariadb://localhost:3306/MyStudy";
			String user = "root";
			String password ="6995";
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int upload(String fileName, String fileRealName) {
		PreparedStatement pstmt = null;
		
		String SQL = "insert into file values(?, ?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, fileName);
			pstmt.setString(2, fileRealName);
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // 리소스 닫아주기
			try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return -1; // 데이터베이스 오류
	}
}
