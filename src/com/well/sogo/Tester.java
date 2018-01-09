package com.well.sogo;
import java.util.ArrayList;
public class Tester {
	public static void main(String[] args){
		ArrayList<Customer> customers = new ArrayList();
		customers.add(new Customer(10000));
		customers.add(new SliverCustomer(10000));
		customers.add(new GoldCustomer(10000));
		for(int i=0;i<customers.size();i++){
			Customer c = customers.get(i);
			c.print();
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(87);
		list.add(845);
		System.out.println(list.get(2));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
