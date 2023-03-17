package activities.Java_M1.session3.activity_14;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {

        String sourceFilePath="src/main/java/activities/session3/Activity_14/Activity14_file_Source.txt";


        //Use the createNewFile() method to create a file.
        File file = new File(sourceFilePath);
        boolean fStatus = file.createNewFile();


        if(fStatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists");
        }
        //Write some text into the text file.
        FileWriter myWriter = new FileWriter(sourceFilePath);
        myWriter.write("Hello File");
        myWriter.close();

        //Use the FileUtils.getFile() method to get the file object.
        //To read the file the method is readFileToString().
        File fileUtil = FileUtils.getFile(sourceFilePath);

        System.out.println("Data in newly created file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        //we create a new directory named resources.
        File destDir = new File("resources");
        //Copy the text file into this directory using the copyFileToDirectory() method.
        FileUtils.copyFileToDirectory(file, destDir);

        //To read data from this new file using FileUtils class use the getFile() method to get the file. Then use readFileToString() to read file.

        File newFile = FileUtils.getFile(destDir, "Activity14_file_Source.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");

        System.out.println("Data in copied file: " + newFileData);
    }
}
