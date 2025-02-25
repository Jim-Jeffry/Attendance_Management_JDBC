package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class bla{
	String name;
	int id,sal;
	public bla(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString() {
		return "name :"+name +" Id :"+id+" Salary :"+sal;
	}
}
public class cpr1 implements Comparator<bla>{

	public static void main(String[] args) {
		List<bla> l=new ArrayList<bla>();
		l.add(new bla("aa",602,30000));
		l.add(new bla("bb",112,29000));
		l.add(new bla("cc",129,20900));
		l.add(new bla("dd",234,40000));
		l.add(new bla("ee",922,25000));
		System.out.println(l);
		Collections.sort(l, new cpr1());
		System.out.println(l);
	}

	@Override
	public int compare(bla o1, bla o2) {
		// TODO Auto-generated method stub
		return o2.id-o1.id;
	}
//	public int compre(bla o3, bla o4) {
//		// TODO Auto-generated method stub
//		return o3.id-o4.id;
//	}
}