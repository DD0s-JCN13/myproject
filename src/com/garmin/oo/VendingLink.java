package com.garmin.oo;

public class VendingLink {
	int price;
	String name;
	String input;
	static int cash = 0;
	static boolean power = true;
	public VendingLink(String input, String name, int price) {
		input = this.input;
		this.name = name;
		this.price = price;
	}
	public VendingLink(String name, int price){
		this.name= name;
		this.price= price;
	}
	public VendingLink(){
		
	}
	public static boolean ReturnPower() {
		return (power);
	}
	public VendingLink(String input){
		this.input = input;
	}
	public static void PrintList(){
		System.out.println("販賣機餘額:"+cash+"元");
		System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
	}
	public void GetCash(){
		if(input=="0"){
			power = false;
		}
		else if(input=="1"){
			cash = cash + 1;
		}
		else if(input=="5") {
			cash = cash + 5;
		}
		else if(input=="10") {
			cash = cash + 10;
		}
		else{
			power = false;
		}
	}
	public void Cost(){
		input = name;
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
