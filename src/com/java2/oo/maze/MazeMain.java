package com.java2.oo.maze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MazeMain {
	public static void main(String args[]){
		Maze mz = new Maze();
		FileReader fr;
		int row=0;
		int column=0;
		int trapcount=0;
		List<String> moves = new ArrayList<>();
		try {
			fr = new FileReader("Maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null) {
				String[] token = line.split(",");
				while(token.length<=2) {
					row = Integer.parseInt(token[0]);
					column = Integer.parseInt(token[1]);
				}
				while(token.length<2) {
					trapcount = Integer.parseInt(token[0]);
				}
				while(token.length>2) {
					for(int i=0;i<token.length;i++) {
						moves.add(token[i]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
