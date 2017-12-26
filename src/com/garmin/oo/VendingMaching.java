package com.garmin.oo;
import java.util.Scanner;
public class VendingMaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power = VendingLink.power;
		VendingLink[] Drinks = new VendingLink[10];
		Drinks[0]=new VendingLink("a",15);
		Drinks[1]=new VendingLink("b",20);
		Drinks[2]=new VendingLink("c",30);
		Scanner input = new Scanner(System.in);
		do{
			String in = input.nextLine();
			VendingLink input1 = new VendingLink(in);
			input1.PrintList();
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
				input1.GetCash();
			}
		}while(power);
	}
}
