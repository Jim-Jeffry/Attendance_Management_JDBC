package uniq;
import java.util.Scanner;
public class BankTask {
	public static void login() {
		int bal=1000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your AC Num");
		int a=sc.nextInt();
		if (a==5272) {
			System.out.println("Enter your Password");
			int b=sc.nextInt();
			if(b==2725) {
				System.out.println("Welcome User M Jim Jeffry");
				System.out.println("Select a Process");
				System.out.println("1.Withdraw");
				System.out.println("2.Balance");
				System.out.println("3.Deposit");
				int c=sc.nextInt();
				switch (c) {
				case 1:
					System.out.println("Enter How much money You need to withdraw");
					int d=sc.nextInt();
					if(d>=bal) {
					System.out.println("You dont have sufficient Balance");
					}
					else {
						System.out.println("You have Debited rs "+d);
						 bal=(bal-d);
					}
					break;
				case 2:	
					System.out.println("Your Balance is :"+bal);
					break;
				case 3:	
					System.out.println("Enter How much amout yo need to Deposit");
					int e=sc.nextInt();
					System.out.println("You have Deposited rs "+e);
					bal=(bal+e);
					break;
					default:
						System.out.println("Choose a Right Process");
						break;
				}	
				System.out.println("Your main Balance is rs "+bal);
				}
			else {
				System.out.println("Wrong Password");
			}
		}
		else {
			System.out.println("Wrong AC Num");
		}
	}
	private static void Switch(String y) {
	}
	public static void main(String[]arg) {
		login();
		System.out.println("Thankyou");
	}
}
