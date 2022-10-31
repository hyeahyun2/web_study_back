package javaPractice.ch_01;

public class DataType3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1.2345678901234567890f;
		float f3 = 1.2f; // f 입력 안하면 에러 뜸
		
		double d = 1.2345678901234567890;
		float f2 = 0.100000001f;
		double d2 = 0.100000001;
		double d3 = 0.100000000000001;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(d3);
		
		// int의 범위 내일 경우 접미사 사용 맘대로~
		long var1 = 10;
		long var2 = 20L;
		// int의 범위를 벗어난 경우 접미사 L 사용
		long var3 = 100000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}

}
