package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC1 {

    public static void main(String[] args) {
        // Database URL, Username, and Password
        String url = "jdbc:mysql://localhost:3306/jdbc"; // Replace with your database name
        String user = "root"; // Replace with your database username
        String password = "5272"; // Replace with your database password

        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the MySQL JDBC driver (optional with newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);

            // Create a statement object to send SQL queries
            stmt = conn.createStatement();
            String sql = "SELECT * FROM jdbc1"; // Replace with your actual table name

            // Execute the query
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve and print each column
                int id = rs.getInt("id"); // Replace with your column name
                String name = rs.getString("name"); // Replace with your column name
                int age = rs.getInt("age"); // Replace with your column name
                String role = rs.getString("role"); // Replace with your column name
                System.out.println("ID: " + id + ", Name: " + name+", Age: " + age + ", Role: " + role);
            }

            // Close the result set
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the statement and connection
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
