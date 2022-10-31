package javaPractice.ch_01;

public class DataType4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char single = '\''; // (겹)따옴표를 문자형/문자열 안에 포함하고 싶을 때 사용 방법
		String dblQuote = "\"Hello\"";
		String root = "c:\\"; // 출력 : c:\
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		char single2 = '"'; // 단 하나의 문자만 저장
		String single3 = "'"; // 여러 문자 저장 가능
		String dblQuote2 = "'Hello'";
		
		System.out.println(single2);
		System.out.println(single3);
		System.out.println(dblQuote2);
	}
}
