package oops;
import java.util.*;
class A{
	public int an;
}
class B{
	public int am;
}
class C{
	public int nn;
}
public class Vote {
	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
for(int i=1;i<=10;i++) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Vote For 1.Anil 2.Aamai 3.Notta");
	int v=sc.nextInt();
	if(v==1) {
		obj1.an++;
	}
	else if(v==2) {
		obj2.am++;
	}
	else if(v==3) {
		obj3.nn++;
	}
}
if(((obj1.an)>(obj2.am))&&((obj1.an)>(obj3.nn))) {
	System.out.println("Anil Won");
}
else if(((obj1.an)<(obj2.am))&&((obj2.am)>(obj3.nn))) {
	System.out.println("Aamai Won");
}
else if(((obj1.an)<(obj3.nn))&&((obj2.am)<(obj3.nn))) {
	System.out.println("NOTTA Have higher vote than Annil & Aamai");
}
else if(((obj1.an)==(obj2.am))&&((obj3.nn)==(obj2.am))) {
	System.out.println("Election Draw");
}
System.out.println("Total Vote For Anil :"+obj1.an);
System.out.println("Total Vote For Aamai :"+obj2.am);
System.out.println("Total Vote For NOTTA :"+obj3.nn);
	}
}