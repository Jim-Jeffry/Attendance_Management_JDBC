package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList5 {
	public static void main(String[] args) {
	  ArrayList<String> al=new ArrayList<String>();
		al.add("Jim");
		al.add("Sanjay");
		al.add("Jim");
		al.add("Guna");
		al.add("Sanjay");
		al.add("bharath");
		al.add("bharath");
		System.out.println(al);
		String temp1;
		String temp2;
		Iterator<String> i =al.iterator();
		 while(i. hasNext()) {
			temp1= i.next();
			i.remove();
			Iterator<String> i1=al.iterator();
		 while(i1.hasNext()) {
			temp2=i1.next();
			if(temp1.contains(temp2)) {
				System.out.println(temp1);	
			}
		}
	}
  }
}