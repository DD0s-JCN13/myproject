package com.java2.object;
import java.util.ArrayList;
import java.util.Random;
public class Poker2 {
	
	Random random = new Random();
	public static ArrayList<String> cards = new ArrayList<>(); 
	public static String flowers = "SHDC";
	public  void poker(){
		for (int i = 0;i< flowers.length();i++){
			for (int j = 1;j <= 13; j++){
				cards.add(flowers.charAt(j)+"i");
			}
		}
	}
	public  static ArrayList<String> ReturnPoker() {
		return cards;
	}
	
	
}


