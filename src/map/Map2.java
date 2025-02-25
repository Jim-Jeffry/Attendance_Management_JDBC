package map;
import java.util.Scanner;
import java.util.HashMap;

public class Map2 {
	Scanner sc=new Scanner(System.in);
	static HashMap<String,Integer> st=new HashMap<>();
	static {
		st.put("Jim", 80);
		st.put("Sam", 90);
		st.put("Ram", 100);
		st.put("Jim", 23450);
		}
	void adds() {
		System.out.println("Enter the name of the student You Want to add");
		String n=sc.next();
		if(!st.containsKey(n)) {
		System.out.println("Enter the Mark of the student "+n);
		int m=sc.nextInt();
		st.put(n, m);
		System.out.println("New student added sucessfully");
		sp();
		}
		else {
			System.out.println("The name of the student "+n+" already exist");
			adds();
		}
	}
	void up() {
		System.out.println("Enter the name of the student that you want to update grade");
		String n=sc.next();
		if(st.containsKey(n)) {
			System.out.println("Enter the mark of the student "+n);
			int m=sc.nextInt();
			st.put(n, m);
			System.out.println("The mark of the student "+n+" updated sucessfully");
			sp();
		}
		else {
			System.out.println("Student name not found");
			up();
		}
	}
	void re() {
		System.out.println("Enter the name of the student You want to Remove");
		String n=sc.next();
		if(st.containsKey(n)) {
			st.remove(n);
			System.out.println("The name "+n+" removed sucessfully");
			sp();
		}
		else {
			System.out.println("The name "+n+" doesn't exsist");
			re();
		}
	}
	void se() {
		System.out.println("Enter the name of the Student that you want to see the mark");
		String n=sc.next();
		if(st.containsKey(n)) {
			System.out.println("The mark of the student "+n+" is"+st.get(n));
			sp();
		}
		else {
			System.out.println("The name "+n+" doesn't exsist");
			re();
		}
	}
	void sp() {
		
		System.out.println("1. Add a student");
		System.out.println("2. Update a student's grade");
		System.out.println("3. Remove a student by name");
		System.out.println("4. Find a student's grade by name");
		System.out.println("5. List all students with their grades");
		System.out.println("6. Exit");
		int i=sc.nextInt();
		switch (i) {
		case 1:
			adds();
			break;
		case 2:
			up();
			break;
		case 3:
			re();
			break;
		case 4:
			se();
			break;
		case 5:
			System.out.println(st);
			sp();
			break;
		case 6:
			System.out.println("ThankYou...!!");
			break;
		}
	}
public static void main(String[] args) {
	Map2 obj=new Map2();
	System.out.println("Student Grades Management System");
	System.out.println(st);
	obj.sp();
}
}
