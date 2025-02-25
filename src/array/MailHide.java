package array;
import java.util.Scanner;
public class MailHide {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mail Id");
		String a=sc.next();
		String a1="";
		String a2[]=a.split("");
		int b=a.indexOf("@");
		for(int i=1;i<a.length();i++) {
			if(i<b) {
				 a1="*"+a1;
			}
			else {
				a1=a1+a2[i];
			}
		}
		System.out.print(a2[0]);
		System.out.print(a1);
	}
}