package javaPractice.ch_24;

// ���׸��� C++�� ���ø��� ������ ����
// C++���� �޸� ���׸� ��� Object�� ����ϸ� ��� ������ Ÿ���� ����� �� ������,
// ��쿡 ���� �� ��ȯ ����� �Ǽ� ���׸��� ��ȣ
class ObjectData {
	private Object data;

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}

// GenericTypeTest
// ���׸�(Generic) : �Ϲ�ȭ, ����ȭ��� �ǹ̷�,
// Ŭ������ �޼��忡�� ����ϴ� �ʵ峪 �Ű������� �ڷ���(Ŭ������)�� ȣ���ϴ� �ʿ��� �����ϵ��� �ϴ� ���

// �Ϲ����� ������� Ŭ�������� �̸� ������ Ÿ���� �����ؾ� ������ 
// ���׸��� ����ϸ� ȣ���ϴ� �ʿ��� ������ Ÿ���� ����
class CommonData<T> {
	private T data; // ������ Ÿ������ T�� ����. Type�� ����. Ŭ���� ���𿡼� <> ������ ����

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

public class ArrayListGenerics2 {
	public static void main(String[] args) {
		ObjectData stringCommonDate = new ObjectData();
		ObjectData integerCommonDate = new ObjectData();
		// Ŭ������ ������ Ÿ���� Object�� ��� ������ Ÿ���� ��� ����
		stringCommonDate.setData("abc");
		integerCommonDate.setData(100);
		System.out.println("stringCommonDate : " + stringCommonDate.getData());
		System.out.println("integerCommonDate : " + integerCommonDate.getData());
		System.out.println();
		
		// ȣ���ϴ� �ʿ��� Ÿ�� ����
		CommonData<String> stringCommonDate2 = new CommonData<String>();
		CommonData<Integer> integerCommonDate2 = new CommonData<>(); // �����ڿ��� Ÿ�� ���� ����
		stringCommonDate2.setData("abc");
		integerCommonDate2.setData(100);
		System.out.println("stringCommonDate2 : " + stringCommonDate2.getData());
		System.out.println("integerCommonDate2 : " + integerCommonDate2.getData());
	}
}
