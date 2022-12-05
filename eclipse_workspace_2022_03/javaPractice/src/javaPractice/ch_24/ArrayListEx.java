package javaPractice.ch_24;

import java.util.ArrayList;

/* 요즘은 제네릭을 쓰지만 동적 배열인 ArrayList를 타입 인수없이 사용해보면
 * 다른 자료형인 정수와 문자열을 저장하지만 다 Object의 후손이므로 저장에는 문제 없음.
 * 하지만 요소를 꺼낼때는 일일이 캐스팅을 해야 함.
 * */
public class ArrayListEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		int value = (int)arNum.get(0);
//		int temp = (int)arNum.get(1);
		System.out.println(value);
	}

}
