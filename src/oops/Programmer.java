package oops;
import java.util.Scanner;
class Employees{
	public void employee_detail(){
		
	}
	public void calculating_bonus() {
		
	}
}
class Manager extends Employees{
	String name="Jim";
	String role="Manager";
	int salary=75000;
	int exp=10;
public void employee_detail(){
	System.out.println("Employee name: "+name);
	System.out.println("Employee Role: "+role);
	System.out.println("Employee salary: "+salary);
	System.out.println("Employee exp: "+exp);
	}
	public void bonus() {
		if(exp>=0&&exp<=2) {
			System.out.println("You Have 15% Hike");
		}
		else if(exp>=3&&exp<=5) {
			System.out.println("You Have 25% Hike");
		}
		else if(exp>=6&&exp<=8) {
			System.out.println("You Have 35% Hike");
		}
		else if(exp>=9&&exp<=12) {
			System.out.println("You Have 45% Hike");
		}
	}
}
class Developer extends Employees{
	String name="BHarath";
	String role="Developer";
	int salary=55000;
	int exp=6;
public void employee_detail(){
	System.out.println("Employee name: "+name);
	System.out.println("Employee Role: "+role);
	System.out.println("Employee salary: "+salary);
	System.out.println("Employee exp: "+exp);
	}
	public void bonus() {
		if(exp>=0&&exp<=2) {
			System.out.println("You Have 15% Hike");
		}
		else if(exp>=3&&exp<=5) {
			System.out.println("You Have 25% Hike");
		}
		else if(exp>=6&&exp<=8) {
			System.out.println("You Have 35% Hike");
		}
		else if(exp>=9&&exp<=12) {
			System.out.println("You Have 45% Hike");
		}
	}
}
public class Programmer extends Employees{
	String name="Sanjay";
	String role="Programmer";
	int salary=35000;
	int exp=2;
public void employee_detail(){
	System.out.println("Employee name: "+name);
	System.out.println("Employee Role: "+role);
	System.out.println("Employee salary: "+salary);
	System.out.println("Employee exp: "+exp);
	}
	public void bonus() {
		if(exp>=0&&exp<=2) {
			System.out.println("You Have 15% Hike");
		}
		else if(exp>=3&&exp<=5) {
			System.out.println("You Have 25% Hike");
		}
		else if(exp>=6&&exp<=8) {
			System.out.println("You Have 35% Hike");
		}
		else if(exp>=9&&exp<=12) {
			System.out.println("You Have 45% Hike");
		}
		if(exp>=0&&exp<=2) {
			System.out.println("Your Salary is "+(salary+5250));
		}
		else if(exp>=3&&exp<=5) {
			System.out.println();
		}
		else if(exp>=6&&exp<=8) {
			System.out.println("You Have 35% Hike");
		}
		else if(exp>=9&&exp<=12) {
			System.out.println("You Have 45% Hike");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Check the bonous of Manager, Developer, Programmer");
		String r=sc.next();
		Programmer ob=new Programmer();
		if(r.equals("Manager")) {
			Manager ob1=new Manager();
			ob1.employee_detail();
			ob1.bonus();
		}
		else if(r.equals("Developer")) {
			Developer ob1=new Developer();
			ob1.employee_detail();
			ob1.bonus();
		}
		else if(r.equals("Programmer")) {
			Programmer ob1=new Programmer();
			ob1.employee_detail();
			ob1.bonus();
		}
		else {
			System.out.println("You have choosen unavailabe role");
		}
	}

}

