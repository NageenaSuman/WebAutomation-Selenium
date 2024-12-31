package org.nageena.SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exe_004_24122024 {

    @Test

    public void test_01(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

    }
    @Test
    public void test_02() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());

        if(driver.getPageSource().contains("CURA Healthcare Service")){

            System.out.println("Its visible");
            Assert.assertTrue(true);
        }
        else {

            throw new Exception("Its not visible");
        }
    }
}
