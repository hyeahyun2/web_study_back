package javaPractice.ch_02;

public class SumCalcul {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���꿡���� ���ڿ� �ڵ� ��ȯ
		 * 1) �ǿ����ڰ� ������ ��� -> ���� ����
		 * 2) �ǿ����� �� �ϳ��� ���ڿ��� ��� 
		 * 		-> ���ڿ��� �ڵ� ��ȯ �� ���ڿ� ���� ����
		 * */
		// ������ ���� ���� -> ������ Ÿ�� : int
		int value = 10 + 2 + 8;
		System.out.println("value : " + value); // 20
		
		// ���ڿ� �ϳ��� �ִ� ��� ������ Ÿ�� -> String
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1); // 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); // 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4); // 1010
	}
}
