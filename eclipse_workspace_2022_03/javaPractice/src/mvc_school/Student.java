package mvc_school;

public class Student extends Person {
	private int studentNumber;
	//�л��� ����ִ� ������ ���� (�ڹ�, ���̽�, C)
	private boolean[] classCheck = {false, false, false}; // ������û->true
	private int[] classScore = {0, 0, 0}; // �� ���� ����
	
	//Student �� ������
	public Student(int studentNumber) {
		// �й��� �Ű� ������ �޾Ƽ� ���� �л��� �й��� ����
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public boolean[] getClassCheck() {
		return classCheck;
	}
	public void setClassCheck(int index, boolean check) {
		this.classCheck[index] = check;
	}
	public int[] getClassScore() {
		return classScore;
	}
	public void setClassScore(int index, int score) {
		this.classScore[index] = score;
	}
	
}
