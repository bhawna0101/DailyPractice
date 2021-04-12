package com.interview;

public class PrimeNumber {
	
	static boolean flag = true;
	
	public static boolean isPrime(int num)
	{
		for(int i = 1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;	
			}
				
			else
				System.out.println("");
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(!isPrime(21))
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}

}
