package com.garmin;
import java.util.Scanner;
public class WeekTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("請輸入1~7的其中一個數字：");
		boolean power = true;
		boolean quest = true;
		boolean again = false;
		while(power) {
			if(quest) {
				String input = scan.nextLine();
				int i =Integer.parseInt(input);
				switch(i){
					case 1:
						System.out.println("星期一");
						again = true;
						quest = false;
						power = false;
						break;
					case 2:
						System.out.println("星期二");
						again = true;
						quest = false;
						power = false;
						continue;
					case 3:
						System.out.println("星期三");
						again = true;
						quest = false;
						power = false;
						continue;
					case 4:
						System.out.println("星期四");
						again = true;
						quest = false;
						power = false;
						continue;
					case 5:
					System.out.println("星期五");
						again = true;
						quest = false;
						power = false;
						continue;
					case 6:
						System.out.println("星期六");
						again = true;
						quest = false;
						power = false;
						continue;
					case 7:
						System.out.println("星期天");
						again = true;
						quest = false;
						power = false;
						continue;
					default:
						System.out.println("資料不符，請重新輸入");
						//break;
						//default中其實可以省略break指令，因為是系統指派命令
				}
			}
			while(again) {
				System.out.println("是否要繼續執行此程式？(1為繼續，2為離開)");
				String input2 = scan2.nextLine();
				int j = Integer.parseInt(input2);
				switch(j) {
					case 1:
						again = false;
						quest = true;
						power = true;
						break;
					case 2:
						System.out.println("See you next time!");
						power = false;
						again = false;
						break;
					default:
						System.out.println("資料不符，請重新輸入");
				}
			}
		}
	}
}
