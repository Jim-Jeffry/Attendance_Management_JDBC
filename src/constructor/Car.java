package constructor;

public class Car {
	String make;
	String model;
	int year;
	String color;
	public Car(String make,String model,int year,String color){
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
	}
	public Car() {
		this.make="Unknown";
		this.model="Unknown";
		this.year=0;
		this.color="Unknown";
	}
	void displayDetails() {
		System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj0=new Car("Toyota", "Corolla", 2020, "Red");
		obj0.displayDetails();
		Car obj=new Car();
		obj.displayDetails();
	}

}
