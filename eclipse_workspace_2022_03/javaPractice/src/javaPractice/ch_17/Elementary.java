package javaPractice.ch_17;

public class Elementary extends Student {
	
	public Elementary(String name, int grade) {
		System.out.println("Elementary ������ ȣ��");
		super.name = name;
		super.grade = grade;
	}
	public Elementary() {
		this("�̼���", 3);
		System.out.println("Elementary ������ ȣ��");
	}
	public Elementary(String name, int grade, String teacher) {
		this(name, grade);
		super.teacher = teacher;
	}
	
	public String getTeacher() {
		return "��� ������ : " + teacher;
	}
}

class University extends Student {
	private int courses; //  ��û ����
	
	public University(String name, int grade, int courses) {
		System.out.println("University ������ ȣ��");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	public University(String name, int grade, int courses, String teacher) {
		this(name, grade, courses);
		super.teacher = teacher;
	}
	public University() {
		this("�̼���", 2, 20);
	}
	
	public int getCourses() {
		return courses;
	}
	
	//overriding �޼ҵ�
	public String getStudInfo() {
		System.out.println("University Ŭ������ getStudInfo �޼ҵ� ȣ��");
		return "�̸��� >> " + name + ", �г��� >> " + grade + ", ��û������ >> " + courses;
	}
	
	// �������� �̸�
	public String getTeacher() {
		return "��� ������ : " + teacher;
	}
}