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

	/* hashCode()와 equals() 메서드 재정의 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip)obj;
			// name과 age 값이 같으면 true 반환하도록
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// name과 age값이 같으면 동일한 hashCode 반환
		return name.hashCode() + age; // name의 경우 String의 hashCode() 이용
	}
}

public class HashSetEx3 {
	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new MemberShip("홍길동", 30));
		set.add(new MemberShip("홍길동", 30));
		
		System.out.println("총 객체수: " + set.size());
		// hashCode()와 equals() 메서드 재정의해서 -> 결과 : 1
		// 재정의 없으면 -> 결과 : 2 (new를 이용해 서로 다른 객체 저장했으므로 다른 해시코드를 가짐)
	}

}
