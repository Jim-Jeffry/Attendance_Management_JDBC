package MultiTasking;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class newst {
    public static void main(String[] args) {
        String input = "Name=\"r\" company=\"no seal no deal\" Experience=\"3yrs\"";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key (Name, company, Experience): ");
        String key = scanner.nextLine().trim();

        String value = getValue(input, key);
        if (value != null) {
            System.out.println(value); // Output the value if found
        } else {
            System.out.println("Key not found.");
        }

        scanner.close(); // Close the scanner
    }

    // Method to extract value by key
    public static String getValue(String input, String key) {
        // Regular expression to match the key and extract its value
        String regex = key + "=\"([^\"]*)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // If a match is found, return the extracted value
        if (matcher.find()) {
            return matcher.group(1); // group(1) contains the value within quotes
        }

        return null; // Return null if the key is not found
    }
}