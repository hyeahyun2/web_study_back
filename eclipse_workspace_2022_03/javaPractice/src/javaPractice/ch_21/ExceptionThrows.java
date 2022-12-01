package javaPractice.ch_21;

public class ExceptionThrows {
	/* 예외 던지기란 예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고
	 * 자신을  호출한 쪽으로 예외 처리에 대한 책임을 넘기는 것.
	 * 예외 던지기는 호출한 쪽으로 책임을 넘기기 때문에 호출한 쪽에 대해 문법적 강제성이 발생.
	 * 예외를 넘겨받은 쪽은
	 * 1) 반드시 직접 예외 처리를 하거나 2) 자신도 예외를 던져야 함
	 * */
	public static void methodA() throws Exception {
		methodB();
	}
	public static void methodB() throws Exception {
		methodC();
//		try { // 직접 예외 처리하기
//			methodC();
//		} catch(Exception e) {
//			System.out.println("methodB에서 처리");
//		}
	}
	public static void methodC() throws Exception { // throws로 예외 던지기
		Exception e = new Exception();
		throw e; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			methodA();
		} catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
}
