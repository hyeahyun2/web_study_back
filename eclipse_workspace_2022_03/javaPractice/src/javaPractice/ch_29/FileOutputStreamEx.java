package javaPractice.ch_29;

import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream : ���Ͽ� ����Ʈ ���� �ڷḦ ����ϱ� ���� ����ϴ� ��Ʈ��
 * 
 * FileOutputStream(String name) : ���� ��θ� �Ű������� �޾� ��� ��Ʈ���� ����
 * FileOutputStream(String name, boolean append) : ���� ��θ� �Ű������� �޾� ��� ��Ʈ�� ����
 * 		append : ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ������� ����(�⺻��:false)
 * FileOutputStream(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ���� ����
 * FileOutputStream(File f, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ�� ����
 * 
 * ������ �Ű������� ������ ������ ��ο� ������ FileOutputStream�� ������ ���� ����.
 * ���� ������ �ִ� ��� append ���� false�̸� ó�� ���� ���� �� . overwirte
 * true�̸� ���� ���� �� �ڿ� �����ؼ� ��. append
 * */
public class FileOutputStreamEx {
	public static void main(String[] args) {
		// FileOutputStream�� �����ϰ� write() �޼��带 Ȱ���Ͽ� ���Ͽ� ���� ���� ����
		// fos = new FileOutputStream("output.txt", true) // ���� �ڷῡ �̾� ����� ���
		try(FileOutputStream fos = new FileOutputStream("./output_file/output.txt", true)){
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
