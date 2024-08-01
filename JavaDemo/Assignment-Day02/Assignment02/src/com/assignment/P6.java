package com.assignment;
import java.util.*;

public class P6 {
	public static void main(String[] args) {
		int sum=0;
		int prod = 1;
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		boolean flag = true;
		while (flag) {
			System.out.print("Enter an integer \nEnter 'Q' to quit: ");
			try {
				num = (int)scanner.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
					flag = false;
					break;
			}
			sum+=num;
			prod*=num;
			
		}
		System.out.println("sum: " + sum);
		System.out.println("product: " + prod);
	}
}
