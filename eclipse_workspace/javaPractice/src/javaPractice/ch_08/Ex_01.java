package javaPractice.ch_08;

public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 10;
		System.out.println("�غ��� " + a + ", ���̰� " + b + "�� �簢���� ���� : " + calculator(a, b));
	}
	public static int calculator(int a, int b) {
		System.out.println("<����� �����մϴ�.");
		int area = a * b;
		return area;
	}

}
