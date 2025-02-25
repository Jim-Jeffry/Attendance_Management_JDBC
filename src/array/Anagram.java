package array;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word"); //add
		String a=sc.next();
		System.out.println("Enter a Word");//dad
		String b=sc.next();
		String a2="";
		String b2="";
		String a1[]=a.split("");
		String b1[]=b.split("");
		Arrays.sort(a1);
		for(int i=0;i<a.length();i++) {
        a2=a2+a1[i];
        }
		System.out.println(a2);
		Arrays.sort(b1);
		for(int i=0;i<b.length();i++) {
	        b2=b2+b1[i];
		}
		System.out.println(b2);
		if(a2.equals(b2)) {
			System.out.println("Its \"Anagram\"");
		}
		else {
			System.out.println("Its not Anagram");
		}
	}
}