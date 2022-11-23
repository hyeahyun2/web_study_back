package javaPractice.ch_02;

public class Ex_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. 10의 자리 이하는 버리는 코드
		 * 		변수의 value의 값이 356이라면 300이 나올 수 있도록
		 * 2. 산술 연산자만사용
		 * */
		
		int value = 103889;
//		int num = value - value%100;
//		int num2 = (value / 100) * 100;
		System.out.println(value - (value % 100));
	}
}
