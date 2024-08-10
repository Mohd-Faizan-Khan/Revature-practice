import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str = "abbabba";
		String rev ="";
		int b = str.length() - 1;
		for(int i= b; i>=0; i--){
			rev+= str.charAt(i);
		}

		if(str.equals(rev)){
			System.out.println("Palindrome");
		}
 	}
}