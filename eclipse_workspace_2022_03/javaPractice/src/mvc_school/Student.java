package mvc_school;

public class Student extends Person {
	private int studentNumber;
	//학생이 듣고있는 수업을 정보 (자바, 파이썬, C)
	private static String[] className = {"JAVA", "PYTHON", "C"};
	private boolean[] classCheck = new boolean[className.length]; // 수강신청->true
	private int[] classScore = new int[className.length]; // 각 과목 성적
	
	//Student 의 생성자
	public Student(int studentNumber) {
		// 학번을 매개 변수로 받아서 현재 학생의 학번을 설정
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
	// setClassName 없음
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
