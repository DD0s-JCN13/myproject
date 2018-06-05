package com.java2.oo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Bingo {

	List<Integer> numbers = new ArrayList<>();
	int count;
	int row = 5;
	public Bingo(int count){
		this.count = count;
		for (int i=0;i<count;i++){
			numbers.add(i+1);
		}
		Collections.shuffle(numbers);
	}
	
	

	public static void main(String[] args){
		Bingo bingo = new Bingo(25);
	}
}