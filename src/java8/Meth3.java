package java8;

import java.util.function.Predicate;

public class Meth3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="";
		Predicate<String> p=b->b.isEmpty();
		if(p.test(a)) {
			System.out.println("is empty");
		}
		else {
			System.out.println("not empty");
		}
	}

}
