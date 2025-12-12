package mypackage;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sql_basic {
    private String url;
    private String username;
    private String password;
    private Connection connection;

    public Sql_basic() {
        // Initialize database credentials
        username = "root";
        url = "jdbc:mysql://localhost:3306/bank";
        password = "tharane2024";
        
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(url, username, password);
	    System.out.println();
            System.out.println("Database connected successfully.");
`	    System.out.println();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database. Check your credentials and URL.");
            e.printStackTrace();
        }
    }

    public void executeQuery(String query, Object... parameters) {
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            // Set parameters dynamically
            for (int i = 0; i < parameters.length; i++) {
                pstmt.setObject(i + 1, parameters[i]);
            }
            pstmt.executeUpdate();
            System.out.println("Values inserted successfully.");
        } catch (SQLException e) {
            System.err.println("Error executing query: " + query);
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection.");
            e.printStackTrace();
        }
    }
}
