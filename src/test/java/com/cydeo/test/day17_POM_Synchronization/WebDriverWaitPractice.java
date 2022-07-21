package com.cydeo.test.day17_POM_Synchronization;

import com.cydeo.Pages.DynamicLoad1Page;
import com.cydeo.Pages.DynamicLoad7Page;
import com.cydeo.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamicLoading7() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        DynamicLoad7Page loadPage7 = new DynamicLoad7Page();

        Driver.waitMe.until(ExpectedConditions.titleIs("Dynamic title"));

        Driver.waitMe.until(ExpectedConditions.visibilityOf(loadPage7.doneMessage));

        Assert.assertTrue(loadPage7.doneMessage.isDisplayed());

        Assert.assertTrue(loadPage7.spongeBobImage.isDisplayed());


    }

    @Test
    public void dynamicLoading1() {

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoad1Page load1Page = new DynamicLoad1Page();

        load1Page.startButton.click();
        Driver.waitMe.until(ExpectedConditions.invisibilityOf(load1Page.loadingBar));

        Assert.assertTrue(load1Page.username.isDisplayed());

        load1Page.username.sendKeys("tomsmith");
        load1Page.password.sendKeys("123456");
        load1Page.clickSubmit.click();

        Assert.assertTrue(load1Page.errorMessage.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }


}
