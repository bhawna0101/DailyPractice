package com.interview;

public class StringBuffers {
	
	static StringBuffer s = new StringBuffer("bhawna");
	static StringBuffer s2 = new StringBuffer();
	static 	StringBuffer s3 = new StringBuffer(200);

	
	public static void getLength(StringBuffer s)
	{
		System.out.println("length of "+s+" is "+s.length());
	}
	
	static public void getCapacity(StringBuffer s)
	{
		System.out.println("capacity of "+s+" is "+s.capacity());
	}
	
	static public void reverse(StringBuffer s)
	{
		System.out.println("reversed string is "+s.reverse());
	}
	
	static StringBuffer append(StringBuffer s, StringBuffer str)
	{
	
		return s.append(str);
	}
	
	
	public static void main(String args[])
	{
		getLength(s);
		getLength(s2) ; // returns 0;
		getCapacity(s);//string  buffer default constructor ads up 16 places to the string
		getCapacity(s2);	//returns 16
		reverse(s);
		System.out.println(s);			//now s willb e permeanently stored as reverse string for later operatioms
		reverse(s);
		System.out.println(s);
		
		getCapacity(s3);
		append(s3, s);
		getCapacity(s3);
		
		System.out.println(s3);			//both string and stringBuffer can be appended as a part of argurment in this function
		s.append("hi");
		System.out.println(s.toString());
		
		System.out.println(s3.substring(3));			//wna
		s3.delete(3, 5);
		System.out.println(s3);				//bhaa
		
	}

}
