package javaPractice.ch_03;

import java.util.Scanner;

public class IfElseIfEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� >>>>");
		int age;
		// ���1. �Է°� int������ �ٷ� �ޱ�
		age = input.nextInt();
		// ���2. �Է°� String������ �޾� int�� ����ȯ
//		String tmp;
//		tmp = input.nextLine();
//		age = Integer.parseInt(tmp);
		
		if (age < 9) { // 8 ����
			System.out.println("�����Դϴ�.");
			System.out.println("���ƿ���� ����˴ϴ�.");
		}
		else if (age < 14) { // 9 ~ 13
			System.out.println("�Ƶ��Դϴ�.");
			System.out.println("�Ƶ������ ����˴ϴ�.");
		}
		else if (age < 20) { // 14 ~ 19
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("û�ҳ����� ����˴ϴ�.");
		}
		else { // 20 �̻�
			System.out.println("�����Դϴ�.");
			System.out.println("���ο���� ����˴ϴ�.");
		}
		System.out.println("������ �������ּ���.");
		input.close();
	}
}
