package Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		al1.add("jim");
		al1.add("Bharath");
		al1.add("Sanjay");
		al2.add("Jeffry");
		al2.add("Bala");
		al2.add("Sanjay");
		al2.add("jim");
		System.out.println(al1);
		System.out.println(al2);
		Iterator<String> i1=	al1.iterator();
		String temp1="";
		String temp2 = "";
		while(i1.hasNext()) {
			temp1=i1.next();
			Iterator<String>i2=al2.iterator();
			while(i2.hasNext()) {
			temp2=i2.next();
			if(temp1.equals(temp2)) {
				System.out.println(temp1);
			}
			}
		}
	}
}