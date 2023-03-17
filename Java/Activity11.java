package activities.Java_M1.session2.activity_11;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {

        //Create a Map named colours with integer keys and String values
        HashMap<Integer,String> colours=new HashMap<Integer,String>();

        //Add 5 random colours to it and print the Map to the console.
        colours.put(1,"Red");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Blue");
        colours.put(5,"Violet");

        System.out.println("colours HashMap is: "+colours);

        //Remove one colour using the remove() method.
        colours.remove(3);

        System.out.println("Colours HashMap after removal: "+colours);
        //Check if the colour green exists in the Map using the containsValue() method

        if(colours.containsValue("Green"))
        {
            System.out.println("Green color exits in colours HashMap");
        }
        else
        {
            System.out.println("Green color doesn't exits in colours HashMap");
        }

        //Print the size of the Map using the size() method.
        System.out.println("The Size of colurs HashMap is: "+colours.size());



    }
}
