//Q. Write a program to input a number using command line arguments multiply it by a num of your choice and display the result.

package com.classWork;

public class P1 {
	public static void main(String[] args) {
		System.out.println("Enter a number of your choice from command line: " + args[0]);
		int a=0;
		try {
			a = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Result: " +a*10);
	}
}
