package javaPractice.ch_25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
	public static void main(String[] args) {
		/* String 객체를 중복 없이 저장하는 HashSet */
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한 번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		System.out.println("forEach 문으로 출력 시작");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while(iterator.hasNext()) { // 객체 수만큼 루핑
			String element = iterator.next(); // 1개의 객체를 가져 옴
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC"); // 1개의 객체 삭제
		set.remove("iBATIS"); // 1개의 객체 삭제
		
		System.out.println("총 객체수: " + set.size());
		
		System.out.println("forEach 문으로 출력 시작");
		for(String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear(); // 모든 객체를 제거하고 비움.
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
