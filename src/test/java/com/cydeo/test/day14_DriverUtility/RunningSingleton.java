package com.cydeo.test.day14_DriverUtility;

import org.testng.annotations.Test;

public class RunningSingleton {

    @Test(priority = 2)
    public void singletonTest() {
        String str1 = Singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
    }

   @Test(priority = 1)
    public void singletonTest2() {
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
    }
}
