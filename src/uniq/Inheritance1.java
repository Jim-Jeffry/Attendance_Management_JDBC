package uniq;
import java.util.Scanner;
class Adec {
	float a;
	float b;
}
class Badd extends Adec{
	public float Add(float a,float b) {
		float add=a+b;
		return add;
	}
}
class Csub extends Badd{
	public float Sub(float a,float b) {
		float sub=a-b;
		return sub;
	}
}
class Dmult extends Csub{
	public float Mult(float a,float b) {
		float mult=a*b;
		return mult;
	}
}
class Ediv extends Dmult{
	public float Div(float a,float b) {
		float div=a+b;
		return div;
	}
}
public class Inheritance1 extends Ediv {
	public static void main(String[]arg) {
		Inheritance1 ob=new Inheritance1();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of A");
	ob.a=sc.nextFloat();
	System.out.println("Enter the value of B");
	ob.b=sc.nextFloat();
	System.out.println("The Addition value is "+ob.Add(ob.a,ob.b));
	System.out.println("The Subraction value is "+ob.Sub(ob.a,ob.b));
	System.out.println("The Multiplication value is "+ob.Mult(ob.a,ob.b));
	System.out.println("The Division value is "+ob.Div(ob.a,ob.b));
	}
}