package project;
import java.util.Scanner;
import java.util.ArrayList;
public class Attendance_Register {
	Scanner sc=new Scanner(System.in);
	 static ArrayList<String> students	 =new ArrayList<String>();
	 static ArrayList<String> studentsin =new ArrayList<String>();
	 static ArrayList<String> studentsout=new ArrayList<String>();
	 static ArrayList<String> studentsabb=new ArrayList<String>();
	static  {
		 students.add("Jim");
		 students.add("Bala");
		 students.add("Sanjay");
		 students.add("Bharath");
	}
	private void studentin() {
		System.out.println("Enter Your Name to Get in Attendance(or type 'Exit' to quit):");
		String getn=sc.next();
		studentsin.add(getn);
		if(students.contains(getn)) {
			System.out.println("Your Get-In Attendance Marked");
		}
		else if(getn.equals("Exit")) {
			System.out.println("You have exited the Get-In Attendance ");
			student();
		}
		else {
			System.out.println("User name Invalid");
		}
       studentin();
	}
	void studentout() {
		System.out.println("Enter Your Name to Get out Attendance(or type 'Exit' to quit):");
		String geto=sc.next();
		studentsout.add(geto);
		if(studentsin.contains(geto)) {
			System.out.println("Your Get-Out Attendance Marked");
		}
		else if(geto.equals("Exit")) {
			System.out.println("You have exited the Get-Out Attendance ");
			start();
		}
		else {
			System.out.println("User name Invalid");
		}
       studentout();
	}
	void student() {
		System.out.println("What should You Want to do(In/Out)(or type 'Exit' to quit):");
		String st=sc.next();
		if(st.equals("In")) {
			studentin();
		}
		else if(st.equals("Out")) {
			studentout();
		}
		else if(st.equals("Exit")) {
			System.out.println("You have exited the students portal");
			start();
		}
		else {
			System.out.println("Invalid Operation");
			student();
		}
	}
	void cp() {
		System.out.println("List of Present Students");
		System.out.println(studentsin);
		System.out.println("No of Students Present"+studentsin.size());
		staff();
	}
	void ca() {
		System.out.println("List of Absent Students");
		students.removeAll(studentsin);
		System.out.println(students);
		System.out.println("No of Students Absent"+students.size());
		staff();
	}
	void as() {
		System.out.println("Enter the name of the student You Want to add");
		String an=sc.next();
		if(students.contains(an)) {
			System.out.println("The Name alread Exist");
		}
		else {
			students.add(an);
			System.out.println("Student name added Successfully");
		}
		staff();
	}
	void rs() {
		System.out.println("Enter the name of the student You Want to remove");
		String an=sc.next();
		if(students.contains(an)) {
			students.remove(an);
			System.out.println("Student name removed Successfully");
		}
		else {
			System.out.println("Name not found");
		}
		staff();
	}
	void staff() {
		System.out.println("What Should You want to do(Check_Present/Check_Absent/Add_Student/Remove_Student)(or type 'Exit' to quit):");
		String sf=sc.next();
		if(sf.equals("Check_Present")) {
			cp();
		}
		else if(sf.equals("Check_Absent")) {
			ca();
		}
		else if(sf.equals("Add_Student")) {
			as();
		}
		else if(sf.equals("Remove_Student")) {
			rs();
		}
		else if(sf.equals("Exit")) {
			System.out.println("You have exited the Staff portal");
		}
		else {
			System.out.println("Invalid Operation");
		}
		staff();
	}
	void start() {
		System.out.println("Student or Staff");
		String get=sc.next();
		if(get.equals("Student")) {
			System.out.println("Welcome Student");
			student();
		}
		else if(get.equals("Staff")) {
			System.out.println("Welcome Staff");
			staff();
		}
		else {
			System.out.println("User Un-defined");
		}
		start();
	}
public static void main(String[] args) {
	Attendance_Register obj=new Attendance_Register();
	System.out.println("Welcome to the attendance register");
	obj.start();
}
}
