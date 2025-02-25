package MultiTasking;
	import java.util.Scanner;

	public class AI {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input;

	        System.out.println("Hello! I'm a simple chatbot. Type 'exit' to end the chat.");

	        while (true) {
	            System.out.print("You: ");
	            input = scanner.nextLine();

	            if (input.equalsIgnoreCase("exit")) {
	                System.out.println("Chatbot: Goodbye!");
	                break;
	            }

	            String response = getResponse(input);
	            System.out.println("Chatbot: " + response);
	        }

	        scanner.close();
	    }

	    private static String getResponse(String input) {
	        input = input.toLowerCase();
	        
	        if (input.contains("hello") || input.contains("hi")) {
	            return "Hello! How can I assist you today?";
	        } else if (input.contains("how are you")) {
	            return "I'm just a program, but thanks for asking!";
	        } else if (input.contains("what is your name")) {
	            return "I'm a simple chatbot without a name!";
	        } else if (input.contains("bye")) {
	            return "Goodbye! Have a great day!";
	        } else {
	            return "I'm sorry, I don't understand that.";
	        }
	    }
	}
