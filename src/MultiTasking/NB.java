package MultiTasking;
import java.util.*;

public class NB {
    Scanner sc = new Scanner(System.in);
    Map<String, List<String>> departments;

    public NB() {
        departments = new HashMap<>();
        departments.put("MECH", new ArrayList<>(Arrays.asList("Mechatronics", "Engineering Drawing", "Thermo Dynamics", "Fluid Mechanics")));
        departments.put("ECE", new ArrayList<>(Arrays.asList("Optical Communication", "Antenna And Wave Propagation", "Wireless Communication", "Radar Communication")));
        departments.put("EEE", new ArrayList<>(Arrays.asList("Power Electronics", "Analog Electronics", "Electrical Circuits", "Electronic Instrumentation")));
        departments.put("CSE", new ArrayList<>(Arrays.asList("Java", "Python", "Operating System", "Management Principles")));
    }

    void start() {
        System.out.println("Welcome (Student/Staff)");
        String role = sc.nextLine().trim();
        switch (role.toLowerCase()) {
            case "student":
                studentMenu();
                break;
            case "staff":
                staffMenu();
                break;
            default:
                System.out.println("Invalid User");
                break;
        }
    }

    void studentMenu() {
        System.out.println("Welcome User Student");
        System.out.println("(Take-Book/Return-Book)");
        String action = sc.nextLine().trim();
        if (action.equalsIgnoreCase("Take-Book")) {
            // Implementation for taking a book can be added here
            System.out.println("Feature not yet implemented.");
        } else if (action.equalsIgnoreCase("Return-Book")) {
            // Implementation for returning a book can be added here
            System.out.println("Feature not yet implemented.");
        } else {
            System.out.println("Invalid Option");
        }
    }

    void staffMenu() {
        boolean continueStaffMenu = true;
        while (continueStaffMenu) {
            System.out.println("Welcome User Staff");
            System.out.println("(Add-Book/View-Book/Exit)");
            String action = sc.nextLine().trim();
            switch (action.toLowerCase()) {
                case "add-book":
                    addBook();
                    break;
                case "view-book":
                    viewBooks();
                    break;
                case "exit":
                    continueStaffMenu = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    void addBook() {
        System.out.println("For Which Department You want to Add Books (MECH, CSE, EEE, ECE)");
        String dept = sc.nextLine().trim().toUpperCase();

        if (departments.containsKey(dept)) {
            System.out.println("Enter the Subject You Want to Add:");
            String newSub = sc.nextLine().trim();
            departments.get(dept).add(newSub);
            System.out.println("Updated " + dept + " Subjects:");
            viewDepartment(dept);
        } else {
            System.out.println("Invalid Department");
        }
    }

    void viewBooks() {
        System.out.println("For Which Department You want to view Books (MECH, CSE, EEE, ECE, ALL)");
        String dept = sc.nextLine().trim().toUpperCase();
        if (dept.equals("ALL")) {
            departments.forEach((key, value) -> {
                System.err.println("Books in " + key);
                value.forEach(System.out::println);
            });
        } else if (departments.containsKey(dept)) {
            viewDepartment(dept);
        } else {
            System.out.println("Invalid Option");
        }
    }

    void viewDepartment(String dept) {
        System.err.println("Books in " + dept);
        departments.get(dept).forEach(System.out::println);
    }

    public static void main(String[] args) {
        NB library = new NB();
        library.start();
    }
}

