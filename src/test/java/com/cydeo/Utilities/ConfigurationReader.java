package com.cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
// Creating re-usable method that will be read from configuration.reader file

    private static Properties properties = new Properties();



    static {
        try {               //FileNotFoundException

            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
//After loading  into to the object we don't need to keep open the file method in Java memory
            file.close();
        } catch (IOException e) {
            System.out.println("File does not found in Configuration properties");
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }


}
