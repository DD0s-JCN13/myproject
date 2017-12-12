package com.garmin;
import java.util.Scanner;
public class GameTester {
	public static void main(String[] args){
		boolean first = true;
		boolean move = true;
		int i=1;
		int hp=100;
		int Location = 0;
		//0為起始點，14為終點
		do{
			System.out.println("請以數字2、4、6、8來進行移動");
			System.out.println("2為向下、4為向左、6為向右、8為向上、0則為結束遊戲");
			System.out.println("請輸入數字以進行遊戲：");
			System.out.println("地圖一共五直行、三橫列");
			System.out.println("目前所在位置為第一行第一列");
			System.out.println("目標位置為第五行第三列");
			i++;
		}while(i==1);
		while(first){
			Scanner scan = new Scanner(System.in);
			String line = scan.nextLine();
			int k = Integer.parseInt(line);
			switch(k){
				case 2:
					if(Location / 5 < 2){
						Location = Location + 5;
						System.out.println("移動至第"+((Location%5)+1)+"行第"+((Location/5)+1)+"列");
						move = true;
					}
					else{
						System.out.println("已到達地圖之邊界，請重新輸入！");
						move = false;
					}
					break;
				case 4:
					if(Location % 5 > 0){
						Location = Location - 1;
						System.out.println("移動至第"+((Location%5)+1)+"行第"+((Location/5)+1)+"列");
						move = true;
					}
					else{
						System.out.println("已到達地圖之邊界，請重新輸入！");
						move = false;
					}
					break;
				case 6:
					if(Location % 5 < 4){
						Location = Location + 1;
						System.out.println("移動至第"+((Location%5)+1)+"行第"+((Location/5)+1)+"列");
						move = true;
					}
					else{
						System.out.println("已到達地圖之邊界，請重新輸入！");
						move = false;
					}
					break;
				case 8:
					if(Location / 5 > 0){
						Location = Location - 5;
						System.out.println("移動至第"+((Location%5)+1)+"行第"+((Location/5)+1)+"列");
						move = true;
					}
					else{
						System.out.println("已到達地圖之邊界，請重新輸入！");
						move = false;
					}
					break;
				case 0:
					System.out.print("bye");
					break;
				default:
					System.out.println("輸入錯誤，請重新輸入");
					move = false;
			}
			if(Location==2||Location==6||Location==9||Location==11||Location==13){
				if(move){
					hp = hp - 30;
					System.out.println("遇到怪物，損失30點hp，目前剩餘hp"+hp+"點");
				}
			}
			else if(Location==3||Location==7){
				if(move){
					hp = hp + 20;
					System.out.println("得到恢復藥劑，恢復20點hp，目前剩餘hp"+hp+"點");
				}
			}
			if(k==0){
				first=false;
			}
			else if(Location == 14){
				System.out.println("遊戲結束，恭喜到達終點了！！");
				first = false;
			}
			else if(hp<=0){
				System.out.println("Game Over，你死了");
				first = false;
			}
		}
	}
}
