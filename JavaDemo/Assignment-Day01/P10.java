import java.util.*;
public class P10{
	public static void main(String ...args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int a = sc.nextInt();

		revDigit(a);
		


	}

	public static void revDigit(int num){
		int sum=0;
		while(num>0){
		
		int a = num%10;
		sum = sum*10 + a;
		num /=10;
		}
		System.out.println(sum);
}

}