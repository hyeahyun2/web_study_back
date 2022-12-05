package javaPractice.ch_23;
/* Class Ŭ����
 * �ڹ��� ��� Ŭ������ �������̽��� ������ �ǰ����� class ���Ϸ� ������.
 * java ������ �����ϵǸ� class ������ �����ǰ�, 
 * �� class ���Ͽ��� Ŭ������ �������̽��� ���� ����, �޼���, ������ ���� ������ �������.
 * Class Ŭ������ �����ϵ� class ���Ͽ� ����� Ŭ������ �������̽��� ������ �������� �� ���.
 * 
 * ��Ȳ�� ���� ���� �۾����� ���� Ŭ������ ����ؾ� �� ���� �ְ�,
 * ��ȯ �޴� Ŭ������ ��Ȯ�� � �ڷ������� �𸣴� ��찡 ����.
 * �𸣴� Ŭ������ ������ ����� ��쿡�� �츮�� Ŭ������ ������ ���� ã�ƾ� ��.
 * */
class Person {
	private String name;
	private int age;
	
	public Person() {} // ����Ʈ ������

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Classclass {
	public static void main(String[] args) throws ClassNotFoundException {
		/* forName() �޼��忡�� �߻��ϴ� ���ܸ� ó����.
		 * �̸��� ��ġ�ϴ� Ŭ������ ���� ��� ClassNotFoundExcetpion �߻�.
		 * */
		/* Class Ŭ������ �����ϰ� Ŭ���� ������ �������� ����� 3����.
		 * 1. Object Ŭ������ getClass() �޼��� ����ϱ�
		 * String s = new String();
		 * Class c = s.getClass(); // getClass() �޼����� ��ȯ���� Class
		 * 
		 * 2. Ŭ���� ���� �̸��� Class ������ ���� �����ϱ�
		 * Class c = String.Class;
		 * 
		 * 3. Class.forName("Ŭ���� �̸�") �޼��� ����ϱ�.
		 * Class c = Class.forName("java.lang.String");
		 * */
		Person person = new Person();
		Class pClass1 = person.getClass(); // Object�� getClass() �޼��� ���
		System.out.println(pClass1.getName()); // javaPractice.ch_23.Person
		
		Class pClass2 = Person.class; // ���� class ���� �����ϱ�
		System.out.println(pClass2.getName()); // javaPractice.ch_23.Person
		
		// Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("javaPractice.ch_23.Person");
		System.out.println(pClass3.getName());

	}
}