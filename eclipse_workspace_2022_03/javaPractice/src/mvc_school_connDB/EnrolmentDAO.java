package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EnrolmentDAO extends ConnectDB {
	ClassListDAO classListDAO = new ClassListDAO();
	
	// 해당 학생의 수강 신청한 과목 정보 불러오기
	public ArrayList<EnrolmentDTO> studentClass(int id){
		ArrayList<EnrolmentDTO> enrolments = new ArrayList<>();
		
		connDB(); // db 연결
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
			closeDB(); // db 연결 해제
		}
		return enrolments;
	}
	
	// 해당 학생의 수강 신청 과목 여부 검사
	public boolean isEnrolment(int id, int classCode) { // true -> 신청한 상태
		connDB(); // db 연결
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
			closeDB(); // db 연결 해제
		}
		
		return (cnt != 0);
	}
	
	// 수강 신청(true) or 포기(false)
	public boolean setClass(int id, int classCode,boolean flag) { // true -> 신청/포기 성공
		connDB(); // db 연결
		PreparedStatement pstmt = null;
		
		int upd = 0;
		String sql = "";
		
		try {
			if(flag) { // 수강 신청
				sql = "insert into enrolment (id, classCode) values(?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setInt(2, classCode);
				upd = pstmt.executeUpdate(); // 영향 받은 행 개수 반환
			}
			else { // 수강 포기
				sql = "delete from enrolment where (id = ?) and (classCode = ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.setInt(2, classCode);
				upd = pstmt.executeUpdate(); // 영향 받은 행 개수 반환
			}
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

	// 성적 입력
	public boolean settingScore(int id, int classCode,int score) { // true -> 성적 입력 성공
		connDB(); // db 연결
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
			closeDB(); // db 연결 해제
		}
		
		return (upd != 0);
	}
}
