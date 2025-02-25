package uniq;
import java.util.Scanner;
public class IfGrade {
	public static void main(String[]arg){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name");
	String a=sc.nextLine();
	System.out.println("Enter the Mark of Tamil");
	int b=sc.nextInt();
	System.out.println("Enter the Mark of Englis");
	int c=sc.nextInt();
	System.out.println("Enter the Mark of Maths");
	int d=sc.nextInt();
	System.out.println("Enter the Mark of Science");
	int e=sc.nextInt();
	System.out.println("Enter the Mark of Social");
	int f=sc.nextInt();
	int total=b+c+d+e+f;
    int average=total/5;
    System.out.println("Your Name is :"+a);
    System.out.println("Your Total Mark is :"+total);
    if(average==100) {
    	System.out.println("Your Grade is A");
    }
    else if(average>=90) {
    	System.out.println("Your Grade is B");
    }
    else if(average>=75) {
    	System.out.println("Your Grade is C");
    }
    else if(average>=50) {
    	System.out.println("Your Grade is D");
    }
    else if(average>=35) {
    	System.out.println("Your Grade is E");
    }
    else  {
    	System.out.println("Your Grade is FAIL");
    }
}	
}
