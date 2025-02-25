package oops;
import java.util.Scanner;
 abstract class journey{
	String Path;
	float TravelTime;
	int Distance=800;
}
class ways extends journey{
	void bus(char a){
		System.out.println("You Selected Method Bus");
	String Path="Kilambakkam to Vadaseri";
	float TravelTime=14.5f;
	System.out.println("Starting and Ending Point :"+Path);
	System.out.println("Travelling Time Hrs :"+TravelTime);
	System.out.println("Total Travelling Distance km :"+Distance);
	}
	void bus(int a){
		System.out.println("You Selected Method Train");
		String Path="Egmore to Eraniel";
		float TravelTime=11.5f;
		int Distance=750;
		System.out.println("Starting and Ending Point :"+Path);
		System.out.println("Travelling Time Hrs :"+TravelTime);
		System.out.println("Total Travelling Distance km :"+Distance);
		}
	void bus(String a){
		System.out.println("You Selected Method Car");
		String Path="Your Location to Home";
		float TravelTime=14.5f;
		String Distance="Unknown";
		System.out.println("Starting and Ending Point :"+Path);
		System.out.println("Travelling Time Hrs :"+TravelTime);
		System.out.println("Total Travelling Distance km :"+Distance);
		}
}
public class Oops1 {
public static void main(String[]arg) {
	ways obj=new ways(); 
	Scanner sc=new Scanner(System.in);
	System.out.println("Select the Mode of Transport ");
	System.out.println("Bus    Train    Car");
	String mode=sc.next();
	if(mode.equals("Bus")) {
	obj.bus('1');
	}
	else if(mode.equals("Train")) {
		obj.bus(1);
	}
	else if(mode.equals("Car")) {
		obj.bus(null);
	}
	else {
		System.out.println("You were Selected Wrong Mode of Transport");
	}
}
}