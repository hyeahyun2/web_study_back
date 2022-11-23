package javaPrcatice.ch_13;
class Student {
	String name;
	private String rollno;
	int age;
	Student(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학번 : " + rollno);
		System.out.println("학생의 나이 : " + age);
		System.out.println("Student 객체가 생성되었습니다.");
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Kim", "0001", 20);
		
	}

}
