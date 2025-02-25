package oops;
import java.util.*;
class product{
	private String productName="Weed";
	private String productCode="Kissa 25";
	private int price=1000;
	public String getproduct1() {
		return productName;
	}
	public String getproduct2() {
		return productCode;
	}
	public int getproduct3() {
		return price;
	}
	public void setpgetproduct2(String b) {
		this.productCode=b;
	}
}
public class Enscapsulation2 {
public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	product obj=new product();
	System.out.println("Product :"+obj.getproduct1());
	System.out.println("Enter the Code");
	String b=sc.nextLine();
	if(b.equals(obj.getproduct2())) {
		System.out.println("You Have 25% Discount");
		System.out.println(obj.getproduct3()+" - 25%");
		System.out.println("The Final Value After Discount :"+(obj.getproduct3()-(obj.getproduct3()/100*25)));
	}
	else {
		System.out.println("Wrong Code");
	}
}
}
