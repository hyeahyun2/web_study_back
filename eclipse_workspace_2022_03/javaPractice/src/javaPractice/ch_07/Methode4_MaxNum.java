package javaPractice.ch_07;

import java.util.Scanner;

public class Methode4_MaxNum {
	static int max(int a, int b) {
		System.out.println("�Լ� ����");
		if(a>b) return a;
		else return b;
//		System.out.println("�Լ� ��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		
		System.out.println("�ִ밪 : " + max(a, b));
	}
}
