package javaPractice.ch_21;

public class ExceptionThrows {
	/* ���� ������� ���ܰ� �߻����� ��� ���� �޼��尡 ���ܸ� ó������ �ʰ�
	 * �ڽ���  ȣ���� ������ ���� ó���� ���� å���� �ѱ�� ��.
	 * ���� ������� ȣ���� ������ å���� �ѱ�� ������ ȣ���� �ʿ� ���� ������ �������� �߻�.
	 * ���ܸ� �Ѱܹ��� ����
	 * 1) �ݵ�� ���� ���� ó���� �ϰų� 2) �ڽŵ� ���ܸ� ������ ��
	 * */
	public static void methodA() throws Exception {
		methodB();
	}
	public static void methodB() throws Exception {
		methodC();
//		try { // ���� ���� ó���ϱ�
//			methodC();
//		} catch(Exception e) {
//			System.out.println("methodB���� ó��");
//		}
	}
	public static void methodC() throws Exception { // throws�� ���� ������
		Exception e = new Exception();
		throw e; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA();
		} catch(Exception e) {
			System.out.println("���ο��� ó��");
		}
	}
}
