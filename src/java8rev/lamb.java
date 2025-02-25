package java8rev;
interface demo1{
	int m1(int a);
}
public class lamb {
	int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lamb l1=new lamb();
		l1.check();
	}
	void check(){	
		demo1 v1 = a-> {
			int b=60;
			
			return this.a-b; 
		};
	int a=	v1.m1(10);
	System.out.println(a);
	}

}
