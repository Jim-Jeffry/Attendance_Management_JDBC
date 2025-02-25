package InnerClass;
public class NoramlInnerClass {
	class innerclass{
		void a() {
			int a=18;
			int b=56;
			int c=a+b;
			System.out.println(c);
		}
		class ininnerclass{
			void b() {
				System.out.println("This is Normal Inner Class");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoramlInnerClass ob=new NoramlInnerClass();
		NoramlInnerClass.innerclass obj=ob.new innerclass();
		obj.a();
		NoramlInnerClass.innerclass.ininnerclass obje=obj.new ininnerclass();
		obje.b();
	}
}
//This is Normal Inner Class