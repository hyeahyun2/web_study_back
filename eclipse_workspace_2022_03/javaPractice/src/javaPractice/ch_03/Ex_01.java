package javaPractice.ch_03;

import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. ����ڿ��� ���� �Է¹޾Ƽ�
		 * 2. ��� / 0 / ���� �Ǻ��ؼ� 
		 * 3. �˷��ֱ�
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println("�Է��Ͻ� " + num + "�� ����Դϴ�");
		}
		else if (num < 0) {
			System.out.println("�Է��Ͻ� " + num + "�� �����Դϴ�");
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ�" + num + "�Դϴ�");
		}
		input.close();
	}
}
