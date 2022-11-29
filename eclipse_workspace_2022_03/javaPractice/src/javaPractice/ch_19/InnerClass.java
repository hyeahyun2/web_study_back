package javaPractice.ch_19;
class A {
	class InstanceInner{};
	static class StaticInner{};
	
	StaticInner st1 = new StaticInner();
	
	// 인스턴스 멤버간의 접근 가능
	InstanceInner il1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner il2 = new InstanceInner(); // 에러 발생
	}
	
	void instanceMethod() {
		// 인스턴스 멤버는 모두 접근 가능
		StaticInner st3 = new StaticInner();
		InstanceInner il3 = new InstanceInner();
	}
}


public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
