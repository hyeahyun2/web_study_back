package javaPractice.ch_25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	int stuNum;
	String name;
	
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return stuNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student)obj;
			if(stu.stuNum == this.stuNum) { // 동일한 학번 존재할 경우
				return true;
			}
			else { // 동일한 학번 존재하지 않을 경우
				return false;
			}
		}
		return false; // Student 자료형 아닐 경우
	}
}

public class Ex_02_HashSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우")); // 학번이 같아서 저장 x
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.stuNum + "-" + student.name);
		}
	}
}
