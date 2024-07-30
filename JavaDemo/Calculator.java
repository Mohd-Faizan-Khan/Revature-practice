import java.util.*;
public class Calculator{

public static void main(String ...args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter the operation to perform: ");
char ch = scanner.next().charAt(0);
if(ch=='+'){
	System.out.println(add(scanner));
}

else if(ch=='-'){
	System.out.println(subtract(scanner));
}

else if(ch=='*'){
	System.out.println(multiply(scanner));
}


}

public static int add(Scanner scanner){
	System.out.print("Enter the numbers to perform addition(Enter '=' to get the answer): ");
	boolean res = false;
	int sum = 0,a=0;
	do{
	String str = scanner.next();
	try{
	a = Integer.parseInt(str);
	}
	catch(Exception e){
	
	}
	char ch = str.charAt(0);
	
	if(ch=='='){
		res = true;
		break;
		}
	sum += a;
	}while(!res);
	return sum;
}

public static int subtract(Scanner scanner){
	System.out.print("Enter a value to subtract from: ");
	int a = scanner.nextInt();
	System.out.print("Enter another value: ");
	int b = scanner.nextInt();
	return a-b;
}

public static int multiply(Scanner scanner){
	System.out.print("Enter the numbers to perform multiplication(Enter '=' to get the answer): ");
	boolean flag = false;
	int result = 1,a=0;
	do{
	String str = scanner.next();
	try{
	a = Integer.parseInt(str);
	}
	catch(Exception e){
	
	}
	char ch = str.charAt(0);
	
	if(ch=='='){
		flag = true;
		break;
		}
	result *= a;
	}while(!flag);
	return result;
}


}