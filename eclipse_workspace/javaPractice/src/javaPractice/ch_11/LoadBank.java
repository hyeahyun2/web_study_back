package javaPractice.ch_11;
class Bank {
	String name; // ���� ����
	String userNum; // ���¹�ȣ
	long balance; // �����ܰ�
	void outputB(long money) {
		balance -= money;
	}
	void inputB(long money) {
		balance += money;
	}
}
public class LoadBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank chulsoo = new Bank();
		chulsoo.name = "ö��";
		chulsoo.userNum = "123456";
		chulsoo.balance = 1000;
		
		Bank younghee = new Bank();
		younghee.name = "����";
		younghee.userNum = "654321";
		younghee.balance = 200;
		
		chulsoo.outputB(200);
		younghee.inputB(100);
		
		System.out.println("* ö���� ����");
		System.out.println("   ���¸��� : " + chulsoo.name);
		System.out.println("   ���¹�ȣ : " + chulsoo.userNum);
		System.out.println("   �����ܰ� : " + chulsoo.balance);
		
		System.out.println("* ������ ����");
		System.out.println("   ���¸��� : " + younghee.name);
		System.out.println("   ���¹�ȣ : " + younghee.userNum);
		System.out.println("   �����ܰ� : " + younghee.balance);
	}

}
