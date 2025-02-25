package uniq;
class A{
	int a=24;
	int b=34;
}
class B extends A{
	int c=87;
	int d=(a+b)-c;
}
public class MultiInheritance extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiInheritance ob=new MultiInheritance();
System.out.println(ob.d);
System.out.println(ob.a);
	}

}
