package javaPractice.ch_29;

import java.io.FileWriter;
import java.io.IOException;

/* FileWriter
 * 생성자를 사용해서 스트림을 생성
 * 
 * FileWriter(String name) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성
 * FileWriter(String name, boolean append) : 파일 경로를 매개변수로 받아 출력 스트림을 생성
 * append 값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. (기본값 : false)
 * 
 * FileWriter(File f) : File 클래스 정보를 매개변수로 받아 출력 스트림 생성
 * FileWriter(File f, boolean append) : File 클래스 정보를 매개변수로 받아 출력 스트림 생성
 * */
public class FileWriterEx {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("./output_file/writer.txt")) {
			fw.write('A');
			char[] buf = {'B', 'C', 'D', 'F', 'G'};
			
			fw.write(buf);
			fw.write("안녕하세요. 잘 써지네요"); // String 출력
			fw.write(buf, 1, 2); // 문자 배열의 일부 출력
			fw.write("65"); // 숫자 그대로 출력
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
