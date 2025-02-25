package uniq;
import java.util.Scanner;
class Shape{
		int h;
		int b;
		int R;
}
class Rectangle extends Shape{
	public int arearec(int h,int b) {
	int rec=h*b;
	return rec;
	}
}
class Tringle extends Rectangle{
	public float areatri(int h,int b) {
		float tri  = 0.5f*h*b;
		return tri;
	}
}
public class Circle extends Tringle{
	public float areacir(int R) {
	float cri= 2*3.14f*R;
	return cri;
	}
	public static void main (String[]arg) {
		Circle ob=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of Height");
		ob.h=sc.nextInt();
		System.out.println("Enter the value of Breadth");
		ob.b=sc.nextInt();
		System.out.println("Enthe the value of Radius");
		ob.R=sc.nextInt();
		sc.close();
		System.out.println("The area of Rectangle is "+ob.arearec(ob.h,ob.b)+"sq");
		System.out.println("The area of Tringle is "+ob.areatri(ob.h, ob.b)+"sq");
		System.out.println("The area of Circle is "+ob.areacir(ob.R)+"sq");
	}
}
