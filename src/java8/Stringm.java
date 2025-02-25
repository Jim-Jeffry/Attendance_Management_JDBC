package java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface str{
	List<String> cont(List<String>str);
}
public class Stringm {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		List<String> cont=List.of("Apple", "Banana", "Arran", "Cambsier", "Archers", "Strega");
		ArrayList<String> arr=new ArrayList<>();
		for( String str:cont) {
			if(!str.startsWith("A")) {
				arr.add(str);
			}
		}
		for(String a: arr) {
			System.out.println(a);
			System.out.println();
		}
	}
}
