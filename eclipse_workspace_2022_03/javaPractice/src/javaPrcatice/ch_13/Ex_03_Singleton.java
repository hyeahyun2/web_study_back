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
		/* ShopService 객체를 싱글톤으로 만듬
		 * ShopService getInstance() 메서드로 싱글턴을 얻을 수 있도록
		 * ShopService 클래스 작성
		 * */
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		}
		else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
