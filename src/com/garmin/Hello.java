package com.garmin;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
/*		System.out.println("Hello World");

		
		Person p = new Person();
		p.sayhello();
	*/
	System.out.println("請輸入你的姓名:");
	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	System.out.println("Identity confirm: "+ line);
	System.out.println("今年幾歲啦??");
	line = scanner.nextLine();
	int age = Integer.parseInt(line);
	System.out.println(age);
	System.out.println(age > 25);
	
	
	}

}
