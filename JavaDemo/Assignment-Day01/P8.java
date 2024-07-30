import java.util.*;
public class P8{
	public static void main(String ...args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 5 digit number: ");


		int a = sc.nextInt();
		

		int b = a/10;
		int c = b%10;
		int d = b/1000;
		System.out.println("The sum of first and second last digit of the number is : " + (c+d));
		
	}

}