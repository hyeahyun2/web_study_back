package javaPractice.ch_21;

import java.util.Scanner;

class ExceptionOccur {
	private static final Scanner in = new Scanner(System.in);
	private int kor;
	
	/* ���� ������ �� */
	// �̹� �����ϴ� ����Ŭ������ �̿��ؼ� ������ �´� ���� ����� ����ϱ�
	public void input() throws IndexOutOfBoundsException { 
		System.out.print("���� ���� = ");
		kor = in.nextInt();
		if(kor < 0 || kor > 100) {
			throw new IndexOutOfBoundsException("0~100���� �Է� ����");
		}
	}
	public void output() {
		System.out.println("���� ������ " + kor + "�� �Դϴ�.");
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
			System.out.println("0~100���� �Է� ����");
		}
	}
}
