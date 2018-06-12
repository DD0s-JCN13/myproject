package com.java2.oo.maze;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {
	public static void main(String args[]){
		Maze mz = new Maze();
		FileReader fr;
		try {
			fr = new FileReader("Maze.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			String[] token1 = line.split("\t");
			String[] token2 = token1[0].split(",");
			String[] token3 = token1[2].split(",");
			int col = Integer.parseInt(token2[0]);
			int row = Integer.parseInt(token2[1]);
			int trapcount = Integer.parseInt(token1[1]);
			mz.new maze(col,row,trapcount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	
	
	}
}
