package javaPractice.ch_29;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		/* write(byte[] b) 메서드 사용하기
		 * 출력도 입력과 마찬가지로 여러 자료를 한꺼번에 출력하면 효율적인 뿐더러 실행시간도 줄어둠
		 * write(byte[] b) 메서드는 바이트 배열에 있는 자료를 한꺼번에 출력
		 * 
		 * write(byte[] b, int off, int len)
		 * 배열의 전체 자료를 출력하지 않고 배열의 off 위치 부터 len 길이 만큼만 출력
		 * */
		try(FileOutputStream fos = new FileOutputStream("./output_file/output2.txt")) {
			byte[] bs = new byte[26];
			byte data = 65; // A의 아스키코드
			for(int i=0; i<bs.length; i++) { // A ~ Z 까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
