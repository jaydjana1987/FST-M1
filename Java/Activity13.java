package activities.Java_M1.session3.activity_13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

    public static void main(String[] args) {
        //accept number inputs from the console using Scanner class and store them in an array.
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Then use the Random class to generate an index value and print the value in the array at then generated index value.
        Random indexGen = new Random();

        System.out.print("Enter integers please (enter non integer to stop) ");

        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Generated index: " + index);
        System.out.println("Index Value is: " + nums[index]);

        scan.close();
    }
}
