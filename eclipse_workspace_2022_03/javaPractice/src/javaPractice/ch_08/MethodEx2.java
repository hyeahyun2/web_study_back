package javaPractice.ch_08;

public class MethodEx2 {
	public void print(int a) {
		// 매개 변수가 있는 메서드
		// 매개 변수는 메서드 호출시 메모리에 생성되고, 호출 후 복귀시 소멸
		System.out.println("결과값 : " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 11;
		int b = 22;
		int result = 0;
		
		MethodEx2 method = new MethodEx2();
		method.print(10);
		method.print(b);
		method.print(result);
	}
}
