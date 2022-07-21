package com.cydeo.test.day10_Window_utilities;

import com.cydeo.Base.TestBase;
import com.cydeo.Utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe_CRM_AppreciationMSG extends TestBase {


    @Test
    public void appreciationMsg() {

//        2- Go to:  https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com");

//        3- Login Homepage ( Login with valid username:helpdesk21@cybertekschool.com
//        and password: UserUser)

//        CRM_Utilities.crm_login(driver);
        CRM_Utilities.crm_login2(driver,"hr21@cybertekschool.com","UserUser");

//        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        username.sendKeys("helpdesk21@cybertekschool.com");
//
//        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//        password.sendKeys("UserUser");
//
//        WebElement login = driver.findElement(By.xpath("//input[@class='login-btn']"));
//        login.click();


//        4- Click the MORE tab and select APPRECIATION
        WebElement more = driver.findElement(By.cssSelector("span[id$='link-text']"));
        more.click();

        WebElement appreciation = driver.findElement(By.xpath("(//span[.='Appreciation'])[1]"));
        appreciation.click();
//        5- Write an Appreciation
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
//        driver.switchTo().frame(0);

        driver.findElement(By.tagName("body")).sendKeys("HELLO!");

//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
//        6- Click the SEND button
        WebElement send = driver.findElement(By.cssSelector("#blog-submit-button-save"));
        send.click();
//        7- Verify the Appreciation message is displayed on the feed
        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        Assert.assertTrue(feedText.isDisplayed());
        Assert.assertEquals(feedText.getText(),"HELLO!");
        System.out.println("feedText.isDisplayed() = " + feedText.isDisplayed());


    }
}
