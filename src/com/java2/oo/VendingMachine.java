package com.java2.oo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();
	
	public VendingMachine(){
		
	}
	public void on(){
		System.out.println("Please insert coins....");
		for(int i=0;i<drinks.size();i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());
		}
		System.out.println("Only avaliable for 5,10,50 coin, stop inserting coins press 0....");
		Scanner incoin = new Scanner(System.in);
		int insert = incoin.nextInt();
		int coin = 0;
		boolean c1 = true;
		boolean c2 = false;
		if(c1) {
			switch(insert) {
			case 0:
				c1=false;
				c2=true;
				break;
			case 50:
				coin = coin + 50;
				break;
			case 5:
				coin = coin + 5;
				break;
			case 10:
				coin = coin + 10;
				break;
			default:
				System.out.println("Wrong data, input again...");
				break;
			}
		}
		if(c2) {
			System.out.println("Please enter the id of the drinks you want to buy....");
			System.out.println("(Press 0 to exit, then take the change)");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Remember to the the change, it's "+coin+" dollars");
				break;
			case 1:
			case 2:
			case 3:
				Drink drink = drinks.get(choice);
				if(coin<drink.getPrice()) {
					System.out.println("Not enough money....");
					break;
				}else {
					coin = coin - drink.getPrice();
					System.out.println("Here is your drink, remain "+coin+" dollars");
					break;
				}
			default:
				System.out.println("Wrong data, input again...");
				break;
			}
		}
	}
	
	
	
	
}
