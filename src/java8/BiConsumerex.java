package java8;
import java.util.function.*;
public class BiConsumerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,Integer>a=(b,c)->System.out.println(b+c);
		a.accept("Jim Mark ", 95);
	}

}
