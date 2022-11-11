package javaPractice.ch_08;

public class CalByRef {
	public void increase(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] refArray = {100, 800, 1000};
		
		CalByRef ref = new CalByRef();
		
		System.out.println("메서드 호출 전");
		for(int i=0; i<refArray.length; i++) {
			System.out.println("refArray[" + i + "] : " + refArray[i]);
		}
		
		ref.increase(refArray);
		System.out.println();
		System.out.println("메서드 호출 후");
		for(int i=0; i<refArray.length; i++) {
			System.out.println("refArray[" + i + "] : " + refArray[i]);
		}
	}
}
