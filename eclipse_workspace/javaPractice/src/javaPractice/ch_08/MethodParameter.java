package javaPractice.ch_08;

public class MethodParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreet(); // [1��] ����
		printGreet("�ȳ�~!"); // [2��] ����
		printGreet("�Ѽ�", "�� �����̳���?"); // [3��] ����
		printGreet(3); // [4��] ����
	}
	public static void printGreet() { // [1��]
		System.out.println("printGreet() �޼��尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���");
	}
	public static void printGreet(String greeting) { // [2��]
		System.out.println("printGreet(String greeting) �޼��尡 ����˴ϴ�.");
		System.out.println(greeting);
	}
	public static void printGreet(String name, String greeting) { // [3��]
		System.out.println("printGreet(String name, String greeting) �޼��尡 ����˴ϴ�.");
		System.out.println(name + "��! " + greeting);
	}
	public static void printGreet(int cnt) { // [4��]
		System.out.println("printGreet(int cnt) �޼��尡 ����˴ϴ�.");
		System.out.println("�ȳ��ϼ���. " + cnt + "��° ���°ų׿�.");
	}
}
