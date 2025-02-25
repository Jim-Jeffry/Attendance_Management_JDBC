package uniq;
import java.util.Scanner;
public class LoopTask7 {
public static void num() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num You Want to Reverse :");
	int a=sc.nextInt();
	int b=0;
	while(a>0) {
		int c=a%10;
		a/=10;	
		b=c+(b*10);
	}
	System.out.println("The Reversed Value is :"+b);
}
	public static void main(String[] args) {
		num();
	}
}