package com.java2.object;

public class ABgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secret = "6479";
		String  nums = "5437";
		int A = 0;
		int B = 0;
		int length = secret.length();
		for (int i=0; i<length; i++) {
			for (int j=0; j<length; j++) {
				char c = secret.charAt(i);
				if (c == nums.charAt(j)) {
					if( i == j) {
						A++;
					}
					else {
						B++;
					}
				}
			}
			if(i<=4) {
				System.out.print(nums.charAt(i)+" ");
			}
			else {
				System.out.println(nums.charAt(i)+" ");
			}
			if(i==5) {
				for (int k=0;k<=5;k++) {
					if(k<5) {
						System.out.print(secret.charAt(k)+" ");
					}
					else {
						System.out.println(secret.charAt(k));
					}
				}
			}
		}
		System.out.print(A+"A"+B+"B");
	}
}
