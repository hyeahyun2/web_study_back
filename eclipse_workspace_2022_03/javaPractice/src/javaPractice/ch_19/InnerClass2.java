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
		int d = 6; // static 내부 클래스는 인스턴스 필드를 가질 수 있음
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class InnerClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부 클래스 사용
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a);
		
		System.out.println("\n======= static inner 클래스 객체 생성하지 않고 요소 접근하기 ========");
		// static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + OuterClass.b);
//		System.out.println("OuterClass의 b값 = " + OuberClassdStaticInner.d); // 접근불가
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod(); // 클래스명으로도 접근 가능
		
		System.out.println("\n=============== inner 클래스 접근하기 =================");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner inner = oc2.new Inner();
		
		System.out.println("Inner의 c값 = " + inner.c);
		inner.innerMethod();
		
		System.out.println("\n=============== Static inner 클래스 접근하기 =================");
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d값 = " + si.d);
		si.staticMethod(); // 클래스, 객체 모두를 사용해 접근 가능
		
	}
}
