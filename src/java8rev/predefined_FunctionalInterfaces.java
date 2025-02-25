package java8rev;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiConsumer;



public class predefined_FunctionalInterfaces {
	
	predefined_FunctionalInterfaces()
	{
		System.out.println("hello");
	}
	predefined_FunctionalInterfaces(int a){
		System.out.println(a);
	}
	
	String method1()
	{
		return "instance method reference";
	}
	public static void main(String[] args) {
		Predicate<String> isTrue = s -> s.equalsIgnoreCase("Soup");
		System.out.println(isTrue.test("soup"));
		
		BiPredicate<String,String> biPre = (a,s) -> a.equals(s);
		System.out.println(biPre.test("jim", "jam"));
		
		String t = "jimmyjammy";
		Function<String,Integer> Length = str -> str.length();
		System.out.println(Length.apply(t));
		
		BiFunction<String,String,String> Coc = (con,noc) -> con.concat(noc);
		System.out.println(Coc.apply(t, "jam"));
		
		Consumer<Integer> loop = it -> {
			for(int i=0;i<5;i++) {
				System.out.println(it);
				it++;
			}
		};
		loop.accept(0);
		
		BiConsumer<Integer,Integer> add = (a,b) -> System.out.println(a+b);
		add.accept(12, 21);
		
		Supplier<String> StringMessage = () -> "gettttt";
		String s22 = StringMessage.get();
		System.out.println(s22);
		
		UnaryOperator<String> unary = x -> x.concat("jam"); 
		System.out.println(unary.apply("jim"));
		
		BinaryOperator<Integer> diff = (a,b) -> (a-90) + (b+78);
		System.out.println(diff.apply(1, 2));
		
		
		Predicate<String> p1=String :: isEmpty;
		System.out.println(p1.test("hi"));
		
		predefined_FunctionalInterfaces obj=new predefined_FunctionalInterfaces();
		
		Supplier<String> s=obj :: method1;
		System.out.println(s.get());
		
	   Consumer<Integer> c1=predefined_FunctionalInterfaces :: new;
	   c1.accept(6);
		
	}
}
