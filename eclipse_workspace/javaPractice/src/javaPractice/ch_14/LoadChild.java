package javaPractice.ch_14;
class Parent {
	int x;
	Parent(){ x = 10; }
}
class Child extends Parent {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
public class LoadChild {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
		
	}

}
