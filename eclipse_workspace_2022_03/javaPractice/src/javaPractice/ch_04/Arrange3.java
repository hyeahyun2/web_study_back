package javaPractice.ch_04;

import java.util.Arrays;

public class Arrange3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {10, 20, 4, 25, 18};
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		
		// for������ �迭 �ʱ�ȭ
		int[] c = new int[10];
		for(int i=0; i<c.length; i++) {
			c[i] = i;
		}
		// for���� �̿��� ���
		System.out.println(c.length);
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		
		//for-each��
		System.out.println();
		for(int d:c) { // d: �迭 ��Ұ�, c : �迭��
			System.out.print(d);
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
	}
}