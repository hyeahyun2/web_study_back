package javaPractice.ch_05;

public class RandomLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// random�Լ� �̿��ؼ� �ζǹ�ȣ ���ϱ�
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1; // 1���� 45���� �� �迭�� �Է�
		}
		for(int i=0; i<10000; i++) {
			int j = (int)(Math.random() * ball.length); // 0~44
			// �迭 ���� ����
			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i<6; i++) { // �迭 �ε�����ȣ �� 6�� ���
			System.out.print(ball[i] + " ");
		}
	}

}
