package org.example;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER_NAME = "postgres";
    private static final String USER_PASSWORD = "pass";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER_NAME, USER_PASSWORD)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM information_schema.tables;");
            while (resultSet.next()) {
                int count = resultSet.getInt("count");
                System.out.println("There is " + count + " tables in DB");
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}