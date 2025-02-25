package oops;
import java.util.Scanner;
interface  Greeting{
	void Message();
}
class FormalGreeting implements Greeting{
	public void Message(){
		System.out.println("Have a Great Day");
		
	}
}
public class CasualGreeting implements Greeting{
	public void Message() {
		System.out.println("Hey what's up");
	}
	public static void main(String[]arg) {
		Scanner sc=new Scanner(System.in);
		FormalGreeting obj1=new FormalGreeting();
		CasualGreeting obj2=new CasualGreeting();
		System.out.println("Formal or Casual Greeting");
		String a=sc.next();
		if(a.equals("Formal")) {
		obj1.Message();
		}
		else if(a.equals("Casual")) {
		obj2.Message();
		}
		else {
			System.out.println("Kaetathuku Bathila solra...****");
		}
	}
}
