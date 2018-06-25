package com.java2.oo.maze;

public class Maze {

	
	public Maze(){
		
	}
	class maze{
		int row,col,trapCount;
		int[] traps;
		Player player;
		String[] moves;
		public maze(int col, int row , int trapCount){
			this.col = col;
			this.row = row;
			this.trapCount = trapCount;
		}
		public maze(String[] moves) {
			this.moves = moves;
		}
	}
	class Player{
		int hp = 100;
		int pos = 0;
	}
	
	
	
}
