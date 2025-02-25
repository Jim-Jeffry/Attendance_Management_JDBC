package jdbc;

import java.sql.*;

public class JDBC2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "5272";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stat = conn.createStatement()) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "SELECT * FROM jdbc1";
            try (ResultSet rs = stat.executeQuery(sql)) {
                System.out.printf("%-5s %-20s %-5s %-15s%n", "ID", "NAME", "AGE", "ROLE");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String role = rs.getString("role");
                    if (role == null) {
                        role = "N/A";
                    }
                    System.out.printf("%-5d %-20s %-5d %-15s%n", id, name, age, role);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
