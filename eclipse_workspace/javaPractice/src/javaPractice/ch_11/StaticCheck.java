package javaPractice.ch_11;
class Check {
	static int cv = 5;
	int iv = 4;
	
	static void cm() {  }// Ŭ���� �޼���
	void im() {  } // �ν��Ͻ� �޼���
	static void cm_Imember() {
		// ���� �߻�
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
//		Check.im_Cmember(); // �����߻� <- �ν��Ͻ� �޼���
		Check.cm_Cmember();
		
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.cm_Imember();
	}

}
