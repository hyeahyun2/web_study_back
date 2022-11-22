package javaPractice.ch_15;
class Parent {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent {
	int x = 200;
	void method() {
//		System.out.println("Child Method");
		System.out.println("x = " + x); // = this.x
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);
	}
}

public class OtherDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		Child child = new Child();
		
		System.out.println("p.x = " + parent.x);
		parent.method();
		System.out.println();
		System.out.println("c.x = " + child.x);
		child.method();
	}
}
