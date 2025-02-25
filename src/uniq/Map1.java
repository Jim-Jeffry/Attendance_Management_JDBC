package uniq;
import java.util.Scanner;
import java.util.HashMap;

public class Map1 {
	Scanner sc=new Scanner(System.in);
	void hashmap() {
		HashMap<String,Integer>hmap=new HashMap<>();
		hmap.put("AA", 10);
		hmap.put("BB", 20);
		hmap.put("CC", 30);
		System.out.println(hmap);
		System.out.println(hmap.hashCode());
		int a=sc.nextInt();
		String b=sc.next();
		hmap.put(b, a);
		System.out.println(hmap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map1 obj=new Map1();
		obj.hashmap();
	}
}
