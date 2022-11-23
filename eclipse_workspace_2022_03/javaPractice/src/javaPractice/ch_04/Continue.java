package javaPractice.ch_04;

public class Continue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
//		for(int i = 0; i <= 100; i++) {
//			if(i % 2 == 0) {
//				continue;
//			}
//			total += i;
//		}
		for(int i = 1; i <= 100; i += 2) {
			total += i;
		}
		System.out.println("1부터 100까지의 홀수의 합 : " + total);
	}
}
