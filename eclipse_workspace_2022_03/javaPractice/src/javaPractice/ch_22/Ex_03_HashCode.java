package javaPractice.ch_22;

import java.util.HashMap;

/* Student 클래스를 작성하되, Object의 equals()와 hashCode()를 재정의해서
 * Student의 학번 studentNum이 같으면 동등 객체가 될 수 있도록 하라.
 * hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴하도록.
 * */
class MyStudent {
	private String studentNum;

	public MyStudent(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyStudent) {
			MyStudent std = (MyStudent)obj;
			if(studentNum.equals(std.getStudentNum())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
//		return Integer.parseInt(studentNum);
	}
	
}
public class Ex_03_HashCode {
	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체 생성.
		HashMap<MyStudent, String> hashMap = new HashMap<MyStudent, String>();
		
		// new Student("1")의 점수 95를 저장
		hashMap.put(new MyStudent("1"), "95");
		
		String score = hashMap.get(new MyStudent("1"));
		System.out.println("1번 학생의 총점 : " + score);
	}
}
