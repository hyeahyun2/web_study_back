package javaPractice.ch_02;

public class ShapeConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127;
		int b = a; // �ڵ�����ȯ (byte -> int)
		System.out.println(b); // 127
		
		float c = b; // �ڵ�����ȯ (int -> float)
		System.out.println(c); // 127.0
		
//		int b = c; //flat �ڷ����� int�� ����ȯ �Ұ�
		
		int aa = 263;
		System.out.println(aa); // 3
		
		byte bb = (byte)aa; // byte�� ������ ���
		System.out.println(bb); // 7 (263-256) <- ���ս��� �Ͼ
	}
}
