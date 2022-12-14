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
	protected final String ERROR_DUPLICATE_BOOK_CODE = "중복되는 책 코드가 이미 존재합니다.";
	
	public BookDAO() {
		connectDB();
	}

	// DB 연결
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
			System.out.println("데이터베이스 연결 성공!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// DB 연결 해제
	protected void disConnect() {
		try {
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 책 중복 검사
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
		return (cnt != 0); // 중복된 값 있으면 true
	}
	
	// 책 DB에 등록하기
	protected boolean insertBook(BookDTO book) {
		PreparedStatement pstmt = null;
		if(isBook(book.getId())) { // 코드 중복 검사
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
			upd = pstmt.executeUpdate(); // 영향 받은 행 개수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { // PreparedStatement 닫아주기
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return (upd != 0); // 영향 받은 행이 있으면 true
	}
	
	// 한권의 책 정보
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
	
	// 전체 책 정보 출력
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
	
	// 책 제목으로 책 정보 검색하기
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
	
	// 책 대여 / 반납
	protected boolean updateRentInfo(int id, int changeNum, boolean flag) {
		// flag : 반납(+) -> true, 대여(-) -> false
		if(!isBook(id)) {
			System.out.println("해당 코드의 책이 존재하지 않습니다.");
			return false;
		}
		
		PreparedStatement pstmt = null;
		int upd = 0;
		int bookNum;
		String sql = "update book set bookNum = ? where id = ?";
		BookDTO book = selectOne(id);
		// 반납/대여 나누기
		if(flag) { // 반납
			bookNum = book.getBookNum() + changeNum;
			// totalNum보다 많을 경우 false
			if(bookNum > book.getTotalNum()) { 
				System.out.println("대여한 수보다 많이 반납할 수 없습니다.");
				System.out.println("반납 권수를 다시 확인해주세요.");
				return false;
			}
		}
		else { // 대여
			// 대여하고싶은 책 권수가 더 많을 경우 false
			if(book.getBookNum() < changeNum) { 
				System.out.println("재고가 " + book.getBookNum() + "이여서 대여할 수 없습니다.");
				return false;
			}
			bookNum = book.getBookNum() - changeNum;
		}
		
		try { // DB update 시작
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookNum);
			pstmt.setInt(2, id);
			upd = pstmt.executeUpdate(); // 영향 받은 행 개수 반환
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return (upd != 0); // 대여/반납 기능 성공 -> true
	}
}
