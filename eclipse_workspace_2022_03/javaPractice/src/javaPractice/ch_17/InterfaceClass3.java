package javaPractice.ch_17;
interface Camera {
	void photo();
}
interface Call {
	void calling();
}
interface Memo {
	void write();
}
interface Clock {
	void clock();
}
class MyCellPhone implements Camera, Call, Memo, Clock {
	@Override
	public void clock() { // 시계
		
	}
	@Override
	public void write() { // 메모
		
	}
	@Override
	public void calling() { // 통화
		
	}
	@Override
	public void photo() { // 사진
		
	}
}
class PhoneUser {
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}
public class InterfaceClass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		
		PhoneUser user1 = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		user1.call((MyCellPhone)phone2);
	}
}
