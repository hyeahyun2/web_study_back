package javaPractice.ch_17;
abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	
	public abstract void bark();
	public abstract String toString();
	
	public void introduce() { 
		// �Ϲ� �޼ҵ忡 �߻�޼ҵ� ��� ����
		System.out.println(toString() + "�Դϴ�. ");
		bark();
	}
}
class Cat extends Animal {
	private int age; // ����

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	public void bark() {
		System.out.println("�߿�!!");
	}
	public String toString() {
		return age + "����" + getName();
	}
}
class Dog extends Animal {
	private String type; // ����

	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	public void bark() {
		System.out.println("�۸�!!");
	}
	public String toString() {
		return type + "��" + getName();
	}
}

public class LoadAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] anmimals = {
				new Dog("�ٵ���", "��찳"),
				new Cat("�Ʒ���", 7),
				new Dog("���", "������")
		};
		for(Animal animal : anmimals) {
			animal.introduce();
			System.out.println();
		}
	}
}
