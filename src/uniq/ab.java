package uniq;

import java.util.*;

public class ab {
public static void main(String[] args) {
	int a = 52;
	int b = 34;
	int c = a+b;
	System.out.println("The total value is "+c);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Full Name");
	String d=sc.nextLine();
	System.out.println("What's Your Age");
	int e=sc.nextInt();
	System.out.println("Enter the date:");
	int date=sc.nextInt();
	System.out.println("Enter the month: ");
	int m=sc.nextInt();
	System.out.println("Enter the Year");
	int year=sc.nextInt();
	System.out.println("Enter Your Address:");
	String g=sc.next();
	System.out.println("Dear Sir/Mam.. Your Name is "+d +",Your age is "+e+ ",Date of Birth is: " + date + "/" + m + "/" + year+ "Your Address is"+g+".ThankYou Sir/Mam...!!");
}
}