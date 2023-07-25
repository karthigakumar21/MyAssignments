package com.sample.testLeafProject;

import java.util.Arrays;

public class MissedElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {15,17,20};
		int len =arr.length;
		int count=0;
		Arrays.sort(arr);
		for (int i=arr[0]; i <=arr[len-1]; i++) {
			if(arr[count]==i) {
			count++;	
			}
			else {
			System.out.println("the missedElement is :" +i);	
			}
		}
	}

}
