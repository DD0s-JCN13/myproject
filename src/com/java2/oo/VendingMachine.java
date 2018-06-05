package com.java2.oo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();
	
	public VendingMachine(){
		
	}
	public void addDrink(int id, String name, int price){
		drinks.add(new Drink(id, name, price));
	}
	public void drinkRecord(){
		Scanner sc = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("Vending.txt",true);
			PrintStream out = new PrintStream(fos);
			System.out.println("Please enter id....");
			int id = sc.nextInt();
			System.out.println("Please enter name....");
			String name = sc.nextLine();
			System.out.println("Please enter price....");
			out.println( id +"/t"+ name);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void reader(){
		try {
			FileInputStream fis = new FileInputStream("Sales.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			String[] token = line.split(",");
			int id = Integer.parseInt(token[0])*2+1;
			int price = Integer.parseInt(token[0])*2+2;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	public void on(){
		
	}
	
	
	
	
}
