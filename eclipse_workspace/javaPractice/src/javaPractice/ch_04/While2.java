package javaPractice.ch_04;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String answer = "Y";
//		int count = 0;
//		
//		while(answer.equals("Y")) {
//			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
//			answer = scanner.nextLine();
//			
//			if(answer.equals("Y")) {
//				count++;
//				System.out.println("������ " + count + "�� ����߽��ϴ�.");
//			}
//		}
//		System.out.println("�������");
//		scanner.close();

		// for������ ����
		int count = 0;
		Scanner scanner2 = new Scanner(System.in);
		for(String answer = "Y"; answer.equals("Y") || answer.equals("y"); ) {
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y/y)");
			answer = scanner2.nextLine();
			if(answer.equals("Y") || answer.equals("y")) {
				count ++;
				System.out.println("������ " + count + "�� ����߽��ϴ�.");
			}
		}
		System.out.println("�������");
		scanner2.close();
	}
}
