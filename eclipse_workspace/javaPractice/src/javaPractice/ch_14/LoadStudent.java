package javaPractice.ch_14;
class Student2 {
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���!");
	}
}
class Leader extends Student2 {
	void lead() {}
	@Override
	void say() {
		System.out.println("�����Բ� �λ�"); // �������̵�
		super.say(); // �θ�Ŭ������ �޼��� ����
	}
}

public class LoadStudent {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat();
		leader.say();
	}

}
