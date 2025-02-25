package oops;
import java.util.Scanner;
class Bank1{
	void loan() {
		long min_loan;
		long max_loan;
	}
	String detailname(String name) {
		return name;
	}
	long detailnum(long num) {
		return num;
	}
}
class sbi extends Bank1{
	Scanner sc=new Scanner(System.in);
	void loan() {
		long min_loan=50000l;
		long max_loan=500000l;
		System.out.println("Enter Your Cibil Score");
		int a=sc.nextInt();
		if(a>=700) {
			System.out.println("You have Enough cibil score");
			System.out.println("Enter the amount of loan");
			int b=sc.nextInt();
			if(b>= min_loan && b<= max_loan ) {
				System.out.println("Your amount has been Santioned "+b);
			}
			else {
				System.out.println("Sorry we cannot santion your amount"+b);
			}
		}
		else {
			System.out.println("Sorry You dont have enough cibil score");
		}
	}
}
class icici extends Bank1{
	Scanner sc=new Scanner(System.in);
	void loan() {
		long min_loan=100000l;
		long max_loan=5000000l;
		System.out.println("Enter Your Cibil Score");
		int a=sc.nextInt();
		if(a>=1000) {
			System.out.println("You have Enough cibil score");
			System.out.println("Enter the amount of loan");
			int b=sc.nextInt();
			if(b>= min_loan && b<= max_loan ) {
				System.out.println("Your amount has been Santioned"+b);
			}
			else {
				System.out.println("Sorry we cannot santion your amount"+b);
			}
		}
		else {
			System.out.println("Sorry You dont have enough cibil score");
		}
	}
}
public class tmb extends Bank1{
	Scanner sc=new Scanner(System.in);
	void loan() {
		long min_loan=10000l;
		long max_loan=100000l;
		System.out.println("Enter Your Cibil Score");
		int a=sc.nextInt();
		if(a>=500) {
			System.out.println("You have Enough cibil score");
			System.out.println("Enter the amount of loan");
			int b=sc.nextInt();
			if(b>= min_loan && b<= max_loan ) {
				System.out.println("Your amount has been Santioned"+b);
			}
			else {
				System.out.println("Sorry we cannot santion your amount"+b);
			}
		}
		else {
			System.out.println("Sorry You dont have enough cibil score");
		}
	}
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome");
	System.out.println("By which method you are going to log- Name,PhnNo");
	String log=sc.next();
	Bank1 obj1=new Bank1();
	switch (log) {
	case("Name"):
		System.out.println("Enter Your name");
		String username="Jim";
		String name=sc.next();
		if(username.equals(obj1.detailname(name))) {
			System.out.println("Welcome User");
			System.out.println("Enter the Bank Name");
			String bname=sc.next();
			if(bname.equals("SBI")) {
				sbi ob1=new sbi();
				ob1.loan();
			}
			else if(bname.equals("ICICI")) {
				icici ob1=new icici();
				ob1.loan();
			}
			else if(bname.equals("TMB")) {
				tmb ob1=new tmb();
				ob1.loan();
			}
			else {
				System.out.println("Yos were Selected Wrong bank");
			}
			break;
			
		}
		else {
			System.out.println("Wrong User Name");
		}
		break;
	case("PhnNo"):
		System.out.println("Enter Your Phone Number");
		long num=8440418471l;
		long Num=sc.nextInt();
		if(num==obj1.detailnum(num)) {
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Wrong Phone Number");
		}
		System.out.println("Enter the Bank Name");
		String bname=sc.next();
		if(bname.equals("SBI")) {
			sbi ob1=new sbi();
			ob1.loan();
		}
		else if(bname.equals("ICICI")) {
			icici ob1=new icici();
			ob1.loan();
		}
		else if(bname.equals("TMB")) {
			tmb ob1=new tmb();
			ob1.loan();
		}
		else {
			System.out.println("Yos were Selected Wrong bank");
		}
		break;
		default:
			System.out.println("Invalid input");
		break;
	}
}
}

