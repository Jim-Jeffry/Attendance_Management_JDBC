package array;
import java.util.*;
class sum1{
	void get() {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		System.out.println("Enter the values");
		for(int i=0;i<=5;i++) {
			a[i]=sc.nextInt();
		}
		int b=0;
		for( int i=0;i<=5;i++) {
			b=a[i]+b;
		}
		System.out.println("Addition "+b);
		float c=b/6;
		System.out.println("Average "+c);
		
	}
}
public class Arr4 {
	public static void main(String[] args) {
		sum1 obj1=new sum1();
		obj1.get();
	}

}
