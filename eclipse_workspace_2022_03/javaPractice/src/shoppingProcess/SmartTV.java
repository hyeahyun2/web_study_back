package shoppingProcess;

// Product : �߻�Ŭ����
public class SmartTV extends Product {
	String resolution; // �ػ�
	String inches; // ��ġ��
	
	public SmartTV(String pname, int price, int code, String resolution, String inches) {
		this.pname = pname;
		this.price = price;
		this.code = code;
		this.resolution = resolution;
		this.inches = inches;
	}

	@Override
	public void printExtra() {
		// �߻�Ŭ������ ���ǵ� �߻� �޼��带 �������̵�
		// �߰� ������ �ػ� ���
		System.out.print("�ػ�: " + resolution + " , ");
		System.out.println("��ġ��: " + inches);
	}
}
