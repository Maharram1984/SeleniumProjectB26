package com.cydeo.test.day14_DriverUtility;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void javaFakerTest() {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.address());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().streetAddress());
    }
}
