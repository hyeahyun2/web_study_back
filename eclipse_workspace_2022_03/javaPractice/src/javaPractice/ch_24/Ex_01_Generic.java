package javaPractice.ch_24;
class MyClass<T, V> {
	void sum(T a, V b) {
		System.out.println(a);
		System.out.println(b);
	}
}
public class Ex_01_Generic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		float c = 11.1f, d = 12.1f;
		
		MyClass mc = new MyClass();
		mc.sum(a, b);
		mc.sum(c, d);
	}
}
