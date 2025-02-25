package oops;
import java.util.Scanner;
interface PriceCalculator1{
	  double CalculatePrice(double baseprice);	
}
 class DiscountPriceCalculator1 implements PriceCalculator1{
	 public double CalculatePrice(double baseprice) {
		 double discountprice=(baseprice/100*10);
		 return discountprice;
	}
}
 class TaxPriceCalculator1 implements PriceCalculator1{
	 public double CalculatePrice(double baseprice) {
		  double taxprice=(baseprice/100*15);
		  return taxprice;
		}
 }
 class Total implements PriceCalculator1{
	public double CalculatePrice(double baseprice) {
		return baseprice;
	}	
	 public static void main(String[]arg) {
		 Scanner sc=new Scanner(System.in);
		 DiscountPriceCalculator1 obj1=new DiscountPriceCalculator1();
		 TaxPriceCalculator1 obj2=new TaxPriceCalculator1();
		System.out.println("Enter the Base Price");
		double a=sc.nextInt();
		obj1.CalculatePrice(a);
		double discountedPrice = obj1.CalculatePrice(a);
        System.out.println("Price after 10% Discount: " + obj1.CalculatePrice(a));
        double taxprice = obj2.CalculatePrice(a);
        System.out.println("Price after 10% Tax: " + taxprice);
        System.out.println("Final Price = "+(a+(taxprice-discountedPrice)));
			 }
}
