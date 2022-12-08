package javaPractice.ch_27;

class Company {
	// 1. �����ڸ� private���� �����ϱ�.
	// �������� ���������ڰ� private�̹Ƿ� �ܺ� Ŭ�������� ������� Company �ν��Ͻ��� ������ �� ����.
	// �� Company Ŭ���� ���ο����� �� Ŭ������ ������ ������ �� ����.
	private Company() {}
	
	// 2. Ŭ���� ���ο� static���� ������ �ν��Ͻ� �����ϱ�
	// private���� �����Ͽ� �ܺο��� �� �ν��Ͻ��� �������� ���ϵ��� �����ؾ� �ν��Ͻ� ������ ������ �� ����.
	private static Company instance = new Company();
	
	// 3. �ܺο��� ������ �� �ִ� public �޼��� �����
	// �ν��Ͻ��� ��ȯ�ϴ� �޼���� �ݵ�� static���� �����ؾ� ��.
	// getInstatnce() �޼���� �ν��Ͻ� ������ ������� ȣ���� �� �־�� �ϱ� ����
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance; // �����ϰ� ������ �ν��Ͻ� ��ȯ
	}
}

public class singletonPattern {
	public static void main(String[] args) {
		// 4. �ܺο��� ����ϴ� �ڵ� �����.
		// �ܺ� Ŭ�������� Company�� ������ �� �����Ƿ� static���� �����Ǵ� getInstance()�޼��带 ȣ��.
		// (Ŭ���������� getInstatce() ȣ���Ͽ� ���������� ����)
		 Company company1 = Company.getInstance(); 
		 Company company2 = Company.getInstance();
		 
		 System.out.println(company1 == company2); // ���� �ּ����� Ȯ�� = true
		 System.out.println(company1);
		 System.out.println(company2);
	}
	

}
