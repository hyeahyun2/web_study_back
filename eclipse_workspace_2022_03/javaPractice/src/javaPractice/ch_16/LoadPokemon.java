package javaPractice.ch_16;
abstract class Pokemon {
	String name;
	
	abstract void attack(); // 공격 추상 메서드
	abstract void sound(); // 소리 추상 메서드
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon {
	Pikachu(){ // 이름 지정
		this.name = "피카츄";
	}
	void attack() { // 구체적으로 구현
		System.out.println("전기 공력");
	}
	void sound() {
		System.out.println("피카피카!");
	}
}
public class LoadPokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
