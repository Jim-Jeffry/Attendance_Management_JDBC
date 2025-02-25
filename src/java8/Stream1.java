package java8;

import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(1123,10,15,8,49,25,98,32);
		System.out.println("Given Integers "+li);
		System.out.println();
		li.stream().filter(x->String.valueOf(x).startsWith("1")).sorted().forEach(x->System.out.println(x));
	}
}