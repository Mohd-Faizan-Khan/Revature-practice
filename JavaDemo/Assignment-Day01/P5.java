//Swapping with 3rd variable

import java.util.*;
public class P5{
	public static void main(String ...args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Original Values: " + a + " & " + b);
		int c = a;
		a= b;
		b = c;
		System.out.println("Swapped Values: " + a + " & " + b);
	}

}