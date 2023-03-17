package activities.Java_M1.session1.activity_4;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1, 7, 5};

        System.out.println("Array before sort " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        System.out.println("Array After sort " + Arrays.toString(array));


    }
}
