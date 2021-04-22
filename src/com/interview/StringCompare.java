package com.interview;

public class StringCompare {

	static boolean flag;

	public static boolean isEquals(String str1, String str2)
	{
		//if(str1.equals(str2))
			if(str1.equalsIgnoreCase(str2))
				flag = true;
			else
				flag = false;
		return flag;

	}

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello World";
		System.out.println(isEquals(str1, str2));

		String str11 = "Hello world";
		String str22 = "Hello World";
		System.out.println(isEquals(str11, str22));

		String str111 = new String("Hello world");
		String str222 = "Hello World";
		System.out.println(isEquals(str111, str222));
	}

}
