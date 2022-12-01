package javaPractice.ch_22;
class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}
	// equals() �޼��� ������. �й��� ������ ���� �л����� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) { // �ؽ��ڵ� ���� ��
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() { // �ؽ��ڵ� ������ �й��� ��ȯ�ϵ��� �޼��� ������
		// TODO Auto-generated method stub
		return studentID;
	}
}

public class ObjectHashCode2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		/* ������ �ּ��� �� �ν��Ͻ� �� */
		if(studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		} // �����ϴ�.
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		} // �����մϴ�.
		
		/* ������������ �ν��Ͻ��� �ּҰ� �ٸ� ��� */
		// �ּҴ� �ٸ����� equals�� ����� true�� ���
		if(studentLee == studentSang) {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		} // �ٸ��ϴ�.
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		}
		else {
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		} // �����մϴ�.
		
		System.out.println("studentLee�� hashCode : " + studentLee.hashCode());
		System.out.println("studentSang�� hashCode : " + studentSang.hashCode());

		System.out.println("studentLee�� ���� �ּҰ� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּҰ� : " + System.identityHashCode(studentSang));
	}

}
