package javaPractice.ch_01;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A'; // 문자형은 '' 사용
		// char ch = '\u0041'; 로도 사용 가능
		int code = (int)ch; // ch에 저장된 값을 int형으로 형변환
		System.out.println(ch); // 출력 : A
		System.out.println(code); // 출력 : 65 (아스키코드)
	}

}
