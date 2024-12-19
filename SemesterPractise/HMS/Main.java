package SemesterPractise.HMS;

import SemesterPractise.HMS.Hotel;
import SemesterPractise.HMS.Rooms.RoomClass;
import SemesterPractise.HMS.Customers.CustomeClass;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RoomClass room1 = new RoomClass("101", "Single", 1000.0, true);
        RoomClass room2 = new RoomClass("102", "Double", 1500.0, true);
        RoomClass room3 = new RoomClass("103", "Single", 1000.0, false);

        CustomeClass customer1 = new CustomeClass("John Doe", "C001", "1234567890", "john@example.com");
        CustomeClass customer2 = new CustomeClass("Jane Smith", "C002", "0987654321", "jane@example.com");

        List<RoomClass> rooms = Arrays.asList(room1, room2, room3);
        List<CustomeClass> customers = Arrays.asList(customer1, customer2);

        Hotel hotel = new Hotel(rooms, customers);

        // Find available rooms
        hotel.findAvailableRoom("Single");

        // Customer books a room
        customer1.addBooking(room1);

        // Check available rooms again
        hotel.findAvailableRoom("Single");

        // Customer removes booking
        customer1.removeBooking(room1);

        // Check available rooms again
        hotel.findAvailableRoom("Single");
    }
}
