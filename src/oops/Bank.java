package oops;
import java.util.*;
class Account{
	private int AccNo=52725272;
	private String AccHr="Jim";
	private int Balc=13000;
	public int getaccno(){
		return AccNo;
	}
	public String getacchr() {
		return AccHr;
	}
	public int getbalc() {
		return Balc;
	}
	public int setaccno() {
		return AccNo;
	}
	public String setacchr() {
		return AccHr;
	}
	public int setbalc() {
		return Balc;
	}
	public void deposit(int c) {
		System.out.println("Current Balance is :"+(Balc+c));
	}
	public void withdraw(int c) {
		if(Balc>=c) {
			System.out.println("Current Balance is :"+(Balc-c));
		}
		else {
			System.out.println("You Dont Have Sufficient Balance to Withdraw");
		}
	}
}
class operation{
	void op1(){
		Scanner sc=new Scanner(System.in);
		Account obj1=new Account();
		System.out.println("Enter The Account Number");
		int a=sc.nextInt();
		if(a==obj1.getaccno()) {
			System.out.println("Welcome :"+obj1.getacchr());
			System.out.println("Balance :"+obj1.getbalc());
			System.out.println("Select an Option");
			System.out.println("1.Deposit      2.Withdraw");
			int b=sc.nextInt();
			if(b==1) {
				System.out.println("Enter the Amount You Want to Deposit");
				int c=sc.nextInt();
				obj1.deposit(c);
			}
			else if(b==2) {
				System.out.println("Enter the Amount You Want to Withdraw");
				int c=sc.nextInt();
				obj1.withdraw(c);
			}
		}
		else {
			System.out.println("Wrong Account Number");
		}
	}
}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operation op=new operation();
		op.op1();
	}
}