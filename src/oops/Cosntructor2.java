package oops;
class parent1{
	int a;
	int b;
	parent1(int aa,int bb){
		this.a=aa;
		this.b=bb;
		System.out.println(this.a+this.b);
	}
	
}
public class Cosntructor2 extends parent1{
	
Cosntructor2() {
		super(10, 67);
	}
public static void main(String[]arg) {
	Cosntructor2 obj=new Cosntructor2();
	}

}
