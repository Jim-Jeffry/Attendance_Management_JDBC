package MultiTasking;

import java.util.Scanner;

public class NewLibrary {
    Scanner sc = new Scanner(System.in);
    String[] MECH = new String[10];
    String[] ECE = new String[10];
    String[] EEE = new String[10];
    String[] CSE = new String[10];
    
    public NewLibrary() {
        books(); // Initialize books in constructor
    }
    
    void books() {
        MECH[0] = "Mechatronics";
        MECH[1] = "Engineering Drawing";
        MECH[2] = "Thermo Dynamics";
        MECH[3] = "Fluid Mechanics";
        
        ECE[0] = "Optical Communication";
        ECE[1] = "Antenna and Wave Propagation";
        ECE[2] = "Wireless Communication";
        ECE[3] = "Radar Communication";
        ECE[4] = "Power Electronics";  // Fixed indexing
        ECE[5] = "Analog Electronics";
        ECE[6] = "Electrical Circuits";
        ECE[7] = "Electronic Instrumentation";

        CSE[0] = "Java";
        CSE[1] = "Python";
        CSE[2] = "Operating System";
        CSE[3] = "Management Principles";
    }

    void displayBooks(String[] books) {
        System.out.println("Available Books:");
        for (String book : books) {
            if (book != null) {
                System.out.println("- " + book);
            }
        }
    }

    void tb() {
        System.out.println("Which department's book do you want to take?");
        System.out.println("Available Departments: MECH, CSE, EEE, ECE");
        String bb = sc.next();
        switch (bb) {
            case "MECH":
                displayBooks(MECH);
                break;
            case "CSE":
                displayBooks(CSE);
                break;
            case "EEE":
                displayBooks(EEE);
                break;
            case "ECE":
                displayBooks(ECE);
                break;
            default:
                System.out.println("Invalid department.");
        }
    }

    void rb() {
        System.out.println("Which department's book do you want to return?");
        // Similar logic can be implemented for returning books
    }

    void student() {
        System.out.println("Welcome student user");
        System.out.println("What would you like to do? (Add-Book/View-Book)");
        String st = sc.next();
        if (st.equals("Add-Book")) {
            tb();
        } else if (st.equals("View-Book")) {
            rb();
        } else {
            System.out.println("Invalid option.");
        }
    }

    void staff() {
        System.out.println("Welcome Staff user");
        System.out.println("What would you like to do? (Take-Book/View-Book)");
        String st = sc.next();
        if (st.equals("Take-Book")) {
            tb();
        } else if (st.equals("View-Book")) {
            rb();
        } else {
            System.out.println("Invalid option.");
        }
    }

    void common() {
        System.out.println("Welcome User");
        System.out.println("Who are you? (Student/Staff)");
        String use = sc.next();
        if (use.equals("Student")) {
            student();
        } else if (use.equals("Staff")) {
            staff();
        } else {
            System.out.println("Invalid user type.");
        }
    }

    public static void main(String[] args) {
        NewLibrary obj = new NewLibrary();
        obj.common();
    }
}

