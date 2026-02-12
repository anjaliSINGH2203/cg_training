package com.JDBC;

import java.sql.*;
import java.util.Scanner;

public class JdbcExample {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            // 1️⃣ Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2️⃣ Create Connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/scott",
                    "root",
                    "anjali"
            );

            // 3️⃣ Create Statement
            Statement statement = connection.createStatement();

            System.out.println("1. Insert");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                // 🔹 CREATE (INSERT)
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int rowsInserted = statement.executeUpdate(
                            "INSERT INTO aj VALUES (" + id + ", '" + name + "')"
                    );

                    System.out.println(rowsInserted + " record inserted successfully");
                    break;

                // 🔹 READ
                case 2:
                    ResultSet rs = statement.executeQuery("SELECT * FROM aj");

                    while (rs.next()) {
                        System.out.println(
                                rs.getInt("id") + " -> " +
                                rs.getString("name")
                        );
                    }
                    break;

                // 🔹 UPDATE
                case 3:
                    System.out.print("Enter id to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    int rowsUpdated = statement.executeUpdate(
                            "UPDATE aj SET name='" + newName + "' WHERE id=" + updateId
                    );

                    System.out.println(rowsUpdated + " record(s) updated successfully");
                    break;

                // 🔹 DELETE
                case 4:
                    System.out.print("Enter id to delete: ");
                    int deleteId = sc.nextInt();

                    int rowsDeleted = statement.executeUpdate(
                            "DELETE FROM aj WHERE id=" + deleteId
                    );

                    System.out.println(rowsDeleted + " record(s) deleted successfully");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            // 4️⃣ Close resources
            statement.close();
            connection.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
