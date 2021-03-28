package com.interview;

public class Strings {
	
	public static void main(String args[])
	{
		String s = "Bhawna";
		//s = "Arora";

		String s2 = "Bhawna";
		System.out.println(s);
		if(s2==s)
			System.out.println("Yes");	//printed, memory loc is ssame
		else
			System.out.println("No");		//not printed
		
		if(s2.equals(s))
			System.out.println("Yes");		//printed bcz contents are same
		else
			System.out.println("No");
		
		////////////////////////////////////////
		String p = new String("Bhawna");
		String a = p;
		p="Arora";
		p = new String("Bhawna");
				
		String p2 = new String("Bhawna");
		System.out.println(p);

		if(p2==p)
			System.out.println("Yes");
		else
			System.out.println("No");			// memory loc are diff
		
		if(p2.equals(p))
			System.out.println("Yes");			//printed since contents are same
		else
			System.out.println("No");
		
		if(p==a)
			System.out.println("Yes");
		else
			System.out.println("No");			//p and a are two diff objects
	}

}
