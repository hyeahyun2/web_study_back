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
public class LoadPokemon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
