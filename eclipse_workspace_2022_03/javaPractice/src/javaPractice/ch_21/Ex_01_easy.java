package javaPractice.ch_21;

public class Ex_01_easy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println("arr[2]=" + arr[2]);
			System.out.println("arr[3]=" + arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭 ���� ���� ���� ���� ó��");
			System.err.println(e.getMessage());
		} catch(Exception e){
			System.err.println("������ ���� ó��");
		} finally {
			System.out.println("arr ��� �Ϸ�");
		}
		System.out.println("try/catch ���� �� ���� ����");
	}
}
