package mvc_Library;

import java.util.ArrayList;

public class BookDAO {
	ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();
	
	// å �ߺ� �˻�
	protected boolean idCheck(int id) {
		for(BookDTO b : bookList) {
			if(b.getId() == id) return true;
		}
		return false;
	}
	
	// �ѱ��� å ����
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
	// å �������� å ���� �˻��ϱ�
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
