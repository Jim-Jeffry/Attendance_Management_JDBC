package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class cls {
	String name;
	int age;
	
	public cls(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + "";
	}

	
}
public class task2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<cls> len=new ArrayList<>();
		len.add(new cls("Jim", 22));
		len.add(new cls("Bala", 24));
		len.add(new cls("Sanjay", 21));
		len.add(new cls("Bharath", 23));
		System.out.println(len);
		for(cls c:len) {
			System.out.println(c);
		}
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter sort at using 'age' or 'name' ");
		String n=s.nextLine();
		
		Collections.sort(len, new Comparator<cls>() {
			

			@Override
			public int compare(cls o1, cls o2) {
				if(n.equals("name")) {
				return o1.name.compareTo(o2.name);	
				}
				else if(n.equals("age")) {
					return o1.age-o2.age;
				}
				return 0;
				}        
			
			
			
		});
		System.out.println("*************************************");
		 for (cls c : len) {
	            System.out.println(c);
	        }	
	
	}

	

}
