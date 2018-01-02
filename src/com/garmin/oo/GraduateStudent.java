package com.garmin.oo;

public class GraduateStudent extends Student{
	int thesis;
	public void GraduateStudent(){
		
	}
	
	@Override
	public void print(){
		System.out.println(English + "/t"+ Mathmatics +"/t"+Chinese +"/t"+ thesis);
	}
	@Override
	public int getAverage(){
		return (English+Mathmatics+Chinese+thesis)/4;
	}
}
