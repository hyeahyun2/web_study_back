package javaPractice.ch_25;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // 저장된 개수
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
	
	// push(E Item) : 주어진 객체를 스택에 넣음
	// peek() : 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거하지 않음
	// pop() : 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거
	// peek 구현
	public String peek() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.get(len-1)); // 맨 뒤에 있는 자료 반환
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
