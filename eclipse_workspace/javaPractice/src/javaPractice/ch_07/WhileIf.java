package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Scanner;

public class WhileIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �л� ���� �� �л����� ���� �Է¹޾�
		 * �ְ� ���� �� ��� ������ ���ϴ� ���α׷�
		 * */
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.print("���� > ");
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1) {
				System.out.print("�л� ���� �Է��ϼ��� : ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print(i + 1 + "��° �л��� ������ �Է��ϼ��� : ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println("��� �л��� ������ �ԷµǾ����ϴ�.");
			}
			else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println(i + 1 + "��° �л��� ���� : " + scores[i]);
				}
			}
			else if(selectNo == 4) { // �ְ�����, ������� ���ϱ�
				int maxNum = scores[0];
				int sumNum = scores[0];
				for(int i=1; i<studentNum; i++) {
					sumNum += scores[i];
					if(maxNum < scores[i]){
						maxNum = scores[i];
					}
				}
				System.out.println("�ְ����� : " + maxNum);
				System.out.println("������� : " + (double)sumNum/studentNum);
			}
			else if(selectNo == 5) {
				System.out.println("���α׷��� ����˴ϴ�.");
				run = false;
			}
		}
	}
}
