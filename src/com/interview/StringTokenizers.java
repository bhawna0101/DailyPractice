package com.interview;

import java.util.StringTokenizer;

public class StringTokenizers {
	
	static String str = "Hi my name is bhawna";

	public static void main(String[] args) {
		
		StringTokenizer s = new StringTokenizer(str);
		System.out.println(s.countTokens());		//true
		System.out.println(s.hasMoreTokens());		//true
		System.out.println(s.hasMoreElements());
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
		System.out.println("break");
		System.out.println(s.hasMoreTokens());		//false
		while(s.hasMoreTokens())
		{
			
			System.out.println("a "+s.nextToken());
		}
		
		// TODO Auto-generated method stub
		
		
		/**********with delimeters************/
		StringTokenizer a = new StringTokenizer("multiple delim/// : my ,,name is : ",",: //"); //returnss Hi : my name in next lines
		while(a.hasMoreElements())
		{
			System.out.println(a.nextElement());
		}
		
		/************** more *******************/
		StringTokenizer b = new StringTokenizer("Hi : my name is : ",":",true); //returnss Hi : my name in next lines
		while(b.hasMoreElements())
		{
			System.out.println(b.nextElement());
			
		}

	}

}
