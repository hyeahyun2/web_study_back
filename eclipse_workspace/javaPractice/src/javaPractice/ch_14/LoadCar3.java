package javaPractice.ch_14;

public class LoadCar3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe; // �ڽ�Ÿ�� -> �θ�Ÿ�� ���� ����ȯ (����ȯ Ű����(Car) ���� ����)
		//car.water(); // water() : �ڽ�Ŭ������ �޼���
		fe2 = (FireEngine)car; // �θ�Ÿ�� -> �ڽ�Ÿ�� ���� ����ȯ
		fe2.water();
//		System.out.println((FireEngine)car.water());
	}
}
