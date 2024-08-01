package com.assignment;
import java.util.*;

public class P4 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			int a = scanner.nextInt();
			sum+=a;
		}
		System.out.println("The avg of those numbers is: " + (sum/10));
	}
}
