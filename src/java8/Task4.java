package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		List<Integer> l2=new ArrayList<>();
		Predicate<Integer> p=a->a%2==0;
		for(int i:l1) {
			if(p.test(i)) {
				l2.add(i);
			}
		}
		System.out.println(l2);
		
	}
}