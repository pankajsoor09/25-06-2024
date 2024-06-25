package com.javaTask;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Write a java program to get highest value among the given number .
		 * 103,409,455,201,450
		 * Note: use  conditional operators (?:)
		 */
		 int a = 103, b = 409 , c = 455 , d = 201 , e = 450 ; 
		 
		 int result = (a > b) ? (a > c ? (a > d ? (a > e ? a : e) : (d > e ? d : e)) 
                 : (c > d ? (c > e ? c : e) : (d > e ? d : e)))
        : (b > c ? (b > d ? (b > e ? b : e) : (d > e ? d : e)) 
                 : (c > d ? (c > e ? c : e) : (d > e ? d : e)));
		
				 System.out.println("The highest value is: " + result);
	}

    }


 

