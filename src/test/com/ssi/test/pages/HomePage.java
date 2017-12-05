package com.ssi.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = ".//a[@class='link-block with-icon signin']")
    public WebElement signInClick;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid']//input[@id='username']")
    public WebElement txtUsername;

    @FindBy(how = How.XPATH, using = ".//div[@class='grid']//input[@id='password']")
    public WebElement txtPassword;


    @FindBy(how = How.XPATH, using = ".//div[@class='grid']//input[@name='sign_in']")
    public WebElement loginClick;

    @FindBy(how = How.XPATH, using = ".//*[@id='your-account']/a")
    public WebElement myPetFinderClick;


    public void login(String username, String password) {

        SignIn_Register_btn.click();
        txtUserName.sendKeys(username);
        txtPassWord.sendKeys(password);
        login_btn.click();

    }


}
