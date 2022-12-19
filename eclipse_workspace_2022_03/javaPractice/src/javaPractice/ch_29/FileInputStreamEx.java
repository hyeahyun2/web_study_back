package javaPractice.ch_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* FileInputStream
 * : ���Ͽ��� ����Ʈ ������ �ڷḦ �о� ���� �� ����ϴ� ��Ʈ�� Ŭ����
 * 
 * FileInputStream(String name) : ���� �̸� name(�������)�� �Ű� ������ �޾� �Է� ��Ʈ�� ����
 * FileInputStream(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ�� ����
 * */
public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./sample_file/input.txt");
			
			// read() �޼����� ��ȯ���� int. �� ����Ʈ�� �о int�� ����.
			// �� �̻� �о���� �ڷᰡ ���� ��� -1 ��ȯ
//			System.out.println((char)fis.read()); // A
//			System.out.println((char)fis.read()); // B
//			System.out.println((char)fis.read()); // C
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			try {
//				if(fis != null) {
//					fis.close();
//				}
//			} catch(IOException | NullPointerException e) {
//				System.out.println(e);
//			}
//		}
//		System.out.println("end");
	}
}
