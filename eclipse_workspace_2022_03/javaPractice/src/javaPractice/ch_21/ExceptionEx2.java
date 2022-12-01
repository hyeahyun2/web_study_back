package javaPractice.ch_21;

public class ExceptionEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외 발생
			System.out.println(4); // 실행 x
		} catch(ArithmeticException ae) {
			// 참조변수 ae를 통해, 생성된 ArithemticException 인스턴스에 접근 가능
			ae.printStackTrace();
			System.out.println("예외 메세지 : " + ae.getMessage());
		} // try-catch의 끝
		System.out.println(6);
	}
}
