package com.garmin;

import java.util.Scanner;

public class Question_2EditedVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入想要的梯形邊長：");
		String request = scanner.nextLine();
		int code = Integer.parseInt(request);
		for (int i=1;i<=code;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for (int k=code-i;k>=1;k--) {
				System.out.print("#");
			}
			if (i<code) {
				System.out.println();
			}
		}
		
		
		
		
	}

}
