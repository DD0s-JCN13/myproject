package com.java2.oo.bingo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * ┌────┬────┬────┬────┬────┐
 * │  0 │  1 │  2 │  3 │  4 │
 * ├────┼────┼────┼────┼────┤
 * │  5 │  6 │  7 │  8 │  9 │
 * ├────┼────┼────┼────┼────┤
 * │ 10 │ 11 │ 12 │ 13 │ 14 │
 * ├────┼────┼────┼────┼────┤
 * │ 15 │ 16 │ 17 │ 18 │ 19 │
 * ├────┼────┼────┼────┼────┤
 * │ 20 │ 21 │ 22 │ 23 │ 24 │
 * └────┴────┴────┴────┴────┘
 * 
 */
public class Bingo {
	int count;
	double line = Math.sqrt(count);//Math.sqrt("double") 是開根號
	List<String> lucky = new ArrayList<>();
	List<String> numbers = new ArrayList<>();
	boolean sample = true;
	boolean power = true;
	boolean bingohit = false;
	public Bingo(int count){
		this.count = count;
		for (int i=0;i<count;i++){
			numbers.add(String.valueOf(i+1));
		}
		Collections.shuffle(numbers);
	}
	public Bingo() {
		
	}
	public void on() {
		while(power) {
			for(int i=0;i<lucky.size();i++) {
				for(int j=0;j<numbers.size();j++) {
					if(lucky.get(i)==numbers.get(j)) {
						numbers.set(j, "O");
					}
				}
			}
			for(int i=0;i<line;i++) {
				if(i==(int) line-1) {
					//因為line為double，所以需要轉換為int定義
					break;
				}
				while(sample) {
					for(int j=0;j<line;j++) {
						if(j==(int)line-1) {
							//原理同上
							break;
						}
						if(numbers.get(i+j)==numbers.get(i+j+1)) {
							//row check
							bingohit=true;
						}else if(numbers.get((int)(i*(line)+j))==numbers.get((int)((i+1)*(line)+j))) {
							//column check
							bingohit=true;
						}else {
							if(j==(int)line-1&&1==(int)line-1)
								bingohit=false;
								sample=false;
						}
					}
				}
				if(numbers.get((int)((line-1))*(i+1))==(numbers.get((int)((line-1))*(i+2)))){
					//cross right
					bingohit=true;
				}else if(numbers.get(6*i)==numbers.get(6*(i+1))) {
					//cross left
					bingohit=true;
				}else {
					continue;
				}
			}
			if(bingohit=true) {
				System.out.println("Bingo!!");
				power=false;
			}else {
				System.out.println("Sory, you lost this time.");
				power=false;
			}
		}
		
	}
	
	
}