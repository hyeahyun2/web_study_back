package javaPractice.ch_05;

import java.util.Arrays;

public class RandomLotto2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ζ� ��ȣ ���ϱ�
		 * 1~45������ ������ �� ���ϱ�
		 * �ߺ� üũ
		 * */
		int range = 6;
		int[] numbers = new int[range];
		
		while(range>0) {
			int num = (int)(Math.random()*45)+1; // 1~45
			// �ߺ�üũ
			boolean result = true;
			for(int i=numbers.length-1; i >= range; i--) {
				if(num == numbers[i]) {
					result = false;
				}
			}
			if(result) { //numbers[0]~ [5]
				numbers[range-1] = num;
				range--;
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
