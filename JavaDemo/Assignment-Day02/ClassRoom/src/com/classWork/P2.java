//Create a custom exception call it InvalidAgeException for 18year age  to vote anyone above 150 should give invalid age exception

package com.classWork;
import java.util.*;

public class P2{
	public static void main(String[] args) throws InvalidAgeException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		try {
			if(age<18) {
				throw new InvalidAgeException();
			}
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			
		}
		
	}
	
	
	

}
