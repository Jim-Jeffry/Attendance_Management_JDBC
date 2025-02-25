package java8;
@FunctionalInterface
interface bla{
	String demo();
}
public class Meth1 {
	String lv1() {
		String a="asdfgnm";
		return a.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meth1 ob=new Meth1();
		bla obj=ob :: lv1;
		System.out.println(obj.demo());
	}
}