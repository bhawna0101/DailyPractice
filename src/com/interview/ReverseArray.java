package com.interview;

public class ReverseArray {

	public static void main(String[] args) {

		//array of nos.[]
		int temp;
		
		int[] arr = new int[] {1,2,3,4,5,6};
		int n = arr.length;
		System.out.println(n/2);
		for(int i =0; i<(n)/2 ; i++)
		{
			temp = arr[i];				
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
							
		}
		for(int i =0; i<=n-1 ; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("///////////////////////////");
		//reverse even placed with evven ones
		//a[2] a[4] a[6]
		for(int i =0; i<(n)/2 ; i++)
		{
			temp = arr[i+1];				
			arr[i+1] = arr[n-1-i];
			arr[n-1-i] = temp;
							
		}
		for(int i =0; i<=n-1 ; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
