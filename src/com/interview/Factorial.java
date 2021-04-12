package com.interview;

import java.util.Scanner;

public class Factorial {
	static int fact=1;
	
	public static int withRecursion(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
			return n*withRecursion(n-1);
			
	}
	
	public static int withOutRecursion(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 --- 5*4*3*2*1
		
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("with recursion");
		System.out.println(withRecursion(n));
		
		
		//****************without recursion
		System.out.println("Without recursion");
		System.out.println(withOutRecursion(n));
		

	}

}
