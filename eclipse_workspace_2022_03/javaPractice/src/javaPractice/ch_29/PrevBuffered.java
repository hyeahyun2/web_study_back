package javaPractice.ch_29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrevBuffered {
	public static void main(String[] args) {
		// ���� �����ϱ�
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
				FileOutputStream fos = new FileOutputStream("./output_file/copy.zip")){
			ms = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴ� �� " + ms + " milliseconds �ҿ�Ǿ����ϴ�.");
		// 37179 milliseconds
	}
}
