package com.garmin;

public class LoopPrinter {
	
	
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			/*if( i<=1 ){
				System.out.print("    ");
				System.out.print("*");
				System.out.println("    ");
			}
			else if(i<=2){
				System.out.print("   ");
				System.out.print("***");
				System.out.println("   ");
			}
			else if(i<=3){
				System.out.print("  ");
				System.out.print("*****");
				System.out.println("  ");
			}
			else if(i<=4){
				System.out.print(" ");
				System.out.print("*******");
				System.out.println(" ");
			}
			else {
				System.out.println("*********");
			}
			*/
			for(int n=i+1;n<=5;n++){
				System.out.print(" ");
			}
			for(int n=(2*i)-1;n>=1;n--){
				System.out.print("*");
			}
			for(int n=i+1;n<=5;n++){
				if(n<5){
					System.out.print(" ");
				}
				else{
					System.out.println(" ");
				}
			}
		}
	}
}
