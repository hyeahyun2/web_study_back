package javaPractice.ch_02;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. ���� 4�� ��� ���
		 * 2. ��Ģ������ + ���길 ���
		 * 3. result = 9 �� ��������
		 * */
		long var1 = 2L;
 		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		// Ǯ��
//		double sum = var1 + (int)var2 + var3 + Double.parseDouble(var4);
		
		int result = (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
		System.out.println(result);

	}

}
