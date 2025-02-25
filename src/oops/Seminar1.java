package oops;
class Polymorphism{
	 String OverRiding1() {
		 int a=24;
		 String b=" This is Polymorphism";
		return a+b;
	}
}
class type1 extends Polymorphism{
	String OverRiding2() {
		int a=65;
		String b=" This is method OverRiding";
		return a+b;
	}
}
class type2{
	void overloading(int x,int y) {
		int add=x+y;
		System.out.println(add);
	}
	void overloading(int x) {
		int s=x;
		System.out.println(s);
	}
	void overloading(String x) {
		String s=x;
		System.out.println(s);
	}
}
public class Seminar1 {
public static void main(String[]arg) {
	type1 obj=new type1();
	System.out.println(obj.OverRiding2());
	type2 obj2=new type2();
	obj2.overloading(23,87);
	obj2.overloading(28);
	obj2.overloading("OverLoading");
	
}
}