package javaPractice.ch_21;

public class ExceptionEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // ���� �߻�
			System.out.println(4); // ���� x
		} catch(ArithmeticException ae) {
			// �������� ae�� ����, ������ ArithemticException �ν��Ͻ��� ���� ����
			ae.printStackTrace();
			System.out.println("���� �޼��� : " + ae.getMessage());
		} // try-catch�� ��
		System.out.println(6);
	}
}
