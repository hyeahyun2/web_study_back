package javaPractice.ch_21;

public class Ex_01 {
	// ������ ���Ḧ �ϴµ�, try ~ catch�� �̿��ؼ�
	// ���ܸ� �����ϰ� ó���ϵ��� �ڵ� ������ ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i;
		}
		try {
			for(int i=0; i<11; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭 ���� ���� ���� ó��");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.err.println("������ ���� ó��");
//			e.printStackTrace();
		}
	}
}
