package revision1;

import java.util.Scanner;

public class Encapsulation {
	static Scanner sc=new Scanner(System.in);
	private String name="jhvhg";
	private int age=18;
	private char grade='C';
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		System.out.println("orginal");
		System.out.println("Name :"+obj.getName());
		System.out.println("Age :"+obj.getAge());
		System.out.println("Grade :"+obj.getGrade());
		System.out.println("Update the details");
		System.out.println("Name:");
		String n=sc.nextLine();
		System.out.println("Age");
		int a=sc.nextInt();
		System.out.println("Grade");
		char g=sc.next().charAt(0);
		System.out.println("Updated datas");
		obj.setName(n);
		obj.setAge(a);
		obj.setGrade(g);
		System.out.println("Name :"+obj.getName());
		System.out.println("Age :"+obj.getAge() );
		System.out.println("Grade :"+obj.getGrade());
	}

}
