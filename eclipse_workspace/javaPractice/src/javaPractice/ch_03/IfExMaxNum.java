package javaPractice.ch_03;

import java.util.Scanner;

public class IfExMaxNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("�ּҰ��� " +  min + "�Դϴ�.");
		
		if(max == min) {
			System.out.println("��� ���� ���ƿ�");
		}
		stdIn.close();
	}
}
