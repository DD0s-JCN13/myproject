package com.garmin;

public class WeekTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =7;
		switch(n){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("資料不符，請重新輸入");
				//break;
				//default中其實可以省略break指令，因為是系統指派命令
		}
	}

}
