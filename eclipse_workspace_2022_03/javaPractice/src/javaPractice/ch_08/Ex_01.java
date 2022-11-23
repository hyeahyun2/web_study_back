package javaPractice.ch_08;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 10;
		System.out.println("밑변이 " + a + ", 높이가 " + b + "인 사각형의 넓이 : " + calculator(a, b));
	}
	public static int calculator(int a, int b) {
		System.out.println("<계산을 시작합니다.");
		int area = a * b;
		return area;
	}

}
