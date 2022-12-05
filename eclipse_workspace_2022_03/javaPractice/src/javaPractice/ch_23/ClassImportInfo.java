package javaPractice.ch_23;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* Class Ŭ������ Ȱ���� Ŭ���� ���� �˾ƺ���.
 * ���α׷����� �ϴ� ���� ����� Ŭ������ �ڷ����� �𸣴� ��쿡 ���
 * Class Ŭ������ ������ �� �ִٸ� �ش� Ŭ������ ����, 
 * �� ������, �޼���, ��� ���� ������ ã�� �� ����.
 * 
 * ���÷��� reflection : Ŭ������ �ڷ����� �𸣴� ���¿��� Class Ŭ������ Ȱ���Ͽ�
 * �� Ŭ������ ������ ��������, �� ������ Ȱ���Ͽ� �ν��Ͻ��� �����ϰų� �޼��带 ȣ���ϴ� ���.
 * 
 * �������� ����ϴ� Constructor, Method, Field ���� Ŭ������ 
 * java.lang.reflect ��Ű���� ���� �Ǿ� ����.
 * Class Ŭ������ java.lang.reflect ��Ű���� Ŭ������ ����Ϸ��� ���÷��� ���α׷����� ����.
 * */

public class ClassImportInfo {
	public static void main(String[] args) throws ClassNotFoundException {
		/* String Ŭ������ ���� �������� */
//		Class strClass = Class.forName("java.lang.String"); // Ŭ���� �̸�����
		Class strClass = Class.forName("javaPractice.ch_23.Person");
		
		Constructor[] constructors = strClass.getConstructors(); // ��� ������ ��������
		System.out.println("* ��� ������ ��������");
		for(Constructor c : constructors) { 
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("* ��� ��� ����(�ʵ�) ��������");
		Field[] fields = strClass.getFields(); // ��� ��� ����(�ʵ�) ��������
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		System.out.println("* ��� �޼��� ��������");
		Method[] methods = strClass.getMethods(); // ��� �޼��� ��������
		for(Method m : methods) {
			System.out.println(m);
		}
	}	
}