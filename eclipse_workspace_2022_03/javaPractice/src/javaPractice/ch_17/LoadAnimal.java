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
		// 일반 메소드에 추상메소드 사용 가능
		System.out.println(toString() + "입니다. ");
		bark();
	}
}
class Cat extends Animal {
	private int age; // 나이

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	public void bark() {
		System.out.println("야옹!!");
	}
	public String toString() {
		return age + "살인" + getName();
	}
}
class Dog extends Animal {
	private String type; // 견종

	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	public void bark() {
		System.out.println("멍멍!!");
	}
	public String toString() {
		return type + "인" + getName();
	}
}

public class LoadAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] anmimals = {
				new Dog("바둑이", "삽살개"),
				new Cat("아롱이", 7),
				new Dog("백두", "진돗개")
		};
		for(Animal animal : anmimals) {
			animal.introduce();
			System.out.println();
		}
	}
}
