package array;
import java.util.Scanner;
@SuppressWarnings("serial")
class withdrawexception extends RuntimeException{
	withdrawexception(String s){
		super(s);
	}
}
class ATM{
	int a=12032003;
	int b=5272;
	static int c=4500;
	Scanner sc=new Scanner(System.in);
	void login() {
		System.out.println("Enter Your Ac Num");
		int a1=sc.nextInt();
			if(a1==a) {
				System.out.println("Enter Your Ac Password");
				int b1=sc.nextInt();
									if(b1==b) {
						System.out.println("Welome Jim..!!");
						action();
					}
					else {
						System.out.println("Wrong Password");
						login();
					}
			}
			else {
				System.out.println("Wrong Ac Num");
				login();
			}
	}
	void action() {
		System.out.println("Jim Your Current Balance is : "+c);
		System.out.println("Select an Operation");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance");
		int o=sc.nextInt();
		switch(o) {
		case 1:try {
			withdraw();
		}
		catch(withdrawexception e) {
			System.err.println(e);
			cnt();
		}
			
			break;
		case 2:
			System.out.println("Enter the Amount You Want to Deposit From Your Current Balance "+c);
			int dd=sc.nextInt();
			c+=dd;
			cnt();
			break;
		case 3:
			System.out.println("Your final Balance is : "+c);
			cnt();
			break;
	}
	}
	void withdraw() throws withdrawexception{
        System.out.println("Enter the amount you want to withdraw:");
        int amountToWithdraw = sc.nextInt();
        if (amountToWithdraw > c) {
            throw new withdrawexception("The amount exceeds your current balance.");
            }
        else {
            c -= amountToWithdraw;
            System.out.println("Withdrawal successful! Your new balance is: " + c);
        }
        cnt();
    }
	void cnt() {
		System.out.println("Do You Want to Continue the Process");
		System.out.println("Yes/No");
		String yn=sc.next();
		if(yn.equals("yes")) {
			action();
		}
		else if(yn.equals("no")) {
			System.out.println("ThankYou Jim...!!");
		}
		else {
			System.out.println("Enter Valid Input");
			cnt();
		}
	}
}
public class AtmException {
public static void main(String[] args) {
	ATM ob=new ATM();
	ob.login();
}
}