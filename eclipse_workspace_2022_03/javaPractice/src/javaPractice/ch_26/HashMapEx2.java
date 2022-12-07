package javaPractice.ch_26;

import java.util.HashMap;
import java.util.Map;

class Student { // �й��� Ű�� ���ٸ� ������ Ű�� �ν�
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
		
		// �й��� �̸��� ������ Student�� Ű�� ����
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "������"), 85);
		
		System.out.println("�� Entry �� : " + map.size());
	}
}
