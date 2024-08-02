package com.assignmentArrays;
import java.util.*;

public class P1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter a number: ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Enter a number to find in the array: ");
		int num = scanner.nextInt();
		boolean flag = false;
		int start=arr[0];
		int end = arr[arr.length-1];
		
		while (start< end) {
			int mid = (start+end)/2;
			
		}
			
		
		
	
	}
}
