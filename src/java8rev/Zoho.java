package java8rev;
import java.util.Scanner;
public class Zoho {
	 public static String expandString(String input) {
	        StringBuilder result = new StringBuilder();
	        int length = input.length();
	        
	        for (int i = 0; i < length; i++) {
	            // Check if the current character is a letter
	            if (Character.isLetter(input.charAt(i))) {
	                char letter = input.charAt(i); // Get the letter
	                StringBuilder numberStr = new StringBuilder();
	                
	                // Get the number following the letter
	                i++;
	                while (i < length && Character.isDigit(input.charAt(i))) {
	                    numberStr.append(input.charAt(i));
	                    i++;
	                }
	                i--; // Move back to the last digit after the loop

	                // Convert the number to an integer
	                int repeatCount = Integer.parseInt(numberStr.toString());
	                
	                // Append the letter 'repeatCount' times
	                for (int j = 0; j < repeatCount; j++) {
	                    result.append(letter);
	                }
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        // Initialize the scanner for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Take the input string
	        System.out.println("Enter the input string: ");
	        String input = scanner.nextLine();
	        
	        // Get the expanded output
	        String output = expandString(input);
	        
	        // Print the result
	        System.out.println("Output: " + output);
	        
	        // Close the scanner
	        scanner.close();
	}

}
