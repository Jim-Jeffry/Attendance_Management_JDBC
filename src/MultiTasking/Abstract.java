package MultiTasking;
abstract class a1{
	abstract void a();
	void b() {
		System.out.println("This is Abstract class");
	}
}
class b1 extends a1{
	void a() {
		System.out.println("This is Abstract method");
	}
}
public class Abstract {
	public static void main(String[] args) {
		b1 obj=new b1();
		obj.a();
		obj.b();
	}
}