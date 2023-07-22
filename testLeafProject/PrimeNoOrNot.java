package com.sample.testLeafProject;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=29;
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
		int	p = n%i;
			if(p==0) {
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n +  " is a Prime number");
		}
			else {
				System.out.println(n +  " is not prime number");
		}
	}

}
