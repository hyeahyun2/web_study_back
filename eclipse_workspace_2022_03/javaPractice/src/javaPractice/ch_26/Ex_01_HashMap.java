package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// HashMap에 아이디(String)와 점수(Integer)가 저장되어 있음
// 실행 결과와 같이 평균 점수 출력하고, 최고점수와 최고점수를 받은 아이디 출력하기
/* 실행 결과 :
 * 평균 점수 : 91
 * 최고 점수 : 96
 * 최고 점수를 받은 아이디 : blue
 * */
public class Ex_01_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			if(maxScore < value) { 
				maxScore = value; // 최고 점수
				name += (key + " "); // 최고 점수 받은 아이디
			} 
			totalScore += value; // 점수 합계
		}
		
		System.out.println("평균 점수 : " + totalScore/map.size()); // 평균
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
	}

}
