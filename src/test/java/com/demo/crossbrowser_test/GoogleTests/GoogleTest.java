package com.demo.crossbrowser_test.GoogleTests;

import com.demo.crossbrowser_test.Pages.GooglePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by harithah on 4/21/17.
 */
public class GoogleTest {

    WebDriver driver;
    GooglePage googlePage;

    @BeforeMethod
    @Parameters("browser_type")
    public void setUp(String browser_type) throws MalformedURLException {
        driver=WebDriverManager.startDriver(browser_type);
        WebDriverManager.startBrowser(driver);
        googlePage = new GooglePage(this.driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverManager.stopDriver(driver);
    }

    @Test
    public void testGoogleSearch() {
        googlePage.enterQuery();
    }
}

