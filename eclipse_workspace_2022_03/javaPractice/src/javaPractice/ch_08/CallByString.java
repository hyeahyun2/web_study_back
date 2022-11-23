package javaPractice.ch_08;

public class CallByString {
	public void setAddress(String addr) {
		addr = "경기도 수원시 장안구";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "서울시 강남구 논현동";
		CallByString st = new CallByString();
		System.out.println("메서드 호출 전");
		System.out.println("address : " + address);
		System.out.println();
		
		st.setAddress(address);
		System.out.println("메서드 호출 후");
		System.out.println("address : " + address);
	}

}
