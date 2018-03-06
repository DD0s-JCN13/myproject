package com.java2.object;

public class TicketLink {
	public int price;
	public String Zonename;
	public String input;
	public static int cash=0;
	static boolean power = true;
	
	public TicketLink(String Zonename, int price){
		this.Zonename= Zonename;
		this.price= price;
	}
	
	public TicketLink(){
	
	}
	
	public static boolean ReturnPower(){
		return(power);
	}
	public static int getCash(){
		return(cash);
	}
	
}
