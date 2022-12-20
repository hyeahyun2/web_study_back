package javaPractice.ch_29;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AfterBuffered {
	public static void main(String[] args) {
		// ���� �����ϱ�
		long ms = 0;
		try(FileInputStream fis = new FileInputStream("./sample_file/a.zip");
				FileOutputStream fos = new FileOutputStream("./output_file/copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			ms = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				bos.write(i);
			}
			ms = System.currentTimeMillis() - ms;
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴ� �� " + ms + " milliseconds �ҿ�Ǿ����ϴ�.");
		// not used buffer : 37179 milliseconds
		// used buffer : 17189 milliseconds
	}
}
