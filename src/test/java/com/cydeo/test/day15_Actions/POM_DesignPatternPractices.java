package com.cydeo.test.day15_Actions;

import com.cydeo.Pages.LibraryLoginPage;
import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POM_DesignPatternPractices {

    @Test
    public void negativeLoginLibrary() {

        //1- Go to library
        Driver.getDriver().get("https://library2.cydeo.com/login.html");

        /* Creating object of class. When we create the object of "LibraryLoginPage",
        constructor will automatically initialize driver and object of LibraryLoginPage.
        It means, we will be able to use the selenium method through the object of the class
         */
        LibraryLoginPage loginPage = new LibraryLoginPage();

        //2- Enter incorrect username
        loginPage.inputEmail.sendKeys("wrong@gmail.com");

        //3- Enter incorrect password
        loginPage.inputPassword.sendKeys("wrongPassword");

        //4- click to "sign in" button
        loginPage.signButton.click();
        Sleep.sleep(5);
        //5- Verify error message is displayed
        Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());

      //  Driver.closeDriver();
    }


}
