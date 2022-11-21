package javaPractice.ch_14;
class A {
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}
public class ParentDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.methodA();
//		obj.methodB();
		
		B obj2 = new B();
		obj2.methodB(); // 에러
		
		A obj3 = obj2; // A 데이터 타입인 obj3에 obj2 대입
//		obj3.methodB(); // 에러
	}

}
