package uniq;
//import java.util.*;
	class a{
		int x;
		int y;
	}
	class b{
		public void add() {
			a ab=new a();
			ab.x=35;
			ab.y=5;
			int ba=ab.x+ab.y;
			System.out.println(ba);//without return type,without arguements
		}
	}
	class c{
		public void sub(int x, int y) {
			a cd=new a();
			cd.x=x;
			cd.y=y;
//			cd.x=55;
//			cd.y=5;
			int dc=cd.x-cd.y;
			System.out.println(dc);//without return type with arguements
		}
	}
	class d{
		public int div(int x,int y) {
			a ef=new a();
			ef.x=x;
			ef.y=y;
			int fe=ef.x/ef.y;
			return fe;//with return type with arguements
		}
	}
	class e{
		public int mult() {
			a gh=new a();
			gh.x=50;
			gh.y=2;
			int hg=gh.x*gh.y;
			return hg;//with return type without arguements
		}
	}
	public class task3_1{
	public static void main(String[]args) {
		b obj1=new b();
		obj1.add();
		c obj2=new c();
		obj2.sub(10,5);
		d obj3=new d();
		System.out.println(obj3.div(50,5));
		e obj4=new e();
		System.out.println(obj4.mult());
		
	}
		}

