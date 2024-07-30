import java.util.*;
public class P7{
	public static void main(String ...args){
		System.out.println("Welcome to the Celsius calculator");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total students in the class: ");
		int total = sc.nextInt();
		System.out.print("Enter the number of boys in the class: ");
		int boys = sc.nextInt();
		System.out.print("How many students got 'A' (in %): ");
		float per = sc.nextFloat();

		System.out.print("How many boys got 'A' (number): ");
		int b  = sc.nextInt();

		System.out.println("Number of girls got an 'A': " + ((per*total/100)-b));



		
	}

}