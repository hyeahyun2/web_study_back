package javaPractice.ch_17;

public interface Weapon {
	// 파라미터 파워로 무기 발사
	public void fire(int power); 
	// 현재 남아있는 파워 리턴
	public int getRestPower(); 
	// 파라미터만큼 무기 파워 충전
	public void charge(int power); 
}

class MyWeapon implements Weapon {
	int curPower;
	public MyWeapon() {
		super();
		this.curPower = 0;
	}
	public MyWeapon(int curPower) {
		super();
		this.curPower = curPower;
	}
	@Override
	public void fire(int power) {
		this.curPower -= power;
	}
	@Override
	public int getRestPower() {
		return curPower;
	}
	@Override
	public void charge(int power) {
		this.curPower += power;
	}
}