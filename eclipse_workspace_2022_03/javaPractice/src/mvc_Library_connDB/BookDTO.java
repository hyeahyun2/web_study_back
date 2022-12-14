package mvc_Library_connDB;

public class BookDTO {
	private int id;
	private String title;
	private String writer;
	private int bookNum;
	private final int totalNum;
	

//	public BookDTO() {}
	public BookDTO(int id, String title, String writer, int bookNum, int totalNum) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.bookNum = bookNum;
		this.totalNum = totalNum;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public int getTotalNum() {
		return totalNum;
	}

	@Override
	public String toString() {
		return id + " / " + title + " / " + writer + " / " 
				+ bookNum + "권 / " + (totalNum-bookNum) + "권 대여중";
	}
	
	
}
