package com.lpu.hibernateCrud;

import com.lpu.entities.Booking;

import java.util.Scanner;

public class HotelManagementSystemApp {

    public static void main(String[] args) {
        BookingService service = new BookingService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- HOTEL DELIGHT ---");
            System.out.println("1) Add Booking");
            System.out.println("2) View All Bookings");
            System.out.println("3) Update Booking");
            System.out.println("4) Delete Booking");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int ch = Integer.parseInt(sc.nextLine().trim());

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Customer Name: ");
                        String name = sc.nextLine();

                        System.out.print("Room Type (Standard/Deluxe/Suite): ");
                        String roomType = sc.nextLine();

                        System.out.print("CheckIn (yyyy-MM-dd): ");
                        String in = sc.nextLine();

                        System.out.print("CheckOut (yyyy-MM-dd): ");
                        String out = sc.nextLine();

                        Booking b = new Booking(name, roomType, in, out);
                        service.addBooking(b);
                        System.out.println("✅ Booking Added! Total = " + b.getTotalAmount());
                    }
                    case 2 -> service.viewAll();
                    case 3 -> {
                        System.out.print("Booking ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("New Name: ");
                        String name = sc.nextLine();

                        System.out.print("New Room Type: ");
                        String roomType = sc.nextLine();

                        System.out.print("New CheckIn (yyyy-MM-dd): ");
                        String in = sc.nextLine();

                        System.out.print("New CheckOut (yyyy-MM-dd): ");
                        String out = sc.nextLine();

                        boolean ok = service.updateBooking(id, name, roomType, in, out);
                        System.out.println(ok ? "✅ Updated" : "❌ ID not found");
                    }
                    case 4 -> {
                        System.out.print("Booking ID to delete: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println(service.deleteBooking(id) ? "✅ Deleted" : "❌ ID not found");
                    }
                    case 0 -> { return; }
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}
