package shoppingProcess;

// product : �߻�Ŭ����
public class CellPhone extends Product {
	String carrier; // ��Ż�
	String company; // ������
	
	public CellPhone(String pname, int price, int code, String carrier, String company) {
		this.pname = pname;
		this.price = price;
		this.code = code;
		this.carrier = carrier;
		this.company = company;
	}

	@Override
	public void printExtra() {
		System.out.print("��Ż�: " + carrier + " , ");
		System.out.println("������: " + company);
	}
}
