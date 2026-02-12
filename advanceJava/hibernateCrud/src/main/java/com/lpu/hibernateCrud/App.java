package com.lpu.hibernateCrud;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lpu.entities.User;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Configuration cfg = new Configuration();
        cfg.configure("com/lpu/config/hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();

        while (true) {
            System.out.println("\n=== Hibernate CRUD Menu ===");
            System.out.println("1. INSERT");
            System.out.println("2. SELECT (All)");
            System.out.println("3. UPDATE (By ID)");
            System.out.println("4. DELETE (By ID)");
            System.out.println("5. EXIT");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                // ✅ INSERT (multiple users)
                case 1: {
                    Session session = sf.openSession();
                    Transaction tr = session.beginTransaction();

                    try {
                        System.out.print("Enter the number of rows u want to insert: ");
                        int n = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < n; i++) {
                            User u = new User();

                            System.out.print("Enter name: ");
                            u.setName(sc.nextLine());

                            System.out.print("Enter email: ");
                            u.setEmail(sc.nextLine());

                            System.out.print("Enter city: ");
                            u.setCity(sc.nextLine());

                            session.persist(u); // ID auto-generated
                        }

                        tr.commit();
                        System.out.println(n + " user(s) added successfully");

                    } catch (Exception e) {
                        tr.rollback();
                        e.printStackTrace();
                        System.out.println("User not added");
                    } finally {
                        session.close();
                    }
                    break;
                }

                // ✅ SELECT (store in List and display)
                case 2: {
                    Session session = sf.openSession();
                    try {
                        List<User> users = session
                                .createQuery("from User", User.class)
                                .getResultList();

                        if (users.isEmpty()) {
                            System.out.println("No users found.");
                        } else {
                            for (User u : users) {
                                System.out.println(
                                        "ID: " + u.getId() +
                                        ", Name: " + u.getName() +
                                        ", Email: " + u.getEmail() +
                                        ", City: " + u.getCity()
                                );
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        session.close();
                    }
                    break;
                }

                // ✅ UPDATE (by id)
                case 3: {
                    Session session = sf.openSession();
                    Transaction tr = session.beginTransaction();

                    try {
                        System.out.print("Enter id to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        User u = session.get(User.class, id);
                        if (u == null) {
                            System.out.println("User not found with id: " + id);
                            tr.rollback();
                            break;
                        }

                        System.out.print("Enter new name: ");
                        u.setName(sc.nextLine());

                        System.out.print("Enter new email: ");
                        u.setEmail(sc.nextLine());

                        System.out.print("Enter new city: ");
                        u.setCity(sc.nextLine());

                        // u is already persistent because we fetched it with session.get()
                        tr.commit();
                        System.out.println("User updated successfully");

                    } catch (Exception e) {
                        tr.rollback();
                        e.printStackTrace();
                        System.out.println("User not updated");
                    } finally {
                        session.close();
                    }
                    break;
                }

                // ✅ DELETE (by id)
                case 4: {
                    Session session = sf.openSession();
                    Transaction tr = session.beginTransaction();

                    try {
                        System.out.print("Enter id to delete: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        User u = session.get(User.class, id);
                        if (u == null) {
                            System.out.println("User not found with id: " + id);
                            tr.rollback();
                            break;
                        }

                        session.remove(u);
                        tr.commit();
                        System.out.println("User deleted successfully");

                    } catch (Exception e) {
                        tr.rollback();
                        e.printStackTrace();
                        System.out.println("User not deleted");
                    } finally {
                        session.close();
                    }
                    break;
                }

                // ✅ EXIT
                case 5:
                    sf.close();
                    sc.close();
                    System.out.println("Exit.");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
