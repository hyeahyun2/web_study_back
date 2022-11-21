package javaPractice.ch_14;
class StaticPractice {
	public static int number = 3;
	public static void say() {
		System.out.println("인스턴스 생성 없이 사용 가능합니다.");
	}
}
public class StaticEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticPractice.number);
		StaticPractice.say();
	}

}
