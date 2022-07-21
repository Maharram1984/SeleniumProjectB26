package com.cydeo.test.day12_Configuration;

import com.cydeo.Utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

  @Test
  public void readingProperties() throws IOException {

      Properties properties = new Properties();

      FileInputStream file = new FileInputStream("configuration.properties");

      properties.load(file);

      System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
      System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
  }

  @Test
    public void usingProperties(){
      System.out.println("ConfigurationReader.getProperties(\"browser\") = " + ConfigurationReader.getProperty("browser"));
      System.out.println("ConfigurationReader.getProperties(\"env\") = " + ConfigurationReader.getProperty("env"));
      System.out.println("ConfigurationReader.getProperties(\"password\") = " + ConfigurationReader.getProperty("password"));
      System.out.println("ConfigurationReader.getProperties(\"username\") = " + ConfigurationReader.getProperty("username"));
  }










}
