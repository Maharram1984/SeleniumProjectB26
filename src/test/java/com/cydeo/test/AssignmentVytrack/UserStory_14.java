package com.cydeo.test.AssignmentVytrack;

import com.cydeo.Utilities.Driver;
import com.cydeo.Utilities.VyTrack;
import com.cydeo.Utilities.Sleep;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserStory_14 {

    @Test
    public void userStory14() {

        VyTrack.vyTrack_login();

        WebElement fleetHvrOvr = Driver.getDriver().findElement(By.xpath("(//a[@class='unclickable']//span)[2]"));
        Sleep.sleep(3);
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(fleetHvrOvr).perform();
        Driver.actions.moveToElement(fleetHvrOvr).perform();
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();
        Sleep.sleep(4);
        WebElement creatCar = Driver.getDriver().findElement(By.xpath("//a[@title='Create Car']"));
        creatCar.click();
        Faker faker = new Faker();
        WebElement licencePl = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'LicensePlate')]"));
        licencePl.sendKeys(faker.numerify("####"));
        WebElement sedan = Driver.getDriver().findElement(By.xpath("//input[@data-name='field__5']"));
        sedan.click();
        Sleep.sleep(2);
        WebElement driver = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[Driver]']"));
        driver.sendKeys(faker.name().fullName());
        WebElement location = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[Location]']"));
        location.sendKeys(faker.address().streetAddress());
        WebElement chassisNumb = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[ChassisNumber]']"));
        chassisNumb.sendKeys(faker.numerify("########"));
        WebElement modelYear = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[ModelYear]']"));
        modelYear.sendKeys("2020");
        WebElement odometer = Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[LastOdometer]']"));
        odometer.sendKeys("39000");
        WebElement choseDate1 = Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Choose a date'])[1]"));
        choseDate1.click();

        Select month = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        month.selectByVisibleText("Dec");
        Select year = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year.selectByVisibleText("1983");
        WebElement day = Driver.getDriver().findElement(By.xpath("//a[.='28']"));
        day.click();
        WebElement choseDate2 = Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Choose a date'])[2]"));
        choseDate2.click();

        Select month2 = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        month2.selectByVisibleText("Jan");
        Select year2 = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year2.selectByVisibleText("2022");
        WebElement day2 = Driver.getDriver().findElement(By.xpath("//a[.='11']"));
        day2.click();
        WebElement catalogValue = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'CatalogValue')]"));
        catalogValue.sendKeys("$10000");
        WebElement seatNumber = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'SeatsNumber')]"));
        seatNumber.sendKeys(faker.numerify("#"));
        WebElement doorsNumber = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'DoorsNumber')]"));
        doorsNumber.sendKeys("4");
        WebElement color = Driver.getDriver().findElement(By.xpath("//input[contains(@id,'Color')]"));
        color.sendKeys("grey");
        WebElement transmission = Driver.getDriver().findElement(By.xpath("(//span[.='Choose a value...'])[1]"));
        transmission.click();
        Sleep.sleep(3);
        WebElement automatic = Driver.getDriver().findElement(By.xpath("//div[.='Automatic']"));
        automatic.click();
        WebElement fuelTypeBtn = Driver.getDriver().findElement(By.xpath("(//span[@class='select2-chosen'])[2]"));
        fuelTypeBtn.click();
        WebElement hybrid = Driver.getDriver().findElement(By.xpath("//div[.='Hybrid']"));
        hybrid.click();
        WebElement co2 = Driver.getDriver().findElement(By.cssSelector("input[id*='CO2Emissions']"));
        co2.sendKeys(faker.numerify("####"));
        WebElement horsepower = Driver.getDriver().findElement(By.cssSelector("input[id*='Horsepower-uid-62']"));
        horsepower.sendKeys(faker.numerify("####"));
        WebElement horsepowerTaxation = Driver.getDriver().findElement(By.cssSelector("input[id*='HorsepowerTaxation']"));
        horsepowerTaxation.sendKeys(faker.numerify("#####"));
        WebElement powerKv = Driver.getDriver().findElement(By.cssSelector("input[id*='type_Power']"));
        powerKv.sendKeys(faker.numerify("###"));

        Driver.closeDriver();






    }
}
