package mvc_Library;

public class BookDTO {
	private int id;
	private String title;
	private String writer;
	private int number;
	private final int totalNum;
	

//	public BookDTO() {}
	public BookDTO(int id, String title, String writer, int number, int totalNum) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.number = number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getTotalNum() {
		return totalNum;
	}

	@Override
	public String toString() {
		return id + " / " + title + " / " + writer + " / " + number;
	}
	
	
}
