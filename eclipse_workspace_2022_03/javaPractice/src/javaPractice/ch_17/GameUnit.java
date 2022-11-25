package javaPractice.ch_17;

public class GameUnit {
	static int bossPower = 2000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;
	
	private GameUnit(String name){
		weapon = new MyWeapon();
		weapon.charge(unitPower);
		this.name = name;
	}
	void attack(int power) {
		weapon.fire(power);
		bossPower -= power;
		if(weapon.getRestPower()==0) {
			weapon.charge(unitPower);
		}
		System.out.println(name + " : " +weapon.getRestPower());
		System.out.println("bossPower : " + GameUnit.bossPower);
		if(GameUnit.bossPower < 0) {
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		while(true) {
			unit1.attack(500);
			unit2.attack(50);
		}
	}

}
