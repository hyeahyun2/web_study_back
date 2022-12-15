package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassListDAO extends ConnectDB{

	// 코드 중복 검사
	public boolean isClassCode(int classCode) { // true -> 중복 코드 있음
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		
		int cnt = 0;
		String sql = "select COUNT(*) AS cnt from classList where classCode = " + classCode;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db 연결 해제
		}
		return (cnt != 0);
	}
	
	// 새과목 등록하기
	public boolean addClass(ClassListDTO newClass) {
		connDB(); // db 연결
		PreparedStatement pstmt = null;

		int upd = 0;
		String sql = "insert into classList (classCode, className) values(?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, newClass.getClassCode());
			pstmt.setString(2, newClass.getClassName());
			upd = pstmt.executeUpdate(); // 영향받은 행 개수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db 연결 해제
		}
		return (upd != 0);
	}
	
	// 과목 삭제하기
	public boolean removeClass(int classCode) {
		connDB(); // db 연결
		Statement stmt = null;
		
		int upd = 0;
		String sql = "delete from classList where classCode = " + classCode;
		
		try {
			stmt = conn.createStatement();
			upd = stmt.executeUpdate(sql); // 영향받은 행 개수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db 연결 해제
		}
		
		return (upd != 0);
	}
	
	// 과목 정보 모두 불러오기
	public ArrayList<ClassListDTO> allClass(){
		ArrayList<ClassListDTO> classList = new ArrayList<>();
		
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from classList";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				ClassListDTO oneClass = new ClassListDTO();
				oneClass.setClassCode(rs.getInt("classCode"));
				oneClass.setClassName(rs.getString("className"));
				classList.add(oneClass);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db 연결 해제
		}
		
		return classList;
	}

	// 해당 코드의 이름 불러오기
	public String selectClassName(int classCode) {
		String className = null;
		
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from classList where classCode = " + classCode;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				className = rs.getString("className");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db 연결 해제
		}
		return className;
	}
}
