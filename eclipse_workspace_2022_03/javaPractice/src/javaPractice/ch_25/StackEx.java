package javaPractice.ch_25;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // ����� ����
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len-1)); // �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
	
	// push(E Item) : �־��� ��ü�� ���ÿ� ����
	// peek() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� �������� ����
	// pop() : ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� ����
	// peek ����
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.get(len-1)); // �� �ڿ� �ִ� �ڷ� ��ȯ
	}
}
public class StackEx {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.peek()); // C
		
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("A");
		test.add("B");
		test.add("C");
		
		System.out.println(test.remove("C"));
		System.out.println(test.remove(0));
	}

}
