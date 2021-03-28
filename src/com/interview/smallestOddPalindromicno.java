package com.interview;

public class smallestOddPalindromicno {
	//next smallest odd digit palindrome no.

	/*
	 * public static boolean isPresent(Integer a, Class<arr2[]> class1) {
	 * 
	 * return true; }
	 */
	public static void main(String[] args) {
		Integer arr1[] = new Integer[] {11,33,55,77,99};
		Integer arr2[] = new Integer[] {1,55,5,7,9,33,87};
		for(int i = 0; i<arr1.length; i++)
		{
			for(int j = 0; i<arr2.length; j++) {
				if(arr1[i] == arr2[j])
				{
					break;
				}
				else if(j == (arr2.length-1))
				{
					System.out.println("ans is "+arr1[i]);
					System.exit(0);

				}
				else
					continue;
			}	

			
		}



	}

}
