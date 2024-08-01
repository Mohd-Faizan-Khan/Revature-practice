//Q. Write a program to input a number using command line arguments multiply it by a num of your choice and display the result.

package com.classWork;

public class P1 {
	public static void main(String[] args) {
		System.out.println("Enter a number of your choice: " + args[0]);
		int a = Integer.parseInt(args[0]);
		System.out.println("Your number when multiplied with 10 is: " +a*10);
	}
}
