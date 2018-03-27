package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class Arrayls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> cards = new ArrayList<>();
		cards.add(13);
		cards.add(5);
		cards.add(7);
		System.out.println("Removing number: "+cards.remove(0));
		System.out.println(cards.size());
		System.out.println(cards.get(1));
	}

}
