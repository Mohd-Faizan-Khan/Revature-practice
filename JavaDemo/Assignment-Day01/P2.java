import java.util.*;
public class P2{

	public static void main(String ...args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first side of triangle: ");
		int side1 = sc.nextInt();
		System.out.print("Enter the second side of triangle: ");
		int side2 = sc.nextInt();
		System.out.print("Enter the third of triangle: ");
		int side3 = sc.nextInt();
		perimeter(side1, side2, side3);
}
	public static void perimeter(int s1, int s2, int s3){
		System.out.println("The perimeter of the triangle is: "+ (s1+s2+s3));
	}
}