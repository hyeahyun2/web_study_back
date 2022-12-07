package javaPractice.ch_25;

import java.util.HashSet;

class Member {
	String num;
	String name;
	
	public Member(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return num.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(num.equals(member.num)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return num + ":" + name;
	}
	
}
public class Ex_03_HashSet {
	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("100", "������"));
		set.add(new Member("200", "������"));
		set.add(new Member("300", "�̼���"));
		set.add(new Member("400", "�����"));
		set.add(new Member("100", "ȫ�浿"));
		
		System.out.println(set);
	}
}
