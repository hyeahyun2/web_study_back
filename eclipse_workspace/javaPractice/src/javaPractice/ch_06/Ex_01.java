package javaPractice.ch_06;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 10000;
		System.out.println("���� ���� ���� " + money + "���Դϴ�.");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�󸶸� ����Ͻðڽ��ϱ�>>> ");
			int spendMoney = scanner.nextInt();
			
			if(!(spendMoney > 0 && spendMoney <= money)) {
				System.out.println("�ٽ� �Է����ּ���(�������� Ʋ�Ƚ��ϴ�.)");
				continue;
			}
			
			money -= spendMoney;
			System.out.println("���� " + money + "���� ���ҽ��ϴ�.");
			
			if(money == 0) {
				break;
			}
		}
		System.out.println("��� ���� ����߽��ϴ�. ���α׷��� ����˴ϴ�.");
		scanner.close();
	}
}
