package javaPractice.ch_29;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AfterBuffered {
	public static void main(String[] args) {
		// 파일 복사하기
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
		System.out.println("파일 복사 하는 데 " + ms + " milliseconds 소요되었습니다.");
		// not used buffer : 37179 milliseconds
		// used buffer : 17189 milliseconds
	}
}
