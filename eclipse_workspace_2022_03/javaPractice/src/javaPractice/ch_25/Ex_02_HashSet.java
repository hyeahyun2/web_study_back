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
			if(stu.stuNum == this.stuNum) { // ������ �й� ������ ���
				return true;
			}
			else { // ������ �й� �������� ���� ���
				return false;
			}
		}
		return false; // Student �ڷ��� �ƴ� ���
	}
}

public class Ex_02_HashSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�")); // �й��� ���Ƽ� ���� x
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.stuNum + "-" + student.name);
		}
	}
}
