package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 建立販賣機，規格如下：
 * 投入5、10、50元>>>>歸類(販賣機的功能)、統計
 * 按1、2、3選擇商品>>>>讀取資料，辨識物件
 * 按0退出服務
 */

public class VendingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine  vm = new VendingMachine();
		FileInputStream fis;
		try {
			fis = new FileInputStream("Vending.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			String[] token = line.split(",");
			int count = Integer.parseInt(token[0]);
			for(int i=1;i<=count;i++) {
			int id = i;
			String name =token[i*2-1];
			int price = Integer.parseInt(token[i*2]);
			vm.drinks.add(new Drink(id,name,price));
				}
			vm.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
