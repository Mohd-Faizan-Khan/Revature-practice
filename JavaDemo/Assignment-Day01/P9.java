import java.util.*;
public class P9{
	public static void main(String ...args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int a = sc.nextInt();

		sumDigit(a);
		


	}

	public static void sumDigit(int num){
		int sum=0;
		while(num>0){
		sum += num%10;
		num /=10;
		}
		System.out.println(sum);
}

}