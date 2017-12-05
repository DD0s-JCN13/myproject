package com.garmin;

public class ScoreSaver {
	public static void main (String args[]){
		int n[][]=new int[5][3];
		//前為學生順序，後依序為國英數
		n[0][0]=67;
		n[0][1]=73;
		n[0][2]=94;		
		n[1][0]=82;
		n[1][1]=66;
		n[1][2]=37;		
		n[2][0]=94;
		n[2][1]=47;
		n[2][2]=58;		
		n[3][0]=62;
		n[3][1]=49;
		n[3][2]=59;		
		n[4][0]=73;
		n[4][1]=52;
		n[4][2]=69;
		for(int i=0;i<5;i++){
			for(int j=0;j<3;j++){
				if(j<2){
					if(n[i][j]<60){
						System.out.print(n[i][j] + "* ");
					}
					else{
						System.out.print(n[i][j] + " ");
					}
				}
				else if(j==2){
					if(n[i][j]<60){
						System.out.println(n[i][j] + "* ");
					}
					else{
						System.out.println(n[i][j] + " ");
					}
				}
			}
		}
	}
}
