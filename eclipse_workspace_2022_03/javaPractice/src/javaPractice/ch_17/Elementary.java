package javaPractice.ch_17;

public class Elementary extends Student {
	
	public Elementary(String name, int grade) {
		System.out.println("Elementary 생성자 호출");
		super.name = name;
		super.grade = grade;
	}
	public Elementary() {
		this("이순신", 3);
		System.out.println("Elementary 생성자 호출");
	}
	public Elementary(String name, int grade, String teacher) {
		this(name, grade);
		super.teacher = teacher;
	}
	
	public String getTeacher() {
		return "담당 선생님 : " + teacher;
	}
}

class University extends Student {
	private int courses; //  신청 학점
	
	public University(String name, int grade, int courses) {
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	public University(String name, int grade, int courses, String teacher) {
		this(name, grade, courses);
		super.teacher = teacher;
	}
	public University() {
		this("이순신", 2, 20);
	}
	
	public int getCourses() {
		return courses;
	}
	
	//overriding 메소드
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은 >> " + name + ", 학년은 >> " + grade + ", 신청학점은 >> " + courses;
	}
	
	// 지도교수 이름
	public String getTeacher() {
		return "담당 교수님 : " + teacher;
	}
}