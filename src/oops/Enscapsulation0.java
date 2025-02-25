package oops;
class bla{
	private  int a=20;
	private int b=23;
	public int geta(){
		return a;
}
	public int getb(){
		return b;
}
	public void seta(int c) {
		this.a=c;
		System.out.println(c);
	}

	
}
public class Enscapsulation0 {
	public static void main(String[]arg) {
bla ob=new bla();
System.out.println(ob.geta());
System.out.println(ob.getb());
ob.seta(34);
System.out.println(ob.geta());
	}
}
