package javaPractice.ch_11;
class MyMath_2 {
	int add(int a, int b) {
		return a+b;
	}
	int add(long a, int b) {
		return (int)a+b;
	}
	int add(int a, long b) {
		return a+(int)b;
	}
	int add(long a, long b) {
		return (int)(a+b);
	}
	int add(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
public class LoadMath_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath_2 nm = new MyMath_2();
		System.out.println("nm.add(3, 3) 결과 : " + nm.add(3, 3));
		System.out.println("nm.add(3L, 3) 결과 : " + nm.add(3L, 3));
		System.out.println("nm.add(3, 3L) 결과 : " + nm.add(3, 3L));
		System.out.println("nm.add(3L, 3L) 결과 : " + nm.add(3L, 3L));

		int[] a = {100, 200, 300};
		System.out.println("nm.add(a) 결과 : " + nm.add(a));
	}

}
