package javaPractice.ch_29;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		/*FileReader
		 * RileReader(String name) : ���� �̸� name�� �Ű������� �޾� �Է� ��Ʈ�� ����
		 * FileReader(File f) : File Ŭ���� ������ �Ű������� �޾� �Է� ��Ʈ�� ����
		 * 
		 * ���� ��Ʈ�� FileReader�� ������ �ѱ��� ����� ����
		 * */
		try(FileReader fr = new FileReader("./sample_file/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
