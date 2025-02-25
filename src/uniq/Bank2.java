package uniq;
import java.util.Scanner;
public class Bank2 {
public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name=sc.next();
	if(name.equals("Jim")) {
		System.out.println("Enter Your Phone Number");
		String phn=sc.next();
		if(phn.equals("8940418471")) {
			System.out.println("Phone Number Verified");
			System.out.println("User Verified");
			System.out.println("Enter a Bank For Your Service");
			System.out.println("1.SBI,2.ICICI,3.IOB");
			int bank=sc.nextInt();
			if(bank==1) {
				System.out.println("SBI Welcomes You");
				System.out.println("Enter the amout you want to get loan");
				int amount=sc.nextInt();
				 if (amount <= 100000) {
			            System.out.println("SBI approves loan of amount: " + amount);
			        } else {
			            System.out.println("SBI cannot approve loan of amount: " + amount);
			        }
			}
			else if(bank==2) {
				System.out.println("ICICI Welcomes You");
				System.out.println("Enter the amout you want to get loan");
				int amount=sc.nextInt();
				 if (amount <= 200000) {
			            System.out.println("ICICI approves loan of amount: " + amount);
			        } else {
			            System.out.println("ICICI cannot approve loan of amount: " + amount);
			        }
			}
			if(bank==3) {
				System.out.println("IOB Welcomes You");
				System.out.println("Enter the amout you want to get loan");
				int amount=sc.nextInt();
				 if (amount <= 150000) {
			            System.out.println("IOB approves loan of amount: " + amount);
			        } else {
			            System.out.println("IOB cannot approve loan of amount: " + amount);
			        }
			}
			else {
				System.out.println("Sorry You Selected Wrong Bank");
			}
			
		}
		else {
			System.out.println("Phone Number Mismatch");
		}
	}
	else {
		System.out.println("Sorry Wrong User");
	}
	System.out.println("Thank You");
}
}
