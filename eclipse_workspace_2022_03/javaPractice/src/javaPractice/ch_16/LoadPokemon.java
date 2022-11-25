package javaPractice.ch_16;
abstract class Pokemon {
	String name;
	
	abstract void attack(); // ���� �߻� �޼���
	abstract void sound(); // �Ҹ� �߻� �޼���
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon {
	Pikachu(){ // �̸� ����
		this.name = "��ī��";
	}
	void attack() { // ��ü������ ����
		System.out.println("���� ����");
	}
	void sound() {
		System.out.println("��ī��ī!");
	}
}
class Squirtle extends Pokemon {
	Squirtle(){
		this.name = "���α�";
	}
	void attack() {
		System.out.println("�� ����");
	}
	void sound() {
		System.out.println("���� ����!");
	}
}
public class LoadPokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu pikachu1 = new Pikachu();
		System.out.println("�� ���ϸ��� " + pikachu1.getName());
		pikachu1.attack();
		pikachu1.sound();
		
		Squirtle squirtle1 = new Squirtle();
		System.out.println("�� ���ϸ��� " + squirtle1.getName());
		squirtle1.attack();
		squirtle1.sound();
	}
}
