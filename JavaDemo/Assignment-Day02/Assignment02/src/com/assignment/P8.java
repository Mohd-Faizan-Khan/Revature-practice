package com.assignment;
import java.util.*;

public class P8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a =  scanner.nextInt();
		
		System.out.print("Enter another number: ");
		int b =  scanner.nextInt();
		armStrong(a,b);
		
		
	}
	
	public static void armStrong(int start, int end) {
//		int prod=1;
		int sum=0;
		
		for (int i = start; i < end; i++) {
			double temp = i;
			double pow=0;
			while (i>0) {
				pow++;
				i /=10;
			}
			
			double res = Math.pow(temp, pow);
			sum +=res;
			
			if ((int)sum==(int)temp) {
				System.out.println(sum);
			}
		}
	}
}
