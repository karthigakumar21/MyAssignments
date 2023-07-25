package com.sample.testLeafProject;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,30,70,50,100,120,45,18,1};
		int len = a.length;
		Arrays.sort(a);
		System.out.println("the second largest number from given array is:" +a[a.length-2]);
	}

}
