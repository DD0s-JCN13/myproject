package com.garmin.oo;
import java.util.Scanner;
import com.garmin.oo.VendingLink;
public class VendingMaching{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		VendingLink[] Drinks = new VendingLink[6];
		Drinks[0]=new VendingLink("a",15);
		Drinks[1]=new VendingLink("b",20);
		Drinks[2]=new VendingLink("c",30);
		Drinks[3]=new VendingLink("1",1);
		Drinks[4]=new VendingLink("5",5);
		Drinks[5]=new VendingLink("10",10);
		boolean power = VendingLink.ReturnPower();
		while(power) {
			int cash = VendingLink.getCash();
			Scanner input = new Scanner(System.in);
			System.out.println("販賣機餘額:"+cash+"元");
			VendingLink.PrintList();
			String in = input.nextLine();
			/*if(in=="a"){
				Drinks[0].Cost();
			}
			else if(in=="b"){
				Drinks[1].Cost();
			}
			else if(in=="c"){
				Drinks[2].Cost();
			}
			else if(in=="1"){
				Drinks[3].GetCash();
			}
			else if(in=="5"){
				Drinks[4].GetCash();
			}
			else if(in=="10"){
				Drinks[5].GetCash();
			}
			else{
				power = false;
			}*/
			switch(in){
				case "1":
					VendingLink.cash= cash +1;
					break;
				case "5":
					VendingLink.cash= cash +5;
					break;
				case "10":
					VendingLink.cash= cash +10;
					break;
				case "a":
					Drinks[0].Cost();
					break;
				case "b":
					Drinks[1].Cost();
					break;
				case "c":
					Drinks[2].Cost();
					break;
				default:
					power = false;
					break;
			}
		}
		//do{
		//	break;
		//}while(!power);
	}
}

