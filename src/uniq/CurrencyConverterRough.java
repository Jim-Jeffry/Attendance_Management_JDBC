package uniq;
import java.util.Scanner;
public class CurrencyConverterRough {
	

	    public static void main(String[] args) {
	        // Define exchange rates
	        final double USD_TO_EUR = 0.93; // 1 USD = 0.93 EUR
	        final double EUR_TO_USD = 1.08; // 1 EUR = 1.08 USD
	        final double USD_TO_GBP = 0.76; // 1 USD = 0.76 GBP
	        final double GBP_TO_USD = 1.32; // 1 GBP = 1.32 USD

	        // Initialize scanner
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Currency Converter");
	        System.out.println("Available currencies: USD, EUR, GBP");
	        
	        // Input source currency
	        System.out.print("Enter source currency (USD, EUR, GBP): ");
	        String sourceCurrency = scanner.next().toUpperCase();

	        // Input target currency
	        System.out.print("Enter target currency (USD, EUR, GBP): ");
	        String targetCurrency = scanner.next().toUpperCase();

	        // Input amount
	        System.out.print("Enter amount to convert: ");
	        double amount = scanner.nextDouble();

	        // Perform conversion
	        double convertedAmount = convertCurrency(sourceCurrency, targetCurrency, amount, 
	                                                 USD_TO_EUR, EUR_TO_USD, USD_TO_GBP, GBP_TO_USD);
	        
	        if (convertedAmount != -1) {
	            System.out.printf("%.2f %s = %.2f %s%n", amount, sourceCurrency, convertedAmount, targetCurrency);
	        } else {
	            System.out.println("Invalid currency code entered.");
	        }
	        
	        scanner.close();
	    }

	    public static double convertCurrency(String sourceCurrency, String targetCurrency, double amount,
	                                          double usdToEur, double eurToUsd, double usdToGbp, double gbpToUsd) {
	        if (sourceCurrency.equals(targetCurrency)) {
	            return amount; // No conversion needed if the currencies are the same
	        }

	        double amountInUSD;

	        // Convert source currency to USD
	        switch (sourceCurrency) {
	            case "USD":
	                amountInUSD = amount;
	                break;
	            case "EUR":
	                amountInUSD = amount * eurToUsd;
	                break;
	            case "GBP":
	                amountInUSD = amount * gbpToUsd;
	                break;
	            default:
	                return -1; // Invalid source currency
	        }

	        // Convert USD to target currency
	        switch (targetCurrency) {
	            case "USD":
	                return amountInUSD;
	            case "EUR":
	                return amountInUSD * usdToEur;
	            case "GBP":
	                return amountInUSD * usdToGbp;
	            default:
	                return -1; // Invalid target currency
	        }
	    }
	}



