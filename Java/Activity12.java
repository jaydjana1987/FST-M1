package activities.Java_M1.session3.activity_12;

public class Activity12 {
    public static void main(String[] args) {

        // One variable, say ad1, contains a lambda expression(no body), that saves the result of num1 plus num2.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println("The add of 10 & 20 is: "+ad1.add(10, 20));

        // The other variable, say ad2, contains a lambda function(has a body), that also saves the result of num1 plus num2.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("The add of 5 & 10 is: "+ad2.add(5, 10));
    }
}
