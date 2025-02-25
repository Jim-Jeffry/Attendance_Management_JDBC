package uniq;
import java.util.*;
class x{
	int a;
	int b;
}
 class y{
	 public static void add() {
	x n=new x();
	Scanner sc=new Scanner(System.in);
	System.out.println("The value of A :");
	n.a=sc.nextInt();
	System.out.println("The value of B :");
	n.b=sc.nextInt();
	sc.close();
	int c=n.a+n.b;
	System.out.println("The Addition Value is :"+c);
	 }
}
// class z{
// public int sub() {
//	 y p=new y();
//	int d= a+ b;
//	return d;
// }
// }
public class scannertask {
public static void main(String[]arg) {
	y nn=new y();
//System.out.println("The value is :"+nn.add());
	nn.add();
//	z dn=new z();
//	System.out.println("The Subbractin value is :"+dn.sub());
}
}
