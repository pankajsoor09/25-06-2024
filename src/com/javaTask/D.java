package com.javaTask;

public class D {

	
	    public static void main(String[] args) {
	        int a = 503;
	        int b = 409;
	        int c = 355;
	        int d = 106;
	        int e = 670;
	        
	        //Note: use  conditional operators (?:)

	        // Use the ternary operator to find the highest value among a and b
	        int max = (a > b) ? a : b;
	        
	        // Compare the current max with c
	        max = (max > c) ? max : c;

	        // Compare the current max with d
	        max = (max > d) ? max : d;

	        // Compare the current max with e
	        max = (max > e) ? max : e;

	        System.out.println("The highest value is: " + max);// Output the highest value
	    }
	

	}


