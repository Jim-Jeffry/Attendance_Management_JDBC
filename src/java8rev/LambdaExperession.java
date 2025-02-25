package java8rev;
@FunctionalInterface
interface cal{
	float op(float a,float b);
	 default void m1() {
		
	 }
	 static void m2() {
		 
	 }
}
interface c1{
	 void m1(String a,String b);
}
public class LambdaExperession implements cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal.m2();
		m1();
		cal add=(a,b)->a+b;
		System.out.println(add.op(123, 876));
		cal sub=(a,b)->a-b;
		System.out.println(sub.op(123, 876));
		cal mul=(a,b)->a*b;
		System.out.println(mul.op(123, 876));
		cal div=(a,b)->a/b;
		System.out.println(div.op(123, 876));
		c1 obj=(a,b)->System.out.println(a+" "+b);
		obj.m1("the", "goat");
		
	}

	@Override
	public float op(float a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
