package com.garmin.oo;
import java.util.Scanner;
import com.garmin.oo.VendingLink;
public class VendingMaching{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		boolean power = VendingLink.ReturnPower();
		while(power) {
		VendingLink[] Drinks = new VendingLink[4];
		Drinks[0]=new VendingLink("a",15);
		Drinks[1]=new VendingLink("b",20);
		Drinks[2]=new VendingLink("c",30);
		Scanner input = new Scanner(System.in);
		VendingLink.PrintList();
		String in = input.nextLine();
		VendingLink income = new VendingLink(in);
		if(in=="a"){
			Drinks[0].Cost();
		}
		else if(in=="b"){
			Drinks[1].Cost();
		}
		else if(in=="c"){
			Drinks[2].Cost();
		}
		else{
			income.GetCash();
		}
		power = VendingLink.ReturnPower();
		}
	}
}
