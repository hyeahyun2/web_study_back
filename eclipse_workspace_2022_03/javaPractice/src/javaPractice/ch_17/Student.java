package javaPractice.ch_17;

abstract public class Student {
	public String name;
	public int grade;
	public String teacher;
	
	public Student() {
		System.out.println("Student ������ ȣ��");
	}

	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	public String getStudInfo() {
		System.out.println("Student Ŭ������ getStudInfo() �޼ҵ� ȣ��");
		
		return "�̸��� : " + name + ", �г���" + grade;
	}
	// �л��� ���Ӽ����� �̸�
	abstract public String getTeacher();
}
