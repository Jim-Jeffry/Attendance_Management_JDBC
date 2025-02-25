package Collection;
import java.util.ArrayList;
public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(19);
		al.add(6);
		al.add(873);
		al.add(78);
		al.add(2, 8245);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(687);
		al1.add(835);
		System.out.println(al1);
		al.addAll(3,al1);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.reversed());
		ArrayList<Comparable> al2=new ArrayList<Comparable>();
		al2.toArray();
		al2.add("lquiil");
		al2.add("KUygku");
		al2.add(876);
		System.out.println(al2);
		System.out.println(al2.contains(876));
		System.out.println(al1.containsAll(al));
		System.out.println(al.size());
		System.out.println(al2.indexOf(1));
		al.remove(2);
		System.out.println(al);
//		al.remove(78);
//		System.out.println(al);//Doubt
		System.out.println(al.subList(0, 2));
		al.removeAll(al1);
		System.out.println(al);
	}
}
