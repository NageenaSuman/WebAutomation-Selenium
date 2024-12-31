package org.nageena.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Exe_005_24122024 {

    @Test
    public void test_quit() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        driver.get("https://bing.com");

        Thread.sleep(50000); //use exception sign in method

        driver.close();

        Thread.sleep(2000);
        driver.quit();





    }
}
