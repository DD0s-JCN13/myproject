package com.java2.oo.maze;

public class Maze {

	
	public Maze(){
		
	}
	class maze{
		int row,col,trapCount;
		int[] traps;
		Player player;
		public maze(int col, int row , int trapCount){
			this.col = col;
			this.row = row;
			this.trapCount = trapCount;
		}
	}
	class Player{
		int hp = 100;
		int pos = 0;
	}
	
	
	
}
