package javaPractice.ch_21;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExceptionMessageSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // ���� error.log�� ����� �غ�
		FileOutputStream fos = null; // ���� ������ ����
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // ���� �߻�
			System.out.println(4); // ���� x
		} catch(Exception ae) {
			ae.printStackTrace(ps);
			// ȭ�� ��� error.log ���Ͽ� ���
			ps.println("���� �޼��� : " + ae.getMessage());
		} // try-catch�� ��
		System.out.println(6);
	}

}
