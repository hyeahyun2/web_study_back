package javaPractice.ch_07;

import java.util.Arrays;
import java.util.Random;

public class Ex_01_RandomTeam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �������� �����ϱ�
		 * �� ���� �ο��� 3��
		 * */
		String[] students = { // �� 27��
				"���ȯ", "������", "������", "������", "������",
				"�ڱ���", "�ڼ���", "�ڼ���", "������", "������",
				"���", "���ϴ�", "�ſ�ȭ", "������", "������",
				"������", "������", "���¹�", "�̱���", "�̼�ȣ",
				"�̽���", "�̿���", "����", "������", "�ֹμ�",
				"������", "Ȳ����"};
//		String student = students[0];
		String[][] team = new String[9][3];
		Random random = new Random();
		int range = 9;
		int range2 = 3;
		while(range > 0 && range2 > 0) {
			int randomNum = random.nextInt(students.length);
//			System.out.println(randomNum);
			boolean state = true;
			// �ߺ�üũ
			for(int i=0; i<9; i++) {
				for(int j=0; j<3; j++) {
					if(students[randomNum] == team[i][j]) {
						state = false;
					}
				}
			}
			
			// �ߺ� ���� ��
			if(state == true) {
				team[range-1][range2-1] = students[randomNum];
				range2 --;
				if(range2 == 0 && range != 0) {
					range2 = 3;
					range --;
				}
			}
		}
		for(int i=0; i<team.length; i++) {
			System.out.println(Arrays.toString(team[i]));
		}
	}
}
