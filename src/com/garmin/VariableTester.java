package com.garmin;

import java.util.Random;

public class VariableTester {

	 public static void main(String[] args){
		int age = 40;
		float weight = 69.2f;
		char c = 65;
		char c2 = 'Z';
		System.out.println((int)c2);
		/*int i = c2;
		System.out.println(c2);
		*/
		boolean pass = false;
		System.out.println(!pass);
		System.out.println(pass);
		//"!" means to cast the value of boolean
		String s = new String ("Hello");
		System.out.println(s);
		Random r = new Random();
		System.out.println(r.nextInt(6)+1);
		
	 
	 }

}
