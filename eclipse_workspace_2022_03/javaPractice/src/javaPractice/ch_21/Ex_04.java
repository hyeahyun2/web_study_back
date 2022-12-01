package javaPractice.ch_21;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	/* 예외 던지기 예 */
	// 이미 존재하는 예외클래스를 이용해서 나한테 맞는 조건 만들어 사용하기
	public void input() throws IndexOutOfBoundsException { 
		System.out.print("국어 점수 = ");
		kor = in.nextInt();
		if(kor < 0 || kor > 100) {
			throw new IndexOutOfBoundsException("0~100점만 입력 가능");
		}
	}
	public void output() {
		System.out.println("국어 점수는 " + kor + "점 입니다.");
	}
}

public class Ex_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionOccur exceptionOccur = new ExceptionOccur();
		try {
			exceptionOccur.input();
			exceptionOccur.output();
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("0~100점만 입력 가능");
		}
	}
}
