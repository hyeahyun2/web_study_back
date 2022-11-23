package javaPractice.ch_13_Account;
class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	public void updateRecord(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return kor + eng + math;
	}
	public double getAverage() {
		return (double)getTotal()/3;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
}
public class LoadStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 이름 : name, 반 : ban, 번호 : no 를 입력받는 생성자
		 * 국어 : kor, 영어 : eng, 수학 : math 성적을 입력받는 updateRecord()메서드
		 * */
		Student s = new Student("홍길동", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}
