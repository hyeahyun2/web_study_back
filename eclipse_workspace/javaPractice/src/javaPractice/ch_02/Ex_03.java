package javaPractice.ch_02;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 10�� �ڸ� ���ϴ� ������ �ڵ�
		 * 		������ value�� ���� 356�̶�� 300�� ���� �� �ֵ���
		 * 2. ��� �����ڸ����
		 * */
		
		int value = 103889;
//		int num = value - value%100;
//		int num2 = (value / 100) * 100;
		System.out.println(value - (value % 100));
	}
}
