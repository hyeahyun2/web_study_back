package javaPractice.ch_19;

class OuterClass {
	int a = 3;
	static int b = 4;
	
	class Inner {
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner {
		int d = 6; // static ���� Ŭ������ �ν��Ͻ� �ʵ带 ���� �� ����
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class InnerClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܺ� Ŭ���� ���
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass�� a�� = " + oc.a);
		
		System.out.println("\n======= static inner Ŭ���� ��ü �������� �ʰ� ��� �����ϱ� ========");
		// static ������ Ŭ���������� ���� ����
		System.out.println("OuterClass�� b�� = " + OuterClass.b);
//		System.out.println("OuterClass�� b�� = " + OuberClassdStaticInner.d); // ���ٺҰ�
		System.out.println("OuterClass�� StaticInner�� stat�� = " + OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod(); // Ŭ���������ε� ���� ����
		
		System.out.println("\n=============== inner Ŭ���� �����ϱ� =================");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner inner = oc2.new Inner();
		
		System.out.println("Inner�� c�� = " + inner.c);
		inner.innerMethod();
		
		System.out.println("\n=============== Static inner Ŭ���� �����ϱ� =================");
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� = " + si.d);
		si.staticMethod(); // Ŭ����, ��ü ��θ� ����� ���� ����
		
	}
}
