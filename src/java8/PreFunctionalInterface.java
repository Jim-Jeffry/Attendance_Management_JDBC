package java8;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PreFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Predicate<Integer> p=a->a==10;
      System.out.println(p.test(10));
      
      Predicate< String> p1=s->s.equals("hello");
      System.out.println(p1.test("hii"));
      
      BiPredicate<Integer,Integer> p2=(a,b)->a.equals(b);
      System.out.println(p2.test(5, 5));  
      System.out.println(p2.test(5, 10)); 
      
      Function<String,Integer> f=s->s.length();
      System.out.println(f.apply("java"));
      
      BiFunction<String, String, String> b=(x,y)->x.concat(y);
      System.out.println(b.apply("good ", "morning"));
      
      BiFunction<String, Integer, String> b1=(m,n)->m+n;
      String b2=b1.apply("java", 8);
      System.out.println(b2);
      Consumer<String> c=z->System.out.println(z);
      c.accept("Consumer interface");
      
      Supplier<Integer> s3=()->123456;
      System.out.println(s3.get());
      
      UnaryOperator<Integer> u=w->w*w;
      System.out.println(u.apply(10));
	}

}
