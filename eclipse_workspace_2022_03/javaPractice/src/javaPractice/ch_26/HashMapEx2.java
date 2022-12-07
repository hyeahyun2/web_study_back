package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Map;

class Student { // 학번과 키가 같다면 동일한 키로 인식
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return sno + name.hashCode();
		return sno;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
//			return (sno == student.sno) && (name.equals(student.name));
			return (sno == student.sno);
		}
		else {
			return false;
		}
	}
}
public class HashMapEx2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "박유신"), 85);
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
