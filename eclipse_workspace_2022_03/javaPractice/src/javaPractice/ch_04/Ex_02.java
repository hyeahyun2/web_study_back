package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* do while�� ����Ͽ� ����ؼ� ���� ��ȣ �Է¹޴� ���α׷� �ۼ�
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��� �� ���� ��� �ݺ�
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ��
		 * */
		Scanner scanner = new Scanner(System.in);
		int month;
		do {
			System.out.println("�ùٸ� ���� �Է��ϼ��� [1~12]");
			month = scanner.nextInt();
		} while(month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month + "�Դϴ�.");
		scanner.close();
	}
}
