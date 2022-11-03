package javaPractice.ch_04;

public class While3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 출력
		int i = 2;
		while(i <= 9) {
			System.out.println("**** " + i + "단 ****");
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
