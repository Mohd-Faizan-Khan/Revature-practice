/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result*/


import java.util.*;
public class P3{
	public static void main(String ...args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a 4 digit number: ");
	int num = sc.nextInt();
	System.out.print("After thhis operation [(((num+8)/3)%5)*5] the result is: ");
	System.out.println((((num+8)/3)%5)*5);
}

}