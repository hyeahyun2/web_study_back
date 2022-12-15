package mvc_school_connDB;

/*
CREATE TABLE enrolment (
id INT NOT null,
classCode INT NOT null,
score INT DEFAULT 0,
CONSTRAINT ID_FK FOREIGN KEY(id) REFERENCES student(id),
CONSTRAINT CODE_FK FOREIGN KEY(classCode) REFERENCES classList(classCode)
);
*/
public class EnrolmentDTO {
	private int id; // �й�
	private int classCode; // ������û ����
	private int score; // ����

	//�л��� ����ִ� ������ ���� (�ڹ�, ���̽�, C)
	// getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassCode() {
		return classCode;
	}
	public void setClassCode(int classCode) {
		this.classCode = classCode;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
