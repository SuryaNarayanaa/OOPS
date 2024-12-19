package SemesterPractise.HMS.Rooms;

public class RoomClass {
    private String roomNumber;
    private String roomType;
    private double priceperNight;
    private boolean isAvailable;

    public RoomClass(String roomNumber, String roomType, double priceperNight, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.priceperNight = priceperNight;
        this.isAvailable = isAvailable;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPriceperNight() {
        return priceperNight;
    }

    public void setPriceperNight(double priceperNight) {
        this.priceperNight = priceperNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void bookRoom() {
        this.isAvailable = false;
    }
}
