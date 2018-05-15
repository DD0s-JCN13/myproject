package com.java2.thread;

import java.util.ArrayList;
import java.util.List;

public class Racing {
	public static void main (String args[]){
		/*List<Horse> horses = new ArrayList<>();
		for (int i = 0; i< 2; i++){
			Horse h = new Horse();
			horses.add(h);
			h.start();
		}*/
		Horse h1 = new Horse(h1);
		h1.run();
		HorseRunable h2 = new HorseRunable();
		Thread thr = new Thread(h2);
		thr.start();
		
		try {
			h1.join();
			thr.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print("The Race finished");
		
	}
}
