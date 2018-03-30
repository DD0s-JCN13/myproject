package com.java2.object;
import java.util.ArrayList;
import java.util.Random;
public class Poker2 {
	
	Random random = new Random();
	public static ArrayList<String> cards = new ArrayList<>(); 
	public static String flowers = "SHDC";
	public Poker2(){
		for (int i = 0;i< flowers.length();i++){
			for (int j = 1;j <= 13; j++){
				String tmpi = String.valueOf(j);
				cards.add(i,flowers.charAt(i)+tmpi);
				if(j%13!=0) {
					System.out.print(cards.get(i)+" ");
				}
				else {
					System.out.println(cards.get(i));
				}
			}
		}
	}
	
	public void Suffle() {
		for (int i = 0; i < cards.size(); i++) {
			int ram = random.nextInt(53-1);
			String tmp = cards.get(i);
			String tmp2 = cards.get(ram);
			cards.set(ram, tmp);
			cards.set(i, tmp2);
			
		}
	}
	public void Show() {
		for (int i = 0; i< cards.size(); i++) {
			if ((i+1) % 13 == 0) {
				System.out.println(cards.get(i));
			}else {
				System.out.print(cards.get(i)+" ");
			}
		}
	}
	
	
}


