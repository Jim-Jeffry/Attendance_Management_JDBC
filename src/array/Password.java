package array;
import java.util.Scanner;
public class Password {
	    public static boolean isValidPassword(String password) {
	        if (password.length() < 8) {
	            return false;
	        }
	        boolean hasUpperCase = false;
	        boolean hasLowerCase = false;
	        boolean hasSpecialChar = false;
	        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";
	        for (char ch : password.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                hasUpperCase = true;
	            } else if (Character.isLowerCase(ch)) {
	                hasLowerCase = true;
	            } else if (specialCharacters.indexOf(ch) >= 0) {
	                hasSpecialChar = true;
	            }
	        }
	        return hasUpperCase && hasLowerCase && hasSpecialChar;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter your password (at least 8 characters, 1 uppercase, 1 lowercase, 1 special character): ");
	            String password = scanner.nextLine();
	            
	            if (isValidPassword(password)) {
	                System.out.println("Password is valid!");
	                break;
	            } else {
	                System.out.println("Password is invalid. Please try again.");
	            }
	        }
	        scanner.close();
	    }
	}