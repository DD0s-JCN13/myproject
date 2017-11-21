package com.garmin;

public class ScoreTester {
	public static void main(String[] args){
		int score = 59;
		int level = score/10;
		if(level<=10){
			switch(level){
				case 6:
					System.out.println("Passed");
					break;
				case 7:
					System.out.println("Good");
					break;
				case 8:
					System.out.println("Great");
					break;
				case 9:
				case 10:
					System.out.println("Excellent");
					break;
				default:
					System.out.println("Failed");
					break;
			}
		}
	}
}
