package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_02_Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����=1, ����=2, ��=3
		 * �迭 ���� = 5, 1~3 ������ ���� �ʱ�ȭ
		 * ���� ���� �� �迭�� ��ǻ�Ͱ� ������ ���������� ������ �Է�
		 * ���� �� 5ȸ ����
		 * Ű����� 1, 2, 3�� �ϳ� �Է�
		 * ��ǻ�� �迭 ���� �ε��� ��ȣ 0���� ~ ���ʴ��
		 * ��ǻ�Ϳ� �Է°� ���ؼ� ���� �̰���� ���
		 * ��� ��� Ƚ���� �߰� x
		 * �ݺ��� ���� �� ���� ���(���� �̰����) ���
		 * */
		int[] computer = new int[5];
		String[] game = {"����", "����", "��"};
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<computer.length; i++) {
			computer[i] = (int)(Math.random()*3)+1;
		}
//		System.out.println(Arrays.toString(computer));
		int userWin = 0;
		int compWin = 0;
		for(int i=0; i<computer.length; i++) {
			System.out.print(i+1 + "��° �Դϴ�. ����(1), ����(2), ��(3)�� �ϳ��� �Է����ּ��� : ");
			int user = scanner.nextInt();
			System.out.print(game[user-1] + "�Է��߰�, ��ǻ�ʹ� " + game[computer[i]-1] + "�Դϴ�. ");
			if(user % 3 == (computer[i] + 1) % 3) {
				System.out.println("�̰���ϴ�.");
				userWin ++;
			}
			else if(user % 3 == (computer[i] - 1) % 3) {
				System.out.println("�����ϴ�.");
				compWin ++;
			}
			else if(user % 3 == computer[i] % 3){
				System.out.println("�����ϴ�.");
				i--;
			}
		}
		System.out.println("������ ����Ǿ����ϴ�.");
		System.out.println("����� �� : " + userWin + ", ��ǻ�� �� : " + compWin);
		
	}
}
