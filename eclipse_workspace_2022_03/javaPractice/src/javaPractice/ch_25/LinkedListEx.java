package javaPractice.ch_25;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList); // 리스트 전체 출력
		
		linkedList.add(1, "D");
		System.out.println(linkedList);
		
		// addFirst(깂) : 맨 앞에 객체 추가. LinkedList에서 사용
		linkedList.addFirst("O");
		System.out.println(linkedList);	
		
		// removeLast(값) : 맨 뒤에 요소 삭제 및 반환. LinkedList에서 사용
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList);
	}
}
