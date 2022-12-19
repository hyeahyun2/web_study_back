package javaPractice.ch_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* FileInputStream
 * : 파일에서 바이트 단위로 자료를 읽어 들일 때 사용하는 스트림 클래스
 * 
 * FileInputStream(String name) : 파일 이름 name(경로포함)을 매개 변수로 받아 입력 스트림 생성
 * FileInputStream(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림 생성
 * */
public class FileInputStreamEx {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./sample_file/input.txt");
			
			// read() 메서드의 반환형은 int. 한 바이트를 읽어서 int에 저장.
			// 더 이상 읽어들일 자료가 없는 경우 -1 반환
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
