package com.well.sogo;

public class GoldCustomer extends Customer{
	
	public GoldCustomer(int amount){
		super(amount);
		super.discount = 0.3f;
	}
}
