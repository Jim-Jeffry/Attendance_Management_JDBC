package uniq;

public class LoopTask8 {
	public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) return false; // 0 and 1 are not prime numbers
        if (number <= 3) return true;  // 2 and 3 are prime numbers
        
        // Eliminate multiples of 2 and 3
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        // Check for factors from 5 to sqrt(number)
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }

    // Method to print prime numbers up to a given limit
    public static void printPrimes(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int limit = 100; // You can change this limit to any desired value
	        System.out.println("Prime numbers up to " + limit + ":");
	        printPrimes(limit);

	}

}
