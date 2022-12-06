package javaPractice.ch_25;

import java.util.ArrayList;

/* ArrayList : 배열에서 발전된 형태
 * 요소를 추가하면 0번 인덱스부터 차례대로 저장
 * 메서드를 사용해 원하는 위치에 요소를 추가하거나, 삭제, 반환 할 수 있음
 * */
public class ArrayListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입을 지정하지 않은 형태. 초기 capa 값을 지정할 수도 있음
		ArrayList list1 = new ArrayList(10); 
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("D");
		
		System.out.print("초기상태 : ");
		System.out.println(list1);
		
		System.out.print("인덱스 1 위치에 B 추가 : ");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.print("인덱스 2 위체의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 2번 위치의 값 반환 : " + list1.get(2));
	}

}
