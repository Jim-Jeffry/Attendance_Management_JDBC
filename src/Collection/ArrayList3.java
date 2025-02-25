package Collection;
import java.util.ArrayList;
public class ArrayList3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("ftjy");
		al1.add("iyguy");
		al1.add("giygkuk2");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("wewe");
		al2.add("bellw");
		al1.add(al2);
//		al1.addAll(al2);
//		String a=al1+al2;
		System.out.println(al1);
	}
}