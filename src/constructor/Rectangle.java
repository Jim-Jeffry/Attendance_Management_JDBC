package constructor;

public class Rectangle {
	double length;
	double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public Rectangle() {
		this.length=1.0;
		this.width=1.0;
	}
	public double area() {
		double area=length*width;
		return area;
	}
	public double perimeter() {
		double perimeter=2*(length+width);
		return perimeter;
	}
	void displaydetails() {
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
		System.out.println("area = "+area());
		System.out.println("perimeter = "+perimeter());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
		obj.displaydetails();
		Rectangle obj1=new Rectangle(5.0, 3.0);
		obj1.displaydetails();
	}

}
