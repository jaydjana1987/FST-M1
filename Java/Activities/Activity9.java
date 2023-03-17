package activities.Java_M1.session2.activity_9;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    static String nameCheck="Hello";
    public static void main(String[] args) {
        //Create an ArrayList named myList of type String
        ArrayList<String> myList = new ArrayList<String>();
        //Add 5 names to the ArrayList using add() method
        myList.add("Messi");
        myList.add("Ronaldo");
        myList.add("Pele");
        myList.add("Maradona");
        myList.add("Lampard");

        //Then print all the names using for loop
        for (String name : myList) {
            System.out.println(name);
        }

        //Then use get() method to retrieve the 3rd name in the ArrayList
        System.out.println("The 3rd name in the list: " + myList.get(2));

        //Use contains() method to check if a name exists in the ArrayList.
        if (myList.contains(nameCheck) == true) {
            System.out.println("name exists");
        } else {
            System.out.println("name doesn't exits");
        }

        //Use size() method to print the number of names in the ArrayList.
        System.out.println("Size of myList ArrayList: "+myList.size());

        //Use remove() method to remove a name from the list and print the size() of the list again.
        myList.remove(0);
        System.out.println("Size of myList ArrayList after remove: "+myList.size());




    }

}
