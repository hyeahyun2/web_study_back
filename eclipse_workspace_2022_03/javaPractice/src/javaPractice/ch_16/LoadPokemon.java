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
class Squirtle extends Pokemon {
	Squirtle(){
		this.name = "꼬부기";
	}
	void attack() {
		System.out.println("물 공격");
	}
	void sound() {
		System.out.println("꼬북 꼬북!");
	}
}
public class LoadPokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pikachu1 = new Pikachu();
		System.out.println("이 포켓몬은 " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("이 포켓몬은 " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}
}
