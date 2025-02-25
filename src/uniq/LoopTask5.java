package uniq;
import java.util.Scanner;
public class LoopTask5 {
public static void For() {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	for(int i=1;i<=5;i++) {
		System.out.println("Enter the mark of the Subject"+i);
		int subject=sc.nextInt();
		sum=sum+subject;
	}
	System.out.println("The total marks scored by the student is :"+sum);
	float avg=sum/5;
	System.out.println("The Average of the Student is :"+avg);
}
public static void main(String[]arg) {
	For();
}
}