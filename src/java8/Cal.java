package java8;
@FunctionalInterface
interface calc{
	int m1(int a,int b);
}
public class Cal {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		calc add=(a,b)-> a+b;
		System.out.println(add.m1(2,4));
		calc sub=(a,b)->a-b;
		System.out.println(sub.m1(2, 4));
		calc sum=(a,b)-> a/b;
		System.out.println(sum.m1(2,4));
		calc div=(a,b)->a*b;
		System.out.println(div.m1(2, 4));
		calc add1=(a,b)->a+b;
		System.out.println(add1.m1(4,8));
	}

}
