package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(1,3,5,7,8,9,21,24,12,13,55,36,31,90);
		System.out.println(li);
		System.out.println();
		System.out.println(li.stream().sorted().distinct().collect(Collectors.toList()));
		System.out.println();
		System.out.println(li.stream().sorted((x,y)->y-x).distinct().collect(Collectors.toList()));
		System.out.println();
		li.stream().sorted().forEach(a->System.out.println(a));
		System.out.println();
		li.stream().sorted((x,y)->y-x).forEach(y->System.out.println(y));
		System.out.println();
		li.stream().sorted().filter(a->a%2==0).forEach(a->System.out.println(a));
		System.out.println();
		  List<Integer> al2=Arrays.asList(100,200,300);
		  List<Integer> al3=Arrays.asList(10,20,30);
		  List<Integer> al4=Arrays.asList(1,2,3);
		  List<List<Integer>>li2=Arrays.asList(al2,al3,al4);
		  System.out.println(li2);
		  System.out.println();
		  System.out.println(li2.stream().flatMap(a->a.stream()).sorted().collect(Collectors.toList()));
		  System.out.println();
		  System.out.println(li2.stream().flatMap(a->a.stream()).sorted((x,y)->y-x).collect(Collectors.toList()));
	}
	

}
