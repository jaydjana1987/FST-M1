package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {



    public String readProperties(String key) throws IOException, FileNotFoundException {
        String value = null;
        String projectPath = System.getProperty("user.dir");
        File textFile = new File(projectPath + "\\src\\main\\resources\\config.properties");
        FileInputStream fis;

        fis = new FileInputStream(textFile);
        Properties prop = new Properties();
        prop.load(fis);
        value = prop.getProperty(key);
        return value;
    }


}
