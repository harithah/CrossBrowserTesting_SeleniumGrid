package com.demo.crossbrowser_test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by harithah on 4/21/17.
 */
public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterQuery() {
        driver.findElement(By.name("q")).sendKeys("cucumber");
    }

}
