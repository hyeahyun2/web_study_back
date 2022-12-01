package javaPractice.ch_22;

public class ObjectHashCode {
	public static void main(String[] args) {
		/* int hashCode() : �޸𸮿� ������ �ν��Ͻ��� �ּڰ��� ������ �Ϸù�ȣ�� ����� ��ȯ�ϴ� �ڵ�
		 * equals(Object obj)�� �Ǵ� ������ �ؽ� �ڵ� ���̰� �� ���� hashCode()���� ������ ��.
		 * ��ü�� �ؽ� �ڵ� ���� ��ȯ.
		 * 
		 * �ڹٿ����� �ν��Ͻ��� �� �޸𸮿� �����Ͽ� ������ �� �ؽ� �˰����� ���
		 * Object Ŭ������ toString() �޼��� ������ �ٽ� ���캸��
		 * getClass().getName() + "@" + Integer.toHexString(hasCode())
		 * �� �츮�� ���������� ����� �� �� 16���� ���� ���� '�ؽ� �ڵ尪'�̰�,
		 * �� ���� �ڹٰ���ӽ��� �� �޸𸮿� ������ '�ν��Ͻ� �ּ� ��'.
		 * �׷��� �ڹٿ����� �� �ν��Ͻ��� ���ٸ� hashCode()���� ��ȯ�ϴ� �ؽ��ڵ� ���� ���ƾ� ��
		 * */
		Comp comp1 = new Comp("��1");
		Comp comp2 = new Comp("��1");
		System.out.println(comp1.hashCode()); // 852687460
		System.out.println(comp2.hashCode()); // 495792375
		
		// String, integer Ŭ������ hashCode() �޼��� ������
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode()); // 96354
		System.out.println(str2.hashCode()); // 96354
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode()); // 100
		System.out.println(i2.hashCode()); // 100
	}

}
