package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<Integer>();
	System.out.println("Enter the Values");
	for(int i=0;i<5;i++) {
		al.add(sc.nextInt());
	}
	System.out.println(al);
	ArrayList<String> als=new ArrayList<String>();
	System.out.println("Enter The Words");
	for(int i=0;i<5;i++) {
		als.add(sc.next());
	}
	System.out.println(als);
}
}
