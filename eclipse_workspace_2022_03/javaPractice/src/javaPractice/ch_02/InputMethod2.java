package javaPractice.ch_02;

import java.util.Scanner;

public class InputMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner.nextLine() : 문자열 입력
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		
		System.out.println(name + "님 안녕하세요!" + age + "살 이시네요!");
	}

}
