package javaPractice.ch_29;

import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args) {
		/* ǥ�� �����
		 * : ȭ�鿡 ����ϰ� �Է¹޴� ǥ�� ����� Ŭ����
		 * static PrintStream out : ǥ�� ��� ��Ʈ��
		 * static InputStream in : ǥ�� �Է� ��Ʈ��
		 * static OutputStream err : ǥ�� ���� ��� ��Ʈ��
		 * */
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������.");
		int i;
		try {
			// System.in : ǥ�� �Է� ��Ʈ��
			i = System.in.read(); // read() �޼���� �� ����Ʈ ����
			// System.out : ǥ�� ��� ��Ʈ��
			System.out.println(i); // int�� 4����Ʈ ������ 1����Ʈ�� �о ���. �ƽ�Ű �ڵ带 ���
			System.out.println((char)i); // ���ڷ� ��ȯ�Ͽ� ���
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
