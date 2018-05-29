package com.java2.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args){
		try {
			Socket s1 = new Socket("ppt.cc", 23);
			InputStream ips =s1.getInputStream();
			int data = 0;
			for (int i=0;i<5000;i++){
				data = ips.read();
				System.out.println((char)data);
				ips.close();
				s1.close();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
