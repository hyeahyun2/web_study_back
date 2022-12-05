package javaPractice.ch_22;

import java.util.HashMap;

/* Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������ؼ�
 * Student�� �й� studentNum�� ������ ���� ��ü�� �� �� �ֵ��� �϶�.
 * hashCode()�� ���� ���� studentNum �ʵ� ���� �ؽ��ڵ带 �����ϵ���.
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
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����.
		HashMap<MyStudent, String> hashMap = new HashMap<MyStudent, String>();
		
		// new Student("1")�� ���� 95�� ����
		hashMap.put(new MyStudent("1"), "95");
		
		String score = hashMap.get(new MyStudent("1"));
		System.out.println("1�� �л��� ���� : " + score);
	}
}
