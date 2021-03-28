package com.interview;

public class PrimeNo {

	static boolean primeNo(int n)
	{
		boolean flag = true;
		for(int i = 2; i<n-1; i++)
		{
			if((n%i) == 0) {
				flag=false;
				return flag; 
			}

		}
		return flag;
	}

	public static void main(String[] args) {

		System.out.println("Enter the no.");

		if(primeNo(7))
			System.out.println("No is Prime");	
		else
			System.out.println("No is Not Prime");



	}

}
