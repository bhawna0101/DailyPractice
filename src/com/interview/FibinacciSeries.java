package com.interview;

import java.util.Scanner;

public class FibinacciSeries {

	static int f1 = 0;
	static int f2 = 1;
	static int sum=0;
	//static String coll = "ITM";

	public static void fiboFun(int n)
	{
		
		if(n>0)
		{
			sum=f1+f2;
			f1=f2;
			f2=sum;
			System.out.println(sum);
			fiboFun(n-1);
			//System.out.println("colleege"+coll);
		}
		else
		{
			System.out.println("");
			//coll = "IIM";
		}

	}

	public static void printWithRecursion(int count)
	{
		
		if(count<=0)
		{
			System.out.println("nothing found");
			
		}
		else
		{
			if(count==1)
			{
				System.out.println(f1);
				//System.exit(0);

			}
			else
			{
				System.out.println(f1);
				System.out.println(f2);
				fiboFun(count-2);

			}


		}
	}
	
	public static void withoutRecursion(int count)
	{
		if(count<=0)
		{
			System.out.println("nothing found");
			//System.exit(0);
		}
		else
		{
			if(count==1)
			{
				System.out.println(f1);
				//System.exit(0);

			}
			else
			{
				System.out.println(f1);
				System.out.println(f2);
				for(int i = 0; i<count-2;i++)
				{
					sum=f1+f2;
					System.out.println(sum);
					f1=f2;
					f2=sum;
					//System.out.println(coll);

				}

			}


		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("with recursion");
		printWithRecursion(n);
		
		
		//****************without recursion
		System.out.println("Without recursion");
		withoutRecursion(n);






	}

}
