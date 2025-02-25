package java8;
import java.util.function.*;
public class Supplierex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer>a=()->11234+1;
		System.out.println(a.get());
		Supplier<String>b=()->"Hi Hlo"+" Jim";
		System.out.println(b.get());
	}

}
