package com.java2.oo;

public class MazeMain {

	public MazeMain(){
		
		
	}
	
	public static void main(String[] args){
		new MazeMain();
	}
	
	class Maze{
		int row,col,trapCount;
		int[] traps;
		Player player;
	}
	
	public Maze(int col, int row , int trapCount){
		this.col = col;
		this.row = row;
		this.trapCount = trapCount;
		
	}
	
	class Player{
		int hp = 100;
		int pos = 0;
	}
	
}
