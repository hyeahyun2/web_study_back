package javaPractice.ch_02;

public class Ex_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. ���� 534�ڷ�, �л��� 30��
		 * 2. ���� ������ ������ ��
		 * 3. �л��� �� ����?
		 * 4. ���� ���� ����
		 * */
		
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		System.out.println("(������)�� ���� �� : " + (pencilsPerStudent * 30 + pencilsLeft));
	}
}
