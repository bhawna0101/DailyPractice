package com.interview;

public class Strings {
	
	public static void main(String args[])
	{
		String s = "Bhawna";
		//s = "Arora";

		String s2 = "Bhawna";
		s.replace('B', 'b');
	//	System.out.println(s.concat("abc"));
	//	System.out.println(s.replace('B', 'b'));  in short, replace and concat functions will act on string but not directly, i.e. the value of s still remains Bhawna and not bhawna or bhawnaabc, String cannot be altered once created.
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
			System.out.println("No");			//p and a are two diff object
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.length());
		System.out.println(s.toString());
		System.out.println(s.trim());
		System.out.println(s.substring(4));			//na //now from 4th index, new substring will be generated
		System.out.println(s.substring(4,5));		//n, 4 will be starting index //4,4 will not return anything
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.charAt(2));

		
		

		




		
		
	}

}
