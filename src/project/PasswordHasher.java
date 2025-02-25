package project;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordHasher {
    public static void main(String[] args) {
        String plainPassword = "mypassword"; // Replace with the desired password
        String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        System.out.println("Hashed Password: " + hashedPassword);
    }
}
//package project;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//import java.sql.*;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//import org.mindrot.jbcrypt.BCrypt;
//
//
//public class Attendance_JDBC {
//
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/attendance_db";
//    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = "5272"; // No need for BCrypt, used in connection setup only
//
//    private static HikariDataSource dataSource;
//    private final Scanner sc;
//
//    public Attendance_JDBC() {
//        configureDataSource();
//        sc = new Scanner(System.in);
//    }
//
//    private void configureDataSource() {
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl(DB_URL);
//        config.setUsername(DB_USER);
//        config.setPassword(DB_PASSWORD);
//        config.setMaximumPoolSize(10);
//        dataSource = new HikariDataSource(config);
//    }
//
//    private Connection getConnection() throws SQLException {
//        return dataSource.getConnection();
//    }
//
//    private void login() {
//        System.out.println("Enter your username:");
//        String username = sc.nextLine().trim();
//
//        try (Connection conn = getConnection()) {
//            String query = "SELECT * FROM users WHERE name = ?";
//            try (PreparedStatement stmt = conn.prepareStatement(query)) {
//                stmt.setString(1, username);
//                try (ResultSet rs = stmt.executeQuery()) {
//                    if (rs.next()) {
//                        String role = rs.getString("role");
//
//                        if ("Student".equalsIgnoreCase(role)) {
//                            studentPortal(rs.getInt("id"));
//                        } else if ("Staff".equalsIgnoreCase(role)) {
//                            System.out.println("Enter your password:");
//                            String password = sc.nextLine().trim();
//                            String hashedPassword = rs.getString("password");
//                            if (BCrypt.checkpw(password, hashedPassword)) {
//                                System.out.println("Welcome, " + username + "!");
//                                staffPortal();
//                            } else {
//                                System.out.println("Invalid password. Try again.");
//                                login();
//                            }
//                        }
//                    } else {
//                        System.out.println("User not found. Try again.");
//                        login();
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            System.err.println("Database error: " + e.getMessage());
//        }
//    }
//
//    private void studentPortal(int userId) {
//        while (true) {
//            System.out.println("Do you want to Check (In or Out)? (or type 'Exit' to return to the login screen):");
//            String action = sc.nextLine().trim();
//            if ("In".equalsIgnoreCase(action)) {
//                markAttendance("attendance_in", userId);
//            } else if ("Out".equalsIgnoreCase(action)) {
//                markAttendance("attendance_out", userId);
//            } else if ("Exit".equalsIgnoreCase(action)) {
//                System.out.println("Returning to the login screen.");
//                break; // Breaks the loop and returns to the login method
//            } else {
//                System.out.println("Invalid operation.");
//            }
//        }
//    }
//
//
//    private void markAttendance(String tableName, int userId) {
//        String checkQuery = "SELECT * FROM " + tableName + " WHERE user_id = ? AND DATE(check_in_time) = CURDATE()";
//        String insertQuery = "INSERT INTO " + tableName + " (user_id, check_in_time) VALUES (?, ?)";
//
//        try (Connection conn = getConnection();
//             PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
//            checkStmt.setInt(1, userId);
//            try (ResultSet rs = checkStmt.executeQuery()) {
//                if (rs.next()) {
//                    System.out.println("You have already checked in today.");
//                } else {
//                    try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
//                        insertStmt.setInt(1, userId);
//                        insertStmt.setString(2, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//                        insertStmt.executeUpdate();
//                        System.out.println("Attendance marked.");
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            System.err.println("Error marking attendance: " + e.getMessage());
//        }
//    }
//
//    private void staffPortal() {
//        while (true) {
//            System.out.println("Staff portal options: (Check_Present / Check_Absent / Add_Student / Remove_Student / Add_Staff / Check_Register / Exit):");
//            String action = sc.nextLine().trim();
//
//            if ("Check_Present".equalsIgnoreCase(action)) {
//                checkPresent();
//            } else if ("Check_Absent".equalsIgnoreCase(action)) {
//                checkAbsent();
//            } else if ("Add_Student".equalsIgnoreCase(action)) {
//                addUser("Student", false);
//            } else if ("Remove_Student".equalsIgnoreCase(action)) {
//                removeUser("Student");
//            } else if ("Add_Staff".equalsIgnoreCase(action)) {
//                addUser("Staff", true);
//            } else if ("Check_Register".equalsIgnoreCase(action)) {
//                checkRegister();
//            } else if ("Exit".equalsIgnoreCase(action)) {
//                System.out.println("Returning to the login screen.");
//                break; // Breaks the loop and returns to the login method
//            } else {
//                System.out.println("Invalid operation.");
//            }
//        }
//    }
//
//
//    private void checkPresent() {
//        String query = "SELECT u.name, DATE(a_in.check_in_time) AS check_date, " +
//                "TIME(a_in.check_in_time) AS check_in_time " +
//                "FROM users u JOIN attendance_in a_in ON u.id = a_in.user_id " +
//                "WHERE u.role = 'Student' AND DATE(a_in.check_in_time) = CURDATE()";
//
//        try (Connection conn = getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            System.out.println("Present Students:");
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String checkDate = rs.getString("check_date");
//                String checkInTime = rs.getString("check_in_time");
//                System.out.println(name + " checked in at " + checkInTime + " on " + checkDate);
//            }
//        } catch (SQLException e) {
//            System.err.println("Error fetching present students: " + e.getMessage());
//        }
//    }
//
//    private void checkAbsent() {
//        String query = "SELECT u.name FROM users u LEFT JOIN attendance_in a_in ON u.id = a_in.user_id " +
//                "WHERE u.role = 'Student' AND (DATE(a_in.check_in_time) != CURDATE() OR a_in.check_in_time IS NULL)";
//
//        try (Connection conn = getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            System.out.println("Absent Students:");
//            while (rs.next()) {
//                String name = rs.getString("name");
//                System.out.println(name);
//            }
//        } catch (SQLException e) {
//            System.err.println("Error fetching absent students: " + e.getMessage());
//        }
//    }
//
//    private void addUser(String role, boolean requirePassword) {
//        System.out.println("Enter the name of the " + role + " to add:");
//        String name = sc.nextLine().trim();
//
//        String hashedPassword = null;
//        if (requirePassword) {
//            System.out.println("Enter the password:");
//            String password = sc.nextLine().trim();
//            hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
//        }
//
//        String query = "INSERT INTO users (name, role, password) VALUES (?, ?, ?)";
//        try (Connection conn = getConnection();
//             PreparedStatement stmt = conn.prepareStatement(query)) {
//            stmt.setString(1, name);
//            stmt.setString(2, role);
//            stmt.setString(3, hashedPassword);
//            stmt.executeUpdate();
//            System.out.println(role + " added successfully.");
//        } catch (SQLException e) {
//            System.err.println("Error adding " + role + ": " + e.getMessage());
//        }
//    }
//
//    private void removeUser(String role) {
//        System.out.println("Enter the ID of the " + role + " to remove:");
//        int userId = Integer.parseInt(sc.nextLine().trim());
//
//        String query = "DELETE FROM users WHERE id = ?";
//        try (Connection conn = getConnection();
//             PreparedStatement stmt = conn.prepareStatement(query)) {
//            stmt.setInt(1, userId);
//            int rowsAffected = stmt.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println(role + " removed successfully.");
//            } else {
//                System.out.println("No such user found.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Error removing " + role + ": " + e.getMessage());
//        }
//    }
//
//    private void checkRegister() {
//        String query = "SELECT * FROM users";
//        try (Connection conn = getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            System.out.println("User Register:");
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String role = rs.getString("role");
//                System.out.println("ID: " + id + ", Name: " + name + ", Role: " + role);
//            }
//        } catch (SQLException e) {
//            System.err.println("Error fetching user register: " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        Attendance_JDBC obj = new Attendance_JDBC();
//        System.out.println("Welcome to the Attendance Register");
//
//        while (true) {
//            obj.login(); // Call login repeatedly unless user exits
//            System.out.println("Do you want to log in again? (Yes/No)");
//            String choice = obj.sc.nextLine().trim();
//            if (!"Yes".equalsIgnoreCase(choice)) {
//                System.out.println("Exiting the Attendance Register. Goodbye!");
//                break;
//            }
//        }
//
//        obj.sc.close();
//    }
//
//}
