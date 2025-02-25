package uniq;
import java.util.Scanner;
public class LoopTask6 {
	public static void password() {
		Scanner sc=new Scanner(System.in);
		String str="Mahiban";
		System.out.println("Enter the Password");
		for(int i=1;i<=3;i++) {
		String s=sc.next();
		if(s.equals(str)) {
			System.out.println("Welcome User..");
			break;
		}
		else {
			if(i<3) {
				System.out.println("Out of 3 attempts "+i+" has Failed!!");
				System.out.println("Enter the Password Again :");
			}
			else {
				System.out.println("You Have made 3 Unsuccesful attempts");
				System.out.println("Please try again sometime");
			}
		}
		}
	}
	public static void main(String[]arg) {
		password();
	}

}
