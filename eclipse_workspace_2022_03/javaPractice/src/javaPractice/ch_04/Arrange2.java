package javaPractice.ch_04;

import java.util.Scanner;

public class Arrange2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[4];
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ��� : ");
			a[i] = scanner.nextInt();
			sum += a[i];
		}
		System.out.println("�հ� : " + sum);
		scanner.close();
	}
}
