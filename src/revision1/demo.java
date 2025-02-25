package revision1;
class employee1{
	String name;
	int id;
	double salary;
	
	public employee1(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayEmployeeDetails() {
		System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
	}
}
class fte1 extends employee{
	String benifits;
	
	public fte1(String name, int id, double salary, String benifits) {
			super(name, id, salary);
			this.benifits = benifits;
		}

	@Override
		void displayEmployeeDetails() {
			// TODO Auto-generated method stub
			super.displayEmployeeDetails();
			System.out.println("Benifits : "+benifits);
		}
}
 class pte1 extends employee{
	private static final String houseworked = null;
	int hoursworked;
		public pte1(String name, int id, double salary,int hoursworked) {
		super(name, id, salary);
		this.hoursworked=hoursworked;
	}

		void displayEmployeeDetails() {
			super.displayEmployeeDetails();
			System.out.println("Hours worked :"+houseworked);
		}
public class demo{
	public static void main(String[] args) {
		System.out.println("abc");
	//	 TODO Auto-generated method stub
		 fte fullTimeEmployee = new fte("Alice", 101, 60000, "Health Insurance, Retirement Plan");
	        pte partTimeEmployee = new pte("Bob", 102, 20000, 20);

	        // Display their details
	        System.out.println("Full-Time Employee Details:");
	        fullTimeEmployee.displayEmployeeDetails();

	        System.out.println("\nPart-Time Employee Details:");
	        partTimeEmployee.displayEmployeeDetails();
	}
}
}
