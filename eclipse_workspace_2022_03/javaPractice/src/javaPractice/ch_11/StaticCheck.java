package javaPractice.ch_11;
class Check {
	static int cv = 5;
	int iv = 4;
	
	static void cm() {  }// 클래스 메서드
	void im() {  } // 인스턴스 메서드
	static void cm_Imember() {
		// 에러 발생
//		System.out.println(iv);
//		iv();
	}
	void im_Cmember() {
		System.out.println(cv);
		cm();
	}
	static void cm_Cmember() {
		System.out.println(cv);
		cm();
	}
}
public class StaticCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Check.im_Cmember(); // 에러발생 <- 인스턴스 메서드
		Check.cm_Cmember();
		
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.cm_Imember();
	}

}
