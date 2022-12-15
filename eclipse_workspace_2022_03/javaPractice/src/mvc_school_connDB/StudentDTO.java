package mvc_school_connDB;

/*
CREATE TABLE student(
	id INT PRIMARY KEY,
	NAME VARCHAR(20) NOT NULL,
	phoneNumber VARCHAR(11),
	memo VARCHAR(500)
);
*/
public class StudentDTO {
	private int id; // 학번
	private String name; // 이름
	private String phoneNumber; // 전화 번호
	private String memo; // 메모
	
	//Student 의 생성자
	public StudentDTO() {}
	public StudentDTO(int id) {
		// 학번을 매개 변수로 받아서 현재 학생의 학번을 설정
		this.id = id;
	}
	
	// getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}
