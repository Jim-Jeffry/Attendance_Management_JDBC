package uniq;
import java.util.*;
public class ST_3 {
	public  void detail() {
		ST_3 obj=new ST_3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
	    String name=sc.nextLine();
		System.out.println("Name of the dept");
		String department=sc.nextLine();
		float total=obj.mark();
		 System.out.println("Your name is :"+name);		
		 System.out.println("Your dept is :"+department);
		 
		}
	public  int mark() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tamil Mark");
		int tamil=sc.nextInt();
		System.out.println("Enter the English Mark");
		int english=sc.nextInt();
		System.out.println("Enter the Maths Mark");
		int maths=sc.nextInt();
		System.out.println("Enter the Science Mark");
		int science=sc.nextInt();
		System.out.println("Enter the Social Mark");
		int social=sc.nextInt();
		int all=(tamil+english+maths+science+social);
		return all;
		}
	float avg(float avg) {
		avg=avg/5;
		return avg;
	}
	public static void main(String[]arg) {
		ST_3.detail();
		
	}
}

//import java.util.Scanner;
//
//public class ST_3 {
//    public String name;
//    public String department;
//    public int[] marks = new int[5];
//
//    // Method to input details
//    public void detail() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//
//        System.out.print("Enter your department name: ");
//        department = scanner.nextLine();
//    }
//
//    // Method to input marks
//    public void mark() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter marks for 5 subjects:");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Subject " + (i + 1) + ": ");
//            marks[i] = scanner.nextInt();
//        }
//    }
//
//    // Method to calculate total marks
//    private int getTotalMarks() {
//        int total = 0;
//        for (int mark : marks) {
//            total += mark;
//        }
//        return total;
//    }
//
//    // Method to calculate average
//    public double avg() {
//        int totalMarks = getTotalMarks();
//        return totalMarks / 5.0;
//    }
//
//    // Method to display all details
//    public void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Department name: " + department);
//        System.out.println("Total Marks: " + getTotalMarks());
//        System.out.println("Average Marks: " + avg());
//    }
//
//    public static void main(String[] args) {
//        ST_3 student = new ST_3();
//        student.detail();
//        student.mark();
//        student.display();
//    }
//}
