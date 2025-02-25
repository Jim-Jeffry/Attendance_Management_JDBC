package Collection;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		String s="Hello all";
		char[] arr = s.toCharArray();
		List<Character> cr = new ArrayList<>();
		 for (char c : arr) {
	            cr.add(c);
	        }
       System.out.println(cr.stream().filter(c -> c.equals('l')).count());	
       }
}
