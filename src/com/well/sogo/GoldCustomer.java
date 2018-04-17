package com.well.sogo;

public class GoldCustomer extends SliverCustomer{
	int returnMoney;
	public GoldCustomer(int amount) {
		super(amount);
	}
	
	@Override
	public void print(){
		int total = (int)(amount*(1-discount));
		returnMoney = (int)(amount*(discount));
		System.out.println(amount+"\t"+total + "\t" +returnMoney );
	}
}
