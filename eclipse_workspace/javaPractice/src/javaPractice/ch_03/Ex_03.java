package javaPractice.ch_03;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. for�� �̿�
		 * 2. 1 ~ 100���� ���� �� 3�� ����� ���� ���ϱ�
		 * */
		int sum = 0;
		for(int i = 3; i <= 100; i += 3) {
//			System.out.println(i);
			sum += i;
		}
//		for(int i = 1; i <= 100; i++) {
//			if(i%3==0) {
//				sum += i;
//			}
//		}
		System.out.println("3�� ����� �� �� : " + sum);
	}
}
