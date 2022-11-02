package javaPractice.ch_03;
public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		
//		if (age > 19) {
//			System.out.println("성인입니다.");
//			System.out.println("성인요금이 적용됩니다.");
//		}
//		else {
//			System.out.println("청소년입니다.");
//			System.out.println("청소년요금이 적용됩니다.");
//		}
		// 삼항연산자로~~
		System.out.println(age > 19 ? "성인입니다.\n성인요금이 적용됩니다." : "청소년입니다.\n청소년요금이 적용됩니다.");
		System.out.println("결제를 진행해 주세요.");
	}
}

