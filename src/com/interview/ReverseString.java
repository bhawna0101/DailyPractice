package com.interview;

public class ReverseString {
	
	static void reverseString(String msg)
	{
		String a = msg;
		String[] b = a.split(" ");
		
		for(int i = 0; i<b.length; i++)
		{
			
			for(int j = b[i].length()-1; j>=0; j--)
			{
				char[]  result= b[i].toCharArray();
				System.out.print(result[j]);
			}
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Google Helps World");
		
		
	}

}
