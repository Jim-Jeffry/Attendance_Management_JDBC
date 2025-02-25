package uniq;
import java.util.*;
public class UserId {
	public static void Id() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your UserId :");
		int a=sc.nextInt();
		System.out.println( a==12345? Pswd():"Wrong User ID");
		Id();
		}
	public static String Pswd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password :");
		int b=sc.nextInt();
		String c =67890==b?"Welcome User":"Incorrect Password";
		return c;
	}
	public static void main(String[]arg) {
		Id();		
	}
}