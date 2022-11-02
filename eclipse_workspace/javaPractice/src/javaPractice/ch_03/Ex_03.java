package javaPractice.ch_03;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. for문 이용
		 * 2. 1 ~ 100까지 정수 중 3의 배수의 총합 구하기
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
		System.out.println("3의 배수의 총 합 : " + sum);
	}
}
