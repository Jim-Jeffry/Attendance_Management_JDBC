package java8rev;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> Pre=a->a.equals("lalala");
		System.out.println(Pre.test("sdfghjk"));
		
		BiPredicate<Integer,Integer> BiPre=(a,b)->a.equals(b);
		System.out.println(BiPre.test(12, 34));
		
		BiFunction<String,String,String> BiFunc=(a,b)->a.concat(b);
		System.out.println(BiFunc.apply("Athu", " Sari"));
		
		BiFunction<String,Integer,String> bifunc=(a,b)->a+b;
		System.out.println(bifunc.apply("asdfgh", 56));
		int temp=4;
		for(int i=0;i<5;i++){
			for(int j=temp;j>=0;j--){
				System.out.print("*");
			}
			temp--;
			System.out.println();
			
		}
		
	}

}
