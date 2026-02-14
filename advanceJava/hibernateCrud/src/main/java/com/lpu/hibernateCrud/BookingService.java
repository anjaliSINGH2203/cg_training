package com.lpu.hibernateCrud;

import com.lpu.entities.Booking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BookingService {

    private final BookingDAO dao = new BookingDAO();

    public void addBooking(Booking b) {
        validateRoomType(b.getRoomType());
        b.setTotalAmount(calculateTotal(b.getRoomType(), b.getCheckInDate(), b.getCheckOutDate()));
        dao.add(b);
    }

    public void viewAll() {
        dao.getAll().forEach(System.out::println);
    }

    public boolean updateBooking(int id, String name, String roomType, String in, String out) {
        Booking existing = dao.getById(id);
        if (existing == null) return false;

        validateRoomType(roomType);

        existing.setCustomerName(name);
        existing.setRoomType(roomType);
        existing.setCheckInDate(in);
        existing.setCheckOutDate(out);
        existing.setTotalAmount(calculateTotal(roomType, in, out));

        dao.update(existing);
        return true;
    }

    public boolean deleteBooking(int id) {
        return dao.delete(id);
    }

    private void validateRoomType(String rt) {
        if (rt == null) throw new IllegalArgumentException("roomType cannot be null");
        if (!(rt.equalsIgnoreCase("Standard") || rt.equalsIgnoreCase("Deluxe") || rt.equalsIgnoreCase("Suite"))) {
            throw new IllegalArgumentException("roomType must be Standard / Deluxe / Suite");
        }
    }

    private double calculateTotal(String roomType, String checkIn, String checkOut) {
        LocalDate in = LocalDate.parse(checkIn.trim());     // yyyy-MM-dd
        LocalDate out = LocalDate.parse(checkOut.trim());

        long days = ChronoUnit.DAYS.between(in, out);
        if (days <= 0) throw new IllegalArgumentException("checkOutDate must be after checkInDate");

        int pricePerDay = switch (roomType.toLowerCase()) {
            case "standard" -> 2000;
            case "deluxe" -> 3500;
            case "suite" -> 5000;
            default -> throw new IllegalArgumentException("Invalid roomType");
        };

        return days * pricePerDay;
    }
}
