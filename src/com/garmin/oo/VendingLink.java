package com.garmin.oo;

public class VendingLink {
	public int price;
	public String name;
	public String input;
	public static int cash = 0;
	static boolean power = true;
/*	public VendingLink(String input, String name, int price) {
		this.input = input;
		this.name = name;
		this.price = price;
	}*/
	public VendingLink(String name, int price){
		this.name= name;
		this.price= price;
	}
	public VendingLink(){
		
	}
	public static boolean ReturnPower() {
		return (power);
	}
	public static int getCash(){
		return (cash);
	}
	public static void PrintList(){
		System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
	}
	public void GetCash(){
		if(name=="1"){
			cash = cash + 1;
		}
		else if(name=="5") {
			cash = cash + 5;
		}
		else if(name=="10") {
			cash = cash + 10;
		}
		else{
			power = false;
		}
	}
	public void Cost(){
		if(name=="a"){
			if(cash<price){
				System.out.println("BEEP!");
			}
			else{
				System.out.println("DON!");
				cash = cash - price;
			}
		}
		else if(name=="b"){
			if(cash<price){
				System.out.println("BEEP!");
			}
			else{
				System.out.println("DON!");
				cash = cash - price;
			}
		}
		else if(name=="c"){
			if(cash<price){
				System.out.println("BEEP!");
			}
			else{
				System.out.println("DON!");
				cash = cash - price;
			}
		}
	}

}
