package javaPractice.ch_10_Student;

public class LoadStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setStudentName("안연수");
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.setStudentName("홍길동");
		System.out.println(student2.getStudentName());
	}
}
