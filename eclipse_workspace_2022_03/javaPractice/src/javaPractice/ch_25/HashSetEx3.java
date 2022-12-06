package javaPractice.ch_25;

import java.util.HashSet;
import java.util.Set;

class MemberShip {
	public String name;
	public int age;

	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/* hashCode()�� equals() �޼��� ������ */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip)obj;
			// name�� age ���� ������ true ��ȯ�ϵ���
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// name�� age���� ������ ������ hashCode ��ȯ
		return name.hashCode() + age; // name�� ��� String�� hashCode() �̿�
	}
}

public class HashSetEx3 {
	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new MemberShip("ȫ�浿", 30));
		set.add(new MemberShip("ȫ�浿", 30));
		
		System.out.println("�� ��ü��: " + set.size());
		// hashCode()�� equals() �޼��� �������ؼ� -> ��� : 1
		// ������ ������ -> ��� : 2 (new�� �̿��� ���� �ٸ� ��ü ���������Ƿ� �ٸ� �ؽ��ڵ带 ����)
	}

}
