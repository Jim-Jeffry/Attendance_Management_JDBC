package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(1,2,3,4);
		List<Integer> l2= Arrays.asList(5,6,7,8);
		List<Integer> l3=new ArrayList<>();
		
		BiFunction<Integer,Integer,Integer> li=(a,b)->a+b;
		for(int i=0;i<l1.size();i++) {
			l3.add(li.apply(l1.get(i), l2.get(i)));
		}
		System.out.println(l3);
	}

}
