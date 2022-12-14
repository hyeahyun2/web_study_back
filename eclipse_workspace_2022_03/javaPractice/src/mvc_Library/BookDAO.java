package mvc_Library;

import java.util.ArrayList;

public class BookDAO {
	ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();
	
	// 책 중복 검사
	protected boolean idCheck(int id) {
		for(BookDTO b : bookList) {
			if(b.getId() == id) return true;
		}
		return false;
	}
	
	// 한권의 책 정보
	protected BookDTO selectOne(int id) {
		BookDTO book = null;
		for(BookDTO b : bookList) {
			if(b.getId() == id) {
				book = b;
				break;
			}
		}
		return book;
	}
	// 책 제목으로 책 정보 검색하기
	protected ArrayList<BookDTO> selectTitle(String title) {
		ArrayList<BookDTO> includeTitle = new ArrayList<BookDTO>();
		for(BookDTO b : bookList) {
			if(b.getTitle().contains(title)) {
				includeTitle.add(b);
			}
		}
		return includeTitle;
	}
}
