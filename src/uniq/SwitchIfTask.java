package uniq;
import java.util.Scanner;
public class SwitchIfTask {
	public static void login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id");
		int a=sc.nextInt();
		if (a==5272) {
			System.out.println("Enter your Password");
			int b=sc.nextInt();
			if(b==2725) {
				System.out.println("Welcome M Jim Jeffry");
				System.out.println("Select Veg or Non-Veg");
				String c=sc.next();
				switch(c) {
				case "Veg":
					System.out.println("Choose Your Veg Meals :");
					System.out.println("Thali");
					System.out.println("Briyani");
					System.out.println("Pulao");
					System.out.println("Khichdi");
					sc.nextLine();
					String d=sc.nextLine();
					switch(d){
						case "Thali":
						System.out.println("The Price of the Dish Thali is 100");
						break;
						case "Briyani":
						System.out.println("The price of the Dish Briyani is 100");
					break;
				case "Pulao":
						System.out.println("The price of the Dish Pulao is 100");
				break;
				case "Khichdi":
						System.out.println("The price of the Dish Khichdi is 100");
					break;
				default:
					System.out.println("Sorry there is no dish here which you where Mentioned");
				break;
					}
					System.out.println("Enjoy Your Dish");
					break;
					
				case"Non-Veg":
					System.out.println("These are the dishes in Non-Veg :");
					System.out.println("Egg Briyani");
					System.out.println("Chicken Briyani");
					System.out.println("Mutton Briyani");
					System.out.println("Beef Briyani");
					System.out.println("Choose Your Dish");
					sc.nextLine();
					String e=sc.nextLine();
					switch(e) {
					case"Egg Briyani":
						System.out.println("The Price of the Dish Egg Briyani is 100");
					break;
					case"Chicken Briyani":
						System.out.println("The price of the Dish Chicken Briyani is 100");
					break;
					case"Mutton Briyani":
						System.out.println("The price of the Dish Mutton Briyani is 100");
					break;
					case"Beef Briyani":
						System.out.println("The price of the Dish Beef Briyani is 100");
					break;
					default:
						System.out.println("Sorry there is no dish here which you where Mentioned");
					break;
					}
					System.out.println("Enjoy Your Dish");
					break;
					
				default:
					System.out.println("Sorry.. Wrong Selection");
					break;
				}
					}
			else {
				System.out.println("Sorry Wrong Password");
			}
					}
			else {
				System.out.println("Wrong User Id");
			}
	}
	public static void main(String[]arg) {
		login();
		System.out.println("!!..ThankYou..!!");
	}
}
