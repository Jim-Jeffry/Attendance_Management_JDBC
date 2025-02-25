package InnerClass;

public class StaticIC {
	static int a=42;
	static int b=67;
	static class cls1{
		void m1() {
			System.out.println(a+b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticIC.cls1 ob=new StaticIC.cls1();
		ob.m1();
	}

}
