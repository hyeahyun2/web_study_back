package javaPractice.ch_20;

public class ExceptionEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		int a = 0;
		int b = 2;
//		int c = b/a; // 0으로 나눌 수 없음!
//		System.out.println("프로그램 종료");
		
		int num = 10;
		int num2 = 0;
		/* 부적절한 연산
		System.out.println("## 정숫값을 0으로 나누는 연산 ##");
		System.out.println("10/0 = " + (num / num2));
		System.out.println("try/catch 구문 밖 문장 수행");
		*/
		
		try {
			System.out.println("## 정숫값을 0으로 나누는 연산 ##");
			System.out.println("10/0 = " + (num / num2));
			System.out.println("## 정숫값을 0으로 나누는 연산 완료 ##");
		} catch(Exception e) {
			System.out.println(e); // 예외의 종류(예외 처리된 이유) 출력됨
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램을 정상 수행합니다.");
	}

}
