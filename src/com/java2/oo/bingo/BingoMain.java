package com.java2.oo.bingo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BingoMain {
	public static void main(String[] args){
		FileInputStream fis;
		try {
			fis = new FileInputStream("Bingo.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			String[] token1 = line.split(",");
			line = in.readLine();
			String[] token2 = line.split(",");
			Bingo bingo = new Bingo(Integer.valueOf(token1[0]));
			for(int i=0; i<token2.length;i++) {
				bingo.lucky.add(token2[i]);
			}
			bingo.on();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
