package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {
    @BeforeClass
    public void set(){
        System.out.println("BeforeClass is running...");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BeforeMethod is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("AfterMethod is running...");
    }

    @BeforeMethod
    public void setUpMethod2(){
        System.out.println("BeforeMethod is running...");
    }

    @AfterMethod
    public void tearDownMethod2(){
        System.out.println("AfterMethod is running...");
    }

@Test(priority = 2)
public void test1(){
    System.out.println("Test1 is running...");
    String actual = "apple";
    String expect = "apple";
    Assert.assertEquals(actual,expect);

}
@Test (priority = 1)
public void test2(){
    System.out.println("test2 is running...");

    Assert.assertEquals("Orange","Orange","FAILED");
}


















}
