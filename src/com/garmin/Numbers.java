package com.garmin;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		String line = scan.nextLine();
		int k = Integer.parseInt(line);
		int i=1;
		while(i<=k){
			if(i%3== 0){
				i++;
				continue;
			}
			System.out.print(i+ " ");
			i++;
		}
		
		/*for(i=1;i<=k;i++){
			if(i%3 == 0){
				continue;
			}
			System.out.print(i +" ");
		}*/
	}

}
