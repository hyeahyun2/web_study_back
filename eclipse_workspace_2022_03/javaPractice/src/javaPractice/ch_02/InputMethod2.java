package javaPractice.ch_02;

import java.util.Scanner;

public class InputMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner.nextLine() : ���ڿ� �Է�
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = sc.nextInt();
		
		System.out.println(name + "�� �ȳ��ϼ���!" + age + "�� �̽ó׿�!");
	}

}
