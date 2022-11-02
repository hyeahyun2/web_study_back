package javaPractice.ch_03;

public class Ex_04_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* for문 이용해서
		 * 별그리기! (삼각형 반대방향!)
		 * */
		String star = "";
		for(int i=1; i<=4; i++) {
			star += "*";
			String nothing = "";
			for(int j=i; j < 4; j++) {
				nothing += " ";
			}
			System.out.println(nothing + star);
		}
	}
}