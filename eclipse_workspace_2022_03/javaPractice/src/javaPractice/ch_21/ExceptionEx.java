package javaPractice.ch_21;

public class ExceptionEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� Ŭ������ �ν��Ͻ��� ������ ���� Ű���� throw�� �̿��ϸ�
		// ���� ���ܸ� �߻���ų �� ����
		try {
			// ���� Ŭ������ �ν��Ͻ� ����. �����ڿ� ���ܹ��� ����
			Exception e = new Exception("���� ����");
			throw e; // ���� ������
//			throw new Exception("���� ����"); // ���� �� ���� ���ٷ� ���� ��!
		} catch(Exception e) {
			System.out.println("���� �߻�");
			// �����ڿ��� ������ ���� ���� ���
			System.out.println(e.getMessage());
		}
	}
}
