package javaPractice.ch_25;

import java.util.Stack;

// Stack�� �̿��� �������̽�
class Coin { // ���� ���̽��� ������ Ŭ����
	private int value;

	public Coin(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
public class StackEx2 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ������ ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) { // ���� ���̽��� ������� Ȯ��
			Coin coin = coinBox.pop(); // ���� ���̽����� ���� ���� ������ ����
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}

}
