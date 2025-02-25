package dhinz;
import java.util.*;

class Dhinz1 {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a letter (small or capital): ");
        char ch = ob.next().charAt(0);

        // Convert using ASCII manipulation
        // If the input is lowercase ('a' to 'z'), subtract 32; otherwise, add 32.
        // This assumes the input is valid (alphabet).
        char convertedChar = (char) (ch ^ 32);

        // Display both original and converted character
        System.out.println("Converted letter: " + convertedChar);

        ob.close();
    }
}
