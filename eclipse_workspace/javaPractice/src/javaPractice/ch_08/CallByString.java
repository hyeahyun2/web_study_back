package javaPractice.ch_08;

public class CallByString {
	public void setAddress(String addr) {
		addr = "��⵵ ������ ��ȱ�";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "����� ������ ������";
		CallByString st = new CallByString();
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("address : " + address);
		System.out.println();
		
		st.setAddress(address);
		System.out.println("�޼��� ȣ�� ��");
		System.out.println("address : " + address);
	}

}
