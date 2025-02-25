package project;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Attendance {
    // ANSI Colors for Output
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    // Scanner for Input Handling
    private static final Scanner sc = new Scanner(System.in);

    // List of Registered Students
    static List<String> students = new ArrayList<>(Arrays.asList("Jim", "Bala", "Sanjay", "Bharath"));

    // Attendance Records (Name -> [In-Time, Out-Time])
    LinkedHashMap<String, String[]> attendanceRecords = new LinkedHashMap<>();

    // Method to Mark Attendance IN
    void studentIn() {
        while (true) {
            System.out.println("Enter Your Name to Mark Attendance In (or type 'Exit' to quit):");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("Exit")) return;

            if (students.contains(name)) {
                if (!attendanceRecords.containsKey(name)) {
                    String inTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    attendanceRecords.put(name, new String[]{inTime, null}); // Store IN time, OUT remains null

                    System.out.println("Attendance marked IN for: " + GREEN + name + RESET);
                    System.out.println("At the time              : " + GREEN + inTime + RESET);
                } else {
                    System.err.println("Attendance already marked IN for: " + name);
                }
            } else {
                System.err.println("Invalid User Name");
            }
        }
    }

    // Method to Mark Attendance OUT
    void studentOut() {
        while (true) {
            System.out.println("Enter Your Name to Mark Attendance Out (or type 'Exit' to quit):");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("Exit")) return;

            if (attendanceRecords.containsKey(name)) {
                String[] times = attendanceRecords.get(name);
                if (times[1] == null) { // Check if OUT time is not already set
                    String outTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    times[1] = outTime;

                    System.out.println("Attendance marked OUT for: " + YELLOW + name + RESET);
                    System.out.println("At the time              : " + YELLOW + outTime + RESET);
                } else {
                    System.err.println("Attendance already marked OUT for: " + name);
                }
            } else {
                System.err.println("Invalid User Name or not checked IN");
            }
        }
    }

    // Student Portal
    void studentPortal() {
        while (true) {
            System.out.println("Do you want to Check (In or Out)? (or type 'Exit' to quit):");
            String action = sc.nextLine().trim().toLowerCase();

            switch (action) {
                case "in":
                    studentIn();
                    break;
                case "out":
                    studentOut();
                    break;
                case "exit":
                    System.out.println("Exiting student portal.");
                    return;
                default:
                    System.err.println("Invalid Operation");
            }
        }
    }

    // Check Present Students
    void checkPresent() {
        System.out.println("Present Students: " + attendanceRecords.keySet());
        System.out.println("Number of Students Present: " + attendanceRecords.size());
    }

    // Check Absent Students
    void checkAbsent() {
        List<String> absentStudents = new ArrayList<>(students);
        absentStudents.removeAll(attendanceRecords.keySet());

        System.out.println("Absent Students: " + absentStudents);
        System.out.println("Number of Students Absent: " + absentStudents.size());
    }

    // Add a New Student
    void addStudent() {
        System.out.println("Enter the name of the student to add:");
        String name = sc.nextLine().trim();

        if (!students.contains(name)) {
            students.add(name);
            System.out.println("Student name added successfully: " + name);
        } else {
            System.err.println("The Name already exists.");
        }
    }

    // Remove a Student
    void removeStudent() {
        System.out.println("Enter the name of the student to remove:");
        String name = sc.nextLine().trim();

        if (students.remove(name)) {
            attendanceRecords.remove(name); // Also remove from attendance records
            System.out.println("Student name removed successfully: " + name);
        } else {
            System.err.println("Name not found.");
        }
    }

    // Check Present Hours of a Student
    void presentHours() {
        System.out.println("Enter the name of the Student to check present hours:");
        String name = sc.nextLine().trim();

        if (attendanceRecords.containsKey(name)) {
            String[] times = attendanceRecords.get(name);
            System.out.println(CYAN + name + RESET);
            System.out.println("From: " + BLUE + times[0] + RESET);

            if (times[1] != null) {
                System.out.println("To  : " + BLUE + times[1] + RESET);
            } else {
                System.err.println("Not Marked OUT yet");
            }
        } else {
            System.err.println("Student not found or not checked IN.");
        }
    }

    // Staff Portal
    void staffPortal() {
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("(Check_Register / Check_Present / Check_Absent / Add_Student / Remove_Student / Present_Hours / Exit):");
            String action = sc.nextLine().trim().toLowerCase();

            switch (action) {
                case "check_register":
                    System.out.println(students);
                    break;
                case "check_present":
                    checkPresent();
                    break;
                case "check_absent":
                    checkAbsent();
                    break;
                case "add_student":
                    addStudent();
                    break;
                case "remove_student":
                    removeStudent();
                    break;
                case "present_hours":
                    presentHours();
                    break;
                case "exit":
                    System.out.println("Exiting staff portal.");
                    return;
                default:
                    System.err.println("Invalid Operation");
            }
        }
    }

    // Start the Application
    void start() {
        while (true) {
            System.out.println("Are you a Student or Staff? (or type 'Exit' to quit):");
            String role = sc.nextLine().trim().toLowerCase();

            switch (role) {
                case "student":
                    System.out.println("Welcome Student");
                    studentPortal();
                    break;
                case "staff":
                    System.out.println("Welcome Staff");
                    staffPortal();
                    break;
                case "exit":
                    System.out.println("Exiting attendance register.");
                    System.err.println("Thank You...!");
                    return;
                default:
                    System.err.println("User Undefined");
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Attendance obj = new Attendance();
        System.err.println("Welcome to the Attendance Register");
        System.out.println("----------------------------------\n");
        obj.start();
    }
}
