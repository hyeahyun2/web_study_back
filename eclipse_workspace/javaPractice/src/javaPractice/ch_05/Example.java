package javaPractice.ch_05;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������ / �ڷ��� ����ϱ�
		
		Scanner scanner = new Scanner(System.in);
		// ���� �ܾ�(�ʱⰪ) : 10000��
		int money = 10000;
		// �Ա� �ޱ�
		System.out.println("�Ա� �ݾ��� �Է����ֽʽÿ�.");
		int deposit = scanner.nextInt(); // �Ա� �ݾ� ����
		// �Ա� �� ���� �ܾ�
		money += deposit;
		System.out.println("�Ա��Ͻ� �ݾ��� " + deposit + "���̰� �ܾ��� " + money +"���Դϴ�.");
		// ��� �ݾ� �Է� �ޱ�(�ܾ� 0�� �� �� ���� ���)
		while(true) {
			System.out.println("��ݱݾ��� �Է����ֽʽÿ�");
			int withdraw = scanner.nextInt(); // ��� �ݾ�
			// 0�� �Էµ� ���
			if(withdraw == 0) {
				System.out.println("0���� �Է��ϼ̽��ϴ�. Ȯ���Ͻð� �ٽ� �Է����ֽʽÿ�.");
				continue;
			}
			// ��� �ý���
			if(withdraw > money) { // �Է� �ݾ� > �ܾ�
				System.out.println("�ܾ��� " + money + "���ε� ��ݾ� " + withdraw + "���� �� Ŀ�� ����� �ȵ˴ϴ�.");
			}
			else { // �Է� �ݾ� <= �ܾ�
				money -= withdraw;
				System.out.println(withdraw + "���� ���ó���߰� �ܾ��� " + money + "���Դϴ�.");
			}
			// �ܾ� = 0�� -> ���α׷� ����
			if(money == 0) {
				System.out.println("�ܾ��� 0���̾ �ŷ��� ����˴ϴ�. �����մϴ�.");
				break;
			}
		}
	}
}
