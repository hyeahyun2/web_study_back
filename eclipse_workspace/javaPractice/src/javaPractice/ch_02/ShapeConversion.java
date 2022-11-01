package javaPractice.ch_02;

public class ShapeConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 127;
		int b = a; // 자동형변환 (byte -> int)
		System.out.println(b); // 127
		
		float c = b; // 자동형변환 (int -> float)
		System.out.println(c); // 127.0
		
//		int b = c; //flat 자료형을 int로 형변환 불가
		
		int aa = 263;
		System.out.println(aa); // 3
		
		byte bb = (byte)aa; // byte의 범위를 벗어남
		System.out.println(bb); // 7 (263-256) <- 값손실이 일어남
	}
}
