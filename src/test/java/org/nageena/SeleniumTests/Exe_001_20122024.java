package org.nageena.SeleniumTests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exe_001_20122024 {

    @Test
    public void test_sel01(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());

    }
}
