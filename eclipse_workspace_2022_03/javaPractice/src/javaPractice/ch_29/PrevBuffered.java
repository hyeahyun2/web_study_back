package javaPractice.ch_29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrevBuffered {
	public static void main(String[] args) {
		// 파일 복사하기
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
		System.out.println("파일 복사 하는 데 " + ms + " milliseconds 소요되었습니다.");
		// 37179 milliseconds
	}
}
