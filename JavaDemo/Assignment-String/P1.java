import java.util.*;
public class P1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i<str.length(); i++){
		    if(str.charAt(i)== 'e'){
		        System.out.println("Found an e in this input!!");
		        break;
		    }
		    else{
		        System.out.println("No e Found");
		        break;
		    }
		}
 	}
}