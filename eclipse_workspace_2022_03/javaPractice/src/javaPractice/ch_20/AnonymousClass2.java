package javaPractice.ch_20;
interface Anony {
	public void print();
}
public class AnonymousClass2 {
	public void printB(Anony a) { // �������̽� AnonyŸ���� ��ü�� �Ű������� �޴� �޼���
		a.print();
	}
	/* �ʿ��� ������ �������̽��� ���� Ŭ������ �ν��Ͻ��� ���� �������� �߻�޼��带 ������ �Ŀ� ���
	 * �ڹٳ� �ȵ���̵忡�� ������ ������� �͸��� ���� Ŭ������ �̿��Ͽ� ȭ�鿡�� �̺�Ʈ�� ó����
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousClass2 t = new AnonymousClass2();
		// Anony Ŭ���� �ν��Ͻ��� �� �κп��� �Ͻ������� ���Ǿ� ����.
		t.printB(new Anony() {
			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ��� ���Դϴ�.");
			}
			
		});
		t.printB(new Anony(){
			@Override
			public void print() {
				System.out.println("�ι�° �͸� Ŭ���� ���!");
			}
		});
	}

}
