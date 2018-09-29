package com.garmin;

public class BubbleSoft {
	public static void main (String[] args){
		int tmp = 0;
		//int n[] = {51, 23, 6, 65, 15};
		int n[] = {13, 7, 53, 26, 36, 28, 47, 49, 37};
		for(int i=0;i<n.length-1;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]>n[j]){
					tmp=n[i];
					n[i]=n[j];
					n[j]=tmp;
				}
			}
			System.out.print("第"+(i+1)+"次執行結果：");
			for(int k=0;k<n.length;k++) {
				System.out.print(n[k]+" ");
			}
			System.out.println("");
		}
		for(int k=0;k<n.length;k++){
		System.out.print(n[k]+" ");
		}
	}	
}
