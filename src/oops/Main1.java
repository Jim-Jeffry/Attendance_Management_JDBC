package oops;
import java.util.Scanner;
abstract class Animal{
	abstract public String makesound();
}
	  class Dog extends Animal{
	public  String makesound() {
		 return "Boww";
	}
	}
	  class Cat extends Animal{
			public  String makesound() {
				 return "Meow";
			}
			}
	  class Cow extends Animal{
			public  String makesound() {
				 return "Moo";
			}
			}
 class Zoo  {
	 	Dog dog;
	    Cat cat;  
	    Cow cow;  
	    public void addDog(Dog dog) {
	        this.dog = dog;
	    }
	    public void addCat(Cat cat) {
	        this.cat = cat;
	    }
	    public void addCow(Cow cow) {
	        this.cow = cow;
	    }
	public  void showAnimalSounds() {
		if(dog!=null) {
			System.out.println("Dog say :"+dog.makesound());
		}
		if(cat!=null) {
			System.out.println("Cat say :"+cat.makesound());
		}
		if(cow!=null) {
			System.out.println("Cow say :"+cow.makesound());
		}
	}
}
public class Main1 {
public static void main(String[]arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Dog,Cat,Cow, ALL");
	String a=sc.next();
	 Zoo zoo = new Zoo();
     Dog dog = new Dog();
     Cat cat = new Cat();
     Cow cow = new Cow();
     if (a.equals("Dog")) {
     zoo.addDog(dog);
     }
     else if (a.equals("Cat")) {
     zoo.addCat(cat);
     }
     else if (a.equals("Cow")) {
     zoo.addCow(cow);
     }
     else if (a.equals("ALL")) {
    	 zoo.addDog(dog);
    	 zoo.addCat(cat);
    	 zoo.addCow(cow);
     }
     else {
    	 System.out.println("Selection Wrong..!!");
     }
		
			zoo.showAnimalSounds();
}
}
