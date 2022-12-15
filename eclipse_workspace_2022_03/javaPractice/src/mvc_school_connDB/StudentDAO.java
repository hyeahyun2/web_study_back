package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO extends ConnectDB {
	
	// 학번 중복 검사
	public boolean isStudentID(int id) { // true -> 중복 학번 있음
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select COUNT(*) AS cnt from student where id = " + id;
		int cnt = 0;
		
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
	
	// 학생 추가
	public boolean addStudent(StudentDTO student) { // true -> 추가 완료
		connDB(); // db 연결
		PreparedStatement pstmt = null;
		
		int upd = 0;
		String sql = "insert into student (id, name, phoneNumber, memo) "
				+ "values(?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPhoneNumber());
			pstmt.setString(4, student.getMemo());
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

	// 학생 삭제
	public boolean removeStudent(int id) { // true -> 삭제 완료
		connDB(); // db 연결
		Statement stmt = null;
		
		int upd = 0;
		String sql = "delete from student where id = " + id;
		
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
	
	// 학생 정보 수정
	public boolean updateStudent(StudentDTO student) { // true -> 수정 완료
		connDB(); // db 연결
		PreparedStatement pstmt = null;
		
		int upd = 0;
		String sql = "update student set name = ?, phoneNumber = ?, "
				+ "memo = ? where id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getPhoneNumber());
			pstmt.setString(3, student.getMemo());
			pstmt.setInt(4, student.getId());
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

	// 모든 학생 모든 정보 가져오기
	public ArrayList<StudentDTO> studentAll() {
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<StudentDTO> students = new ArrayList<StudentDTO>();
		
		String sql = "select * from student";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				StudentDTO student = new StudentDTO();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setPhoneNumber(rs.getString(3));
				student.setMemo(rs.getString(4));
				students.add(student);
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
		
		return students;
	}
	
	// 한명의 학생 정보 가져오기
	public StudentDTO studentOne(int id) {
		connDB(); // db 연결
		Statement stmt = null;
		ResultSet rs = null;
		StudentDTO student = new StudentDTO();
		
		String sql = "select * from student where id = " + id;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setPhoneNumber(rs.getString(3));
				student.setMemo(rs.getString(4));
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
		
		return student;
	}
}
