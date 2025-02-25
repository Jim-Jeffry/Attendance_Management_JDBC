package uniq;
import java.util.*;
public class VoteEligibility {
	public static void age() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int a=sc.nextInt();
		System.out.println((a>=18)?"Elligible":"Not Elligible");
	}
public static void main(String[]arg) {
	age();
}
}
