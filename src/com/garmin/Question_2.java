package com.garmin;
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入你想要的等腰三角形股長：");
		String code = scanner.nextLine();
		int h = Integer.parseInt(code);
		for(int i=1;i<=h;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			if(i<h){
				System.out.println(" ");
			}
			
		}
	}

}
