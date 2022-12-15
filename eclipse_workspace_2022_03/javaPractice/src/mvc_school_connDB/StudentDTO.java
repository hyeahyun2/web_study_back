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
	private int id; // �й�
	private String name; // �̸�
	private String phoneNumber; // ��ȭ ��ȣ
	private String memo; // �޸�
	
	//Student �� ������
	public StudentDTO() {}
	public StudentDTO(int id) {
		// �й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� ����
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
