package javaPractice.ch_02;

public class SumCalcul2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 모두 문자열 타입으로 출력
		String a = 7 + " "; // "7 "
		String b = " " + 7; // " 7"
		String c = 7 + "";  // 7
		String d = "" + 7; // 7
		String e = "" + ""; // null
		String f = 7 + 7 + ""; // 14
		String g = "" + 7 + 7; // 77
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
