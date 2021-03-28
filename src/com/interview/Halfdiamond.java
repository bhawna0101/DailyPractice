package com.interview;

import java.util.Scanner;

public class Halfdiamond {

	public static void main(String[] args) {
		
		  int h;
		  System.out.println(h);
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<i+1; j++)
			{
				System.out.print("*");
			} 
			System.out.print("\n"); }

		//System.out.println("lower");
		for(int i = 1; i<n; i++)
		{
			for(int j = 0; j<(n-i); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
