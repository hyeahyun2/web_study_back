package javaPractice.ch_21;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExceptionMessageSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // 파일 error.log에 출력할 준비
		FileOutputStream fos = null; // 파일 저장을 위해
		try {
			fos = new FileOutputStream(".\\output_file\\error.log");
			ps = new PrintStream(fos);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 실행 x
		} catch(Exception ae) {
			ae.printStackTrace(ps);
			// 화면 대신 error.log 파일에 출력
			ps.println("예외 메세지 : " + ae.getMessage());
		} // try-catch의 끝
		System.out.println(6);
	}

}
