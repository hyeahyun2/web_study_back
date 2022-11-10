package javaPractice.ch_07;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3명의 신장, 체중, 나이의 최대값 구하기
		Scanner stdIn = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print("[" + (i+1) + "]");
			System.out.print("신장 : "); height[i] = stdIn.nextInt();
			System.out.print("   체중 : "); weight[i] = stdIn.nextInt();
			System.out.print("   나이 : "); age[i] = stdIn.nextInt();
		}
		
		// 신장의 최대값
		int maxHeight = height[0];
		if(height[1] > maxHeight) maxHeight = height[1];
		if(height[2] > maxHeight) maxHeight = height[2];

		// 체중의 최대값
		int maxWeight = weight[0];
		if(weight[1] > maxWeight) maxWeight = weight[1];
		if(weight[2] > maxWeight) maxWeight = weight[2];
		
		// 나이의 최대값
		int maxAge = age[0];
		if(age[1] > maxAge) maxAge = age[1];
		if(age[2] > maxAge) maxAge = age[2];
		
		System.out.println("신장의 최대값 : " + maxHeight);
		System.out.println("체중의 최대값 : " + maxWeight);
		System.out.println("나이의 최대값 : " + maxAge);
	}
}
