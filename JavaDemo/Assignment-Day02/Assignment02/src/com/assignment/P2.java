package com.assignment;
import java.util.*;

public class P2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = scanner.nextInt();
		
		if (marks>80) {
			System.out.println("Congratulations you've got: A");
		}
		else if (marks>60 && marks<=80) {
			System.out.println("Congratulations you've got: B");
		}
		else if (marks>50 && marks <=80) {
			System.out.println("You've got: C");
		}
		else if (marks>45 && marks<=50) {
			System.out.println("You've got: D\n---Work Hard---");
		}
		else if (marks>25 && marks<=45) {
			System.out.println("Sorry, you've got: E\n---Work Harder---");
		}
		else
			System.out.println("Sorry, you've got: F\n---Repeat and Work Harder---");
	}
}
