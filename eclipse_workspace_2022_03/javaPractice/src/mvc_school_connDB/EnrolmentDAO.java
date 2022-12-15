package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EnrolmentDAO extends ConnectDB {
	ClassListDAO classListDAO = new ClassListDAO();
	
	// �ش� �л��� ���� ��û�� ���� ���� �ҷ�����
	public ArrayList<EnrolmentDTO> studentClass(int id){
		ArrayList<EnrolmentDTO> enrolments = new ArrayList<>();
		
		connDB(); // db ����
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from enrolment where id = " + id;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EnrolmentDTO enrolment = new EnrolmentDTO();
				enrolment.setClassCode(rs.getInt("classCode"));
				enrolment.setId(rs.getInt("id"));
				enrolment.setScore(rs.getInt("score"));
				enrolments.add(enrolment);
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
		return enrolments;
	}
	
	// �ش� �л��� ���� ��û ���� ���� �˻�
	public boolean isEnrolment(int id, int classCode) { // true -> ��û�� ����
		connDB(); // db ����
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int cnt = 0;
		String sql = "select COUNT(*) AS cnt from enrolment where (id = ?) and (classCode = ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setInt(2, classCode);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			closeDB(); // db ���� ����
		}
		
		return (cnt != 0);
	}
	
	// ���� ��û(true) or ����(false)
	public boolean setClass(int id, int classCode,boolean flag) { // true -> ��û/���� ����
		connDB(); // db ����
		PreparedStatement pstmt = null;
		
		int upd = 0;
		String sql = "";
		
		try {
			if(flag) { // ���� ��û
				sql = "insert into enrolment (id, classCode) values(?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setInt(2, classCode);
				upd = pstmt.executeUpdate(); // ���� ���� �� ���� ��ȯ
			}
			else { // ���� ����
				sql = "delete from enrolment where (id = ?) and (classCode = ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setInt(2, classCode);
				upd = pstmt.executeUpdate(); // ���� ���� �� ���� ��ȯ
			}
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

	// ���� �Է�
	public boolean settingScore(int id, int classCode,int score) { // true -> ���� �Է� ����
		connDB(); // db ����
		PreparedStatement pstmt = null;
		
		int upd = 0;
		String sql = "update enrolment set score = ? where (id = ?) and (classCode = ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, score);
			pstmt.setInt(2, id);
			pstmt.setInt(3, classCode);
			upd = pstmt.executeUpdate();
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
}
