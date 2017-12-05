package com.ssi.test.Selenium_Tests;


import com.ssi.framework.base.BasePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BasePage {

    public LoginTest(WebDriver driver) {
        super(driver);
    }

    private WebDriver driver = null;

    @Before
    public void initialize() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/KKUdemyFrameWork2/src/com/ssi/framework/Drivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("http://google.com");

        Thread.sleep(3000);


    }

    @Test
    public void test() {
/*
        HomePage homepage = new HomePage(driver);

        homepage.login("samisabir212@gmail.com", "Apples212");*/

        driver.findElement(By.id("lst-ib")).sendKeys("crypto kitties");

    }

    @After
    public void tearDown() {

        driver.close();

    }
}
