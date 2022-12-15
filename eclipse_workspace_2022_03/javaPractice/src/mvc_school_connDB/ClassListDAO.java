package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassListDAO extends ConnectDB{

	// �ڵ� �ߺ� �˻�
	public boolean isClassCode(int classCode) { // true -> �ߺ� �ڵ� ����
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		return (cnt != 0);
	}
	
	// ������ ����ϱ�
	public boolean addClass(ClassListDTO newClass) {
		connDB(); // db ����
		PreparedStatement pstmt = null;

		int upd = 0;
		String sql = "insert into classList (classCode, className) values(?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, newClass.getClassCode());
			pstmt.setString(2, newClass.getClassName());
			upd = pstmt.executeUpdate(); // ������� �� ���� ��ȯ
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db ���� ����
		}
		return (upd != 0);
	}
	
	// ���� �����ϱ�
	public boolean removeClass(int classCode) {
		connDB(); // db ����
		Statement stmt = null;
		
		int upd = 0;
		String sql = "delete from classList where classCode = " + classCode;
		
		try {
			stmt = conn.createStatement();
			upd = stmt.executeUpdate(sql); // ������� �� ���� ��ȯ
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db ���� ����
		}
		
		return (upd != 0);
	}
	
	// ���� ���� ��� �ҷ�����
	public ArrayList<ClassListDTO> allClass(){
		ArrayList<ClassListDTO> classList = new ArrayList<>();
		
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		
		return classList;
	}

	// �ش� �ڵ��� �̸� �ҷ�����
	public String selectClassName(int classCode) {
		String className = null;
		
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		return className;
	}
}
