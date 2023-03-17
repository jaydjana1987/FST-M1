package activities.Java_M1.session1.activity_3;

public class Activity3 {

    public static void main(String[] args)
    {
        double seconds = 1000000000;

        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        System.out.println("The Age in Earth is "+ String.format("%.2f",seconds/earthSeconds));
        System.out.println("The Age in Mercury is "+ String.format("%.2f",seconds/earthSeconds/mercurySeconds));
        System.out.println("The Age in Venus is "+ String.format("%.2f",seconds/earthSeconds/venusSeconds));
        System.out.println("The Age in Mars is "+ String.format("%.2f",seconds/earthSeconds/marsSeconds));
        System.out.println("The Age in Jupiter is "+ String.format("%.2f",seconds/earthSeconds/jupiterSeconds));
        System.out.println("The Age in Saturn is "+ String.format("%.2f",seconds/earthSeconds/saturnSeconds));
        System.out.println("The Age in Uranus is "+ String.format("%.2f",seconds/earthSeconds/uranusSeconds));
        System.out.println("The Age in Neptune is "+ String.format("%.2f",seconds/earthSeconds/neptuneSeconds));

    }

}
