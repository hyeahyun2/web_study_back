package javaPractice.ch_14;
class Person {
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}

class Student extends Person {
	void learn() {
		System.out.println("����");
	}
}
class Teacher extends Person {
	void teach() {
		System.out.println("����ġ��");
	}
}

public class ExtendClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.breath();
		s1.learn();
		s1.say();
		
		Teacher t1 = new Teacher();
		t1.eat();
		t1.teach();
		t1.say();
		
		Person person = new Person();
		person.breath();
		//person.learn(); // ����
	}

}
