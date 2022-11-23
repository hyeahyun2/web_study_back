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
		/* �̸� : name, �� : ban, ��ȣ : no �� �Է¹޴� ������
		 * ���� : kor, ���� : eng, ���� : math ������ �Է¹޴� updateRecord()�޼���
		 * */
		Student s = new Student("ȫ�浿", 1, 1);
		s.updateRecord(100, 60, 76);
		System.out.println(s);
		
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());
	}

}
