package javaPractice.ch_20;

public class ExceptionEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		int a = 0;
		int b = 2;
//		int c = b/a; // 0���� ���� �� ����!
//		System.out.println("���α׷� ����");
		
		int num = 10;
		int num2 = 0;
		/* �������� ����
		System.out.println("## �������� 0���� ������ ���� ##");
		System.out.println("10/0 = " + (num / num2));
		System.out.println("try/catch ���� �� ���� ����");
		*/
		
		try {
			System.out.println("## �������� 0���� ������ ���� ##");
			System.out.println("10/0 = " + (num / num2));
			System.out.println("## �������� 0���� ������ ���� �Ϸ� ##");
		} catch(Exception e) {
			System.out.println(e); // ������ ����(���� ó���� ����) ��µ�
			System.out.println("0���� ���� �� �����ϴ�");
		}
		System.out.println("���α׷��� ���� �����մϴ�.");
	}

}
