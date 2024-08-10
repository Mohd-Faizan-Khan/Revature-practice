import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String str = "12 aizan ";
		int countVowel= 0, countConsonent = 0, countNum = 0, countSpace=0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				countVowel++;
			}
			else if(str.charAt(i) == ' '){
				countSpace++;
			}
			else if(str.charAt(i) == '0' || str.charAt(i) == '1' ||  str.charAt(i) == '2' ||  str.charAt(i) == '3' ||  str.charAt(i) == '4' ||  str.charAt(i) == '5' ||  str.charAt(i) == '6' ||  str.charAt(i) == '7' ||  str.charAt(i) == '8' ||  str.charAt(i) == '9'){
				countNum++;
			}
			else{
				countConsonent++;
			}
		}
		System.out.println(countVowel);
		System.out.println(countConsonent);
		System.out.println(countNum);
		System.out.println(countSpace);
 	}
}