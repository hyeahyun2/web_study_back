package javaPractice.ch_15;

public class Pet {
	private String name; // 애완동물 이름
	private String masterName; // 주인 이름
	public Pet(String name, String masterName) {
		super();
		this.name = name;
		this.masterName = masterName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public void introduce() { // 자기소개
		System.out.println("* 내 이름은 " + name + "입니다!");
		System.out.println("* 주인님은 " + masterName + "입니다!");
	}
}
