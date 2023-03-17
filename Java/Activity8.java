package activities.Java_M1.session2.activity_8;

public class Activity8 {
    public static void main(String[] args) throws CustomException {

         try {
             Activity8 ac=new Activity8();
             ac.exceptionTest("Will print to console");
             ac.exceptionTest(null);
             ac.exceptionTest("check if execute or not");
         }
         catch (Exception e)
         {
             System.out.println("Exception Occured: "+e.getMessage());
         }

    }

    public void exceptionTest(String str) throws CustomException
    {
        if(str==null)
        {
            throw  new CustomException("String value null");
        }
        else
        {
            System.out.println(str);
        }
    }
}
