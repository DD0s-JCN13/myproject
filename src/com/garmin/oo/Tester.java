package com.garmin.oo;

public class Tester {
	public static void main(String args[]){
//		Student stu =new Student("王小明");
		Student stu = new Student("王小明",63, 59, 79);
//		stu.Chinese = 63;
//		stu.English = 59;
//		stu.Mathmatics = 79;
		//System.out.print(stu.Mathmatics);
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.Name+": "+avg);
	}
	GraduateStudent gstu = new GraduateStudent();
}
