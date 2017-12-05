package com.ssi.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sami on 10/18/17.
 */
public abstract class BasePage {

    public BasePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
}
