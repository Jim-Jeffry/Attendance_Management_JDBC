package uniq;
import java.util.Scanner;
class Bank{
	void loan() {
		long min_loan;
		long max_loan;
	}
	void detail(String name) {
		System.out.println(name);
	}
	void detail(long phn) {
		System.out.println(phn);
	}
}
class ICICI extends Bank{
	void loan() {
		Scanner s1=new Scanner(System.in);
		long min_loan=50000l;
		long max_loan=1000000l;
		System.out.println("");
		System.out.println("Enter your cibil score: ");
		int cibil=s1.nextInt();
		if(cibil>900) {
			System.out.println("Enter the loan amount: ");
			long amnt=s1.nextInt();
			if(amnt>=min_loan && amnt<=max_loan) {
				System.out.println("Loan sanctioned");
			}
			else {
				System.out.println("You are not eligible for the Loan");
			}
		}
		else {
			System.out.println("You have not enough cibil score!!");
		}
	}
}
class TMB extends Bank{
	void loan() {
		Scanner s2=new Scanner(System.in);
		long min_loan=5000l;
		long max_loan=100000l;
		System.out.println("Enter your cibil score: ");
		int cibil=s2.nextInt();
		if(cibil>=600) {
			System.out.println("Enter the loan amount: ");
			long amnt=s2.nextInt();
			if(amnt>=min_loan && amnt<=max_loan) {
				System.out.println("Loan sanctioned");
			}
			else {
				System.out.println("You are not eligible for the Loan");
			}
		}
		else {
			System.out.println("You have not enough cibil score!!");
		}
	}
}
public class SBI extends Bank{
	 void loan() {
		 Scanner s3=new Scanner(System.in);
		 long min_loan=50000l;
			long max_loan=1000000000l;
			System.out.println("Enter your cibil score: ");
			int cibil=s3.nextInt();
			if(cibil>=750) {
				System.out.println("Enter the loan amount: ");
				long amnt=s3.nextInt();
				if(amnt>=min_loan && amnt<=max_loan) {
					System.out.println("Loan sanctioned");
				}
				else {
					System.out.println("You are not eligible for the Loan");
				}
			}
			else {
				System.out.println("You have not enough cibil score!!");
			}
} 
	 static void m(String bname) {
				if(bname.equals("SBI")) {
					SBI obj1=new SBI();
					obj1.loan();
				}
				else if(bname.equals("ICICI")) {
					ICICI obj2=new ICICI();
					obj2.loan();
				}
				else if(bname.equals("TMB")) {
					TMB obj3=new TMB();
					obj3.loan();
				}
				else {
					System.out.println("No Bank Available");
				}
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to login using your name or phone_number?? ");
		String in=sc.next();
		switch(in) {
		case "name" :
			 Scanner s4=new Scanner(System.in);
			 System.out.println("Enter your name: ");
				String name=s4.next();
				if(name.equals("Bharath")) {
					System.out.println("In which bank do you want to get loan?");
					String bname=s4.next();
					m(bname);
				}
		break;
		case "number" :
			 Scanner s5=new Scanner(System.in);
			 System.out.println("Enter your mobile  number: ");
				long num=s5.nextLong();
				if(num==1234567) {
					System.out.println("In which bank do you want to get loan?");
					String bname=s5.next();
				
			m(bname);
				}
		break;
			default :
				System.out.println("Invalid input");
			break;
		}
	}
		
}