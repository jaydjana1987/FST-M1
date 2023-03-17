package activities.Java_M1.session1.activity_5;

public class Activity5 {

    public static void main(String[] args)
    {
        MyBook newNovel=new MyBook();

        String title="Hello Title";

        newNovel.setTitle(title);

        System.out.println("The Title is : "+newNovel.getTitle());
    }
}
