package com.garmin;

public class PrimePrinter {
		public static void main(String[] args){
			for(int i=2;i<=1000;i++){
				boolean prime = true;
				for(int n=2;n<i;n++){
					if( i%n == 0){
						prime = false;
						break;
					}
				}
				if(prime){
					System.out.print(i + " ");
				}
			}
		}
}
