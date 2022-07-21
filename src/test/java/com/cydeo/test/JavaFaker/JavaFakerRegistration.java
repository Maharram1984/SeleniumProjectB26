package com.cydeo.test.JavaFaker;

import com.cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaFakerRegistration {

    @Test
    public void registrationTest() {
        Select select;
        //    Note: Use JavaFaker OR read from configuration.properties file when possible.
//    1. Open browser
//    2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");
        // Faker faker = new Faker();
//    3. Enter first name
        WebElement name = Driver.getDriver().findElement(By.name("firstname"));
        name.sendKeys(Driver.faker.name().firstName());
//    4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.name("lastname"));
        lastName.sendKeys(Driver.faker.name().lastName());
//    5. Enter username
        WebElement userName = Driver.getDriver().findElement(By.name("username"));
        userName.sendKeys(Driver.faker.bothify("???????###"));
//    6. Enter email address
        WebElement email = Driver.getDriver().findElement(By.name("email"));
        email.sendKeys(Driver.faker.internet().emailAddress());
//    7. Enter password
        WebElement password = Driver.getDriver().findElement(By.name("password"));
        password.sendKeys(Driver.faker.internet().password());
//    8. Enter phone number
        WebElement phoneNumber = Driver.getDriver().findElement(By.name("phone"));
        phoneNumber.sendKeys(Driver.faker.numerify("###-###-####"));
//    9. Select a gender from radio buttons
        WebElement radioButton = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        radioButton.click();
//    10.Enter date of birth
        WebElement dateBirth = Driver.getDriver().findElement(By.name("birthday"));
        dateBirth.sendKeys("06/22/1958");
////    11.Select Department/Office
        WebElement departmentOffice = Driver.getDriver().findElement(By.name("department"));
        select = new Select(departmentOffice);
        select.selectByIndex(Driver.faker.number().numberBetween(1, 9));
//    12.Select Job Title
        WebElement jobTitle = Driver.getDriver().findElement(By.name("job_title"));
        select = new Select(jobTitle);
        select.selectByIndex(Driver.faker.number().numberBetween(1, 8));
//    13.Select programming language from checkboxes
        for (int i = 1; i <= 3; i++) {
            WebElement language = Driver.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[" + i + "]"));
            language.click();
        }
//    14.Click to sign up button
        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUp.click();
//    15.Verify success message “You’ve successfully completed registration!” is
//    displayed.
        WebElement verify = Driver.getDriver().findElement(By.xpath("//p"));
        Assert.assertEquals(verify.getText(), "You've successfully completed registration!");


    }
}
