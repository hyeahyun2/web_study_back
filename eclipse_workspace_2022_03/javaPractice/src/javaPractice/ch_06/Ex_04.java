package javaPractice.ch_06;

import java.util.Random;
import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���α׷��� ������ �ִ� ������ ����ڰ� �˾Ƹ����� ����
		 * 1. 1���� 1000 ������ ���� ���� ����
		 * 2. ����ڰ� ���� �����Ͽ� �Է�
		 * 3. ������ �ƴ� ���, ������ �Է��� ������ ū��/������ �˷��ֱ�
		 * 4. ������ ���, ���� �޼��� �� �õ� Ƚ�� ���
		 * */
		Random random = new Random();
		int answer = random.nextInt(999) + 1;
//		System.out.println(answer);
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("������ �����Ͽ� ������ : ");
			int inputNum = scanner.nextInt();
			count ++;
			if(inputNum > answer) {
				System.out.println("������ ������ ���亸�� �����ϴ�");
			}
			else if(inputNum < answer) {
				System.out.println("������ ������ ���亸�� �����ϴ�");
			}
			else {
				System.out.println("�����մϴ�! �����Դϴ�!");
				break;
			}
		}
		System.out.println("������ " + answer);
		System.out.println("�õ�Ƚ�� : " + count);
		scanner.close();
	}
}
