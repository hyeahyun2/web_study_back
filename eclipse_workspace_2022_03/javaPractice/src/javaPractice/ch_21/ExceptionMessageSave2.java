package javaPractice.ch_21;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ExceptionMessageSave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // ���� error.log�� ����� �غ�
		FileOutputStream fos = null; // ���� ������ ����
		try {
			// FileOutputStream("���� ���", true) : �ش� ������ �ϴܿ� ���� �߰�
						// true ���� ������ �� -> ����� ��
			fos = new FileOutputStream(".\\output_file\\error.log" ,true);
			ps = new PrintStream(fos); // err�� ����� ȭ���� �ƴ�, error.log ���Ϸ� ����
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // ���� �߻�
			System.out.println(4); // ���� x
		} catch(Exception ae) {
			System.err.println("------------------------------");
			System.err.println("���ܹ߻��ð� : " + new Date()); // ���� �ð� ���
			ae.printStackTrace(System.err);
			System.err.println("���� �޼��� : " + ae.getMessage());
			System.err.println("------------------------------");
		} // try-catch�� ��
		System.out.println(6);
	}

}
