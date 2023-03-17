package activities.Java_M1.session1.activity_1;

public class Activity1 {

    public static void main(String[] args)
    {
        Car carName=new Car();

//Initialize variables in Car class
        carName.make=2014;
        carName.color="Black";
        carName.transmission="Manual";

// Call All methods in Car class
        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();
    }

}
