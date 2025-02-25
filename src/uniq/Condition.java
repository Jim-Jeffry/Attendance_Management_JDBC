package uniq;

import java.util.Scanner;

public class Condition {
	Scanner sc=new Scanner(System.in);
	static int b=1000;
	void menu() {
		System.out.println("Please Choose an option");
		System.out.println("1. check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");
		System.out.println("Enter Your Choice");
		int a=sc.nextInt();
		switch (a) {
		case 1:
			check();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
		case 4:
			System.out.println("Thank you for using the ATM!");
		}
	}
	private void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount of withdraw :");
		int d=sc.nextInt();
		if(d>b) {
			System.out.println("Insufficient funds.");
		}
		else {
			b-=d;
		}
		menu();
		
	}
	private void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to deposit:");
		int c=sc.nextInt();
		System.out.println("Deposited "+c);
		b+=c;
		System.out.println("New Balance : "+b);
		menu();
		
	}
	private void check() {
		// TODO Auto-generated method stub
		System.out.println(b);
		menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Condition obj=new Condition();
		obj.menu();
	}

}
