package javaPractice.ch_08;

public class RefCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� (���� ����)
		int a = 1;
		int b = a;
		b++;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// ���� ���� (���� ����)
		int[] nums_01 = new int[1];
		nums_01[0] = 1;
		
		int[] nums_02 = nums_01;
		nums_02[0] = 2;
		System.out.println("nums_01[0] : " + nums_01[0]);
		System.out.println("nums_02[0] : " + nums_02[0]);
	}
}
