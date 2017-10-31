package com.garmin;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
	/*System.out.println("請輸入一個數字:");	
	Scanner scanner =  new Scanner(System.in);
	String k = scanner.nextLine();
	int z = Integer.parseInt(k);
	//int s = 19;
	if (z % 2 == 1){
		System.out.println("是奇數");
	}
	else if (z % 2 == 0){
		System.out.println("是偶數");
	}*/
	String line;
	Scanner scanner = new Scanner(System.in);
	System.out.println("請問您幾歲了??");
	line = scanner.nextLine();
	int age = Integer.parseInt(line);
	if (age < 12){
		System.out.println("是小學嗎?");}
	else if (age < 15){
		System.out.println("是國中嗎?");}
	else if (age < 18){
		System.out.println("是高中嗎?");}
	else{
		System.out.println("有在工作了嗎?");}
	
	}

}
