package com.java2.thread;

public class RacingNG {
	public static void main(String args[]){
		int horse1 = 0;
		int horse2 = 0;
		for (int i=0; i<50000; i++){
			horse1 = horse1 + 1;
			horse2 = horse2 + 1;
			System.out.println("horse1: "+horse1);
			System.out.println("horse2: "+horse2);
			
		}
		
		
	}

}
