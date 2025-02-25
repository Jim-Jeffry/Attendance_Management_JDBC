package java8rev;
import java.util.Scanner;
public class Zoho2 {
//	public static String expandString(String input) {
//		StringBuilder result=new StringBuilder();
//		int length=input.length();
//		for(int i=0;i<length;i++) {
//			if(Character.isLetter(input.charAt(i))) {
//				char letter=input.charAt(i);
//				 StringBuilder numberStr = new StringBuilder();
//				i++;
//				while(i<length&&Character.isDigit(input.charAt(i))) {
//					numberStr.append(input.charAt(i));
//					i++;
//				}
//				i--;
//				int repeatCount = Integer.parseInt(numberStr.toString());
//                
//                for (int j = 0; j < repeatCount; j++) {
//                    result.append(letter);
//                }
//			}
//		}
//		return result.toString();
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter the input string: ");
//	        String input = sc.nextLine();
//	        String output = expandString(input);
//	        System.out.println(output);
//	}
//
//}
	    // Method to calculate factorial recursively
//	    public static int factorial(int n) {
//	        if (n == 0) {
//	            return 1; // Base case: 0! = 1
//	        }
//	        return n * factorial(n - 1); // Recursive step: n! = n * (n-1)!
//	    }
//
//	    public static void main(String[] args) {
//	        System.out.println(factorial(5)); // Output: 120
//	    }
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		
		System.out.println(fact(5));
	}
	}
