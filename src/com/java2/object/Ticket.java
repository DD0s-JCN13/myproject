package com.java2.object;
import java.util.Scanner;
public class Ticket {
	static boolean power=TicketLink.ReturnPower();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketLink[] Tickets = new TicketLink[15];
		Tickets[0]=new TicketLink("MIDRockzone",12000);
		Tickets[1]=new TicketLink("LEFTRockzone",10000);
		Tickets[2]=new TicketLink("RIGHTRockzone",10000);
		Tickets[3]=new TicketLink("MIDNormalzone",8000);
		Tickets[4]=new TicketLink("LEFTNormalzone",7000);
		Tickets[5]=new TicketLink("RIGHTNormalzone",7000);
		Tickets[6]=new TicketLink("MIDFarzone",5000);
		Tickets[7]=new TicketLink("LEFTFarzone",4500);
		Tickets[8]=new TicketLink("RIGHTFarzone",4500);
	while(power){
		TicketLink.PrintList();
	}
}
}
