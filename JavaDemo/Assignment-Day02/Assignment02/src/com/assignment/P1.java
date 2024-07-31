package com.assignment;
import java.util.*;

public class P1 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		int side1 = scanner.nextInt();
		
		System.out.print("Enter the width of the rectangle: ");
		int side2 = scanner.nextInt();
		
		if (side1==side2) {
			System.out.println("This is a square with side: " + side1);
		}
		else 
			System.out.println("This is a rectangle with sides " + side1 + " & " + side2);
	}
}
