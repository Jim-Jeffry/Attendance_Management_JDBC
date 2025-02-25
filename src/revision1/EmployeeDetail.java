package revision1;

class employees{
	String name;
	int id;
	double salary;
	public employees(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayEmployeeDetails() {
		System.out.println("Name :"+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
	}
}
class fulltime extends employees{
	String benifits;
	public fulltime(String name, int id, double salary,String benifits) {
		super(name, id, salary);
		this.benifits=benifits;
		// TODO Auto-generated constructor stub
	}
	@Override
	void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		super.displayEmployeeDetails();
		System.out.println("Benifits : "+benifits);
	}
}
class parttime extends employees{
	int hoursworked;

	public parttime(String name, int id, double salary, int hoursworked) {
		super(name, id, salary);
		this.hoursworked = hoursworked;
	}

	@Override
	void displayEmployeeDetails() {
		// TODO Auto-generated method stub
		super.displayEmployeeDetails();
		System.out.println("Hours Worked : "+hoursworked);
	}
	
}
public class EmployeeDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Full-Time Employee Details:");
		fulltime obj1=new fulltime("Jim", 1231, 70000, "Health Insurance, Retirement Plan");
		obj1.displayEmployeeDetails();
		System.out.println();
		System.out.println("Part-Time Employee Details:");
		parttime obj2=new parttime("Bala", 123, 80000, 6);
		obj2.displayEmployeeDetails();
	}

}
