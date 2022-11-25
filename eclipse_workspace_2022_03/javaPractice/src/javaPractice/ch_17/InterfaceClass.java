package javaPractice.ch_17;

interface Providable {
	// public abstract 생략됨
	void leisureSports();
	void sightseeing();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}
class TourGuide {
	private Providable tour;
	TourGuide(Providable providable){
		tour = providable;
	}
	// 오버라이딩 아님.
	public void leisureSports() {
		tour.leisureSports(); // providable자료형의 메소드 호출
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
		// KoreaTour 객체를 생성 -> Providable 자료형으로 변경 -> TourGuide의 매개변수로 사용
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
	}

}
