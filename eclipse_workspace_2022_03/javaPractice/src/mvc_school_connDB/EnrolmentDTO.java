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
	private int id; // 학번
	private int classCode; // 수강신청 과목
	private int score; // 성적

	//학생이 듣고있는 수업을 정보 (자바, 파이썬, C)
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
