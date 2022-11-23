package javaPrcatice.ch_13;
class ShopService {
	private static ShopService singleton = null;
	private ShopService() {}
	static ShopService getInstance() {
		if(singleton == null) {
			singleton = new ShopService();
		}
		return singleton;
	}
}
public class Ex_03_Singleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ShopService ��ü�� �̱������� ����
		 * ShopService getInstance() �޼���� �̱����� ���� �� �ֵ���
		 * ShopService Ŭ���� �ۼ�
		 * */
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
		}
	}
}
