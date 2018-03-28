package com.java2.object;
import java.util.ArrayList;
public class PokerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flowers = Poker2.flowers;
		ArrayList<String> cards = Poker2.ReturnPoker() ;
		for (int i = 0; i<(flowers.length())*13;i++) {
			System.out.println(cards.get(i));
		}
	}

}
