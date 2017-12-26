package com.garmin.oo;

public class Student {
	int Chinese;
	int Mathmatics;
	int English;
	String Name;
	public Student(){
		
	}
	public Student(String Name, int Chinese, int English, int Math){
		this.Chinese = Chinese;
		this.English = English;
		this.Mathmatics = Math;
		this.Name = Name;
	}
	public Student(String N){
		Name = N;
	}
	public void print(){
		System.out.println(English +"\t"+ 
				Mathmatics+"\t"+Chinese);
	}
	public int getAverage(){
		return (English+Mathmatics+Chinese)/3;
	}
}
