package javaPractice.ch_19;
class A {
	class InstanceInner{};
	static class StaticInner{};
	
	StaticInner st1 = new StaticInner();
	
	// �ν��Ͻ� ������� ���� ����
	InstanceInner il1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2 = new StaticInner();
//		InstanceInner il2 = new InstanceInner(); // ���� �߻�
	}
	
	void instanceMethod() {
		// �ν��Ͻ� ����� ��� ���� ����
		StaticInner st3 = new StaticInner();
		InstanceInner il3 = new InstanceInner();
	}
}


public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
