package javaPractice.ch_08;

public class MethodEx2 {
	public void print(int a) {
		// �Ű� ������ �ִ� �޼���
		// �Ű� ������ �޼��� ȣ��� �޸𸮿� �����ǰ�, ȣ�� �� ���ͽ� �Ҹ�
		System.out.println("����� : " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 22;
		int result = 0;
		
		MethodEx2 method = new MethodEx2();
		method.print(10);
		method.print(b);
		method.print(result);
	}
}
