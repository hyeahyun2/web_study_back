package javaPrcatice.ch_13;
class Student {
	String name;
	private String rollno;
	int age;
	Student(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� �й� : " + rollno);
		System.out.println("�л��� ���� : " + age);
		System.out.println("Student ��ü�� �����Ǿ����ϴ�.");
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Kim", "0001", 20);
		
	}

}
