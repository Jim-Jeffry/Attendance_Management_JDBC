package uniq;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Numerals {
	static Scanner sc=new Scanner(System.in);
	static Map<Integer,String> v1=new HashMap<>();
	static Map <Integer,String> v2=new HashMap<>();
	static Map <Integer,String>v3=new HashMap<>();
	static int num;
	static String number;
	static StringBuilder out=new StringBuilder();
	static void inputs() {
		
		 v1.put(1,"one");
		 v1.put(2,"two");
		 v1.put(3,"three");
		 v1.put(4,"four");
		 v1.put(5,"five");
		 v1.put(6,"six");
		 v1.put(7,"seven");
		 v1.put(8,"eight");
		 v1.put(9,"nine");
		
		 v2.put(1, "eleven");
		 v2.put(2,"twelve");
		 v2.put(3,"thirteen");
		 v2.put(4,"fourteen");
		 v2.put(5,"fifteen");
		 v2.put(6,"sixteen");
		 v2.put(7,"seventeen");
		 v2.put(8,"eieghteen");
		 v2.put(9,"nineteen");
		 
		 v3.put(1, "ten");
		 v3.put(2,"twenty");
		 v3.put(3,"thirty");
		 v3.put(4,"fourty");
		 v3.put(5,"fifty");
		 v3.put(6,"sixty");
		 v3.put(7,"seventy");
		 v3.put(8,"eighty");
		 v3.put(9,"ninety");

		 System.out.println("Enter the number");
		 num =sc.nextInt();
		 number=num+"";
		 char[] numb=number.toCharArray();
		 List<Character> nums = new ArrayList<>();
		 for (char c : numb) {
		     nums.add(c);
		 }
		 if(nums.size()==3) {
				 for(int j=0;j<=9;j++) {
					 if(Character.getNumericValue(nums.get(0)) == j) {
						 out=out.append(v1.get(j)+"hundred"+" ");
					 }
				 }
			 nums.remove(0);
		 }
		 if(nums.size()==2) {
			 if(num>=11&&num<=19) {
					 for(int j=0;j<=9;j++) {
						 if(Character.getNumericValue(nums.get(1)) == j) {	
							 out=out.append(v2.get(j)+" ");
						 }
					 }
				 nums.add((char) 0);
			 }
			 else {
					 for(int j=0;j<=9;j++) {
						 if(Character.getNumericValue(nums.get(0)) == j) {	
							 out=out.append(v3.get(j)+" ");
						 }
					 }
			 }
			 nums.remove(0);
		 }
		 if(nums.size()==1) {
				 for(int j=0;j<=9;j++) {
					 if(Character.getNumericValue(nums.get(0)) == j) {	
						 if(j!=0) {
						 out=out.append(v1.get(j));
						 }
						 else {						 }
					 }
				 }
		 }
		 if(num==0||num==00||num==000) {
			 System.out.println("Zero");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numerals.inputs();
		System.out.println(out);
	}
}

