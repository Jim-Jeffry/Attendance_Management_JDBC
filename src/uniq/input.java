package uniq;
import java.util.Scanner;
public class input {
	
	public void add(int a,int b) {
		int c= a+b;
		System.out.println("The value is :"+c);
	}
	public static void main(String[]arg) {
		input n=new input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value A");
		int a=sc.nextInt();
		System.out.println("Enter the value B");
		int b=sc.nextInt();
		n.add(a, b);
		sc.close();
	}

}
