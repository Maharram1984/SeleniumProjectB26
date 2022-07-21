package com.cydeo.test.day11_Webtables_Utilities;

import com.cydeo.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {


    @Test
    public void webTablesTest() {

        driver.get("https://practice.cydeo.com/tables");


        WebElement jason = driver.findElement(By.xpath("(//td[.='Jason'])[1]"));
        System.out.println("Before jason.getText() = " + jason.getText());

        //(//td[.='Jason'])[1]   //table[@id='table1']//tbody//tr[3]//td[2]

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        jason = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("After jason.getText() = " + jason.getText());

        WebElement jason1 = driver.findElement(By.xpath("(//td[.='Jason'])[1]"));
        System.out.println("Before jason.getText() = " + jason1.getText());

        //(//td[.='Jason'])[1]   //table[@id='table1']//tbody//tr[3]//td[2]

        WebElement firstName1 = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        jason1 = driver.findElement(By.xpath("(//td[.='Jason'])[1]"));
        System.out.println("After jason.getText() = " + jason1.getText());

        System.out.println("===============================================");

        List<WebElement> all = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        int count = 1;
        for (WebElement each : all) {
            System.out.println(count++ +"each.getText() = " + each.getText());
        }
    }

}
