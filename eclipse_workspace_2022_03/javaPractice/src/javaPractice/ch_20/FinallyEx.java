package javaPractice.ch_20;

public class FinallyEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부로 연결
		int a = 0;
		int b = 2;
		try {
			System.out.println("외부로 연결");
			int c = b / a;
		} catch(ArithmeticException e) {
			System.out.println("오류가 발생했습니다.");
		} finally {
			System.out.println("연결 해제");
		}
		System.out.println("여기도 수행됩니다.");
	}
}