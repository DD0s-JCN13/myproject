package com.garmin.oo;

public class Student {
	int Chinese;
	int Mathmatics;
	int English;
	String Name;
	public Student(String N, int C, int E, int M){
		Chinese = C;
		English = E;
		Mathmatics = M;
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
