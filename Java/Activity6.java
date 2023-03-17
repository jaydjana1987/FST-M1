package activities.Java_M1.session1.activity_6;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        // Creating object of Plane Class
        Plane pl=new Plane(10);

        //Add names to the passengers list using the onboard method
        pl.onboard("Jaydeb");
        pl.onboard("Messi");
        pl.onboard("Ronaldo");

        //Print the take-off time using the takeOff() method.

        System.out.println("Plane Take-off time is: "+pl.takeOff());

        //Print the list of passengers using the getPassengers() method
        System.out.println("Number of Passenger in Plane: "+pl.getPassengers());

        //Add a Thread.sleep() method to pause execution for 5 seconds. This is to emulate plane in flight.

        Thread.sleep(5000);

        //Land() the plane and print the time of landing using getLastTimeLanded() method

        pl.land();
        System.out.println("The time of Plane landing: "+pl.getLastTimeLanded());
    }
}
