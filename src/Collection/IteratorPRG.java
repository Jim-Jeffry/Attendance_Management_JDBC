package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorPRG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al1=new ArrayList<Object>();
		al1.add(90);
		al1.add(67);
		al1.add(86);
		Iterator<Object> i=	al1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
