package com.java2.object;
import java.util.Scanner;
public class ABnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String secret = "9487";
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter ur answer:");
			ABgame n = new ABgame(input.nextLine());
			result = n.validate(secret); 
			System.out.println((result)/10+"A"+(result)%10+"B");
			
		}
	}

}
