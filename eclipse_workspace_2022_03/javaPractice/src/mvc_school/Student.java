package mvc_school;

public class Student extends Person {
	private int studentNumber;
	//�л��� ����ִ� ������ ���� (�ڹ�, ���̽�, C)
	private static String[] className = {"JAVA", "PYTHON", "C"};
	private boolean[] classCheck = new boolean[className.length]; // ������û->true
	private int[] classScore = new int[className.length]; // �� ���� ����
	
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
	public static String[] getClassName() {
		return className;
	}
	// setClassName ����
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
