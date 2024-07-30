import java.util.*;
public class P6{
	public static void main(String ...args){
		System.out.println("Welcome to the Celsius calculator");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperatur in Fahrenheit: ");
		int f = sc.nextInt();
		System.out.println("Temperature is " + ((f-32)*5/9) + " degree Celsius");

		
	}

}