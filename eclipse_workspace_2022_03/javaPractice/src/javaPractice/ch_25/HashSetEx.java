package javaPractice.ch_25;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		// 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관 없음
		System.out.println(hashSet);
	}
}
