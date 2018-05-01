package com.java2.collection;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class Tester {

	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(2);
		list.add(5);
		list.add(2);
		System.out.println(list);
		Set<Integer> set = new HashSet<>();
		set.add(7);
		set.add(2);
		set.add(5);
		set.add(2);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Lincy");
		set2.add("Tony");
		set2.add("Macie");
		set2.add("Tony");
		System.out.println(set2);
		Map<String, String> stocks = new TreeMap<>();
		stocks.put("APPl", "Apple co.");
		stocks.put("NVDA", "Nvidia co.");
		stocks.put("BILI", "Bili Bili media");
		System.out.println(stocks);
		
		
		
		
	}
	
	
	
}
