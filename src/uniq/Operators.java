package uniq;

public class Operators {
 public static void arithmetic() {
	int a=60,b=20;
	System.out.println("Arithmetic Operator");
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
 }
 public static void assigment() {
	 int a=20;
	 System.out.println("Assigment Operator");
	 System.out.println(a+=10);
	 System.out.println(a-=10);
	 System.out.println(a*=10);
	 System.out.println(a/=10);
	 System.out.println(a%=10);
 }
 public static void relational() {
	 int a=20,b=60;
	 System.out.println("Relational Operator");
	 System.out.println(a<b);
	 System.out.println(a>b);
	 System.out.println(a<=b);
	 System.out.println(a>=b);
	 System.out.println(a==b);
	 System.out.println(a!=b);
 }
 public static void logical() {
	 int a=20,b=60;
	 System.out.println("Logical Operator");
	 System.out.println(a>10&&b<10);
	 System.out.println(a>10||b<10);
	 System.out.println(!(a>10&&b<10));
 }
 public static void unary() {
	 int a=20;
	 System.out.println("Unary Operator");
	 System.out.println(a++);
	 System.out.println(++a);
	 System.out.println(a--);
	 System.out.println(--a);
 }
 public static void ternary() {
	 int a=20;
	 System.out.println("Ternary Operator");
	 System.out.println((a<30)?"Smaller":"Bigger");
	 System.out.println((a<10)?"Smaller":"Bigger");
 }
 public static void bitwise() {
	 int a=20,b=60;
	 System.out.println("Bitwise Operator");
	 System.out.println(a&b);
	 System.out.println(a|b);
 }
 public static void shift() {
	 int a=60,b=20;
	 System.out.println("Shift Operator");
	 System.out.println(a<<b);
	 System.out.println(a>>b);
 }
public static void main(String[]arg) {
	arithmetic();
	assigment();
	relational();
	logical();
	unary();
	ternary();
	bitwise();
	shift();
}
}
