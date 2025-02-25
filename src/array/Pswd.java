package array;
import java.util.Scanner;
public class Pswd {
	void step1() {
		System.out.println("Enter the Password");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		if(a.length()>=8) {
			for (char ch : a.toCharArray()) {
				if(((Character.isUpperCase(ch))<=a.length())||((Character.isUpperCase(ch))==a.length())) {
					if(Character.isLowerCase(ch)) {
					System.out.println(a);
					}
					else {
						System.out.println("There Were No LowerCase Letters");
						step1();
					}
				}
				else {
					System.out.println("There Were No UpperCase Letters");
					step1();
				}
			}
			
		}
		else {
			System.out.println("Lesser than 8 Char");
			step1();
			}
	}
public static void main(String[] args) {
	Pswd ob=new Pswd();
	ob.step1();
	
}
}
