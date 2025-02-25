package java8;

import java.util.Arrays;
import java.util.List;

public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=Arrays.asList("Apple", "Pappleine", "Banana", "Orange","Apple","Orange");
		System.out.println("Given list "+li);
		System.out.println(li.stream().filter((x)->x.equals("Apple")).count());
		String a="apple";
		char[] b=a.toCharArray();
		List<>
	}

}
