package mvc_school_connDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO extends ConnectDB {
	
	// �й� �ߺ� �˻�
	public boolean isStudentID(int id) { // true -> �ߺ� �й� ����
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		return (cnt != 0);
	}
	
	// �л� �߰�
	public boolean addStudent(StudentDTO student) { // true -> �߰� �Ϸ�
		connDB(); // db ����
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

	// �л� ����
	public boolean removeStudent(int id) { // true -> ���� �Ϸ�
		connDB(); // db ����
		Statement stmt = null;
		
		int upd = 0;
		String sql = "delete from student where id = " + id;
		
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
	
	// �л� ���� ����
	public boolean updateStudent(StudentDTO student) { // true -> ���� �Ϸ�
		connDB(); // db ����
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

	// ��� �л� ��� ���� ��������
	public ArrayList<StudentDTO> studentAll() {
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		
		return students;
	}
	
	// �Ѹ��� �л� ���� ��������
	public StudentDTO studentOne(int id) {
		connDB(); // db ����
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
			closeDB(); // db ���� ����
		}
		
		return student;
	}
}
