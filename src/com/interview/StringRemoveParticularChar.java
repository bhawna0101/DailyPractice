package com.interview;

public class StringRemoveParticularChar {

	static String s = null;
	
	public static String removeChar(String str, char a)
	{
		//String res = str.replace("a","");
		String res = str.replaceAll("([a-z])", "x");
		return res;
//		char[] arr = str.toCharArray();
//		for(int i = 0; i<arr.length-1; i++)
//		{
//			
//			if(arr[i] == a)
//			{
//				i=i+1;
//				arr[i] = arr[i+1];
//				
//			}
//				
//				
//		} 
//		return String.valueOf(arr);
	}

	public static void main(String[] args) {

		String str = "aHi my name7854 is bh126awna. i am here88 to9 908remove char a";
		char a = 'a';
		System.out.println("after removal of a , string is "+removeChar(str, a));
		
		///////////////
		char[] arr2 = str.toCharArray();
		System.out.println(arr2);
		System.out.println(arr2.toString());
		
		String string = String.valueOf(arr2);
		System.out.println(string);
		char[] arr3 = {'a','b','c',' ','e'};
		System.out.println(arr3);
	}

}
