package java8;
import java.util.function.*;
import java.util.Arrays;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(1,2,3,4);
		Consumer<Integer> l2=a->System.out.println(a);
		for(int b: l1) {
			l2.accept(b);
			System.out.println();
		}
	}

}
