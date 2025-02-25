package uniq;

import java.util.*;
//public class task2_2{
public class task2_2{
//public int add() {
//	int a=12;
//	int b=23;
//	int c=(a+b);
//	return c;
//}
//public void sub() {
//	int d=34;
//	int e=45;
//	int f=(e-d);
//	System.out.println("Subraction :"+f);
//}
//public int mult() {
//	int g=5;
//	int h=6;
//	int i=g*h;
//	return i;
//}
//public void div() {
//	int j=50;
//	int k=5;
//	int l=j/k;
//	 System.out.println("Division :"+l);
//}
//
//public static void main(String[]arg) {
//	task2_2 n=new task2_2();
//	System.out.println("Addition :"+n.add());
//	n.sub();
//	System.out.println("Multiplication :"+n.mult());
//	n.div();
//}
	public static int add() {
		int a=56;
		int b=74;
		int c=a+b;
		return c;
	}
	public void sub() {
		int d=28;
		int e=29;
		int f=d-e;
		System.out.println("Subraction :"+f);
	}
	public int mult() {
		int g=4;
		int h=8;
		int i=g*h;
		return i;
	}
	public static void div() {
		float j=45f;
		float k=6f;
		float l=(j/k);
		System.out.println("Division :"+l);
	}
	public static String word() {
		String aa=(" Something");
		String bb=("Many Thing =");
		String ab=(bb+aa);
		return ab;
		
	}
	public static void main(String[]arg) {
		task2_2 n=new task2_2();
	System.out.println("Addition :"+add());
	n.sub();
	System.out.println("Multiplication :"+n.mult());
	div();
	System.out.println(word());
	}
}