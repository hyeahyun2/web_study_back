package javaPractice.ch_22;
class Comp {
	String name;
	Comp(String name){
		this.name = name;
	}
}
public class ObjectEquals {
	public static void main(String[] args) {
		/* boolean equals(Object obj) : �� �ν��Ͻ��� �������� ���θ� ��ȯ.
		 * �������Ͽ� �������� ������ �ν��Ͻ����� ������ �� ����.
		 * equals() �޼����� ���� ����� �� �ν��Ͻ��� �ּҰ��� ����Ͽ� boolean���� ��ȯ���ִ� ��
		 * �ּ� ���� ���ٸ� �翬�� ���� �ν��Ͻ�������, 
		 * ���� �ٸ� �ּҸ� ���� ���� ���� �ν��Ͻ���� ������ �� �ִ� ��찡 ����
		 * ���� ������ ���ϼ�(�ν��Ͻ��� �޸� �ּҰ� ����)�� �ƴ϶�
		 * ���� ���ϼ�(�������� �� �ν��Ͻ��� ����)�� ������ ���� equals() �޼��带 �������Ͽ� ���
		 * */
		Comp comp1 = new Comp("��1");
		Comp comp2 = new Comp("��1");
		System.out.println(comp1 == comp2); // false
		System.out.println(comp1.equals(comp2)); // false
		// (ObjectŬ�������� equals�޼ҵ�� �� ������ ==�� ����)
		
		// String, integer Ŭ������ equals() �޼��� ������
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2)); // true
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // true
		
		i1 = i2;
		System.out.println(i1 == i2); // true
	}

}
