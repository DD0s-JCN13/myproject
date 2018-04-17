package com.java2.io;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(75);
			out.flush();
			out.close();
		} catch (FileNotFoundException e){
			System.out.println("Flie NOT FOUND!!");
		}catch (IOException e){
			System.out.println("File Output problem");
		}
	}

}
