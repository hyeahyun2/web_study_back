package javaPractice.ch_17;

abstract public class Student {
	public String name;
	public int grade;
	public String teacher;
	
	public Student() {
		System.out.println("Student 생성자 호출");
	}

	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드 호출");
		
		return "이름은 : " + name + ", 학년은" + grade;
	}
	// 학생의 담임선생님 이름
	abstract public String getTeacher();
}
