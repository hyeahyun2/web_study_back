package javaPractice.ch_29;

import java.io.FileWriter;
import java.io.IOException;

/* FileWriter
 * �����ڸ� ����ؼ� ��Ʈ���� ����
 * 
 * FileWriter(String name) : ���� �̸�(��� ����)�� �Ű������� �޾� ��� ��Ʈ���� ����
 * FileWriter(String name, boolean append) : ���� ��θ� �Ű������� �޾� ��� ��Ʈ���� ����
 * append ���� true�̸� ���� ��Ʈ���� �ݰ� �ٽ� ������ �� ������ ������ �̾ ���. (�⺻�� : false)
 * 
 * FileWriter(File f) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ�� ����
 * FileWriter(File f, boolean append) : File Ŭ���� ������ �Ű������� �޾� ��� ��Ʈ�� ����
 * */
public class FileWriterEx {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")) {
			fw.write('A');
			char[] buf = {'B', 'C', 'D', 'F', 'G'};
			
			fw.write(buf);
			fw.write("�ȳ��ϼ���. �� �����׿�"); // String ���
			fw.write(buf, 1, 2); // ���� �迭�� �Ϻ� ���
			fw.write("65"); // ���� �״�� ���
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
