package activities.Junit_M1.activity_1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    //Create a test fixture that declares a static ArrayList named list.
    static ArrayList<String> list;

    //Create a setUp() method with the @BeforeAll annotation. Add the following to the setUp() method:
    @BeforeEach
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
    //Create 2 @Test methods, insertTest() and replaceTest().

    @Test
    public void insertTest(){
        //Write an assertion to check the size of the ArrayList. The expected value is 2.
        assertEquals(2, list.size(), "Wrong size");
        //Add a new value to the list and write another assertion to check the size of the new list. The expected values of the list should be 3
        list.add("gama");
        assertEquals(3, list.size(), "Wrong size");
        //Finally write assertions for checking each of the values in the ArrayList.
        assertEquals("alpha", list.get(0), "Wrong element in position 0");
        assertEquals("beta", list.get(1), "Wrong element in position 1");
        assertEquals("gama", list.get(2), "Wrong element in position 2");

    }

    @Test
    public void replaceTest(){
        //Write an assertion to check the size of the ArrayList. The expected value is 2.
        assertEquals(2, list.size(), "Wrong size");

        //Add a new value to the list and write another assertion to check the size of the new list. The expected values of the list should be 3.

        list.add("zeta");
        assertEquals(3, list.size(), "Wrong size");

        //Finally, use the ArrayList set() method to replace the value on index 1 to a different value.
        list.set(1, "Hello");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");

        //Write an assertion to assert the values of the ArrayList.
        assertEquals("alpha", list.get(0), "Wrong element in position 0");
        assertEquals("beta", list.get(1), "Wrong element in position 1");
        assertEquals("gama", list.get(2), "Wrong element in position 2");
    }
}

