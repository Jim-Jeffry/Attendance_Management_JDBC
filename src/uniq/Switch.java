package uniq;
import java.util.Scanner;
public class Switch {
public static void main(String[]arg) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Current Day");
String a=sc.nextLine();
switch(a) {
case "Sunday":
	System.out.println("Non-Working Day");
	break;
case "Monday":
	System.out.println("Working Day");
	break;
case "Tuesday":
	System.out.println("Working Day");
	break;
case "Wednesday":
	System.out.println("Working Day");
	break;
case "Thursday":
	System.out.println("Working Day");
	break;
case "Friday":
	System.out.println("Working Day");
	break;
case "Saturday":
	System.out.println("Working Day");
	break;
default :
System.out.println("Error");
break;
}
}
}