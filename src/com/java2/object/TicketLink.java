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
	public static void PrintList(){
		System.out.println("票價列表如下：");
		System.out.println("搖滾區票價：中間12000，左右10000");
		System.out.println("普通區票價：中間8000，左右7000");
		System.out.println("後排區票價：中間5000，左右4500");
	}
}
