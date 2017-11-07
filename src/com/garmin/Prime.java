package com.garmin;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args){
		System.out.println("請輸入一個數字：");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int num = Integer.parseInt(line);
		boolean prime = true;
		for(int n=2;n<num;n++){
			if(num % n == 0){
				//not prime
				prime = false;
				break;
			}
		}
		if(prime){
			System.out.println(num + " NOT PRIME!");
		}
		else{
			System.out.println(num + " IS PRIME!");
		}
		
		
		
		
		
	}

}
