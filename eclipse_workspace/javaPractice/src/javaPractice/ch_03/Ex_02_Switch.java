package javaPractice.ch_03;

import java.util.Scanner;

public class Ex_02_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. ����ڿ��� ���� �Է¹ޱ�
		 * 		�Է��� 0 ~ 100���� �Է��� �˴ϴ�
		 * 2. if�� ����ؼ� ������ ����ϴ� �ڵ�
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69 
		 * F : 0 ~ 59
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = input.nextInt();
		int score = (num / 10) * 10;
		
		switch(score) {
		case 100: case 90:
			System.out.println("A���� �Դϴ�.");
			break;
		case 80:
			System.out.println("B���� �Դϴ�.");
			break;
		case 70:
			System.out.println("C���� �Դϴ�.");
			break;
		case 60:
			System.out.println("D���� �Դϴ�.");
			break;
		default:
			System.out.println("F���� �Դϴ�.");
		}
		input.close();
	}

}
