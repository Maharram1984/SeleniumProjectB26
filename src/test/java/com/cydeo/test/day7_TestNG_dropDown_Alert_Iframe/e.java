package com.cydeo.test.day7_TestNG_dropDown_Alert_Iframe;

import com.cydeo.Base.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class e {
    WebDriver driver;
  public void setUp(){
      driver = WebDriverFactory.getDriver("chrome");
  }
    @Test
    public void s() {
        WebElement vat = driver.findElement(By.xpath("//input[@data-name='field__catalog-value']"));
        vat.sendKeys("10000$");
        WebElement seat = driver.findElement(By.xpath("//input[@data-ftid='custom_entity_type_SeatsNumber']"));
        seat.sendKeys("4");
        WebElement doors = driver.findElement(By.xpath("//input[@name='custom_entity_type[DoorsNumber]']"));
        doors.sendKeys("4");
        WebElement color = driver.findElement(By.xpath("//input[@name='custom_entity_type[Color]']"));
        color.sendKeys("black");
        WebElement transmission = driver.findElement(By.xpath("//span[@class='select2-chosen']"));
        transmission.click();
        WebElement auto = driver.findElement(By.xpath("//div[.='Automatic']"));
        auto.click();
        WebElement fuelType = driver.findElement(By.xpath("(//span[@class='select2-chosen'])[2]"));
        fuelType.click();
        WebElement hybrid = driver.findElement(By.xpath("//div[.='Hybrid']"));
        hybrid.click();
        WebElement co2 = driver.findElement(By.xpath("//input[@data-name='field__c-o2-emissions']"));
        co2.sendKeys("2020");
        WebElement horsePower = driver.findElement(By.xpath("//input[@data-name='field__horsepower']"));
        horsePower.sendKeys("500");
        WebElement save = driver.findElement(By.xpath("//div[@class=\"btn-group pull-right\"]/button"));
        save.click();
    }
}