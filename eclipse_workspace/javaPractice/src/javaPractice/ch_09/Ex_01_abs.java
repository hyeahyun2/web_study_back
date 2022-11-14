package javaPractice.ch_09;

public class Ex_01_abs {
	// abs() 메소드 활용
	private static int abs(int value) {
		return (value < 0)? -value : value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value + "의 절대값 : " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값 : " + abs(value));
	}
}
