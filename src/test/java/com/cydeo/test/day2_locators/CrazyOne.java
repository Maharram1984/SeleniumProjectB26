package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrazyOne {
            public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // 1. Launch browser
            driver.get("https://www.automationexercise.com/");

            // 2-Navigate to url 'http://automationexercise.com'
            String url = "https://www.automationexercise.com/";
            String actualURL = driver.getCurrentUrl();

            //3. Verify that home page is visible successfully
            System.out.println(actualURL.equals(url) ? "home page is visible successfully" : "home page is not visible successfully");

            //4. Click on 'Signup / Login' button
            WebElement signup = driver.findElement(By.linkText("Signup / Login"));
            signup.click();

            //5. Verify 'New User Signup!' is visible
            WebElement newUser = driver.findElement(By.cssSelector("div[class='signup-form']>h2"));

            if (newUser.getText().equals("New User Signup!")) {
                System.out.println("New User Signup! is visible");
            } else {
                System.out.println("New User Signup! is not visible");
            }

            //6. Enter name and email address
            WebElement enterName = driver.findElement(By.name("name"));
            enterName.sendKeys("Liliy2000");
            WebElement enterEmail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
            enterEmail.sendKeys("Liliy2000@gmail.com");
            WebElement signupNew = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));

            //7. Click 'Signup' button
            signupNew.click();

            //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
            WebElement enterAccount = driver.findElement(By.tagName("h2"));
            if (enterAccount.getText().equals("ENTER ACCOUNT INFORMATION")) {
                System.out.println("ENTER ACCOUNT INFORMATION is visible");
            } else {
                System.out.println("ENTER ACCOUNT INFORMATION is not visible");
            }

            //9. Fill details: Title, Name, Email, Password, Date of birth
            WebElement fill = driver.findElement(By.id("id_gender2"));
            fill.click();
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("dskfiu9283");
            WebElement day = driver.findElement(By.id("days"));
            day.sendKeys("16");
            WebElement month = driver.findElement(By.id("months"));
            month.sendKeys("March");
            WebElement year = driver.findElement(By.id("years"));
            year.sendKeys("2009");

            //10. Select checkbox 'Sign up for our newsletter!'
            WebElement checkbox = driver.findElement(By.xpath("//input[@name='newsletter']"));
            checkbox.click();

            // 11. Select checkbox 'Receive special offers from our partners!'
            WebElement checkbox2 = driver.findElement(By.id("optin"));
            checkbox2.click();

            Thread.sleep(2000);
            //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
            WebElement firstName = driver.findElement(By.id("first_name"));
            firstName.sendKeys("Amy");

            WebElement lastName = driver.findElement(By.id("last_name"));
            lastName.sendKeys("Bond");

            WebElement company = driver.findElement(By.id("company"));
            company.sendKeys("Google");

            WebElement address = driver.findElement(By.id("address2"));
            address.sendKeys("1330 North Erm Street");

            WebElement address2 = driver.findElement(By.cssSelector("input[id='address1']"));
            address2.sendKeys("1465 South Erm Street");


            WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
            country.sendKeys("United States");

            WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
            state.sendKeys("United States");

            WebElement city = driver.findElement(By.cssSelector("input[id='city']"));
            city.sendKeys("VA");

            WebElement zipcode = driver.findElement(By.cssSelector("input[id='zipcode']"));
            zipcode.sendKeys("22209");

            WebElement mobileNumber = driver.findElement(By.id("mobile_number"));
            mobileNumber.sendKeys("20294398420");


            //13. Click 'Create Account button'
            WebElement clickButton = driver.findElement(By.cssSelector("button[data-qa='create-account']"));
            clickButton.click();

            // 14. Verify that 'ACCOUNT CREATED!' is visible

            WebElement accountCreated = driver.findElement(By.cssSelector("h2"));

            if (accountCreated.getText().equals("Account Created!")) {
                System.out.println("ACCOUNT CREATED! is visible");
            } else {
                System.out.println("ACCOUNT CREATED! is not visible");

            }
            //15. Click 'Continue' button
            WebElement continueButton = driver.findElement(By.cssSelector("a[data-qa='continue-button']"));
            continueButton.click();

            //16. Verify that 'Logged in as username' is visible

            WebElement loggedInAs = driver.findElement(By.xpath("//div[@class='col-sm-8']"));

            System.out.println(loggedInAs.getText().equals("Logged in as Liliy2000") ? "Logged in as username is visible" : "Logged in as username is not visible");
            Thread.sleep(2000);
            // 17. Click 'Delete Account' button
            WebElement deleteAccount = driver.findElement(By.cssSelector("a[href='/delete_account']"));
            deleteAccount.click();


            //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
            WebElement deleteBottom = driver.findElement(By.cssSelector("button[data-target='#deleteModal']"));
            deleteBottom.click();

            driver.quit();
        }
    }
