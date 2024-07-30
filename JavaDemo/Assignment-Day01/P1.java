import java.util.*;
public class P1{
	public static void main(String ...args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		int length = sc.nextInt();
		System.out.print("Enter the width of rectangle: ");
		int width = sc.nextInt();
		area(length,width);
		perimeter(length,width);
	}

	public static void area(int a, int b){
		System.out.println("The area of reactange is: "+ a*b);
	}

	public static void perimeter(int a, int b){
		System.out.println("The area of reactange is: "+ (2*(a+b)));
	}
}
