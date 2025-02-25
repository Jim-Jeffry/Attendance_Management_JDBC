package uniq;
import java.util.Scanner;
public class IfTask {
	public static void mult() { 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value :");
	int a=sc.nextInt();
	int b=a%7;
	if(b==0) {
	System.out.println("The Give Table is Divisible by 7");
	}
	else {
		System.out.println("The Give Table is not Divisible by 7");
	}
	}
	public static void main(String[]arg) {
		mult();
	}
}
