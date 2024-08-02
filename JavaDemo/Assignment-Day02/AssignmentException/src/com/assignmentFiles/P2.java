package com.assignmentFiles;

import java.util.ArrayList;

public class P2 {
	public static void main(String[] args) {
		ArrayList []arr = new ArrayList[4];
		try {
			System.out.println("Start of Try block");
			System.exit(0); // This will end the code right here and finally block will not execute
			System.out.println(arr[5]);
			
			System.out.println("End of Try block"); //Unreachable as the line above throws the exception and the control moves to the catch block
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Start of Catch block");
			e.printStackTrace();
			System.out.println("End of Catch block");
		}
		finally {
			System.out.println("This is finally block code ends here :)");
		}
	}
}
