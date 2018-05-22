package com.java2.thread;

import java.util.Random;

public class Snow extends Thread{
	Random random = new Random();
	int x;
	int y;
	public Snow(){
		x = random.nextInt(600);
	}
	
	public void run(){
		//System.out.println(getName() + ":(" + x + "," + y + ")");
		
		y = y-1;
		int movement = random.nextInt(3)-1;
		x = x - movement;
		System.out.print(new String(new char[x]).replaceAll("/0"," "));
		System.out.println("*");
		
		
		
		
	}
	
	
	
	
}
