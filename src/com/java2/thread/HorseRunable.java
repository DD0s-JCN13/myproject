package com.java2.thread;

public class HorseRunable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =0; i<=50; i++){
			System.out.println("R:"+i);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
