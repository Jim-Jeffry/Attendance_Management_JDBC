package uniq;
import java.util.Scanner;
public class IfTask2 {
public static void task() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value A");
	int a=sc.nextInt();
	System.out.println("Enter the value B");
	int b=sc.nextInt();
	System.out.println("Enter the value C");
	int c=sc.nextInt();
	if(a>b&&a>c) {
		System.out.println("The value A is Larger :"+a);
	}
	else if(b>a&&b>c){
		System.out.println("The value B is Larger :"+b);
	}
	else if(c>a&&c>a) {
		System.out.println("The value C is Larger :"+c);
	}
	else {
		System.out.println("The Give Value is in valid..!!");
	}
}
public static void main(String[]arg) {
	task();
}
}
