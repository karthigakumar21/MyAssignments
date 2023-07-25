package com.sample.testLeafProject;

import java.util.Arrays;

public class IntersectionValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1,2,3,6,9,5};
		int arr2[] = {3,4,5,6,7,8};
		int len1 = arr1.length;
		int len2 = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0;i<len1; i++) {
			for (int j = 0; j < len2; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("the intersection values from given array:" +arr1[i]);
				}
			}
		}
	}

}
