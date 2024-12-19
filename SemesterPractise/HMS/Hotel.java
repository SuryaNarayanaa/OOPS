package SemesterPractise.HMS;

import SemesterPractise.HMS.Customers.CustomeClass;
import SemesterPractise.HMS.Rooms.RoomClass;

import java.util.List;

public class Hotel {
    private List<RoomClass> rooms;
    private List<CustomeClass> customers;

    public Hotel(List<RoomClass> rooms, List<CustomeClass> customers) {
        this.rooms = rooms;
        this.customers = customers;
    }

    public List<RoomClass> getRooms() {
        return rooms;
    }

    public List<CustomeClass> getCustomers() {
        return customers;
    }

    public void addRoom(RoomClass room) {
        this.rooms.add(room);
    }

    public void findAvailableRoom(String type) {
        boolean isAvailable = false;
        for (RoomClass room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(type) && room.isAvailable()) {
                System.out.println("Available Room: " + room.getRoomNumber() + " | Price per Night: " + room.getPriceperNight());
                isAvailable = true;
            }
        }
        if (!isAvailable) {
            System.out.println("No available rooms of type: " + type);
        }
    }
}
