package javaPractice.ch_10;

class MyStudent {
	String name;
	int grade;
	int kor;
	int eng;
	int math;
	
	void printStudent() {
		System.out.println(name + "�� " + grade + "�г��̰�, ���� ������ " + kor + "�� �Դϴ�.");
	}
}

public class Class_Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStudent Student1 = new MyStudent();
		System.out.println(Student1.name);
		Student1.name = "��ö��";
		Student1.grade = 2;
		Student1.kor = 100;
		Student1.eng = 90;
		Student1.math = 88;

		MyStudent Student2 = new MyStudent();
		Student2.name = "�ڿ���";
		Student2.grade = 1;
		Student2.kor = 90;
		Student2.eng = 70;
		Student2.math = 90;
		
		Student1.printStudent();
		Student2.printStudent();
	}
	

}
