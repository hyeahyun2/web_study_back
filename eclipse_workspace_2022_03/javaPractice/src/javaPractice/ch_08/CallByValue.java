package javaPractice.ch_08;

public class CallByValue {
	public int increase(int n) {
		++n;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		CallByValue val = new CallByValue();
		int result = val.increase(var1);
		System.out.println("val1 : " + var1 + ", result : " + result);
	}
}
