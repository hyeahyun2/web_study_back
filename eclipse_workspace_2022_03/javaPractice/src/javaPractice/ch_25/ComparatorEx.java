package javaPractice.ch_25;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return (o1.compareTo(o2)) * -1; // 오름차순을 내림차순으로 변경
	}
}
public class ComparatorEx {
	public static void main(String[] args) {
		// TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달함.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
	}
}
