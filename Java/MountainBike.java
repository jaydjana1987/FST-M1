package activities.Java_M1.session1.activity_7;

public class MountainBike extends Bicycle{

    public int seatHeight;
    public MountainBike(int gears, int speed, int height) {
        super(gears, speed);
        seatHeight=height;
    }
    public void bicycleDesc()
    {
        super.bicycleDesc();
        System.out.println("BiCycle height is: "+seatHeight);

    }



}
