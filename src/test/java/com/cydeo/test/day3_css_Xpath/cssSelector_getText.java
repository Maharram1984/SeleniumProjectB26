package com.cydeo.test.day3_css_Xpath;

import com.cydeo.Base.WebDrFact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssSelector_getText {
    public static void main(String[] args) {

        // TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a Chrome browser
        WebDriver driver = WebDrFact.getDriver("chROME");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        // 3- Verify “Reset password” button text is as expected:
        // Expected: Reset password

        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));

        String expect = "Reset password";
        String actual = resetPassword.getText();

        if(actual.equals(expect)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        driver.quit();





















    }
}
