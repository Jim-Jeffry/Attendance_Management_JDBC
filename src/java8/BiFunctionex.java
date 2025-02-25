package java8;
import java.util.function.*;
public class BiFunctionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String>a=(b,c)->b.concat(c);
		System.out.println(a.apply("Jim ", "Jeffry"));
		BiFunction<String,Integer,String>x=(y,z)->y+z;
		String l=x.apply("Age ", 22);
		System.out.println(l);
	}

}
