package activities.Java_M1.session1.activity_1;

public class Car {

// Variable declaration
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

// Create Constructor and initialize values
    public Car()
    {
        tyres=4;
        doors=4;
    }

// Create Methods
    public void displayCharacteristics()
    {
        System.out.println("The color of the Car "+color);
        System.out.println("The transmission of the Car "+ transmission);
        System.out.println("The Car made in  "+ make);
        System.out.println("Number of tyres in the Car "+tyres);
        System.out.println("Number of doors in the Car "+ doors );
    }

    public void accelarate()
    {
        System.out.println("Car is moving forward.");
    }

    public void brake()
    {
        System.out.println("Car has stopped.");
    }



}
