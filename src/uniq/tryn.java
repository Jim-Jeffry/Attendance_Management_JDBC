package uniq;
import java.util.ArrayList;
import java.util.Scanner;
public class tryn {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(13);
		al.add(23);
		al.add(98);
		ArrayList<Integer> al2=(ArrayList<Integer>)al.clone();
		System.out.println(al2);
	}
}