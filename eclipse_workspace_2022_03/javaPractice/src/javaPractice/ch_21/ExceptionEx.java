package javaPractice.ch_21;

public class ExceptionEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외 클래스의 인스턴스를 생성한 다음 키워드 throw를 이용하면
		// 직접 예외를 발생시킬 수 있음
		try {
			// 예외 클래스의 인스턴스 생성. 생성자에 예외문구 전달
			Exception e = new Exception("고의 예외");
			throw e; // 예외 던지기
//			throw new Exception("고의 예외"); // 위의 두 줄을 한줄로 줄인 것!
		} catch(Exception e) {
			System.out.println("예외 발생");
			// 생성자에게 전달한 예외 문구 출력
			System.out.println(e.getMessage());
		}
	}
}
