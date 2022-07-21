package com.cydeo.test.day5_Findelements_Checkbox_Radiobutton;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBox {

    public static void main(String[] args) {
//        1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        WebDriver driver = WebDrFact.getDriver("chrome");
//       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");


//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println(!checkbox1.isSelected() ? "It is not selected" : "Selected");

//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println(checkbox2.isSelected() ? "Selected" : " Is not selected");

//        4. Click checkbox #1 to select it.
        checkbox1.click();
//        5. Click checkbox #2 to deselect it.
        checkbox2.click();

//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        driver.quit();

    }
}
