package com.javaExpressions;

public class Example4
{

	public static void main(String[] args) 
	{
		
		int a = 4;
		
		int expression = 17 - 8 / 4 * 2 + 3 - ++a;	//++ = > a = a + 1	
					   //17 - 8 / 4 * 2 + 3 - 5
					   //17 - 2 * 2 + 3 - 5
					   //17 - 4 + 3 - 5
					   //20 - 4 - 5
					   //20 - 9
					   //11
		
		System.out.println(expression);
		
	}

}
