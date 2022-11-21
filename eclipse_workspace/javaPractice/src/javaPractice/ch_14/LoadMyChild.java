package javaPractice.ch_14;
class MyParent {
	public void pDisplay() {
		System.out.println("Super : Parent's Display");
	}
}
class MyChild extends MyParent {
	public void pDisplay() {
		super.pDisplay();
		System.out.println("Sub Class : Parent's Display");
	}
	public void cDisplay() {
		System.out.println("Sub Class : Child's Display");
	}
}

public class LoadMyChild {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild c = new MyChild();
		c.pDisplay();
	}
}
