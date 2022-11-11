package javaPractice.ch_08;

public class MethodEx {
	public void print() {
		System.out.println("메서드를 호출한다");
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int result = 0;
		
		MethodEx method = new MethodEx();
		method.print();
		method.print();
		method.print();
	}
}
