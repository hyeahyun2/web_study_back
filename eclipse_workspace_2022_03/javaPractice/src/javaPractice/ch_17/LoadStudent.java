package javaPractice.ch_17;

public class LoadStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university = new University("ȫ�浿", 3, 22, "������");
		Elementary elementary = new Elementary("�̼���", 2, "ȫ��");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		for(Student s : students) {
			System.out.println("�л� �̸�: " + s.getName());
			System.out.println(s.getTeacher());
		}
	}
}
