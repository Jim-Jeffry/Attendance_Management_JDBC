package java8;

import java.util.function.*;
public class Consumerex {
	public static void main(String[] args) {
		Consumer<String>a=b->System.out.println(b);
		a.accept("Vanakam da Maple");
		Consumer<Integer>c=d->System.out.println(d);
		c.accept(83);
	}
	
}
