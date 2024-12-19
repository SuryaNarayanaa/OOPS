package SemesterPractise.HMS.Rooms;

public class StandardRoom extends  RoomClass{
    private boolean hasMiniBar ;
    public  StandardRoom(String rno , String type , double ppn,boolean isavail , boolean hasMiniBar)
    {
        super(rno, type, ppn, isavail );
        this.hasMiniBar = hasMiniBar;
    }

    void setHasMiniBar(boolean hasMiniBar)
    {
        this.hasMiniBar  =hasMiniBar;
    }
    boolean getMinbar()
    {
        boolean minibar = this.hasMiniBar;
        return  minibar;
    }

    @Override
    public  double getPriceperNight()
    {
        return super.getPriceperNight()*.75;
    }
}
