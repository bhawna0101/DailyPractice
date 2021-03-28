package com.interview;

public class Variables {
	//

	public static void main(String[] args) {
		String  name="Bhawna";
		String  naMe="Bhawana";	

		//   String  str1='Bhawana';		//invalid character constant

		System.out.println(name);
		System.out.println(naMe);

		//////////////////////////////
		char c = 1;
		char d = 'h';
		//char e = "hi";				//change type to string
		char f = '2';					// will print 2
		//  char c = 'hello';				//invalid character constant
		System.out.println(c); 				//print special character and not 1

		System.out.println(d);
		System.out.println(f);

		////////////////////////////////
		final int myNum = 15;
		//myNum = 20;  // will generate an error: cannot assign a value to a final variable
		
		////////////////////////////////////
		String firstName = "John";
	    String lastName = "Doe";
	    String fullname1 = firstName+lastName;
	    String fullName = firstName.concat(lastName);	//concat and + does same operation in java
	    
	    System.out.println(fullName);  
	    System.out.println(fullname1);
	    System.out.println("value is"+fullName);
	    
	    /////////////////////////////////
		/*
		 * general rules for constructing names for variables (unique identifiers) are:
		 * 
		 * Names can contain letters, digits, underscores, and dollar signs Names must
		 * begin with a letter Names should start with a lowercase letter and it cannot
		 * contain whitespace Names can also begin with $ and _ (but we will not use it
		 * in this tutorial) Names are case sensitive ("myVar" and "myvar" are different
		 * variables) Reserved words (like Java keywords, such as int or boolean) cannot
		 * be used as names
		 */



	}


}
