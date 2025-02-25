package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enthe The Details");
		for(int i=0;i<5;i++) {
			String a=sc.next();
			if(al.contains(a)) {
				al.remove(a);
				al.add(a);
			}
			else {
				al.add(a);
			}
		}
		System.out.println(al);	
	}
}