package javaPractice.ch_02;

public class ShapeConversion2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String�� �⺻ �ڷ��� Ÿ�� x, Ŭ������ ��ü ����
		 * �Ϲ����� ����ȯ�� �ٸ�
		 * */
		String str = "2a";
//		int value = Integer.parseInt(str); // ���� ���� ���������� ��ȯx
		
		String str1= "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1);
		
		String str2= "200";
		short value2 = Short.parseShort(str2);
		System.out.println(value2);
		
		String str3= "300000";
		int value3 = Integer.parseInt(str3);
		System.out.println(value3);
		
		String str4= "50000000000";
		long value4 = Long.parseLong(str4);
		System.out.println(value4);
		
		String str5= "1.23";
		float value5 = Float.parseFloat(str5);
		System.out.println(value5);
		
		String str6= "1.23456789123";
		double value6 = Double.parseDouble(str6);
		System.out.println(value6);
		
		String str7 = "true";
		boolean value7 = Boolean.parseBoolean(str7);
		System.out.println(value7);
	}
}
