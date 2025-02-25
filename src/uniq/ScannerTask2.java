package uniq;
import java.util.Scanner;
class gh{
	int a;
	int b;
}
class hg{
	public  int add1() {
		gh n=new gh();
		Scanner sc=new Scanner(System.in);
		System.out.println("The value of A is :");
		n.a=sc.nextInt();
		return n.a;
	}
	public int add2() {
		gh nn=new gh();
		Scanner s=new Scanner(System.in);
		System.out.println("The value of B is :");
		nn.b=s.nextInt();
		return nn.b;
	}
}
public class ScannerTask2{
	public static void main(String[]arg) {
		hg obj =new hg();
		int a=obj.add1();
		int b=obj.add2();
		System.out.println("The value is :"+(a+b));
	}
}
