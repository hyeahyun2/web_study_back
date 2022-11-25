package javaPractice.ch_17;

public interface Weapon {
	// �Ķ���� �Ŀ��� ���� �߻�
	public void fire(int power); 
	// ���� �����ִ� �Ŀ� ����
	public int getRestPower(); 
	// �Ķ���͸�ŭ ���� �Ŀ� ����
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