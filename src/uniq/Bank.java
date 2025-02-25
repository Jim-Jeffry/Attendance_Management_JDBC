package uniq;
import java.util.InputMismatchException;
import java.util.Scanner;
abstract class Bank{
	public String Name;
	public String PhnNo;
	public void detail(String info) {
		if (info.matches("\\d+")) {
            this.PhnNo = info;
        } else {
            this.Name = info;
        }
        System.out.println("Name: " + (Name != null ? Name : "Not provided"));
        System.out.println("Phone Number: " + (PhnNo != null ? PhnNo : "Not provided"));
    }

    // Abstract method to be overridden by subclasses
    public abstract void loan(double amount);

	}
	


class SBI extends Bank{
	public void loan(double amount) {
        if (amount <= 100000) {
            System.out.println("SBI approves loan of amount: " + amount);
        } else {
            System.out.println("SBI cannot approve loan of amount: " + amount);
        }
    }
	
}
class ICICI extends Bank{
	 public void loan(double amount) {
	        if (amount <= 200000) {
	            System.out.println("ICICI approves loan of amount: " + amount);
	        } else {
	            System.out.println("ICICI cannot approve loan of amount: " + amount);
	        }
	    }
	
}
class IOB extends Bank{
	 public void loan(double amount) {
	        if (amount <= 50000) {
	            System.out.println("IOB approves loan of amount: " + amount);
	        } else {
	            System.out.println("IOB cannot approve loan of amount: " + amount);
	        }
	    }
	
}
public class Main {
public static void main(String[]arg) {
	 try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Enter bank type (SBI, ICICI, IOB): ");
         String bankType = scanner.nextLine();
         Bank bank = null;

         switch (bankType.toUpperCase()) {
             case "SBI":
                 bank = new SBI();
                 break;
             case "ICICI":
                 bank = new ICICI();
                 break;
             case "TMB":
                 bank = new IOB();
                 break;
             default:
                 System.out.println("Invalid bank type");
                 System.exit(0);
         }

         System.out.println("Enter name or phone number: ");
         String detail = scanner.nextLine();
         bank.detail(detail);

         System.out.println("Enter loan amount: ");
         double amount = 0;
         try {
             amount = scanner.nextDouble();
         } catch (InputMismatchException e) {
             System.out.println("Invalid input for loan amount. Please enter a valid number.");
             return;
         }
         bank.loan(amount);
     }
}
}
