package com.interview;

public class StringLastOccurence {
	static int i = 0;
	public static int lastOccurence(String str, String str1)
	{
		i = str.lastIndexOf(str1);
		return i;
	}

	public static void main(String[] args) {
		String str = "Hey hi, it has been so long since highest peak";
		String targetStr = " hi";
		int j = lastOccurence(str, targetStr);
		if(j == -1)
			System.out.println("not found");
		else
		System.out.println("found at index" +j);
	}

}
