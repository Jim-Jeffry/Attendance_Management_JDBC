package InnerClass;
public class MetheodLocalIC {
	void m1() {
		int a=67;
		class Meth1{
			int b=97;
			void m2() {
				int c=a+b;
				System.out.println(c);
			}
		}
		Meth1 ob1=new Meth1();
		ob1.m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetheodLocalIC ob2=new MetheodLocalIC();
		ob2.m1();
	}
}
//This is Method Local Inner Class