package oops;
import java.util.Scanner;
interface PriceCalculator{
	  double CalculatePrice(double baseprice);	
}
 class DiscountPriceCalculator implements PriceCalculator{
	 public double CalculatePrice(double baseprice) {
		return baseprice=(baseprice-(baseprice/100*10));
	}
}
public class TaxPriceCalculator implements PriceCalculator{
	 public double CalculatePrice(double baseprice) {
		  baseprice=(baseprice+(baseprice/100*10));
		  return baseprice;
		}
	 public static void main(String[]arg) {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base Price");
		double a=sc.nextInt();
		System.out.println("Enter you want Discount or Tax");
		String b=sc.next();
		if(b.equals("Discount")) {
		DiscountPriceCalculator obj1=new DiscountPriceCalculator();
		obj1.CalculatePrice(a);
		System.out.println("Value of the Product :"+a);
		System.out.println("The value of the Product After Discount :"+obj1.CalculatePrice(a));
		}
		else if(b.equals("Tax")) {
		TaxPriceCalculator obj2=new TaxPriceCalculator();
		obj2.CalculatePrice(a);
		System.out.println("Value of the Product :"+a);
		System.out.println("The value of the Product After Tax :"+obj2.CalculatePrice(a));
		}
	 }
}
