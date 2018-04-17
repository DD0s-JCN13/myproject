package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;


public class SimpleFileOutput {

	
	public static void main (String[] args) throws FileNotFoundException{
		PrintStream out = new PrintStream("data.txt");
		out.println("Lin+\t1\t1000");
		out.flush();
		out.close();
	}
}
