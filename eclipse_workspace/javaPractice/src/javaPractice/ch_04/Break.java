package javaPractice.ch_04;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ݺ��� while���� ������������
		// break ����ؼ�
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) {
			System.out.print("���� ���ڸ� �Է��ϼ���(�����Ϸ��� 0 �Է�) : ");
			num = scanner.nextInt();
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("�Է��Ͻ� ������ �� �� : " + sum);
		scanner.close();
	}
}
