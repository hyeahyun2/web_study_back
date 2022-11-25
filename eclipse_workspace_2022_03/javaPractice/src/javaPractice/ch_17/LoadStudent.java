package javaPractice.ch_17;

public class LoadStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University university = new University("홍길동", 3, 22, "차범근");
		Elementary elementary = new Elementary("이순신", 2, "홍명보");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		for(Student s : students) {
			System.out.println("학생 이름: " + s.getName());
			System.out.println(s.getTeacher());
		}
	}
}
