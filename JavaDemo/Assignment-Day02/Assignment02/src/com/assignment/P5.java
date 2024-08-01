package com.assignment;
import java.util.*;

public class P5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <a ; j++) {
				if (j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
