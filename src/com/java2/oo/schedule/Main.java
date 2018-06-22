package com.java2.oo.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*有一文字檔儲存了課表資料(schedule.txt)
 * 請讀取資料後，設計程式檢查是否有空檔
 * 如：
 * 請輸入星期(1~7)：2
 * 請輸入時(0~24)：11
 * 【有空檔】
 * 請輸入星期(1~7)：4
 * 請輸入時(0~24)：14
 * 【有課：   C004  English  到16時】
 */

public class Main {
	List<Course> courses = new ArrayList<>();
	
	public Main(){
		
	}
	public void on() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入星期(1~7)：");
		int input = scanner.nextInt();
		int tmp = 0;
		int ttime = 0;
		int tdur = 0;
		String tcourse = null;
		String troom = null;
		boolean isavaliable = true;
		for(int i=0;i<courses.size();i++) {
			Course c = courses.get(i);
			if(input==c.getDay()) {
				tmp = c.getDay();
				ttime = c.getTime();
				tdur = c.getDur();
				troom = c.getRoom();
				tcourse = c.getCourse();
				break;
			}
		}
		System.out.println("請輸入時(0~24)：");
		
		input = scanner.nextInt();
		if(input>=ttime && input<=(ttime+tdur)) {
			isavaliable = false;
		}
		if(isavaliable) {
			System.out.println("【有空檔】");
		}else {
			System.out.println("【有課：   "+troom+" "+tcourse+" 到"+(ttime+tdur)+"時】");
		}
	}
	
	
}
