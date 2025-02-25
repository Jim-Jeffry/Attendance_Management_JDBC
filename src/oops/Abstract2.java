package oops;
import java.util.*;
abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
	
}
class SavingsAccount extends BankAccount{
	Scanner sc=new Scanner(System.in);
	void deposit() {
		System.out.println("Average Deposit for Savings Account is rs 30,000");
		System.out.println("Enter the Amount You Are going to Deposit");
		int sd=sc.nextInt();
		if(sd<=30000) {
			System.out.println("You Have Desposited rs "+sd+" on your Savings Account" );
		}
		else {
			System.out.println("You exceed the limit for deposit");
		}
	}
	void withdraw() {
		System.out.println("Average Withdraw for Savings Account is rs 20,000");
		System.out.println("Enter the Amount You Are going to Withdraw");
		int sw=sc.nextInt();
		if(sw<=20000) {
			System.out.println("You Have Withdrawed rs "+sw+" on your Savings Account" );
		}
		else {
			System.out.println("You exceed the limit for Withdraw");
		}
	}
}
class CurrentAccount extends BankAccount{
	Scanner sc=new Scanner(System.in);
	void deposit() {
		System.out.println("Average Deposit for Current Account is rs 2,00,000");
		System.out.println("Enter the Amount You Are going to Deposit");
		int cd=sc.nextInt();
		if(cd<=200000) {
			System.out.println("You Have Desposited rs "+cd+" on your Current Account" );
		}
		else {
			System.out.println("You exceed the limit for deposit");
		}
	}
	void withdraw() {
		System.out.println("Average Withdraw for Current Account is rs 50,000");
		System.out.println("Enter the Amount You Are going to Withdraw");
		int cw=sc.nextInt();
		if(cw<=50000) {
			System.out.println("You Have Withdrawed rs "+cw+" on your Current Account" );
		}
		else {
			System.out.println("You exceed the limit for Withdraw");
		}
	}
}
public class Abstract2 {
public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	SavingsAccount b=new SavingsAccount();
	CurrentAccount c=new CurrentAccount();
	System.out.println("Which type of account you want to get details");
	System.out.println("1.Savings Account|| 2.Current Account");
	int a=sc.nextInt();
	if(a==1) {
		b.deposit();
		b.withdraw();
	}
	else if(a==2) {
		c.deposit();
		c.withdraw();
	}
	else {
		System.out.println("Wrong Opertion");
	}
}
}
