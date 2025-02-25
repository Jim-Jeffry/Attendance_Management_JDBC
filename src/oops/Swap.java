package oops;
import java.util.*;
public class Swap {
	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		int a=sc.nextInt();
		System.out.println("Enter value of B");
		int b=sc.nextInt();
	System.out.println("The Old Value of A is :"+a);
	System.out.println("The old value of B is :"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The New Value of A is :"+a);
		System.out.println("The New Value of B is :"+b);
	}
}