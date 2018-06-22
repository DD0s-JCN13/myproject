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
			Bingo bingo = null;
			while(line!=null) {
				String[] token = line.split(",");
				if(token.length<2) {
					bingo = new Bingo(Integer.parseInt(token[0]));
				}else {
					for(int i=0; i<token.length;i++) {
						bingo.lucky.add(token[i]);
					}
				}
			}
			bingo.on();
			
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
