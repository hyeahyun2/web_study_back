package javaPractice.ch_03;

public class MultiFor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 for문
		for(int i = 2; i <= 9; i++) {
			System.out.println("---- " + i + "단 입니다 ----");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j );
			}
			System.out.println();
		}
	}
}
