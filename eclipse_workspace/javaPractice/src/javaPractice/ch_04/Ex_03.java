package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. while, break�� ���
		 * 2. �ݺ������� ���� ��� �Է¹ޱ�
		 * 3. ���� ���� �Է½� break�� ���� �ݺ� ���� ����
		 * 4. �Է��� �������� ��� ���ϱ�
		 * */
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(true) {
			System.out.print("������ �Է��ϼ���(�����Է½� ����) : ");
			int score = scanner.nextInt();
			if(score < 0) {
				break;
			}
			sum += score;
			count++;
		}
		System.out.println("�Է��� ������ ��� : " + (double)sum/count);
		scanner.close();
	}
}
