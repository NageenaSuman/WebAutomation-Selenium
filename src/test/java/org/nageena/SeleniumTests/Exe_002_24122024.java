package org.nageena.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exe_002_24122024 {
    
    @Test
    public void test_seleniumbasics(){
        // Selenium 3
        // You need to setup the Driver(browser)
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.

        // Webdriver hierarchy

        // SearchContext(I) -> (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)


        // SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        // -> ChromeDriver(C)


        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

        // SearchContext driver = new ChromeDriver();
        // WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        // ChromeDriver  driver = new ChromeDriver();


        // Scenarios

        // 1. Do want to run on  Chrome or Edge?
        // ChromeDriver driver = new ChromeDriver(); ~1%


        // 2  Do you want to run on Firefox then change to Edge ?
        WebDriver driver = new FirefoxDriver();;
        driver = new EdgeDriver();
        driver.get("https://google.com");

        // 3. do you want to run on multiple browsers, aws machine, ? 2%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)



    }



}
