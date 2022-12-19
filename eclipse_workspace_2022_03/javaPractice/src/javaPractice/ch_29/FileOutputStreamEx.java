package javaPractice.ch_29;

import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream : 파일에 바이트 단위 자료를 출력하기 위해 사용하는 스트림
 * 
 * FileOutputStream(String name) : 파일 경로를 매개변수로 받아 출력 스트림을 생성
 * FileOutputStream(String name, boolean append) : 파일 경로를 매개변수로 받아 출력 스트림 생성
 * 		append : 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용할지 여부(기본값:false)
 * FileOutputStream(File f) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성
 * FileOutputStream(File f, boolean append) : File 클래스 정보를 매개변수로 받아 출력 스트림 생성
 * 
 * 생성자 매개변수로 전달한 파일이 경로에 없으면 FileOutputStream은 파일을 새로 생성.
 * 기존 파일이 있는 경우 append 값이 false이면 처음 부터 새로 씀 . overwirte
 * true이면 기존 내용 맨 뒤에 연결해서 씀. append
 * */
public class FileOutputStreamEx {
	public static void main(String[] args) {
		// FileOutputStream을 생성하고 write() 메서드를 활용하여 파일에 정수 값을 저장
		// fos = new FileOutputStream("output.txt", true) // 기존 자료에 이어 출력할 경우
		try(FileOutputStream fos = new FileOutputStream("./output_file/output.txt", true)){
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
