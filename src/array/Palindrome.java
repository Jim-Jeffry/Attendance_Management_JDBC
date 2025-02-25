package array;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String a=sc.next();
		String a1[]=a.split("");
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			 b=b+a1[i];
		}
		System.out.println();
		System.out.print(b);
		System.out.println();
		if(a.equals(b)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}