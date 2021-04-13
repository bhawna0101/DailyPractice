package com.interview;

public class PalindromeNumber {

	static boolean flag;

	public static boolean isPalindrome(int num)
	{

		String str = Integer.toString(num);
		char[] arr = str.toCharArray();
		char[] arr2 = new char[arr.length];
		if(num<=99)
		{
			System.out.println("num should be 3 digit atleast");
		}
		else
		{
			System.out.println(arr.length);
			for(int i = 0; i<arr.length; i++)
			{
				arr2[arr2.length-1-i] = arr[i];
			}

			System.out.println("arr  "+new String(arr));		//to be remembered, cannot print arrays as such
			//use new String(charArray) to print the array
			System.out.println("arr2  "+new String(arr2));

			if(new String(arr).equals(new String(arr2)))
			{
				flag = true;
				System.out.println("equals");
			}
			else
				flag = false;
		}
		return flag;


	}

	public static boolean isPalindrome(String str)
	{
		char[] arr = str.toCharArray();
		char[] arr2 = new char[arr.length];

		for(int i = 0; i<arr.length; i++)
		{
			arr2[arr.length-1-i] = arr[i];
		}
		System.out.println("arr  "+new String(arr));		//to be remembered, cannot print arrays as such
																//use new String(charArray) to print the array
		System.out.println("arr2  "+new String(arr2));
		
		if(new String(arr).equals(new String(arr2)))
		{
			flag = true;
			System.out.println("equals");
		}
		else
			flag = false;
		return flag;
	}

	public static void main(String[] args) {
		if(isPalindrome(121))
			System.out.println("Palindrome");
		else
			System.out.println("NOn palindrome");
		
		if(isPalindrome("NITINO"))
			System.out.println("Palindrome");
		else
			System.out.println("NOn palindrome");
	}

}
