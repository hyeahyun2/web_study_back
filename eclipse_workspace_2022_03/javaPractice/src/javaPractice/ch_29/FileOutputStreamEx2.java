package javaPractice.ch_29;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		/* write(byte[] b) �޼��� ����ϱ�
		 * ��µ� �Է°� ���������� ���� �ڷḦ �Ѳ����� ����ϸ� ȿ������ �Ӵ��� ����ð��� �پ��
		 * write(byte[] b) �޼���� ����Ʈ �迭�� �ִ� �ڷḦ �Ѳ����� ���
		 * 
		 * write(byte[] b, int off, int len)
		 * �迭�� ��ü �ڷḦ ������� �ʰ� �迭�� off ��ġ ���� len ���� ��ŭ�� ���
		 * */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output2.txt")) {
			byte[] bs = new byte[26];
			byte data = 65; // A�� �ƽ�Ű�ڵ�
			for(int i=0; i<bs.length; i++) { // A ~ Z ���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
