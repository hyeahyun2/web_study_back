package javaPractice.ch_04;

import java.util.Scanner;

public class Ex_01_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. do-while�� ����Ͽ�
		 * 2. ���� �Է¹ް�
		 * 3. �Է¹��� ������ �հ� ���ϱ�
		 * 4. ������ �ԷµǸ� while�� ����
		 * */
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num;
		do {
			System.out.print("������ �Է����ּ��� >>> ");
			num = input.nextInt();
			if(num >= 0) {
				sum += num;
			}
		} while(num >= 0);
		
		System.out.println("�Էµ� ������ �� : " + sum);
		input.close();
	}
}
