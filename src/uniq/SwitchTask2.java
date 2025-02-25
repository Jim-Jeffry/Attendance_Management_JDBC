package uniq;
import java.util.Scanner;
public class SwitchTask2 {
	public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of A:");
	int a=sc.nextInt();
	System.out.println("Enter the value of B:");
	int b=sc.nextInt();
//	sc.nextLine();
	System.out.println("Enter The Operator");
	String c=sc.next();
	switch(c) {
	case "+":
		System.out.println("The OutPut is :"+(a+b));
		break;
	case "-":
		System.out.println("The OutPut is :"+(a-b));
		break;
	case "*":
		System.out.println("The OutPut is :"+(a*b));
		break;
	 case "/":
         if (b == 0) {
             System.out.println("Error: Division by zero is not allowed.");
         } 
         else {
             System.out.println("The Output is: " + (a / b));
         }
         break;
     case "%":
         if (b == 0) {
             System.out.println("Error: Module by zero is not allowed.");
         } 
         else {
             System.out.println("The Output is: " + (a % b));
         }
         break;
     default:
         System.out.println("Invalid operator.");
         break;
	}
	sc.close();	
	}
}
