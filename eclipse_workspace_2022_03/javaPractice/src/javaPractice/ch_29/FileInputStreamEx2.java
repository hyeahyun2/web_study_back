package javaPractice.ch_29;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
	public static void main(String[] args) {
		/* int read(byte[] b) �޼���� �б�
		 * �ڷḦ read() �޼ҵ�� �� ����Ʈ�� �д�  �� ����
		 * �迭�� ����ؼ� �Ѳ����� ���� ������ ó�� �ӵ��� �ξ� ����
		 * read(byte[] b) �޼���� ������ ����Ʈ �迭�� ũ�⸸ŭ �Ѳ����� �ڷḦ �а�
		 * �о� ���� �ڷ��� ���� ��ȯ.
		 * */
		try(FileInputStream fis = new FileInputStream("./sample_file/input.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
