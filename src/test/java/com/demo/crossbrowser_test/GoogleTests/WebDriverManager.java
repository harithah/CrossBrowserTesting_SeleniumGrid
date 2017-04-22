package com.demo.crossbrowser_test.GoogleTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {
    public static Wait<WebDriver> wait;
    public static String url;

    public static WebDriver startDriver(String type) throws MalformedURLException {
        WebDriver d;
        if (type.equals("chrome")) {
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
            d = new RemoteWebDriver(new URL("http://localhost:5556/wb/hub"),desiredCapabilities);
        } else if (type.equals("firefox")) {
            DesiredCapabilities desiredCapabilitiesff = DesiredCapabilities.firefox();
            d = new RemoteWebDriver(new URL("http://localhost:5555/wb/hub"),desiredCapabilitiesff   );
        } else {
            throw new IllegalArgumentException("Browser type not supported: " + type);
        }
        return d;
    }

    public static void startBrowser(WebDriver driver) {
        driver.get(getUrl());
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 200);
    }

    public static java.lang.String getUrl() {
        return "http://www.google.com";
    }

    public static void stopDriver(WebDriver driver) {
        driver.close();
    }

}