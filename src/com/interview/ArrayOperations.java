package com.interview;

import java.util.Arrays;

public class ArrayOperations {
	
	void displayArray(int[] arr)
	{
		for(int i : arr)
			System.out.println(i);
	}
	
	int[] sortedArray(int[] arr)
	{
		//bubble sort
		int temp;
		//for(int i : arr)
		for(int i=0;i<arr.length-1;i++)

		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}}
		}
		return arr;
		
	}
	
	int[] roundRobinRight(int[] arr)
	{
		int last;
		int size = arr.length;
		
		for(int i=0;i<3;i++)
		{
			last=arr[size-1];
			for(int j=arr.length-1;j>0;j--) {
				 arr[j] = arr[j-1]; 
			}
			arr[0] = last;	
		}
		
		return arr;
	}
	
	int[] roundRobinleft(int[] arr)
	{
		int last;
		int size = arr.length;
		
		for(int i=0;i<3;i++)
		{
			last=arr[size-1];
			for(int j=arr.length-1;j>0;j--) {
				 arr[j] = arr[j-1]; 
			}
			arr[0] = last;	
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations ao = new ArrayOperations();
		int[] arr = new int[] {5,8,6,3,10};		
		System.out.println(Arrays.toString(arr));
		ao.displayArray(arr);
		System.out.println(Arrays.toString(ao.sortedArray(arr)));
		System.out.println(Arrays.toString(ao.roundRobin(arr)));


	}

}
