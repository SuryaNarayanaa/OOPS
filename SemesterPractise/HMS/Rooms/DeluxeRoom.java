package SemesterPractise.HMS.Rooms;

public class DeluxeRoom extends RoomClass{
    boolean hasJacuzzi;

    public DeluxeRoom(String roomNumber, String roomType, double priceperNight, boolean isavailable, boolean hasJacuzzi) {
        super(roomNumber, roomType, priceperNight, isavailable);
        this.hasJacuzzi = hasJacuzzi;
    }
    @Override
    public  double getPriceperNight()
    {
        return super.getPriceperNight()*1.5;
    }
}
