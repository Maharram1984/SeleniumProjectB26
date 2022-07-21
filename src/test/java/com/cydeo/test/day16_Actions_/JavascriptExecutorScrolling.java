package com.cydeo.test.day16_Actions_;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecutorScrolling {

    @Test
    public void javaScriptScrolling1() {
        Driver.getDriver().get(" https://practice.cydeo.com/infinite_scroll ");
        for (int i = 0; i < 10; i++) {
            Sleep.sleep(1);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,750)");
        }
        for (int j = 0; j < 10; j++) {
            Sleep.sleep(1);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,-750)");
        }
    }

    @Test
    public void javaScriptScrolling2(){

        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large ");
        //3- Scroll down to “Cydeo” link
        WebElement cydeo = Driver.getDriver().findElement(By.xpath("//a[@target='_blank']"));
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true)",cydeo);
        //4- Scroll up to “Home” link
        WebElement home = Driver.getDriver().findElement(By.cssSelector(".nav-link"));
        Sleep.sleep(2);
        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);arguments[0].click()",home);



        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }



}
