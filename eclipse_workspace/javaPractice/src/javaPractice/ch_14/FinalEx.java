package javaPractice.ch_14;
final class FinalClass {
	final int number = 4;
}
class Parents //extends FinalClass // final Ŭ���� ��� �Ұ�
{
	final void finalMethod() {
		System.out.println("��� �Ұ��� �޼���");
	}
}
class son extends Parents {
	//void finalMethod() {} // final �޼��� �������̵� �Ұ�
}
public class FinalEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
	}
}
