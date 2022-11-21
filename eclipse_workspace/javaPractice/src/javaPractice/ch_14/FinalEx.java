package javaPractice.ch_14;
final class FinalClass {
	final int number = 4;
}
class Parents //extends FinalClass // final 클래스 상속 불가
{
	final void finalMethod() {
		System.out.println("상속 불가한 메서드");
	}
}
class son extends Parents {
	//void finalMethod() {} // final 메서드 오버라이딩 불가
}
public class FinalEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
	}
}
