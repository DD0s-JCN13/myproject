package com.garmin.oo;

public class VendingLink {
	int price;
	String name;
	String input;
	int cash;
	static boolean power = true;
	public VendingLink(String name, int price){
		this.name= name;
		this.price= price;
	}
	public VendingLink(String input){
		this.input = input;
	}
	public void PrintList(){
		System.out.println("販賣機餘額:"+cash+"元");
		System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
	}
	public void GetCash(){
		if(input=="0"){
			power = false;
		}
		else if(input=="1"||input=="5"||input=="10"){
			int instant = Integer.parseInt(input);
			cash = cash + instant;
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
