package javaPractice.ch_17;
class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("����Ÿ�� �������� ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}
	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}
}
public class InterfaceClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TourGuide guide2 = new TourGuide(new JapanTour());
		guide2.leisureSports();
		guide2.sightseeing();
		guide2.food();
		System.out.println();
	}

}
