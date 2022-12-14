package mvc_Library_connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	Connection conn = null;
	
	private final String TABLE_NAME = "book";
	protected final String ERROR_DUPLICATE_BOOK_CODE = "�ߺ��Ǵ� å �ڵ尡 �̹� �����մϴ�.";
	
	public BookDAO() {
		connectDB();
	}

	// DB ����
	private void connectDB() {
		try {
			String url = "jdbc:mariadb://localhost:3306/StudyJDBC";
			String user = "root";
			String password = "6995";
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			this.conn = DriverManager.getConnection(url, user, password);
			System.out.println("�����ͺ��̽� ���� ����!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// DB ���� ����
	protected void disConnect() {
		try {
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// å �ߺ� �˻�
	protected boolean isBook(int id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int cnt = 0;
		String sql = "SELECT COUNT(*) AS cnt FROM book WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
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
		}
		return (cnt != 0); // �ߺ��� �� ������ true
	}
	
	// å DB�� ����ϱ�
	protected boolean insertBook(BookDTO book) {
		PreparedStatement pstmt = null;
		if(isBook(book.getId())) { // �ڵ� �ߺ� �˻�
			return false;
		}
		
		int upd = 0;
		String sql = "INSERT INTO " + TABLE_NAME 
				+ " (id, title, writer, bookNum, totalNum) VALUES(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getWriter());
			pstmt.setInt(4, book.getBookNum());
			pstmt.setInt(5, book.getTotalNum());
			upd = pstmt.executeUpdate(); // ���� ���� �� ���� ��ȯ
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { // PreparedStatement �ݾ��ֱ�
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return (upd != 0); // ���� ���� ���� ������ true
	}
	
	// �ѱ��� å ����
	protected BookDTO selectOne(int id) {
		BookDTO book = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM book WHERE id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				book = new BookDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}
	
	// ��ü å ���� ���
	protected ArrayList<BookDTO> selectAll(){
		ArrayList<BookDTO> bookList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from " + TABLE_NAME;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				BookDTO book = new BookDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				bookList.add(book);
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
		}
		return bookList;
	}
	
	// å �������� å ���� �˻��ϱ�
	protected ArrayList<BookDTO> selectTitle(String title) {
		ArrayList<BookDTO> includeTitle = new ArrayList<BookDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from book where title like '%"+ title +"%'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDTO book = new BookDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				includeTitle.add(book);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return includeTitle;
	}
	
	// å �뿩 / �ݳ�
	protected boolean updateRentInfo(int id, int changeNum, boolean flag) {
		// flag : �ݳ�(+) -> true, �뿩(-) -> false
		if(!isBook(id)) {
			System.out.println("�ش� �ڵ��� å�� �������� �ʽ��ϴ�.");
			return false;
		}
		
		PreparedStatement pstmt = null;
		int upd = 0;
		int bookNum;
		String sql = "update book set bookNum = ? where id = ?";
		BookDTO book = selectOne(id);
		// �ݳ�/�뿩 ������
		if(flag) { // �ݳ�
			bookNum = book.getBookNum() + changeNum;
			// totalNum���� ���� ��� false
			if(bookNum > book.getTotalNum()) { 
				System.out.println("�뿩�� ������ ���� �ݳ��� �� �����ϴ�.");
				System.out.println("�ݳ� �Ǽ��� �ٽ� Ȯ�����ּ���.");
				return false;
			}
		}
		else { // �뿩
			// �뿩�ϰ���� å �Ǽ��� �� ���� ��� false
			if(book.getBookNum() < changeNum) { 
				System.out.println("��� " + book.getBookNum() + "�̿��� �뿩�� �� �����ϴ�.");
				return false;
			}
			bookNum = book.getBookNum() - changeNum;
		}
		
		try { // DB update ����
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookNum);
			pstmt.setInt(2, id);
			upd = pstmt.executeUpdate(); // ���� ���� �� ���� ��ȯ
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return (upd != 0); // �뿩/�ݳ� ��� ���� -> true
	}
}
