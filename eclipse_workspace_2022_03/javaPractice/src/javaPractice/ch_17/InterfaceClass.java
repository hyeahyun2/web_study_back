package javaPractice.ch_17;

interface Providable {
	// public abstract ������
	void leisureSports();
	void sightseeing();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}
}
class TourGuide {
	private Providable tour;
	TourGuide(Providable providable){
		tour = providable;
	}
	// �������̵� �ƴ�.
	public void leisureSports() {
		tour.leisureSports(); // providable�ڷ����� �޼ҵ� ȣ��
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}

public class InterfaceClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// KoreaTour ��ü�� ���� -> Providable �ڷ������� ���� -> TourGuide�� �Ű������� ���
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}

}
