package com.cydeo.test.day14_DriverUtility;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

public class JSExecutorPractice {

    @Test
    public void scrollJSExecutorTest() {
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        SessionId sessionId = ((RemoteWebDriver) Driver.getDriver()).getSessionId();
        System.out.println(sessionId);
        Sleep.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {

            Sleep.sleep(1);
            js.executeScript("window.scrollBy(0,250)");  // down

//            js.executeScript("window.scrollBy(0,-250)"); // up
//            ((JavascriptExecutor)Driver.getDriver()).executeScript("window.scrollBy(0,750)");
        }
        Driver.closeDriver();
    }

    @Test
    public void scrollJSExecutorTest2() {
        Driver.getDriver().get("https://practice.cydeo.com/large");
        SessionId sessionId = ((RemoteWebDriver) Driver.getDriver()).getSessionId();
        System.out.println(sessionId);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        Sleep.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeo);
        Sleep.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", homeLink);
        Sleep.sleep(2);

//        Driver.closeDriver();

    }


}
