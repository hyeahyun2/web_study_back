package javaPractice.ch_04;

public class WhileFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for��
		int num = 0;
		int sum = 0;
		for(num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		// while������ ����
		num = 1;
		sum = 0;
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
	}
}
