package javaPractice.ch_15;
class Animal2 {
	void breath() {
		System.out.println("숨쉬기");
	}
}
class Lion extends Animal2 {
	@Override
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal2 {
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal2 {
	public String toString() {
		return "원숭이";
	}
}

class Zookeeper {
	void feed(Animal2 animal) {
		System.out.println(animal + "에게 고기 주기");
	}
}

public class ODT2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 lion1 = new Lion();
		Zookeeper james = new Zookeeper();
		james.feed(lion1);
		
		Animal2 rabbit1 = new Rabbit();
		james.feed(rabbit1);

		Animal2 monkey1 = new Monkey();
		james.feed(monkey1);
	}
}
