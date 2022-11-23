package javaPractice.ch_15;
/* �Ϲ� ������ Employee Ŭ������ �𵨸�
 * Employee Ŭ������ ��ӹ޾Ƽ� �����ڸ� ��Ÿ���� Manager Ŭ������
 * ���α׷��Ӹ� ��Ÿ���� Programer Ŭ������ �ۼ�.
 * Employee Ŭ���� �ȿ��� ������ ����ϴ� getSalary() �޼��尡 �ִ�
 * �� �޼��带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���޺��� �ٸ� ������ ��ȯ�ϵ���.
 * �������̵��� �� �� Employee Ŭ������ baseSalary�� ����϶�
 * */
class Employee {
	public int baseSalary = 3000000;
//	private int baseSalary = 3000000;
	int getSalary() {
		return baseSalary;
	}
}
class Manager extends Employee {
//	private int salary = 2000000;
	int getSalary() {
		return baseSalary + 2000000;
//		return super.getSalary() + salary;
	}
}
class Programer extends Employee {
//	private int salary = 3000000;
	int getSalary() {
		return baseSalary * 3000000;
//		return super.getSalary() + salary;
	}
}
public class Ex_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("�������� ���� : " + manager.getSalary());
		//5000000
		
		Programer programer = new Programer();
		System.out.println("���α׷����� ���� : " + programer.getSalary());
		// 6000000
	}
}
