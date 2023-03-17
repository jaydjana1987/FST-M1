package activities.Java_M1.session1.activity_7;

public class Bicycle implements BicycleParts,BicycleOperations {
    public int gears;
    public int speed;

    public Bicycle(int gears,int speed)
    {
      this.gears=gears;
      this.speed=speed;
    }

    @Override
    public void applyBrake(int decrement) {

        speed -=decrement;
        System.out.println("Current speed After applying Brake: "+ speed);

    }

    @Override
    public void speedUp(int increment) {
        speed +=increment;
        System.out.println("Current speed After applying Speed: "+ speed);

    }

    public void bicycleDesc()
    {
        System.out.println("NUmber of the gears in BiCycle: "+gears);
        System.out.println("Current speed of BiCycle is: "+speed);
    }
}
