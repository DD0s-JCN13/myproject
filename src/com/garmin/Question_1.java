package com.garmin;
import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		System.out.println("請問以下三位藝人誰的年紀最大？〈請以1.2.3作答〉");
		System.out.println("1)周杰倫");
		System.out.println("2)華晨宇");
		System.out.println("3)梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String ans = scanner.nextLine();
		int code = Integer.parseInt(ans);
		if(code != 3){
			System.out.println("你答錯了！");
		}
		else{
			System.out.println("恭喜你答對了！");
		}
	}

}
