package com.garmin;

import java.util.Scanner;

public class Christmas_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wide = new Scanner(System.in);
		Scanner high = new Scanner(System.in);
		System.out.print("請輸入想要的聖誕樹葉片層數:");
		String wide2 = wide.nextLine();
		int w = Integer.parseInt(wide2);
		System.out.print("請輸入想要的聖誕樹層數:");
		String high2= high.nextLine();
		int h = Integer.parseInt(high2);
		for(int i=1;i<=h;i++) {
			if(w>2) {	
				int x1=1;
				int x2=3;
				int s1=w-2;
				int s2=w-3;
				if(i==1) {
					for(int w1=1;w1<=w;w1++) {
						for(int j1=s1;j1>=0;j1--) {
							System.out.print(" ");
						}
						for(int k1=1;k1<=x1;k1++) {
							if(k1<x1){
								System.out.print("*");
							}
							else {
								System.out.println("*");	
							}
						}
						x1 = x1+2;
						s1 = s1-1;
					}
				}
				else {
					for(int w2=2;w2<=w;w2++) {
						for(int j1=s2;j1>=0;j1--) {
							System.out.print(" ");
						}
						for(int k2=1;k2<=x2;k2++) {
							if(k2<x2){
								System.out.print("*");
							}
							else {
								System.out.println("*");	
							}
						}
						x2 = x2+2;
						s2 = s2-1;
					}
				}
		
			}
			else {
				break;
			}
		}
		if(w>2) {
			for(int k=1;k<=3;k++){
				for(int tb1=1;tb1<=w-2;tb1++){
					System.out.print(" ");
				}
				for(int tb2=1;tb2<=3;tb2++) {
					if(tb2<3) {
						System.out.print("*");
					}
					else {
						System.out.println("*");
					}
				}
			}
		}
	}
}
