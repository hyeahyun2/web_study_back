package javaPractice.ch_05;

import java.util.Arrays;

public class RandomLotto2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 로또 번호 구하기
		 * 1~45까지의 임의의 수 구하기
		 * 중복 체크
		 * */
		int range = 6;
		int[] numbers = new int[range];
		
		while(range>0) {
			int num = (int)(Math.random()*45)+1; // 1~45
			// 중복체크
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
