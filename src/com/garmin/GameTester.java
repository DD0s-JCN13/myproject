package com.garmin;
import java.util.Scanner;
public class GameTester {
	public static void main(String[] args){
		boolean first = true;
		int i=1;
		do{
			System.out.println("請以數字2、4、6、8來進行移動");
			System.out.println("2為向下、4為向左、6為向右、8為向上來、0則為結束遊戲");
			System.out.println("請輸入數字以進行遊戲：");
			i++;
		}while(i==1);
		while(first){
			Scanner scan = new Scanner(System.in);
			String line = scan.nextLine();
			int k = Integer.parseInt(line);
			switch(k){
				case 2:
					System.out.println("向下 ");
					break;
				case 4:
					System.out.println("向左 ");
					break;
				case 6:
					System.out.println("向右 ");
					break;
				case 8:
					System.out.println("向上 ");
					break;
				case 0:
					System.out.print("bye");
					break;
				default:
					System.out.println("輸入錯誤，請重新輸入");
			}
			if(k==0){
				first=false;
			}
		}
	}
}
