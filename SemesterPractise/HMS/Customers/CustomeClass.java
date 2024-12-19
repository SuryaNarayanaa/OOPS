package SemesterPractise.HMS.Customers;

import SemesterPractise.HMS.Rooms.RoomClass;

import java.util.ArrayList;
import java.util.List;

public class CustomeClass {
    private String name;
    private String customerId;
    private String phoneNo;
    private String email;
    private List<RoomClass> bookedRooms;

    public CustomeClass(String name, String customerId, String phoneNo, String email) {
        this.name = name;
        this.customerId = customerId;
        this.phoneNo = phoneNo;
        this.email = email;
        this.bookedRooms = new ArrayList<>();
    }

    public void addBooking(RoomClass room) {
        if (room.isAvailable()) {
            bookedRooms.add(room);
            room.setAvailable(false);
            System.out.println("Room " + room.getRoomNumber() + " successfully booked for " + name);
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not available.");
        }
    }

    public void removeBooking(RoomClass room) {
        bookedRooms.removeIf(r -> r.getRoomNumber().equals(room.getRoomNumber()));
        room.setAvailable(true);
        System.out.println("Room " + room.getRoomNumber() + " has been removed from the booking.");
    }

    public List<RoomClass> getBookedRooms() {
        return bookedRooms;
    }
}
