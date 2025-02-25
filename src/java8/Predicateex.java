package java8;
import java.util.function.*;

public class Predicateex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> a=b->b==78;
		System.out.println(a.test(78));
		Predicate<String>c=d->d.equals("Jim");
		System.out.println(c.test("jim"));
		
	}

}
