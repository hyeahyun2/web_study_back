package javaPractice.ch_02;

import java.util.Scanner;

public class InputMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ� : ");
		x = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ� : ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum);
//		sc.close();
	}
}
