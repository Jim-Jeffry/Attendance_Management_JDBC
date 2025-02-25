package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class a2{
	String name;
	int id,sal;
	public a2(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String toString() {
		return "name :"+name +" Id :"+id+" Salary :"+sal;
	}
}
public class cpr2 implements Comparator<a2>{
	public static void main(String[] args) {
		List<a2> l=new ArrayList<a2>();
		l.add(new a2("aa",602,30000));
		l.add(new a2("bb",112,29000));
		l.add(new a2("ac",129,20900));
		l.add(new a2("dd",234,40000));
		l.add(new a2("ee",922,25000));
		System.out.println(l);
		Collections.sort(l, new cpr2());
		System.out.println(l);
	}

	@Override
	public int compare(a2 o1, a2 o2) {
		return o1.name.compareTo(o2.name);
		// TODO Auto-generated method stub
		
	}
}
