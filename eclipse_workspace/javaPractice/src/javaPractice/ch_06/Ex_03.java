package javaPractice.ch_06;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	������ �Էµ� ������,
		 *  ����ڰ� �Է��� ������ �հ踦 ����Ͽ� ����ϴ� ���α׷�
		 *  while���� ���, break�� ������� �� ��
		 * */
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		while(num >= 0) {
			sum += num;
			System.out.print("���� ������ �Է��ϼ��� : ");
			num = scanner.nextInt();
		}
		System.out.println("�� �Է¹��� ���� �հ� : " + sum);
	}
}
