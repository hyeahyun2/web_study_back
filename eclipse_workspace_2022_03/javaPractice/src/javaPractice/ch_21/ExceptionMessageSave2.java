package javaPractice.ch_21;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ExceptionMessageSave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null; // 파일 error.log에 출력할 준비
		FileOutputStream fos = null; // 파일 저장을 위해
		try {
			// FileOutputStream("파일 경로", true) : 해당 파일의 하단에 내용 추가
						// true 설정 안했을 때 -> 덮어쓰기 됨
			fos = new FileOutputStream(".\\output_file\\error.log" ,true);
			ps = new PrintStream(fos); // err의 출력을 화면이 아닌, error.log 파일로 변경
			System.setErr(ps);
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 실행 x
		} catch(Exception ae) {
			System.err.println("------------------------------");
			System.err.println("예외발생시간 : " + new Date()); // 현재 시간 출력
			ae.printStackTrace(System.err);
			System.err.println("예외 메세지 : " + ae.getMessage());
			System.err.println("------------------------------");
		} // try-catch의 끝
		System.out.println(6);
	}

}
