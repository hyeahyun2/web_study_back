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
		obj2.methodB(); // ����
		
		A obj3 = obj2; // A ������ Ÿ���� obj3�� obj2 ����
//		obj3.methodB(); // ����
	}

}
