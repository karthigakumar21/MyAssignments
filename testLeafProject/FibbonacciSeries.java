package com.sample.testLeafProject;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11,f1=0,f2=1;
		System.out.println("fibonacci series still n no:" +n);
		for (int i = 1; i<=n; ++i) {
			System.out.println(f1);
			int f=f1+f2;
			f1=f2;
			f2=f;
			
		}
	}

}
