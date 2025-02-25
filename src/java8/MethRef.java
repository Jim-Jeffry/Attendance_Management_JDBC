package java8;

@FunctionalInterface
interface cls{
	void demo();
}
public class MethRef {
	MethRef(){
		System.out.println("Constructor reference");
	}
	void meth1() {
		System.out.println("Instance Method Reference");
	}
	static void meth2() {
		System.out.println("Static Method Reference");
	}
	int meth3() {
//		System.out.println("sdfghjkl");
		return 45;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethRef obj=new MethRef();
		cls ob=obj :: meth1;
		ob.demo();
		cls ob2=MethRef :: meth2;
		ob2.demo();
		cls ob3=obj ::meth3;
		System.out.println(ob3.demo());
	}

}
