package javaPractice.ch_03;

import java.util.Scanner;

public class IfElseIfEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ǥ���մϴ�.\n�� �� �Դϱ�? :");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println(month + "���� ���Դϴ�");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "���� �ܿ��Դϴ�");
		}
		else {
			System.out.println(month + "��(��) �߸��� �Է� ���Դϴ�.");
		}
		stdIn.close();
	}
}
