package javaPractice.ch_12;

public class LoadSingleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton class의 생성자 -> private
//		Singleton singleton1 = new Singleton(); // 컴파일 에러
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton1 == singleton2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
