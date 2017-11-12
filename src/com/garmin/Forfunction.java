package com.garmin;

public class Forfunction {

	public static void main(String[] args) {
	/*列印九九乘法表的2開頭部分
	 其中，僅有個位數的部分將十位數留白	
	*/
		/*for(int n=2; n<=9; n++){
			for(int i=1;i<=9;i++){
				if( (n*i) < 10){
					System.out.println(n + " x " + i + " =  "+ (n*i));
				}else {
					System.out.println(n + " x " + i + " = " + (n*i));
				}
			}
			System.out.println();
		}
		*/
		//印製2~5並列的乘法表
		//十位數留白於否的規則相同
		for (int i=1;i<=9;i++){
			for(int n=2;n<=5;n++){
				if(n<=4){
					if((i*n<10)){
						System.out.print((n) + "x" + (i) + "= " + (i*n) + " ");
					}
					else{
						System.out.print((n) + "x" + (i) + "=" + (i*n) + " ");
					}
				}
				else{
					if((i*n<10)){
						System.out.println((n) + "x" + (i) + "= " + (i*n) + " ");
					}
					else{
						System.out.println((n) + "x" + (i) + "=" + (i*n) + " ");
					}
				}
			}
		}
	}
	
}
