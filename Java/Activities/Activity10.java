package activities.Java_M1.session2.activity_10;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        //Create a HashSet named hs
        HashSet<String> hs=new HashSet<String>();
        //Add 6 objects using add() method to the HashSet.
        hs.add("Obj1");
        hs.add("Obj2");
        hs.add("Obj3");
        hs.add("Obj4");
        hs.add("Obj5");
        hs.add("Obj6");

        System.out.println("Hash set details: "+hs);

        //Then print the size of the HashSet using the size() method.
        System.out.println("The size of Set is: "+hs.size());

        //Remove an element using the remove() method.
        hs.remove("Obj6");
        //Also try to remove an element that is not present in the Set.
        if(hs.remove("test"))
        {
            System.out.println("test remove from hs");
        }
        else {
            System.out.println("test isn't present");
        }

        //Use the contains() method to check if an item is in the Set or not.
        System.out.println("Verify if Obj7 present in Hash Set or not: "+hs.contains("Obj7"));

        //Print the updated set.
        System.out.println("Updated Hash Set is: "+hs);
    }
}
