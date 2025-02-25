package java8;
import java.util.function.*;
public class UnaryOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> a=b->b+b;
		System.out.println(a.apply(45));
		UnaryOperator<String> x=z->z+67;
		System.out.println(x.apply("Jim"));
		UnaryOperator<Integer> l=m->89*574;
		System.out.println(l.apply(0));
		
	}
}