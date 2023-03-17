package activities.Java_M1.session1.activity_2;

public class Activity2 {

    public static void main(String[] args)

    {
        int findNumber=10;
        int compareNumber=30;
        int sum=0;
        int[] randomNumbers={10, 77, 10, 54, -11, 10};

        for(int number:randomNumbers)
        {
            if(number==findNumber)
            {
                sum+=number;
            }
        }

        System.out.println(sum==compareNumber);


    }


}
