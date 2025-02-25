package MultiTasking;
import java.util.Scanner;
@SuppressWarnings("serial")
//class Invalid extends Exception {
//    public Invalid(String message) {
//        super(message);
//    }
//}
class MyCalculator{
	long c=1;
	long power(int a,int b) throws Exception {
		if (a < 0 || b < 0) {
            throw new Exception("A or B should not be negative ");
        }
		if(a==0||b==0) {
			throw new Exception("A or B should not be Zero ");
		}
		for(int i=0;i<b;i++) {
			c*=a;
		}
		return c;
	}
}
public class Calculator {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		MyCalculator ob=new MyCalculator();
		System.out.println("Enter the Value of A and B");
		try {
			System.out.println("The Power value is : "+ob.power(sc.nextInt(), sc.nextInt()));
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
}