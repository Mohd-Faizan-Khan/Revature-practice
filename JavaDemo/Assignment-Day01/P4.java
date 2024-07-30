import java.util.*;
public class P4{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.println("Hey "+ name + "!! Welcome to the percentage calculator :)");
		System.out.print("Enter the number of subjects you have: ");
		int totalSubs = sc.nextInt();
		int sum = 0;

		for(int i=1; i<=totalSubs; i++){
			System.out.print("Enter your marks in Subject "+i + ": ");
			int marks = sc.nextInt();
			sum += marks;
		}
		System.out.println("Your percentage: "+ (sum/totalSubs) + "%");

}

}