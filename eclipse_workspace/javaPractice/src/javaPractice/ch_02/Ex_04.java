package javaPractice.ch_02;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. �� ���� ���� �Է¹ޱ�
		 * 2. ������ ��, ��, ��, ��� ���ϱ�
		 * 3. �� ���� ���Ͽ� �� ū ��/���� �� ����� ȭ�鿡 ����ϱ�
		 * 		(ū ���� ���� ���� ���� ���� ���ǿ�����(���׿�����) ����ϱ�)
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("�� ���� �� : " + sum);
		System.out.println("�� ���� �� : " + (num1 - num2));
		System.out.println("�� ���� �� : " + (num1 * num2));
		System.out.println("�� ���� ��� : " + ((double)sum / 2));
		
//		int big = num1 < num2 ? num2 : num1;
//		int small = num1 < num2 ? num1 : num2;
//		System.out.println("ū �� :" + big);
//		System.out.println("���� �� :" + small);
		System.out.println(num1 < num2 ? "ū �� : " + num2 + "\n���� �� : " + num1 :  "ū �� : " + num1 + "\n���� �� : " + num2);
	}
}
